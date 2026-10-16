package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import ff.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f32961a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.model.b f32962b;

    /* renamed from: c, reason: collision with root package name */
    public final s f32963c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32964d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f32965e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f32966f;

    /* renamed from: g, reason: collision with root package name */
    public final List f32967g;

    /* renamed from: h, reason: collision with root package name */
    public n2 f32968h;

    /* renamed from: i, reason: collision with root package name */
    public n2 f32969i;

    public k(j priority, com.vungle.ads.internal.model.b asset, s sVar, int i5) {
        AbstractC3340k.e(priority, "priority");
        AbstractC3340k.e(asset, "asset");
        this.f32961a = priority;
        this.f32962b = asset;
        this.f32963c = sVar;
        this.f32964d = i5;
        this.f32965e = new AtomicBoolean(false);
        this.f32966f = new AtomicInteger(0);
        this.f32967g = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final com.vungle.ads.internal.model.b a() {
        return this.f32962b;
    }

    public final int b() {
        return this.f32966f.get();
    }

    public final s c() {
        return this.f32963c;
    }

    public final List d() {
        List retryReasons = this.f32967g;
        AbstractC3340k.d(retryReasons, "retryReasons");
        return o.S0(retryReasons);
    }

    public final boolean e() {
        return this.f32965e.get();
    }

    public final void f() {
        if (this.f32969i != null) {
            return;
        }
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.f32969i = n2Var;
        n2Var.e();
    }

    public final void g() {
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.f32968h = n2Var;
        n2Var.e();
    }

    public final void h() throws Throwable {
        n2 n2Var = this.f32969i;
        if (n2Var != null) {
            n2Var.d();
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            s sVar = this.f32963c;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("percentage=");
            sbA.append(this.f32962b.f33117e);
            sbA.append(" url=");
            sbA.append(this.f32962b.f33114b);
            analyticsClient.a(n2Var, sVar, sbA.toString());
        }
    }

    public final void i() throws Throwable {
        n2 n2Var = this.f32968h;
        if (n2Var != null) {
            n2Var.d();
            AnalyticsClient.INSTANCE.a(n2Var, this.f32963c, this.f32962b.f33114b);
        }
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("DownloadRequest{priority=");
        sbA.append(this.f32961a);
        sbA.append(", url='");
        sbA.append(this.f32962b.f33114b);
        sbA.append("', path='");
        sbA.append(this.f32962b.f33115c);
        sbA.append("', cancelled=");
        sbA.append(this.f32965e);
        sbA.append(", retryAttempt=");
        sbA.append(this.f32966f.get());
        sbA.append(", maxRetries=");
        sbA.append(this.f32964d);
        sbA.append(", logEntry=");
        sbA.append(this.f32963c);
        sbA.append('}');
        return sbA.toString();
    }

    public final void a(String reason) {
        AbstractC3340k.e(reason, "reason");
        this.f32967g.add(reason);
    }
}
