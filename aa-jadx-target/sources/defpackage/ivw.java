package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivw extends defpackage.rkh {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE");
    public final defpackage.ivc b;
    public final java.util.concurrent.CopyOnWriteArraySet c = new java.util.concurrent.CopyOnWriteArraySet();

    public ivw(defpackage.ivc ivcVar) {
        this.b = ivcVar;
    }

    @Override // defpackage.rki
    public final void a(rkl rklVar) {
        this.c.add(rklVar);
    }

    @Override // defpackage.rki
    public final void b(java.util.List list) {
        defpackage.rbz.h(new defpackage.inq(this, list, 11));
    }

    @Override // defpackage.rki
    public final void c(rkl rklVar) {
        this.c.remove(rklVar);
    }
}
