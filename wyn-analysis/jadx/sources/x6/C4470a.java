package x6;

import D6.K0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4470a {

    /* renamed from: a, reason: collision with root package name */
    public final int f47720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47722c;

    /* renamed from: d, reason: collision with root package name */
    public final C4470a f47723d;

    public C4470a(int i5, String str, String str2, C4470a c4470a) {
        this.f47720a = i5;
        this.f47721b = str;
        this.f47722c = str2;
        this.f47723d = c4470a;
    }

    public int a() {
        return this.f47720a;
    }

    public final K0 b() {
        C4470a c4470a = this.f47723d;
        return new K0(this.f47720a, this.f47721b, this.f47722c, c4470a == null ? null : new K0(c4470a.f47720a, c4470a.f47721b, c4470a.f47722c, null, null), null);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f47720a);
        jSONObject.put("Message", this.f47721b);
        jSONObject.put("Domain", this.f47722c);
        C4470a c4470a = this.f47723d;
        if (c4470a == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c4470a.c());
        return jSONObject;
    }

    public String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
