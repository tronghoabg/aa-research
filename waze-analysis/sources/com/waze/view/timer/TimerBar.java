package com.waze.view.timer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class TimerBar extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f45375a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45376b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45377c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45378d;

    /* renamed from: e, reason: collision with root package name */
    private final int f45379e;

    /* renamed from: f, reason: collision with root package name */
    private final int f45380f;

    /* renamed from: g, reason: collision with root package name */
    private final int f45381g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f45382h;

    /* renamed from: i, reason: collision with root package name */
    private int f45383i;

    /* renamed from: j, reason: collision with root package name */
    private int f45384j;

    /* renamed from: k, reason: collision with root package name */
    private int f45385k;

    /* renamed from: l, reason: collision with root package name */
    private int f45386l;
    private float m;
    private float n;
    private Paint o;
    private Paint p;
    private float q;
    private Paint r;
    private Paint s;
    private RectF t;
    private int u;

    public TimerBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45382h = true;
        this.q = 1.0f;
        new a(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TimerBar);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        this.f45376b = i2;
        this.f45377c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TimerBar_cornerRadius, 0);
        this.f45378d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f45379e = typedArrayObtainStyledAttributes.getColor(3, ContextCompat.getColor(context, R.color.primary));
        this.f45380f = typedArrayObtainStyledAttributes.getColor(5, ContextCompat.getColor(context, R.color.always_dark_background_default));
        this.f45381g = typedArrayObtainStyledAttributes.getInt(4, 3);
        if (i2 <= 0) {
            g(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.f45375a = null;
        } else {
            this.f45375a = new Handler();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(boolean z) {
        if (!z) {
            setVisibility(8);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setFillAfter(true);
        startAnimation(alphaAnimation);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        RectF rectF = this.t;
        if (rectF == null) {
            return;
        }
        Paint paint = this.r;
        if (paint != null) {
            float f2 = this.f45377c;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        int i2 = this.f45385k;
        float f3 = i2;
        float f4 = this.m;
        float f5 = this.q;
        float f6 = f4 * f5;
        float f7 = this.f45384j;
        float f8 = this.n * f5;
        int i3 = this.f45386l;
        int i4 = i2 + i3;
        int i5 = this.f45383i;
        int i6 = this.f45381g;
        float f9 = f6 + f3;
        float f10 = (r6 + i5) / 2.0f;
        if (i6 == 3) {
            int i7 = this.f45378d;
            canvas.drawRect(f9, i5 - i7, i3 + 1, i5, this.o);
            float f11 = this.f45385k;
            canvas.drawRect(f11, r1 - i7, (this.m * this.q) + f11, this.f45383i, this.p);
            canvas.drawCircle(f9, f10, i7 / 2.0f, this.p);
            canvas.drawRect(this.f45385k, this.u, this.f45386l, this.f45383i - i7, this.s);
            return;
        }
        if (i6 == 2) {
            int i8 = this.f45378d;
            canvas.drawRect(f9, f7, i3, r6 + i8, this.o);
            float f12 = this.f45385k;
            canvas.drawRect(f12, this.f45384j, (this.m * this.q) + f12, r1 + i8, this.p);
            canvas.drawCircle(f9, f10, i8 / 2.0f, this.p);
            canvas.drawRect(this.f45385k, this.f45384j + i8, this.f45386l, this.u, this.s);
            return;
        }
        float f13 = i4 / 2.0f;
        float f14 = f7 + f8;
        if (i6 == 1) {
            int i9 = this.f45378d;
            canvas.drawRect(f3, f7, i2 + i9, f14, this.o);
            canvas.drawRect(this.f45385k, this.f45384j + (this.n * this.q), r1 + i9, this.f45383i + 1, this.p);
            canvas.drawCircle(f13, f14, i9 / 2.0f, this.p);
            canvas.drawRect(this.f45385k + i9, this.f45384j, this.u, this.f45383i, this.s);
            return;
        }
        if (i6 == 4) {
            int i10 = this.f45378d;
            canvas.drawRect(i3 - i10, f7, i3, f14, this.o);
            int i11 = this.f45386l;
            canvas.drawRect(i11 - i10, this.f45384j + (this.n * this.q), i11, this.f45383i + 1, this.p);
            canvas.drawCircle(f13, f14, i10 / 2.0f, this.p);
            canvas.drawRect(this.u, this.f45384j, this.f45386l - i10, this.f45383i, this.s);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f45385k = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = this.f45385k + paddingRight;
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        this.f45384j = paddingTop;
        this.m = i2 - i6;
        this.n = i3 - (paddingTop + paddingBottom);
        int i7 = i3 - paddingBottom;
        this.f45383i = i7;
        int i8 = i2 - paddingRight;
        this.f45386l = i8;
        int i9 = this.f45381g;
        if (i9 == 3) {
            int i10 = this.f45377c;
            int iMax = (i7 - i10) - Math.max(i10, this.f45378d);
            this.u = iMax;
            this.t = new RectF(this.f45385k, iMax, this.f45386l, this.f45383i);
        } else if (i9 == 2) {
            int i11 = this.f45377c;
            int iMax2 = paddingTop + i11 + Math.max(i11, this.f45378d);
            this.u = iMax2;
            this.t = new RectF(this.f45385k, this.f45384j, this.f45386l, iMax2);
        } else if (i9 == 1) {
            int i12 = this.f45385k;
            int i13 = this.f45377c;
            int iMax3 = i12 + i13 + Math.max(i13, this.f45378d);
            this.u = iMax3;
            this.t = new RectF(this.f45385k, this.f45384j, iMax3, this.f45383i);
        } else if (i9 == 4) {
            int i14 = this.f45377c;
            int iMax4 = (i8 - i14) - Math.max(i14, this.f45378d);
            this.u = iMax4;
            this.t = new RectF(iMax4, this.f45384j, this.f45386l, this.f45383i);
        }
        Paint paint = new Paint();
        this.o = paint;
        paint.setColor(this.f45380f);
        this.o.setAntiAlias(true);
        this.o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint();
        this.p = paint2;
        paint2.setColor(this.f45379e);
        this.p.setAntiAlias(true);
        this.p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint3 = new Paint();
        this.r = paint3;
        paint3.setAntiAlias(true);
        this.r.setColor(-1);
        Paint paint4 = new Paint();
        this.s = paint4;
        paint4.setColor(-1);
        this.s.setAntiAlias(true);
        this.s.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
        if (isInEditMode()) {
            this.q = 0.5f;
        }
    }
}
