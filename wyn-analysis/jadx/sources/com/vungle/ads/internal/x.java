package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f33888a;

    public x(LinkedBlockingQueue linkedBlockingQueue) {
        this.f33888a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.w
    public final void a() {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to send ");
        sbA.append(this.f33888a.size());
        sbA.append(" errors");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.f32893a.addAll(this.f33888a);
    }

    @Override // com.vungle.ads.internal.w
    public final void onSuccess() {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sent ");
        sbA.append(this.f33888a.size());
        sbA.append(" errors");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
    }
}
