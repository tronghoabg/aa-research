package com.applovin.impl.mediation;

import A.AbstractC0213f;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final y2 f21951a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21952b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21953c;

    /* renamed from: d, reason: collision with root package name */
    private final List f21954d;

    /* renamed from: e, reason: collision with root package name */
    private final long f21955e;

    /* renamed from: f, reason: collision with root package name */
    private final a3 f21956f;

    /* renamed from: g, reason: collision with root package name */
    private final List f21957g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21958h;

    /* renamed from: i, reason: collision with root package name */
    private final String f21959i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j8, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.R(), y2Var.S(), j8, list, y2Var.L(), y2Var.Q(), str, y2Var.O());
    }

    public String getEventId() {
        return this.f21959i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f21955e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f21951a;
    }

    public String getMCode() {
        return this.f21958h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f21952b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f21954d;
    }

    public List<String> getPostbackUrls() {
        return this.f21957g;
    }

    public a3 getRequestParameters() {
        return this.f21956f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f21953c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdWaterfallInfo{name=");
        sb2.append(this.f21952b);
        sb2.append(", testName=");
        sb2.append(this.f21953c);
        sb2.append(", networkResponses=");
        sb2.append(this.f21954d);
        sb2.append(", latencyMillis=");
        return AbstractC0213f.e(sb2, this.f21955e, '}');
    }

    public MaxAdWaterfallInfoImpl(y2 y2Var, String str, String str2, long j8, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f21951a = y2Var;
        this.f21952b = str;
        this.f21953c = str2;
        this.f21955e = j8;
        this.f21954d = list;
        this.f21956f = a3Var;
        this.f21957g = list2;
        this.f21958h = str3;
        this.f21959i = str4;
    }
}
