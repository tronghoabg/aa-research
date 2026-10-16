package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjg implements defpackage.uzh {
    public final int b;
    public final java.util.ArrayDeque a = new java.util.ArrayDeque();
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger(0);

    public pjg(int i) {
        this.b = i;
    }

    public final defpackage.pjf a() {
        java.util.ArrayDeque arrayDeque = this.a;
        synchronized (arrayDeque) {
            defpackage.pjf pjfVar = (defpackage.pjf) arrayDeque.poll();
            return pjfVar != null ? pjfVar : new defpackage.pjf(this, this.b);
        }
    }

    @Override // defpackage.uzh
    public final void fB(java.lang.String str, java.io.PrintWriter printWriter) {
        throw null;
    }
}
