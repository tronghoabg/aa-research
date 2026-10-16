package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class hxm {
    private final java.util.Queue a;

    public hxm() {
        char[] cArr = defpackage.igg.a;
        this.a = new java.util.ArrayDeque(20);
    }

    public abstract defpackage.hxx a();

    final defpackage.hxx b() {
        defpackage.hxx hxxVar = (defpackage.hxx) this.a.poll();
        return hxxVar == null ? a() : hxxVar;
    }

    public final void c(defpackage.hxx hxxVar) {
        java.util.Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(hxxVar);
        }
    }
}
