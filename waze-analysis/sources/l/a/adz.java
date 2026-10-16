package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adz implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    THERE(1),
    NOT_THERE(2),
    ACCEPT_REROUTE(3),
    DECLINE_REROUTE(4),
    COLLAPSE(5),
    GENERAL_TAP(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f52327j;

    adz(int i2) {
        this.f52327j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52327j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52327j);
    }
}
