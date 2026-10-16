package x6;

import D6.K0;
import D6.z1;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4478i {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f47737a;

    /* renamed from: b, reason: collision with root package name */
    public final C4470a f47738b;

    public C4478i(z1 z1Var) {
        this.f47737a = z1Var;
        K0 k02 = z1Var.f2551c;
        this.f47738b = k02 == null ? null : k02.V();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        z1 z1Var = this.f47737a;
        jSONObject.put("Adapter", z1Var.f2549a);
        jSONObject.put("Latency", z1Var.f2550b);
        String str = z1Var.f2553e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = z1Var.f2554f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = z1Var.f2555g;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = z1Var.f2556h;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = z1Var.f2552d;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        C4470a c4470a = this.f47738b;
        if (c4470a == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c4470a.c());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
