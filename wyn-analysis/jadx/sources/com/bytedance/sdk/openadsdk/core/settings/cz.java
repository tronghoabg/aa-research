package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.dxx;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wrv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gzw;
import com.bytedance.sdk.openadsdk.utils.ku;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz extends com.bytedance.sdk.component.bcc.oa.yo {

    /* renamed from: oa, reason: collision with root package name */
    private final bcc f25740oa;
    private final uef uef;
    private final Set<lw> yo;

    public interface uef {
        void uef(boolean z2);
    }

    public cz(uef uefVar, bcc bccVar, lw... lwVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.yo = hashSet;
        this.uef = uefVar;
        this.f25740oa = bccVar;
        hashSet.addAll(Arrays.asList(lwVarArr));
    }

    private JSONObject oa(JSONObject jSONObject) {
        return gsd.uef(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iUef = gr.uef(sy.uef(), 0L);
        if (iUef == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.uef.uef(false);
            return;
        }
        JSONObject jSONObjectUef = uef(iUef);
        com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        try {
            moaVarOa.yo(com.bytedance.sdk.openadsdk.cz.moa.uef(moaVarOa, gb.uef("/api/ad/union/sdk/settings/", false, true)));
            moaVarOa.oa("User-Agent", gb.moa());
        } catch (Exception unused) {
        }
        String string = oa(jSONObjectUef).toString();
        if (sy.moa().nkh() && dxx.uef().moa() == 1) {
            gb.uef("Pangle_Debug_Mode", string, sy.uef());
        }
        moaVarOa.uef(string, sy.moa().bs());
        moaVarOa.uef(6);
        moaVarOa.oa("setting");
        if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            moaVarOa.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.settings.cz.1
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("settings_fetch");
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.settings.cz.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("settings_fetch");
                }
            });
        }
        moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.settings.cz.3
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                JSONObject jSONObject;
                int iUef2 = oaVar.uef();
                String strMoa = oaVar.moa();
                if (sy.moa().nkh() && dxx.uef().moa() == 1) {
                    gb.uef("Pangle_Debug_Mode", strMoa, sy.uef());
                }
                if (oaVar.ivm() && !TextUtils.isEmpty(strMoa)) {
                    try {
                        jSONObject = new JSONObject(strMoa);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String strUef = gsd.uef(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strUef)) {
                            try {
                                jSONObject = new JSONObject(strUef);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            cz.this.uef(strUef, oaVar.yo());
                        } catch (Throwable unused4) {
                        }
                        try {
                            cz.this.uef(jSONObject);
                            sy.moa().uef(System.currentTimeMillis());
                            if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                                com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.settings.cz.3.1
                                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                        return AbstractC1593a.f("settings_fetch");
                                    }
                                });
                            }
                            gzw.oa();
                        } catch (Throwable unused5) {
                        }
                        cz.this.uef.uef(true);
                        return;
                    }
                } else if (yoVar != null) {
                    gzw.uef(yoVar.ivm());
                }
                if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.settings.cz.3.2
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            return AbstractC1593a.f("settings_fetch");
                        }
                    });
                }
                if (!oaVar.ivm()) {
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("settings_fetch", yoVar.ivm(), iUef2, oaVar.oa(), null, null);
                }
                cz.this.uef.uef(false);
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                cz.this.uef.uef(false);
                if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.settings.cz.3.3
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            return AbstractC1593a.f("settings_fetch");
                        }
                    });
                }
                if (yoVar != null) {
                    gzw.uef(yoVar.ivm());
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("settings_fetch", yoVar.ivm(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                }
            }
        });
        wrv.oa(cq.uef(sy.uef()));
        DeviceUtils.wrv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, Map<String, String> map) {
        int i5 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i10 = Integer.parseInt(str2);
                    String str3 = (String) map2.get("ts");
                    if (str3 != null) {
                        long j8 = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strUef = com.bykv.vk.openvk.uef.uef.uef.xs.oa.uef(str + i10 + j8);
                        if (strUef != null) {
                            if (strUef.equalsIgnoreCase(str4)) {
                                i5 = i10;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        xs.uef(i5);
    }

    public static JSONObject uef(int i5) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            dj djVarMoa = sy.moa();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", gb.gsd());
            com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(jSONObject);
            if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().dj()) {
                jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.zjm.oa().zjm());
            }
            if (djVarMoa.pz("mcc")) {
                jSONObject.put("mcc", ku.oa());
            }
            Context contextUef = sy.uef();
            jSONObject.put("conn_type", gb.xs(i5));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", cq.oa());
            jSONObject.put("time_zone", gb.ue());
            jSONObject.put("package_name", gb.ivm());
            jSONObject.put("position", gb.uef() ? 1 : 2);
            jSONObject.put("app_version", gb.bcc());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", cq.yo(contextUef));
            String strMoa = com.bytedance.sdk.openadsdk.core.zjm.oa().moa();
            if (strMoa != null) {
                jSONObject.put("app_id", strMoa);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (strMoa != null) {
                strConcat = strMoa.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.lw.uef(strConcat));
            jSONObject.put("tcstring", dj.oa(contextUef));
            jSONObject.put("tcf_gdpr", dj.uef(contextUef));
            jSONObject.put("lmt", DeviceUtils.yo());
            jSONObject.put("locale_language", DeviceUtils.moa());
            jSONObject.put("channel", "main");
            JSONObject jSONObjectIvm = djVarMoa.ivm();
            if (jSONObjectIvm != null) {
                jSONObject.put("digest", jSONObjectIvm);
            }
            jSONObject.put("data_time", djVarMoa.xs());
            jSONObject.put("app_set_id_scope", moa.oa());
            jSONObject.put("app_set_id", moa.yo());
            jSONObject.put("installed_source", moa.moa());
            jSONObject.put("did", cq.uef(sy.uef()));
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            String strXs = com.bytedance.sdk.openadsdk.core.zjm.oa().xs();
            if (!TextUtils.isEmpty(strXs)) {
                jSONObject.put("mediation", strXs);
            }
            jSONObject.put("device", DeviceUtils.uef(contextUef, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.zjm.oa().orq());
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.dj.oa.uef().bcc());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean uef(JSONObject jSONObject) {
        this.f25740oa.uef(jSONObject);
        for (lw lwVar : this.yo) {
            if (lwVar != null) {
                lwVar.uef(jSONObject);
            }
        }
        return this.f25740oa.yo;
    }
}
