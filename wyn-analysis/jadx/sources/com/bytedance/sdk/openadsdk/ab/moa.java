package com.bytedance.sdk.openadsdk.ab;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa {
    private static volatile moa uef;

    private moa() {
    }

    public static void moa() {
        uef("disk_log", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.7
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j8 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jUef = moa.uef(file2);
                        j8 += jUef;
                        jSONObject.put(file2.getName(), jUef);
                    }
                }
                if (j8 < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("disk_log").oa(jSONObject.toString());
            }
        });
    }

    public static void oa(final gzw gzwVar) {
        if (gb.uef(gzwVar) == null || TextUtils.isEmpty(gzwVar.vup())) {
            return;
        }
        uef("download_gecko_start", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.14
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", gzwVar.cc());
                jSONObject.put("channel_name", gzwVar.vup());
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("download_gecko_start").uef(gzwVar.epe()).oa(jSONObject.toString());
            }
        });
    }

    public static moa uef() {
        if (uef == null) {
            synchronized (moa.class) {
                try {
                    if (uef == null) {
                        uef = new moa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private boolean yo(com.bytedance.sdk.openadsdk.ab.uef.moa moaVar) {
        return moaVar == null;
    }

    public void yo() {
        uef("blind_mode_status", true, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.5
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("blind_mode_status");
            }
        });
    }

    public void oa(final com.bytedance.sdk.openadsdk.ab.uef.moa moaVar) {
        if (yo(moaVar)) {
            return;
        }
        moaVar.uef("show_backup_endcard");
        sy.lw().uef(new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.17
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                return moaVar;
            }
        });
    }

    public static void oa() {
        km.oa(new com.bytedance.sdk.component.bcc.oa.yo("showFailLog") { // from class: com.bytedance.sdk.openadsdk.ab.moa.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    moa.uef().uef("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    dhk.yo("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void uef(final gzw gzwVar) {
        if (gzwVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        uef("bidding_receive", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (gzwVar.epe() == 3) {
                    jSONObject.put("is_icon_only", gzwVar.ku() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("bidding_receive").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(gzw gzwVar, final long j8) {
        if (gzwVar == null) {
            return;
        }
        uef("bidding_load", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.8
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j8);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("bidding_load").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(final String str, final com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar) {
        if (uefVar == null) {
            return;
        }
        uef(str, false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.13
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObjectYo = uefVar.yo();
                if (jSONObjectYo == null) {
                    jSONObjectYo = new JSONObject();
                }
                gzw gzwVarUef = uefVar.uef();
                jSONObjectYo.put("req_id", gzwVarUef.ofp());
                com.bytedance.sdk.openadsdk.moa.lw.oa.yo yoVarLw = uefVar.lw();
                if (yoVarLw != null) {
                    yoVarLw.uef(jSONObjectYo);
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(str).uef(gzwVarUef.epe()).oa(jSONObjectYo.toString());
            }
        });
    }

    public static void uef(final gzw gzwVar, final JSONObject jSONObject) {
        if (gb.uef(gzwVar) == null || TextUtils.isEmpty(gzwVar.vup())) {
            return;
        }
        uef("download_gecko_end", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.15
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", gzwVar.cc());
                jSONObject2.put("channel_name", gzwVar.vup());
                jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("download_gecko_end").uef(gzwVar.epe()).oa(jSONObject2.toString());
            }
        });
    }

    public void uef(final com.bytedance.sdk.openadsdk.ab.uef.moa moaVar) {
        if (yo(moaVar)) {
            return;
        }
        moaVar.uef("express_ad_render");
        sy.lw().uef(new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.16
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                return moaVar;
            }
        });
    }

    public void uef(final long j8, final long j10) {
        final long j11 = j10 - j8;
        uef("general_label", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                int i5 = !wk.f25784oa.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j8);
                    jSONObject.put("endtime", j10);
                    jSONObject.put("start_type", i5);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("general_label").bcc(String.valueOf(j11)).oa(jSONObject.toString());
            }
        });
    }

    public void uef(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        uef(str, false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(str).oa(jSONObject.toString());
            }
        });
    }

    public void uef(final JSONObject jSONObject) {
        if (jSONObject == null) {
            dhk.uef("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            dhk.uef("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            dhk.uef("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            uef("ad_revenue", true, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.6
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put("uuid", cq.yo(sy.uef()));
                        String strUef = "";
                        try {
                            if (cq.uef(sy.uef()) != null) {
                                strUef = cq.uef(sy.uef());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strUef);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("ad_revenue").oa(jSONObject.toString());
                }
            });
        }
    }

    public static long uef(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jUef = 0;
        for (File file2 : file.listFiles()) {
            jUef += uef(file2);
        }
        return jUef;
    }

    public static void uef(String str, boolean z2, oa oaVar) {
        uef(str, z2, -1, oaVar);
    }

    public static void uef(String str, boolean z2, int i5, oa oaVar) {
        if (!TextUtils.isEmpty(str) && yo.uef(str, i5)) {
            sy.lw().uef(oaVar, z2);
        }
    }

    public static void uef(long j8, long j10, final String str, final int i5) {
        if (j8 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j11 = jElapsedRealtime - j8;
        final long j12 = jElapsedRealtime - j10;
        final long j13 = j10 - j8;
        uef("ad_show_cost_time", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.9
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j11);
                jSONObject.put("renderDuration", j12);
                jSONObject.put("showToRenderDuration", j13);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i5);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("ad_show_cost_time").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(int i5, String str) {
        uef(i5, str, 0, (String) null);
    }

    public static void uef(final int i5, final String str, final int i10, final String str2) {
        uef("ipv6_req", false, new oa<com.bytedance.sdk.openadsdk.ab.uef.yo>() { // from class: com.bytedance.sdk.openadsdk.ab.moa.10
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i11 = i5;
                if (i11 == 1) {
                    str3 = "success";
                } else if (i11 == -1) {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("ipv6_req").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(final String str, final boolean z2) {
        uef("img_error_param", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.11
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z2 ? 1 : 0);
                    jSONObject.put("msg", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("img_error_param").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(final boolean z2) {
        uef("web_container_reuse", false, new oa() { // from class: com.bytedance.sdk.openadsdk.ab.moa.12
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z2 ? 1 : 0);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("web_container_reuse").oa(jSONObject.toString());
            }
        });
    }
}
