package com.bytedance.sdk.openadsdk.core.cq.ivm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc {
    public void uef(String str, gzw gzwVar, String str2, Map<String, Object> map) {
        Object obj;
        Object value;
        Object value2;
        if (map != null) {
            try {
                if (!map.isEmpty() && (obj = map.get("label")) != null) {
                    String strValueOf = String.valueOf(obj);
                    if (TextUtils.isEmpty(strValueOf)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    String strEm = gzwVar.em();
                    if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strEm)) {
                        jSONObject.put("log_extra", strEm);
                    } else {
                        JSONObject jSONObject2 = new JSONObject(strEm);
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            if (!"label".equals(entry.getKey()) && (value2 = entry.getValue()) != null) {
                                jSONObject2.put(entry.getKey(), String.valueOf(value2));
                            }
                        }
                        jSONObject.put("log_extra", jSONObject2.toString());
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    if ("sendAdExtra".equals(str)) {
                        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                            if (!"label".equals(entry2.getKey()) && (value = entry2.getValue()) != null) {
                                jSONObject3.put(entry2.getKey(), String.valueOf(value));
                            }
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject3.toString());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(gzwVar.us()));
                    com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, "app_union", str2, strValueOf, Long.parseLong(gzwVar.iou()), 0L, jSONObject, dhk.xs(gzwVar));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
