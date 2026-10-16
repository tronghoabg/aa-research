package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class wk extends com.bytedance.sdk.openadsdk.core.ivm.bcc {

    /* renamed from: oa, reason: collision with root package name */
    private RectF f25781oa;
    private Paint uef;
    private int yo;

    public wk(Context context) {
        this(context, null);
    }

    private void uef() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.uef = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.uef.setColor(Color.parseColor("#99333333"));
        this.uef.setAntiAlias(true);
        this.uef.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f25781oa = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f25781oa;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.uef);
        canvas.translate((this.f25781oa.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.bcc, android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f25781oa.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.yo = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i11 = ((measuredHeight / 2) * 2) + measuredWidth;
        setMeasuredDimension(i11, measuredHeight);
        this.f25781oa.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i11, measuredHeight);
    }

    public wk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public wk(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.yo = 0;
        uef();
    }
}
