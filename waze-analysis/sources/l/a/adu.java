package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adu implements com.google.v.eg {
    CHANGE_REASON_UNSPECIFIED(0),
    ENTER_SEGMENT(1),
    EXIT_SEGMENT(2),
    INSIGHT_COMPONENT_TERMINATED(3),
    HIDDEN_BY_OTHER_UI_COMPONENT(4),
    AVAILABLE_CLICK_OPTION_CHANGED(5),
    TIMER_CHANGED(6),
    DISTANCE_CHANGED(7),
    NUMBER_OF_INSIGHTS_CHANGED(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f52305l;

    adu(int i2) {
        this.f52305l = i2;
    }

    public static adu a(int i2) {
        switch (i2) {
            case 0:
                return CHANGE_REASON_UNSPECIFIED;
            case 1:
                return ENTER_SEGMENT;
            case 2:
                return EXIT_SEGMENT;
            case 3:
                return INSIGHT_COMPONENT_TERMINATED;
            case 4:
                return HIDDEN_BY_OTHER_UI_COMPONENT;
            case 5:
                return AVAILABLE_CLICK_OPTION_CHANGED;
            case 6:
                return TIMER_CHANGED;
            case 7:
                return DISTANCE_CHANGED;
            case 8:
                return NUMBER_OF_INSIGHTS_CHANGED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52305l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52305l);
    }
}
