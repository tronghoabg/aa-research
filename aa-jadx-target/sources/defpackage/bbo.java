package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbo implements defpackage.ctz {
    public final java.util.List a;
    public final int b;
    public final int c;
    public final int d;
    public final defpackage.apn e;
    public final int f;
    public final int g;
    public final int h;
    public final defpackage.bba i;
    public final defpackage.bba j;
    public final float k;
    public final int l;
    public final boolean m;
    public final defpackage.ary n;
    public final java.util.List o;
    public final java.util.List p;
    public final aiuw q;
    public final defpackage.dlo r;
    public final long s;
    private final defpackage.ctz t;
    private final boolean u;

    public bbo(java.util.List list, int i, int i2, int i3, defpackage.apn apnVar, int i4, int i5, int i6, defpackage.bba bbaVar, defpackage.bba bbaVar2, float f, int i7, boolean z, defpackage.ary aryVar, defpackage.ctz ctzVar, boolean z2, java.util.List list2, java.util.List list3, aiuw aiuwVar, defpackage.dlo dloVar, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = apnVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = bbaVar;
        this.j = bbaVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = aryVar;
        this.t = ctzVar;
        this.u = z2;
        this.o = list2;
        this.p = list3;
        this.q = aiuwVar;
        this.r = dloVar;
        this.s = j;
    }

    public final int a() {
        return -this.f;
    }

    @Override // defpackage.ctz
    public final int b() {
        return this.t.b();
    }

    @Override // defpackage.ctz
    public final int c() {
        return this.t.c();
    }

    public final long d() {
        return (((long) c()) << 32) | (((long) b()) & 4294967295L);
    }

    public final defpackage.bbo e(int i) {
        defpackage.bba bbaVar;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.u) {
            java.util.List list = this.a;
            if (!list.isEmpty() && (bbaVar = this.i) != null && (i2 = this.l - i) >= 0 && i2 < (i5 = (i4 = this.b) + (i3 = this.c))) {
                float f = i;
                float f2 = this.k;
                defpackage.bba bbaVar2 = this.j;
                if (bbaVar2 != null) {
                    float f3 = f2 - (f / i5);
                    if (f3 < 0.5f && f3 > -0.5f) {
                        defpackage.bba bbaVar3 = (defpackage.bba) defpackage.afga.az(list);
                        defpackage.bba bbaVar4 = (defpackage.bba) defpackage.afga.aE(list);
                        if (i < 0) {
                            if (java.lang.Math.min((bbaVar3.h + i5) - this.f, (bbaVar4.h + i5) - this.g) <= (-i)) {
                                return null;
                            }
                        } else if (java.lang.Math.min(this.f - bbaVar3.h, this.g - bbaVar4.h) <= i) {
                            return null;
                        }
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((defpackage.bba) list.get(i6)).a(i);
                        }
                        java.util.List list2 = this.o;
                        int size2 = list2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            ((defpackage.bba) list2.get(i7)).a(i);
                        }
                        java.util.List list3 = this.p;
                        int size3 = list3.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            ((defpackage.bba) list3.get(i8)).a(i);
                        }
                        return new defpackage.bbo(list, i4, i3, this.d, this.e, this.f, this.g, this.h, bbaVar, bbaVar2, f3, i2, this.m || i > 0, this.n, this.t, false, list2, list3, this.q, this.r, this.s);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ctz
    public final java.util.Map f() {
        return this.t.f();
    }

    @Override // defpackage.ctz
    public final defpackage.affc g() {
        return this.t.g();
    }

    @Override // defpackage.ctz
    public final void h() {
        this.t.h();
    }

    @Override // defpackage.ctz
    public final void i() {
        this.t.i();
    }

    @Override // defpackage.ctz
    public final void j() {
        this.t.j();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bbo(java.util.List list, int i, int i2, int i3, defpackage.apn apnVar, int i4, int i5, int i6, defpackage.ary aryVar, defpackage.ctz ctzVar, aiuw aiuwVar, defpackage.dlo dloVar, long j) {
        defpackage.afce afceVar = defpackage.afce.a;
        this(list, i, i2, i3, apnVar, i4, i5, i6, null, null, 0.0f, 0, false, aryVar, ctzVar, false, afceVar, afceVar, aiuwVar, dloVar, j);
    }
}
