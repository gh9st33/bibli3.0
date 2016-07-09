//use of constructor 

//version-12/12/15
//author-Pranav
package constructor;

public class CarV51 {
private  String type1;
private double milesStart1;
private double milesEnd1;
private double gallons1;
private  double gallonprice1;
	CarV51(String carType1,double endmiles1,double startmiles1,double gallonsused1,double pricepergallon1)
	{
		  type1=carType1;
		  milesStart1=startmiles1;
		  milesEnd1=endmiles1;
		  gallons1=gallonsused1;
		  gallonprice1=pricepergallon1;
	}
	public double getMilesStart1()
	{
		return milesStart1;
	}
	public String getType1()
	{
		return type1;
	}
	public double getMilesEnd1()
	{
		return milesEnd1;
	}
	public double getGallons1()
	{
		return gallons1;
	}
	public double getGallonPrice1()
	{
		return gallonprice1;
	}
         public  double calcDistance()
         {
        	 double dist=milesEnd1 - milesStart1;
			return dist;
         }
         public double calcGPM( )
         {
        	double gpm= gallons1 /calcDistance();
        	 return gpm;
         }
         public double totalCost()
         {
        	 double cost=gallons1*gallonprice1;
        	 return cost;
         }
         public double calcMPG()
         {
        	 double mpg=calcDistance()/gallons1;
        	 return mpg;
         }
        public static void main(String[] args) {
        	
        	
        	CarV51 car2=new CarV51("BMW",1500,1230,12,1.72);
        	
        	System.out.printf("%13s%15s%15s%15s%15s%15s%15s%15s%15s\n", "Type of Car" , "Start Miles" , "End Miles" , "Distance" , "Gallons" ,"Price","Cost ","Miles/Gal","Gal/Mile");
            System.out.println("====================================================================================================================================================");
            System.out.printf("%13s%11.2f%16.2f%15.2f%15.2f%15.2f%15.2f%15.2f%15.2f", car2.getType1() , car2.getMilesStart1(), car2.getMilesEnd1() , car2.calcDistance(),car2.getGallons1(),car2.getGallonPrice1(),car2.totalCost(),car2.calcMPG() , car2.calcGPM() );

		}


}