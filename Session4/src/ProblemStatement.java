
public class ProblemStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] demRegionVotes = {126,32,230,21,200};
		int[] repRegionVotes = {152,85,121,215,13};
		
	int demVotes=0;
	int repVotes=0;
	
	for(int i=0;i<demRegionVotes.length;i++)
	{
		demVotes+=demRegionVotes[i];
		repVotes+=repRegionVotes[i];
	}
	
	if(demVotes > repVotes)
	{
		System.out.println(">> Democratic Party Won by "+(demVotes-repVotes)+" votes");
	}else {
		System.out.println(">> Republican Party Won by "+(repVotes-demVotes)+" votes");
	}
		

	}

}
