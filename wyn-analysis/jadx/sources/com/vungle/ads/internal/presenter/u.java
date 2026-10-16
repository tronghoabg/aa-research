package com.vungle.ads.internal.presenter;

import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class u implements com.vungle.ads.internal.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f33567b;

    public u(String str, w wVar) {
        this.f33566a = str;
        this.f33567b = wVar;
    }

    @Override // com.vungle.ads.internal.ui.m
    public final void a(boolean z2) {
        if (!z2) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Fail to open ");
            sbA.append(this.f33566a);
            new LinkError(reason, sbA.toString()).setLogEntry$vungle_ads_release(this.f33567b.a()).logErrorNoReturnValue$vungle_ads_release();
        }
        List listB = this.f33567b.f33571c.b("deeplink.click", String.valueOf(z2), null);
        if (listB != null) {
            w wVar = this.f33567b;
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                pVar.f33431i = "deeplink.click";
                pVar.f33432j = wVar.a();
                wVar.b().a(pVar.a(), false);
            }
        }
    }
}
