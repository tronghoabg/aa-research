package l2;

import N1.C0765n;
import S1.z;
import Y2.B;
import k2.c0;
import s2.C;

/* loaded from: classes.dex */
public final class n extends AbstractC3376a {

    /* renamed from: o, reason: collision with root package name */
    public final int f39938o;

    /* renamed from: p, reason: collision with root package name */
    public final C0765n f39939p;

    /* renamed from: q, reason: collision with root package name */
    public long f39940q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f39941r;

    public n(S1.h hVar, S1.k kVar, C0765n c0765n, int i5, Object obj, long j8, long j10, long j11, int i10, C0765n c0765n2) {
        super(hVar, kVar, c0765n, i5, obj, j8, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.f39938o = i10;
        this.f39939p = c0765n2;
    }

    @Override // l2.l
    public final boolean b() {
        return this.f39941r;
    }

    @Override // o2.j
    public final void load() {
        z zVar = this.f39897i;
        B b5 = this.f39868m;
        Q1.k.h(b5);
        for (c0 c0Var : (c0[]) b5.f16384c) {
            if (c0Var.f39031F != 0) {
                c0Var.f39031F = 0L;
                c0Var.f39057z = true;
            }
        }
        C cF = b5.F(this.f39938o);
        cF.c(this.f39939p);
        try {
            long jY = zVar.y(this.f39890b.a(this.f39940q));
            if (jY != -1) {
                jY += this.f39940q;
            }
            s2.j jVar = new s2.j(this.f39897i, this.f39940q, jY);
            for (int iD = 0; iD != -1; iD = cF.d(jVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true)) {
                this.f39940q += iD;
            }
            cF.a(this.f39895g, 1, (int) this.f39940q, 0, null);
            Fe.b.m(zVar);
            this.f39941r = true;
        } catch (Throwable th) {
            Fe.b.m(zVar);
            throw th;
        }
    }

    @Override // o2.j
    public final void g() {
    }
}
