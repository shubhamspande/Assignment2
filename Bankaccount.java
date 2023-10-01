package com.cdac.main;

public class Bankaccount {
	
	int accno;
	double balance;
	String accholder;
	
	public String Getaccholder()
	{
		return accholder;
	}
	public void Setname(String accholder)
	{
		this.accholder=accholder;
	}
	public int Getaccno()
	{
		return accno;
	}
	public void Setaccno(int accno) 
	{
	this.accno=accno;	
	}
    public double Getbalance()
    {
    	return balance;
    }
    public void Setbalance(double balance)
    {
    	this.balance=balance;
    }
    void Addmoney(double amount)
    {
    	this.balance=balance+amount;
    }
    void Withdrawmoney(double amount)
    {
    	this.balance=balance-amount;
    }
    
    void accDetails()
    {
    System.out.println("name: "+accholder+"\naccno: "+accno+ "\nbalance: "+balance);
    }
	public static void main(String[] args) {
		
          Bankaccount b1=new Bankaccount ();
          b1.Setaccno(13242022);
          b1.Setname("Shubham");
          b1.Setbalance(13000);
          b1.accDetails();

          b1.Addmoney(3000);
          b1.accDetails();
          b1.Withdrawmoney(6000);
          b1.accDetails();
          
}
}
	


