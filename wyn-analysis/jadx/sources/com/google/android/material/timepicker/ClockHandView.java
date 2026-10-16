package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f27102a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27103b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27104c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27105d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27106e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f27107f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f27108g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27109h;

    /* renamed from: i, reason: collision with root package name */
    public float f27110i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27111j;
    public double k;

    /* renamed from: l, reason: collision with root package name */
    public int f27112l;

    /* renamed from: m, reason: collision with root package name */
    public int f27113m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f27102a = new ValueAnimator();
        this.f27104c = new ArrayList();
        Paint paint = new Paint();
        this.f27107f = paint;
        this.f27108g = new RectF();
        this.f27113m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5402d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Ba.c.J(context, R.attr.motionDurationLong2, 200);
        Ba.c.K(context, R.attr.motionEasingEmphasizedInterpolator, J7.a.f5720b);
        this.f27112l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f27105d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f27109h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f27106e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = S.f38779a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i5) {
        return i5 == 2 ? Math.round(this.f27112l * 0.66f) : this.f27112l;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f27102a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f27110i = f11;
        this.k = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f27113m);
        float fCos = (((float) Math.cos(this.k)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.k))) + height;
        float f12 = this.f27105d;
        this.f27108g.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f27104c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f27095I - f11) > 0.001f) {
                clockFaceView.f27095I = f11;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fA = a(this.f27113m);
        float fCos = (((float) Math.cos(this.k)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.k))) + f11;
        Paint paint = this.f27107f;
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawCircle(fCos, fSin, this.f27105d, paint);
        double dSin = Math.sin(this.k);
        paint.setStrokeWidth(this.f27109h);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f27106e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        if (this.f27102a.isRunning()) {
            return;
        }
        b(this.f27110i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f27111j = false;
            z2 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f27111j;
            if (this.f27103b) {
                this.f27113m = ((float) Math.hypot((double) (x5 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z10 = false;
            z2 = false;
        }
        boolean z12 = this.f27111j;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x5 - (getWidth() / 2)));
        int i5 = degrees + 90;
        if (i5 < 0) {
            i5 = degrees + 450;
        }
        float f10 = i5;
        boolean z13 = this.f27110i != f10;
        if (z2 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            b(f10);
            z11 = true;
        }
        this.f27111j = z12 | z11;
        return true;
    }
}
