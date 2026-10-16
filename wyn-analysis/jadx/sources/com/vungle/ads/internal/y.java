package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f33892a;

    public y(LinkedBlockingQueue linkedBlockingQueue) {
        this.f33892a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.w
    public final void a() {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to send ");
        sbA.append(this.f33892a.size());
        sbA.append(" metrics");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.f32894b.addAll(this.f33892a);
    }

    @Override // com.vungle.ads.internal.w
    public final void onSuccess() {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sent ");
        sbA.append(this.f33892a.size());
        sbA.append(" metrics");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
    }
}
