package com.bytedance.sdk.openadsdk.core.cq.oa.moa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.moa;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class uef extends View {
    private int bcc;
    private int cq;
    private int cz;
    private moa dj;
    private float dz;
    private float ivm;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private Paint f25528oa;
    private Paint uef;
    private ValueAnimator wrv;
    private float xs;
    private RectF yo;
    private String zjm;

    public uef(Context context) {
        super(context);
        this.moa = com.bytedance.adsdk.ugeno.xs.uef.uef("#FFD813");
        this.lw = com.bytedance.adsdk.ugeno.xs.uef.uef("rgba(0, 0, 0, 0.5)");
        this.ivm = 3.0f;
        this.xs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bcc = 0;
        this.cz = 100;
        this.zjm = "line";
        this.cq = 1000;
        setBackgroundColor(0);
        uef();
    }

    private void oa(Canvas canvas) {
        Paint paint = this.uef;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f10 = this.ivm;
        float f11 = this.xs;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f10, f11, f11, this.uef);
        float width2 = (getWidth() * this.dz) / this.cz;
        this.f25528oa.setStyle(style);
        if (!TextUtils.equals(this.zjm, "line_reverse")) {
            float f12 = this.ivm;
            float f13 = this.xs;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, f12, f13, f13, this.f25528oa);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f14 = this.ivm;
            float f15 = this.xs;
            canvas.drawRoundRect(width3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width4, f14, f15, f15, this.f25528oa);
        }
    }

    public int getMaxProgress() {
        return this.cz;
    }

    public int getProgress() {
        return this.bcc;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.wrv;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.zjm, "ring") || TextUtils.equals(this.zjm, "ring_reverse")) {
            uef(canvas);
        } else {
            oa(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        moa moaVar = this.dj;
        if (moaVar != null) {
            int[] iArrUef = moaVar.uef(i5, i10);
            super.onMeasure(iArrUef[0], iArrUef[1]);
        } else {
            super.onMeasure(i5, i10);
        }
        if (TextUtils.equals(this.zjm, "ring") || TextUtils.equals(this.zjm, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.ivm);
        }
        moa moaVar2 = this.dj;
        if (moaVar2 != null) {
            moaVar2.lw();
        }
    }

    public void setAnimationDuration(int i5) {
        this.cq = i5;
        this.wrv.setDuration(i5);
    }

    public void setMaxProgress(int i5) {
        this.cz = i5;
        invalidate();
    }

    public void setProgress(int i5) {
        int iMin = Math.min(i5, this.cz);
        this.bcc = iMin;
        if (iMin < 0) {
            this.bcc = 0;
        }
        ValueAnimator valueAnimator = this.wrv;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.wrv.setFloatValues(this.dz, this.bcc);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.dz + " progress=" + i5);
            this.wrv.start();
        }
    }

    private void uef() {
        Paint paint = new Paint(1);
        this.uef = paint;
        paint.setColor(this.lw);
        Paint paint2 = this.uef;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f25528oa = paint3;
        paint3.setColor(this.moa);
        this.f25528oa.setStyle(style);
        this.yo = new RectF();
        this.dz = this.bcc;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.wrv = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.cq);
        this.wrv.setInterpolator(new LinearInterpolator());
        this.wrv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                uef.this.dz = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uef.this.invalidate();
            }
        });
    }

    public uef oa(int i5) {
        this.uef.setColor(i5);
        return this;
    }

    public uef oa(float f10) {
        this.xs = f10;
        return this;
    }

    private void uef(Canvas canvas) {
        float f10;
        int i5;
        float f11 = this.ivm / 2.0f;
        this.yo.set(f11, f11, getWidth() - f11, getHeight() - f11);
        Paint paint = this.uef;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.uef.setStrokeWidth(this.ivm);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.uef);
        if (TextUtils.equals(this.zjm, "ring_reverse")) {
            f10 = this.dz * (-360.0f);
            i5 = this.cz;
        } else {
            f10 = this.dz * 360.0f;
            i5 = this.cz;
        }
        float f12 = f10 / i5;
        this.f25528oa.setStyle(style);
        this.f25528oa.setStrokeWidth(this.ivm);
        if (this.xs <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f25528oa.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.f25528oa.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.yo, -90.0f, f12, false, this.f25528oa);
    }

    public uef uef(int i5) {
        this.f25528oa.setColor(i5);
        return this;
    }

    public uef uef(float f10) {
        this.ivm = f10;
        invalidate();
        return this;
    }

    public uef uef(String str) {
        this.zjm = str;
        return this;
    }

    public void uef(moa moaVar) {
        this.dj = moaVar;
    }
}
