package com.bytedance.sdk.openadsdk.core.cq.oa.uef;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class oa extends yo<uef> {
    private int aje;
    private int lo;
    private com.bytedance.sdk.openadsdk.core.cq.oa nj;
    private int qn;
    private int syr;
    private int uef;

    /* renamed from: uf, reason: collision with root package name */
    private float f25536uf;

    public oa(Context context) {
        super(context);
        this.qn = -1;
        this.lo = -1;
        uef(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        com.bytedance.adsdk.ugeno.cz.ivm.uef uefVarUef = ((uef) this.lw).uef();
        if (uefVarUef != null) {
            this.nj.uef(uefVarUef);
            ((uef) this.lw).uef(uefVarUef);
        }
        ((uef) this.lw).uef(this.uef, this.qn, this.lo, this.aje, this.syr, this.f25536uf);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public uef uef() {
        uef uefVar = new uef(this.f24755oa);
        uefVar.uef(this);
        return uefVar;
    }

    private void uef(Context context) {
        this.nj = new com.bytedance.sdk.openadsdk.core.cq.oa(context, true);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "barWidth":
                this.aje = af.oa(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.lo = Color.parseColor(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.nj.uef(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.qn = Color.parseColor(str2);
                    break;
                }
                break;
            case "barHeight":
                this.syr = af.oa(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "barRadius":
                this.f25536uf = af.oa(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "downtime":
                this.uef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo, com.bytedance.adsdk.ugeno.moa
    public void uef(Canvas canvas) {
        super.uef(canvas);
    }
}
