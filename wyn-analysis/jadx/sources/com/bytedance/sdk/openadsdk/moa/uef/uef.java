package com.bytedance.sdk.openadsdk.moa.uef;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gr;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.pz;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private static volatile uef ivm;
    private final String lw;
    private final boolean moa = yo();

    /* renamed from: oa, reason: collision with root package name */
    private int f26002oa;
    private long uef;
    private Context yo;

    private uef() {
        Context contextUef = sy.uef();
        if (contextUef != null) {
            this.yo = contextUef.getApplicationContext();
        }
        this.lw = lw();
    }

    private String ivm() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (pz.ivm()) {
                sb2.append("MIUI-");
            } else if (pz.yo()) {
                sb2.append("FLYME-");
            } else {
                String strWk = pz.wk();
                if (pz.uef(strWk)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strWk)) {
                    sb2.append(strWk);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    private String lw() {
        return DeviceUtils.yo(this.yo) ? "tv" : DeviceUtils.oa(this.yo) ? "android_pad" : "android";
    }

    private int moa() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static uef uef() {
        if (ivm == null) {
            synchronized (uef.class) {
                try {
                    if (ivm == null) {
                        ivm = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ivm;
    }

    public List<String> oa(List<com.bytedance.sdk.openadsdk.moa.uef> list) {
        JSONArray jSONArrayOptJSONArray = (list.isEmpty() || list.get(0) == null || list.get(0).yo() == null) ? null : list.get(0).yo().optJSONArray("app_log_url_back");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                String strIvm = gb.ivm(jSONArrayOptJSONArray.optString(i5));
                if (!TextUtils.isEmpty(strIvm)) {
                    arrayList.add(strIvm);
                }
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.openadsdk.moa.uef> yo(List<com.bytedance.sdk.openadsdk.moa.uef> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.moa.uef uefVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectYo = uefVar.yo();
                jSONObject.putOpt("event", jSONObjectYo.optString("label"));
                long jOptLong = jSONObjectYo.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.moa.ivm.yo.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectYo.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectYo.opt(next));
                    }
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.moa.ivm(uefVar.uef, jSONObject));
            } catch (Exception e7) {
                dhk.yo("AdLogParamsGenerate", e7.getMessage());
            }
        }
        return arrayList;
    }

    public String uef(List<com.bytedance.sdk.openadsdk.moa.uef> list) {
        String strOptString;
        if (list.size() > 0 && list.get(0) != null && list.get(0).yo() != null) {
            strOptString = list.get(0).yo().optString("app_log_url");
        } else {
            strOptString = "";
        }
        return gb.lw(strOptString);
    }

    public JSONObject oa() {
        Context contextUef;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.yo == null && (contextUef = sy.uef()) != null) {
                this.yo = contextUef.getApplicationContext();
            }
            jSONObject.put("ua", gb.moa());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", gb.bcc());
            jSONObject.put("sim_op", uef(this.yo));
            jSONObject.put("root", this.moa ? 1 : 0);
            jSONObject.put("timezone", moa());
            jSONObject.put("access", gr.uef(this.yo));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.lw);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", af.lw(this.yo) + "x" + af.yo(this.yo));
            jSONObject.put("display_density", uef(af.zjm(this.yo)));
            jSONObject.put("density_dpi", af.zjm(this.yo));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", cq.uef(this.yo));
            jSONObject.put("rom", ivm());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.f26002oa);
            jSONObject.put("uid", this.uef);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            jSONObject.put("locale_language", DeviceUtils.moa());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.lw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.oa() ? 1 : 0);
            dj djVarMoa = sy.moa();
            Context context = this.yo;
            if (context != null) {
                jSONObject.put("force_language", orq.uef(context, "tt_choose_language"));
            }
            if (djVarMoa.pz("mnc")) {
                jSONObject.put("mnc", ku.yo());
            }
            if (djVarMoa.pz("mcc")) {
                jSONObject.put("mcc", ku.oa());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void uef(com.bytedance.sdk.openadsdk.moa.uef uefVar) {
        if (uefVar == null) {
            return;
        }
        try {
            String strOptString = uefVar.yo().optJSONObject("params").optString("log_extra", "");
            long jUef = gzw.uef(strOptString);
            int iMoa = gzw.moa(strOptString);
            if (jUef == 0) {
                jUef = this.uef;
            }
            this.uef = jUef;
            if (iMoa == 0) {
                iMoa = this.f26002oa;
            }
            this.f26002oa = iMoa;
        } catch (Exception e7) {
            dhk.yo("AdLogParamsGenerate", "getInfoFromLogExtra exception", e7.getMessage());
        }
    }

    public JSONObject uef(List<com.bytedance.sdk.openadsdk.moa.uef> list, long j8, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            uef(list.get(0));
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.moa.uef> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().moa());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j8);
            jSONObject2.put("local_time", j8 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private boolean yo() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String uef(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String uef(int i5) {
        if (i5 == 120) {
            return "ldpi";
        }
        if (i5 == 160) {
            return "mdpi";
        }
        if (i5 == 240) {
            return "hdpi";
        }
        if (i5 == 320) {
            return "xhdpi";
        }
        if (i5 == 480) {
            return "xxhdpi";
        }
        if (i5 != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
