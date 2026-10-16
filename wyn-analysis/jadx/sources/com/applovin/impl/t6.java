package com.applovin.impl;

import com.applovin.impl.AbstractC1668v;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final p2 f23299g;

    /* renamed from: h, reason: collision with root package name */
    private final Exception f23300h;

    public t6(com.applovin.impl.sdk.k kVar, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", kVar);
        this.f23299g = p2Var;
        this.f23300h = exc;
    }

    private String e() {
        return AbstractC1659r0.a((String) this.f21766a.a(y4.f23551A0), (String) this.f21766a.a(y4.B0), this.f21766a);
    }

    private JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AbstractC1668v.a aVarF = this.f21766a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f21766a.a(y4.f23576D3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        l.b bVarG = this.f21766a.A().G();
        if (((Boolean) this.f21766a.a(y4.f23584E3)).booleanValue() && bVarG != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarG.f23088a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarG.f23089b);
        }
        String strE = this.f21766a.x0().e();
        if (((Boolean) this.f21766a.a(y4.f23592F3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f21766a.a(y4.I3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f21766a.u());
        }
        if (((Boolean) this.f21766a.a(y4.f23631K3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f21766a.i0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f21766a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.f23299g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f23299g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f23299g.c());
            JsonUtils.putInt(jSONObject2, "n", this.f23299g.b());
        }
        Exception exc = this.f23300h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return AbstractC1659r0.a((String) this.f21766a.a(y4.f23949z0), (String) this.f21766a.a(y4.B0), this.f21766a);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21766a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f21766a.a(y4.f23686R5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f21766a.a(y4.f23944y3)).intValue()).a(v4.a.a(((Integer) this.f21766a.a(y4.f23953z5)).intValue())).a(), this.f21766a);
        aVar.c(y4.f23949z0);
        aVar.b(y4.f23551A0);
        this.f21766a.r0().a(aVar);
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "License Validation successful");
            }
            b5.b(a5.f20956i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i5));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f21766a.w0().d(d2.k, map);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Failed to validate license: ");
            }
            if (!this.f21766a.c(y4.f23550A).contains(String.valueOf(i5))) {
                b5.b(a5.f20956i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i5));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f21766a.w0().d(d2.f21326l, map);
        }
    }
}
