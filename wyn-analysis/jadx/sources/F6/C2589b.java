package f6;

/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2589b implements V {

    /* renamed from: a, reason: collision with root package name */
    public final V f35033a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2590c f35035c;

    public C2589b(C2590c c2590c, V v2) {
        this.f35035c = c2590c;
        this.f35033a = v2;
    }

    @Override // f6.V
    public final void a() {
        this.f35033a.a();
    }

    @Override // f6.V
    public final int g(long j8) {
        if (this.f35035c.g()) {
            return -3;
        }
        return this.f35033a.g(j8);
    }

    @Override // f6.V
    public final int h(S3.s sVar, H5.h hVar, int i5) {
        C2590c c2590c = this.f35035c;
        if (c2590c.g()) {
            return -3;
        }
        if (this.f35034b) {
            hVar.f4893b = 4;
            return -4;
        }
        int iH = this.f35033a.h(sVar, hVar, i5);
        if (iH != -5) {
            long j8 = c2590c.f35041f;
            if (j8 == Long.MIN_VALUE || ((iH != -4 || hVar.f4919f < j8) && !(iH == -3 && c2590c.n() == Long.MIN_VALUE && !hVar.f4918e))) {
                return iH;
            }
            hVar.o();
            hVar.f4893b = 4;
            this.f35034b = true;
            return -4;
        }
        E5.T t10 = (E5.T) sVar.f11010c;
        t10.getClass();
        int i10 = t10.f3224C;
        int i11 = t10.f3223B;
        if (i11 == 0 && i10 == 0) {
            return -5;
        }
        if (c2590c.f35040e != 0) {
            i11 = 0;
        }
        if (c2590c.f35041f != Long.MIN_VALUE) {
            i10 = 0;
        }
        E5.S sA = t10.a();
        sA.f3191A = i11;
        sA.f3192B = i10;
        sVar.f11010c = new E5.T(sA);
        return -5;
    }

    @Override // f6.V
    public final boolean isReady() {
        return !this.f35035c.g() && this.f35033a.isReady();
    }
}
