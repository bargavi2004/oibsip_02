import java.util.Scanner;
public class Ngg {
    public static void main(String[] args) throws InterruptedException{
        int score=0;
        try(Scanner obj=new Scanner(System.in)){
            System.out.println("\n");
            System.out.println("Welcome to NGG:");
            System.out.println("\n");
            System.out.println("Enter anything except number exit");
            for(int i=0;i<3;i++){
                int attempts=(i+1)*5;
                System.out.println("\nLevel"+(i+1)+":");
                int l=(int)Math.pow(10,i);
                int h=(int)Math.pow(10,i+1);
                int number=(int)(Math.random()*(h-l+1));
                //int g=Math.max(1/10,1);
                while(number<l){
                    number=number*10+(int)(Math.random()*10);
                }
                System.out.println("Guess the Number between "+l+" and "+h);
                int guess=obj.nextInt();
                while(attempts>0){
                    if(guess==number){
                        break;
                    }
                    else if(attempts!=1){
                        if(guess<number){
                            System.out.println("Try again!The number is greater");
                        }
                        else{
                            System.out.println("The number is lesser");
                        }
                        guess=obj.nextInt();
                    }
                    attempts--;
                }
                score+=attempts*10;
                if(i!=2)
                System.out.println("Congrats!! Your Score is "+score);
                else
                System.out.println("Congrats!! Your Final score is "+score);
                if(attempts==0 || i==3){
                    break;
                }
                else{
                if(i!=2){
                    System.out.println("\nEntering into nextLevel");
                    for(int t=0;t<2;t++){
                        System.out.print(".");
                        Thread.sleep(1000);
                    }
                    System.out.println();
                }
            }
            }
        }
        catch(Exception e){
            System.out.println("You exited the game and your score is "+score);
        }
    }
}
