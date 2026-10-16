package com.bytedance.sdk.openadsdk.core.cq.oa.moa;

import android.content.Context;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class yo extends com.bytedance.adsdk.ugeno.oa.yo<uef> {
    private float aje;
    private int lo;
    private int qn;
    private float syr;
    private String uef;

    public yo(Context context) {
        super(context);
        this.uef = "line";
        this.qn = com.bytedance.adsdk.ugeno.xs.uef.uef("#FFD813");
        this.lo = com.bytedance.adsdk.ugeno.xs.uef.uef("rgba(0, 0, 0, 0.5)");
        this.aje = bcc.uef(this.f24755oa, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        ((uef) this.lw).uef(this.uef).uef(this.qn).oa(this.lo).oa(this.syr).uef(this.aje);
    }

    public void xs(int i5) {
        ((uef) this.lw).setAnimationDuration(i5);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public uef uef() {
        uef uefVar = new uef(this.f24755oa);
        uefVar.uef(this);
        return uefVar;
    }

    public void uef(int i5) {
        ((uef) this.lw).setProgress(i5);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.lo = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "progressSize":
                this.aje = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f));
                break;
            case "progressType":
                this.uef = str2;
                break;
            case "progressColor":
                this.qn = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.syr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
                } else {
                    this.syr = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                }
        }
    }
}
