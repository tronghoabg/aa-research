package org.chromium.net;

import defpackage.abnv;
import defpackage.aboh;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.impl.VersionSafeCallbacks;
import org.chromium.net.impl.VersionSafeProxyCallback;
import org.chromium.net.impl.proto.Proxy;
import org.chromium.net.impl.proto.ProxyOptions;
import org.chromium.net.impl.proto.ProxyScheme;

/* loaded from: classes2.dex */
public final class VersionSafeProxyOptions {
    private static final int SET_PROXY_OPTIONS_API_LEVEL = 49;
    private final ProxyOptions mBackend;

    public VersionSafeProxyOptions(ProxyOptions proxyOptions) {
        if (!apiContainsProxyOptionsClass()) {
            throw new AssertionError(String.format("This should have not been created: the Cronet API being used has an ApiLevel of %s, but setProxyOptions was added in ApiLevel %s", Integer.valueOf(VersionSafeCallbacks.ApiVersion.a()), 49));
        }
        proxyOptions.getClass();
        this.mBackend = proxyOptions;
        if (proxyOptions.getProxyList().isEmpty()) {
            throw new AssertionError("The list of proxies should never be empty, this is checked in the API layer");
        }
    }

    private static boolean apiContainsProxyOptionsClass() {
        return VersionSafeCallbacks.ApiVersion.a() >= 49;
    }

    public List<VersionSafeProxyCallback> createProxyCallbackList() {
        ArrayList arrayList = new ArrayList();
        Iterator<Proxy> it = this.mBackend.getProxyList().iterator();
        while (it.hasNext()) {
            Proxy next = it.next();
            arrayList.add(next == null ? null : new VersionSafeProxyCallback(next.getExecutor(), next.getCallback()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public org.chromium.net.impl.proto.ProxyOptions createProxyOptionsProto() {
        ProxyOptions.Builder builder = (ProxyOptions.Builder) org.chromium.net.impl.proto.ProxyOptions.a.n();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            Proxy.Builder builder2 = (Proxy.Builder) org.chromium.net.impl.proto.Proxy.a.n();
            if (proxy == null) {
                ProxyScheme proxyScheme = ProxyScheme.DIRECT;
                builder2.t();
                org.chromium.net.impl.proto.Proxy proxy2 = (org.chromium.net.impl.proto.Proxy) builder2.b;
                proxy2.c = proxyScheme.d;
                proxy2.b |= 1;
            } else {
                String host = proxy.getHost();
                builder2.t();
                org.chromium.net.impl.proto.Proxy proxy3 = (org.chromium.net.impl.proto.Proxy) builder2.b;
                host.getClass();
                proxy3.b |= 2;
                proxy3.d = host;
                int port = proxy.getPort();
                builder2.t();
                org.chromium.net.impl.proto.Proxy proxy4 = (org.chromium.net.impl.proto.Proxy) builder2.b;
                proxy4.b |= 4;
                proxy4.e = port;
                int scheme = proxy.getScheme();
                if (scheme == 0) {
                    ProxyScheme proxyScheme2 = ProxyScheme.HTTP;
                    builder2.t();
                    org.chromium.net.impl.proto.Proxy proxy5 = (org.chromium.net.impl.proto.Proxy) builder2.b;
                    proxy5.c = proxyScheme2.d;
                    proxy5.b |= 1;
                } else {
                    if (scheme != 1) {
                        throw new AssertionError(String.format("Unknown Proxy.Scheme: %s. This should have been caught by the API layer", Integer.valueOf(scheme)));
                    }
                    ProxyScheme proxyScheme3 = ProxyScheme.HTTPS;
                    builder2.t();
                    org.chromium.net.impl.proto.Proxy proxy6 = (org.chromium.net.impl.proto.Proxy) builder2.b;
                    proxy6.c = proxyScheme3.d;
                    proxy6.b |= 1;
                }
            }
            org.chromium.net.impl.proto.Proxy proxyQ = builder2.q();
            builder.t();
            org.chromium.net.impl.proto.ProxyOptions proxyOptions = (org.chromium.net.impl.proto.ProxyOptions) builder.b;
            proxyQ.getClass();
            aboh abohVar = proxyOptions.b;
            if (!abohVar.c()) {
                proxyOptions.b = abnv.I(abohVar);
            }
            proxyOptions.b.add(proxyQ);
        }
        return builder.q();
    }
}
