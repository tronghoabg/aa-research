package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ari implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACKGROUND_TAPPED(1),
    COMMENT(2),
    LIKE(3),
    NOT_THERE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53078h;

    ari(int i2) {
        this.f53078h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53078h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53078h);
    }
}
