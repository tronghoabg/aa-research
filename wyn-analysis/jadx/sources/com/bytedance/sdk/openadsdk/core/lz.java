package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lz implements fz {

    /* renamed from: oa, reason: collision with root package name */
    private static final Map<Integer, String> f25632oa = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.lz.1
        {
            AbstractC1593a.p(1, this, "is_init", 2, "abtest");
            AbstractC1593a.p(3, this, "language", 4, "ad_sdk_version");
            AbstractC1593a.p(5, this, "package_name", 6, "user_data");
            AbstractC1593a.p(7, this, "ts", 8, "ipv4");
            AbstractC1593a.p(9, this, "ipv6", 10, "adx_id");
            AbstractC1593a.p(11, this, "target_region", 12, "gaid");
            AbstractC1593a.p(13, this, "did", 14, "banner");
            AbstractC1593a.p(15, this, "app_reg", 16, "apk-sign");
            AbstractC1593a.p(17, this, "screen_scale", 18, "app_set_id_scope");
            AbstractC1593a.p(19, this, "app_set_id", 20, "installed_source");
            AbstractC1593a.p(21, this, "app_running_time", 22, "js_render_ver");
            AbstractC1593a.p(23, this, "js_render_v3_ver", 24, "gp_v_name");
            AbstractC1593a.p(25, this, "gp_v_code", 26, "vendor");
            AbstractC1593a.p(27, this, "model", 28, "user_agent_device");
            AbstractC1593a.p(29, this, "user_agent_webview", 30, "sys_compiling_time");
            AbstractC1593a.p(31, this, "screen_height", 32, "screen_width");
            AbstractC1593a.p(33, this, "rom_version", 34, "carrier_name");
            AbstractC1593a.p(35, this, "os_version", 36, "conn_type");
            AbstractC1593a.p(37, this, "boot", 38, "oem_store");
            AbstractC1593a.p(39, this, "board", 40, "timezone");
            AbstractC1593a.p(41, this, "device_city", 42, "cpu_num");
            AbstractC1593a.p(43, this, "density", 44, "bt_time");
            AbstractC1593a.p(45, this, "bt_id", 46, "sec_did");
            AbstractC1593a.p(47, this, "X-Armors", 48, "url");
            AbstractC1593a.p(49, this, "pangle_m", 50, "ec");
            AbstractC1593a.p(51, this, "pglx", 52, "md");
            AbstractC1593a.p(53, this, "bp", 54, "t_ver");
            AbstractC1593a.p(55, this, "is_fold", 56, "aab");
            AbstractC1593a.p(57, this, "abi", 58, "is_multi");
            AbstractC1593a.p(59, this, "w_ver", 60, "feature_data");
        }
    };
    private final AtomicReference<JSONObject> uef = new AtomicReference<>();
    private int yo = 0;

    private static void bcc(final String str) {
        try {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.lz.4
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("bidding_token");
                    uefVarF.xs(lz.dj(str).toString());
                    return uefVarF;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void cz(final String str) {
        try {
            com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.lz.5
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("bidding_token");
                    uefVarF.xs(lz.dj(str).toString());
                    return uefVarF;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject dj(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static boolean ivm(String str) {
        return "TX".equals(str);
    }

    private static void zjm(final String str) {
        try {
            com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.lz.6
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("bidding_token");
                    uefVarF.xs(lz.dj(str).toString());
                    return uefVarF;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAdManagerImpl", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    /* renamed from: lw, reason: merged with bridge method [inline-methods] */
    public lz oa(String str) {
        zjm.oa().yo(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public lz uef(String str) throws JSONException {
        zjm.oa().uef(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public String yo() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public int lw() {
        return zjm.oa().zjm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public fz moa(int i5) {
        zjm.oa().moa(i5);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public fz oa() {
        com.bytedance.sdk.component.utils.wk.uef("PangleSDK-8005");
        com.bykv.vk.openvk.uef.uef.uef.xs.yo.uef("PangleSDK-8005");
        com.bytedance.sdk.component.utils.dhk.uef("PangleSDK-8005");
        com.bytedance.sdk.component.utils.wk.uef();
        com.bytedance.sdk.component.xs.uef.uef();
        com.bykv.vk.openvk.uef.uef.uef.xs.yo.uef();
        com.bytedance.sdk.component.utils.dhk.uef();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public fz uef(int i5) {
        zjm.oa().lw(i5);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public fz yo(int i5) {
        zjm.oa().yo(i5);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public int moa() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public void uef(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        long j8;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.gb.wrv("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                bcc(adxId);
                String strDor = sy.moa().dor();
                int size = 2;
                AdSlot adSlotBuild = null;
                if (!com.bytedance.sdk.openadsdk.core.dj.oa.uef().ivm()) {
                    pAGBidError = new PAGBidError(40060, cz.uef(40060));
                } else if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().moa()) {
                    pAGBidError = new PAGBidError(10007, cz.uef(10007));
                } else if (!com.bytedance.sdk.openadsdk.core.dj.oa.uef().cz()) {
                    pAGBidError = new PAGBidError(10008, cz.uef(10008));
                } else if (TextUtils.isEmpty(strDor)) {
                    pAGBidError = new PAGBidError(10011, cz.uef(10011));
                    uef(5, pAGBiddingRequest);
                } else if (!ivm(strDor) || sy.moa().cp(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(10006, cz.uef(10006));
                    uef(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    zjm(adxId);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().dj() && zjm.oa().dj()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, cz.uef(10004)));
                    zjm(adxId);
                    uef(3, pAGBiddingRequest);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.wrv.yo.uef();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_init", wk.lw() ? 1 : 0);
                String strZjm = sy.moa().zjm();
                String strCp = sy.moa().cp();
                if (strZjm != null && strCp != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("version", strZjm);
                    jSONObject2.put("param", strCp);
                    jSONObject.put("abtest", jSONObject2);
                }
                jSONObject.put("language", cq.oa());
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.gb.ivm());
                if (pAGBiddingRequest != null) {
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlotBuild = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", gsd.uef(adSlotBuild));
                }
                jSONObject.put("ts", System.currentTimeMillis() / 1000);
                String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                if (!strOa.isEmpty()) {
                    jSONObject.put("ipv6", strOa);
                } else {
                    String strOa2 = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", "key_ipv4", "");
                    if (!strOa2.isEmpty()) {
                        jSONObject.put("ipv4", strOa2);
                    }
                }
                jSONObject.put("adx_id", adxId);
                Object objJp = sy.moa().jp();
                jSONObject.put("target_region", objJp);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.dj djVarMoa = sy.moa();
                    com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(jSONObject);
                    String strUef = cq.uef(sy.uef());
                    if (TextUtils.isEmpty(strUef)) {
                        j8 = 1000;
                    } else {
                        j8 = 1000;
                        try {
                            jSONObject.put("did", Long.parseLong(strUef));
                        } catch (Throwable unused) {
                        }
                    }
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", uef(pAGBiddingRequest));
                    }
                    jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.dj.oa.uef().ivm() ? 1 : 0);
                    Context contextUef = sy.uef();
                    jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.yo.cz());
                    jSONObject.put("screen_scale", com.bytedance.sdk.openadsdk.utils.af.ivm(contextUef));
                    jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.moa.oa());
                    jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.moa.yo());
                    jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.moa.moa());
                    jSONObject.put("app_running_time", (System.currentTimeMillis() - wk.uef()) / j8);
                    jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.zjm.cq.yo());
                    jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.zjm.cq.moa());
                    jSONObject.put("gp_v_name", DeviceUtils.lw(contextUef));
                    jSONObject.put("gp_v_code", DeviceUtils.ivm(contextUef));
                    jSONObject.put("vendor", Build.MANUFACTURER);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.gb.oa());
                    jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.gb.moa());
                    jSONObject.put("sys_compiling_time", cq.oa(contextUef));
                    jSONObject.put("screen_height", com.bytedance.sdk.openadsdk.utils.af.lw(contextUef));
                    jSONObject.put("screen_width", com.bytedance.sdk.openadsdk.utils.af.yo(contextUef));
                    jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.pz.uef());
                    jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ku.uef());
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.gb.bcc(contextUef));
                    if (djVarMoa.pz("boot")) {
                        jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                    }
                    com.bytedance.sdk.openadsdk.utils.gb.uef(jSONObject);
                    jSONObject.put("board", Build.BOARD);
                    jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.gb.ue());
                    jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.gb.gsd());
                    jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.zjm.oa());
                    jSONObject.put("density", com.bytedance.sdk.openadsdk.utils.af.bcc(contextUef));
                    DeviceUtils.uef(jSONObject);
                    com.bytedance.sdk.openadsdk.core.wrv.yo.uef(jSONObject);
                    com.bytedance.sdk.openadsdk.utils.bcc.uef(jSONObject, contextUef);
                    jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.tpx.uef(contextUef));
                    com.bytedance.sdk.openadsdk.utils.bcc.oa(jSONObject, contextUef);
                    size = f25632oa.size();
                }
                while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(f25632oa.get(Integer.valueOf(size)));
                    size--;
                }
                com.bytedance.sdk.openadsdk.ivm.oa.uef().uef(jSONObject);
                JSONObject jSONObjectUef = uef(jSONObject);
                while (size > 0 && jSONObjectUef.toString().getBytes().length > 12288) {
                    jSONObject.remove(f25632oa.get(Integer.valueOf(size)));
                    jSONObjectUef = uef(jSONObject);
                    size--;
                }
                if (jSONObjectUef.length() > 0) {
                    jSONObjectUef.put("target_region", objJp);
                }
                if (com.bytedance.sdk.component.utils.wk.yo()) {
                    jSONObjectUef.toString();
                    int length = jSONObjectUef.toString().getBytes().length;
                }
                jSONObjectUef.toString();
                pAGBidCallback.onBiddingTokenCollected(jSONObjectUef.toString());
                cz(adxId);
            } catch (Throwable unused2) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "unknow error"));
                uef(4, pAGBiddingRequest);
                zjm(str);
            }
        } catch (Throwable unused3) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public fz yo(String str) {
        zjm.oa().bcc(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fz
    public fz oa(int i5) {
        this.yo = i5;
        return this;
    }

    public void uef(int i5, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String strOrq = zjm.oa().orq();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean zSyr = sy.moa().syr();
            Set<String> setUf = sy.moa().uf();
            JSONArray jSONArray = new JSONArray();
            if (setUf != null) {
                Iterator<String> it = setUf.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String strDor = com.bytedance.sdk.openadsdk.core.settings.dj.oa().dor();
            int iLw = lw();
            int iMoa = wk.moa();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", strOrq);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", zSyr ? 1 : 0);
            if (!TextUtils.isEmpty(strDor)) {
                str = strDor;
            }
            jSONObject.put("setting_dc", str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", iLw);
            jSONObject.put("init_state", iMoa);
            jSONObject.put("reason", i5);
            if (wk.lw()) {
                com.bytedance.sdk.openadsdk.ab.moa.uef("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.lz.2
                    @Override // com.bytedance.sdk.openadsdk.ab.oa
                    public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                        return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("biddingtoken_error").oa(jSONObject.toString());
                    }
                });
                final JSONObject andSet = this.uef.getAndSet(null);
                if (andSet != null) {
                    com.bytedance.sdk.openadsdk.ab.moa.uef("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.lz.3
                        @Override // com.bytedance.sdk.openadsdk.ab.oa
                        public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                            return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("biddingtoken_error").oa(andSet.toString());
                        }
                    });
                    return;
                }
                return;
            }
            AtomicReference<JSONObject> atomicReference = this.uef;
            while (!atomicReference.compareAndSet(null, jSONObject) && atomicReference.get() == null) {
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static JSONObject uef(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static JSONObject uef(JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new rt(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        gr.uef(jSONObjectEncryptType4);
        return jSONObjectEncryptType4 != null ? jSONObjectEncryptType4 : new JSONObject();
    }
}
