package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yit extends defpackage.ybw {
    final /* synthetic */ java.util.Iterator a;
    final /* synthetic */ defpackage.xyp b;

    public yit(java.util.Iterator it, defpackage.xyp xypVar) {
        this.a = it;
        this.b = xypVar;
    }

    @Override // defpackage.ybw
    protected final java.lang.Object a() {
        defpackage.xyp xypVar;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            xypVar = this.b;
            next = it.next();
        } while (!xypVar.a(next));
        return next;
    }
}
