package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cp {

    /* renamed from: ab, reason: collision with root package name */
    private String f25663ab;
    private int bcc;
    private String bs;
    private int cq;
    private int cz;
    private int dj;
    private int dz;
    private String ivm;
    private String lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25664oa;
    private String sy;
    private int uef;
    private int wk;
    private int wrv;
    private int xs;
    private boolean yo;
    private boolean zjm;

    public cp(JSONObject jSONObject) {
        this.wrv = 5;
        this.cq = 5;
        this.dz = 10;
        this.wk = 20;
        this.f25663ab = "Next Ad";
        this.bs = "Next ad in %1$ds";
        this.sy = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.yo = jSONObject.optBoolean("is_playable");
        this.moa = jSONObject.optInt("playable_type", 0);
        this.lw = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.ivm = jSONObjectOptJSONObject.optString("playable_url", "");
            this.xs = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.f25664oa = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.uef = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iUef = uef(this.moa);
            this.bcc = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iUef);
            this.cz = jSONObjectOptJSONObject.optInt("playable_js_timeout", iUef);
            this.zjm = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.wrv = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.cq = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.dz = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.wk = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.bs = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.f25663ab = jSONObjectOptJSONObject.optString("next_ad_text");
            this.sy = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.dj = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.dj = 0;
        }
    }

    public static boolean ab(gzw gzwVar) {
        return false;
    }

    public static boolean bcc(gzw gzwVar) {
        cp cpVarVyg = gzwVar.vyg();
        return cpVarVyg != null && gzwVar.geh() && cpVarVyg.yo && cpVarVyg.f25664oa == 1;
    }

    public static long bs(gzw gzwVar) {
        return Math.max(sy(gzwVar), oib(gzwVar));
    }

    private static int cp(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.moa;
    }

    public static boolean cq(gzw gzwVar) {
        return true;
    }

    public static int cz(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.dj;
    }

    public static boolean dhk(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        return cpVarPz != null && cpVarPz.zjm();
    }

    public static String dj(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return null;
        }
        return cpVarPz.ivm;
    }

    public static boolean dz(gzw gzwVar) {
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
        return oaVarNj != null && oaVarNj.dhk() == 1;
    }

    public static int gr(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.yo();
    }

    public static String gsd(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return null;
        }
        return cpVarPz.ivm();
    }

    public static String gzw(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return null;
        }
        return cpVarPz.xs();
    }

    public static long oib(gzw gzwVar) {
        if (pz(gzwVar) == null) {
            return 5L;
        }
        return r2.cz();
    }

    public static String orq(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return null;
        }
        return cpVarPz.lw();
    }

    private static cp pz(gzw gzwVar) {
        if (gzwVar == null) {
            return null;
        }
        return gzwVar.vyg();
    }

    public static int rt(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.oa();
    }

    public static long sy(gzw gzwVar) {
        if (pz(gzwVar) == null) {
            return 5L;
        }
        return r2.bcc();
    }

    public static int tpx(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.uef();
    }

    public static int ue(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.moa();
    }

    private static int uef(int i5) {
        return i5 == 1 ? 10 : 5;
    }

    public static int wk(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return 0;
        }
        return cpVarPz.xs;
    }

    public static String wrv(gzw gzwVar) {
        if (gzwVar == null) {
            return null;
        }
        cp cpVarVyg = gzwVar.vyg();
        if (cpVarVyg != null && cpVarVyg.yo) {
            String str = cpVarVyg.ivm;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (gzwVar.wxf() == 20) {
            return gzwVar.cc();
        }
        if (gzwVar.nj() != null) {
            return gzwVar.nj().wrv();
        }
        return null;
    }

    public static String zjm(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        if (cpVarPz == null) {
            return null;
        }
        return cpVarPz.lw;
    }

    public String ivm() {
        return this.bs;
    }

    public String lw() {
        return this.f25663ab;
    }

    public int moa() {
        return this.wk;
    }

    public int oa() {
        return this.cq;
    }

    public String xs() {
        return this.sy;
    }

    public int yo() {
        return this.dz;
    }

    public static boolean ivm(gzw gzwVar) {
        return lw(gzwVar) && cp(gzwVar) == 1;
    }

    public static boolean lw(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        return cpVarPz != null && gzwVar.geh() && cpVarPz.yo && !TextUtils.isEmpty(wrv(gzwVar));
    }

    public static boolean moa(gzw gzwVar) {
        return yo(gzwVar) && !xs(gzwVar);
    }

    public static boolean oa(gzw gzwVar) {
        cp cpVarPz = pz(gzwVar);
        return (cpVarPz == null || !cpVarPz.yo || TextUtils.isEmpty(wrv(gzwVar))) ? false : true;
    }

    public static boolean xs(gzw gzwVar) {
        cp cpVarVyg = gzwVar.vyg();
        return cpVarVyg != null && cpVarVyg.yo && cpVarVyg.f25664oa == 1;
    }

    public static boolean yo(gzw gzwVar) {
        return oa(gzwVar) && cp(gzwVar) == 1;
    }

    public int uef() {
        return this.wrv;
    }

    public static int uef(gzw gzwVar) {
        int i5;
        cp cpVarVyg = gzwVar.vyg();
        if (cpVarVyg != null && (i5 = cpVarVyg.uef) >= 0 && i5 <= 100) {
            return i5;
        }
        return 0;
    }

    public int cz() {
        return this.cz;
    }

    public boolean zjm() {
        return this.zjm;
    }

    public int bcc() {
        return this.bcc;
    }
}
