package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class exc {
    public boolean c;
    public defpackage.mku d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        defpackage.mku mkuVar = this.d;
        if (mkuVar == null) {
            return;
        }
        if (!this.c) {
            mkuVar.v(this, null);
        }
        java.lang.Object obj = mkuVar.b;
        java.lang.Object obj2 = mkuVar.d;
        defpackage.exd exdVar = (defpackage.exd) obj;
        if (defpackage.afga.f(this, exdVar.e) && exdVar.d == -1) {
            defpackage.ewz ewzVarA = exdVar.c;
            if (ewzVarA == null) {
                ewzVarA = exdVar.a(-1);
            }
            exdVar.c = null;
            exdVar.d = 0;
            exdVar.e = null;
            if (ewzVarA == null) {
                ?? r0 = ((defpackage.bil) ((defpackage.izq) obj2).a).b;
                if (r0 != 0) {
                    r0.run();
                }
            } else {
                ewzVarA.b();
            }
            exdVar.f.d(defpackage.exe.a);
        }
        this.c = false;
    }

    protected void a() {
    }

    protected void c(boolean z) {
    }
}
