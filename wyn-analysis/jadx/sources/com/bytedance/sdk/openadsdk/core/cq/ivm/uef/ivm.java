package com.bytedance.sdk.openadsdk.core.cq.ivm.uef;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.cq.ivm.uef.oa;
import com.bytedance.sdk.openadsdk.core.cq.ivm.xs;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dxx;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm.ue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm extends xs {
    private static Boolean cp;
    private float gr;
    private final oa pz;
    private float rt;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25513ue;

    public ivm(Context context, gzw gzwVar, boolean z2, com.bytedance.sdk.openadsdk.core.cq.ivm.uef uefVar, ViewGroup viewGroup, float f10, float f11, boolean z10, String str) {
        super(context, gzwVar, z2, uefVar, viewGroup);
        this.pz = oa.uef.uef(gzwVar, uefVar);
        this.orq = str;
        this.rt = f10;
        this.gr = f11;
        this.f25513ue = z10;
    }

    private boolean cq() {
        return this.lw != null && dz() && cp.yo(this.lw);
    }

    private boolean dz() {
        gzw gzwVar = this.lw;
        if (gzwVar == null) {
            return false;
        }
        int iEpe = gzwVar.epe();
        boolean z2 = iEpe == 7 || iEpe == 8;
        int iWxf = this.lw.wxf();
        return z2 && (iWxf == 43 || iWxf == 44);
    }

    private JSONObject uef(float f10, float f11, boolean z2, gzw gzwVar, String str) throws JSONException {
        JSONObject jSONObjectUef = com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(f10, f11, z2, gzwVar, str);
        this.gsd = jSONObjectUef;
        if (jSONObjectUef == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObjectUef.optJSONObject("xSize");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("imageModeRatio", wrv());
            }
            JSONObject jSONObjectOptJSONObject2 = this.gsd.optJSONObject("xAdInfo");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.put("isVideoImageMode", gzw.lw(this.lw));
                jSONObjectOptJSONObject2.put("feed_draw_purePlayable", cq());
                jSONObjectOptJSONObject2.put("isFeedDraw", dz());
            }
            oa oaVar = this.pz;
            if (oaVar != null) {
                oaVar.uef(this.gsd);
            }
        } catch (Exception unused) {
        }
        return this.gsd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.xs, com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public com.bytedance.adsdk.ugeno.oa.yo bcc() {
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null) {
            return null;
        }
        return yoVar.xs("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.xs, com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public JSONObject oa() {
        return uef(this.rt, this.gr, this.f25513ue, this.lw, this.orq);
    }

    public float wrv() {
        gzw gzwVar = this.lw;
        if (gzwVar == null) {
            return 1.0f;
        }
        int iHw = gzwVar.hw();
        if (iHw == 3) {
            return 1.91f;
        }
        if (iHw == 5) {
            return 1.78f;
        }
        if (iHw == 15 || iHw == 173) {
            return 0.5625f;
        }
        if (iHw != 33 && iHw != 50) {
            if (iHw == 1010) {
                return 1.2f;
            }
            if (iHw == 1011) {
                return 6.4f;
            }
            if (iHw == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.moa, com.bytedance.sdk.component.adexpress.oa.moa
    public int yo() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.xs, com.bytedance.sdk.openadsdk.core.cq.ivm.moa
    public JSONObject uef() {
        oa oaVar = this.pz;
        if (oaVar != null) {
            try {
                return new JSONObject(oaVar.uef());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.ivm.xs
    public JSONObject uef(dxx dxxVar) {
        oa oaVar = this.pz;
        if (oaVar != null) {
            return oaVar.oa();
        }
        return null;
    }

    public static boolean uef(String str) {
        if (cp == null) {
            cp = Boolean.valueOf(com.bytedance.sdk.openadsdk.gzw.lw.uef("express_backup_type", 0) == 1);
        }
        return cp.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || ue.oa(str) || (TextUtils.equals(str, "open_ad") && com.bytedance.sdk.openadsdk.component.xs.uef.dj()));
    }
}
