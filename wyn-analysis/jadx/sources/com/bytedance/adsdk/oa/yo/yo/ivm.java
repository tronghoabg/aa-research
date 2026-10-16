package com.bytedance.adsdk.oa.yo.yo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class ivm extends uef {
    public ivm(com.bytedance.adsdk.oa.cz czVar, lw lwVar) {
        super(czVar, lwVar);
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        super.oa(canvas, matrix, i5);
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        super.uef(rectF, matrix, z2);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
