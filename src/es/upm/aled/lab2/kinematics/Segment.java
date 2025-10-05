package es.upm.aled.lab2.kinematics;

// TODO: Implemente la clase
public class Segment {
  
	//ATRIBUTOS
		private double length; 
		private double angle; 
		private List<Segment> children;
		 
	//Constructor
		public Segment (double length, double angle){
			this.length = length;
			this.angle = angle;	
		}
		
	//Getters y setters	
	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getLength() {
		return length;
	}

	public List<Segment> getChildren() {
		return children;
	}

	public void addChild (Segment child) {
	  if(!children.contains(child))
		  children.add(child);
		
	}

}
