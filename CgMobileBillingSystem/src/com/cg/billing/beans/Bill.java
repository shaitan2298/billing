package com.cg.billing.beans;

public class Bill 
{
    private int bill_id;
    private int amount;
    
    public Bill()
    {
    	
    }

	public Bill(int bill_id, int amount) {
		super();
		this.bill_id = bill_id;
		this.amount = amount;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + bill_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bill other = (Bill) obj;
		if (amount != other.amount)
			return false;
		if (bill_id != other.bill_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bill [bill_id=" + bill_id + ", amount=" + amount + "]";
	}
    
    
}
