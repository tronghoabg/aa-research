package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bix {
    public int a;
    public defpackage.dlo b;
    public defpackage.dga c;
    public boolean d;
    private defpackage.dfb e;
    private int f;
    private boolean g;
    private int h;
    private java.util.List i;
    private defpackage.biv j;
    private defpackage.dgd l;
    private defpackage.dfj m;
    private defpackage.dlz n;
    private long q;
    private defpackage.wde r;
    private long k = defpackage.tna.aK(Float.NaN, Float.NaN);
    private int o = -1;
    private int p = -1;

    public bix(defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.wde wdeVar, int i, boolean z, int i2, int i3, java.util.List list) {
        this.e = dfbVar;
        this.r = wdeVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.a = i3;
        this.i = list;
        this.l = dgdVar;
    }

    private final void j() {
        this.m = null;
        this.c = null;
        this.p = -1;
        this.o = -1;
        this.d = false;
    }

    public final int a(int i, defpackage.dlz dlzVar) {
        defpackage.dfj dfjVar;
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1 && dlzVar == this.n && ((dfjVar = this.m) == null || !dfjVar.c())) {
            return i3;
        }
        long jD = defpackage.dln.d(0, i, 0, Integer.MAX_VALUE);
        if (this.a > 1) {
            jD = b(jD, dlzVar);
        }
        int iRound = java.lang.Math.round((float) java.lang.Math.ceil(c(jD, dlzVar).e));
        int iC = defpackage.dlm.c(jD);
        if (iRound < iC) {
            iRound = iC;
        }
        this.o = i;
        this.p = iRound;
        return iRound;
    }

    public final long b(long j, defpackage.dlz dlzVar) {
        defpackage.biv bivVar = this.j;
        defpackage.dgd dgdVar = this.l;
        defpackage.dlo dloVar = this.b;
        dloVar.getClass();
        defpackage.biv bivVarL = defpackage.axd.L(bivVar, dlzVar, dgdVar, dloVar, this.r);
        this.j = bivVarL;
        return bivVarL.a(j, this.a);
    }

    public final defpackage.dfi c(long j, defpackage.dlz dlzVar) {
        defpackage.dfj dfjVarD = d(dlzVar);
        long jL = defpackage.dln.l(0, defpackage.axd.A(j, this.g, this.f, dfjVarD.a()), 0, defpackage.dlm.a(j));
        boolean z = this.g;
        int i = this.f;
        return new defpackage.dfi(dfjVarD, jL, defpackage.axd.z(z, i, this.h), i);
    }

    public final defpackage.dfj d(defpackage.dlz dlzVar) {
        defpackage.dfj dfjVar = this.m;
        if (dfjVar == null || dlzVar != this.n || dfjVar.c()) {
            if (dfjVar != null && dfjVar.c()) {
                this.d = true;
            }
            this.n = dlzVar;
            this.o = -1;
            this.p = -1;
            this.j = null;
            defpackage.dfb dfbVar = this.e;
            defpackage.dgd dgdVarF = defpackage.dax.f(this.l, dlzVar);
            defpackage.dlo dloVar = this.b;
            dloVar.getClass();
            defpackage.wde wdeVar = this.r;
            java.util.List list = this.i;
            if (list == null) {
                list = defpackage.afce.a;
            }
            dfjVar = new defpackage.dfj(dfbVar, dgdVarF, list, dloVar, wdeVar);
        }
        this.m = dfjVar;
        return dfjVar;
    }

    public final defpackage.dga e() {
        defpackage.dga dgaVar = this.c;
        if (dgaVar != null) {
            return dgaVar;
        }
        toString();
        throw new java.lang.IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final defpackage.dga f(defpackage.dlz dlzVar, long j, defpackage.dfi dfiVar) {
        float fMin = java.lang.Math.min(dfiVar.a.a(), dfiVar.d);
        defpackage.dfb dfbVar = this.e;
        defpackage.dgd dgdVar = this.l;
        java.util.List list = this.i;
        if (list == null) {
            list = defpackage.afce.a;
        }
        int i = this.h;
        boolean z = this.g;
        int i2 = this.f;
        defpackage.dlo dloVar = this.b;
        dloVar.getClass();
        defpackage.dfz dfzVar = new defpackage.dfz(dfbVar, dgdVar, list, i, z, i2, dloVar, dlzVar, this.r, j);
        float fCeil = (float) java.lang.Math.ceil(fMin);
        double d = dfiVar.e;
        return new defpackage.dga(dfzVar, dfiVar, defpackage.dln.e(j, (((long) java.lang.Math.round(fCeil)) << 32) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(d))) & 4294967295L)));
    }

    public final void g(long j) {
        this.q = j | (this.q << 2);
    }

    public final void h(defpackage.dlo dloVar) {
        defpackage.dlo dloVar2 = this.b;
        long jAK = dloVar != null ? defpackage.tna.aK(dloVar.a(), dloVar.b()) : defpackage.tna.aK(Float.NaN, Float.NaN);
        if (dloVar2 == null) {
            this.b = dloVar;
            this.k = jAK;
        } else if (dloVar == null || this.k != jAK) {
            this.b = dloVar;
            this.k = jAK;
            g(1L);
            j();
        }
    }

    public final void i(defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.wde wdeVar, int i, boolean z, int i2, int i3, java.util.List list) {
        this.e = dfbVar;
        boolean zV = dgdVar.v(this.l);
        this.l = dgdVar;
        if (!zV) {
            g(0L);
            this.m = null;
            this.c = null;
            this.p = -1;
            this.o = -1;
            this.d = false;
        }
        this.r = wdeVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.a = i3;
        this.i = list;
        g(2L);
        j();
    }

    public final java.lang.String toString() {
        defpackage.dga dgaVar = this.c;
        java.lang.String strA = defpackage.biu.a(this.k);
        long j = this.q;
        defpackage.dga dgaVar2 = this.c;
        java.lang.Object dlmVar = dgaVar2 != null ? new defpackage.dlm(dgaVar2.a.i) : "null";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(dgaVar != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append(strA);
        sb.append(", history=");
        sb.append(j);
        sb.append(", constraints=");
        sb.append(dlmVar);
        sb.append(")");
        return sb.toString();
    }
}
