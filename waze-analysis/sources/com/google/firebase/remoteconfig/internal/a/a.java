package com.google.firebase.remoteconfig.internal.a;

import android.util.Log;
import com.google.firebase.remoteconfig.a.a.d;
import com.google.firebase.remoteconfig.a.a.e;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.h;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final f f10639a;

    /* renamed from: b, reason: collision with root package name */
    final f f10640b;

    a(f fVar, f fVar2) {
        this.f10639a = fVar;
        this.f10640b = fVar2;
    }

    public static a a(f fVar, f fVar2) {
        return new a(fVar, fVar2);
    }

    private static String c(f fVar, String str) {
        h hVarD = fVar.d();
        if (hVarD == null) {
            return null;
        }
        try {
            return hVarD.h().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    final com.google.firebase.remoteconfig.a.a.f b(h hVar) throws JSONException, com.google.firebase.remoteconfig.c {
        JSONArray jSONArrayG = hVar.g();
        long jA = hVar.a();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArrayG.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArrayG.getJSONObject(i2);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                String strC = c(this.f10639a, strOptString);
                if (strC == null && (strC = c(this.f10640b, strOptString)) == null) {
                    strC = "";
                }
                int i3 = e.f10600a;
                d dVar = new d();
                dVar.d(string);
                dVar.f(jSONObject.getString("variantId"));
                dVar.b(strOptString);
                dVar.c(strC);
                dVar.e(jA);
                hashSet.add(dVar.a());
            } catch (JSONException e2) {
                throw new com.google.firebase.remoteconfig.c("Exception parsing rollouts metadata to create RolloutsState.", e2);
            }
        }
        return com.google.firebase.remoteconfig.a.a.f.a(hashSet);
    }
}
