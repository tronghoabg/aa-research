package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f6 extends j5 implements m2 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f21560g;

    /* renamed from: h, reason: collision with root package name */
    private final C1666u f21561h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f21562i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21563j;

    public f6(JSONObject jSONObject, C1666u c1666u, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, c1666u, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Starting task for AppLovin ad...");
            }
            this.f21766a.r0().a(new k6(jSONObject, this.f21560g, this, this.f21766a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Starting task for VAST ad...");
            }
            this.f21766a.r0().a(i6.a(jSONObject, this.f21560g, this, this.f21766a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, R8.v.f("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21562i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f21563j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f21766a.g().a(d2.f21353z, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i5) {
        failedToReceiveAdV2(new AppLovinError(i5, ""));
    }

    @Override // com.applovin.impl.m2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21562i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f21563j) {
            return;
        }
        this.f21766a.g().a(d2.f21256A, this.f21561h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayM = AbstractC1593a.m("ads", this.f21560g);
        if (jSONArrayM.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArrayM, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.k(this.f21767b, "No ads were returned from the server");
            }
            o7.a(this.f21561h.e(), this.f21561h.d(), this.f21560g, this.f21766a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public f6(JSONObject jSONObject, C1666u c1666u, boolean z2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1666u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f21560g = jSONObject;
        this.f21561h = c1666u;
        this.f21562i = appLovinAdLoadListener;
        this.f21563j = z2;
    }
}
