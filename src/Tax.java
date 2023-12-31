public class Tax extends Field  {



    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }

    @Override
    public String onLand(Player p){
        String s = super.onLand(p);
        s += "\n Vil du betale fast beløb på " +this.cost+ " Tast J fpr at ja \n (ellers trækker vi et beløb der svarer til 10 % af dine aktiver";
        return s;
    }
@Override
    public String onAccept(Player p){
        p.pay(cost);
        String s = "Det er sket";
        return s;
    }
@Override
    public String onReject(Player p){
        int s = (int) (p.getBalance() * 0.1);
        p.pay(s);
        String msg = "10 procent af din saldo betalt";
        return msg;
    }



}
