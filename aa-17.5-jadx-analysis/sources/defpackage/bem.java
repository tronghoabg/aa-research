package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bem {
    public final deu a;
    public final dfw b;
    public final boolean c;
    public final int d = 1;
    public final dlg e;
    public final List f;
    public final wci g;
    private dfc h;
    private dlr i;

    public bem(deu deuVar, dfw dfwVar, boolean z, dlg dlgVar, wci wciVar, List list) {
        this.a = deuVar;
        this.b = dfwVar;
        this.c = z;
        this.e = dlgVar;
        this.g = wciVar;
        this.f = list;
    }

    public final int a() {
        return Math.round((float) Math.ceil(b().a()));
    }

    public final dfc b() {
        dfc dfcVar = this.h;
        if (dfcVar != null) {
            return dfcVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final void c(dlr dlrVar) {
        dfc dfcVar = this.h;
        if (dfcVar == null || dlrVar != this.i || dfcVar.c()) {
            this.i = dlrVar;
            dfcVar = new dfc(this.a, dao.g(this.b, dlrVar), this.f, this.e, this.g);
        }
        this.h = dfcVar;
    }
}
