package e.a.d;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s implements am {

    /* renamed from: a, reason: collision with root package name */
    private final am f47297a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f47298b;

    s(am amVar, Executor executor) {
        this.f47297a = amVar;
        com.google.d.b.an.C(executor, "appExecutor");
        this.f47298b = executor;
    }

    @Override // e.a.d.am
    public final as a(SocketAddress socketAddress, al alVar, e.a.j jVar) {
        return new r(this, this.f47297a.a(socketAddress, alVar, jVar), alVar.c());
    }

    @Override // e.a.d.am
    public final Collection b() {
        return this.f47297a.b();
    }

    @Override // e.a.d.am
    public final ScheduledExecutorService c() {
        return this.f47297a.c();
    }

    @Override // e.a.d.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47297a.close();
    }
}
