package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum jl implements com.google.v.eg {
    PING_UNSUPPORTED(0),
    PING_ALLOWED(1),
    PING_DISALLOWED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48797e;

    jl(int i2) {
        this.f48797e = i2;
    }

    public static jl a(int i2) {
        if (i2 == 0) {
            return PING_UNSUPPORTED;
        }
        if (i2 == 1) {
            return PING_ALLOWED;
        }
        if (i2 != 2) {
            return null;
        }
        return PING_DISALLOWED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48797e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48797e);
    }
}
