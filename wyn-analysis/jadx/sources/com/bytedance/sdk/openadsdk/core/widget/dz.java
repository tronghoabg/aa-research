package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class dz extends com.bytedance.sdk.openadsdk.core.ivm.moa {

    /* renamed from: oa, reason: collision with root package name */
    private RectF f25763oa;
    private Paint uef;

    public dz(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        Paint paint = new Paint();
        this.uef = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.uef.setColor(Color.parseColor("#99333333"));
        this.uef.setAntiAlias(true);
        this.uef.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f25763oa = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f25763oa;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.uef);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.moa, android.widget.ImageView, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.f25763oa.right == getMeasuredWidth() && this.f25763oa.bottom == getMeasuredHeight()) {
            return;
        }
        this.f25763oa.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
    }
}
