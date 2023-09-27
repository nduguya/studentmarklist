package studentmarklist;

import java.util.Scanner;

public class Studentmarklist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int roll1=101, roll2=102, roll3=103, roll4=104;
		String name1, name2, name3, name4;
		int mark11,mark21,mark31,mark12,mark22,mark32,mark13,mark23,mark33,mark14,mark24,mark34;
		int total1,total2,total3,total4;
		
		System.out.print("Enter name for Student 1: ");
		name1 = input.nextLine();
		System.out.print("Enter name for Student 2: ");
		name2 = input.nextLine();
		System.out.print("Enter name for Student 3: ");
		name3 = input.nextLine();
		System.out.print("Enter name for Student 4: ");
		name4 = input.nextLine();
		
		System.out.print("Enter mark 1 for "+ name1+ ": ");
		mark11 = input.nextInt();
		System.out.print("Enter mark 2 for "+ name1+ ": ");
		mark21 = input.nextInt();
		System.out.print("Enter mark 3 for "+ name1+ ": ");
		mark31 = input.nextInt();
		System.out.print("Enter mark 1 for "+ name2+ ": ");
		mark12 = input.nextInt();
		System.out.print("Enter mark 2 for "+ name2+ ": ");
		mark22 = input.nextInt();
		System.out.print("Enter mark 3 for "+ name2+ ": ");
		mark32 = input.nextInt();	
		System.out.print("Enter mark 1 for "+ name3+ ": ");
		mark13 = input.nextInt();
		System.out.print("Enter mark 2 for "+ name3+ ": ");
		mark23 = input.nextInt();
		System.out.print("Enter mark 3 for "+ name3+ ": ");
		mark33 = input.nextInt();
		System.out.print("Enter mark 1 for "+ name4+ ": ");
		mark14 = input.nextInt();
		System.out.print("Enter mark 2 for "+ name4+ ": ");
		mark24 = input.nextInt();
		System.out.print("Enter mark 3 for "+ name4+ ": ");
		mark34 = input.nextInt();
		
		total1=mark11+mark21+mark31;
		total2=mark12+mark22+mark32;
		total3=mark13+mark23+mark33;
		total4=mark14+mark24+mark34;
		
		double avg1=  total1/3;
		double avg2=  total2/3;
		double avg3=  total3/3;
		double avg4=  total4/3;
		
		char result1,result2,result3,result4;
		if(avg1>=40) {
			result1 = 'P';
		}else {
			result1 = 'F';
		}
		if(avg2>=40) {
			result2 = 'P';
		}else {
			result2 = 'F';
		}
		if(avg3>=40) {
			result3 = 'P';
		}else {
			result3 = 'F';
		}
		if(avg4>=40) {
			result4 = 'P';
		}else {
			result4 = 'F';
		}
		
		String grade1,grade2,grade3,grade4;
		if((avg1<=100)&&(avg1>=80)) {
			grade1="A";
		}else if((avg1<80)&&(avg1>=75)){
			grade1="B+";
		}else if((avg1<75)&&(avg1>=65)) {
			grade1="B";
		}else if((avg1<65)&&(avg1>=55)) {
			grade1="C+";
		}else if((avg1<55)&&(avg1>=50)) {
			grade1="C";
		}else if((avg1<50)&&(avg1>=40)) {
			grade1="D";
		}
		else if (avg1<40) {
			grade1="F";
		}else {
			grade1="Null";
		}
		if((avg2<=100)&&(avg2>=80)) {
			grade2="A";
		}else if((avg2<80)&&(avg2>=75)){
			grade2="B+";
		}else if((avg2<75)&&(avg2>=65)) {
			grade2="B";
		}else if((avg2<65)&&(avg2>=55)) {
			grade2="C+";
		}else if((avg2<55)&&(avg2>=50)) {
			grade2="C";
		}else if((avg2<50)&&(avg2>=40)) {
			grade2="D";
		}
		else if (avg2<40) {
			grade2="F";
		}else {
			grade2="Null";
		}
		if((avg3<=100)&&(avg3>=80)) {
			grade3="A";
		}else if((avg3<80)&&(avg3>=75)){
			grade3="B+";
		}else if((avg3<75)&&(avg3>=65)) {
			grade3="B";
		}else if((avg3<65)&&(avg3>=55)) {
			grade3="C+";
		}else if((avg3<55)&&(avg3>=50)) {
			grade3="C";
		}else if((avg3<50)&&(avg3>=40)) {
			grade3="D";
		}
		else if (avg3<40) {
			grade3="F";
		}else {
			grade3="Null";
		}
		if((avg4<=100)&&(avg4>=80)) {
			grade4="A";
		}else if((avg4<80)&&(avg4>=75)){
			grade4="B+";
		}else if((avg4<75)&&(avg4>=65)) {
			grade4="B";
		}else if((avg4<65)&&(avg4>=55)) {
			grade4="C+";
		}else if((avg4<55)&&(avg4>=50)) {
			grade4="C";
		}else if((avg4<50)&&(avg4>=40)) {
			grade4="D";
		}
		else if (avg4<40) {
			grade4="F";
		}else {
			grade4="Null";
		}

		System.out.println("*********************************************************************************************");
		System.out.println("                                       STUDENT MARKLIST                                      ");
		System.out.println("*********************************************************************************************");
		System.out.println("ROLL     NAME     MARK1     MARK2     MARK3     TOTAL     RESULT     Average     GRADE");
		System.out.println(roll1+"      "+name1+"     "+mark11+"        "+mark21+"        "+mark31+"        "+total1+"        "+result1+"        "+avg1+"         "+grade1);
		System.out.println(roll2+"      "+name2+"     "+mark12+"        "+mark22+"        "+mark32+"        "+total2+"        "+result2+"        "+avg2+"         "+grade2);
		System.out.println(roll3+"      "+name3+"     "+mark13+"        "+mark23+"        "+mark33+"        "+total3+"        "+result3+"        "+avg3+"         "+grade3);
		System.out.println(roll4+"      "+name4+"      "+mark14+"        "+mark24+"        "+mark34+"        "+total4+"        "+result4+"        "+avg4+"         "+grade4);

	}

}
