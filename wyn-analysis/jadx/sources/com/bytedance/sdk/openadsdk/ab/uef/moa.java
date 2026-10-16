package com.bytedance.sdk.openadsdk.ab.uef;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.ab.uef.moa;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.ue;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa<T extends moa> implements yo {
    private String cq;
    private String cz;
    private String dj;

    /* renamed from: oa, reason: collision with root package name */
    private String f25151oa;
    private String uef;
    private String wrv;
    private String xs;
    private String yo;
    private String zjm;
    private final String moa = BuildConfig.VERSION_NAME;
    private long lw = System.currentTimeMillis() / 1000;
    private int ivm = 0;
    private int bcc = 0;

    private moa() {
        try {
            this.cq = ue.uef();
        } catch (Throwable unused) {
            this.cq = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    private T ab() {
        return this;
    }

    public static moa<moa> oa() {
        return new moa<>();
    }

    private JSONObject wk() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", gb.ivm());
            jSONObject.put("ua", gb.moa());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public long bcc() {
        return this.lw;
    }

    public String cq() {
        return this.zjm;
    }

    public int cz() {
        return this.ivm;
    }

    public int dj() {
        return this.bcc;
    }

    public String dz() {
        return this.wrv;
    }

    public String ivm() {
        return this.yo;
    }

    public String lw() {
        return this.f25151oa;
    }

    public String moa() {
        return this.dj;
    }

    @Override // com.bytedance.sdk.openadsdk.ab.uef.yo
    public JSONObject uef() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", xs());
            jSONObject2.put("app_version", gb.bcc());
            jSONObject2.put("timestamp", bcc());
            jSONObject2.put("conn_type", sy.oa(com.bytedance.sdk.openadsdk.core.sy.uef()));
            jSONObject2.put("appid", TextUtils.isEmpty(zjm.oa().moa()) ? "" : zjm.oa().moa());
            jSONObject2.put("device_info", wk());
            if (!TextUtils.isEmpty(yo())) {
                jSONObject2.put("type", yo());
            }
            jSONObject2.put("error_code", dj());
            if (!TextUtils.isEmpty(wrv())) {
                jSONObject2.put("error_msg", wrv());
            }
            if (!TextUtils.isEmpty(lw())) {
                jSONObject2.put("rit", lw());
            }
            if (!TextUtils.isEmpty(ivm())) {
                jSONObject2.put("creative_id", ivm());
            }
            if (cz() > 0) {
                jSONObject2.put("adtype", cz());
            }
            if (!TextUtils.isEmpty(zjm())) {
                jSONObject2.put("req_id", zjm());
            }
            if (!TextUtils.isEmpty(cq())) {
                jSONObject2.put("extra", cq());
            }
            String strMoa = moa();
            if (TextUtils.isEmpty(strMoa)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strMoa);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.cq + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strMoa)) {
                jSONObject2.put("event_extra", strMoa);
            }
            if (!TextUtils.isEmpty(dz())) {
                jSONObject2.put("duration", dz());
            }
        } catch (Throwable th) {
            dhk.yo("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public String wrv() {
        return this.cz;
    }

    public String xs() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String yo() {
        return this.uef;
    }

    public String zjm() {
        return this.xs;
    }

    public T bcc(String str) {
        this.wrv = str;
        return (T) ab();
    }

    public T ivm(String str) {
        this.cz = str;
        return (T) ab();
    }

    public T lw(String str) {
        this.xs = str;
        return (T) ab();
    }

    public T moa(String str) {
        this.yo = str;
        return (T) ab();
    }

    public T oa(String str) {
        this.dj = str;
        return (T) ab();
    }

    public T xs(String str) {
        this.zjm = str;
        return (T) ab();
    }

    public T yo(String str) {
        this.f25151oa = str;
        return (T) ab();
    }

    public T oa(int i5) {
        this.bcc = i5;
        return (T) ab();
    }

    public T uef(String str) {
        this.uef = str;
        return (T) ab();
    }

    public T uef(int i5) {
        this.ivm = i5;
        return (T) ab();
    }
}
