package com.bytedance.sdk.openadsdk.core.cq.ivm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.ab;
import com.bytedance.adsdk.ugeno.core.dj;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.dxx;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs extends moa {
    private float cp;
    private boolean dxx;
    private float fz;
    private com.bytedance.adsdk.ugeno.oa.yo gr;
    private boolean ku;
    private float lz;
    private com.bytedance.sdk.openadsdk.core.widget.lw pz;
    private com.bytedance.adsdk.ugeno.oa.yo rt;

    /* renamed from: ue, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.oa.yo f25519ue;

    public xs(Context context, gzw gzwVar, boolean z2, uef uefVar, ViewGroup viewGroup) {
        super(context, gzwVar, z2, uefVar, viewGroup);
        this.ku = false;
        this.dxx = true;
        if (TextUtils.equals(this.orq, "fullscreen_interstitial_ad")) {
            this.cp = this.lw.qe();
        } else if (TextUtils.equals(this.orq, "rewarded_video")) {
            this.cp = this.lw.ho();
        }
    }

    private boolean ab() {
        gzw gzwVar = this.lw;
        return gzwVar != null && gzwVar.qn() == 1;
    }

    private void cq() {
        dj djVar = new dj();
        HashMap map = new HashMap();
        map.put("image_info", this.ivm.dj());
        map.put("cache_dir", this.ivm.dz());
        djVar.uef(map);
        djVar.uef(this.f25509oa);
        djVar.uef(this.moa);
        djVar.oa(this.gsd);
        this.uef.uef("ad", djVar);
    }

    private int dz() {
        cq();
        try {
            this.uef.uef(this.gsd, this.yo);
            if (this.yo != null) {
                wk();
                wrv();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm) {
                return 0;
            }
            this.ivm.dxx().oa();
            this.ivm.dxx().yo();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void wk() {
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarIvm = yoVar.ivm("RVCountdown");
        this.rt = yoVarIvm;
        if (yoVarIvm == 0) {
            this.rt = this.yo.ivm("FVCountdown");
        }
        if (this.rt == null) {
            this.rt = this.yo.ivm("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarIvm2 = this.yo.ivm("RVSkipView");
        this.gr = yoVarIvm2;
        if (yoVarIvm2 == 0) {
            this.gr = this.yo.ivm("FVSkipView");
        }
        if (this.gr == null) {
            this.gr = this.yo.ivm("AOSkipView");
        }
    }

    private void wrv() {
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.rt;
        if (yoVar != null) {
            yoVar.yo(8);
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVar2 = this.gr;
        if (yoVar2 != null) {
            yoVar2.yo(8);
        }
    }

    private void yo(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.gr;
        if (yoVar != null && (yoVar instanceof com.bytedance.sdk.openadsdk.core.cq.oa.ivm)) {
            int i10 = 0;
            if (!z2 && !z10) {
                i10 = 8;
            }
            yoVar.yo(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public com.bytedance.adsdk.ugeno.oa.yo bcc() {
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null) {
            return null;
        }
        return yoVar.ivm("VideoV3");
    }

    public int cz() {
        cq();
        this.uef.uef((wk) this);
        this.uef.uef((ab) this);
        if (ab()) {
            this.uef.uef(new yo());
        }
        dxx dxxVarAje = this.lw.aje();
        if (dxxVarAje == null) {
            try {
                if (com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm.uef(this.orq)) {
                    this.yo = this.uef.uef(this.moa, this.gsd, uef(dxxVarAje));
                } else {
                    this.yo = this.uef.uef(this.moa, this.gsd, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return 141;
            }
        } else {
            this.yo = this.uef.uef(this.moa, this.gsd, uef(dxxVarAje));
        }
        if (this.yo != null) {
            wk();
            this.f25519ue = this.yo.ivm("ProgressBar");
            wrv();
        }
        if (this instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm) {
            return 0;
        }
        this.ivm.dxx().oa();
        this.ivm.dxx().yo();
        return 0;
    }

    public void dj() {
        wrv wrvVar = this.uef;
        if (wrvVar != null) {
            wrvVar.uef(this.yo, "show", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public int moa() {
        if (!this.ivm.lz()) {
            return cz();
        }
        dhk.uef("UGenRender", "renderWidget: only update data");
        return dz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public JSONObject oa() {
        return this.ivm.yo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa, com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setSoundMute(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa, com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTime(CharSequence charSequence, int i5, int i10, boolean z2) throws NumberFormatException {
        wrv wrvVar;
        if (this.yo == null) {
            return;
        }
        boolean z10 = i5 == 1;
        if (TextUtils.equals(this.orq, "open_ad") && (wrvVar = this.uef) != null) {
            wrvVar.uef(this.yo, "countdown", charSequence);
        }
        oa(charSequence, z10, i10, z2);
        uef(charSequence, z10, i10, z2);
        yo(charSequence, z10, i10, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public JSONObject uef() {
        JSONObject jSONObjectYo = this.ivm.yo();
        if (jSONObjectYo != null) {
            return jSONObjectYo.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public com.bytedance.adsdk.ugeno.oa.yo xs() {
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null) {
            return null;
        }
        return yoVar.ivm("Playable");
    }

    public void zjm() {
        wrv wrvVar = this.uef;
        if (wrvVar != null) {
            wrvVar.uef(this.yo, "videoFail", new Object[0]);
        }
    }

    private void oa(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.f25519ue;
        if (yoVar != null && (yoVar instanceof com.bytedance.sdk.openadsdk.core.cq.oa.moa.yo)) {
            try {
                int i10 = Integer.parseInt((String) charSequence);
                if (this.dxx) {
                    this.fz = i5;
                    this.dxx = false;
                }
                float f10 = (float) (((0.5d / this.fz) * 100.0d) + this.lz);
                this.lz = f10;
                this.uef.uef(this.yo, "ProgressBar://progress", Float.valueOf(f10), Float.valueOf(this.cp));
                if (!z10 && i10 > 0 && !z2) {
                    ((com.bytedance.sdk.openadsdk.core.cq.oa.moa.yo) this.f25519ue).xs(500);
                    ((com.bytedance.sdk.openadsdk.core.cq.oa.moa.yo) this.f25519ue).uef((int) this.lz);
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.cq.oa.moa.yo) this.f25519ue).yo(8);
            } catch (Throwable th) {
                dhk.yo("UGenRender", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public void uef(com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        this.pz = lwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa, com.bytedance.adsdk.ugeno.core.wk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(com.bytedance.adsdk.ugeno.oa.yo r13, java.lang.String r14, com.bytedance.adsdk.ugeno.moa.ivm.uef r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cq.ivm.xs.uef(com.bytedance.adsdk.ugeno.oa.yo, java.lang.String, com.bytedance.adsdk.ugeno.moa.ivm$uef):void");
    }

    private void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) throws NumberFormatException {
        int i10;
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.rt;
        if (yoVar != null && (yoVar instanceof com.bytedance.sdk.openadsdk.core.cq.oa.oa)) {
            try {
                i10 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                dhk.yo("UGenRender", "parse duration exception", charSequence);
                i10 = 0;
            }
            com.bytedance.sdk.openadsdk.core.cq.oa.oa oaVar = (com.bytedance.sdk.openadsdk.core.cq.oa.oa) this.rt;
            if (!z10 && i10 > 0 && !this.ku && !uef(oaVar)) {
                this.rt.yo(0);
                if (!z2 && this.ivm.uef() && com.bytedance.sdk.component.adexpress.moa.ivm.oa(this.ivm.moa())) {
                    ((com.bytedance.sdk.openadsdk.core.cq.oa.oa) this.rt).dz(String.valueOf(i5));
                    return;
                } else if (!"open_ad".equals(this.ivm.moa()) && this.ivm.uef()) {
                    this.ku = true;
                    this.rt.yo(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.cq.oa.oa) this.rt).dz(String.valueOf(charSequence));
                    return;
                }
            }
            this.rt.yo(8);
        }
    }

    private Context uef(View view) {
        Activity activityUef = view != null ? com.bytedance.sdk.component.utils.oa.uef(view) : null;
        return activityUef == null ? this.f25509oa : activityUef;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public void uef(long j8, long j10) {
        super.uef(j8, j10);
        wrv wrvVar = this.uef;
        if (wrvVar != null) {
            wrvVar.uef(this.yo, "videoProgress", Long.valueOf(j8), Long.valueOf(j10));
        }
    }

    private boolean uef(com.bytedance.sdk.openadsdk.core.cq.oa.oa oaVar) {
        if (oaVar == null) {
            return true;
        }
        if (TextUtils.equals(this.orq, "open_ad")) {
            return oaVar.moa() == 8 || oaVar.moa() == 4;
        }
        return false;
    }

    public JSONObject uef(dxx dxxVar) {
        if (dxxVar != null) {
            return dxxVar.lw();
        }
        return null;
    }
}
