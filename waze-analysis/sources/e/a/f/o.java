package e.a.f;

import e.a.d.as;
import e.a.d.gr;
import e.a.d.ka;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements e.a.d.am {

    /* renamed from: a, reason: collision with root package name */
    final Executor f47694a;

    /* renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f47695b;

    /* renamed from: c, reason: collision with root package name */
    final ka f47696c;

    /* renamed from: d, reason: collision with root package name */
    final SSLSocketFactory f47697d;

    /* renamed from: e, reason: collision with root package name */
    final e.a.f.a.c f47698e;

    /* renamed from: f, reason: collision with root package name */
    private final gr f47699f;

    /* renamed from: g, reason: collision with root package name */
    private final gr f47700g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f47701h;

    /* renamed from: i, reason: collision with root package name */
    private final e.a.d.j f47702i;

    /* renamed from: j, reason: collision with root package name */
    private final long f47703j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f47704k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f47705l;

    /* synthetic */ o(gr grVar, gr grVar2, SSLSocketFactory sSLSocketFactory, e.a.f.a.c cVar, boolean z, long j2, long j3, boolean z2, ka kaVar) {
        this.f47699f = grVar;
        this.f47694a = (Executor) grVar.a();
        this.f47700g = grVar2;
        this.f47695b = (ScheduledExecutorService) grVar2.a();
        this.f47697d = sSLSocketFactory;
        this.f47698e = cVar;
        this.f47701h = z;
        this.f47702i = new e.a.d.j(j2);
        this.f47703j = j3;
        this.f47704k = z2;
        com.google.d.b.an.C(kaVar, "transportTracerFactory");
        this.f47696c = kaVar;
    }

    @Override // e.a.d.am
    public final as a(SocketAddress socketAddress, e.a.d.al alVar, e.a.j jVar) {
        if (this.f47705l) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        e.a.d.i iVarA = this.f47702i.a();
        ac acVar = new ac(this, (InetSocketAddress) socketAddress, alVar.c(), alVar.a(), alVar.b(), new n(this, iVarA));
        if (this.f47701h) {
            acVar.ad(iVarA.a(), this.f47703j, this.f47704k);
        }
        return acVar;
    }

    @Override // e.a.d.am
    public final Collection b() {
        int i2 = p.f47709d;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // e.a.d.am
    public final ScheduledExecutorService c() {
        return this.f47695b;
    }

    @Override // e.a.d.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47705l) {
            return;
        }
        this.f47705l = true;
        this.f47699f.b(this.f47694a);
        this.f47700g.b(this.f47695b);
    }
}
