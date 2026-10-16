package com.applovin.impl;

import com.applovin.impl.C1658q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r6 extends j5 {
    public r6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, C1658q0.e eVar) throws JSONException {
        Map mapC = AbstractC1659r0.c(this.f21766a);
        if (((Boolean) this.f21766a.a(y4.f23610H5)).booleanValue() || ((Boolean) this.f21766a.a(y4.f23556A5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21766a).b(AbstractC1659r0.b(f(), this.f21766a)).a(AbstractC1659r0.a(f(), this.f21766a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f21766a.a(y4.f23678Q5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(v4.a.a(((Integer) this.f21766a.a(y4.f23946y5)).intValue())).a(), this.f21766a, eVar);
        aVar.c(y4.f23899s0);
        aVar.b(y4.f23907t0);
        this.f21766a.r0().a(aVar);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f21766a.x0().e();
        if (((Boolean) this.f21766a.a(y4.f23600G3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f21766a.a(y4.I3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f21766a.u());
        }
        if (((Boolean) this.f21766a.a(y4.f23631K3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f21766a.i0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    public class a extends m6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C1658q0.e f22743m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, C1658q0.e eVar) {
            super(aVar, kVar);
            this.f22743m = eVar;
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            this.f22743m.a(str, jSONObject, i5);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            this.f22743m.a(str, i5, str2, jSONObject);
        }
    }

    public void a(int i5) {
        AbstractC1659r0.a(i5, this.f21766a);
    }
}
