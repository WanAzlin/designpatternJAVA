package factory.pattern.demo;
interface IAnimal
{
	void Speak();
}
class Duck implements IAnimal
{
	@Override
	public void Speak()
	{
		System.out.println("Duck says Pack-pack");
	}
}
class Tiger implements IAnimal
{
	@Override
	public void Speak()
	{
		System.out.println("Tiger says Halum-Halum");
	}
}
class Lion implements IAnimal
{
	@Override
	public void Speak()
	{
		System.out.println("Lion says Roar!!");
	}
}
abstract class IAnimalFactory
{
	public abstract IAnimal GetAnimalType(String type) throws Exception;
//if we cannot instantiate later we'll throw exception
}
class ConcreteFactory extends IAnimalFactory
{
	@Override
	public  IAnimal GetAnimalType(String type) throws Exception
	{
		switch (type)
		{
		case "Duck": 
			//duck= new Duck();
			//return duck;
			return new Duck();
		case "Tiger":
			
			return new Tiger();
		case "Lion":
			 
			return new Lion();
	default:
			throw new Exception( "Animal type : "+type+" cannot be instantiated");
		}
	}
}
class FactoryPatternEx
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("***Factory Pattern Demo***\n");
		IAnimalFactory animalFactory = new ConcreteFactory();
		IAnimal DuckType=animalFactory.GetAnimalType("Duck");
		DuckType.Speak();
		IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
		TigerType.Speak(); 
		IAnimal LionType = animalFactory.GetAnimalType("Lion");
		LionType.Speak(); 
	}
}
