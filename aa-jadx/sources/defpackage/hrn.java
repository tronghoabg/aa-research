package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrn {
    public static final boolean a = defpackage.hro.b;
    private final java.util.List b = new java.util.ArrayList();
    private boolean c = false;

    public final synchronized void a(java.lang.String str, long j) {
        if (this.c) {
            throw new java.lang.IllegalStateException("Marker added to finished log");
        }
        this.b.add(new defpackage.hrm(str, j, android.os.SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(java.lang.String str) {
        this.c = true;
        java.util.List<defpackage.hrm> list = this.b;
        long j = list.size() == 0 ? 0L : ((defpackage.hrm) list.get(list.size() - 1)).c - ((defpackage.hrm) list.get(0)).c;
        if (j > 0) {
            long j2 = ((defpackage.hrm) list.get(0)).c;
            defpackage.hro.a("(%-4d ms) %s", java.lang.Long.valueOf(j), str);
            for (defpackage.hrm hrmVar : list) {
                long j3 = hrmVar.c;
                defpackage.hro.a("(+%-4d) [%2d] %s", java.lang.Long.valueOf(j3 - j2), java.lang.Long.valueOf(hrmVar.b), hrmVar.a);
                j2 = j3;
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        if (this.c) {
            return;
        }
        b("Request on the loose");
        defpackage.hro.b("Marker log finalized without finish() - uncaught exit point for request", new java.lang.Object[0]);
    }
}
