package com.applovin.impl;

import com.applovin.impl.C1658q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class p6 extends r6 {
    public p6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(o4 o4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", o4Var.b());
        Map mapA = o4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.r6
    public int g() {
        return ((Integer) this.f21766a.a(y4.f23832k1)).intValue();
    }

    public abstract o4 h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        o4 o4VarH = h();
        if (o4VarH == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Reporting pending reward: " + o4VarH + "...");
        }
        a(a(o4VarH), new a());
    }

    public class a implements C1658q0.e {
        public a() {
        }

        @Override // com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            p6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            p6.this.a(i5);
        }
    }
}
