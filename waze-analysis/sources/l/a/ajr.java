package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ajr implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    CLOSE(2),
    SHARE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52578g;

    ajr(int i2) {
        this.f52578g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52578g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52578g);
    }
}
