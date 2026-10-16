package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;
import yc.RunnableC4579b;

/* loaded from: classes5.dex */
public final class z2 {
    public static void a(Context context, BidTokenCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(callback, "callback");
        if (com.vungle.ads.internal.util.z.a()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.INSTANCE.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            AbstractC3340k.d(applicationContext, "context.applicationContext");
            privacyManager.a(applicationContext);
        }
        EnumC2526j enumC2526j = EnumC2526j.f34667a;
        ((com.vungle.ads.internal.executor.d) Fe.c.y(enumC2526j, new y2(context)).getValue()).a().execute(new RunnableC4579b(5, callback, Fe.c.y(enumC2526j, new x2(context))));
    }

    public static final void a(BidTokenCallback callback, InterfaceC2525i bidTokenEncoder$delegate) {
        AbstractC3340k.e(callback, "$callback");
        AbstractC3340k.e(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        n2Var.e();
        com.vungle.ads.internal.bidding.b bVarB = ((com.vungle.ads.internal.bidding.e) bidTokenEncoder$delegate.getValue()).b();
        n2Var.d();
        if (bVarB.a().length() > 0) {
            callback.onBidTokenCollected(bVarB.a());
        } else {
            n2Var.a(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            n2Var.a(bVarB.b());
            callback.onBidTokenError(bVarB.b());
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var, (com.vungle.ads.internal.util.s) null, 6);
    }
}
