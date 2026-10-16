package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adx implements com.google.v.eg {
    CHANGE_REASON_UNSPECIFIED(0),
    REAL_TIME_INSIGHT_VALIDATION(1),
    ARRIVED_TO_INSIGHT_POINT(2),
    ENTER_SEGMENT(3),
    EXIT_SEGMENT(4),
    INSIGHT_COMPONENT_TERMINATED(5),
    INSIGHT_COMPONENT_CLICKED_BY_THE_USER(6),
    ONE_TO_MULTIPLE_INSIGHT_COMPONENTS(7),
    MULTIPLE_TO_ONE_INSIGHT_COMPONENT(8),
    USER_DRAGGED_MAP(9),
    USER_CLICKED_EMPTY_MAP(10),
    HIDDEN_BY_OTHER_UI_COMPONENT(11),
    UNRECOGNIZED(-1);

    private final int o;

    adx(int i2) {
        this.o = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
