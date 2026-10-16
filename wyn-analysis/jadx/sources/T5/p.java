package T5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class p implements f, Y2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11640a;

    /* renamed from: b, reason: collision with root package name */
    public String f11641b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11642c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f11643d;

    /* renamed from: e, reason: collision with root package name */
    public long f11644e;

    /* renamed from: f, reason: collision with root package name */
    public long f11645f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11646g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11647h;

    /* renamed from: i, reason: collision with root package name */
    public Object f11648i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f11649j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11650l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11651m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f11652n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f11653o;

    public p(b7.k kVar) {
        this.f11640a = 1;
        this.f11646g = kVar;
        this.f11643d = new boolean[3];
        this.f11649j = new s(32, 1);
        this.k = new s(33, 1);
        this.f11650l = new s(34, 1);
        this.f11651m = new s(39, 1);
        this.f11652n = new s(40, 1);
        this.f11645f = -9223372036854775807L;
        this.f11653o = new Q1.o();
    }

    @Override // T5.f
    public final void a() {
        switch (this.f11640a) {
            case 0:
                this.f11644e = 0L;
                this.f11645f = -9223372036854775807L;
                AbstractC4256a.l(this.f11643d);
                ((s) this.f11649j).d();
                ((s) this.k).d();
                ((s) this.f11650l).d();
                ((s) this.f11651m).d();
                ((s) this.f11652n).d();
                o oVar = (o) this.f11648i;
                if (oVar != null) {
                    oVar.f11632e = false;
                    oVar.f11633f = false;
                    oVar.f11634g = false;
                    oVar.f11635h = false;
                    oVar.f11636i = false;
                    break;
                }
                break;
            default:
                this.f11644e = 0L;
                this.f11645f = -9223372036854775807L;
                R1.n.a(this.f11643d);
                ((s) this.f11649j).d();
                ((s) this.k).d();
                ((s) this.f11650l).d();
                ((s) this.f11651m).d();
                ((s) this.f11652n).d();
                ((R1.q) ((b7.k) this.f11646g).f19398d).p(0);
                o oVar2 = (o) this.f11648i;
                if (oVar2 != null) {
                    oVar2.f11632e = false;
                    oVar2.f11633f = false;
                    oVar2.f11634g = false;
                    oVar2.f11635h = false;
                    oVar2.f11636i = false;
                    break;
                }
                break;
        }
    }

    public final void b(int i5, int i10, byte[] bArr) {
        switch (this.f11640a) {
            case 0:
                o oVar = (o) this.f11648i;
                if (oVar.f11632e) {
                    int i11 = oVar.f11630c;
                    int i12 = (i5 + 2) - i11;
                    if (i12 < i10) {
                        oVar.f11633f = (bArr[i12] & 128) != 0;
                        oVar.f11632e = false;
                    } else {
                        oVar.f11630c = (i10 - i5) + i11;
                    }
                }
                if (!this.f11642c) {
                    ((s) this.f11649j).a(i5, i10, bArr);
                    ((s) this.k).a(i5, i10, bArr);
                    ((s) this.f11650l).a(i5, i10, bArr);
                }
                ((s) this.f11651m).a(i5, i10, bArr);
                ((s) this.f11652n).a(i5, i10, bArr);
                break;
            default:
                o oVar2 = (o) this.f11648i;
                if (oVar2.f11632e) {
                    int i13 = oVar2.f11630c;
                    int i14 = (i5 + 2) - i13;
                    if (i14 < i10) {
                        oVar2.f11633f = (bArr[i14] & 128) != 0;
                        oVar2.f11632e = false;
                    } else {
                        oVar2.f11630c = (i10 - i5) + i13;
                    }
                }
                if (!this.f11642c) {
                    ((s) this.f11649j).a(i5, i10, bArr);
                    ((s) this.k).a(i5, i10, bArr);
                    ((s) this.f11650l).a(i5, i10, bArr);
                }
                ((s) this.f11651m).a(i5, i10, bArr);
                ((s) this.f11652n).a(i5, i10, bArr);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    @Override // T5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(Y4.b r45) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.p.c(Y4.b):void");
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        switch (this.f11640a) {
            case 0:
                if (j8 != -9223372036854775807L) {
                    this.f11645f = j8;
                    break;
                }
                break;
            default:
                this.f11645f = j8;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0257  */
    @Override // Y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(Q1.o r36) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.p.e(Q1.o):void");
    }

    @Override // Y2.h
    public void f(s2.o oVar, B b5) {
        b5.a();
        b5.b();
        this.f11641b = b5.f11474f;
        b5.b();
        s2.C cMo0m = oVar.mo0m(b5.f11473e, 2);
        this.f11647h = cMo0m;
        this.f11648i = new o(cMo0m);
        ((b7.k) this.f11646g).q(oVar, b5);
    }

    @Override // T5.f
    public void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11641b = b5.f11474f;
        b5.b();
        J5.w wVarM = mVar.m(b5.f11473e, 2);
        this.f11647h = wVarM;
        this.f11648i = new o(wVarM);
        ((S3.s) this.f11646g).k(mVar, b5);
    }

    @Override // Y2.h
    public void h(boolean z2) {
        Q1.k.h((s2.C) this.f11647h);
        int i5 = Q1.x.f9724a;
        if (z2) {
            ((R1.q) ((b7.k) this.f11646g).f19398d).p(0);
            o oVar = (o) this.f11648i;
            long j8 = this.f11644e;
            oVar.f11638l = oVar.f11629b;
            oVar.a((int) (j8 - oVar.f11628a));
            oVar.f11637j = oVar.f11628a;
            oVar.f11628a = j8;
            oVar.a(0);
            oVar.f11635h = false;
        }
    }

    public p(S3.s sVar) {
        this.f11640a = 0;
        this.f11646g = sVar;
        this.f11643d = new boolean[3];
        this.f11649j = new s(32, 0);
        this.k = new s(33, 0);
        this.f11650l = new s(34, 0);
        this.f11651m = new s(39, 0);
        this.f11652n = new s(40, 0);
        this.f11645f = -9223372036854775807L;
        this.f11653o = new Y4.b();
    }

    @Override // T5.f
    public void i() {
    }
}
