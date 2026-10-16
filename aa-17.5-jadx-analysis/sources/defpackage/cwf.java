package defpackage;

/* loaded from: classes.dex */
public final class cwf {
    private final cyw a = new cyw(cwh.a);

    public final cxb a() {
        cxb cxbVar = (cxb) this.a.first();
        e(cxbVar);
        return cxbVar;
    }

    public final void b(cxb cxbVar) {
        if (!cxbVar.am()) {
            crt.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(cxbVar);
    }

    public final boolean c(cxb cxbVar) {
        return this.a.contains(cxbVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(cxb cxbVar) {
        if (!cxbVar.am()) {
            crt.c("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(cxbVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
