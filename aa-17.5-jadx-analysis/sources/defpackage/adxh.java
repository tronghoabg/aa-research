package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class adxh implements adnd {
    public static final Logger a = Logger.getLogger(adxh.class.getName());
    private static final adzo c = new adzo();
    private static final xyc b = new qbx(3);

    public adxh() {
        xyc xycVar = b;
        adzo adzoVar = c;
        xycVar.getClass();
        adzoVar.getClass();
    }

    public static final adnc a(InetSocketAddress inetSocketAddress) throws IOException {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
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
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationB = adzo.b(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            InetSocketAddress inetSocketAddress3 = inetSocketAddress2.isUnresolved() ? new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort()) : inetSocketAddress2;
            Map map = Collections.EMPTY_MAP;
            inetSocketAddress.getClass();
            inetSocketAddress3.getClass();
            if (passwordAuthenticationB == null) {
                return new adke(inetSocketAddress3, inetSocketAddress, map, null, null);
            }
            return new adke(inetSocketAddress3, inetSocketAddress, map, passwordAuthenticationB.getUserName(), passwordAuthenticationB.getPassword() != null ? new String(passwordAuthenticationB.getPassword()) : null);
        } catch (URISyntaxException e) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }
}
