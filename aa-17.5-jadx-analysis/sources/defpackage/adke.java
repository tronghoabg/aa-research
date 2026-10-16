package defpackage;

import j$.util.Objects;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;

/* loaded from: classes3.dex */
public final class adke extends adnc {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    private final Map e;

    public adke(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2) {
        woy.ad(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.e = map;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adke)) {
            return false;
        }
        adke adkeVar = (adke) obj;
        return Objects.equals(this.a, adkeVar.a) && Objects.equals(this.b, adkeVar.b) && Objects.equals(this.e, adkeVar.e) && Objects.equals(this.c, adkeVar.c) && Objects.equals(this.d, adkeVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("proxyAddr", this.a);
        xxgVarAo.b("targetAddr", this.b);
        xxgVarAo.b("headers", this.e);
        xxgVarAo.b("username", this.c);
        xxgVarAo.h("hasPassword", this.d != null);
        return xxgVarAo.toString();
    }
}
