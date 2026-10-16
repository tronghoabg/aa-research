package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class vqz extends defpackage.vqt {
    public final java.util.List b = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // defpackage.vqt
    public final void g(defpackage.vlu vluVar) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.vqw) it.next()).g(vluVar);
        }
    }

    @Override // defpackage.vqt
    public final void j(defpackage.vlu vluVar) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.vqw) it.next()).j(vluVar);
        }
    }
}
