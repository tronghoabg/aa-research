package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgd {
    public static final defpackage.dgd a = new defpackage.dgd(0, 0, null, null, 0, 0, 0, 16777215);
    public final defpackage.dft b;
    public final defpackage.dfn c;
    public final defpackage.dfs d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dgd(long j, long j2, defpackage.dil dilVar, defpackage.dhz dhzVar, long j3, int i, long j4, int i2) {
        long jK;
        long j5;
        long j6;
        long jK2;
        if ((i2 & 1) != 0) {
            float[] fArr = defpackage.clr.a;
            jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK = j;
        }
        long j7 = 2143289344;
        if ((i2 & 2) != 0) {
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
            j5 = 2143289344;
        } else {
            j5 = j2;
        }
        defpackage.dil dilVar2 = (i2 & 4) != 0 ? null : dilVar;
        defpackage.dhz dhzVar2 = (i2 & 32) != 0 ? null : dhzVar;
        if ((i2 & 128) != 0) {
            defpackage.dmc[] dmcVarArr2 = defpackage.dmb.a;
            j6 = 2143289344;
        } else {
            j6 = j3;
        }
        if ((i2 & 2048) != 0) {
            float[] fArr2 = defpackage.clr.a;
            jK2 = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK2 = 0;
        }
        long j8 = jK2;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            defpackage.dmc[] dmcVarArr3 = defpackage.dmb.a;
        } else {
            j7 = j4;
        }
        this(new defpackage.dft(jK, j5, dilVar2, null, null, dhzVar2, null, j6, null, null, j8, null, null), new defpackage.dfn(i3, 0, j7, null, null, null, 0, 0, null), null);
    }

    public static /* synthetic */ defpackage.dgd w(defpackage.dgd dgdVar, long j, long j2, defpackage.dil dilVar, defpackage.die dieVar, defpackage.dhz dhzVar, java.lang.String str, long j3, defpackage.clc clcVar, int i, int i2, long j4, defpackage.dfs dfsVar, defpackage.dla dlaVar, int i3) {
        long jB = (i3 & 1) != 0 ? dgdVar.b.b() : j;
        long j5 = (i3 & 2) != 0 ? dgdVar.b.b : j2;
        defpackage.dil dilVar2 = (i3 & 4) != 0 ? dgdVar.b.c : dilVar;
        defpackage.die dieVar2 = (i3 & 8) != 0 ? dgdVar.b.d : dieVar;
        defpackage.dif difVar = (i3 & 16) != 0 ? dgdVar.b.e : null;
        defpackage.dhz dhzVar2 = (i3 & 32) != 0 ? dgdVar.b.f : dhzVar;
        java.lang.String str2 = (i3 & 64) != 0 ? dgdVar.b.g : str;
        long j6 = (i3 & 128) != 0 ? dgdVar.b.h : j3;
        defpackage.dku dkuVar = (i3 & 256) != 0 ? dgdVar.b.i : null;
        defpackage.dlg dlgVar = (i3 & 512) != 0 ? dgdVar.b.j : null;
        defpackage.dkl dklVar = (i3 & 1024) != 0 ? dgdVar.b.k : null;
        long j7 = jB;
        long j8 = (i3 & 2048) != 0 ? dgdVar.b.l : 0L;
        defpackage.dlc dlcVar = (i3 & 4096) != 0 ? dgdVar.b.m : null;
        defpackage.clc clcVar2 = (i3 & 8192) != 0 ? dgdVar.b.n : clcVar;
        defpackage.dlc dlcVar2 = dlcVar;
        defpackage.dai daiVar = (i3 & 16384) != 0 ? dgdVar.b.p : null;
        int i4 = (i3 & 32768) != 0 ? dgdVar.c.a : i;
        int i5 = (i3 & 65536) != 0 ? dgdVar.c.b : i2;
        long j9 = (i3 & 131072) != 0 ? dgdVar.c.c : j4;
        defpackage.dlh dlhVar = (i3 & 262144) != 0 ? dgdVar.c.d : null;
        defpackage.dfs dfsVar2 = (i3 & 524288) != 0 ? dgdVar.d : dfsVar;
        defpackage.dla dlaVar2 = (i3 & 1048576) != 0 ? dgdVar.c.f : dlaVar;
        defpackage.dfn dfnVar = dgdVar.c;
        defpackage.clc clcVar3 = clcVar2;
        int i6 = dfnVar.g;
        int i7 = dfnVar.h;
        defpackage.dli dliVar = dfnVar.i;
        defpackage.dft dftVar = dgdVar.b;
        return new defpackage.dgd(new defpackage.dft(j7 == dftVar.b() ? dftVar.a : defpackage.dln.u(j7), j5, dilVar2, dieVar2, difVar, dhzVar2, str2, j6, dkuVar, dlgVar, dklVar, j8, dlcVar2, clcVar3, daiVar), new defpackage.dfn(i4, i5, j9, dlhVar, dfsVar2 != null ? dfsVar2.b : null, dlaVar2, i6, i7, dliVar), dfsVar2);
    }

    public static /* synthetic */ defpackage.dgd x(defpackage.dgd dgdVar, long j, long j2, defpackage.dil dilVar, long j3, defpackage.dlc dlcVar, int i, long j4, int i2) {
        long jK;
        long j5;
        long j6;
        long jK2;
        if ((i2 & 1) != 0) {
            float[] fArr = defpackage.clr.a;
            jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK = j;
        }
        long j7 = 2143289344;
        if ((i2 & 2) != 0) {
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
            j5 = 2143289344;
        } else {
            j5 = j2;
        }
        defpackage.dil dilVar2 = (i2 & 4) != 0 ? null : dilVar;
        if ((i2 & 128) != 0) {
            defpackage.dmc[] dmcVarArr2 = defpackage.dmb.a;
            j6 = 2143289344;
        } else {
            j6 = j3;
        }
        if ((i2 & 2048) != 0) {
            float[] fArr2 = defpackage.clr.a;
            jK2 = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK2 = 0;
        }
        long j8 = jK2;
        defpackage.dlc dlcVar2 = (i2 & 4096) != 0 ? null : dlcVar;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            defpackage.dmc[] dmcVarArr3 = defpackage.dmb.a;
        } else {
            j7 = j4;
        }
        defpackage.dft dftVar = dgdVar.b;
        defpackage.dft dftVarA = defpackage.dfu.a(dftVar, jK, j5, dilVar2, null, null, null, null, j6, null, null, null, j8, dlcVar2, null, null);
        defpackage.dfn dfnVar = dgdVar.c;
        defpackage.dfn dfnVarA = defpackage.dfo.a(dfnVar, i3, 0, j7, null, null, null, 0, 0, null);
        return (dftVar == dftVarA && dfnVar == dfnVarA) ? dgdVar : new defpackage.dgd(dftVarA, dfnVarA);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dgd)) {
            return false;
        }
        defpackage.dgd dgdVar = (defpackage.dgd) obj;
        return defpackage.afga.f(this.b, dgdVar.b) && defpackage.afga.f(this.c, dgdVar.c) && defpackage.afga.f(this.d, dgdVar.d);
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + (this.d != null ? 38347 : 0);
    }

    public final long i() {
        return this.c.c;
    }

    public final defpackage.clc j() {
        return this.b.n;
    }

    public final defpackage.dgd k(defpackage.dgd dgdVar) {
        if (defpackage.afga.f(dgdVar, a)) {
            return this;
        }
        return new defpackage.dgd(this.b.c(dgdVar.b), this.c.a(dgdVar.c));
    }

    public final defpackage.dhz l() {
        return this.b.f;
    }

    public final defpackage.die m() {
        return this.b.d;
    }

    public final defpackage.dif n() {
        return this.b.e;
    }

    public final defpackage.dil o() {
        return this.b.c;
    }

    public final defpackage.dkl p() {
        return this.b.k;
    }

    public final defpackage.dla q() {
        return this.c.f;
    }

    public final defpackage.dlc r() {
        return this.b.m;
    }

    public final defpackage.dlh s() {
        return this.c.d;
    }

    public final defpackage.dli t() {
        return this.c.i;
    }

    public final java.lang.String toString() {
        java.lang.String strG = defpackage.ckd.g(f());
        y();
        float fA = a();
        java.lang.String strC = defpackage.dmb.c(g());
        defpackage.dil dilVarO = o();
        defpackage.die dieVarM = m();
        defpackage.dif difVarN = n();
        defpackage.dhz dhzVarL = l();
        java.lang.String strC2 = defpackage.dmb.c(h());
        defpackage.dkl dklVarP = p();
        java.lang.String strG2 = defpackage.ckd.g(e());
        defpackage.dlc dlcVarR = r();
        defpackage.clc clcVarJ = j();
        defpackage.dai daiVarZ = z();
        java.lang.String strA = defpackage.dlb.a(c());
        java.lang.String strA2 = defpackage.dld.a(d());
        java.lang.String strC3 = defpackage.dmb.c(i());
        defpackage.dlh dlhVarS = s();
        defpackage.dla dlaVarQ = q();
        java.lang.String strA3 = defpackage.dky.a(b());
        defpackage.dli dliVarT = t();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextStyle(color=");
        sb.append(strG);
        sb.append(", brush=null, alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strC);
        sb.append(", fontWeight=");
        sb.append(dilVarO);
        sb.append(", fontStyle=");
        sb.append(dieVarM);
        sb.append(", fontSynthesis=");
        sb.append(difVarN);
        sb.append(", fontFamily=");
        sb.append(dhzVarL);
        sb.append(", fontFeatureSettings=");
        defpackage.dft dftVar = this.b;
        sb.append(dftVar.g);
        sb.append(", letterSpacing=");
        sb.append(strC2);
        sb.append(", baselineShift=");
        sb.append(dftVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(dftVar.j);
        sb.append(", localeList=");
        sb.append(dklVarP);
        sb.append(", background=");
        sb.append(strG2);
        sb.append(", textDecoration=");
        sb.append(dlcVarR);
        sb.append(", shadow=");
        sb.append(clcVarJ);
        sb.append(", drawStyle=");
        sb.append(daiVarZ);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        sb.append(strA2);
        sb.append(", lineHeight=");
        sb.append(strC3);
        sb.append(", textIndent=");
        sb.append(dlhVarS);
        defpackage.dfn dfnVar = this.c;
        defpackage.dfs dfsVar = this.d;
        sb.append(", platformStyle=");
        sb.append(dfsVar);
        sb.append(", lineHeightStyle=");
        sb.append(dlaVarQ);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(defpackage.dkx.a(dfnVar.h));
        sb.append(", textMotion=");
        sb.append(dliVarT);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(defpackage.dgd dgdVar) {
        return this == dgdVar || this.b.e(dgdVar.b);
    }

    public final boolean v(defpackage.dgd dgdVar) {
        if (this != dgdVar) {
            return defpackage.afga.f(this.c, dgdVar.c) && this.b.d(dgdVar.b);
        }
        return true;
    }

    public final void y() {
        this.b.g();
    }

    public final defpackage.dai z() {
        return this.b.p;
    }

    public dgd(defpackage.dft dftVar, defpackage.dfn dfnVar, defpackage.dfs dfsVar) {
        this.b = dftVar;
        this.c = dfnVar;
        this.d = dfsVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dgd(defpackage.dft dftVar, defpackage.dfn dfnVar) {
        defpackage.dfq dfqVar = dfnVar.e;
        this(dftVar, dfnVar, dfqVar == null ? null : new defpackage.dfs(dfqVar));
    }
}
