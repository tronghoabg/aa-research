package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cwp {
    private final defpackage.cze a = new defpackage.cze(defpackage.cwr.a);

    public final defpackage.cxl a() {
        defpackage.cxl cxlVar = (defpackage.cxl) this.a.first();
        e(cxlVar);
        return cxlVar;
    }

    public final void b(defpackage.cxl cxlVar) {
        if (!cxlVar.am()) {
            defpackage.csc.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(cxlVar);
    }

    public final boolean c(defpackage.cxl cxlVar) {
        return this.a.contains(cxlVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(defpackage.cxl cxlVar) {
        if (!cxlVar.am()) {
            defpackage.csc.c("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(cxlVar);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
