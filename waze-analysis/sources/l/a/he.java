package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum he implements com.google.v.eg {
    BANNER_SOURCE_UNSPECIFIED(0),
    MAIN_MENU(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f54946e;

    he(int i2) {
        this.f54946e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54946e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54946e);
    }
}
