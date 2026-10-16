package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum any implements com.google.v.eg {
    NOTIFICATION_TYPE_UNSPECIFIED(0),
    WAZE_ASK(1),
    REPORT(2),
    TURN_ON_YOUR_HEADLIGHTS(3),
    ECO_REGULATION(4),
    GTW_REROUTE_SUGGESTION(5),
    NETWORK_ISSUE(6),
    CONVERSATION_FEEDBACK(8),
    INSIGHT_FEEDBACK(9),
    LIVE_MATCH(10),
    START_SEQUENCE(11),
    GPS_ISSUE(12),
    MULTI_ASK(13),
    UNRECOGNIZED(-1);

    private final int p;

    any(int i2) {
        this.p = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
