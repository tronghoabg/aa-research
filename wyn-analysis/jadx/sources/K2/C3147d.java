package k2;

import N1.C0764m;
import N1.C0765n;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3147d implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f39058a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3148e f39060c;

    public C3147d(C3148e c3148e, d0 d0Var) {
        this.f39060c = c3148e;
        this.f39058a = d0Var;
    }

    @Override // k2.d0
    public final void a() {
        this.f39058a.a();
    }

    @Override // k2.d0
    public final int g(long j8) {
        if (this.f39060c.g()) {
            return -3;
        }
        return this.f39058a.g(j8);
    }

    @Override // k2.d0
    public final boolean isReady() {
        return !this.f39060c.g() && this.f39058a.isReady();
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        C3148e c3148e = this.f39060c;
        if (c3148e.g()) {
            return -3;
        }
        if (this.f39059b) {
            dVar.f4893b = 4;
            return -4;
        }
        long jN = c3148e.n();
        int iS = this.f39058a.s(cVar, dVar, i5);
        if (iS != -5) {
            long j8 = c3148e.f39066f;
            if (j8 == Long.MIN_VALUE || ((iS != -4 || dVar.f11360g < j8) && !(iS == -3 && jN == Long.MIN_VALUE && !dVar.f11359f))) {
                return iS;
            }
            dVar.o();
            dVar.f4893b = 4;
            this.f39059b = true;
            return -4;
        }
        C0765n c0765n = (C0765n) cVar.f10937c;
        c0765n.getClass();
        int i10 = c0765n.f8214G;
        int i11 = c0765n.f8213F;
        if (i11 == 0 && i10 == 0) {
            return -5;
        }
        if (c3148e.f39065e != 0) {
            i11 = 0;
        }
        if (c3148e.f39066f != Long.MIN_VALUE) {
            i10 = 0;
        }
        C0764m c0764mA = c0765n.a();
        c0764mA.f8176E = i11;
        c0764mA.f8177F = i10;
        cVar.f10937c = new C0765n(c0764mA);
        return -5;
    }
}
