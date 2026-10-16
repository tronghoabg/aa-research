package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbk implements defpackage.azm {
    public final defpackage.azc a;
    public final defpackage.bbp b = defpackage.bbp.a;
    private final defpackage.bby c;
    private final defpackage.sns d;

    public bbk(defpackage.bby bbyVar, defpackage.azc azcVar, defpackage.sns snsVar) {
        this.c = bbyVar;
        this.a = azcVar;
        this.d = snsVar;
    }

    @Override // defpackage.azm
    public final int a(java.lang.Object obj) {
        return this.d.b(obj);
    }

    @Override // defpackage.azm
    public final int b() {
        return this.a.d();
    }

    @Override // defpackage.azm
    public final /* synthetic */ java.lang.Object c(int i) {
        return null;
    }

    @Override // defpackage.azm
    public final java.lang.Object d(int i) {
        java.lang.Object objC = this.d.c(i);
        return objC == null ? this.a.e(i) : objC;
    }

    @Override // defpackage.azm
    public final void e(int i, java.lang.Object obj, defpackage.bve bveVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-1201380429);
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
            defpackage.axd.m(obj, i, this.c.x, defpackage.dai.as(1142237095, true, new defpackage.atn(this, i, 4), bveVarC), bveVarC, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 3072);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bbj(this, i, obj, i2, 0);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bbk) {
            return defpackage.afga.f(this.a, ((defpackage.bbk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
