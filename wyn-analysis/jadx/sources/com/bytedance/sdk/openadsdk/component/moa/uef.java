package com.bytedance.sdk.openadsdk.component.moa;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.ab.oa;
import com.bytedance.sdk.openadsdk.core.model.fz;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.pu;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    public static void oa(gzw gzwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", gzw.lw(gzwVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e7) {
            dhk.uef("TTAppOpenAdReport", "reportCacheLoss json error", e7);
        }
        yo.yo(gzwVar, "cache_loss", jSONObject);
    }

    public static void uef(final int i5, final int i10, final fz fzVar) {
        moa.uef("openad_load_ad_timeout", false, new oa() { // from class: com.bytedance.sdk.openadsdk.component.moa.uef.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i5);
                jSONObject.put("user_timeout_time", i10);
                fz fzVar2 = fzVar;
                if (fzVar2 != null) {
                    jSONObject.put("start_type", fzVar2.zjm() == 1);
                    jSONObject.put("load_index", fzVar.zjm());
                }
                jSONObject.put("start_type_backup", com.bytedance.sdk.openadsdk.component.xs.uef.moa());
                jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.xs.uef.oa());
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("openad_load_ad_timeout").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(gzw gzwVar, int i5, int i10, float f10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            uef(jSONObject, gzwVar);
            jSONObject.put("openad_creative_type", gzw.lw(gzwVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            yo.uef(jSONObject, i10, i5);
        } catch (JSONException e7) {
            dhk.uef("TTAppOpenAdReport", "reportSkip json error", e7);
        }
        yo.uef(gzwVar, "skip", i5, jSONObject, (JSONObject) null);
    }

    public static void oa(gzw gzwVar, long j8, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", gzwVar.nj().lw());
            jSONObject.put("video_duration", gzwVar.nj().ivm());
            jSONObject.put("order", z2 ? 1 : 2);
        } catch (JSONException unused) {
        }
        yo.uef(gzwVar, "download_video_duration", j8, jSONObject, (JSONObject) null);
    }

    public static void uef(gzw gzwVar, long j8, float f10, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            uef(jSONObject, gzwVar);
            jSONObject.put("openad_creative_type", gzw.lw(gzwVar) ? "video_normal_ad" : "image_normal_ad");
            if (z2) {
                double d3 = f10;
                jSONObject.put("video_duration", d3);
                jSONObject.put("video_percent", (int) (((j8 * 1.0d) / 10.0d) / d3));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e7) {
            dhk.uef("TTAppOpenAdReport", "reportDestroy json error", e7);
        }
        yo.yo(gzwVar, "destroy", jSONObject);
    }

    public static void uef(gzw gzwVar) {
        yo.yo(gzwVar, "cache_expire", (JSONObject) null);
    }

    public static void uef(final String str, final int i5, final int i10, final boolean z2) {
        km.oa(new com.bytedance.sdk.component.bcc.oa.yo("opencache") { // from class: com.bytedance.sdk.openadsdk.component.moa.uef.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.uef uefVarOa;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = sy.yo().uef(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (uefVarOa = com.bytedance.sdk.openadsdk.core.model.uef.oa(jSONObject)) == null || !uefVarOa.ivm()) {
                        return;
                    }
                    uef.uef(uefVarOa.xs(), i5, i10, z2);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void uef(gzw gzwVar, int i5, int i10, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i5);
            jSONObject.put("cache_replace", z2 ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i10);
            if (i10 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", com.bytedance.sdk.openadsdk.component.xs.uef.bcc());
            yo.uef(gzwVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e7) {
            dhk.uef("TTAppOpenAdReport", "reportCacheRefresh json error", e7);
        }
    }

    public static void uef(gzw gzwVar, JSONObject jSONObject) {
        yo.uef(gzwVar, "aoa_backup_close_show", -1L, (JSONObject) null, jSONObject);
    }

    public static void uef(gzw gzwVar, long j8, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z2 ? 1 : 2);
        } catch (JSONException unused) {
        }
        yo.uef(gzwVar, "download_image_duration", j8, jSONObject, (JSONObject) null);
    }

    public static void uef(gzw gzwVar, int i5, fz fzVar) {
        JSONObject jSONObject = new JSONObject();
        long jIvm = 0;
        try {
            jSONObject.put("openad_creative_type", gzw.lw(gzwVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i5);
            if (fzVar != null) {
                fzVar.oa(pu.oa());
                uef(jSONObject, gzwVar);
                jSONObject.put("client_start_time", fzVar.oa());
                jSONObject.put("sever_time", fzVar.moa());
                jSONObject.put("network_time", fzVar.yo());
                jSONObject.put("client_end_time", fzVar.lw());
                jSONObject.put("download_resource_duration", fzVar.xs());
                jSONObject.put("resource_source", fzVar.bcc());
                jSONObject.put("is_bidding", fzVar.uef ? 1 : 0);
                if (fzVar.uef) {
                    jSONObject.put("load_wait_time", fzVar.f25676oa);
                }
                jIvm = fzVar.ivm();
            }
        } catch (JSONException e7) {
            dhk.uef("TTAppOpenAdReport", "reportLoadNetDuration json error", e7);
        }
        yo.uef(gzwVar, "load_net_duration", jIvm, jSONObject, (JSONObject) null);
    }

    public static void uef(gzw gzwVar, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            uef(jSONObject, gzwVar);
            jSONObject.put("openad_creative_type", gzw.lw(gzwVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            dhk.yo("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        yo.uef(gzwVar, "load_cache_duration", j8, jSONObject, (JSONObject) null);
    }

    public static void uef(final fz fzVar, final int i5, final int i10) {
        if (fzVar == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        moa.uef("app_running_time", false, new oa() { // from class: com.bytedance.sdk.openadsdk.component.moa.uef.3
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_running_time", fzVar.cz());
                jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.xs.uef.oa());
                jSONObject.put("load_time", fzVar.uef().moa());
                jSONObject.put("load_from", i5);
                jSONObject.put("load_result", i10);
                int iZjm = fzVar.zjm();
                jSONObject.put("load_index", iZjm);
                if (iZjm == 1) {
                    jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - wk.yo);
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("app_running_time").oa(jSONObject.toString());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void uef(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.gzw r2) throws org.json.JSONException {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.ku()     // Catch: org.json.JSONException -> L11
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.String r2 = "TTAppOpenAdReport"
            java.lang.String r1 = r1.getMessage()
            com.bytedance.sdk.component.utils.dhk.yo(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.moa.uef.uef(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.gzw):void");
    }
}
