package od;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.C3557z;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: od.o1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3712o1 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f42049d = Logger.getLogger(C3712o1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final Y1 f42050e = new Y1(14);

    /* renamed from: f, reason: collision with root package name */
    public static final Y f42051f = new Y(1);

    /* renamed from: a, reason: collision with root package name */
    public final Y f42052a;

    /* renamed from: b, reason: collision with root package name */
    public final Y1 f42053b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f42054c;

    public C3712o1() {
        String str = System.getenv("GRPC_PROXY_EXP");
        Y y10 = f42051f;
        y10.getClass();
        this.f42052a = y10;
        Y1 y12 = f42050e;
        y12.getClass();
        this.f42053b = y12;
        if (str == null) {
            this.f42054c = null;
            return;
        }
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
        int i5 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f42049d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f42054c = new InetSocketAddress(strArrSplit[0], i5);
    }

    public final C3557z a(InetSocketAddress inetSocketAddress) {
        URL url;
        C3557z c3557z;
        if (inetSocketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress2 = this.f42054c;
            if (inetSocketAddress2 != null) {
                int i5 = C3557z.f40731e;
                Fe.e.t(inetSocketAddress, "targetAddress");
                return new C3557z(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = f42049d;
            try {
                try {
                    URI uri = new URI(HttpRequest.DEFAULT_SCHEME, null, AbstractC3669a0.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    this.f42052a.getClass();
                    ProxySelector proxySelector = ProxySelector.getDefault();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String strD = AbstractC3669a0.d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.f42053b.getClass();
                        try {
                            url = new URL(HttpRequest.DEFAULT_SCHEME, strD, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{HttpRequest.DEFAULT_SCHEME, strD});
                            url = null;
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strD, address, port, HttpRequest.DEFAULT_SCHEME, "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i10 = C3557z.f40731e;
                        if (passwordAuthenticationRequestPasswordAuthentication == null) {
                            c3557z = new C3557z(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            c3557z = new C3557z(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                        }
                        return c3557z;
                    }
                } catch (URISyntaxException e7) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e7);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
