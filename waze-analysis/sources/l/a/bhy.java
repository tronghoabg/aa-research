package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bhy implements com.google.v.eg {
    TEXT_TYPE_UNSPECIFIED(0),
    NAVIGATION_INSTRUCTION(1),
    TRAFFIC_BAR_UPDATE(3),
    GUARDIAN_PROMPT(4),
    CHILD_REMINDER(5),
    ALERT(6),
    APP_TEXT(7),
    TTS_REQUEST(8),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f54021k;

    bhy(int i2) {
        this.f54021k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54021k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54021k);
    }
}
