package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qse extends defpackage.rip {
    private defpackage.qsf a;
    private final java.lang.Object b = new java.lang.Object();

    public qse(defpackage.qsf qsfVar) {
        this.a = qsfVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        synchronized (this.b) {
            defpackage.yqk yqkVar = defpackage.qsg.a;
            this.a.a(intent);
        }
    }

    final void b(defpackage.qsf qsfVar) {
        synchronized (this.b) {
            this.a = qsfVar;
        }
    }
}
