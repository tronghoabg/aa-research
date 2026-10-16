package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class adqv implements adsm {
    private final ScheduledExecutorService a = (ScheduledExecutorService) adzr.a(adue.p);
    private final Executor b;
    private final aeac c;
    private final sm d;

    public adqv(sm smVar, Executor executor, aeac aeacVar) {
        this.d = smVar;
        this.b = executor;
        this.c = aeacVar;
    }

    @Override // defpackage.adsm
    public final adss a(SocketAddress socketAddress, adsl adslVar, adiy adiyVar) {
        String str = adslVar.a;
        adis adisVar = adslVar.b;
        Executor executor = this.b;
        return new adrd(this.d, (InetSocketAddress) socketAddress, str, adisVar, executor, this.c);
    }

    @Override // defpackage.adsm
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.adsm
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.adsm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        adzr.c(adue.p, this.a);
    }
}
