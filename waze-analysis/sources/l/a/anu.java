package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum anu implements com.google.v.eg {
    SUBTYPE_UNSPECIFIED(0),
    TURN_ON_YOUR_HEADLIGHTS_DEFAULT(1),
    ECO_REGULATION_DEFAULT(2),
    MID_DRIVE_TOAST_THANK_YOU(3),
    GTW_REROUTE_SUGGESTION_DEFAULT(4),
    NETWORK_ISSUE_DEFAULT(6),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52825i;

    anu(int i2) {
        this.f52825i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52825i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52825i);
    }
}
