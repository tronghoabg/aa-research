package com.applovin.impl;

import android.provider.Settings;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v4;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class k5 extends j5 {
    public k5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) throws JSONException, Settings.SettingNotFoundException {
        com.applovin.impl.sdk.l lVarA = this.f21766a.A();
        Map mapP = lVarA.p();
        o7.a("platform", "type", mapP);
        o7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapF = lVarA.F();
        o7.a("sdk_version", "applovin_sdk_version", mapF);
        o7.a("ia", "installed_at", mapF);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapF));
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException, Settings.SettingNotFoundException {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.d(this.f21767b, "Submitting user data...");
        }
        Map mapC = AbstractC1659r0.c(this.f21766a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f21766a.a(y4.f23602G5)).booleanValue() || ((Boolean) this.f21766a.a(y4.f23556A5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            k5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            AbstractC1659r0.a(i5, this.f21766a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(AbstractC1593a.m("results", jSONObject), 0, new JSONObject());
        this.f21766a.p0().a(y4.f23788f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f21766a.p0().a(y4.f23822j, JsonUtils.getString(jSONObject2, "device_token", ""));
        AbstractC1659r0.a(jSONObject2, this.f21766a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21766a).b(AbstractC1659r0.b("2.0/device", this.f21766a)).a(AbstractC1659r0.a("2.0/device", this.f21766a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f21766a.a(y4.f23655N5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f21766a.a(y4.f23784e3)).intValue()).a(v4.a.a(((Integer) this.f21766a.a(y4.x5)).intValue())).a(), this.f21766a);
        aVar.c(y4.f23899s0);
        aVar.b(y4.f23907t0);
        this.f21766a.r0().a(aVar);
    }
}
