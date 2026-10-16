package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o6 extends p6 {

    /* renamed from: g, reason: collision with root package name */
    private final c3 f22441g;

    public o6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f22441g = c3Var;
    }

    @Override // com.applovin.impl.r6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f22441g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f22441g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f22441g.e());
        String strL0 = this.f22441g.l0();
        if (!StringUtils.isValidString(strL0)) {
            strL0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL0);
        String strB = this.f22441g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.p6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Reported reward successfully for mediated ad: " + this.f22441g);
        }
    }

    @Override // com.applovin.impl.r6
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.p6
    public o4 h() {
        return this.f22441g.h0();
    }

    @Override // com.applovin.impl.p6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "No reward result was found for mediated ad: " + this.f22441g);
        }
    }

    @Override // com.applovin.impl.r6
    public void a(int i5) {
        super.a(i5);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Failed to report reward for mediated ad: " + this.f22441g + " - error code: " + i5);
        }
        this.f21766a.P().a(d2.f21343t0, this.f22441g);
    }
}
