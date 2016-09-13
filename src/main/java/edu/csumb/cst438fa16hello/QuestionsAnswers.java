/*Filename: QuestionsAnswers.java
 *Name: Jose Cortez
 *Date: September 6, 2016
 *Class: CST 438
 *Description: Creates a HashMap that stores questions with answers as their key.  
 */

import java.util.*;
public class QuestionsAnswers {
	static HashMap <Integer, String> questions = new HashMap<>(10000);
	
	public static void main(String[] args) {
		QuestionsAnswers.put("What is my name", "Jozy");
		QuestionsAnswers.put("What is a dog?", "animal");
		QuestionsAnswers.put("Who is the best GOT character?", "Arya");
		System.out.println(QuestionsAnswers.getRandomQuestion());
	}
	
	public QuestionsAnswers()
	{
		
	}
	
	public static void put(String question, String answer) //adds a question to the hashmap, the answer will become the key
	{
		if(answer == "")
			return;
		else
		{
			questions.put(answer.hashCode(), question);
			
		}
		
	}
	
	public static boolean testAnswers(String question, String answer) //checks if the given answer lines up with the question
	{
		if(questions.get(answer.hashCode()).equals(question))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static String getRandomQuestion()	//generates a random question
	{
		Random random = new Random();
		Object[] random_questions = questions.values().toArray();
		return (String)random_questions[random.nextInt(random_questions.length)];
		
	}
	
	
	
}
