package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class ajhc {
    public final ajhs a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final ajhj e;
    public final ajhe f;
    public final ProxySelector g;
    public final ajhx h;
    public final List i;
    public final List j;

    public ajhc(String str, int i, ajhs ajhsVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ajhj ajhjVar, ajhe ajheVar, List list, List list2, ProxySelector proxySelector) {
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = ajhsVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = ajhjVar;
        this.f = ajheVar;
        this.g = proxySelector;
        ajhw ajhwVar = new ajhw();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (afyh.R(str2, "http")) {
            ajhwVar.a = "http";
        } else {
            if (!afyh.R(str2, "https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            ajhwVar.a = "https";
        }
        String strA = ajip.a(ajmq.c(str, 0, 0, false, 7));
        if (strA == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        ajhwVar.d = strA;
        if (i <= 0) {
            throw new IllegalArgumentException(a.bp(i, "unexpected port: "));
        }
        ajhwVar.e = i;
        this.h = ajhwVar.a();
        this.i = ajis.d(list);
        this.j = ajis.d(list2);
    }

    public final boolean a(ajhc ajhcVar) {
        ajhcVar.getClass();
        if (affa.f(this.a, ajhcVar.a) && affa.f(this.f, ajhcVar.f) && affa.f(this.i, ajhcVar.i) && affa.f(this.j, ajhcVar.j) && affa.f(this.g, ajhcVar.g) && affa.f(null, null) && affa.f(this.c, ajhcVar.c) && affa.f(this.d, ajhcVar.d) && affa.f(this.e, ajhcVar.e)) {
            return this.h.c == ajhcVar.h.c;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajhc)) {
            return false;
        }
        ajhc ajhcVar = (ajhc) obj;
        return affa.f(this.h, ajhcVar.h) && a(ajhcVar);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.h.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        ProxySelector proxySelector = this.g;
        java.util.Objects.toString(proxySelector);
        String strConcat = "proxySelector=".concat(proxySelector.toString());
        StringBuilder sb = new StringBuilder("Address{");
        ajhx ajhxVar = this.h;
        sb.append(ajhxVar.b);
        sb.append(":");
        sb.append(ajhxVar.c);
        sb.append(", ");
        sb.append(strConcat);
        sb.append("}");
        return sb.toString();
    }
}
