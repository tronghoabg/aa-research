package org.chromium.net;

import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ProxyOptions {
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_ALLOW_DIRECT = 1;
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_DISALLOW_DIRECT = 0;
    private final List<Proxy> mProxyList;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AllProxiesFailedBehavior {
    }

    private ProxyOptions(List<Proxy> list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ProxyList cannot be empty");
        }
        int iIndexOf = list.indexOf(null);
        if (iIndexOf != -1 && iIndexOf != list.size() - 1) {
            throw new IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = DesugarCollections.unmodifiableList(list);
    }

    public static ProxyOptions fromProxyList(List<Proxy> list, int i) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("proxyList cannot be empty");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("proxyList cannot contain null");
        }
        ArrayList arrayList = new ArrayList(list);
        if (i == 1) {
            arrayList.add(null);
        }
        return new ProxyOptions(arrayList);
    }

    public List<Proxy> getProxyList() {
        return this.mProxyList;
    }
}
