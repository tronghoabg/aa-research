package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adyp implements adtn {
    private final adtn a;
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(1);

    public adyp(adtn adtnVar) {
        this.a = adtnVar;
    }

    public final adtt a(java.net.SocketAddress socketAddress, defpackage.adtm adtmVar, defpackage.adjy adjyVar) {
        return this.a.a(socketAddress, adtmVar, adjyVar);
    }

    public final java.util.Collection b() {
        return this.a.b();
    }

    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.a.c();
    }

    public final void close() {
        int iDecrementAndGet = this.b.decrementAndGet();
        defpackage.ysr.bl(iDecrementAndGet >= 0, "Reference count has gone negative: %s", iDecrementAndGet);
        if (iDecrementAndGet == 0) {
            this.a.close();
        }
    }
}
