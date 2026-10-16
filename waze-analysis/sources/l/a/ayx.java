package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ayx implements com.google.v.eg {
    FLOW_TYPE_UNSPECIFIED(0),
    OS_SHARE_FLOW(1),
    OS_DEFAULT_NAVIGATION_APP(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53462f;

    ayx(int i2) {
        this.f53462f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53462f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53462f);
    }
}
