package com.stackroute.pe3;

import java.util.*;
/*prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/

public class StudentMarks {
    int studentNumber;
    Scanner scanner=new Scanner(System.in);
    public void setNumberOfStudents(int n)
    {

        this.studentNumber=n;
    }
    private  int[] studentGrades=new int[studentNumber];
    public void setGrades()
    {
        int check=0;
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
    boolean checkInvalidity(int n)  //Check if the input is within range
    {
        if(n<100&&n>0)
            return false;

        else
            return true;
    }
}