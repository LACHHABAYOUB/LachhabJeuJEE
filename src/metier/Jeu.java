package metier;


public class Jeu {
	private int secret ; //nombre secret
	private boolean etat; // etat (trouver ou nn)

		public Jeu(){
			etat=false; //n'a pas gagné
			secret=(int)(Math.random()*100+1);
		}
		public Jeu(boolean etat) {
			super();
			this.secret=(int)(Math.random()*1000+1);
			this.etat = etat;
		}
		public int getSecret() {
			return secret;
		}
		public void setSecret(int secret) {
			this.secret = secret;
		}
		public boolean isEtat() {
			return etat;
		}
		public void setEtat(boolean etat) {
			this.etat = etat;
		}
	public String Jouer(int nb) {
		if(etat==false){
			if(nb>secret){
				return "votre nombre est plus grand";
				
			}
			else if(nb<secret){
				return "votre nombre est plus petit";
			}
			else{
				etat=true;
				return "Bravo! vous avez gagné";
				
			}
		}
		else{		
			return("le nombre cacher est : "+secret);
		}
		

	}

}
