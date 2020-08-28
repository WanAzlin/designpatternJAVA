//package prototype.car;

public class Ford extends BasicCar 
{
    public Ford(String m)
    {
        modelname = m;
    }   
	@Override	
	public BasicCar clone() throws CloneNotSupportedException 
	{
		 return (Ford)super.clone();
		 //return this.clone();
	}
}
