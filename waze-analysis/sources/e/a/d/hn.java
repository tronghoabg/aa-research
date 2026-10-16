package e.a.d;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hn implements e.a.dr {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.d.b.aj f47103c;

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47100a = Logger.getLogger(hn.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final jm f47102d = new jm(null);

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.d.b.aj f47101b = new hm(0);

    public hn() {
        com.google.d.b.aj ajVar = f47101b;
        jm jmVar = f47102d;
        com.google.d.b.an.B(ajVar);
        this.f47103c = ajVar;
        com.google.d.b.an.B(jmVar);
    }

    private final e.a.dq c(InetSocketAddress inetSocketAddress) throws IOException {
        try {
            URI uri = new URI(ProxyConfig.MATCH_HTTPS, null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = (ProxySelector) this.f47103c.get();
            if (proxySelector == null) {
                f47100a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect == null || listSelect.isEmpty()) {
                String name = proxySelector.getClass().getName();
                StringBuilder sb = new StringBuilder("ProxySelector ");
                sb.append(name);
                sb.append(" returned ");
                sb.append(listSelect == null ? "null" : "an empty list");
                sb.append(", which violates the java.net.ProxySelector#select(URI) contract");
                throw new IOException(sb.toString());
            }
            if (listSelect.size() > 1) {
                f47100a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationC = jm.c(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            e.a.ap apVarA = e.a.aq.a();
            apVarA.d(inetSocketAddress);
            apVarA.c(inetSocketAddress2);
            if (passwordAuthenticationC == null) {
                return apVarA.a();
            }
            apVarA.e(passwordAuthenticationC.getUserName());
            apVarA.b(passwordAuthenticationC.getPassword() != null ? new String(passwordAuthenticationC.getPassword()) : null);
            return apVarA.a();
        } catch (URISyntaxException e2) {
            f47100a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
            return null;
        }
    }

    @Override // e.a.dr
    public final e.a.dq a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return c((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
