public class Property extends Field{
    private int serieID;
    private String option;
    private Player owner;



    public Property( int ID, String label, int cost, int income, int serieID) {
        super( ID, label, cost, income);
        this.serieID = serieID;
    }
    @Override
    public String toString(){
        return super.toString() + serieID;
    }

    @Override
    public String onLand(Player p){
    String msg =  super.onLand(p);
    if(owner==null){
        option = "buy";
        msg = msg.concat("\n Vil du købe?(Y/N): ");
    } else {
        option = "payRent";
        msg=msg.concat("\n Du skal betale" + income + "Tasty Y for at acceptere");
    }
    return msg;
    }

    @Override
    protected String onAccept(Player p){
        if(option.equals("buy")){
            p.buyProperty(cost);

            owner = p;
        }else if(option.equals(("payRent"))){
            p.pay(income,owner);
        }
    return "";
    }

    @Override
    protected String onReject(Player p){
    return "";
    }
}
