package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class adru implements adsm {
    public final Executor a;
    private final adsm b;

    public adru(adsm adsmVar, Executor executor) {
        this.b = adsmVar;
        executor.getClass();
        this.a = executor;
    }

    @Override // defpackage.adsm
    public final adss a(SocketAddress socketAddress, adsl adslVar, adiy adiyVar) {
        return new adrt(this, this.b.a(socketAddress, adslVar, adiyVar), adslVar.a);
    }

    @Override // defpackage.adsm
    public final Collection b() {
        return this.b.b();
    }

    @Override // defpackage.adsm
    public final ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override // defpackage.adsm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
