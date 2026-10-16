package com.bytedance.sdk.openadsdk.component.xs;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.ivm;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static Boolean f25483oa;
    private static AtomicInteger uef = new AtomicInteger(0);
    private static Integer yo = null;

    public static int bcc() {
        if (lw()) {
            return lw.uef("aoa_cache_count", 3);
        }
        return 1;
    }

    public static int cz() {
        int iUef = lw.uef("aoa_cache_refresh_time", 72000000);
        if (iUef < 60000) {
            return 72000000;
        }
        return iUef;
    }

    public static boolean dj() {
        if (f25483oa == null) {
            boolean z2 = false;
            boolean z10 = lw.uef("open_ad_ugen_backup_enable", 0) == 1;
            boolean z11 = lw.uef("express_backup_type", 0) == 1;
            if (z10 && z11) {
                z2 = true;
            }
            f25483oa = Boolean.valueOf(z2);
        }
        return f25483oa.booleanValue();
    }

    public static boolean ivm() {
        return sy.moa().dj() == 1;
    }

    public static boolean lw() {
        return lw.uef("aoa_cache_opt_enable", 0) == 1;
    }

    public static int moa() {
        return wk.f25784oa.get() ? 1 : 2;
    }

    public static File oa(String str) {
        return new File(ivm.uef(sy.uef()).oa(), str);
    }

    public static File uef(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CacheDirFactory.getICacheDir(0).oa());
        return new File(b.c(sb2, File.separator, str));
    }

    public static int wrv() {
        if (yo == null) {
            int iUef = lw.uef("aoa_preload_size", 10);
            yo = Integer.valueOf(iUef);
            if (iUef < 0) {
                yo = 10;
            }
        }
        return yo.intValue();
    }

    public static int xs() {
        return uef.get() == 0 ? lw.uef("aoa_cold_load_timeout", 3500) : lw.uef("aoa_hot_load_timeout", 3500);
    }

    public static int yo() {
        return uef.incrementAndGet();
    }

    public static int zjm() {
        int iUef = lw.uef("aoa_cache_poll_interval", 3600000);
        if (iUef < 60000) {
            return 3600000;
        }
        return iUef;
    }

    public static long oa() {
        if (Build.VERSION.SDK_INT >= 24) {
            return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
        }
        return Process.getElapsedCpuTime();
    }

    public static void uef(File file) {
        if (file == null) {
            return;
        }
        try {
            xs.oa(file);
        } catch (Throwable unused) {
        }
    }

    public static void uef(Context context) {
        try {
            ivm.uef(context).uef();
            if (lw()) {
                com.bytedance.sdk.openadsdk.common.sy.uef().oa();
            }
        } catch (Throwable unused) {
        }
    }

    public static String uef() {
        return ivm.uef(sy.uef()).oa().getAbsolutePath();
    }

    public static void uef(JSONObject jSONObject, int i5, boolean z2) throws JSONException {
        try {
            String strBcc = zjm.oa().bcc();
            int iCz = zjm.oa().cz();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strBcc);
            if (!z2) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iCz)));
            } else if (zjm.oa().cz() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject(MimeTypes.BASE_TYPE_VIDEO) == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", sy.moa().gsd(String.valueOf(i5)));
                jSONObject2.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject4);
            }
        } catch (Exception e7) {
            dhk.yo("TTAppOpenUtils", e7.getMessage());
        }
    }

    public static int uef(gzw gzwVar, int i5) {
        return i5 - gzwVar.gye();
    }

    public static void uef(int i5) {
        Map<String, AdSlot> mapYo;
        if (!lw() || (mapYo = com.bytedance.sdk.openadsdk.common.sy.uef().yo()) == null || mapYo.size() == 0) {
            return;
        }
        mapYo.size();
        for (AdSlot adSlot : mapYo.values()) {
            if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm())) {
                try {
                    adSlot.setCacheScene(i5);
                    ivm.uef(sy.uef()).uef(adSlot);
                } catch (Throwable unused) {
                    adSlot.toString();
                }
            }
        }
    }

    public static boolean uef(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }
}
