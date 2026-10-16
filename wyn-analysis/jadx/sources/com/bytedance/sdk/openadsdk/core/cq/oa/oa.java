package com.bytedance.sdk.openadsdk.core.cq.oa;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.adsdk.ugeno.cz.ivm.oa {
    private String aje;
    private String lo;

    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cz.ivm.oa
    public void dz(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.aje) || TextUtils.equals(this.aje, "null")) {
            this.aje = "";
        }
        if (TextUtils.isEmpty(this.lo) || TextUtils.equals(this.lo, "null")) {
            this.lo = "";
        }
        String str2 = this.lo + str + this.aje;
        ((com.bytedance.adsdk.ugeno.cz.ivm.oa) this).uef = str2;
        ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setText(str2);
        try {
            float f10 = this.dxx ? this.f24757ue : this.gr;
            float f11 = this.lz ? this.pz : this.gr;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).getPaint().measureText(((com.bytedance.adsdk.ugeno.cz.ivm.oa) this).uef);
            if (fMeasureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                lw((int) (f10 + fMeasureText + f11));
            }
        } catch (Throwable unused) {
        }
    }

    public int moa() {
        return this.wxf;
    }

    @Override // com.bytedance.adsdk.ugeno.cz.ivm.oa, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        if (TextUtils.isEmpty(this.aje) || TextUtils.equals(this.aje, "null")) {
            this.aje = "";
        }
        if (TextUtils.isEmpty(this.lo) || TextUtils.equals(this.lo, "null")) {
            this.lo = "";
        }
        String str = this.lo + this.aje;
        ((com.bytedance.adsdk.ugeno.cz.ivm.oa) this).uef = str;
        ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setText(str);
        ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.cz.ivm.oa, com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.lo = str2;
        } else if (str.equals("after")) {
            this.aje = str2;
        }
    }
}
