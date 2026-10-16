package pd;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import od.C3677d;
import od.U1;
import od.V1;
import od.Y1;
import qd.C3887b;

/* loaded from: classes5.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final a2.v f43489a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f43490b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.v f43491c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f43492d;

    /* renamed from: e, reason: collision with root package name */
    public final Y1 f43493e;

    /* renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f43494f;

    /* renamed from: g, reason: collision with root package name */
    public final C3887b f43495g;

    /* renamed from: h, reason: collision with root package name */
    public final int f43496h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f43497i;

    /* renamed from: j, reason: collision with root package name */
    public final C3677d f43498j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f43499l;

    /* renamed from: m, reason: collision with root package name */
    public final int f43500m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f43501n;

    public g(a2.v vVar, a2.v vVar2, SSLSocketFactory sSLSocketFactory, C3887b c3887b, int i5, boolean z2, long j8, long j10, int i10, int i11, Y1 y12) {
        this.f43489a = vVar;
        this.f43490b = (Executor) V1.a((U1) vVar.f17322b);
        this.f43491c = vVar2;
        this.f43492d = (ScheduledExecutorService) V1.a((U1) vVar2.f17322b);
        this.f43494f = sSLSocketFactory;
        this.f43495g = c3887b;
        this.f43496h = i5;
        this.f43497i = z2;
        this.f43498j = new C3677d(j8);
        this.k = j10;
        this.f43499l = i10;
        this.f43500m = i11;
        Fe.e.t(y12, "transportTracerFactory");
        this.f43493e = y12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f43501n) {
            return;
        }
        this.f43501n = true;
        V1.b((U1) this.f43489a.f17322b, this.f43490b);
        V1.b((U1) this.f43491c.f17322b, this.f43492d);
    }
}
