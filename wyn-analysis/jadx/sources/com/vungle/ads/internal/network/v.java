package com.vungle.ads.internal.network;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class v extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        try {
            ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
        } catch (Exception unused) {
        }
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
            AbstractC3340k.d(listSelect, "{\n                      …ri)\n                    }");
            return listSelect;
        } catch (Exception unused) {
            return AbstractC3935e.C(Proxy.NO_PROXY);
        }
    }
}
