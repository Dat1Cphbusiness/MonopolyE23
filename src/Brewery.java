public class Brewery extends Business{

    public Brewery( int ID, String label,int cost, int income, int serieID) {
        super(ID, label, cost, income, serieID);
    }

    @Override
    public String onLand(Player p){
        return super.onLand(p);
    }

    @Override
    protected String onAccept(Player p){
        return "";
    }

    @Override
    protected String onReject(Player p){
        return "";
    }
}

