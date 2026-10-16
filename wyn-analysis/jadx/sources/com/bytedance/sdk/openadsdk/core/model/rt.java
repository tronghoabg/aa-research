package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class rt {
    private int cq;
    private String cz;
    private boolean dj;
    private int dz;
    private int ivm;
    private int lw;
    private int moa;
    private oa oib;
    private dxx sy;
    private int uef;
    private JSONObject wrv;
    private JSONObject xs;
    private int yo;

    /* renamed from: oa, reason: collision with root package name */
    private int f25706oa = 10;
    private int bcc = 1;
    private uef zjm = new uef();
    private int wk = 1;

    /* renamed from: ab, reason: collision with root package name */
    private String f25705ab = "Next Ad";
    private String bs = "Next ad in %1$ds";

    public static rt uef(String str) {
        rt rtVar = new rt();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                rtVar.uef = jSONObject.optInt("auto_switch");
                rtVar.f25706oa = jSONObject.optInt("playable_preload_count");
                rtVar.yo = jSONObject.optInt("disable_on_interaction");
                rtVar.moa = jSONObject.optInt("ceiling_type");
                rtVar.lw = jSONObject.optInt("can_loop");
                rtVar.ivm = jSONObject.optInt("multi_skip_time", -1);
                rtVar.bcc = jSONObject.optInt("load_more_strategy");
                rtVar.wk = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                rtVar.xs = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    dxx dxxVarUef = dxx.uef(jSONObjectOptJSONObject);
                    rtVar.sy = dxxVarUef;
                    if (dxxVarUef != null && !TextUtils.isEmpty(dxxVarUef.yo())) {
                        com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef(new com.bytedance.sdk.openadsdk.core.cq.bcc.uef().uef(rtVar.sy.uef()).oa(rtVar.sy.oa()).yo(rtVar.sy.yo()).moa(rtVar.sy.moa()), "guide");
                    }
                    int iOptInt = rtVar.xs.optInt("delay_show_time", 5);
                    rtVar.cq = iOptInt;
                    if (iOptInt < 0) {
                        rtVar.cq = 5;
                    }
                    int iOptInt2 = rtVar.xs.optInt("dismiss_after_idle_time", 3);
                    rtVar.dz = iOptInt2;
                    if (iOptInt2 <= 0) {
                        rtVar.dz = 3;
                    }
                }
                rtVar.cz = jSONObject.optString("agg_endcard_url");
                rtVar.dj = jSONObject.optBoolean("has_more");
                rtVar.wrv = jSONObject.optJSONObject("session_params");
                rtVar.zjm = uef.uef(jSONObject.optJSONObject("layout_config"));
                rtVar.oib = oa.uef(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return rtVar;
    }

    public int ab() {
        return this.f25706oa;
    }

    public int bcc() {
        return this.bcc;
    }

    public oa bs() {
        return this.oib;
    }

    public boolean cq() {
        return this.dj;
    }

    public int cz() {
        return this.ivm;
    }

    public boolean dj() {
        return this.moa == 1;
    }

    public boolean dz() {
        return this.yo == 1;
    }

    public uef ivm() {
        return this.zjm;
    }

    public int lw() {
        return this.dz;
    }

    public int moa() {
        return this.cq;
    }

    public JSONObject oa() {
        dxx dxxVar = this.sy;
        if (dxxVar == null) {
            return null;
        }
        try {
            String strMoa = dxxVar.moa();
            if (!TextUtils.isEmpty(strMoa)) {
                return new JSONObject(strMoa);
            }
            String strUef = com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef("guide", this.sy.uef(), this.sy.oa());
            if (TextUtils.isEmpty(strUef)) {
                return null;
            }
            return new JSONObject(strUef);
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean wk() {
        return this.uef == 1;
    }

    public JSONObject wrv() {
        return this.wrv;
    }

    public String xs() {
        return this.cz;
    }

    public JSONObject yo() {
        dxx dxxVar = this.sy;
        if (dxxVar == null) {
            return null;
        }
        return dxxVar.lw();
    }

    public boolean zjm() {
        return this.lw == 1;
    }

    public static class oa {
        private float lw;
        private float moa;

        /* renamed from: oa, reason: collision with root package name */
        private String f25707oa;
        private int uef;
        private String yo;

        public static oa uef(JSONObject jSONObject) {
            oa oaVar = new oa();
            if (jSONObject == null) {
                return oaVar;
            }
            oaVar.uef = jSONObject.optInt("progress_type", 0);
            oaVar.f25707oa = jSONObject.optString("progress_color");
            oaVar.yo = jSONObject.optString("progress_background_color");
            oaVar.moa = jSONObject.optInt("progress_size", 0);
            oaVar.lw = jSONObject.optInt("bar_radius", 0);
            return oaVar;
        }

        public float lw() {
            return this.lw;
        }

        public float moa() {
            return this.moa;
        }

        public String oa() {
            return this.f25707oa;
        }

        public String yo() {
            return this.yo;
        }

        public int uef() {
            return this.uef;
        }
    }

    public static class uef {
        private int lw;
        private int moa;

        /* renamed from: oa, reason: collision with root package name */
        private int f25708oa;
        private int uef;
        private int yo;

        public static uef uef(JSONObject jSONObject) {
            uef uefVar = new uef();
            if (jSONObject == null) {
                return uefVar;
            }
            uefVar.uef = Math.max(0, jSONObject.optInt("padding_left", 0));
            uefVar.f25708oa = Math.max(0, jSONObject.optInt("padding_right", 0));
            uefVar.yo = Math.max(0, jSONObject.optInt("padding_top", 0));
            uefVar.moa = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            uefVar.lw = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return uefVar;
        }

        public int lw() {
            return this.lw;
        }

        public int moa() {
            return this.f25708oa;
        }

        public int oa() {
            return this.yo;
        }

        public int yo() {
            return this.uef;
        }

        public int uef() {
            return this.moa;
        }
    }

    public boolean uef() {
        return this.wk == 1;
    }
}
