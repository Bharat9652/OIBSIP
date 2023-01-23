import java.util.*;
class online_exam
{
    Scanner sc=new Scanner(System.in);
    HashMap<String,Integer>info= new HashMap<String,Integer>();
    public void login()
    {
        info.put("Bharat", 101);
        info.put("Vamsi",102);
        info.put("Bala",103);
        info.put("Pavan",104);
        String id;
        int pwd;
        System.out.println("Enter your user name for login : ");
        id=sc.next();
        System.out.println("Enter your passsword : ");
        pwd=sc.nextInt();
        if(info.containsKey(id) && info.get(id)==pwd)
        {
            System.out.println("\n You have successfully logged in for the Exam");
            menu();
        }
        else
        {
                System.out.println("\nIncorrest User Name/ID Or Password!\nEnter With Correct Credentials!\n");
                login();
        }
    }
    public void menu()
    {
        int ch;
        System.out.println("\n Enter your choice : ");
        System.out.println(" 1.Update/Reset Profile \n 2.Start Exam \n 3.Logout");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                info=update();
                menu();
                break;
            case 2:
                startExam();
                menu();
                break;
            case 3:
                
            System.out.println("You have logged out successfully.");
                break;
            default:
                System.out.println("Invalid Choice !!");

        }
    }
    public HashMap<String,Integer>update()
    {
        String update_id;
        int update_pwd;
        System.out.println("Enter your username/Id : ");
        update_id=sc.next();
        System.out.println("Enter your password : ");
        update_pwd=sc.nextInt();
        if(info.containsKey(update_id)&& info.get(update_id)==update_pwd)
        {
            System.out.println("Enter New Password : ");
            update_pwd=sc.nextInt();
            info.replace(update_id,update_pwd);
            System.out.println("Password reset successfully !");
        }
        else
        {
            System.out.println("User data not found\n");

        }
        return info;
    }
    public void startExam()
    {
        long startTime= System.currentTimeMillis();
        long endTime=startTime + 30;
        int score = 0,ans;
        System.out.println("Instructions:(Attention)");
        System.out.println("\n 1.You will be asked total 5 questions");
        System.out.println("\n 2.All questions are mandatorily to be answered");
        System.out.println("\n 3.Each correct answer will earn you 5 marks");
        System.out.println("\n 4.Time limit to complete the exam is 5 minutes");
        System.out.println("\n All the Best !");
        while(System.currentTimeMillis()<endTime)
        {
            System.out.println("--------------------------");
            System.out.println("Q1. Who invented Java Programming?");
            System.out.println("\n 1.Guido van Rossum \t2.James Gosling \t3.Dennis Ritchie \t4.Bjarne Stroustrup");
            System.out.println("Answer : ");
            ans=sc.nextInt();
            if(ans==2)
                score+=5;
            else
                score--;
            
            System.out.println("--------------------------");
            System.out.println("Q2. Which component is used to compile, debug and execute the java programs?");
            System.out.println("\n 1.JRE \t2.JIT \t3.JDK\t4.JVM");
            System.out.println("Answer : ");
            ans=sc.nextInt();
            if(ans==3)
                score+=5;
            else
                score--;

            System.out.println("--------------------------");
            System.out.println("Q3. Which one of the following is not a Java feature?");
            System.out.println("\n 1.Object-oriented \t2.Use of pointers \t3.Portable\t4.Dynamic and Extensible");
            System.out.println("Answer : ");
            ans=sc.nextInt();
            if(ans==2)
                score+=5;
            else
                score--;

            System.out.println("--------------------------");
            System.out.println("Q4. Which of these cannot be used for a variable name in Java?");
            System.out.println("\n 1. identifier & keyword \t2.identifier \t3.keyword\t4.none of the mentioned");
            System.out.println("Answer : ");
            ans=sc.nextInt();
            if(ans==3)
                score+=5;
            else
                score--;

            System.out.println("--------------------------");
            System.out.println("Q5. What is the extension of java code files?");
            System.out.println("\n 1. .js  \t2. .txt \t3. .class\t4. .java");
            System.out.println("Answer : ");
            ans=sc.nextInt();
            if(ans==4)
                score+=5;
            else
                score--;
            System.out.println("--------------------------");
            break;
        }
        System.out.println("You have submitted the answers");
        System.out.println();
        System.out.println("You Score is : "+score);
        if(score>10)
            System.out.println("Congratulations !!");
        else
            System.out.println("Better luck Next Time");
    }
    public static void main(String args[])   
    {
        online_exam obj=new online_exam();
        obj.login();
    }
 {
    
 }
}