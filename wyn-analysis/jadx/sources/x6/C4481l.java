package x6;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4481l extends C4470a {

    /* renamed from: e, reason: collision with root package name */
    public final t f47740e;

    public C4481l(int i5, String str, String str2, C4470a c4470a, t tVar) {
        super(i5, str, str2, c4470a);
        this.f47740e = tVar;
    }

    @Override // x6.C4470a
    public final JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        t tVar = this.f47740e;
        if (tVar == null) {
            jSONObjectC.put("Response Info", "null");
            return jSONObjectC;
        }
        jSONObjectC.put("Response Info", tVar.c());
        return jSONObjectC;
    }

    @Override // x6.C4470a
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
