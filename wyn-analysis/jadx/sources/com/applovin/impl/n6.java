package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n6 extends p6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f22336g;

    public n6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f22336g = bVar;
    }

    @Override // com.applovin.impl.r6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f22336g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f22336g.P());
        String clCode = this.f22336g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.p6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Reported reward successfully for ad: " + this.f22336g);
        }
    }

    @Override // com.applovin.impl.r6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.p6
    public o4 h() {
        return this.f22336g.i();
    }

    @Override // com.applovin.impl.p6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "No reward result was found for ad: " + this.f22336g);
        }
    }

    @Override // com.applovin.impl.r6
    public void a(int i5) {
        super.a(i5);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Failed to report reward for ad: " + this.f22336g + " - error code: " + i5);
        }
        this.f21766a.g().a(d2.f21267G, this.f22336g);
    }
}
