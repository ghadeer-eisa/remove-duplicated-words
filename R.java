/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r;


import java.util.*; 

class R
{ 
	 
	

	// Driver code 
	public static void main(String[] args) 
	{ Scanner input = new Scanner(System.in);
        System.out.println("enter your massage : ");
        String S=input.nextLine();
        RemoveW(S);
		// a(1);
	}
 
	// static void a(Int id)
	static void RemoveW(String s)
	{
		
		String[] words = s.split("\\s");
 
		
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equalsIgnoreCase((words[j])))
				{
					if (i != j)
						words[i] = "";
 
				}
			}
		}
 
		// show the output
 
		System.out.println("Removing Duplicate words : ");
		for (int i = 0; i < words.length; i++)
		{
 
			if (words[i] != "")
			{
				System.out.print(words[i]+" ");
 
			}
		}
                System.out.println();
	}
}