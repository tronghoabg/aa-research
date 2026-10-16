package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dft implements defpackage.dex {
    public final defpackage.dlf a;
    public final long b;
    public final defpackage.dil c;
    public final defpackage.die d;
    public final defpackage.dif e;
    public final defpackage.dhz f;
    public final java.lang.String g;
    public final long h;
    public final defpackage.dku i;
    public final defpackage.dlg j;
    public final defpackage.dkl k;
    public final long l;
    public final defpackage.dlc m;
    public final defpackage.clc n;
    public final defpackage.dfr o;
    public final defpackage.dai p;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dft(long j, long j2, defpackage.dil dilVar, defpackage.die dieVar, defpackage.dif difVar, defpackage.dhz dhzVar, java.lang.String str, long j3, defpackage.dku dkuVar, defpackage.dlg dlgVar, long j4, defpackage.dlc dlcVar, defpackage.clc clcVar, int i) {
        long jK;
        long j5;
        long jK2;
        if ((i & 1) != 0) {
            float[] fArr = defpackage.clr.a;
            jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK = j;
        }
        long j6 = 2143289344;
        if ((i & 2) != 0) {
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
            j5 = 2143289344;
        } else {
            j5 = j2;
        }
        defpackage.dil dilVar2 = (i & 4) != 0 ? null : dilVar;
        defpackage.die dieVar2 = (i & 8) != 0 ? null : dieVar;
        defpackage.dif difVar2 = (i & 16) != 0 ? null : difVar;
        defpackage.dhz dhzVar2 = (i & 32) != 0 ? null : dhzVar;
        java.lang.String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            defpackage.dmc[] dmcVarArr2 = defpackage.dmb.a;
        } else {
            j6 = j3;
        }
        defpackage.dku dkuVar2 = (i & 256) != 0 ? null : dkuVar;
        defpackage.dlg dlgVar2 = (i & 512) != 0 ? null : dlgVar;
        if ((i & 2048) != 0) {
            float[] fArr2 = defpackage.clr.a;
            jK2 = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK2 = j4;
        }
        this(jK, j5, dilVar2, dieVar2, difVar2, dhzVar2, str2, j6, dkuVar2, dlgVar2, jK2, (i & 4096) != 0 ? null : dlcVar, (i & 8192) != 0 ? null : clcVar);
    }

    public static /* synthetic */ defpackage.dft f(defpackage.dft dftVar, long j, int i) {
        long jB = (i & 1) != 0 ? dftVar.b() : j;
        long j2 = (i & 2) != 0 ? dftVar.b : 0L;
        defpackage.dil dilVar = (i & 4) != 0 ? dftVar.c : null;
        defpackage.die dieVar = (i & 8) != 0 ? dftVar.d : null;
        defpackage.dif difVar = (i & 16) != 0 ? dftVar.e : null;
        defpackage.dhz dhzVar = (i & 32) != 0 ? dftVar.f : null;
        java.lang.String str = dftVar.g;
        long j3 = dftVar.h;
        defpackage.dku dkuVar = dftVar.i;
        defpackage.dlg dlgVar = dftVar.j;
        defpackage.dkl dklVar = dftVar.k;
        long j4 = jB;
        long j5 = dftVar.l;
        defpackage.dlc dlcVar = dftVar.m;
        defpackage.clc clcVar = dftVar.n;
        defpackage.dfr dfrVar = dftVar.o;
        return new defpackage.dft(j4 == dftVar.b() ? dftVar.a : defpackage.dln.u(j4), j2, dilVar, dieVar, difVar, dhzVar, str, j3, dkuVar, dlgVar, dklVar, j5, dlcVar, clcVar, dftVar.p);
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final defpackage.dft c(defpackage.dft dftVar) {
        if (dftVar == null) {
            return this;
        }
        defpackage.dlf dlfVar = dftVar.a;
        long jB = dlfVar.b();
        dlfVar.e();
        dlfVar.a();
        return defpackage.dfu.a(this, jB, dftVar.b, dftVar.c, dftVar.d, dftVar.e, dftVar.f, dftVar.g, dftVar.h, dftVar.i, dftVar.j, dftVar.k, dftVar.l, dftVar.m, dftVar.n, dftVar.p);
    }

    public final boolean d(defpackage.dft dftVar) {
        if (this == dftVar) {
            return true;
        }
        long j = this.b;
        long j2 = dftVar.b;
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        if (j != j2 || !defpackage.afga.f(this.c, dftVar.c) || !defpackage.afga.f(this.d, dftVar.d) || !defpackage.afga.f(this.e, dftVar.e) || !defpackage.afga.f(this.f, dftVar.f) || !defpackage.afga.f(this.g, dftVar.g) || this.h != dftVar.h || !defpackage.afga.f(this.i, dftVar.i) || !defpackage.afga.f(this.j, dftVar.j) || !defpackage.afga.f(this.k, dftVar.k) || this.l != dftVar.l) {
            return false;
        }
        defpackage.dfr dfrVar = dftVar.o;
        return true;
    }

    public final boolean e(defpackage.dft dftVar) {
        return defpackage.afga.f(this.a, dftVar.a) && defpackage.afga.f(this.m, dftVar.m) && defpackage.afga.f(this.n, dftVar.n) && defpackage.afga.f(this.p, dftVar.p);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dft)) {
            return false;
        }
        defpackage.dft dftVar = (defpackage.dft) obj;
        return d(dftVar) && e(dftVar);
    }

    public final void g() {
        this.a.e();
    }

    public final int hashCode() {
        long jB = b();
        g();
        int iFloatToIntBits = (((int) (jB ^ (jB >>> 32))) * 961) + java.lang.Float.floatToIntBits(a());
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        defpackage.dil dilVar = this.c;
        int i = dilVar != null ? dilVar.o : 0;
        long j = this.b;
        long j2 = j >>> 32;
        int i2 = iFloatToIntBits * 31;
        defpackage.die dieVar = this.d;
        int i3 = (((((i2 + ((int) (j ^ j2))) * 31) + i) * 31) + (dieVar != null ? dieVar.a : 0)) * 31;
        defpackage.dif difVar = this.e;
        int i4 = (i3 + (difVar != null ? difVar.a : 0)) * 31;
        defpackage.dhz dhzVar = this.f;
        int iHashCode = (i4 + (dhzVar != null ? dhzVar.hashCode() : 0)) * 31;
        java.lang.String str = this.g;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j3 = this.h;
        int i5 = (((iHashCode + iHashCode2) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        defpackage.dku dkuVar = this.i;
        int iFloatToIntBits2 = (i5 + (dkuVar != null ? java.lang.Float.floatToIntBits(dkuVar.a) : 0)) * 31;
        defpackage.dlg dlgVar = this.j;
        int iHashCode3 = (iFloatToIntBits2 + (dlgVar != null ? dlgVar.hashCode() : 0)) * 31;
        defpackage.dkl dklVar = this.k;
        int iHashCode4 = dklVar != null ? dklVar.hashCode() : 0;
        long j4 = this.l;
        int i6 = (((iHashCode3 + iHashCode4) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
        defpackage.dlc dlcVar = this.m;
        int i7 = (i6 + (dlcVar != null ? dlcVar.d : 0)) * 31;
        defpackage.clc clcVar = this.n;
        int iHashCode5 = (i7 + (clcVar != null ? clcVar.hashCode() : 0)) * 961;
        defpackage.dai daiVar = this.p;
        return iHashCode5 + (daiVar != null ? daiVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String strG = defpackage.ckd.g(b());
        g();
        long j = this.l;
        long j2 = this.h;
        long j3 = this.b;
        return "SpanStyle(color=" + strG + ", brush=null, alpha=" + a() + ", fontSize=" + defpackage.dmb.c(j3) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + defpackage.dmb.c(j2) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + defpackage.ckd.g(j) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=null, drawStyle=" + this.p + ")";
    }

    public dft(long j, long j2, defpackage.dil dilVar, defpackage.die dieVar, defpackage.dif difVar, defpackage.dhz dhzVar, java.lang.String str, long j3, defpackage.dku dkuVar, defpackage.dlg dlgVar, long j4, defpackage.dlc dlcVar, defpackage.clc clcVar) {
        this(defpackage.dln.u(j), j2, dilVar, dieVar, difVar, dhzVar, str, j3, dkuVar, dlgVar, null, j4, dlcVar, clcVar, null);
    }

    public dft(defpackage.dlf dlfVar, long j, defpackage.dil dilVar, defpackage.die dieVar, defpackage.dif difVar, defpackage.dhz dhzVar, java.lang.String str, long j2, defpackage.dku dkuVar, defpackage.dlg dlgVar, defpackage.dkl dklVar, long j3, defpackage.dlc dlcVar, defpackage.clc clcVar, defpackage.dai daiVar) {
        this.a = dlfVar;
        this.b = j;
        this.c = dilVar;
        this.d = dieVar;
        this.e = difVar;
        this.f = dhzVar;
        this.g = str;
        this.h = j2;
        this.i = dkuVar;
        this.j = dlgVar;
        this.k = dklVar;
        this.l = j3;
        this.m = dlcVar;
        this.n = clcVar;
        this.o = null;
        this.p = daiVar;
    }
}
