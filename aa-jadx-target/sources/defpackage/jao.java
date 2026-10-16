package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jao implements defpackage.jam {
    private final java.lang.Object a = new java.lang.Object();
    private final java.util.Queue b = new java.util.ArrayDeque();
    private defpackage.jam c = null;

    @Override // defpackage.jam
    public final void a(defpackage.izt iztVar) {
        synchronized (this.a) {
            defpackage.jam jamVar = this.c;
            if (jamVar != null) {
                jamVar.a(iztVar);
            } else {
                this.b.add(iztVar);
            }
        }
    }

    public final void b(defpackage.jam jamVar) {
        defpackage.izt iztVar;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            if (this.c != null) {
                throw new java.lang.IllegalStateException();
            }
        }
        while (true) {
            synchronized (obj) {
                iztVar = (defpackage.izt) this.b.poll();
                if (iztVar == null) {
                    this.c = jamVar;
                    return;
                }
            }
            jamVar.a(iztVar);
        }
    }
}
