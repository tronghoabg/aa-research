package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uzl {
    private static final yob b = yob.c("com/google/android/libraries/geo/systems/network/cronet/CronetQuicConnectionSettings");
    public final JSONObject a;

    public uzl(ackk ackkVar) throws JSONException {
        JSONObject jSONObject;
        if ((((htm) ackkVar.a()).B().b & 1) != 0) {
            uyi uyiVar = ((htm) ackkVar.a()).B().c;
            String str = (uyiVar == null ? uyi.a : uyiVar).e;
            jSONObject = null;
            if (!str.isEmpty()) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    ((ynz) ((ynz) b.a(uys.a).p(e)).ai(9732)).y("QUIC connection settings in networkParameters is invalid JSON string: %s", str);
                }
            }
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("idle_connection_timeout_seconds", 300);
                jSONObject2.put("migrate_sessions_on_network_change_v2", true);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.has(next)) {
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
            } catch (JSONException e2) {
                ((ynz) ((ynz) ((ynz) b.h()).p(e2)).ai((char) 9731)).u("Failed to create default QUIC settings, using empty");
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.a = jSONObject;
    }
}
