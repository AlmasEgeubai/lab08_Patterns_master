package patterns.mediator;


public class App {

    public static void main(String[] args) {

        Party party = new PartyImpl();
        var devian = new Devian();
        var lina = new Lina();
        var slark = new Slark();
        var bountyhunter = new Bountyhunter();

        party.addMember(devian);
        party.addMember(lina);
        party.addMember(slark);
        party.addMember(bountyhunter);

    
        devian.act(Action.DK);
        lina.act(Action.Slave);
        slark.act(Action.Pounce);
        bountyhunter.act(Action.HUNT);

    }
}
