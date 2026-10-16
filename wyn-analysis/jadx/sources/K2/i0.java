package k2;

import N1.C0765n;

/* loaded from: classes.dex */
public final class i0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f39089a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39090b;

    /* renamed from: c, reason: collision with root package name */
    public long f39091c;

    public i0(long j8) {
        C0765n c0765n = j0.f39096j;
        int i5 = Q1.x.f9724a;
        this.f39089a = 4 * ((j8 * 44100) / 1000000);
        b(0L);
    }

    public final void b(long j8) {
        C0765n c0765n = j0.f39096j;
        int i5 = Q1.x.f9724a;
        this.f39091c = Q1.x.j(4 * ((j8 * 44100) / 1000000), 0L, this.f39089a);
    }

    @Override // k2.d0
    public final int g(long j8) {
        long j10 = this.f39091c;
        b(j8);
        return (int) ((this.f39091c - j10) / j0.f39097l.length);
    }

    @Override // k2.d0
    public final boolean isReady() {
        return true;
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        if (!this.f39090b || (i5 & 2) != 0) {
            cVar.f10937c = j0.f39096j;
            this.f39090b = true;
            return -5;
        }
        long j8 = this.f39091c;
        long j10 = this.f39089a - j8;
        if (j10 == 0) {
            dVar.b(4);
            return -4;
        }
        C0765n c0765n = j0.f39096j;
        int i10 = Q1.x.f9724a;
        dVar.f11360g = ((j8 / 4) * 1000000) / 44100;
        dVar.b(1);
        byte[] bArr = j0.f39097l;
        int iMin = (int) Math.min(bArr.length, j10);
        if ((4 & i5) == 0) {
            dVar.r(iMin);
            dVar.f11358e.put(bArr, 0, iMin);
        }
        if ((i5 & 1) == 0) {
            this.f39091c += iMin;
        }
        return -4;
    }

    @Override // k2.d0
    public final void a() {
    }
}
