package com.bytedance.sdk.component.adexpress.dynamic.moa;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.lw.dj;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xs {
    private String ivm;
    private lw lw;
    private ivm moa;

    /* renamed from: oa, reason: collision with root package name */
    public String f24868oa;
    public int uef;
    public JSONObject yo;

    public xs(lw lwVar) {
        this.lw = lwVar;
        this.uef = lwVar.uef();
        this.f24868oa = lwVar.yo();
        this.yo = lwVar.lw().ot();
        this.ivm = lwVar.moa();
        if (com.bytedance.sdk.component.adexpress.moa.yo() == 1) {
            this.moa = lwVar.xs();
        } else {
            this.moa = lwVar.lw();
        }
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            this.moa = lwVar.lw();
        }
    }

    private boolean aos() {
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f24868oa) && this.f24868oa.contains("adx:")) || dj.oa();
    }

    private boolean dh() {
        return (com.bytedance.sdk.component.adexpress.moa.oa() && (this.lw.oa().contains("logo-union") || this.lw.oa().contains("logounion") || this.lw.oa().contains("logoad"))) || "logo-union".equals(this.lw.oa()) || "logounion".equals(this.lw.oa()) || "logoad".equals(this.lw.oa());
    }

    public int ab() {
        return uef(this.moa.gr());
    }

    public int af() {
        return this.moa.xvp();
    }

    public int au() {
        return this.moa.ifk();
    }

    public int bcc() {
        String strTpx = this.moa.tpx();
        if ("left".equals(strTpx)) {
            return 17;
        }
        if ("center".equals(strTpx)) {
            return 4;
        }
        return "right".equals(strTpx) ? 3 : 2;
    }

    public float bs() {
        return this.moa.wrv();
    }

    public int cop() {
        return this.moa.jp();
    }

    public double cp() {
        return this.moa.bcc();
    }

    public double cq() throws NumberFormatException {
        if (this.uef == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.moa.oa() ? (int) r0 : Double.parseDouble(this.f24868oa);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public int cz() {
        int iBcc = bcc();
        if (iBcc == 4) {
            return 17;
        }
        return iBcc == 3 ? 8388613 : 8388611;
    }

    public boolean dhk() {
        return this.moa.ykf();
    }

    public String dj() {
        return this.uef == 1 ? this.f24868oa : "";
    }

    public int dor() {
        return this.moa.uu();
    }

    public String dv() {
        return this.moa.lo();
    }

    public int dxx() {
        return this.moa.lw();
    }

    public double dz() {
        return this.moa.oib();
    }

    public int etd() {
        return this.moa.cl();
    }

    public int fz() {
        return this.moa.oa();
    }

    public boolean gb() {
        return this.moa.ggp();
    }

    public int gem() {
        return this.moa.xs();
    }

    public boolean ggp() {
        return this.moa.tc();
    }

    public long gr() {
        return this.moa.xw();
    }

    public String gsd() {
        return this.moa.gb();
    }

    public int gzw() {
        return this.moa.gem();
    }

    public int hg() {
        return this.moa.lz();
    }

    public double hnk() {
        return this.moa.km();
    }

    public boolean hts() {
        return this.moa.fz();
    }

    public String ivm() {
        return this.uef == 0 ? !TextUtils.isEmpty(this.f24868oa) ? this.f24868oa : this.yo.optString(com.bytedance.sdk.component.adexpress.moa.xs.yo(com.bytedance.sdk.component.adexpress.moa.uef())) : "";
    }

    public boolean ix() {
        return this.moa.qn();
    }

    public String jkf() {
        return this.moa.hdd();
    }

    public String km() {
        return this.moa.zjm();
    }

    public int ku() {
        return this.moa.yo();
    }

    public float lw() {
        return this.moa.sy();
    }

    public int lz() {
        return this.moa.moa();
    }

    public int moa() {
        return (int) this.moa.ab();
    }

    public String ne() {
        return this.moa.rt();
    }

    public boolean nkh() {
        return this.moa.cq();
    }

    public int oa() {
        return (int) this.moa.bs();
    }

    public int oib() {
        return this.moa.meb();
    }

    public boolean orq() {
        return this.moa.swd();
    }

    public String ot() {
        return this.moa.wp();
    }

    public double ou() {
        return this.moa.oyt();
    }

    public int oyt() {
        return this.moa.cz();
    }

    public String pu() {
        return this.moa.af();
    }

    public int pz() {
        return uef(this.moa.gzw());
    }

    public String rj() {
        return this.moa.cp();
    }

    public String rl() {
        return this.moa.pu();
    }

    public String rt() {
        return this.moa.efa();
    }

    public int sk() {
        return this.moa.sw();
    }

    public int sw() {
        return this.moa.us();
    }

    public boolean swd() {
        return this.moa.vep();
    }

    public int sy() {
        return this.moa.wf();
    }

    public String tpx() {
        return this.moa.gsd();
    }

    public int ue() {
        String strGb = this.moa.gb();
        if ("skip-with-time-skip-btn".equals(this.lw.oa()) || "skip".equals(this.lw.oa()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.lw.oa())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.lw.oa()) && !"skip-with-time".equals(this.lw.oa())) {
            if (this.uef == 10 && TextUtils.equals(this.moa.af(), "click")) {
                return 5;
            }
            if (dh() && aos()) {
                return 0;
            }
            if (dh()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.lw.oa())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strGb) && !strGb.equals("none")) {
                if (strGb.equals(MimeTypes.BASE_TYPE_VIDEO) || (this.lw.uef() == 7 && TextUtils.equals(strGb, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.moa.oa() && this.lw.lw() != null && this.lw.lw().wd()) ? 11 : 4;
                }
                if (strGb.equals("normal")) {
                    return 1;
                }
                return (strGb.equals("creative") || "slide".equals(this.moa.af())) ? 2 : 0;
            }
        }
        return 0;
    }

    public int uef() {
        return (int) this.moa.dz();
    }

    public boolean uqx() {
        return this.moa.qn();
    }

    public int vj() {
        return this.moa.tam();
    }

    public int vjj() {
        return this.moa.aje();
    }

    public String vyg() {
        return this.moa.ku();
    }

    public float wk() {
        return this.moa.dj();
    }

    public String wrv() {
        return this.ivm;
    }

    public int wxf() {
        return this.moa.dxx();
    }

    public int xs() {
        return uef(this.moa.orq());
    }

    public int xvp() {
        return this.moa.fjj();
    }

    public int yo() {
        return (int) this.moa.wk();
    }

    public String zjm() {
        int i5 = this.uef;
        return (i5 == 2 || i5 == 13) ? this.f24868oa : "";
    }

    public String zou() {
        return this.moa.ej();
    }

    public static float[] oa(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void uef(float f10) {
        this.moa.uef(f10);
    }

    public static int uef(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean uef(int i5) {
        lw lwVar = this.lw;
        if (lwVar == null) {
            return false;
        }
        if (i5 == 1) {
            this.moa = lwVar.xs();
        } else {
            this.moa = lwVar.lw();
        }
        return this.moa != null;
    }
}
