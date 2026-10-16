package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyOptions {
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_ALLOW_DIRECT = 1;
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_DISALLOW_DIRECT = 0;
    private final java.util.List<org.chromium.net.Proxy> mProxyList;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AllProxiesFailedBehavior {
    }

    private ProxyOptions(java.util.List<org.chromium.net.Proxy> list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("ProxyList cannot be empty");
        }
        int iIndexOf = list.indexOf(null);
        if (iIndexOf != -1 && iIndexOf != list.size() - 1) {
            throw new java.lang.IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = j$.util.DesugarCollections.unmodifiableList(list);
    }

    public static org.chromium.net.ProxyOptions fromProxyList(java.util.List<org.chromium.net.Proxy> list, int i) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("proxyList cannot be empty");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("proxyList cannot contain null");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (i == 1) {
            arrayList.add(null);
        }
        return new org.chromium.net.ProxyOptions(arrayList);
    }

    public java.util.List<org.chromium.net.Proxy> getProxyList() {
        return this.mProxyList;
    }
}
