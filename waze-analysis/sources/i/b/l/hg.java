package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum hg implements com.google.v.eg {
    MAP_ISSUE_UNSPECIFIED(0),
    MAP_ISSUE_GENERAL_MAP_PROBLEM(1),
    MAP_ISSUE_INCORRECT_TURN(2),
    MAP_ISSUE_INCORRECT_ADDRESS(3),
    MAP_ISSUE_INCORRECT_ROUTE(4),
    MAP_ISSUE_MISSING_ROUNDABOUT(5),
    MAP_ISSUE_MISSING_ROAD(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f48757i;

    hg(int i2) {
        this.f48757i = i2;
    }

    public static hg a(int i2) {
        switch (i2) {
            case 0:
                return MAP_ISSUE_UNSPECIFIED;
            case 1:
                return MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 2:
                return MAP_ISSUE_INCORRECT_TURN;
            case 3:
                return MAP_ISSUE_INCORRECT_ADDRESS;
            case 4:
                return MAP_ISSUE_INCORRECT_ROUTE;
            case 5:
                return MAP_ISSUE_MISSING_ROUNDABOUT;
            case 6:
                return MAP_ISSUE_MISSING_ROAD;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48757i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48757i);
    }
}
