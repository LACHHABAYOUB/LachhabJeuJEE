package web;

public class JeuModel {
	private int secret;
	private String trouve;
	public int getSecret() {
		return secret;
	}
	public void setSecret(int secret) {
		this.secret = secret;
	}
	public String getTrouve() {
		return trouve;
	}
	public void setTrouve(String trouve) {
		this.trouve = trouve;
	}
	public JeuModel(int secret, String trouve) {
		super();
		this.secret = secret;
		this.trouve = trouve;
	}
	public JeuModel() {
		super();
		
	}
	
}
