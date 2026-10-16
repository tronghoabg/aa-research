package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class bs extends View {
    private float bcc;
    private Animator.AnimatorListener cz;
    private long ivm;
    private Paint lw;
    private ValueAnimator moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24897oa;
    private float uef;
    private float xs;
    private ValueAnimator yo;
    private int zjm;

    public bs(Context context, int i5) {
        super(context);
        this.ivm = 300L;
        this.xs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.zjm = i5;
        uef();
    }

    public void oa() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bcc);
        this.yo = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ivm);
        this.yo.setInterpolator(new LinearInterpolator());
        this.yo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.bs.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bs.this.xs = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs.this.invalidate();
            }
        });
        this.yo.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.uef, this.f24897oa, this.xs, this.lw);
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.uef = i5 / 2.0f;
        this.f24897oa = i10 / 2.0f;
        this.bcc = (float) (Math.hypot(i5, i10) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.cz = animatorListener;
    }

    public void yo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.bcc, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.moa = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ivm);
        this.moa.setInterpolator(new LinearInterpolator());
        this.moa.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.bs.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bs.this.xs = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.cz;
        if (animatorListener != null) {
            this.moa.addListener(animatorListener);
        }
        this.moa.start();
    }

    public void uef() {
        Paint paint = new Paint(1);
        this.lw = paint;
        paint.setStyle(Paint.Style.FILL);
        this.lw.setColor(this.zjm);
    }
}
