package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajki {
    public final defpackage.ajjx a;
    public final long b;
    public long c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    public final java.util.concurrent.BlockingQueue e;
    public final defpackage.ajkq f;

    public ajki(defpackage.ajkq ajkqVar, defpackage.ajjx ajjxVar) {
        ajjxVar.getClass();
        this.f = ajkqVar;
        this.a = ajjxVar;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.b = 250000000L;
        this.c = Long.MIN_VALUE;
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.e = new java.util.concurrent.LinkedBlockingDeque();
    }

    public final void a() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            defpackage.ajkt ajktVar = (defpackage.ajkt) it.next();
            ajktVar.g();
            this.f.g.addLast(ajktVar.f());
        }
        copyOnWriteArrayList.clear();
    }
}
