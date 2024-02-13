
public class enum_1 {

    enum result
    {
        Pass,Fail,Nr;
        int marks;

        void SetMarks(int marks)
        {
        this.marks=marks;
        }

        int getMarks()
        {
            return marks;
        }
        result()
        {
        System.out.println("Constructor in enum");
        }
    }
    public static void main(String[] args) {
        enum_1.result.Pass.SetMarks(50);
    }
}
