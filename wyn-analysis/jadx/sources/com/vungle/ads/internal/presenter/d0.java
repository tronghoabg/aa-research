package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class d0 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f33511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f33512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.internal.load.e f33513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f33514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f33515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f33516g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f33517h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, h0 h0Var, i3 i3Var, com.vungle.ads.internal.load.e eVar, Long l10, String str, String str2, f0 f0Var) {
        super(0);
        this.f33510a = context;
        this.f33511b = h0Var;
        this.f33512c = i3Var;
        this.f33513d = eVar;
        this.f33514e = l10;
        this.f33515f = str;
        this.f33516g = str2;
        this.f33517h = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    @Override // tf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() throws java.lang.Throwable {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "WebViewManager"
            java.lang.String r0 = "Preload complete. Cache size: "
            java.util.concurrent.locks.ReentrantLock r3 = com.vungle.ads.internal.presenter.e0.f33519a
            android.content.Context r3 = r1.f33510a
            com.vungle.ads.internal.model.h0 r5 = r1.f33511b
            com.vungle.ads.internal.model.i3 r6 = r1.f33512c
            com.vungle.ads.internal.load.e r9 = r1.f33513d
            java.lang.Long r10 = r1.f33514e
            java.lang.String r11 = r1.f33515f
            java.lang.String r12 = r1.f33516g
            com.vungle.ads.internal.model.f0 r4 = r1.f33517h
            android.webkit.WebView r13 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L6f
            android.content.Context r7 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L6f
            r13.<init>(r7)     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.platform.g.a(r13, r4)     // Catch: java.lang.Throwable -> L6f
            ef.j r4 = ef.EnumC2526j.f34667a     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.presenter.b0 r7 = new com.vungle.ads.internal.presenter.b0     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L6f
            ef.i r7 = Fe.c.y(r4, r7)     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.presenter.c0 r8 = new com.vungle.ads.internal.presenter.c0     // Catch: java.lang.Throwable -> L6f
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L6f
            ef.i r3 = Fe.c.y(r4, r8)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r7.getValue()     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.executor.a r4 = (com.vungle.ads.internal.executor.a) r4     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.executor.d r4 = (com.vungle.ads.internal.executor.d) r4     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.executor.j r7 = r4.f()     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.ui.z r4 = new com.vungle.ads.internal.ui.z     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6f
            r8 = r3
            com.vungle.ads.internal.platform.f r8 = (com.vungle.ads.internal.platform.f) r8     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.ConfigManager r3 = com.vungle.ads.internal.ConfigManager.INSTANCE     // Catch: java.lang.Throwable -> L6f
            r3.getClass()     // Catch: java.lang.Throwable -> L6f
            boolean r3 = com.vungle.ads.internal.ConfigManager.k()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L71
            java.lang.String r3 = "unknown"
            com.vungle.ads.internal.privacy.PrivacyManager r6 = com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE     // Catch: java.lang.Throwable -> L6f
            r6.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = com.vungle.ads.internal.privacy.PrivacyManager.b()     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L71
            r3 = 1
        L6d:
            r15 = r3
            goto L73
        L6f:
            r0 = move-exception
            goto Ld7
        L71:
            r3 = 0
            goto L6d
        L73:
            java.lang.String r16 = com.vungle.ads.internal.ConfigManager.j()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r17 = com.vungle.ads.internal.ConfigManager.i()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r18 = com.vungle.ads.internal.ConfigManager.g()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r19 = com.vungle.ads.internal.ConfigManager.h()     // Catch: java.lang.Throwable -> L6f
            r14 = r4
            r14.a(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L6f
            r4 = r14
            r13.setWebViewClient(r4)     // Catch: java.lang.Throwable -> L6f
            r13.loadUrl(r11)     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap r3 = com.vungle.ads.internal.presenter.e0.a()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.presenter.a0 r7 = new com.vungle.ads.internal.presenter.a0     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r4, r13)     // Catch: java.lang.Throwable -> L6f
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.AnalyticsClient r14 = com.vungle.ads.internal.AnalyticsClient.INSTANCE     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.protos.Sdk$SDKMetric$SDKMetricType r15 = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap r3 = com.vungle.ads.internal.presenter.e0.a()     // Catch: java.lang.Throwable -> L6f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L6f
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L6f
            com.vungle.ads.internal.util.s r18 = r5.q()     // Catch: java.lang.Throwable -> L6f
            r19 = 0
            r20 = 8
            r16 = r3
            com.vungle.ads.internal.AnalyticsClient.a(r14, r15, r16, r18, r19, r20)     // Catch: java.lang.Throwable -> L6f
            boolean r3 = com.vungle.ads.internal.util.u.f33874a     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap r0 = com.vungle.ads.internal.presenter.e0.a()     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L6f
            r3.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            int r0 = com.vungle.ads.internal.util.t.a(r2, r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6f
            goto Ldb
        Ld7:
            ef.m r0 = Fe.e.z(r0)
        Ldb:
            com.vungle.ads.internal.load.e r3 = r1.f33513d
            java.lang.Throwable r0 = ef.C2530n.a(r0)
            if (r0 == 0) goto Led
            boolean r4 = com.vungle.ads.internal.util.u.f33874a
            java.lang.String r4 = "Preload webview failed"
            com.vungle.ads.internal.util.t.a(r2, r4, r0)
            r3.b()
        Led:
            ef.C r0 = ef.C2515C.f34653a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.d0.invoke():java.lang.Object");
    }
}
