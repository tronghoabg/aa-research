package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public class BidirectionalStreamBuilderImpl extends org.chromium.net.ExperimentalBidirectionalStream.Builder {
    private final org.chromium.net.impl.CronetEngineBase a;
    private final java.lang.String b;
    private final org.chromium.net.BidirectionalStream.Callback c;
    private final java.util.concurrent.Executor d;
    private final java.util.ArrayList e = new java.util.ArrayList();
    private java.lang.String f = "POST";
    private int g = 3;
    private boolean h;
    private java.util.Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public BidirectionalStreamBuilderImpl(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, org.chromium.net.impl.CronetEngineBase cronetEngineBase) {
        str.getClass();
        this.b = str;
        callback.getClass();
        this.c = callback;
        executor.getClass();
        this.d = executor;
        cronetEngineBase.getClass();
        this.a = cronetEngineBase;
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        this.e.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder addHeader(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder addRequestAnnotation(java.lang.Object obj) {
        obj.getClass();
        if (this.i == null) {
            this.i = new java.util.ArrayList();
        }
        this.i.add(obj);
        return this;
    }

    public final void b(java.lang.String str) {
        str.getClass();
        this.f = str;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream build() {
        return this.a.b(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setHttpMethod(java.lang.String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.j = true;
        this.k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder addHeader(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.ExperimentalBidirectionalStream.Builder setHttpMethod(java.lang.String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setTrafficStatsTag(int i) {
        setTrafficStatsTag(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder setTrafficStatsUid(int i) {
        setTrafficStatsUid(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder addRequestAnnotation(java.lang.Object obj) {
        addRequestAnnotation(obj);
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder bindToNetwork(long j) {
        return this;
    }
}
