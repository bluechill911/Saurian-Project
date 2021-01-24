// Programmer: Brandon Evans
// Date: 2/4/20
// The Saurian class has the ability to translate English to Saurian
//  and Saurian to English

// Disclaimer:
// The given assignment description, project files, code files and/or solution files
// should not be made available in a public form via methods such as online hosting
// in code repositories, educational resource hosting websites, etc. These projects
// and related files can be hosted in private repositories for situations such as
// showing example work at job interviews, personal reference for future class
// projects, etc.


public class Saurian //Saurian just refers to the phrase.. in some parts of code
{
	// data
	private String engForm;
	private String sauForm;
	// constants used for translating
	// note M = M and m = m so M and m are not needed
	public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J','K','L','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z','B','C','D','E','F','G','H','J','K','I','L','N','P','O','Q','u','r','s','t','o','v','w','x','a','z','b','c','d','e','f','g','h','j','k','i','l','n','p','o','q'};
	public static final int ARRLENGTH = ENGLISHARR.length;	// should be the same length for ENGLISHARR and SAURIANARR

	// Constructor DEFAULT
	public Saurian()
	{
		engForm = ""; //don't think it matters
		sauForm = ""; //what I put in these
	}

	//Parameterized Constructor (or overloaded??)
	public Saurian (String input, boolean isEnglish)
	{
		if(isEnglish == true)
		{
			engForm = input;
			translateEngToSaur(engForm);
		 // translateEngToSaur
		}
		else
		{
			sauForm = input;
			translateSaurToEng(sauForm);
		//  translateSaurToEng
		}
	}


	//getter english
	public String getEnglish()
	{
		return engForm;
	}

	//getter saurian
	public String getSaurian()
	{
		return sauForm;
	}

	//setters english
	public void setEnglish(String newEngForm)
	{
		engForm = newEngForm;
		translateEngToSaur(engForm);
	//  translateEngToSaur
	}

	//setter saurian
	public void setSaurian(String newSauForm)
	{
		sauForm = newSauForm;
		translateSaurToEng(sauForm);
	//  translateSaurToEng
	}

	//Translate to English
			 //  translateSaurToEng(String saurianToEnglish)
	public void translateSaurToEng(String saurianToEnglish){
			engForm = "";			//what I'm adding to later
			for(int i = 0; i < saurianToEnglish.length(); i++){
				for(int j = 0; i < ARRLENGTH; j++){
					if(saurianToEnglish.charAt(i) == SAURIANARR[j]){
					//do something?
						engForm = engForm + ENGLISHARR[j];
						break;
					}
					else if (j == ARRLENGTH - 1 && saurianToEnglish.charAt(i) != SAURIANARR[j])
					// M m   ! ? etc.
					{
						engForm = engForm + saurianToEnglish.charAt(i);
						break;
					}

				}
			}
	}

	//Translate to Saurian
			  // translateEngToSaur(String englishToSaur)
	public void translateEngToSaur(String englishToSaur){
			sauForm = "";			//what I'm adding to later
			for(int i = 0; i < englishToSaur.length(); i++){
				for(int j = 0; i < ARRLENGTH; j++){
					if(englishToSaur.charAt(i) == ENGLISHARR[j]){
						//do something?
						sauForm = sauForm + SAURIANARR[j];
						break;
					}
					else if (j == ARRLENGTH - 1 && englishToSaur.charAt(i) != ENGLISHARR[j])
					{
						sauForm = sauForm + englishToSaur.charAt(i);
						break;
					}

				}
			}
	}
	public String toString()
		{
			return "English translation:\n" + engForm + "\nSaurian translation:\n" + sauForm;
	}
}

