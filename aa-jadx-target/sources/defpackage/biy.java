package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class biy {
    public java.lang.String a;
    public defpackage.dgd b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public defpackage.dlo g;
    public boolean h;
    public defpackage.dfm j;
    public defpackage.dlz k;
    public boolean m;
    public defpackage.deu n;
    public defpackage.wde o;
    private defpackage.biv q;
    private long t;
    private long p = defpackage.tna.aK(Float.NaN, Float.NaN);
    public long i = 0;
    public long l = defpackage.dln.m(0, 0);
    private int r = -1;
    private int s = -1;

    public biy(java.lang.String str, defpackage.dgd dgdVar, defpackage.wde wdeVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dgdVar;
        this.o = wdeVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
    }

    private final void h() {
        this.n = null;
        this.j = null;
        this.k = null;
        this.r = -1;
        this.s = -1;
        this.m = false;
        this.l = defpackage.dln.m(0, 0);
        this.i = 0L;
        this.h = false;
    }

    public final int a(int i, defpackage.dlz dlzVar) {
        defpackage.dfm dfmVar;
        int i2 = this.r;
        int i3 = this.s;
        if (i == i2 && i2 != -1 && dlzVar == this.k && ((dfmVar = this.j) == null || !dfmVar.c())) {
            return i3;
        }
        long jD = defpackage.dln.d(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jD = b(jD, dlzVar, this.b);
        }
        int iRound = java.lang.Math.round((float) java.lang.Math.ceil(f(jD, dlzVar).d));
        int iC = defpackage.dlm.c(jD);
        if (iRound < iC) {
            iRound = iC;
        }
        this.r = i;
        this.s = iRound;
        return iRound;
    }

    public final long b(long j, defpackage.dlz dlzVar, defpackage.dgd dgdVar) {
        defpackage.biv bivVar = this.q;
        defpackage.dlo dloVar = this.g;
        dloVar.getClass();
        defpackage.biv bivVarL = defpackage.axd.L(bivVar, dlzVar, dgdVar, dloVar, this.o);
        this.q = bivVarL;
        return bivVarL.a(j, this.f);
    }

    public final defpackage.dfm c(defpackage.dlz dlzVar) {
        defpackage.dfm dewVar = this.j;
        if (dewVar == null || dlzVar != this.k || dewVar.c()) {
            if (dewVar != null && dewVar.c()) {
                this.m = true;
            }
            this.k = dlzVar;
            this.r = -1;
            this.s = -1;
            this.q = null;
            java.lang.String str = this.a;
            defpackage.dgd dgdVarF = defpackage.dax.f(this.b, dlzVar);
            defpackage.afce afceVar = defpackage.afce.a;
            defpackage.dlo dloVar = this.g;
            dloVar.getClass();
            dewVar = new defpackage.dew(str, dgdVarF, afceVar, afceVar, this.o, dloVar);
        }
        this.j = dewVar;
        return dewVar;
    }

    public final void d(long j) {
        this.t = j | (this.t << 2);
    }

    public final void e(defpackage.dlo dloVar) {
        defpackage.dlo dloVar2 = this.g;
        long jAK = dloVar != null ? defpackage.tna.aK(dloVar.a(), dloVar.b()) : defpackage.tna.aK(Float.NaN, Float.NaN);
        if (dloVar2 == null) {
            this.g = dloVar;
            this.p = jAK;
        } else if (dloVar == null || this.p != jAK) {
            this.g = dloVar;
            this.p = jAK;
            d(1L);
            h();
        }
    }

    public final defpackage.deu f(long j, defpackage.dlz dlzVar) {
        defpackage.dfm dfmVarC = c(dlzVar);
        long jL = defpackage.dln.l(0, defpackage.axd.A(j, this.d, this.c, dfmVarC.a()), 0, defpackage.dlm.a(j));
        boolean z = this.d;
        int i = this.c;
        return new defpackage.deu((defpackage.dew) dfmVarC, defpackage.axd.z(z, i, this.e), i, jL);
    }

    public final void g(java.lang.String str, defpackage.dgd dgdVar, defpackage.wde wdeVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dgdVar;
        this.o = wdeVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        d(2L);
        h();
    }

    public final java.lang.String toString() {
        defpackage.deu deuVar = this.n;
        java.lang.String strA = defpackage.biu.a(this.p);
        long j = this.t;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(deuVar != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append(strA);
        sb.append(", history=");
        sb.append(j);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
