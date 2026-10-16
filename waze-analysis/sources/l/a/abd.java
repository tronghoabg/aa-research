package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum abd implements com.google.v.eg {
    GUIDANCE_SOURCE_UNSPECIFIED(0),
    ONLINE_SOURCE(1),
    OFFLINE_SOURCE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52149f;

    abd(int i2) {
        this.f52149f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52149f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52149f);
    }
}
