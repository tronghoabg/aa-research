package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidHeaderBlockWrapper extends org.chromium.net.UrlResponseInfo.HeaderBlock {
    private final android.net.http.HeaderBlock a;

    public AndroidHeaderBlockWrapper(android.net.http.HeaderBlock headerBlock) {
        this.a = headerBlock;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAsList() {
        return this.a.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAsMap() {
        return this.a.getAsMap();
    }
}
