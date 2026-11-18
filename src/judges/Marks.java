package judges;



public class Marks{
	private int[][] notes;
	private int maxNote;
	
	public Marks(int nbJuges,int nbCriteres, int maxNote){
		this.notes= new int[nbJuges][nbCriteres];
		this.maxNote=maxNote;
		}
	
	public void setMark(int juge , int critere , int note){
		notes[juge][critere]=note;
		}
		
	public int getMark(int juge ,int critere){
		return notes[juge][critere];
		}
		
	public float average(int critere){
		int min=notes[0][critere];
		int max=notes[0][critere];
		int somme=0;
		for(int i=0;i< notes.length;i++){
			int note=notes[i][critere];
			somme=somme+note;
			
			if(note<min){
				min=note;
				}
			if(note>max){
				max= note;
				}
			
			}
		somme=somme-min-max;
		return (float) somme/(notes.length-2);
		}
	
	public float globalAverage(){
		float somme=		
	}
	}
