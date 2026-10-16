package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ljq implements defpackage.liz {
    final /* synthetic */ defpackage.ljr a;

    public ljq(defpackage.ljr ljrVar) {
        this.a = ljrVar;
    }

    @Override // defpackage.liz
    public final void a(defpackage.liy liyVar) {
        java.util.Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((defpackage.liz) it.next()).a(liyVar);
        }
    }

    @Override // defpackage.liz
    public final void b(java.lang.Float f) {
        java.util.Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((defpackage.liz) it.next()).b(f);
        }
    }
}
