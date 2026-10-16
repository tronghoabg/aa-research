package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlResponseInfoImpl extends org.chromium.net.UrlResponseInfo {
    public final int a;
    public final boolean b;
    public final java.lang.String c;
    private final java.util.List d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.util.concurrent.atomic.AtomicLong g;
    private final org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl h;

    public static final class HeaderBlockImpl extends org.chromium.net.UrlResponseInfo.HeaderBlock {
        public final java.util.List a;
        public java.util.Map b;

        public HeaderBlockImpl(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list) {
            this.a = list;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public final java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAsList() {
            return this.a;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAsMap() {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.b;
            if (map != null) {
                return map;
            }
            java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
            for (java.util.Map.Entry entry : this.a) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add((java.lang.String) entry.getValue());
                treeMap.put((java.lang.String) entry.getKey(), j$.util.DesugarCollections.unmodifiableList(arrayList));
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(treeMap);
            this.b = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }
    }

    public UrlResponseInfoImpl(java.util.List<java.lang.String> list, int i, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z, java.lang.String str2, java.lang.String str3, long j, boolean z2) {
        this.d = j$.util.DesugarCollections.unmodifiableList(list);
        this.a = i;
        this.e = str;
        this.h = new org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl(j$.util.DesugarCollections.unmodifiableList(list2));
        this.b = z;
        this.c = str2;
        this.f = str3;
        this.g = new java.util.concurrent.atomic.AtomicLong(j);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAllHeaders() {
        org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl headerBlockImpl = this.h;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = headerBlockImpl.b;
        if (map != null) {
            return map;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry entry : headerBlockImpl.a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((java.lang.String) entry.getValue());
            treeMap.put((java.lang.String) entry.getKey(), j$.util.DesugarCollections.unmodifiableList(arrayList));
        }
        headerBlockImpl.b = j$.util.DesugarCollections.unmodifiableMap(treeMap);
        return headerBlockImpl.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAllHeadersAsList() {
        return this.h.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getHttpStatusText() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getNegotiatedProtocol() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getProxyServer() {
        return this.f;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.g.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getUrl() {
        java.util.List list = this.d;
        return (java.lang.String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.List<java.lang.String> getUrlChain() {
        return this.d;
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        java.util.List list = this.d;
        return java.lang.String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", hexString, (java.lang.String) list.get(list.size() - 1), list.toString(), java.lang.Integer.valueOf(this.a), this.e, getAllHeadersAsList().toString(), java.lang.Boolean.valueOf(this.b), this.c, this.f, java.lang.Long.valueOf(this.g.get()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.b;
    }

    @java.lang.Deprecated
    public UrlResponseInfoImpl(java.util.List<java.lang.String> list, int i, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z, java.lang.String str2, java.lang.String str3, long j) {
        this(list, i, str, list2, z, str2, str3, j, false);
    }

    @java.lang.Deprecated
    public UrlResponseInfoImpl(java.util.List<java.lang.String> list, int i, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z, java.lang.String str2, java.lang.String str3) {
        this(list, i, str, list2, z, str2, str3, 0L, false);
    }
}
