package okhttp3;

import com.waze.reports.cx;
import java.net.ProxySelector;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ai implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private static final List f55861a = okhttp3.internal.b.o(aj.f55876d, aj.f55874b);

    /* renamed from: b, reason: collision with root package name */
    private static final List f55862b = okhttp3.internal.b.o(o.f56315a, o.f56316b);

    /* renamed from: c, reason: collision with root package name */
    private final t f55863c;

    /* renamed from: d, reason: collision with root package name */
    private final List f55864d;

    /* renamed from: e, reason: collision with root package name */
    private final List f55865e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f55866f;

    /* renamed from: g, reason: collision with root package name */
    private final c f55867g;

    /* renamed from: h, reason: collision with root package name */
    private final s f55868h;

    /* renamed from: i, reason: collision with root package name */
    private final v f55869i;

    /* renamed from: j, reason: collision with root package name */
    private final ProxySelector f55870j;

    /* renamed from: k, reason: collision with root package name */
    private final c f55871k;

    /* renamed from: l, reason: collision with root package name */
    private final SocketFactory f55872l;
    private final SSLSocketFactory m;
    private final X509TrustManager n;
    private final List o;
    private final List p;
    private final HostnameVerifier q;
    private final j r;
    private final okhttp3.internal.i.c s;
    private final int t;
    private final int u;
    private final int v;
    private final com.waze.shared_infra.s.c w;
    private final com.waze.shared_infra.coordinators.c x;
    private final cx y;

    public ai(ah ahVar) throws NoSuchAlgorithmException, KeyStoreException {
        h.g.b.x.f(ahVar, "builder");
        this.f55863c = ahVar.q();
        this.x = ahVar.C();
        this.f55864d = okhttp3.internal.b.p(ahVar.f());
        this.f55865e = okhttp3.internal.b.p(ahVar.g());
        this.y = ahVar.D();
        this.f55866f = ahVar.u();
        this.f55867g = ahVar.m();
        this.f55868h = ahVar.p();
        this.f55869i = ahVar.r();
        okhttp3.internal.h.a aVarD = ahVar.d();
        if (aVarD == null && (aVarD = ProxySelector.getDefault()) == null) {
            aVarD = okhttp3.internal.h.a.f56290a;
        }
        this.f55870j = aVarD;
        this.f55871k = ahVar.n();
        this.f55872l = ahVar.i();
        List listE = ahVar.e();
        this.o = listE;
        this.p = ahVar.h();
        this.q = ahVar.j();
        this.t = ahVar.a();
        this.u = ahVar.b();
        this.v = ahVar.c();
        com.waze.shared_infra.s.c cVarB = ahVar.B();
        this.w = cVarB == null ? new com.waze.shared_infra.s.c() : cVarB;
        List list = listE;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.m = null;
            this.s = null;
            this.n = null;
            this.r = j.f56294a;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((o) it.next()).e()) {
                    if (ahVar.k() == null) {
                        okhttp3.internal.g.g unused = okhttp3.internal.g.g.f56287a;
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        h.g.b.x.c(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                h.g.b.x.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.n = x509TrustManager;
                                okhttp3.internal.g.g gVar = okhttp3.internal.g.g.f56287a;
                                h.g.b.x.c(x509TrustManager);
                                this.m = gVar.k(x509TrustManager);
                                h.g.b.x.c(x509TrustManager);
                                h.g.b.x.f(x509TrustManager, "trustManager");
                                okhttp3.internal.i.c cVarB2 = okhttp3.internal.g.g.f56287a.b(x509TrustManager);
                                this.s = cVarB2;
                                j jVarO = ahVar.o();
                                h.g.b.x.c(cVarB2);
                                this.r = jVarO.b(cVarB2);
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        h.g.b.x.e(string, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(String.valueOf(string)));
                    }
                    this.m = ahVar.k();
                    okhttp3.internal.i.c cVarT = ahVar.t();
                    h.g.b.x.c(cVarT);
                    this.s = cVarT;
                    X509TrustManager x509TrustManagerL = ahVar.l();
                    h.g.b.x.c(x509TrustManagerL);
                    this.n = x509TrustManagerL;
                    j jVarO2 = ahVar.o();
                    h.g.b.x.c(cVarT);
                    this.r = jVarO2.b(cVarT);
                }
            }
            this.m = null;
            this.s = null;
            this.n = null;
            this.r = j.f56294a;
        }
        List list2 = this.f55864d;
        h.g.b.x.d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            List list3 = this.f55864d;
            Objects.toString(list3);
            throw new IllegalStateException("Null interceptor: ".concat(String.valueOf(list3)));
        }
        List list4 = this.f55865e;
        h.g.b.x.d(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            List list5 = this.f55865e;
            Objects.toString(list5);
            throw new IllegalStateException("Null network interceptor: ".concat(String.valueOf(list5)));
        }
        List list6 = this.o;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                if (((o) it2.next()).e()) {
                    if (this.m == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.s == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.n == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.m != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.s != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.n != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!h.g.b.x.n(this.r, j.f56294a)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final cx A() {
        return this.y;
    }

    public final int a() {
        return this.t;
    }

    public final int b() {
        return this.u;
    }

    public final int c() {
        return this.v;
    }

    public final /* bridge */ Object clone() {
        return super.clone();
    }

    public final ProxySelector d() {
        return this.f55870j;
    }

    public final List g() {
        return this.o;
    }

    public final List h() {
        return this.f55864d;
    }

    public final List i() {
        return this.f55865e;
    }

    public final List j() {
        return this.p;
    }

    public final SocketFactory k() {
        return this.f55872l;
    }

    public final HostnameVerifier l() {
        return this.q;
    }

    public final SSLSocketFactory n() {
        SSLSocketFactory sSLSocketFactory = this.m;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final X509TrustManager o() {
        return this.n;
    }

    public final c p() {
        return this.f55867g;
    }

    public final c q() {
        return this.f55871k;
    }

    public final f r(al alVar) {
        h.g.b.x.f(alVar, "request");
        return new okhttp3.internal.c.j(this, alVar);
    }

    public final j s() {
        return this.r;
    }

    public final s t() {
        return this.f55868h;
    }

    public final t u() {
        return this.f55863c;
    }

    public final v v() {
        return this.f55869i;
    }

    public final okhttp3.internal.i.c w() {
        return this.s;
    }

    public final boolean x() {
        return this.f55866f;
    }

    public final com.waze.shared_infra.s.c y() {
        return this.w;
    }

    public final com.waze.shared_infra.coordinators.c z() {
        return this.x;
    }

    public ai() {
        this(new ah());
    }
}
