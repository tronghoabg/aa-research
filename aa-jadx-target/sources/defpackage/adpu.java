package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adpu implements adtn {
    final android.content.Context a;
    final java.util.concurrent.Executor b;
    final adxu c;
    final adxu d;
    final defpackage.adpn e;
    final defpackage.adph f;
    final defpackage.adpk g;
    java.util.concurrent.ScheduledExecutorService h;
    java.util.concurrent.Executor i;
    private boolean j;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public adpu(defpackage.adpt adptVar) {
        android.content.Context context = adptVar.a;
        context.getClass();
        this.a = context;
        adptVar.h.getClass();
        this.b = hh$.ExternalSyntheticApiModelOutline0.m(context);
        adxu adxuVar = adptVar.c;
        this.c = adxuVar;
        adxu adxuVar2 = adptVar.b;
        adxuVar2.getClass();
        this.d = adxuVar2;
        defpackage.adpn adpnVar = adptVar.d;
        adpnVar.getClass();
        this.e = adpnVar;
        this.f = adptVar.e;
        this.g = adptVar.f;
        adptVar.g.getClass();
        this.h = (java.util.concurrent.ScheduledExecutorService) adxuVar.a();
        this.i = adxuVar2.a();
    }

    public final /* bridge */ /* synthetic */ adtt a(java.net.SocketAddress socketAddress, defpackage.adtm adtmVar, defpackage.adjy adjyVar) {
        if (this.j) {
            throw new java.lang.IllegalStateException("The transport factory is closed.");
        }
        return new defpackage.adps(this, (defpackage.adpe) socketAddress, adtmVar);
    }

    public final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.adpe.class);
    }

    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.h;
    }

    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}
