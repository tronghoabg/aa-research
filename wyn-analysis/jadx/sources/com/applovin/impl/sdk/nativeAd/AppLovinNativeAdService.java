package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.AbstractC1659r0;
import com.applovin.impl.C1645k;
import com.applovin.impl.e6;
import com.applovin.impl.h6;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y5;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final o logger;
    private final k sdk;

    public AppLovinNativeAdService(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.O();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            o.h(TAG, "Empty ad token");
            t2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        C1645k c1645k = new C1645k(strTrim, this.sdk);
        if (c1645k.c() == C1645k.a.REGULAR) {
            if (o.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + c1645k);
            }
            this.sdk.r0().a((j5) new y5(c1645k, appLovinNativeAdLoadListener, this.sdk), e6.b.CORE);
            return;
        }
        if (c1645k.c() != C1645k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h(TAG, "Invalid token type");
            t2.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectA = c1645k.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1645k.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h(TAG, str2);
            t2.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        AbstractC1659r0.c(jSONObjectA, this.sdk);
        AbstractC1659r0.b(jSONObjectA, this.sdk);
        AbstractC1659r0.a(jSONObjectA, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray()).length() > 0) {
            if (o.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + c1645k);
            }
            this.sdk.r0().a((j5) new h6(jSONObjectA, appLovinNativeAdLoadListener, this.sdk), e6.b.CORE);
            return;
        }
        if (o.a()) {
            this.logger.b(TAG, "No ad returned from the server for token: " + c1645k);
        }
        t2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
