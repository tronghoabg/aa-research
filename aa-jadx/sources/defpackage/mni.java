package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mni implements defpackage.mnj {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.StatusManager");
    private final java.util.SortedMap c = new java.util.TreeMap();
    private final java.lang.Object d = new java.lang.Object();

    public static defpackage.mni a() {
        return (defpackage.mni) defpackage.mkp.a.i(defpackage.mni.class);
    }

    public final void b(defpackage.mnh mnhVar, defpackage.mnj mnjVar) {
        synchronized (this.d) {
            this.c.put(mnhVar, mnjVar);
        }
    }

    public final void c(defpackage.mnh mnhVar, defpackage.eqg eqgVar, defpackage.mnj mnjVar) {
        eqgVar.getLifecycle().c(new defpackage.mng(this, mnhVar, mnjVar));
    }

    public final void d(defpackage.mnh mnhVar) {
        synchronized (this.d) {
            this.c.remove(mnhVar);
        }
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        synchronized (this.d) {
            for (java.util.Map.Entry entry : this.c.entrySet()) {
                printWriter.format("=== %s ===\n", ((defpackage.mnh) entry.getKey()).name());
                try {
                    ((defpackage.mnj) entry.getValue()).h(printWriter);
                } catch (java.lang.Throwable th) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.g()).p(th)).ai(5103)).y("Error caputuring dump for section: %s", ((defpackage.mnh) entry.getKey()).name());
                    printWriter.format("\nError capturing dump for section: %s\n", th.getMessage());
                    th.printStackTrace(printWriter);
                }
                printWriter.println();
            }
        }
    }
}
