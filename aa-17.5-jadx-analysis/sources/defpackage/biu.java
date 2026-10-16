package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* loaded from: classes.dex */
public final class biu {
    public int a;
    public dlg b;
    public dft c;
    public boolean d;
    private deu e;
    private int f;
    private boolean g;
    private int h;
    private List i;
    private bis j;
    private dfw l;
    private dfc m;
    private dlr n;
    private long q;
    private wci r;
    private long k = roc.aA(Float.NaN, Float.NaN);
    private int o = -1;
    private int p = -1;

    public biu(deu deuVar, dfw dfwVar, wci wciVar, int i, boolean z, int i2, int i3, List list) {
        this.e = deuVar;
        this.r = wciVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.a = i3;
        this.i = list;
        this.l = dfwVar;
    }

    private final void j() {
        this.m = null;
        this.c = null;
        this.p = -1;
        this.o = -1;
        this.d = false;
    }

    public final int a(int i, dlr dlrVar) {
        dfc dfcVar;
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1 && dlrVar == this.n && ((dfcVar = this.m) == null || !dfcVar.c())) {
            return i3;
        }
        long jD = dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.a > 1) {
            jD = b(jD, dlrVar);
        }
        int iRound = Math.round((float) Math.ceil(c(jD, dlrVar).e));
        int iC = dle.c(jD);
        if (iRound < iC) {
            iRound = iC;
        }
        this.o = i;
        this.p = iRound;
        return iRound;
    }

    public final long b(long j, dlr dlrVar) {
        bis bisVar = this.j;
        dfw dfwVar = this.l;
        dlg dlgVar = this.b;
        dlgVar.getClass();
        bis bisVarJ = awx.J(bisVar, dlrVar, dfwVar, dlgVar, this.r);
        this.j = bisVarJ;
        return bisVarJ.a(j, this.a);
    }

    public final dfb c(long j, dlr dlrVar) {
        dfc dfcVarD = d(dlrVar);
        long jU = dlf.u(0, awx.G(j, this.g, this.f, dfcVarD.a()), 0, dle.a(j));
        boolean z = this.g;
        int i = this.f;
        return new dfb(dfcVarD, jU, awx.F(z, i, this.h), i);
    }

    public final dfc d(dlr dlrVar) {
        dfc dfcVar = this.m;
        if (dfcVar == null || dlrVar != this.n || dfcVar.c()) {
            if (dfcVar != null && dfcVar.c()) {
                this.d = true;
            }
            this.n = dlrVar;
            this.o = -1;
            this.p = -1;
            this.j = null;
            deu deuVar = this.e;
            dfw dfwVarG = dao.g(this.l, dlrVar);
            dlg dlgVar = this.b;
            dlgVar.getClass();
            wci wciVar = this.r;
            List list = this.i;
            if (list == null) {
                list = afbe.a;
            }
            dfcVar = new dfc(deuVar, dfwVarG, list, dlgVar, wciVar);
        }
        this.m = dfcVar;
        return dfcVar;
    }

    public final dft e() {
        dft dftVar = this.c;
        if (dftVar != null) {
            return dftVar;
        }
        toString();
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final dft f(dlr dlrVar, long j, dfb dfbVar) {
        float fMin = Math.min(dfbVar.a.a(), dfbVar.d);
        deu deuVar = this.e;
        dfw dfwVar = this.l;
        List list = this.i;
        if (list == null) {
            list = afbe.a;
        }
        int i = this.h;
        boolean z = this.g;
        int i2 = this.f;
        dlg dlgVar = this.b;
        dlgVar.getClass();
        dfs dfsVar = new dfs(deuVar, dfwVar, list, i, z, i2, dlgVar, dlrVar, this.r, j);
        float fCeil = (float) Math.ceil(fMin);
        double d = dfbVar.e;
        int iRound = Math.round(fCeil);
        float fCeil2 = (float) Math.ceil(d);
        return new dft(dfsVar, dfbVar, dlf.e(j, (iRound << 32) | (Math.round(fCeil2) & 4294967295L)));
    }

    public final void g(long j) {
        this.q = j | (this.q << 2);
    }

    public final void h(dlg dlgVar) {
        dlg dlgVar2 = this.b;
        long jAA = dlgVar != null ? roc.aA(dlgVar.a(), dlgVar.b()) : roc.aA(Float.NaN, Float.NaN);
        if (dlgVar2 == null) {
            this.b = dlgVar;
            this.k = jAA;
        } else if (dlgVar == null || this.k != jAA) {
            this.b = dlgVar;
            this.k = jAA;
            g(1L);
            j();
        }
    }

    public final void i(deu deuVar, dfw dfwVar, wci wciVar, int i, boolean z, int i2, int i3, List list) {
        this.e = deuVar;
        boolean zU = dfwVar.u(this.l);
        this.l = dfwVar;
        if (!zU) {
            g(0L);
            this.m = null;
            this.c = null;
            this.p = -1;
            this.o = -1;
            this.d = false;
        }
        this.r = wciVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.a = i3;
        this.i = list;
        g(2L);
        j();
    }

    public final String toString() {
        dft dftVar = this.c;
        String strA = bir.a(this.k);
        long j = this.q;
        dft dftVar2 = this.c;
        String dleVar = dftVar2 != null ? new dle(dftVar2.a.i) : "null";
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(dftVar != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append(strA);
        sb.append(", history=");
        sb.append(j);
        sb.append(", constraints=");
        sb.append(dleVar);
        sb.append(")");
        return sb.toString();
    }
}
