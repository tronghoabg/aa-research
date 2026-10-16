package com.bytedance.sdk.openadsdk.yo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.sdk.openadsdk.core.ivm.bcc {
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f26201oa;
    private Paint uef;
    private boolean yo;

    public uef(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        this.f26201oa = af.uef(getContext(), 8.0f);
        this.uef = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        uef(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.bcc, android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        this.moa = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.moa);
        } else {
            layoutParams.height = this.moa;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.bcc, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i5 = this.moa;
        if (i5 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i5;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.f26201oa = f10;
    }

    private void uef(String str, int i5) {
        if (!this.yo && i5 > 0) {
            float textSize = getTextSize();
            this.uef.set(getPaint());
            int paddingLeft = (i5 - getPaddingLeft()) - getPaddingRight();
            float fUef = uef(textSize, str);
            while (fUef > paddingLeft) {
                textSize -= 1.0f;
                this.uef.setTextSize(textSize);
                if (textSize <= this.f26201oa) {
                    break;
                } else {
                    fUef = uef(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.yo = true;
        }
    }

    private float uef(float f10, String str) {
        this.uef.setTextSize(f10);
        return this.uef.measureText(str);
    }
}
