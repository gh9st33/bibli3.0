import java.util.ArrayList;
/**
 * purpose- inserting and editing the standing
 * Created by pi on 3/30/16.
 */
public class TestCandidate6 {
	public static void main(String args[])
	{
		TestCandidate6 tc= new TestCandidate6();
		ArrayList<Candidate2> election = new ArrayList<>();
		election.add(new Candidate2("John Smith",5000));
		election.add(new Candidate2("Mary Miller",4000));
		election.add(new Candidate2("Michael Duffy",6000));
		election.add(new Candidate2("Tim Robinson",2500));
		election.add(new Candidate2("Joe Ashtony",1800));
		election.add(new Candidate2("Mickey Jones",3000));
		election.add(new Candidate2("Rebecca Morgan",2000));
		election.add(new Candidate2("Kathleen Turner",8000));
		election.add(new Candidate2("Tory Parker", 500));
		election.add(new Candidate2("Ashton Davis",10000));
		System.out.println("Original Results");
		System.out.println();
		tc.printResults(election);
		System.out.println();
		election=tc.insertPosition(election,"Woody Pride",19300,5);
		System.out.println("Added Woody Pride ,19300 votes");
		System.out.println();
		tc.printResults(election);
		System.out.println();
		election=tc.insertCandidate(election,"Kathleen Turner","Joy Anderson",100);
		System.out.println("Added Joy Anderson,1100 votes");
		System.out.println();
		tc.printResults(election);

	}
	public ArrayList<Candidate2> insertPosition(ArrayList<Candidate2>election, String name, int votes, int position)
	{
		int length = election.size();
		ArrayList<Candidate2> startList =new ArrayList<Candidate2>();
		ArrayList<Candidate2> endList = new ArrayList<Candidate2>();
		for(int i=0;i<position;i++)
		{
			startList.add(election.get(i));
		}
		for(int i=position;i<length;i++)
		{
			endList.add(election.get(i));
		}
		Candidate2 Candidate2 = new Candidate2(name,votes);
		startList.add(Candidate2);
		startList.addAll(endList);
		return startList;
	}
	public ArrayList<Candidate2> insertCandidate(ArrayList<Candidate2> election,String name1,String name2,int votes)
	{
		int length = election.size();
		ArrayList<Candidate2> startList =new ArrayList<Candidate2>();
		ArrayList<Candidate2> endList = new ArrayList<Candidate2>();
		int position = -1;
		for(int i =0; i<election.size();i++)
		{
			if (election.get(i).getName() == name1)
			{
				position = i;
				break;
			}
		}
		if(position == -1)
		{
			System.out.println("Cannot find the given candidate");
			System.exit(1);
		}
		for(int i=0;i<position;i++)
		{
			startList.add(election.get(i));
		}
		//code for position
		for(int i=position;i<length;i++)
		{
			endList.add(election.get(i));
		}
		Candidate2 Candidate2 = new Candidate2(name2,votes);
		startList.add(Candidate2);
		startList.addAll(endList);
		return startList;
	}
	public void replaceName(ArrayList<Candidate2> election, String name1, String name2)
	{
		for(int i=0;i < election.size();i++)
		{
			if(election.get(i).getName() == name1)
			{
				election.get(i).setName(name2);
			}
		}
	}
	public void replaceVotes(ArrayList<Candidate2> election, String name, int votes)
	{
		for(int i=0; i < election.size();i++)
		{
			if(election.get(i).getName() == name)
			{
				election.get(i).setNumVotes(votes);
			}
		}
	}
	public void replaceCandidate(ArrayList<Candidate2> election, String name, String repName, int repVotes)
	{
		for(int i=0; i < election.size(); i++)
		{
			if(election.get(i).getName() == name)
			{
				election.get(i).setName(repName);
				election.get(i).setNumVotes(repVotes);
			}
		}
	}
	public  void printVotes(ArrayList<Candidate2> election)
	{
		for(int i=0;i<election.size();i++)
		{
			Candidate2 c = election.get(i);
			System.out.println(c.getName()+"received "+c.getNumVotes()+" votes");
		}
	}
	public  int getTotal(ArrayList<Candidate2> election)
	{
		int totalCount =0;
		for(int i =0;i < election.size();i++)
		{
			totalCount += election.get(i).getNumVotes();
		}
		return totalCount;
	}
	public  void printResults(ArrayList<Candidate2> election)
	{
		int totalVotes = getTotal(election);
		System.out.println("Candidates \t\t Votes received \t\t Percentage of total votes");
		for(int i=0;i< election.size();i++)
		{
			Candidate2 c = election.get(i);
			System.out.println(c.getName()+" \t\t"+ c.getNumVotes()+ "\t\t"+ Math.round(c.getNumVotes()/(double)totalVotes*100)+"%");

		}
		System.out.println("Total number of votes in election is" + totalVotes);

	}
}
