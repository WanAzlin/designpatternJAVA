package abstractfactory.pattern.demo;
interface ITreasureMovie
{
	String MovieName();
}

interface IBiologyMovie
{
	String MovieName();
}

interface IMovieFactory
{
	ITreasureMovie GetTreasureMovie();
	IBiologyMovie GetBiologyMovie();
}

//Treasure Movie collections
class TreasureActionMovie implements ITreasureMovie
{
	@Override
	public String MovieName() 
	{ 
		return "TombRaider is a Treasure Action Movie";  
	}
}

class TreasureComedyMovie implements ITreasureMovie
{
	@Override
	public String MovieName() 
	{ 
		return "IndianaJone is Treasure Comedy Movie";
	} 
}

// Biology Movie collections
class BiologyActionMovie implements IBiologyMovie
{
	@Override 
	public String MovieName() 
	{
		return "JurassicWorld is a Biology Action Movie";
	}
}

class BiologyComedyMovie implements IBiologyMovie
{
	@Override 
	public String MovieName() 
	{
		return "GalaxyGuardian is a Biology Comedy Movie";  
	}
}

//Action Movie Factory
class ActionMovieFactory implements IMovieFactory
{
	public ITreasureMovie GetTreasureMovie()
	{
		return new TreasureActionMovie();
	}

	public IBiologyMovie GetBiologyMovie()
	{
		return new BiologyActionMovie();
	}
}
//Comedy Movie Factory
class ComedyMovieFactory implements IMovieFactory
{
	public ITreasureMovie GetTreasureMovie()
	{
		return new TreasureComedyMovie();
	}

	public IBiologyMovie GetBiologyMovie()
	{
		return new BiologyComedyMovie();
	}
}

class AbstractFactoryPatternEx 
{
	public static void main(String[] args)
	{
		System.out.println("**Abstract Factory Pattern Demo**");
		ActionMovieFactory actionMovies = new ActionMovieFactory();
		ITreasureMovie tAction = actionMovies.GetTreasureMovie();
		IBiologyMovie bAction = actionMovies.GetBiologyMovie();

		System.out.println("\nAction movies  are:");             
		System.out.println(tAction.MovieName());
		System.out.println(bAction.MovieName());

		ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
		ITreasureMovie tComedy = comedyMovies.GetTreasureMovie();
		IBiologyMovie bComedy = comedyMovies.GetBiologyMovie();

		System.out.println("\nComedy movies  are:");
		System.out.println(tComedy.MovieName());
		System.out.println(bComedy.MovieName());        
	}
}