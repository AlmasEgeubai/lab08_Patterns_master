package patterns.mediator;

public enum Action {
    HUNT("выследил добычу", "кинул трек"),
    Slave("выпустила огонь", "подожег(жгла) костер"),
    Pounce("Прыгнул вперед", "убил(а) врага"),
    DK("Ударил щитом", "Привратился(ась) в дракона"),
    NONE("", "");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}
