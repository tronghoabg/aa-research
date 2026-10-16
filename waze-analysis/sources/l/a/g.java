package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum g implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    TRY_AGAIN(1),
    CREATE_A_NEW_ACCOUNT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54892f;

    g(int i2) {
        this.f54892f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54892f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54892f);
    }
}
