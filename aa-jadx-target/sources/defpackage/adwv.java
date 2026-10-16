package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adwv {
    final java.lang.Object a = new java.lang.Object();
    java.util.Collection b = new java.util.HashSet();
    defpackage.ador c;
    final /* synthetic */ defpackage.adww d;

    public adwv(defpackage.adww adwwVar) {
        this.d = adwwVar;
    }

    final void a(defpackage.ador adorVar) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = adorVar;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.x.q(adorVar);
            }
        }
    }
}
