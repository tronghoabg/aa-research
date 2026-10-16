package okhttp3;

import androidx.webkit.ProxyConfig;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final v f55798a;

    /* renamed from: b, reason: collision with root package name */
    private final SocketFactory f55799b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f55800c;

    /* renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f55801d;

    /* renamed from: e, reason: collision with root package name */
    private final j f55802e;

    /* renamed from: f, reason: collision with root package name */
    private final c f55803f;

    /* renamed from: g, reason: collision with root package name */
    private final Proxy f55804g;

    /* renamed from: h, reason: collision with root package name */
    private final ProxySelector f55805h;

    /* renamed from: i, reason: collision with root package name */
    private final ab f55806i;

    /* renamed from: j, reason: collision with root package name */
    private final List f55807j;

    /* renamed from: k, reason: collision with root package name */
    private final List f55808k;

    public a(String str, int i2, v vVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j jVar, c cVar, List list, List list2, ProxySelector proxySelector) {
        h.g.b.x.f(str, "uriHost");
        h.g.b.x.f(vVar, "dns");
        h.g.b.x.f(socketFactory, "socketFactory");
        h.g.b.x.f(cVar, "proxyAuthenticator");
        h.g.b.x.f(list, "protocols");
        h.g.b.x.f(list2, "connectionSpecs");
        h.g.b.x.f(proxySelector, "proxySelector");
        this.f55798a = vVar;
        this.f55799b = socketFactory;
        this.f55800c = sSLSocketFactory;
        this.f55801d = hostnameVerifier;
        this.f55802e = jVar;
        this.f55803f = cVar;
        this.f55804g = null;
        this.f55805h = proxySelector;
        this.f55806i = new aa().f(sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP).b(str).c(i2).g();
        this.f55807j = okhttp3.internal.b.p(list);
        this.f55808k = okhttp3.internal.b.p(list2);
    }

    public final ProxySelector a() {
        return this.f55805h;
    }

    public final List b() {
        return this.f55808k;
    }

    public final List c() {
        return this.f55807j;
    }

    public final SocketFactory d() {
        return this.f55799b;
    }

    public final HostnameVerifier e() {
        return this.f55801d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f55806i, aVar.f55806i) && k(aVar);
    }

    public final SSLSocketFactory f() {
        return this.f55800c;
    }

    public final c g() {
        return this.f55803f;
    }

    public final j h() {
        return this.f55802e;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f55806i.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.f55798a.hashCode()) * 31) + this.f55803f.hashCode()) * 31) + this.f55807j.hashCode()) * 31) + this.f55808k.hashCode()) * 31) + this.f55805h.hashCode()) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.f55800c)) * 31) + Objects.hashCode(this.f55801d)) * 31) + Objects.hashCode(this.f55802e);
    }

    public final v i() {
        return this.f55798a;
    }

    public final ab j() {
        return this.f55806i;
    }

    public final boolean k(a aVar) {
        h.g.b.x.f(aVar, "that");
        if (!h.g.b.x.n(this.f55798a, aVar.f55798a) || !h.g.b.x.n(this.f55803f, aVar.f55803f) || !h.g.b.x.n(this.f55807j, aVar.f55807j) || !h.g.b.x.n(this.f55808k, aVar.f55808k) || !h.g.b.x.n(this.f55805h, aVar.f55805h)) {
            return false;
        }
        Proxy proxy = aVar.f55804g;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f55800c, aVar.f55800c) && h.g.b.x.n(this.f55801d, aVar.f55801d) && h.g.b.x.n(this.f55802e, aVar.f55802e) && this.f55806i.a() == aVar.f55806i.a();
    }

    public final String toString() {
        ab abVar = this.f55806i;
        String strF = abVar.f();
        int iA = abVar.a();
        ProxySelector proxySelector = this.f55805h;
        java.util.Objects.toString(proxySelector);
        return "Address{" + strF + ":" + iA + ", " + "proxySelector=".concat(String.valueOf(proxySelector)) + "}";
    }
}
