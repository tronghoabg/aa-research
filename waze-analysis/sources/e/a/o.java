package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final h f47839a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47840b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f47841c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f47842d;

    o(h hVar, int i2, boolean z, boolean z2) {
        com.google.d.b.an.C(hVar, "callOptions");
        this.f47839a = hVar;
        this.f47840b = i2;
        this.f47841c = z;
        this.f47842d = z2;
    }

    public static n a() {
        return new n();
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("callOptions", this.f47839a);
        zVarH.b("previousAttempts", this.f47840b);
        zVarH.e("isTransparentRetry", this.f47841c);
        zVarH.e("isHedging", this.f47842d);
        return zVarH.toString();
    }
}
