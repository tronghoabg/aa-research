package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa extends lz {
    private static volatile ArrayList<String> uef;

    /* renamed from: oa, reason: collision with root package name */
    private int f25635oa = 12288;

    private void bcc(final String str) {
        try {
            com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.moa.1
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa("bidding_token");
                    uefVar.lw("new");
                    uefVar.xs(moa.this.dj(str).toString());
                    return uefVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void cz(final String str) {
        try {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.moa.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa("bidding_token");
                    uefVar.lw("new");
                    uefVar.xs(moa.this.dj(str).toString());
                    return uefVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject dj(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private void zjm(final String str) {
        try {
            com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.moa.3
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa("bidding_token");
                    uefVar.lw("new");
                    uefVar.xs(moa.this.dj(str).toString());
                    return uefVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("BiddingTokenGenerator", th.getMessage());
        }
    }

    public static class uef extends JSONObject {
        private ArrayList<String> uef;

        public uef(boolean z2) {
            if (z2) {
                this.uef = new ArrayList<>();
            }
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, boolean z2) throws JSONException {
            ArrayList<String> arrayList = this.uef;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z2);
        }

        @Override // org.json.JSONObject
        public JSONObject putOpt(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.uef;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }

        public ArrayList<String> uef() {
            return this.uef;
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, double d3) throws JSONException {
            ArrayList<String> arrayList = this.uef;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d3);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, int i5) throws JSONException {
            ArrayList<String> arrayList = this.uef;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i5);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, long j8) throws JSONException {
            ArrayList<String> arrayList = this.uef;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j8);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.uef;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }
    }

    private static void uef(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws Throwable {
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
            jSONObject.put("user_data", gsd.uef(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
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
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", sy.moa().jp());
        com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(jSONObject);
        String strUef = cq.uef(sy.uef());
        if (!TextUtils.isEmpty(strUef)) {
            try {
                jSONObject.put("did", Long.parseLong(strUef));
            } catch (Throwable unused) {
            }
        }
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", lz.uef(pAGBiddingRequest));
        }
        com.bytedance.sdk.openadsdk.core.settings.dj djVarMoa = sy.moa();
        jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.dj.oa.uef().ivm() ? 1 : 0);
        Context contextUef = sy.uef();
        jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.yo.cz());
        jSONObject.put("screen_scale", com.bytedance.sdk.openadsdk.utils.af.ivm(contextUef));
        jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.moa.oa());
        jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.moa.yo());
        jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.moa.moa());
        jSONObject.put("app_running_time", (System.currentTimeMillis() - wk.uef()) / 1000);
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
        com.bytedance.sdk.openadsdk.ivm.oa.uef().uef(jSONObject);
    }

    private void uef(final int i5, final int i10, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.ab.moa.uef("bid_tok_len_over_lim", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.moa.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i5);
                jSONObject.put("len_af_rm", i10);
                jSONObject.put("len_lm", moa.this.f25635oa);
                jSONObject.put("re_f_key", str2);
                jSONObject.put("adx_id", str);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("bid_tok_len_over_lim").oa(jSONObject.toString());
            }
        });
    }

    public boolean uef() {
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.gzw.lw.uef("bid_tok_con", (Object) null, com.bytedance.sdk.openadsdk.gzw.oa.uef);
        if (jSONObject == null) {
            return false;
        }
        this.f25635oa = jSONObject.optInt("en_m_l", this.f25635oa);
        return jSONObject.optInt("enable", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lz, com.bytedance.sdk.openadsdk.core.fz
    public void uef(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String adxId = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.gb.wrv("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                adxId = pAGBiddingRequest.getAdxId();
            }
            cz(adxId);
            String strDor = sy.moa().dor();
            String str = null;
            if (!com.bytedance.sdk.openadsdk.core.dj.oa.uef().ivm()) {
                pAGBidError = new PAGBidError(40060, cz.uef(40060));
            } else if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().moa()) {
                pAGBidError = new PAGBidError(10007, cz.uef(10007));
            } else if (!com.bytedance.sdk.openadsdk.core.dj.oa.uef().cz()) {
                pAGBidError = new PAGBidError(10008, cz.uef(10008));
            } else if (TextUtils.isEmpty(strDor)) {
                pAGBidError = new PAGBidError(10011, cz.uef(10011));
                uef(5, pAGBiddingRequest);
            } else if (!lz.ivm(strDor) || sy.moa().cp(adxId)) {
                pAGBidError = null;
            } else {
                pAGBidError = new PAGBidError(10006, cz.uef(10006));
                uef(2, pAGBiddingRequest);
            }
            if (pAGBidError != null) {
                pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                bcc(adxId);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().dj() && zjm.oa().dj()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, cz.uef(10004)));
                bcc(adxId);
                uef(3, pAGBiddingRequest);
                return;
            }
            com.bytedance.sdk.openadsdk.core.wrv.yo.uef();
            uef uefVar = new uef(uef == null);
            uef(uefVar, pAGBiddingRequest, adxId);
            ArrayList<String> arrayListUef = uefVar.uef();
            if (arrayListUef != null) {
                uef = arrayListUef;
            }
            JSONObject jSONObjectUef = lz.uef(uefVar);
            int i5 = -1;
            int size = uef != null ? uef.size() - 1 : -1;
            while (true) {
                length = jSONObjectUef.toString().getBytes().length;
                if (length > this.f25635oa) {
                    if (i5 < 0) {
                        i5 = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str = uef.get(size);
                    uefVar.remove(str);
                    size--;
                    jSONObjectUef = lz.uef(uefVar);
                } else {
                    break;
                }
            }
            if (jSONObjectUef.length() > 0) {
                jSONObjectUef.put("target_region", sy.moa().jp());
            }
            pAGBidCallback.onBiddingTokenCollected(jSONObjectUef.toString());
            zjm(adxId);
            if (i5 >= 0) {
                uef(i5, length, adxId, str);
            }
        } catch (Throwable unused) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "unknow error"));
            uef(4, pAGBiddingRequest);
            bcc("");
        }
    }
}
