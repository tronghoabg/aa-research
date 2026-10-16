package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {

    /* renamed from: ab, reason: collision with root package name */
    public int f25748ab;
    public int bcc;
    public int bs;
    public boolean cp;
    public int cq;
    public int cz;
    public int dhk;
    public int dj;
    public JSONObject dxx;
    public int dz;
    public int fz;
    public int gr;
    public int gsd;
    public List<String> gzw;
    public int ivm;
    public boolean ku;
    public int lw;
    public int moa;

    /* renamed from: oa, reason: collision with root package name */
    public int f25749oa;
    public int oib;
    public int orq;
    public boolean pz;
    public int rt;
    public int sy;
    public boolean tpx;

    /* renamed from: ue, reason: collision with root package name */
    public int f25750ue;
    public String uef;
    public int wk;
    public int wrv;
    public int xs;
    public int yo;
    public int zjm;

    public oa(JSONObject jSONObject) {
        this.f25749oa = 1;
        this.yo = 1;
        this.moa = 2;
        this.lw = 1;
        this.ivm = 100;
        this.xs = 0;
        this.bcc = 2;
        this.cz = 1;
        this.zjm = 3;
        this.dj = 30;
        this.wrv = 30;
        this.cq = 1;
        this.dz = 1;
        this.wk = 2;
        this.f25748ab = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.bs = 2;
        this.sy = 3500;
        this.oib = 0;
        this.dhk = 5;
        this.tpx = false;
        this.orq = 0;
        this.gsd = 2;
        this.rt = 0;
        this.gr = 0;
        this.f25750ue = 5;
        this.pz = true;
        this.cp = false;
        this.ku = false;
        this.fz = -1;
        new JSONObject();
        this.dxx = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.uef = jSONObject.optString("code_id");
        this.f25749oa = jSONObject.optInt("auto_play", 1);
        this.fz = jSONObject.optInt("endcard_close_time", -1);
        this.yo = jSONObject.optInt("voice_control", 1);
        this.moa = jSONObject.optInt("rv_preload", 2);
        this.lw = jSONObject.optInt("nv_preload", 1);
        this.ivm = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.xs = jSONObject.optInt("skip_time_displayed", 0);
        this.bcc = jSONObject.optInt("video_skip_result", 2);
        this.cz = jSONObject.optInt("reg_creative_control", 1);
        this.zjm = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.dj = iOptInt;
        if (iOptInt < 0) {
            this.dj = 30;
        }
        this.cq = jSONObject.optInt("voice_control", 1);
        this.dz = jSONObject.optInt("if_show_win", 1);
        this.wk = jSONObject.optInt("sp_preload", 2);
        this.f25748ab = jSONObject.optInt("stop_time", TTAdConstant.STYLE_SIZE_RADIO_3_2);
        this.bs = jSONObject.optInt("native_playable_delay", 2);
        this.sy = jSONObject.optInt("time_out_control", -1);
        this.oib = jSONObject.optInt("playable_reward_type", 0);
        this.orq = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.dhk = iOptInt2;
        if (iOptInt2 < 0) {
            this.dhk = 5;
        }
        uef(jSONObject.optJSONArray("parent_tpl_ids"));
        this.gsd = jSONObject.optInt("slot_type", 2);
        this.tpx = jSONObject.optBoolean("close_on_click", false);
        this.rt = jSONObject.optInt("allow_system_back", 0);
        this.gr = jSONObject.optInt("splash_skip_time", 0);
        this.f25750ue = jSONObject.optInt("splash_image_count_down_time", 5);
        this.cp = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.ku = jSONObject.optBoolean("splash_close_on_click", false);
        this.pz = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!uef(this.yo)) {
            this.yo = 1;
        }
        if (!uef(this.cq)) {
            this.cq = 1;
        }
        this.wrv = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean uef(int i5) {
        return i5 == 1 || i5 == 2;
    }

    public void uef(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.gzw = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                this.gzw.add(jSONArray.get(i5).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public oa(String str, int i5) {
        this.f25749oa = 1;
        this.yo = 1;
        this.moa = 2;
        this.lw = 1;
        this.ivm = 100;
        this.xs = 0;
        this.bcc = 2;
        this.cz = 1;
        this.zjm = 3;
        this.dj = 30;
        this.wrv = 30;
        this.cq = 1;
        this.dz = 1;
        this.wk = 2;
        this.f25748ab = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.bs = 2;
        this.sy = 3500;
        this.oib = 0;
        this.dhk = 5;
        this.tpx = false;
        this.orq = 0;
        this.gsd = 2;
        this.rt = 0;
        this.gr = 0;
        this.f25750ue = 5;
        this.pz = true;
        this.cp = false;
        this.ku = false;
        this.fz = -1;
        this.dxx = new JSONObject();
        this.uef = str;
        this.yo = i5;
    }
}
