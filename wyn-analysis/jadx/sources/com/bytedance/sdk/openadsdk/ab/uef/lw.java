package com.bytedance.sdk.openadsdk.ab.uef;

import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {
    public static void oa(final String str, final String str2, final int i5, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.ab.moa.uef(str, false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.ab.uef.lw.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                String str5 = str2;
                String string = "";
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("url", str5);
                String str6 = str4;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("web_sence", str6);
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    string = new JSONArray((Collection) list).toString();
                }
                jSONObject.put("back_up_url", string);
                jSONObject.put("error_code", i5);
                jSONObject.put("error_msg", str3);
                return moa.oa().uef(str).oa(jSONObject.toString());
            }
        });
    }

    public static void uef(final String str, final String str2, final int i5, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.ab.moa.uef(str, false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.ab.uef.lw.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("error_url", str4);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put("error_code", i5);
                jSONObject.put("error_msg", str3);
                return moa.oa().uef(str).oa(jSONObject.toString());
            }
        });
    }
}
