// prime number program

import java.util.Scanner;
public class prime {
public static void prime(int a){
    int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println("prime num");
        }
        else{
            System.out.println("not prime");
        }    
        
    

}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number :");
        int a=sc.nextInt();
        prime(a);
        sc.close();

    }   
}


//  fibinocci series program

import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice");
        int a=sc.nextInt();
        int b=0,c=1;
        System.out.print(+b+" "+c);
        for (int i=2;i<a;i++){
            int d=b+c;
            b=c;
            c=d;
            System.out.print(" "+d);


        }
    }
}

// reverse string 

import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        char ram[]=w.toCharArray();
        for(int i=0;i<ram.length/2;i++){
            char temp=ram[i];
            ram[i]=ram[ram.length-1-i];
            ram[ram.length-1-i]=temp;


        }
        String rev=new String(ram);
        System.out.println(""+rev);
    }  
}

// reverse digit program

import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int rev=0;
        while(s!=0){
            int ev=s%10;
            rev=rev*10+ev;
            s=s/10;
            // rev=s/10;
        }

        
    
        System.out.println(""+rev);
    }
}



//  the given string is the polindrome or not.

import java .util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            
            String rev="";
            for(int i=s.length()-1;i>=0;i--){
                rev=rev+s.charAt(i);
            }
            System.out.println(""+rev);
            if(s.equals(rev)){
                System.out.println("poli");
            }
            else{
                System.out.println("not poli");
            }
        
    }
    
}


// arm strong number


import java.util.Scanner;
public class prime{
    public static void arm(int a){
        int original=a;
        int count=0;
        while(a!=0){
            int cut=a%10;
            count=count+cut*cut*cut;
            a=a/10;


        }
        if(count==original){
            System.out.println("arm strong num");
        }
        else{
            System.out.println("not arm strong num");
        }

    
}    
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int a=sc.nextInt();
    arm(a);
}
}
// counts the vowels in sentence

import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        for (int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count+=1;

                System.out.println(""+c);
            }

        }
        System.out.println(""+count);
       }
}

// find largest number in array


import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}    


// find second largest array


import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        int max2=0;
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max=arr[i];

            }
        }
        System.out.println(""+max2);

        
    }
} 

// print the occuerence of the string

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String chaitu=sc.nextLine();
        char cha=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<chaitu.length();i++){
            if(chaitu.charAt(i)==cha){
                count++;
            }

            
        }
        System.out.println(cha+" "+count);

    }
}


// find the neon number

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int pro=num*num; 
        System.out.println("product:"+pro);
        int add=0;
        while(pro!=0){
            int cut=pro%10;
            add=add+cut;
            pro/=10;
        }
        
        if(add==num){
            System.out.println(add+" equal "+num+"is the "+"neon num");

        }
        else{
            System.out.println("not neon");
        }

        
    }
}
// sum  even numbers in array 

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int sum=0;
          for(int i=0;i<n;i++){      
            if(arr[i]%2==0){
                sum=sum+arr[i];

            }
        }
        System.out.println(sum);

    }
}



// assending on array elements program


import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
               if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
            }
        }
        for(int i=0;i<num;i++){
            System.out.println(""+arr[i]);
        }
    }
}

//  print prime number s with replace num 5 to 0

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
        
           if(count==2){
            int ori=i;
            int res=0;
            int place=1;
            while(ori>0){
                int dig=ori%10;
                if(dig==5){
                    dig=0;
                }
                res+=dig*place;
                place*=10;
                ori/=10;

            }
            System.out.println(res+"");
            }
        }
    }
}