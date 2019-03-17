/*
 * Is-A relationship: implements or extends keywords. one directional relationship (house is a building but not all building a house).
 * Has-A relationship: also known as composition.(car has an engine, dog has a tail). We use a new keywords to implement Has-A relationships
 
 * EX: A type of bike called Pulsar IS-A bike (suerclass). and it HAS-A Engine (pulsar extend Bike, it calls an Engine object)
 */
public interface Comparable {
	public void CompareTo();

}

