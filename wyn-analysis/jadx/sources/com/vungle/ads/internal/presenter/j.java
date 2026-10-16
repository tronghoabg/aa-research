package com.vungle.ads.internal.presenter;

import com.vungle.ads.NetworkUnreachable;

/* loaded from: classes5.dex */
public final class j implements com.vungle.ads.internal.network.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f33526a;

    public j(r rVar) {
        this.f33526a = rVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(com.vungle.ads.internal.network.o oVar) {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "send RI success");
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "send RI Failure");
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error RI API calls: ");
        sbA.append(th != null ? th.getLocalizedMessage() : null);
        new NetworkUnreachable(sbA.toString()).setLogEntry$vungle_ads_release(this.f33526a.b()).logErrorNoReturnValue$vungle_ads_release();
    }
}
