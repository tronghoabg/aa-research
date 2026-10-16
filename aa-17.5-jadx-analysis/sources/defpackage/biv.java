package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class biv {
    public String a;
    public dfw b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public dlg g;
    public boolean h;
    public dff j;
    public dlr k;
    public boolean m;
    public den n;
    public wci o;
    private bis q;
    private long t;
    private long p = roc.aA(Float.NaN, Float.NaN);
    public long i = 0;
    public long l = dlf.v(0, 0);
    private int r = -1;
    private int s = -1;

    public biv(String str, dfw dfwVar, wci wciVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dfwVar;
        this.o = wciVar;
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
        this.l = dlf.v(0, 0);
        this.i = 0L;
        this.h = false;
    }

    public final int a(int i, dlr dlrVar) {
        dff dffVar;
        int i2 = this.r;
        int i3 = this.s;
        if (i == i2 && i2 != -1 && dlrVar == this.k && ((dffVar = this.j) == null || !dffVar.c())) {
            return i3;
        }
        long jD = dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.f > 1) {
            jD = b(jD, dlrVar, this.b);
        }
        int iRound = Math.round((float) Math.ceil(f(jD, dlrVar).d));
        int iC = dle.c(jD);
        if (iRound < iC) {
            iRound = iC;
        }
        this.r = i;
        this.s = iRound;
        return iRound;
    }

    public final long b(long j, dlr dlrVar, dfw dfwVar) {
        bis bisVar = this.q;
        dlg dlgVar = this.g;
        dlgVar.getClass();
        bis bisVarJ = awx.J(bisVar, dlrVar, dfwVar, dlgVar, this.o);
        this.q = bisVarJ;
        return bisVarJ.a(j, this.f);
    }

    public final dff c(dlr dlrVar) {
        dff depVar = this.j;
        if (depVar == null || dlrVar != this.k || depVar.c()) {
            if (depVar != null && depVar.c()) {
                this.m = true;
            }
            this.k = dlrVar;
            this.r = -1;
            this.s = -1;
            this.q = null;
            String str = this.a;
            dfw dfwVarG = dao.g(this.b, dlrVar);
            afbe afbeVar = afbe.a;
            dlg dlgVar = this.g;
            dlgVar.getClass();
            depVar = new dep(str, dfwVarG, afbeVar, afbeVar, this.o, dlgVar);
        }
        this.j = depVar;
        return depVar;
    }

    public final void d(long j) {
        this.t = j | (this.t << 2);
    }

    public final void e(dlg dlgVar) {
        dlg dlgVar2 = this.g;
        long jAA = dlgVar != null ? roc.aA(dlgVar.a(), dlgVar.b()) : roc.aA(Float.NaN, Float.NaN);
        if (dlgVar2 == null) {
            this.g = dlgVar;
            this.p = jAA;
        } else if (dlgVar == null || this.p != jAA) {
            this.g = dlgVar;
            this.p = jAA;
            d(1L);
            h();
        }
    }

    public final den f(long j, dlr dlrVar) {
        dff dffVarC = c(dlrVar);
        long jU = dlf.u(0, awx.G(j, this.d, this.c, dffVarC.a()), 0, dle.a(j));
        boolean z = this.d;
        int i = this.c;
        return new den((dep) dffVarC, awx.F(z, i, this.e), i, jU);
    }

    public final void g(String str, dfw dfwVar, wci wciVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dfwVar;
        this.o = wciVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        d(2L);
        h();
    }

    public final String toString() {
        den denVar = this.n;
        String strA = bir.a(this.p);
        long j = this.t;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(denVar != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append(strA);
        sb.append(", history=");
        sb.append(j);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
