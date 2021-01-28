package Goldielocks;

import java.util.ArrayList;
import java.util.List;

public class Table {

	public void BestChairs(int weight, int heat)
	{
		List<Chair> Chairlist = new ArrayList<Chair>();
		
		
		Chair chair = new Chair(30, 50);
		Chair chair2 = new Chair(50, 120);
		Chair chair3 = new Chair(200, 200);
		Chair chair4 = new Chair(130, 140);
		Chair chair5 = new Chair(200, 50);
		Chair chair6 = new Chair(150, 220);
		Chair chair7 = new Chair(300, 500);
		
		Chairlist.add(chair);
		Chairlist.add(chair2);
		Chairlist.add(chair3);
		Chairlist.add(chair4);
		Chairlist.add(chair5);
		Chairlist.add(chair6);
		Chairlist.add(chair7);
	
		int total = 0;
		for(int i = 0; i < Chairlist.size(); i++ )
		{
			if(Chairlist.get(i).wei < weight && Chairlist.get(i).temp < heat)
			{
				total ++;
			}
			
		}
		
		 System.out.println(total);
	}
}
