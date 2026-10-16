package f6;

/* renamed from: f6.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2577G implements V {

    /* renamed from: a, reason: collision with root package name */
    public final V f34881a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34882b;

    public C2577G(V v2, long j8) {
        this.f34881a = v2;
        this.f34882b = j8;
    }

    @Override // f6.V
    public final void a() {
        this.f34881a.a();
    }

    @Override // f6.V
    public final int g(long j8) {
        return this.f34881a.g(j8 - this.f34882b);
    }

    @Override // f6.V
    public final int h(S3.s sVar, H5.h hVar, int i5) {
        int iH = this.f34881a.h(sVar, hVar, i5);
        if (iH == -4) {
            hVar.f4919f = Math.max(0L, hVar.f4919f + this.f34882b);
        }
        return iH;
    }

    @Override // f6.V
    public final boolean isReady() {
        return this.f34881a.isReady();
    }
}
