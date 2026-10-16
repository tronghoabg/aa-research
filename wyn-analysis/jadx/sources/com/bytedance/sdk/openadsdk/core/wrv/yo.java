package com.bytedance.sdk.openadsdk.core.wrv;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.lw;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private static boolean uef = false;

    public static String ivm() {
        if (sy.moa().zou()) {
            return oa.oa().moa();
        }
        return null;
    }

    public static int lw() {
        if (sy.moa().zou()) {
            return oa.oa().xs();
        }
        return 6;
    }

    public static long moa() {
        if (sy.moa().zou()) {
            return oa.oa().ivm();
        }
        return 0L;
    }

    public static void oa(String str) {
        if (TextUtils.isEmpty(str) || !sy.moa().zou()) {
            return;
        }
        oa.oa().oa(str);
    }

    public static void uef() {
        if (!uef && sy.moa().zou()) {
            oa.oa();
            uef = oa.oa().yo();
        }
    }

    public static String yo() {
        return sy.moa().zou() ? oa.oa().lw() : "";
    }

    public static void oa() {
        if (sy.moa().zou()) {
            oa.oa().uef();
        }
    }

    public static void uef(String str) {
        if (sy.moa().zou()) {
            oa.oa().uef(str);
        }
    }

    public static void uef(Map<String, Object> map) {
        if (sy.moa().zou()) {
            oa.oa().uef(map);
        }
    }

    public static void uef(gzw gzwVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (sy.moa().zou()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (gzwVar != null) {
                String strOfp = gzwVar.ofp();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strOfp)) {
                    map.put("request_id", strOfp);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j8 = -1;
                    if (gzwVar.zec() != null) {
                        jOptLong = gzwVar.zec().optLong("ad_id", -1L);
                        jOptLong2 = gzwVar.zec().optLong("rit", -1L);
                        jOptLong3 = gzwVar.zec().optLong("ad_slot_type", -1L);
                        strOptString = gzwVar.zec().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapHjx = gzwVar.hjx();
                    if (mapHjx != null && (obj = mapHjx.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j8 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j8));
                    oa.oa().uef(PglSSManager.REPORT_SCENE_ADSHOW, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> uef(String str, String str2) {
        if (sy.moa().zou()) {
            return oa.oa().uef(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void uef(MotionEvent motionEvent) {
        if (sy.moa().zou()) {
            oa.oa().uef(motionEvent);
        }
    }

    public static void uef(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            if (sy.moa().zou()) {
                uef();
                if (lw() == 0) {
                    jSONObject.put("sec_did", oa.oa().moa());
                    String strUef = lw.uef(jSONObject.toString());
                    Map<String, String> mapUef = oa.oa().uef("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strUef != null ? strUef.getBytes() : new byte[0]);
                    if (mapUef != null && mapUef.size() > 0) {
                        for (String str : mapUef.keySet()) {
                            jSONObject.put(str, mapUef.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strUef);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", oa.oa().ivm());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(lw()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            dhk.yo("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
