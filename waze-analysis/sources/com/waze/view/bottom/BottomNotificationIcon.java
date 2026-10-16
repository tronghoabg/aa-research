package com.waze.view.bottom;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.media3.common.C;
import com.google.android.gms.common.api.internal.z;
import com.waze.R;
import com.waze.beacons.p;
import com.waze.shared_infra.i.h;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class BottomNotificationIcon extends View {
    private static final int ICON_ANIM_DELAY_PERCENT = 0;
    private static final int ICON_ANIM_DURATION_PERCENT = 50;
    private static final int RADAR_CIRCLE_DURATION = 3000;
    private static final int RADAR_DURATION_MSEC = 5;
    private static final int SHINE_ANGLE_DEG = 40;
    private static final int SHINE_ANIM_DELAY_PERCENT = 60;
    private static final int SHINE_ANIM_DURATION_PERCENT = 40;
    private static final int SHINE_COLOR = 2013265919;
    private static final int SHINE_ECHO_DP = 0;
    private static final int SHINE_GAP_DP = 0;
    private static final int SHINE_WIDTH_DP = 25;
    boolean mAlphaAnimateIcon;
    private c mAnimationListener;
    private int mCircleColor;
    private Paint mCirclePaint;
    Path mClipPath;
    boolean mDrawRadar;
    boolean mDrawShine;
    float mIconAlpha;
    private Bitmap mIconBmp;
    Matrix mIconMatrix;
    private ValueAnimator mIconOffsetValueAnimator;
    boolean mIsOpen;
    private ObjectAnimator mObjectAnimator;
    Runnable mOnSizeRunnable;
    private Paint mOnTopPaint;
    private Bitmap mRadarBmp;
    Matrix mRadarMatrix;
    private ObjectAnimator mRadarRotator;
    private float mRadius;
    private ValueAnimator mShineOffsetValueAnimator;
    private Paint mShinePaint;
    Path mShinePath;
    boolean mShouldDrawRadar;
    private float mTopMargin;

    public BottomNotificationIcon(Context context) {
        super(context);
        this.mIconMatrix = new Matrix();
        this.mClipPath = new Path();
        this.mShinePath = new Path();
        this.mRadarMatrix = new Matrix();
        this.mDrawRadar = false;
        this.mShouldDrawRadar = false;
        this.mDrawShine = false;
        this.mAlphaAnimateIcon = false;
        this.mIconAlpha = 1.0f;
        this.mAnimationListener = null;
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIconBitmap, reason: merged with bridge method [inline-methods] */
    public void lambda$setImageResourcesAndPoints$0(int i2, Context context) {
        float f2 = this.mRadius;
        int i3 = (int) (f2 + f2);
        if (i3 == 0) {
            return;
        }
        this.mIconBmp = Bitmap.createBitmap(context.getResources().getDisplayMetrics(), i3, i3, Bitmap.Config.ARGB_4444);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.bottom_bar_notification_points_container, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.mainBottomBarNotificationPoints)).setText(String.valueOf(i2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        viewInflate.layout(0, 0, i3, i3);
        viewInflate.draw(new Canvas(this.mIconBmp));
        setBitmapMatrix(this.mIconMatrix, this.mIconBmp, 0.0f, 0.0f);
        requestLayout();
    }

    private void drawToCanvas(Canvas canvas) {
        float f2 = this.mRadius;
        canvas.drawCircle(f2, f2, f2, this.mCirclePaint);
        canvas.save();
        canvas.clipPath(this.mClipPath);
        if (this.mDrawShine) {
            canvas.drawPath(this.mShinePath, this.mShinePaint);
        }
        if (this.mDrawRadar) {
            canvas.drawBitmap(this.mRadarBmp, this.mRadarMatrix, this.mOnTopPaint);
        }
        if (this.mIconBmp != null) {
            if (this.mAlphaAnimateIcon) {
                this.mOnTopPaint.setAlpha((int) (this.mIconAlpha * 255.0f));
            }
            canvas.drawBitmap(this.mIconBmp, this.mIconMatrix, this.mOnTopPaint);
            if (this.mAlphaAnimateIcon) {
                this.mOnTopPaint.setAlpha(255);
            }
        }
        canvas.restore();
    }

    private void init(Context context) {
        Paint paint = new Paint(1);
        this.mCirclePaint = paint;
        paint.setColor(this.mCircleColor);
        Paint paint2 = new Paint();
        this.mOnTopPaint = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.mOnTopPaint.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.mShinePaint = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.mShinePaint.setAntiAlias(true);
        this.mShinePaint.setColor(SHINE_COLOR);
        this.mTopMargin = 0.0f;
        this.mRadarBmp = BitmapFactory.decodeResource(getResources(), R.drawable.bottom_notification_radar);
        if (isInEditMode()) {
            setImageResources(getResources().getColor(R.color.Orange500_deprecated), R.drawable.bottom_message_reports_front);
            setOpen();
        }
    }

    private void setBitmapMatrix(Matrix matrix, Bitmap bitmap, float f2, float f3) {
        if (bitmap == null) {
            return;
        }
        float height = bitmap.getHeight();
        float width = getWidth();
        float height2 = getHeight();
        matrix.reset();
        matrix.postScale(f2, f2);
        matrix.postTranslate((width / 2.0f) - ((bitmap.getWidth() * f2) / 2.0f), ((height2 / 2.0f) - ((height * f2) / 2.0f)) + (f3 * height));
    }

    private void setBitmapRotationMatrix(Matrix matrix, Bitmap bitmap, float f2, float f3) {
        float height = bitmap.getHeight();
        float width = bitmap.getWidth();
        float width2 = getWidth();
        float height2 = getHeight();
        matrix.reset();
        this.mRadarMatrix.setRotate((f2 % 1.0f) * 360.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postTranslate((width2 / 2.0f) - (width / 2.0f), ((height2 / 2.0f) - (height / 2.0f)) + f3);
    }

    private void setShinePath(float f2) {
        double dTan = this.mRadius / Math.tan(0.6981317007977318d);
        float fR = h.r(12);
        float fR2 = h.r(0);
        float fR3 = h.r(0);
        this.mShinePath.reset();
        float f3 = (float) dTan;
        float f4 = ((4.0f * f3) + fR + fR + fR2 + fR3 + fR3) * f2;
        this.mShinePath.moveTo(((this.mRadius + f3) - fR) + f4, 0.0f);
        Path path = this.mShinePath;
        float f5 = this.mRadius;
        path.lineTo(((f5 - f3) - fR) + f4, f5 + f5);
        Path path2 = this.mShinePath;
        float f6 = this.mRadius;
        path2.lineTo((f6 - f3) + fR + f4, f6 + f6);
        this.mShinePath.lineTo(this.mRadius + f3 + fR + f4, 0.0f);
        this.mShinePath.lineTo(((this.mRadius + f3) - fR) + f4, 0.0f);
        if (fR3 > 0.0f) {
            this.mShinePath.lineTo((((this.mRadius + f3) - fR3) + f4) - fR2, 0.0f);
            Path path3 = this.mShinePath;
            float f7 = this.mRadius;
            path3.lineTo((((f7 - f3) - fR3) + f4) - fR2, f7 + f7);
            Path path4 = this.mShinePath;
            float f8 = this.mRadius;
            path4.lineTo((((f8 - f3) + fR3) + f4) - fR2, f8 + f8);
            this.mShinePath.lineTo((((this.mRadius + f3) + fR3) + f4) - fR2, 0.0f);
            this.mShinePath.lineTo((((this.mRadius + f3) - fR3) + f4) - fR2, 0.0f);
            this.mShinePath.lineTo(((this.mRadius + f3) - fR) + f4, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawToCanvas(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i3, i3);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float fMin = Math.min(i2, i3) / 2.0f;
        if (fMin != this.mRadius && fMin != 0.0f) {
            this.mRadius = fMin;
            this.mClipPath.reset();
            Path path = this.mClipPath;
            float f2 = this.mRadius;
            path.addCircle(f2, f2, f2, Path.Direction.CW);
        }
        Runnable runnable = this.mOnSizeRunnable;
        if (runnable != null) {
            runnable.run();
            this.mOnSizeRunnable = null;
        }
    }

    public void setCloseAnimationStep(float f2) {
        boolean zIsRunning = this.mIconOffsetValueAnimator.isRunning();
        ValueAnimator valueAnimator = this.mIconOffsetValueAnimator;
        if (zIsRunning) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            setBitmapMatrix(this.mIconMatrix, this.mIconBmp, 1.0f, fFloatValue);
            if (fFloatValue > 0.0f) {
                this.mIconAlpha = 1.0f - fFloatValue;
            }
        } else if (valueAnimator.getAnimatedFraction() == 1.0f) {
            this.mIconAlpha = 0.0f;
        }
        postInvalidate();
    }

    public void setClosed() {
        setBitmapMatrix(this.mIconMatrix, this.mIconBmp, 0.0f, 0.0f);
        this.mDrawRadar = false;
        setVisibility(8);
        invalidate();
    }

    public void setImageResources(int i2, int i3) {
        this.mCircleColor = i2;
        this.mCirclePaint.setColor(i2);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i3);
        this.mIconBmp = bitmapDecodeResource;
        this.mShouldDrawRadar = true;
        this.mAlphaAnimateIcon = false;
        setBitmapMatrix(this.mIconMatrix, bitmapDecodeResource, 0.0f, 0.0f);
        requestLayout();
    }

    public void setImageResourcesAndPoints(Context context, int i2, int i3) {
        this.mCircleColor = i2;
        this.mCirclePaint.setColor(i2);
        this.mShouldDrawRadar = false;
        this.mAlphaAnimateIcon = true;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            lambda$setImageResourcesAndPoints$0(i3, context);
        }
        this.mOnSizeRunnable = new z(this, i3, context, 5);
    }

    public void setOpen() {
        setBitmapMatrix(this.mIconMatrix, this.mIconBmp, 1.0f, 0.0f);
        setVisibility(0);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOpenAnimationStep(float r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r5 = r4.mIconBmp
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L34
            android.animation.ValueAnimator r5 = r4.mIconOffsetValueAnimator
            boolean r5 = r5.isRunning()
            android.animation.ValueAnimator r1 = r4.mIconOffsetValueAnimator
            if (r5 == 0) goto L24
            java.lang.Object r5 = r1.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.graphics.Matrix r1 = r4.mIconMatrix
            android.graphics.Bitmap r2 = r4.mIconBmp
            float r3 = r0 - r5
            r4.setBitmapMatrix(r1, r2, r5, r3)
            goto L34
        L24:
            float r5 = r1.getAnimatedFraction()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L34
            android.graphics.Matrix r5 = r4.mIconMatrix
            android.graphics.Bitmap r1 = r4.mIconBmp
            r2 = 0
            r4.setBitmapMatrix(r5, r1, r0, r2)
        L34:
            android.animation.ValueAnimator r5 = r4.mShineOffsetValueAnimator
            boolean r5 = r5.isRunning()
            r1 = 0
            if (r5 == 0) goto L57
            android.animation.ValueAnimator r5 = r4.mShineOffsetValueAnimator
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L57
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            float r5 = r5 + r0
            r4.setShinePath(r5)
            r5 = 1
            r4.mDrawShine = r5
            goto L59
        L57:
            r4.mDrawShine = r1
        L59:
            r4.postInvalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.view.bottom.BottomNotificationIcon.setOpenAnimationStep(float):void");
    }

    public void setRotateRadarStep(float f2) {
        setBitmapRotationMatrix(this.mRadarMatrix, this.mRadarBmp, f2, this.mTopMargin);
        postInvalidate();
    }

    public void startCloseAnimation(int i2, int i3, c cVar) {
        if (this.mIsOpen) {
            this.mIsOpen = false;
            this.mAnimationListener = cVar;
            ValueAnimator valueAnimator = this.mIconOffsetValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator objectAnimator = this.mObjectAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mIconOffsetValueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new AnticipateInterpolator());
            this.mIconOffsetValueAnimator.setDuration((i3 * 50) / 100);
            this.mIconOffsetValueAnimator.setStartDelay(r2 + i2);
            this.mIconOffsetValueAnimator.start();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "closeAnimationStep", 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setDuration(i3);
            objectAnimatorOfFloat.setStartDelay(i2);
            objectAnimatorOfFloat.addListener(new b(this, 0));
            Objects.requireNonNull(objectAnimatorOfFloat);
            post(new p(objectAnimatorOfFloat, 19));
        }
    }

    public void startOpenAnimation(int i2, int i3, c cVar) {
        setVisibility(0);
        this.mIsOpen = true;
        this.mAnimationListener = cVar;
        this.mDrawRadar = false;
        this.mIconAlpha = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mIconOffsetValueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.5f));
        this.mIconOffsetValueAnimator.setDuration((i3 * 50) / 100);
        long j2 = i2;
        this.mIconOffsetValueAnimator.setStartDelay(j2);
        this.mIconOffsetValueAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mShineOffsetValueAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.mShineOffsetValueAnimator.setDuration((i3 * 40) / 100);
        this.mShineOffsetValueAnimator.setStartDelay(((i3 * 60) / 100) + i2);
        this.mShineOffsetValueAnimator.start();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "openAnimationStep", 0.0f, 1.0f);
        this.mObjectAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.mObjectAnimator.setDuration((long) (i3 * 1.1d));
        this.mObjectAnimator.setStartDelay(j2);
        this.mObjectAnimator.addListener(new b(this, 1, null));
        ObjectAnimator objectAnimator = this.mObjectAnimator;
        Objects.requireNonNull(objectAnimator);
        int i4 = 19;
        post(new p(objectAnimator, i4));
        if (this.mShouldDrawRadar) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "rotateRadarStep", 0.0f, 1.0f);
            this.mRadarRotator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            this.mRadarRotator.setDuration(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            this.mRadarRotator.setRepeatMode(1);
            this.mRadarRotator.setRepeatCount(5);
            this.mRadarRotator.setStartDelay(i3 + i2);
            ObjectAnimator objectAnimator2 = this.mRadarRotator;
            Objects.requireNonNull(objectAnimator2);
            post(new p(objectAnimator2, i4));
        }
    }

    public BottomNotificationIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIconMatrix = new Matrix();
        this.mClipPath = new Path();
        this.mShinePath = new Path();
        this.mRadarMatrix = new Matrix();
        this.mDrawRadar = false;
        this.mShouldDrawRadar = false;
        this.mDrawShine = false;
        this.mAlphaAnimateIcon = false;
        this.mIconAlpha = 1.0f;
        this.mAnimationListener = null;
        init(context);
    }

    public BottomNotificationIcon(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mIconMatrix = new Matrix();
        this.mClipPath = new Path();
        this.mShinePath = new Path();
        this.mRadarMatrix = new Matrix();
        this.mDrawRadar = false;
        this.mShouldDrawRadar = false;
        this.mDrawShine = false;
        this.mAlphaAnimateIcon = false;
        this.mIconAlpha = 1.0f;
        this.mAnimationListener = null;
        init(context);
    }
}
