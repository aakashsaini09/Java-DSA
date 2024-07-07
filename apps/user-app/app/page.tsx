import Image from "next/image";
import { Button } from "@repo/ui/button";
import { prismaClient } from "@repo/db/prisma";
const client = new prismaClient()

export default function Home() {
  return (
    <div className='font-extrabold text-xl'>
      this is working
      <Button appName="newOne">Click me</Button>
    </div>
  );
}
