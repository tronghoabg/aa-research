package com.bytedance.sdk.openadsdk.core.ivm;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class ivm extends FrameLayout {
    private boolean bcc;
    private boolean ivm;
    private Drawable lw;
    private Drawable moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25628oa;
    private int uef;
    private ValueAnimator xs;
    private Drawable yo;

    public ivm(Context context) {
        super(context);
        this.uef = 100;
    }

    private void uef() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.xs = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.xs.setRepeatCount(-1);
        this.xs.setInterpolator(new LinearInterpolator());
        this.xs.setRepeatMode(1);
        this.xs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.ivm.ivm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ivm.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.xs.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ivm = true;
        if (this.lw != null) {
            uef();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ivm = false;
        ValueAnimator valueAnimator = this.xs;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.xs.removeAllUpdateListeners();
            this.xs = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (i5 != 0) {
            ValueAnimator valueAnimator = this.xs;
            if (valueAnimator == null || this.bcc) {
                return;
            }
            this.bcc = true;
            valueAnimator.pause();
            return;
        }
        if (this.bcc) {
            this.bcc = false;
            ValueAnimator valueAnimator2 = this.xs;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                uef();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.lw = drawable;
        setProgressDrawable(drawable);
        if (this.ivm && this.xs == null) {
            uef();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(cz.uef(this, layoutParams));
    }

    public void setMax(int i5) {
        this.uef = i5;
    }

    @Override // android.view.View
    public void setPadding(int i5, int i10, int i11, int i12) {
        super.setPaddingRelative(i5, i10, i11, i12);
    }

    public void setProgress(int i5) {
        this.f25628oa = i5;
        Drawable drawable = this.yo;
        if (drawable != null) {
            drawable.setLevel((int) ((i5 * 10000.0f) / this.uef));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.moa = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.moa;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i5 = 0; i5 < numberOfLayers; i5++) {
                Drawable drawable3 = ((LayerDrawable) this.moa).getDrawable(i5);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.yo = drawable3;
                }
            }
        }
        Drawable drawable4 = this.moa;
        if (drawable4 instanceof RotateDrawable) {
            this.yo = drawable4;
        }
    }

    public ivm(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.uef = 100;
    }
}
