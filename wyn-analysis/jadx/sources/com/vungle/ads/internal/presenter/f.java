package com.vungle.ads.internal.presenter;

import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class f implements com.vungle.ads.internal.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f33522b;

    public f(String str, r rVar) {
        this.f33521a = str;
        this.f33522b = rVar;
    }

    @Override // com.vungle.ads.internal.ui.m
    public final void a(boolean z2) {
        if (!z2) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Fail to open ");
            sbA.append(this.f33521a);
            new LinkError(reason, sbA.toString()).setLogEntry$vungle_ads_release(this.f33522b.b()).logErrorNoReturnValue$vungle_ads_release();
        }
        List listB = this.f33522b.f33541b.b("deeplink.click", String.valueOf(z2), null);
        if (listB != null) {
            r rVar = this.f33522b;
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                pVar.f33431i = "deeplink.click";
                pVar.f33432j = rVar.b();
                rVar.c().a(pVar.a(), false);
            }
        }
    }
}
