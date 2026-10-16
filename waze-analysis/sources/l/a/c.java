package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum c implements com.google.v.eg {
    EMAIL_TYPE_UNSPECIFIED(0),
    EMPTY(1),
    UNVERIFIED(2),
    VERIFIED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54692g;

    c(int i2) {
        this.f54692g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54692g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54692g);
    }
}
