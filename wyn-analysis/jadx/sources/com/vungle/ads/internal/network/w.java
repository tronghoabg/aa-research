package com.vungle.ads.internal.network;

import com.vungle.ads.UserAgentError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.n2;
import j1.InterfaceC3073a;

/* loaded from: classes5.dex */
public final class w implements InterfaceC3073a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VungleApiClient f33451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f33452b;

    public w(VungleApiClient vungleApiClient, n2 n2Var) {
        this.f33451a = vungleApiClient;
        this.f33452b = n2Var;
    }

    @Override // j1.InterfaceC3073a
    public final void accept(Object obj) throws Throwable {
        String str;
        String property = (String) obj;
        if ((property == null || property.length() == 0) && ((str = this.f33451a.f33383i) == null || str.length() == 0)) {
            ((com.vungle.ads.internal.platform.c) this.f33451a.f33376b).getClass();
            property = System.getProperty("http.agent");
        }
        if (property == null || property.length() == 0) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", "All UA sources failed, logging USER_AGENT_ERROR");
            new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
        } else {
            this.f33452b.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33452b, (com.vungle.ads.internal.util.s) null, 6);
            this.f33451a.f33383i = property;
        }
    }
}
