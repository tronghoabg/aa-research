package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class wrv extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    public float uef;

    public wrv(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.yo, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = getLayoutParams().width;
        int i12 = getLayoutParams().height;
        float f10 = this.uef;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (i11 == -2) {
                size = (int) (size2 * f10);
                mode = 1073741824;
            } else if (i12 == -2) {
                size2 = (int) (size / f10);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f10) {
        this.uef = f10;
    }

    public wrv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public wrv(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
