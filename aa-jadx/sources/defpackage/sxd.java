package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sxd implements defpackage.sxe {
    public final java.util.concurrent.CountDownLatch a = new java.util.concurrent.CountDownLatch(1);

    @Override // defpackage.swp
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.sws
    public final void d(java.lang.Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.swt
    public final void e(java.lang.Object obj) {
        this.a.countDown();
    }
}
