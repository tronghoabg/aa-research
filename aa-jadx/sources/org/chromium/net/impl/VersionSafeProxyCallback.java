package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionSafeProxyCallback {
    public VersionSafeProxyCallback(java.util.concurrent.Executor executor, org.chromium.net.Proxy.HttpConnectCallback httpConnectCallback) {
        if (org.chromium.net.impl.VersionSafeCallbacks.ApiVersion.a() < 49) {
            throw new java.lang.AssertionError(java.lang.String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", java.lang.Integer.valueOf(org.chromium.net.impl.VersionSafeCallbacks.ApiVersion.a()), 49));
        }
        executor.getClass();
        httpConnectCallback.getClass();
    }
}
