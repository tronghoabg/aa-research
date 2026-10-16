package com.bytedance.sdk.openadsdk.moa;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pz;
import com.bytedance.sdk.openadsdk.moa.oa;
import com.bytedance.sdk.openadsdk.moa.uef;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.pu;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.Office;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    public static void ivm(gzw gzwVar, String str, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.47
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                return jSONObject;
            }
        });
    }

    public static void lw(gzw gzwVar, final com.bytedance.sdk.openadsdk.ab.uef.uef uefVar, final String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.30
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                try {
                    com.bytedance.sdk.openadsdk.ab.uef.uef uefVar2 = uefVar;
                    if (uefVar2 == null || uefVar2.uef() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", uefVar.uef());
                    jSONObject.put("hit_extra", uefVar.oa());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", uefVar.yo());
                    jSONObject.put("current_url_index", uefVar.moa());
                    jSONObject.put("arbi_start_x", uefVar.lw());
                    jSONObject.put("arbi_start_y", uefVar.ivm());
                    jSONObject.put("click_duration", uefVar.xs());
                    jSONObject.put("is_trigger_jump", uefVar.bcc());
                    jSONObject.put("click_type", String.valueOf(uefVar.oib()));
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void moa(final gzw gzwVar, final String str, final int i5) {
        uef(System.currentTimeMillis(), gzwVar, str, "material_status", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.13
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i5);
                    jSONObject.put("image_mode", gzwVar.hw());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject oa(gzw gzwVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cp.oa(gzwVar) && gzwVar.geh()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        uef(jSONObject);
        oa(jSONObject);
        return jSONObject;
    }

    public static void yo(gzw gzwVar, String str, final long j8) {
        uef(System.currentTimeMillis(), gzwVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.6
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (Throwable th) {
                    th.getMessage();
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void lw(gzw gzwVar, String str, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.46
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                return jSONObject;
            }
        });
    }

    public static void moa(gzw gzwVar, final com.bytedance.sdk.openadsdk.ab.uef.uef uefVar, final String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.29
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", uefVar.yo());
                    jSONObject.put("current_url_index", uefVar.moa());
                    jSONObject.put("trigger_scroll_x", uefVar.cz());
                    jSONObject.put("trigger_scroll_y", uefVar.zjm());
                    jSONObject.put("arbi_offset_y", uefVar.dj());
                    jSONObject.put("scroll_type", uefVar.wrv());
                    jSONObject.put("scroll_duration", uefVar.cq());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void uef() throws ClassNotFoundException {
        try {
            Class.forName(yo.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void yo(gzw gzwVar, String str, int i5) {
        uef(gzwVar, str, i5, (String) null);
    }

    public static class uef {
        public static void uef(String str, final JSONObject jSONObject, gzw gzwVar) {
            String strUef = gb.uef(gzwVar);
            if (strUef == null) {
                return;
            }
            yo.uef(System.currentTimeMillis(), gzwVar, strUef.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.uef.1
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    return jSONObject;
                }
            });
        }

        public static void uef(final int i5, final int i10, gzw gzwVar) {
            String strUef = gb.uef(gzwVar);
            if (strUef == null) {
                return;
            }
            yo.uef(System.currentTimeMillis(), gzwVar, strUef.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.uef.2
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i10);
                        jSONObject.put("hit_times", i5);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void uef(final long j8, final gzw gzwVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            yo.uef(System.currentTimeMillis(), gzwVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.uef.3
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject oa() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", j8);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject uef() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(gzw.f25679oa, gzwVar.dy() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(iLoader, str2);
                        jSONObject.put("url", gzwVar.cc());
                        jSONObject.put("channel_name", gzwVar.vup());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(gzwVar.vup()) || iUef <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iUef);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void uef(final int i5, final int i10, final int i11, final int i12, final gzw gzwVar, String str, final int i13) {
            if (str == null || TextUtils.isEmpty(gzwVar.vup())) {
                return;
            }
            yo.uef(System.currentTimeMillis(), gzwVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.uef.4
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", gzwVar.cc());
                        jSONObject.put("channel_name", gzwVar.vup());
                        jSONObject.put("preload_status", i5 <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i13);
                        jSONObject.put("preload_h5_type", gzwVar.gb());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i5);
                        jSONObject2.put("failResourceCount", i10);
                        jSONObject2.put("successCount", i11);
                        jSONObject2.put("failCount", i12);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void moa(gzw gzwVar, String str, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.45
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, String str, final int i5) {
        uef(System.currentTimeMillis(), gzwVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i5));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void yo(final gzw gzwVar, String str) {
        if (gzwVar == null || !gzw.yo(gzwVar) || gzwVar.km() == null) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, "endcard_show", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.25
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", gzwVar.km().yo());
                    jSONObject.putOpt("id", gzwVar.km().uef());
                    jSONObject.putOpt("md5", gzwVar.km().oa());
                    if (gzwVar.nj() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(gzwVar.nj().moa()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(final gzw gzwVar, String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.12
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (gzw.yo(gzwVar)) {
                        if (gzwVar.km() != null) {
                            jSONObject.putOpt("url", gzwVar.km().yo());
                            jSONObject.putOpt("id", gzwVar.km().uef());
                            jSONObject.putOpt("md5", gzwVar.km().oa());
                        }
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", gzwVar.nj().wrv());
                        jSONObject.putOpt("style_id", gzwVar.lz());
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void uef(final gzw gzwVar, String str, final long j8) {
        uef(System.currentTimeMillis(), gzwVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.23
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (gzw.yo(gzwVar)) {
                        if (gzwVar.km() != null) {
                            jSONObject.putOpt("url", gzwVar.km().yo());
                            jSONObject.putOpt("id", gzwVar.km().uef());
                            jSONObject.putOpt("md5", gzwVar.km().oa());
                        }
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", gzwVar.nj().wrv());
                        jSONObject.putOpt("style_id", gzwVar.lz());
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void yo(gzw gzwVar, final com.bytedance.sdk.openadsdk.ab.uef.uef uefVar, final String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.28
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", uefVar.yo());
                    jSONObject.put("current_url_index", uefVar.moa());
                    jSONObject.put("arbi_stay_duration", uefVar.dz());
                    jSONObject.put("browsing_percentage", uefVar.wk());
                    jSONObject.put("out_focus_scene", uefVar.ab());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void uef(final gzw gzwVar, String str, final long j8, final int i5, final String str2, final String str3) {
        uef(System.currentTimeMillis(), gzwVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.33
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (gzw.yo(gzwVar)) {
                        if (gzwVar.km() != null) {
                            jSONObject.putOpt("url", gzwVar.km().yo());
                            jSONObject.putOpt("id", gzwVar.km().uef());
                            jSONObject.putOpt("md5", gzwVar.km().oa());
                        }
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", gzwVar.nj().wrv());
                        jSONObject.putOpt("style_id", gzwVar.lz());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i5);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e7) {
                    e7.getMessage();
                    return jSONObject;
                }
            }
        });
    }

    public static void yo(gzw gzwVar, String str, String str2, final JSONObject jSONObject) {
        if (gzwVar == null || jSONObject == null) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.35
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                return jSONObject;
            }
        });
    }

    private static void oa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectUef = bcc.uef();
            if (jSONObjectUef != null) {
                Iterator<String> itKeys = jSONObjectUef.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectUef.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void uef(final gzw gzwVar, String str, final long j8, final int i5, final int i10) {
        uef(System.currentTimeMillis(), gzwVar, str, "load", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.44
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Math.min(j8, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(gzwVar.hg()));
                    jSONObject.put("first_page", i10);
                    jSONObject.put("preload_h5_type", gzwVar.gb());
                    int i11 = i5;
                    if (i11 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i11));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void yo(gzw gzwVar, String str, JSONObject jSONObject) {
        if (gzwVar == null) {
            return;
        }
        uef(gzwVar, str, -1L, jSONObject, (JSONObject) null);
    }

    public static void uef(String str, gzw gzwVar, String str2, final Map<String, Object> map) {
        uef(System.currentTimeMillis(), gzwVar, str2, str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.48
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @DungeonFlag
    public static void uef(gzw gzwVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        uef(gzwVar, "show", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    private static void uef(final gzw gzwVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (gzwVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (gzwVar.swd() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            gzwVar.zjm(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        uef(new com.bytedance.sdk.component.bcc.oa.yo("onShow") { // from class: com.bytedance.sdk.openadsdk.moa.yo.49
            @Override // java.lang.Runnable
            public void run() {
                final String strUef;
                if (com.bytedance.sdk.openadsdk.core.sy.moa().oib()) {
                    strUef = com.bytedance.sdk.openadsdk.core.wrv.uef.uef.uef((Application) com.bytedance.sdk.openadsdk.core.sy.uef()).uef(str2, DeviceUtils.uef(), gzwVar.jnk());
                } else {
                    strUef = "none";
                }
                yo.uef(jCurrentTimeMillis, gzwVar, str2, str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.49.1
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject oa() throws JSONException {
                        Object obj;
                        Object obj2;
                        try {
                            pz.oa(gzwVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", gzwVar.em());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - gzwVar.jn()).floatValue();
                                if (fFloatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                long jElapsedRealtime = SystemClock.elapsedRealtime() - gzwVar.cz();
                                if (jElapsedRealtime > 0) {
                                    jSONObject3.put("duration", jElapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(gzwVar.us()));
                                String strDh = gzwVar.dh();
                                if (!TextUtils.isEmpty(strDh) && !TextUtils.isEmpty(strDh)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strDh) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        th.getMessage();
                                    }
                                }
                                if (gzwVar.hjx() == null || (obj = gzwVar.hjx().get(TTAdConstant.SDK_BIDDING_TYPE)) == null || Integer.parseInt(obj.toString()) != 2 || (obj2 = gzwVar.hjx().get(InAppPurchaseMetaData.KEY_PRICE)) == null) {
                                    return jSONObject3;
                                }
                                jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj2.toString()) * 100000.0d));
                                return jSONObject3;
                            } catch (Throwable unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() {
                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? yo.oa(gzwVar, new JSONObject()) : yo.oa(gzwVar, jSONObject3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject yo() {
                        try {
                            AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", gzwVar.hg());
                                AnonymousClass49 anonymousClass492 = AnonymousClass49.this;
                                jSONObject.put("real_interaction_method", gzwVar.wxf());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.sy.moa().dz(String.valueOf(gzwVar.jnk())));
                                jSONObject.put("au_show", strUef);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", gzwVar.hg());
                            jSONObject4.put("real_interaction_method", gzwVar.wxf());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.sy.moa().dz(String.valueOf(gzwVar.jnk())));
                            jSONObject4.put("au_show", strUef);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!gzwVar.qr()) {
                        if (gzwVar.ib()) {
                            com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(gzwVar.df(), new yo.oa("show_urls", gzwVar));
                        } else {
                            yo.uef(gzwVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (gzwVar.rl() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.cz.uef().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.yo.49.2
                                @Override // java.lang.Runnable
                                public void run() throws JSONException {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        yo.oa(gzwVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.dj.oa().tc());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.wrv.yo.uef(gzwVar, strUef);
                }
            }
        });
    }

    public static void oa(gzw gzwVar, String str, final long j8) {
        if (gzwVar != null && j8 > 0 && j8 < 200000) {
            uef(System.currentTimeMillis(), gzwVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.3
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j8);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void oa(gzw gzwVar, String str, final int i5) {
        uef(System.currentTimeMillis(), gzwVar, str, "check_meta", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.7
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i5);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.dj.oa().gzw());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void oa(final gzw gzwVar, String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "picture_click", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.14
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", gzwVar.dqw());
                    jSONObject.put("interaction_method", gzwVar.hg());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void oa(gzw gzwVar, String str, String str2, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.18
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                return jSONObject;
            }
        });
    }

    private static void uef(JSONObject jSONObject) {
        try {
            jSONObject.put("screen_scale", af.ivm(com.bytedance.sdk.openadsdk.core.sy.uef()));
        } catch (Throwable unused) {
        }
    }

    public static void oa(final long j8, final gzw gzwVar, String str, final String str2) {
        uef(System.currentTimeMillis(), gzwVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.24
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                    return jSONObject;
                } catch (Exception e7) {
                    e7.getMessage();
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (gzw.yo(gzwVar)) {
                        if (gzwVar.km() != null) {
                            jSONObject.putOpt("url", gzwVar.km().yo());
                            jSONObject.putOpt("id", gzwVar.km().uef());
                            jSONObject.putOpt("md5", gzwVar.km().oa());
                        }
                        jSONObject.putOpt("from", str2);
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", gzwVar.nj().wrv());
                        jSONObject.put("style_id", gzwVar.lz());
                        if (gzwVar.nj() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(gzwVar.df(), true), 1, gzwVar.iou());
    }

    public static void oa(gzw gzwVar, final com.bytedance.sdk.openadsdk.ab.uef.uef uefVar, final String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.27
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", uefVar.yo());
                    jSONObject.put("current_url_index", uefVar.moa());
                    jSONObject.put("arbi_load_duration", uefVar.sy());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void oa(gzw gzwVar, String str, String str2, final JSONObject jSONObject, final long j8) {
        if (gzwVar == null || jSONObject == null) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.34
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j8);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                return jSONObject;
            }
        });
    }

    public static void oa(gzw gzwVar, String str, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, oa.ivm, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.37
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                return jSONObject;
            }
        });
    }

    public static void oa(gzw gzwVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        uef(gzwVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    public static void uef(final String str, final gzw gzwVar, final String str2, final xs xsVar) {
        if (gzwVar == null || xsVar == null || !xsVar.uef()) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.50
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                try {
                    xs xsVar2 = xsVar;
                    if (xsVar2 == null || xsVar2.oa() == null) {
                        return null;
                    }
                    JSONObject jSONObjectOa = xsVar.oa();
                    if (str2.equals("open_ad")) {
                        jSONObjectOa.put("is_icon_only", gzwVar.ku() ? 1 : 0);
                    }
                    return jSONObjectOa;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void oa(gzw gzwVar, String str, int i5, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i5);
        } catch (JSONException unused) {
        }
        oa(gzwVar, str, "download_app_ad_track", jSONObject);
    }

    public static void uef(final gzw gzwVar, final String str, final pu puVar) {
        if (gzwVar == null) {
            return;
        }
        final long jMoa = puVar.moa();
        uef(System.currentTimeMillis(), gzwVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jMoa);
                    jSONObject.put("click_time", puVar.uef);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", gzwVar.ku() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, final String str, final int i5, final String str2, final long j8, final boolean z2, final int i10, final long j10) {
        uef(System.currentTimeMillis(), gzwVar, str, oa.moa, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i5);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j8);
                    jSONObject.put("arbi_trigger_start", z2);
                    jSONObject.put("arbi_convert_count", i10);
                    jSONObject.put("loading_start_timestamp", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, String str, final long j8, final boolean z2) {
        uef(System.currentTimeMillis(), gzwVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.5
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z2 ? 1 : 2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, String str, final int i5, final String str2) {
        if (i5 == 200) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.8
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                try {
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("extra", str2);
                        return jSONObject;
                    }
                } catch (Throwable unused) {
                }
                return super.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i5);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.dj.oa().gzw());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, String str, final int i5, final String str2, final int i10) {
        uef(System.currentTimeMillis(), gzwVar, str, oa.uef, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.9
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i5);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, final String str, final int i5, final String str2, final float f10) {
        uef(System.currentTimeMillis(), gzwVar, str, oa.f25969oa, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.10
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i5);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, final String str, final int i5, final String str2, final String str3, final int i10) {
        uef(System.currentTimeMillis(), gzwVar, str, oa.yo, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.11
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i5);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void uef(final String str, final gzw gzwVar, final com.bytedance.sdk.openadsdk.core.model.wrv wrvVar, final String str2, final boolean z2, final Map<String, Object> map, final int i5) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        uef(new com.bytedance.sdk.component.bcc.oa.yo("onClick") { // from class: com.bytedance.sdk.openadsdk.moa.yo.15
            @Override // java.lang.Runnable
            public void run() {
                gzw gzwVar2 = gzwVar;
                if (gzwVar2 == null) {
                    return;
                }
                yo.uef(jCurrentTimeMillis, gzwVar2, str2, str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.15.1
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject oa() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.wrv wrvVar2 = wrvVar;
                            if (wrvVar2 != null) {
                                JSONObject jSONObjectUef = wrvVar2.uef();
                                jSONObjectUef.put("is_valid", z2);
                                int i10 = i5;
                                if (i10 > 0 && i10 <= 2) {
                                    jSONObjectUef.put("user_behavior_type", i10);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectUef.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectUef.put("interaction_method", gzwVar.hg());
                                if (str2.equals("open_ad")) {
                                    jSONObjectUef.put("is_icon_only", gzwVar.ku() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectUef.toString());
                            }
                            jSONObject.putOpt("log_extra", gzwVar.em());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - gzwVar.jn()).floatValue();
                            if (fFloatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(gzwVar.us()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(gzwVar.uxr(), true), 2, gzwVar.iou());
                }
                if ("click".equals(str)) {
                    pz.yo(gzwVar);
                }
            }
        });
    }

    public static void uef(gzw gzwVar, String str, String str2, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.16
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (jSONObject.has("duration")) {
                        jSONObject2.put("duration", jSONObject.get("duration"));
                        return jSONObject2;
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                return jSONObject;
            }
        });
        if ("click".equals(str2)) {
            pz.yo(gzwVar);
        }
    }

    public static void uef(gzw gzwVar, String str, final String str2, final long j8, final int i5, JSONObject jSONObject, final xs xsVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.17
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j8);
                    jSONObject3.put("percent", i5);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                xs xsVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (xsVar2 = xsVar) != null) {
                        xsVar2.uef(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void uef(gzw gzwVar, String str, String str2, final JSONObject jSONObject, final long j8) {
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.19
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j8);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                return jSONObject;
            }
        });
    }

    public static void uef(final gzw gzwVar, String str, String str2, final Map<String, Object> map) {
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.20
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get("duration");
                        if (obj instanceof Long) {
                            jSONObject.put("duration", obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", gzwVar.orw());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void uef(long j8, gzw gzwVar, String str, String str2) {
        uef(j8, gzwVar, str, str2, (com.bytedance.sdk.openadsdk.ab.oa.oa) null);
    }

    @DungeonFlag
    public static void uef(final long j8, final gzw gzwVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.ab.oa.oa oaVar) {
        if (gzwVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || uef(gzwVar.etd(), str2)) {
            return;
        }
        uef(new com.bytedance.sdk.component.bcc.oa.yo(str2) { // from class: com.bytedance.sdk.openadsdk.moa.yo.21
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.ab.oa.oa oaVar2 = oaVar;
                    if (oaVar2 != null) {
                        jSONObject = oaVar2.oa();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.ab.oa.oa oaVar3 = oaVar;
                    if (oaVar3 != null) {
                        JSONObject jSONObjectUef = oaVar3.uef();
                        JSONObject jSONObjectYo = oaVar.yo();
                        if (jSONObjectUef != null) {
                            if (jSONObjectYo == null) {
                                jSONObjectYo = new JSONObject();
                            }
                            gzw gzwVar2 = gzwVar;
                            if (gzwVar2 != null) {
                                jSONObjectUef.put("render_sequence", gzwVar2.ix());
                            }
                            jSONObjectYo.put("pag_json_data", jSONObjectUef.toString());
                            jSONObject.put("ad_extra_data", jSONObjectYo.toString());
                        } else if (jSONObjectYo != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            gzw gzwVar3 = gzwVar;
                            if (gzwVar3 != null) {
                                jSONObject2.put("render_sequence", gzwVar3.ix());
                            }
                            jSONObjectYo.put("pag_json_data", jSONObject2.toString());
                            jSONObject.put("ad_extra_data", jSONObjectYo.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", gzwVar.em());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(gzwVar.us()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new uef.C0127uef(j8, gzwVar).oa(str).yo(str2).lw(gzwVar.iou()).bcc(gzwVar.au()).uef(gzwVar.m167try()).uef(gzwVar.nau()).uef(jSONObject).xs(gzwVar.ofp()).uef((com.bytedance.sdk.openadsdk.moa.oa.uef) null);
            }
        });
    }

    public static void uef(gzw gzwVar, String str, final String str2, final int i5) {
        uef(System.currentTimeMillis(), gzwVar, str, "playable_track", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.22
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i5);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, final com.bytedance.sdk.openadsdk.ab.uef.uef uefVar, final String str) {
        uef(System.currentTimeMillis(), gzwVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.26
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", uefVar.yo());
                    jSONObject.put("keyword", uefVar.bs());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void uef(final long j8, final gzw gzwVar, String str) {
        if (gzwVar == null || !gzw.yo(gzwVar) || gzwVar.km() == null) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.31
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                    return jSONObject;
                } catch (Exception e7) {
                    e7.getMessage();
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", gzwVar.km().yo());
                    jSONObject.putOpt("id", gzwVar.km().uef());
                    jSONObject.putOpt("md5", gzwVar.km().oa());
                    if (gzwVar.nj() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(gzwVar.nj().moa()));
                        return jSONObject;
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, String str, String str2, final long j8, final JSONObject jSONObject) {
        if (gzwVar == null || jSONObject == null) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.32
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j8);
                    return jSONObject2;
                } catch (Exception e7) {
                    e7.getMessage();
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, String str, final JSONObject jSONObject) {
        uef(System.currentTimeMillis(), gzwVar, str, oa.lw, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.36
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                return jSONObject;
            }
        });
    }

    public static void uef(String str, long j8) {
        com.bytedance.sdk.openadsdk.core.cz.yo.uef(str, j8);
    }

    @DungeonFlag
    public static void uef(final gzw gzwVar, final String str, final String str2, final String str3, final long j8, final long j10, final JSONObject jSONObject, final boolean z2) {
        if (gzwVar == null || uef(gzwVar.etd(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        uef(new com.bytedance.sdk.component.bcc.oa.yo("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.moa.yo.38
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONArray jSONArrayOptJSONArray;
                String strM167try = gzwVar.m167try();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.xs(com.bytedance.sdk.openadsdk.core.sy.uef()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z2) {
                                jSONObject2.put("click_scence", 1);
                            } else if (cp.oa(gzwVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (gzwVar.geh()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (gzwVar.nuo()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                        if (jSONObjectOptJSONObject2 == null) {
                            jSONObjectOptJSONObject2 = new JSONObject();
                        }
                        jSONObjectOptJSONObject2.put("render_sequence", gzwVar.ix());
                        int i5 = 0;
                        if (com.bytedance.sdk.openadsdk.dz.uef.yo(gzwVar)) {
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", gzwVar.kkq() ? 1 : 0);
                        }
                        jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z2 && iOptInt == 2) {
                            strM167try = jSONObject2.optString("app_log_url");
                        }
                        if ("click".equals(str3)) {
                            pz.yo(gzwVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - gzw.oa(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef()))) {
                                if (z2 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i5 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i5));
                                            i5++;
                                        }
                                        com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(arrayList, true), 2, String.valueOf(j8));
                                    }
                                } else {
                                    gzw gzwVar2 = gzwVar;
                                    if (gzwVar2 != null) {
                                        com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(gzwVar2.uxr(), true), 2, gzwVar.iou());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef())) && z2 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i5 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i5));
                                i5++;
                            }
                            com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(arrayList2, true), 1, String.valueOf(j8));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new uef.C0127uef(jCurrentTimeMillis, gzwVar).moa(str).oa(str2).yo(str3).lw(String.valueOf(j8)).ivm(String.valueOf(j10)).uef(strM167try).uef(gzwVar.nau()).uef(jSONObject).bcc(gzwVar.au()).xs(gzwVar.ofp()).uef((com.bytedance.sdk.openadsdk.moa.oa.uef) null);
            }
        });
    }

    public static void uef(final gzw gzwVar, String str, final long j8, final JSONObject jSONObject, final JSONObject jSONObject2) {
        uef(System.currentTimeMillis(), gzwVar, "open_ad", str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.39
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j10 = j8;
                    if (j10 != -1) {
                        jSONObject3.put("duration", j10);
                        return jSONObject3;
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() throws JSONException {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    gzw gzwVar2 = gzwVar;
                    if (gzwVar2 != null) {
                        int iZjm = gzwVar2.zjm();
                        jSONObject3.putOpt("start_type", Integer.valueOf(iZjm == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(iZjm));
                        if (iZjm == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.wk.yo));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.xs.uef.moa()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.xs.uef.oa()));
                    return jSONObject3;
                } catch (Exception e7) {
                    e7.getMessage();
                    return jSONObject3;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static void uef(final com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        if (yoVar == null) {
            return;
        }
        if (km.ivm()) {
            com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.yo.40
                @Override // java.lang.Runnable
                public void run() {
                    km.oa(yoVar, 10);
                }
            });
        } else if (!km.xs()) {
            km.oa(yoVar, 10);
        } else {
            yoVar.run();
        }
    }

    public static void uef(final com.bytedance.sdk.openadsdk.ab.uef.oa oaVar) {
        if (oaVar == null || oaVar.oa() == null) {
            return;
        }
        final gzw gzwVarOa = oaVar.oa();
        final int iYkf = gzwVarOa.ykf();
        if (iYkf == 2 || iYkf == 8 || (gb.moa(gzwVarOa) && oa.uef.moa.equals(oaVar.uef()))) {
            uef(System.currentTimeMillis(), gzwVarOa, oaVar.yo(), "open_browser", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.41
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iMoa = oaVar.moa();
                        jSONObject.put("count", gb.zjm(com.bytedance.sdk.openadsdk.core.sy.uef()));
                        jSONObject.put("interceptor", iMoa);
                        jSONObject.put("success", oaVar.lw());
                        jSONObject.put("link", oaVar.uef());
                        jSONObject.put("interaction_type", iYkf);
                        jSONObject.put("real_interaction_type", oaVar.xs());
                        if (oaVar.moa() == 9) {
                            jSONObject.put("is_act_signals_api_available", oaVar.bcc());
                            jSONObject.put("is_act_signals_callback", oaVar.cz());
                        }
                        if (!TextUtils.isEmpty(oaVar.ivm())) {
                            jSONObject.put("exception_msg", oaVar.ivm());
                        }
                        if (iMoa == 2 || iMoa == 5) {
                            String strCd = gzwVarOa.cd();
                            if (!TextUtils.isEmpty(strCd) && (jSONArrayOptJSONArray = new JSONObject(strCd).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put(Office.PREFIX_DOC_META, jSONArrayOptJSONArray.optJSONObject(gzwVarOa.yo()));
                                return jSONObject;
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void uef(JSONObject jSONObject, int i5, int i10) throws JSONException {
        try {
            jSONObject.put("skip_show_time", i5);
            jSONObject.put("skip_time", i10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i10 - (i5 * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void uef(gzw gzwVar, String str, int i5, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i5);
        } catch (JSONException unused) {
        }
        oa(gzwVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void uef(gzw gzwVar, String str, final boolean z2, final boolean z10, final boolean z11, final boolean z12, final int i5, final Map<String, Object> map) {
        uef(System.currentTimeMillis(), gzwVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.42
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z2);
                    jSONObject.put("force", z10);
                    jSONObject.put("isFromLandingPage", z11);
                    jSONObject.put("finishing", z12);
                    jSONObject.put("from", i5);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(final gzw gzwVar, final boolean z2, String str, final String str2, final long j8, final String str3, final String str4, final int i5, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        uef(System.currentTimeMillis(), gzwVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.yo.43
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0009, B:27:0x0050, B:29:0x0058, B:41:0x00cb, B:43:0x00ea, B:30:0x006e, B:32:0x0076, B:33:0x008c, B:35:0x0090, B:37:0x0098, B:38:0x00ae, B:40:0x00b6, B:10:0x0020, B:15:0x002d, B:18:0x0037), top: B:49:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0009, B:27:0x0050, B:29:0x0058, B:41:0x00cb, B:43:0x00ea, B:30:0x006e, B:32:0x0076, B:33:0x008c, B:35:0x0090, B:37:0x0098, B:38:0x00ae, B:40:0x00b6, B:10:0x0020, B:15:0x002d, B:18:0x0037), top: B:49:0x0009 }] */
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public org.json.JSONObject yo() {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.moa.yo.AnonymousClass43.yo():org.json.JSONObject");
            }
        });
    }

    private static boolean uef(int i5, String str) {
        int iOa;
        try {
            Set<String> setUs = com.bytedance.sdk.openadsdk.core.settings.dj.oa().us();
            if ((i5 == 1 && setUs != null && setUs.contains(str)) || (iOa = com.bytedance.sdk.openadsdk.core.settings.dj.oa().oa(str)) == 0) {
                return true;
            }
            if (iOa != 100) {
                if (((int) ((Math.random() * 100.0d) + 1.0d)) > iOa) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public static JSONObject uef(int i5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i5);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
