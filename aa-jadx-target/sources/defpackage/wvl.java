package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wvl extends defpackage.wvr {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ android.graphics.Matrix b;

    public wvl(java.util.List list, android.graphics.Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.wvr
    public final void a(android.graphics.Matrix matrix, defpackage.wuu wuuVar, int i, android.graphics.Canvas canvas) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.wvr) it.next()).a(this.b, wuuVar, i, canvas);
        }
    }
}
