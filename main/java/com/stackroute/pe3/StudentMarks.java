package com.stackroute.pe3;

import java.util.*;

public class StudentMarks {
    int studentNumber;
    Scanner scanner=new Scanner(System.in);
    public void setNumberOfStudents(int n)
    {
        this.studentNumber=n;
    }
    private  int[] studentGrades=new int[studentNumber];
    public void setGrades()
    {   int check=0;
        for(int i=0;i<=studentNumber;i++)
        {System.out.println("Grade of "+i+"Student");
            check=scanner.nextInt();
            while(checkInvalidity(check))
            {
                System.out.println("Invalid input");
                check=scanner.nextInt();
            }
            studentGrades[i]=check;
        }
    }
    boolean checkInvalidity(int n)
    {
        if(n<100&&n>0)
            return false;

        else
            return true;
    }
}