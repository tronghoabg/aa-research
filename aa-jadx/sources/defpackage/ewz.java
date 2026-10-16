package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ewz {
    public final defpackage.exb b;
    public final java.util.List c;
    public final java.util.List d;
    public boolean e;
    public defpackage.mku f;

    public ewz(defpackage.exb exbVar, boolean z) {
        this.b = exbVar;
        defpackage.afce afceVar = defpackage.afce.a;
        this.c = afceVar;
        this.d = afceVar;
        this.e = z;
    }

    protected void a() {
        throw null;
    }

    protected void b() {
        throw null;
    }

    protected void c(defpackage.ewy ewyVar) {
        throw null;
    }

    public void e() {
        throw null;
    }

    public final void f() {
        defpackage.mku mkuVar = this.f;
        if (mkuVar == null || !((defpackage.aaq) mkuVar.a).g(this)) {
            return;
        }
        defpackage.exd exdVar = (defpackage.exd) mkuVar.b;
        if (defpackage.afga.f(this, exdVar.c)) {
            if (exdVar.d == -1) {
                a();
            }
            exdVar.c = null;
            exdVar.d = 0;
            exdVar.e = null;
        }
        exdVar.a.remove(this);
        exdVar.b.remove(this);
        this.f = null;
        exdVar.b();
    }

    public final void g(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        defpackage.mku mkuVar = this.f;
        if (mkuVar != null) {
            ((defpackage.exd) mkuVar.b).b();
        }
    }
}
