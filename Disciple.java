
public class Disciple {

	public static void main(String[] args) 
	{
		long count = 13;
		long total = 7700000000L;
		int yearCount = 0;
		
		do
		{
			if(yearCount % 18 == 0)
			{
				long temp;
				temp = (count * 2) + count;
				count = temp;
				yearCount++;
				if(yearCount % 30 == 0)
				{
					total = total + 1;
				}
				if(yearCount % 72 == 0)
				{
					total = total - 1;
				}
			}
			else
			{
				yearCount++;
			}
		}
		while(count < total);
		
		int totalYears = yearCount * 3;
		
		System.out.println("It would take " + totalYears + " years to train all the world as disciples!");
		
		System.out.println();
		
		Long disciple = total/13;
		Long perYear = (long)(Math.pow(disciple, 0.06));
		
		System.out.println("Each disciple would have to train " + perYear + " disciples every 3 years to train the whole world in 50 years.");
		
	}
	
}
