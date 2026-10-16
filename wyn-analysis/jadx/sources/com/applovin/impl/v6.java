package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v6 extends w6 {

    /* renamed from: g, reason: collision with root package name */
    private final c3 f23406g;

    public v6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f23406g = c3Var;
    }

    @Override // com.applovin.impl.r6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f23406g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f23406g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f23406g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f23406g.getFormat().getLabel());
        String strL0 = this.f23406g.l0();
        if (!StringUtils.isValidString(strL0)) {
            strL0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL0);
        String strB = this.f23406g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.r6
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.w6
    public boolean h() {
        return this.f23406g.p0();
    }

    @Override // com.applovin.impl.w6
    public void a(o4 o4Var) {
        this.f23406g.a(o4Var);
    }

    @Override // com.applovin.impl.r6
    public void a(int i5) {
        String str;
        super.a(i5);
        if (i5 >= 400 && i5 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f23406g.a(o4.a(str));
        this.f21766a.P().a(d2.f21345u0, this.f23406g, CollectionUtils.hashMap("error_message", str));
    }
}
