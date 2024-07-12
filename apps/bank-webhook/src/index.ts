import express from 'express';
import db from '@repo/db/client'
const app = express();
app.post("/hdfcwebhook", async(req, res) => {
    const paymentInformation = {
        token: req.body.token,
        userId: req.body.userId,
        amonund: req.body.amount, 
    };
    await db.balance.update({
        where: {
            userId: paymentInformation.userId
        },
        data: {
            amount: {
                increment: paymentInformation.amonund
            }
        }
    })
    await db.onRampTransaction.update({
        where: {
            token: paymentInformation.token
        },
        data: {
            status: "Success"
        }
    })
    res.json({
        message: "captured"
    })
});