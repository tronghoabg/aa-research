package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.AbstractC1668v;
import com.applovin.impl.C1658q0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final C1658q0.e f23515g;

    public x5(C1658q0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f23515g = eVar;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f21766a.a(y4.f23844l5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21766a.j0());
        }
        Map mapF = this.f21766a.A().F();
        map.put("package_name", String.valueOf(mapF.get("package_name")));
        map.put("app_version", String.valueOf(mapF.get("app_version")));
        Map mapM = this.f21766a.A().M();
        map.put("platform", String.valueOf(mapM.get("platform")));
        map.put("os", String.valueOf(mapM.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f21766a.a(y4.f23578D5)).booleanValue() || ((Boolean) this.f21766a.a(y4.f23556A5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21766a).c("POST").b(l3.i(this.f21766a)).a(l3.h(this.f21766a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f21766a.a(r3.f22733y7)).intValue()).a(v4.a.a(((Integer) this.f21766a.a(y4.f23904s5)).intValue())).a(), this.f21766a, d());
        aVar.c(r3.f22725u7);
        aVar.b(r3.f22727v7);
        this.f21766a.r0().a(aVar);
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z2) {
            super(aVar, kVar, z2);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            x5.this.f23515g.a(str, jSONObject, i5);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            x5.this.f23515g.a(str, i5, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", w3.b(this.f21766a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        AbstractC1668v.a aVarF = this.f21766a.A().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapL0 = this.f21766a.l0();
        if (!CollectionUtils.isEmpty(mapL0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapL0));
        }
        return jSONObject;
    }
}
