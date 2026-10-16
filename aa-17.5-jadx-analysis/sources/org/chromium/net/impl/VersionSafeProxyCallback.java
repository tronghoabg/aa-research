package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.Proxy;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes2.dex */
public final class VersionSafeProxyCallback {
    public VersionSafeProxyCallback(Executor executor, Proxy.HttpConnectCallback httpConnectCallback) {
        if (VersionSafeCallbacks.ApiVersion.a() < 49) {
            throw new AssertionError(String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", Integer.valueOf(VersionSafeCallbacks.ApiVersion.a()), 49));
        }
        executor.getClass();
        httpConnectCallback.getClass();
    }
}
