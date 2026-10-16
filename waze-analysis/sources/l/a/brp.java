package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum brp implements com.google.v.eg {
    QUESTION_TITLE_TYPE_UNSPECIFIED(0),
    ENRICH_ALERT_WHAT_DO_YOU_SEE(1),
    ENRICH_CONSTRUCTION_ALERT_ARE_LANES_BLOCKED(2),
    FEEDBACK_ALERT_IS_THIS_ALERT_HELPFUL(3),
    MULTI_CAR_ON_SHOULDER_PEOPLE_AROUND(4),
    MULTI_CAR_ON_SHOULDER_CLOSE_TO_LANE(5),
    MULTI_CAR_ON_SHOULDER_CLEARLY_MARKED(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f54588j;

    brp(int i2) {
        this.f54588j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54588j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54588j);
    }
}
