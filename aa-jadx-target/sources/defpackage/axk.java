package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axk implements defpackage.azm {
    public final defpackage.axj a;
    public final defpackage.sns b;
    public final defpackage.bil c;
    private final defpackage.axx d;

    public axk(defpackage.axx axxVar, defpackage.axj axjVar, defpackage.bil bilVar, defpackage.sns snsVar) {
        this.d = axxVar;
        this.a = axjVar;
        this.c = bilVar;
        this.b = snsVar;
    }

    @Override // defpackage.azm
    public final int a(java.lang.Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.azm
    public final int b() {
        return this.a.d();
    }

    @Override // defpackage.azm
    public final java.lang.Object c(int i) {
        defpackage.ov ovVarB = this.a.a.b(i);
        return ((defpackage.azb) ovVarB.c).b().invoke(java.lang.Integer.valueOf(i - ovVarB.a));
    }

    @Override // defpackage.azm
    public final java.lang.Object d(int i) {
        java.lang.Object objC = this.b.c(i);
        return objC == null ? this.a.e(i) : objC;
    }

    @Override // defpackage.azm
    public final void e(int i, java.lang.Object obj, defpackage.bve bveVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-462424778);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != bveVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.E(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.C(this) ? 128 : 256;
        }
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            defpackage.axd.m(obj, i, this.d.m, defpackage.dai.as(-824725566, true, new defpackage.atn(this, i, i5), bveVarC), bveVarC, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 3072);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bbj(this, i, obj, i2, 1);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.axk) {
            return defpackage.afga.f(this.a, ((defpackage.axk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
