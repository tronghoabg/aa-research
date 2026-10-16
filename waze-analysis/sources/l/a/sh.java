package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum sh implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    CHANGE_LANGUAGE(2),
    TRY_AGAIN(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55402g;

    sh(int i2) {
        this.f55402g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55402g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55402g);
    }
}
