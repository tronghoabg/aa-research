package com.bytedance.sdk.openadsdk.tpx.uef.uef;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.lw;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.moa.dz;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    public static boolean uef(Context context, String str, gzw gzwVar, int i5, Map<String, Object> map, boolean z2) throws JSONException {
        Map<String, Object> map2 = map;
        String strUef = gb.uef(gzwVar);
        lw.uef(gzwVar, strUef, 1, null);
        Intent intentUef = uef(context, str, gzwVar);
        if (TextUtils.isEmpty(str) || intentUef == null) {
            lw.uef(gzwVar, strUef, -2, gzwVar.agr().moa());
            return false;
        }
        boolean zMoa = gb.moa(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (gzwVar != null && gzwVar.orw() == 0) {
            map3.put("auto_click", Boolean.valueOf(!gzwVar.oib()));
        }
        map3.put("can_query_install", Integer.valueOf(zMoa ? 1 : 0));
        map3.put("url", str);
        if (zMoa) {
            gb.oa oaVarUef = gb.uef(context, intentUef);
            if (oaVarUef.f26148oa <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentUef.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                lw.uef(gzwVar, strUef, -3, jSONObject);
                return false;
            }
            try {
                uef(context, gzwVar, map3);
                map3.put("matched_count", Integer.valueOf(oaVarUef.f26148oa));
                ComponentName componentName = oaVarUef.uef;
                if (componentName != null) {
                    intentUef.setComponent(componentName);
                }
            } catch (Throwable th) {
                dhk.yo("DeepLinkUtils", th.getMessage());
            }
        }
        if (sy.moa().cz()) {
            gb.uef(gzwVar, strUef);
        }
        try {
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, strUef, "open_url_app", map3);
            context.startActivity(intentUef);
            dz.uef().uef(map3).uef(gzwVar, strUef);
            com.bytedance.sdk.openadsdk.moa.yo.uef("dp_start_act_success", gzwVar, strUef, map3);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put("intent", intentUef.toString());
                jSONObject2.put("can_query_install", zMoa ? 1 : 0);
            } catch (Exception unused2) {
            }
            lw.uef(gzwVar, strUef, -4, jSONObject2);
            if (zMoa && !sy.moa().cz()) {
                pu.uef(context, gzwVar.cc(), gzwVar, i5, strUef, z2);
            }
            return false;
        }
    }

    private static Intent uef(Context context, String str, gzw gzwVar) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (gzwVar != null && gzwVar.azx() != null && !TextUtils.isEmpty(gzwVar.azx().moa())) {
                intent.setPackage(gzwVar.azx().moa());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            dhk.yo("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void uef(Context context, gzw gzwVar, Map<String, Object> map) {
        if (gzwVar != null && gzwVar.orw() == 0) {
            map.put("auto_click", Boolean.valueOf(!gzwVar.oib()));
        }
        map.put("can_query_install", Integer.valueOf(gb.moa(context) ? 1 : 0));
    }
}
