package okhttp3;

import N0.a;
import com.unity3d.services.core.network.model.HttpRequest;
import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Address;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    public final Dns f42137a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f42138b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f42139c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f42140d;

    /* renamed from: e, reason: collision with root package name */
    public final CertificatePinner f42141e;

    /* renamed from: f, reason: collision with root package name */
    public final Authenticator f42142f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f42143g;

    /* renamed from: h, reason: collision with root package name */
    public final HttpUrl f42144h;

    /* renamed from: i, reason: collision with root package name */
    public final List f42145i;

    /* renamed from: j, reason: collision with root package name */
    public final List f42146j;

    public Address(String uriHost, int i5, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC3340k.e(uriHost, "uriHost");
        AbstractC3340k.e(dns, "dns");
        AbstractC3340k.e(socketFactory, "socketFactory");
        AbstractC3340k.e(proxyAuthenticator, "proxyAuthenticator");
        AbstractC3340k.e(protocols, "protocols");
        AbstractC3340k.e(connectionSpecs, "connectionSpecs");
        AbstractC3340k.e(proxySelector, "proxySelector");
        this.f42137a = dns;
        this.f42138b = socketFactory;
        this.f42139c = sSLSocketFactory;
        this.f42140d = hostnameVerifier;
        this.f42141e = certificatePinner;
        this.f42142f = proxyAuthenticator;
        this.f42143g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str = sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http";
        if (str.equalsIgnoreCase("http")) {
            builder.f42284a = "http";
        } else {
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException(AbstractC3340k.k(str, "unexpected scheme: "));
            }
            builder.f42284a = HttpRequest.DEFAULT_SCHEME;
        }
        String strB = HostnamesKt.b(HttpUrl.Companion.e(HttpUrl.k, uriHost, 0, 0, 7));
        if (strB == null) {
            throw new IllegalArgumentException(AbstractC3340k.k(uriHost, "unexpected host: "));
        }
        builder.f42287d = strB;
        if (1 > i5 || i5 >= 65536) {
            throw new IllegalArgumentException(AbstractC3340k.k(Integer.valueOf(i5), "unexpected port: ").toString());
        }
        builder.f42288e = i5;
        this.f42144h = builder.a();
        this.f42145i = Util.x(protocols);
        this.f42146j = Util.x(connectionSpecs);
    }

    public final boolean a(Address that) {
        AbstractC3340k.e(that, "that");
        return AbstractC3340k.a(this.f42137a, that.f42137a) && AbstractC3340k.a(this.f42142f, that.f42142f) && AbstractC3340k.a(this.f42145i, that.f42145i) && AbstractC3340k.a(this.f42146j, that.f42146j) && AbstractC3340k.a(this.f42143g, that.f42143g) && AbstractC3340k.a(this.f42139c, that.f42139c) && AbstractC3340k.a(this.f42140d, that.f42140d) && AbstractC3340k.a(this.f42141e, that.f42141e) && this.f42144h.f42277e == that.f42144h.f42277e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return AbstractC3340k.a(this.f42144h, address.f42144h) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f42141e) + ((Objects.hashCode(this.f42140d) + ((Objects.hashCode(this.f42139c) + ((this.f42143g.hashCode() + ((this.f42146j.hashCode() + ((this.f42145i.hashCode() + ((this.f42142f.hashCode() + ((this.f42137a.hashCode() + a.c(527, 31, this.f42144h.f42281i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f42144h;
        sb2.append(httpUrl.f42276d);
        sb2.append(':');
        sb2.append(httpUrl.f42277e);
        sb2.append(", ");
        sb2.append(AbstractC3340k.k(this.f42143g, "proxySelector="));
        sb2.append('}');
        return sb2.toString();
    }
}
