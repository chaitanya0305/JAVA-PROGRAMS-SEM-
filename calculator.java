package com.company;
import java.util.*;
public class Main{

    public static void main(String[] args) {
	int n1,n2,cal, chO;
        System.out.println("ENTER 2 NUMBERS");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.println("SELECT OPERATION \n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS");
        chO =r.nextInt();
        if (chO ==1)
        {
            cal=n1+n2;
            System.out.println("ADDITION OF 2 NUMBER IS "+cal);
        }
        else if (chO ==2)
        { cal=n1-n2;
            System.out.println("SUBTRACTION OF 2 NUMBER IS "+cal);
        }
        else if (chO ==3)
        { cal=n1*n2;
            System.out.println("MULTIPLICATION OF 2 NUMBER IS "+cal);
        }
        else if (chO ==4)
        { cal=n1/n2;
            System.out.println("DIVISION OF 2 NUMBER IS "+cal);
        }
        else if (chO ==5)
        { cal=n1%n2;
            System.out.println("MODULUS OF 2 NUMBER IS "+cal);
        }

    }
}
