package com.bytedance.sdk.openadsdk.wk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class uef extends View {

    /* renamed from: oa, reason: collision with root package name */
    private float f26172oa;
    private final Paint uef;
    private float yo;

    public uef(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.uef = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.yo;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f11 = this.f26172oa;
            canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, f10, f11, this.uef);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        float f10 = i10;
        this.f26172oa = (1.0f * f10) / 2.0f;
        this.uef.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.yo = getWidth() * f10;
        invalidate();
    }
}
