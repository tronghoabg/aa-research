package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u6 extends w6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f23342g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f23343h;

    public u6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f23342g = bVar;
        this.f23343h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.r6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f23342g.getAdZone().e());
        String clCode = this.f23342g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.r6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.w6
    public boolean h() {
        return this.f23342g.K0();
    }

    @Override // com.applovin.impl.w6
    public void a(o4 o4Var) {
        this.f23342g.a(o4Var);
        String strB = o4Var.b();
        Map<String, String> mapA = o4Var.a();
        if (strB.equals("accepted")) {
            this.f23343h.userRewardVerified(this.f23342g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f23343h.userOverQuota(this.f23342g, mapA);
        } else if (strB.equals("rejected")) {
            this.f23343h.userRewardRejected(this.f23342g, mapA);
        } else {
            this.f23343h.validationRequestFailed(this.f23342g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.r6
    public void a(int i5) {
        String str;
        super.a(i5);
        if (i5 >= 400 && i5 < 500) {
            this.f23343h.userRewardRejected(this.f23342g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f23343h.validationRequestFailed(this.f23342g, i5);
            str = "network_timeout";
        }
        this.f23342g.a(o4.a(str));
    }
}
