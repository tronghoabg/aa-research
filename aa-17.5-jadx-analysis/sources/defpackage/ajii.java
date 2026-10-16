package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes3.dex */
public final class ajii {
    public final ajhc a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ajii(ajhc ajhcVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = ajhcVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajii)) {
            return false;
        }
        ajii ajiiVar = (ajii) obj;
        return affa.f(ajiiVar.a, this.a) && affa.f(ajiiVar.b, this.b) && affa.f(ajiiVar.c, this.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String strA = null;
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            strA = ajip.a(hostAddress);
        }
        ajhx ajhxVar = this.a.h;
        String str = ajhxVar.b;
        if (afyh.A(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        int port = inetSocketAddress.getPort();
        int i = ajhxVar.c;
        if (i != port || affa.f(str, strA)) {
            sb.append(":");
            sb.append(i);
        }
        if (!affa.f(str, strA)) {
            if (affa.f(this.b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strA == null) {
                sb.append("<unresolved>");
            } else if (afyh.A(strA, ':')) {
                sb.append("[");
                sb.append(strA);
                sb.append("]");
            } else {
                sb.append(strA);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
