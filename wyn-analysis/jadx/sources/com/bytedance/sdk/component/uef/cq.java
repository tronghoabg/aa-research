package com.bytedance.sdk.component.uef;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cq {
    private final Map<String, Object> uef = new ConcurrentHashMap();

    private cq() {
    }

    public static cq uef() {
        return new cq();
    }

    public String oa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.uef.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public cq uef(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.uef.put(str, obj);
        }
        return this;
    }
}
