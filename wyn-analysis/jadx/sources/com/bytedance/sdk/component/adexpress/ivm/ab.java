package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class ab extends View {
    private int ivm;
    private ValueAnimator lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private Paint f24895oa;
    private Context uef;
    private boolean xs;
    private RectF yo;

    public ab(Context context) {
        super(context);
        this.ivm = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.uef = context;
        Paint paint = new Paint();
        this.f24895oa = paint;
        paint.setAntiAlias(true);
        this.f24895oa.setStyle(Paint.Style.STROKE);
        this.f24895oa.setStrokeWidth(10.0f);
        this.f24895oa.setColor(Color.parseColor("#80FFFFFF"));
        this.yo = new RectF();
    }

    public void oa() {
        ValueAnimator valueAnimator = this.lw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.xs) {
            return;
        }
        canvas.drawArc(this.yo, 270.0f, this.moa, false, this.f24895oa);
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.yo.set(5.0f, 5.0f, i5 - 5, i10 - 5);
    }

    public void setDuration(int i5) {
        this.ivm = i5;
    }

    public void yo() {
        this.xs = true;
        invalidate();
    }

    public void uef() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        this.lw = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ivm);
        this.lw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.ab.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ab.this.moa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ab.this.requestLayout();
            }
        });
        this.lw.start();
    }
}
