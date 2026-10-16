package com.waze.gw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class HudSpeedometerDial extends FrameLayout {
    private final RectF arcBounds;
    private final Paint arcProgressPaint;
    private final Paint arcTrackPaint;
    private final Paint backgroundPaint;
    private final Paint borderPaint;
    private final RectF bounds;
    private float currentSpeed;
    private float maxSpeed;
    private Shader normalProgressShader;
    private boolean overSpeed;
    private final TextView tvSpeed;
    private final TextView tvUnit;

    public HudSpeedometerDial(Context context) {
        this(context, null);
    }

    public HudSpeedometerDial(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bounds = new RectF();
        this.arcBounds = new RectF();
        this.currentSpeed = 0.0f;
        this.maxSpeed = 160.0f;
        setWillNotDraw(false);
        this.backgroundPaint = new Paint(1);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        this.backgroundPaint.setColor(-14473166);
        this.borderPaint = new Paint(1);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(dp(2.0f));
        this.borderPaint.setColor(-15328992);
        this.arcTrackPaint = new Paint(1);
        this.arcTrackPaint.setStyle(Paint.Style.STROKE);
        this.arcTrackPaint.setStrokeCap(Paint.Cap.ROUND);
        this.arcTrackPaint.setColor(-13880770);
        this.arcProgressPaint = new Paint(1);
        this.arcProgressPaint.setStyle(Paint.Style.STROKE);
        this.arcProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.tvSpeed = new TextView(context);
        this.tvSpeed.setText("0");
        this.tvSpeed.setTextColor(-1);
        this.tvSpeed.setTextSize(42.0f);
        this.tvSpeed.setTypeface(Typeface.DEFAULT_BOLD);
        this.tvSpeed.setGravity(17);
        this.tvSpeed.setIncludeFontPadding(false);
        ModTypeface.applySpeed(this.tvSpeed);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.bottomMargin = dp(8.0f);
        frameLayout.addView(this.tvSpeed, layoutParams);
        this.tvUnit = new TextView(context);
        this.tvUnit.setText("Km/h");
        this.tvUnit.setTextColor(-2565409);
        this.tvUnit.setTextSize(16.0f);
        this.tvUnit.setTypeface(Typeface.DEFAULT_BOLD);
        this.tvUnit.setGravity(17);
        this.tvUnit.setIncludeFontPadding(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams2.bottomMargin = dp(16.0f);
        frameLayout.addView(this.tvUnit, layoutParams2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float fDp = dp(7.0f);
        this.arcProgressPaint.setStrokeWidth(fDp);
        this.arcTrackPaint.setStrokeWidth(fDp);
        float f2 = i2;
        float f3 = f2 - fDp;
        float f4 = i3;
        float f5 = f4 - fDp;
        this.bounds.set(fDp, fDp, f3, f5);
        this.arcBounds.set(fDp, fDp, f3, f5);
        this.normalProgressShader = new LinearGradient(0.0f, f4, f2, 0.0f, new int[]{-16711732, -16718337, -16750849}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.arcProgressPaint.setShader(this.normalProgressShader);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawOval(this.bounds, this.backgroundPaint);
        canvas.drawOval(this.bounds, this.borderPaint);
        canvas.drawArc(this.arcBounds, 135.0f, 270.0f, false, this.arcTrackPaint);
        float fMin = Math.min(1.0f, Math.max(0.0f, this.currentSpeed / this.maxSpeed)) * 270.0f;
        if (fMin > 0.0f) {
            if (this.overSpeed) {
                this.arcProgressPaint.setShader(null);
                this.arcProgressPaint.setColor(-1957094);
            } else {
                this.arcProgressPaint.setShader(this.normalProgressShader);
            }
            canvas.drawArc(this.arcBounds, 135.0f, fMin, false, this.arcProgressPaint);
        }
        super.onDraw(canvas);
    }

    public TextView speedText() {
        return this.tvSpeed;
    }

    public void setTextSizes(float f2, float f3) {
        this.tvSpeed.setTextSize(Math.max(12.0f, f2));
        this.tvUnit.setTextSize(Math.max(7.0f, f3));
        ViewGroup.LayoutParams layoutParams = this.tvSpeed.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).bottomMargin = dp(Math.max(3.0f, 0.5f * f3));
            this.tvSpeed.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.tvUnit.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = dp(Math.max(5.0f, f3));
            this.tvUnit.setLayoutParams(layoutParams2);
        }
    }

    public void setSpeed(int i2) {
        this.currentSpeed = Math.max(0, i2);
        this.tvSpeed.setText(String.valueOf((int) this.currentSpeed));
        invalidate();
    }

    public void setMaxSpeed(float f2) {
        if (f2 <= 0.0f) {
            f2 = 160.0f;
        }
        this.maxSpeed = f2;
        invalidate();
    }

    public void setValues(int i2, int i3, boolean z) {
        this.overSpeed = z;
        setSpeed(i2);
        setMaxSpeed(i3 >= 10 ? i3 : 160.0f);
        invalidate();
    }

    private int dp(float f2) {
        return Math.round(f2 * getResources().getDisplayMetrics().density);
    }
}
