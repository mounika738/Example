package com.css.example;

public class Main {
	public static void main(String[] args) {
		 Trainee[] trainees=new Trainee[2];
		 trainees[0]=new Trainee(123,"Mounika","9123456767","mounika@gmail.com","Female",20);
		 trainees[1]=new Trainee(124,"Mani","9812334555","mani@gmail.com","male",18);
		 Batch b=new Batch("1A1","2020-10-19","2020-11-11",trainees);
		 Batch b1=new Batch("1A2","2020-10-19","2020-11-11",trainees);
		 b.setTrainees(trainees);
		 b1.setTrainees(trainees);
		 
		 for(Trainee a: b.getTrainees())
			{
				System.out.println(a);
			}
		 System.out.println(b);
		 Trainee getTrainee=b.getTrainees("male");
			if(getTrainee !=null) {
				System.out.println("The details are : " + getTrainee);
			}
			//else {
				//System.out.println("The male details are : " + getTrainee);
			//}
	}
}
