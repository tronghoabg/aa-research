package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.moa.oa;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oib {
    public static void uef(Context context, boolean z2, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, int i5, WebView webView, com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString("title", "");
        boolean z10 = false;
        boolean z11 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.ab.uef.oa oaVar = new com.bytedance.sdk.openadsdk.ab.uef.oa();
            oaVar.uef(oa.uef.f25971oa);
            oaVar.uef(gzwVar);
            oaVar.oa(str);
            oaVar.uef(-1);
            oaVar.uef(false);
            oaVar.oa(gzwVar.ykf());
            com.bytedance.sdk.openadsdk.moa.yo.uef(oaVar);
            com.bytedance.sdk.openadsdk.utils.gsd.uef(context, strOptString, gzwVar, oa.uef.f25971oa, true);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    dhk dhkVar = new dhk(gzwVar);
                    dhkVar.uef(strOptString3);
                    dhkVar.uef(z11);
                    pu.uef(context, strOptString, gzwVar, i5, str, false, dhkVar);
                }
                if (lwVar == null && z10) {
                    lwVar.uef();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.gsd.uef(context, strOptString, gzwVar, str)) {
                com.bytedance.sdk.openadsdk.ab.uef.oa oaVar2 = new com.bytedance.sdk.openadsdk.ab.uef.oa();
                oaVar2.uef(oa.uef.f25971oa);
                oaVar2.uef(gzwVar);
                oaVar2.oa(str);
                oaVar2.uef(-1);
                oaVar2.uef(false);
                oaVar2.oa(gzwVar.ykf());
                com.bytedance.sdk.openadsdk.moa.yo.uef(oaVar2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.gsd.uef(context, strOptString2, gzwVar, oa.uef.f25971oa, true);
            }
        }
        z10 = true;
        if (lwVar == null) {
        }
    }
}
