package okhttp3;

import com.waze.reports.cx;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final t f55849a;

    /* renamed from: b, reason: collision with root package name */
    private final List f55850b;

    /* renamed from: c, reason: collision with root package name */
    private final List f55851c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55852d;

    /* renamed from: e, reason: collision with root package name */
    private final c f55853e;

    /* renamed from: f, reason: collision with root package name */
    private s f55854f;

    /* renamed from: g, reason: collision with root package name */
    private v f55855g;

    /* renamed from: h, reason: collision with root package name */
    private ProxySelector f55856h;

    /* renamed from: i, reason: collision with root package name */
    private final c f55857i;

    /* renamed from: j, reason: collision with root package name */
    private final SocketFactory f55858j;

    /* renamed from: k, reason: collision with root package name */
    private SSLSocketFactory f55859k;

    /* renamed from: l, reason: collision with root package name */
    private X509TrustManager f55860l;
    private final List m;
    private final List n;
    private final HostnameVerifier o;
    private final j p;
    private okhttp3.internal.i.c q;
    private int r;
    private int s;
    private int t;
    private com.waze.shared_infra.s.c u;
    private final com.waze.shared_infra.coordinators.c v;
    private final cx w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar) {
        this();
        h.g.b.x.f(aiVar, "okHttpClient");
        this.f55849a = aiVar.u();
        this.v = aiVar.z();
        h.a.i.aD(this.f55850b, aiVar.h());
        h.a.i.aD(this.f55851c, aiVar.i());
        this.w = aiVar.A();
        this.f55852d = aiVar.x();
        this.f55853e = aiVar.p();
        this.f55854f = aiVar.t();
        this.f55855g = aiVar.v();
        this.f55856h = aiVar.d();
        this.f55857i = aiVar.q();
        this.f55858j = aiVar.k();
        this.f55859k = aiVar.m;
        this.f55860l = aiVar.o();
        this.m = aiVar.g();
        this.n = aiVar.j();
        this.o = aiVar.l();
        this.p = aiVar.s();
        this.q = aiVar.w();
        this.r = aiVar.a();
        this.s = aiVar.b();
        this.t = aiVar.c();
        this.u = aiVar.y();
    }

    public final void A() {
        this.f55852d = true;
    }

    public final com.waze.shared_infra.s.c B() {
        return this.u;
    }

    public final com.waze.shared_infra.coordinators.c C() {
        return this.v;
    }

    public final cx D() {
        return this.w;
    }

    public final int a() {
        return this.r;
    }

    public final int b() {
        return this.s;
    }

    public final int c() {
        return this.t;
    }

    public final ProxySelector d() {
        return this.f55856h;
    }

    public final List e() {
        return this.m;
    }

    public final List f() {
        return this.f55850b;
    }

    public final List g() {
        return this.f55851c;
    }

    public final List h() {
        return this.n;
    }

    public final SocketFactory i() {
        return this.f55858j;
    }

    public final HostnameVerifier j() {
        return this.o;
    }

    public final SSLSocketFactory k() {
        return this.f55859k;
    }

    public final X509TrustManager l() {
        return this.f55860l;
    }

    public final c m() {
        return this.f55853e;
    }

    public final c n() {
        return this.f55857i;
    }

    public final j o() {
        return this.p;
    }

    public final s p() {
        return this.f55854f;
    }

    public final t q() {
        return this.f55849a;
    }

    public final v r() {
        return this.f55855g;
    }

    public final ah s(long j2, TimeUnit timeUnit) {
        h.g.b.x.f(timeUnit, "unit");
        this.r = okhttp3.internal.b.C(j2, timeUnit);
        return this;
    }

    public final okhttp3.internal.i.c t() {
        return this.q;
    }

    public final boolean u() {
        return this.f55852d;
    }

    public final void v(ac acVar) {
        h.g.b.x.f(acVar, "interceptor");
        this.f55850b.add(acVar);
    }

    public final void w(s sVar) {
        h.g.b.x.f(sVar, "cookieJar");
        this.f55854f = sVar;
    }

    public final void x(v vVar) {
        h.g.b.x.f(vVar, "dns");
        if (!h.g.b.x.n(vVar, this.f55855g)) {
            this.u = null;
        }
        this.f55855g = vVar;
    }

    public final void y(long j2, TimeUnit timeUnit) {
        h.g.b.x.f(timeUnit, "unit");
        this.s = okhttp3.internal.b.C(j2, timeUnit);
    }

    public final void z(long j2, TimeUnit timeUnit) {
        h.g.b.x.f(timeUnit, "unit");
        this.t = okhttp3.internal.b.C(j2, timeUnit);
    }

    public ah() {
        this.f55849a = new t();
        this.v = new com.waze.shared_infra.coordinators.c(null, null);
        this.f55850b = new ArrayList();
        this.f55851c = new ArrayList();
        w wVar = w.f56345a;
        byte[] bArr = okhttp3.internal.b.f55955a;
        h.g.b.x.f(wVar, "<this>");
        this.w = new cx(wVar);
        this.f55852d = true;
        c cVar = c.f55932a;
        this.f55853e = cVar;
        this.f55854f = s.f56339a;
        this.f55855g = v.f56344b;
        this.f55857i = cVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        h.g.b.x.e(socketFactory, "getDefault(...)");
        this.f55858j = socketFactory;
        this.m = ai.f55862b;
        this.n = ai.f55861a;
        this.o = okhttp3.internal.i.d.f56293a;
        this.p = j.f56294a;
        this.s = 10000;
        this.t = 10000;
    }
}
