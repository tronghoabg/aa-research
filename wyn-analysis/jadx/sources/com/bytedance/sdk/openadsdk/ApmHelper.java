package com.bytedance.sdk.openadsdk;

import A7.AbstractC0279p0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.bcc.oa.yo;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.common.ivm;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.rt;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ApmHelper {
    private static uef ivm = null;
    private static oa lw = null;
    private static boolean moa = false;

    /* renamed from: oa, reason: collision with root package name */
    private static final AtomicBoolean f25127oa = new AtomicBoolean(false);
    private static volatile boolean uef = false;
    private static String yo;

    public interface oa {
        void uef(String str, String str2, Throwable th);
    }

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public final String f25131oa;
        public final String uef;
        public final Throwable yo;

        public uef(String str, String str2, Throwable th) {
            this.uef = str;
            this.f25131oa = str2;
            this.yo = th;
        }
    }

    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            jSONObject.put("ipv6", com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", sy.moa().au());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new rt(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "3";
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initAPM() {
        if (ivm.uef()) {
            return;
        }
        try {
            String strMoa = zjm.oa().moa();
            if (TextUtils.isEmpty(strMoa)) {
                return;
            }
            initApm(sy.uef(), strMoa);
        } catch (Exception unused) {
        }
    }

    public static void initApm(final Context context, final String str) {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || !f25127oa.compareAndSet(false, true) || uef) {
            return;
        }
        km.uef(new yo("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.uef) {
                    dj djVarMoa = sy.moa();
                    boolean unused = ApmHelper.moa = djVarMoa.ix();
                    String strSy = gb.sy();
                    if (ApmHelper.moa && !TextUtils.isEmpty(strSy)) {
                        String unused2 = ApmHelper.yo = str;
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String strUef = cq.uef(context);
                        try {
                            Npth.setCrashWaitTime(lw.uef("apm_crash_wait_time", 10000));
                            Npth.enableLoopMonitor(false);
                            Npth.enableAnrInfo(false);
                            Npth.enableNativeDump(false);
                            Npth.enableActivityDump(false);
                            Npth.enableMessageDump(false);
                            MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.CustomRequestHeader
                                public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                    Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                    httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                    httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                    httpURLConnection.setRequestProperty("x-pangle-target-idc", sy.moa().jp());
                                }
                            });
                            final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 8005L, BuildConfig.VERSION_NAME, strArr);
                            monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.apm.insight.AttachUserData
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> mapXs = ApmHelper.xs();
                                    if (mapXs.containsKey("render_type")) {
                                        monitorCrashInitSDK.addTags("render_type", mapXs.get("render_type"));
                                        return mapXs;
                                    }
                                    monitorCrashInitSDK.addTags("render_type", "-2");
                                    return mapXs;
                                }
                            });
                            if (djVarMoa.dv()) {
                                monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                            }
                            monitorCrashInitSDK.config().setDeviceId(strUef);
                            monitorCrashInitSDK.setReportUrl(strSy);
                            monitorCrashInitSDK.addTags("host_appid", str);
                            monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            oa unused3 = ApmHelper.lw = new oa() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.oa
                                public void uef(String str2, String str3, Throwable th) {
                                    monitorCrashInitSDK.reportCustomErr(str2, str3, th);
                                }
                            };
                            boolean unused4 = ApmHelper.uef = true;
                            ApmHelper.yo(strUef, strSy);
                            uef uefVar = ApmHelper.ivm;
                            uef unused5 = ApmHelper.ivm = null;
                            if (uefVar != null) {
                                ApmHelper.lw.uef(uefVar.uef, uefVar.f25131oa, uefVar.yo);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.uef = false;
                        }
                    }
                }
                ApmHelper.f25127oa.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return uef;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        oa oaVar = lw;
        if (oaVar != null) {
            oaVar.uef(str, str2, th);
        } else {
            ivm = new uef(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() throws JSONException {
        if (moa) {
            oa(cq.uef(sy.uef()), gb.sy());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> xs() {
        HashMap map = new HashMap();
        gzw gzwVarMoa = com.bytedance.sdk.openadsdk.utils.oa.moa();
        if (gzwVarMoa != null) {
            map.put("adType", String.valueOf(gzwVarMoa.epe()));
            map.put("aid", String.valueOf(gzwVarMoa.qt()));
            map.put("cid", gzwVarMoa.iou());
            map.put("reqId", gzwVarMoa.ofp());
            map.put("rit", gzwVarMoa.fz("-1"));
            int iIx = gzwVarMoa.ix();
            if (gzwVarMoa.ggp() != 2) {
                iIx = -1;
            }
            map.put("render_type", String.valueOf(iIx));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo(String str, String str2) throws JSONException {
        oa(str, str2);
    }

    private static void oa(String str, String str2) throws JSONException {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || TextUtils.isEmpty(str2)) {
            return;
        }
        String strL = AbstractC0279p0.l("https://", str2, "/monitor/collect/c/session?version_code=8005&device_platform=android&aid=10000001");
        sy.yo().uef(oa(str), strL);
    }

    private static JSONObject oa(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", yo);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e7) {
            dhk.yo("ApmHelper", e7.getMessage());
            return jSONObject;
        }
    }
}
