package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum atf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    VIEW_ALL_NAVIGATION_SETTINGS(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f53130e;

    atf(int i2) {
        this.f53130e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53130e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53130e);
    }
}
