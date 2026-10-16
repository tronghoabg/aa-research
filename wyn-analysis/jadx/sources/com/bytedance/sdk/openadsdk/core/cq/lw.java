package com.bytedance.sdk.openadsdk.core.cq;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.unity3d.services.core.di.ServiceProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {
    private static String uef = "";

    public static boolean oa(gzw gzwVar) {
        return gzwVar != null && gzwVar.ix() == 10;
    }

    public static boolean uef(int i5) {
        return i5 == 10 || i5 == 9 || i5 == 11;
    }

    private static JSONArray yo(gzw gzwVar) {
        try {
            gzw.uef uefVarVep = gzwVar.vep();
            if (uefVarVep == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(uefVarVep.cz());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", gzwVar.kik());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i5);
                        jSONObject3.put("button_text", gzwVar.kik());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static JSONObject uef(gzw gzwVar, String str) throws JSONException {
        JSONObject jSONObjectCq = gzwVar.cq(false);
        try {
            jSONObjectCq.put("show_dislike", gzwVar.lox());
            jSONObjectCq.put("language", cq.oa());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strBcc = zjm.oa().bcc();
                int iCz = zjm.oa().cz();
                jSONObject.put("app_name", strBcc);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iCz)));
                jSONObjectCq.put("open_app_info", jSONObject);
            }
            jSONObjectCq.put("os", "Android");
            JSONArray jSONArrayYo = yo(gzwVar);
            if (jSONArrayYo != null) {
                jSONObjectCq.put("dpa_data", jSONArrayYo);
                return jSONObjectCq;
            }
        } catch (Throwable th) {
            dhk.yo("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
        }
        return jSONObjectCq;
    }

    public static boolean uef(gzw gzwVar) {
        return gzwVar != null && gzwVar.ix() == 7;
    }

    public static String uef() {
        return uef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject uef(gzw gzwVar, com.bytedance.sdk.openadsdk.core.cq.xs.yo yoVar) {
        gzw.uef uefVarVep;
        JSONObject jSONObject;
        yoVar.uef("ad");
        String strWk = "";
        uef = "";
        ?? r42 = 0;
        try {
            uefVarVep = gzwVar.vep();
            if (uefVarVep != null) {
                strWk = uefVarVep.wk();
                if (TextUtils.isEmpty(strWk) && !TextUtils.isEmpty(uefVarVep.dz()) && !TextUtils.isEmpty(uefVarVep.moa())) {
                    strWk = com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef("ad", uefVarVep.moa(), uefVarVep.dz());
                }
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!TextUtils.isEmpty(strWk)) {
                try {
                    jSONObject = new JSONObject(strWk);
                } catch (JSONException unused) {
                }
                try {
                    uef = "getTemplate success";
                    yoVar.oa(ServiceProvider.NAMED_LOCAL);
                    return jSONObject;
                } catch (JSONException unused2) {
                    String strConcat = "parse json exception data is ".concat(String.valueOf(strWk));
                    uef = strConcat;
                    yoVar.uef(2, strConcat, ServiceProvider.NAMED_LOCAL);
                    return null;
                }
            }
            String str = "local data is null id is " + uefVarVep.moa() + " md5 is " + uefVarVep.dz();
            uef = str;
            yoVar.uef(3, str, "net");
            return null;
        } catch (Throwable th2) {
            r42 = uefVarVep;
            th = th2;
            String str2 = "get template error " + th.getMessage();
            uef = str2;
            yoVar.uef(2, str2, ServiceProvider.NAMED_LOCAL);
            return r42;
        }
    }
}
