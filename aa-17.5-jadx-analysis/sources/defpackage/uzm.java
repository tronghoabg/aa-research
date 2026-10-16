package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uzm {
    private static final yob b = yob.c("com/google/android/libraries/geo/systems/network/cronet/CronetStaleDnsSettings");
    public final JSONObject a;

    public uzm(ackk ackkVar) {
        JSONObject jSONObject;
        if ((((htm) ackkVar.a()).B().b & 1) != 0) {
            uyi uyiVar = ((htm) ackkVar.a()).B().c;
            String str = (uyiVar == null ? uyi.a : uyiVar).f;
            if (str.isEmpty()) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    ((ynz) ((ynz) b.a(uys.a).p(e)).ai(9733)).y("Cronet StaleDNS settings in NetworkParameters is invalid JSON string: %s", str);
                }
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.a = jSONObject;
    }
}
