package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adtu {
    private java.util.ArrayList a = new java.util.ArrayList();
    private volatile defpackage.adkh b = defpackage.adkh.d;

    final void a(defpackage.adkh adkhVar) {
        if (this.b == adkhVar || this.b == defpackage.adkh.e) {
            return;
        }
        this.b = adkhVar;
        if (this.a.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = this.a;
        this.a = new java.util.ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
