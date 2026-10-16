package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uug implements defpackage.uzh {
    public final java.util.concurrent.LinkedBlockingQueue a = new java.util.concurrent.LinkedBlockingQueue();
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(0);

    public final defpackage.uwg a() {
        defpackage.uwg uwgVar = (defpackage.uwg) this.a.poll();
        c();
        return uwgVar;
    }

    public final void c() {
        int size = this.a.size();
        java.lang.String[] strArr = defpackage.vbn.a;
        defpackage.fdp.a("EntityQueueBuffer", size);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    @Override // defpackage.uzh
    public final void fB(java.lang.String str, java.io.PrintWriter printWriter) {
        throw null;
    }
}
