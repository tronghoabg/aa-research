package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adsv implements adtn {
    public final java.util.concurrent.Executor a;
    private final adtn b;

    public adsv(adtn adtnVar, java.util.concurrent.Executor executor) {
        adtnVar.getClass();
        this.b = adtnVar;
        executor.getClass();
        this.a = executor;
    }

    public final adtt a(java.net.SocketAddress socketAddress, defpackage.adtm adtmVar, defpackage.adjy adjyVar) {
        return new defpackage.adsu(this, this.b.a(socketAddress, adtmVar, adjyVar), adtmVar.a);
    }

    public final java.util.Collection b() {
        return this.b.b();
    }

    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.b.c();
    }

    public final void close() {
        this.b.close();
    }
}
