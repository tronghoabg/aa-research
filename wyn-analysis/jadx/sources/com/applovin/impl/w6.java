package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.C1658q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w6 extends r6 {
    public w6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private o4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(AbstractC1593a.m("results", jSONObject), 0, new JSONObject());
        AbstractC1659r0.c(jSONObject2, this.f21766a);
        AbstractC1659r0.b(jSONObject, this.f21766a);
        AbstractC1659r0.a(jSONObject, this.f21766a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return o4.a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        o4 o4VarB = b(jSONObject);
        a(o4VarB);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Pending reward handled: " + o4VarB);
        }
    }

    public abstract void a(o4 o4Var);

    @Override // com.applovin.impl.r6
    public int g() {
        return ((Integer) this.f21766a.a(y4.f23824j1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        a(e(), new a());
    }

    public class a implements C1658q0.e {
        public a() {
        }

        @Override // com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            if (w6.this.h()) {
                com.applovin.impl.sdk.o oVar = w6.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    w6 w6Var = w6.this;
                    w6Var.f21768c.b(w6Var.f21767b, "Reward validation succeeded with code " + i5 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = w6.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    w6 w6Var2 = w6.this;
                    w6Var2.f21768c.b(w6Var2.f21767b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = w6.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                w6 w6Var3 = w6.this;
                w6Var3.f21768c.a(w6Var3.f21767b, "Reward validation succeeded with code " + i5 + " and response: " + jSONObject);
            }
            w6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            if (w6.this.h()) {
                com.applovin.impl.sdk.o oVar = w6.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    w6 w6Var = w6.this;
                    w6Var.f21768c.b(w6Var.f21767b, "Reward validation failed with error code " + i5 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = w6.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                w6 w6Var2 = w6.this;
                w6Var2.f21768c.b(w6Var2.f21767b, "Reward validation failed with code " + i5 + " and error: " + str2);
            }
            w6.this.a(i5);
        }
    }
}
