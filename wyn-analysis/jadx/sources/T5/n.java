package T5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class n implements f, Y2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11613a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11614b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11615c;

    /* renamed from: d, reason: collision with root package name */
    public long f11616d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f11617e;

    /* renamed from: f, reason: collision with root package name */
    public String f11618f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11619g;

    /* renamed from: h, reason: collision with root package name */
    public long f11620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11621i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f11622j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11623l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11624m;

    /* renamed from: n, reason: collision with root package name */
    public Object f11625n;

    /* renamed from: o, reason: collision with root package name */
    public Object f11626o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f11627p;

    public n(S3.s sVar, boolean z2, boolean z10) {
        this.f11613a = 0;
        this.f11622j = sVar;
        this.f11614b = z2;
        this.f11615c = z10;
        this.f11617e = new boolean[3];
        this.k = new s(7, 0);
        this.f11623l = new s(8, 0);
        this.f11624m = new s(6, 0);
        this.f11620h = -9223372036854775807L;
        this.f11627p = new Y4.b();
    }

    @Override // T5.f
    public final void a() {
        switch (this.f11613a) {
            case 0:
                this.f11616d = 0L;
                this.f11621i = false;
                this.f11620h = -9223372036854775807L;
                AbstractC4256a.l(this.f11617e);
                ((s) this.k).d();
                ((s) this.f11623l).d();
                ((s) this.f11624m).d();
                m mVar = (m) this.f11626o;
                if (mVar != null) {
                    mVar.k = false;
                    mVar.f11609o = false;
                    l lVar = mVar.f11608n;
                    lVar.f11582b = false;
                    lVar.f11581a = false;
                    break;
                }
                break;
            default:
                this.f11616d = 0L;
                this.f11621i = false;
                this.f11620h = -9223372036854775807L;
                R1.n.a(this.f11617e);
                ((s) this.k).d();
                ((s) this.f11623l).d();
                ((s) this.f11624m).d();
                ((R1.q) ((b7.k) this.f11622j).f19398d).p(0);
                Y2.m mVar2 = (Y2.m) this.f11626o;
                if (mVar2 != null) {
                    mVar2.k = false;
                    mVar2.f16505o = false;
                    l lVar2 = mVar2.f16504n;
                    lVar2.f11582b = false;
                    lVar2.f11581a = false;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r18, int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.n.b(int, int, byte[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    @Override // T5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(Y4.b r34) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.n.c(Y4.b):void");
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        switch (this.f11613a) {
            case 0:
                if (j8 != -9223372036854775807L) {
                    this.f11620h = j8;
                }
                this.f11621i = ((i5 & 2) != 0) | this.f11621i;
                break;
            default:
                this.f11620h = j8;
                this.f11621i = ((i5 & 2) != 0) | this.f11621i;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x029c  */
    @Override // Y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(Q1.o r30) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.n.e(Q1.o):void");
    }

    @Override // Y2.h
    public void f(s2.o oVar, B b5) {
        b5.a();
        b5.b();
        this.f11618f = b5.f11474f;
        b5.b();
        s2.C cMo0m = oVar.mo0m(b5.f11473e, 2);
        this.f11625n = cMo0m;
        this.f11626o = new Y2.m(cMo0m, this.f11614b, this.f11615c);
        ((b7.k) this.f11622j).q(oVar, b5);
    }

    @Override // T5.f
    public void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11618f = b5.f11474f;
        b5.b();
        J5.w wVarM = mVar.m(b5.f11473e, 2);
        this.f11625n = wVarM;
        this.f11626o = new m(wVarM, this.f11614b, this.f11615c);
        ((S3.s) this.f11622j).k(mVar, b5);
    }

    @Override // Y2.h
    public void h(boolean z2) {
        Q1.k.h((s2.C) this.f11625n);
        int i5 = Q1.x.f9724a;
        if (z2) {
            ((R1.q) ((b7.k) this.f11622j).f19398d).p(0);
            Y2.m mVar = (Y2.m) this.f11626o;
            long j8 = this.f11616d;
            mVar.a();
            mVar.f16501j = j8;
            long j10 = mVar.f16507q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = mVar.f16508r;
                mVar.f16492a.a(j10, z10 ? 1 : 0, (int) (j8 - mVar.f16506p), 0, null);
            }
            mVar.f16505o = false;
        }
    }

    public n(b7.k kVar, boolean z2, boolean z10) {
        this.f11613a = 1;
        this.f11622j = kVar;
        this.f11614b = z2;
        this.f11615c = z10;
        this.f11617e = new boolean[3];
        this.k = new s(7, 1);
        this.f11623l = new s(8, 1);
        this.f11624m = new s(6, 1);
        this.f11620h = -9223372036854775807L;
        this.f11627p = new Q1.o();
    }

    @Override // T5.f
    public void i() {
    }
}
