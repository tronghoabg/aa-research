package org.chromium.net.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class UrlResponseInfoImpl extends UrlResponseInfo {
    public final int a;
    public final boolean b;
    public final String c;
    private final List d;
    private final String e;
    private final String f;
    private final AtomicLong g;
    private final HeaderBlockImpl h;

    public static final class HeaderBlockImpl extends UrlResponseInfo.HeaderBlock {
        public final List a;
        public Map b;

        public HeaderBlockImpl(List<Map.Entry<String, String>> list) {
            this.a = list;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public final List<Map.Entry<String, String>> getAsList() {
            return this.a;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public final Map<String, List<String>> getAsMap() {
            Map<String, List<String>> map = this.b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry entry : this.a) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add((String) entry.getValue());
                treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(treeMap);
            this.b = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }
    }

    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j, boolean z2) {
        this.d = DesugarCollections.unmodifiableList(list);
        this.a = i;
        this.e = str;
        this.h = new HeaderBlockImpl(DesugarCollections.unmodifiableList(list2));
        this.b = z;
        this.c = str2;
        this.f = str3;
        this.g = new AtomicLong(j);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map<String, List<String>> getAllHeaders() {
        HeaderBlockImpl headerBlockImpl = this.h;
        Map<String, List<String>> map = headerBlockImpl.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : headerBlockImpl.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        headerBlockImpl.b = DesugarCollections.unmodifiableMap(treeMap);
        return headerBlockImpl.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.h.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.f;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.g.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return (String) this.d.get(r1.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<String> getUrlChain() {
        return this.d;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        List list = this.d;
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", hexString, (String) list.get(list.size() - 1), list.toString(), Integer.valueOf(this.a), this.e, getAllHeadersAsList().toString(), Boolean.valueOf(this.b), this.c, this.f, Long.valueOf(this.g.get()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.b;
    }

    @Deprecated
    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this(list, i, str, list2, z, str2, str3, j, false);
    }

    @Deprecated
    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3) {
        this(list, i, str, list2, z, str2, str3, 0L, false);
    }
}
