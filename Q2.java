// public class Q2 {
//     public static void main(String[] args) {
//         Question q = new Question();
//         Question.firstInheritClass fic = q.new firstInheritClass();
//         fic.show();
//         Question.toSecondInheritClass tsic = q.new toSecondInheritClass();
//         tsic.show();
//         Question.toThirdInheritClass ttic = q.new toThirdInheritClass();
//         ttic.show();
//     }
// }
import Fold.First;
public class Q2{
    public static void main(String[] args) {
        First f = new First();
        f.sum(5, 10);
    }
}