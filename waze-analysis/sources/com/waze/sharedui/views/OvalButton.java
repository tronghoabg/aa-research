package com.waze.sharedui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class OvalButton extends FrameLayout {
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private Path G;
    private Paint H;
    private com.google.firebase.messaging.l I;

    /* renamed from: a, reason: collision with root package name */
    private int f39139a;

    /* renamed from: b, reason: collision with root package name */
    private int f39140b;

    /* renamed from: c, reason: collision with root package name */
    private float f39141c;

    /* renamed from: d, reason: collision with root package name */
    private int f39142d;

    /* renamed from: e, reason: collision with root package name */
    private int f39143e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39144f;

    /* renamed from: g, reason: collision with root package name */
    private int f39145g;

    /* renamed from: h, reason: collision with root package name */
    private int f39146h;

    /* renamed from: i, reason: collision with root package name */
    private int f39147i;

    /* renamed from: j, reason: collision with root package name */
    private int f39148j;

    /* renamed from: k, reason: collision with root package name */
    private int f39149k;

    /* renamed from: l, reason: collision with root package name */
    private int f39150l;
    private int m;
    private float n;
    private Paint o;
    private Paint p;
    private PathEffect q;
    private boolean r;
    private boolean s;
    private Path t;
    private long u;
    private boolean v;
    private long w;
    private int x;
    private int y;
    private float z;

    public OvalButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = ContextCompat.getColor(getContext(), R.color.surface_default);
        this.f39139a = color;
        this.f39140b = color;
        this.f39141c = 0.3f;
        this.f39142d = color;
        this.f39143e = color;
        this.f39144f = false;
        this.f39145g = color;
        this.f39146h = ContextCompat.getColor(getContext(), R.color.primary_variant);
        this.f39147i = ContextCompat.getColor(getContext(), R.color.transparent);
        this.f39148j = -1;
        this.f39149k = -1;
        this.f39150l = -1;
        this.m = -1;
        this.r = false;
        this.s = false;
        this.v = false;
        this.x = -1;
        this.y = -1;
        this.A = false;
        this.B = -1;
        this.C = -1;
        this.E = false;
        this.F = true;
        r(context, attributeSet, 0, 0);
        s(context);
    }

    private final void a(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            return;
        }
        int i4 = this.f39147i;
        if (isEnabled()) {
            this.f39149k = this.f39148j;
        } else {
            this.f39149k = 0;
        }
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        boolean z = this.f39144f;
        Paint paint2 = this.H;
        if (z) {
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i3, this.f39142d, this.f39143e, Shader.TileMode.CLAMP));
        } else {
            paint2.setColor(this.f39140b);
        }
        if (!this.s) {
            Paint paint3 = this.H;
            float f2 = this.f39149k;
            paint3.setShadowLayer(f2 / 2.0f, 0.0f, f2 / 4.0f, i4);
        }
        setLayerType(1, null);
        int i5 = this.f39148j;
        float f3 = i5;
        float f4 = i2 - i5;
        float f5 = i3 - i5;
        Path pathD = d(f3, f3, f4, f5);
        this.G = pathD;
        if ((this.r || this.s) && pathD != null) {
            float f6 = this.s ? this.m / 2.0f : this.f39150l;
            setLayerType(1, null);
            float f7 = f3 + f6;
            this.t = d(f7, f7, f4 - f6, f5 - f6);
            this.z = new PathMeasure(this.t, false).getLength();
            this.p.setColor(this.f39146h);
            this.p.setStrokeWidth(this.m);
            if (isInEditMode()) {
                this.p.setPathEffect(new DashPathEffect(new float[]{10.0f, 100.0f}, 5.0f));
            }
        }
        if (!this.s) {
            Paint paint4 = this.H;
            float f8 = this.f39149k;
            paint4.setShadowLayer(f8 / 4.0f, 0.0f, f8 / 8.0f, i4);
        }
        if (isEnabled()) {
            return;
        }
        h();
    }

    private final void c(int i2, int i3) {
        this.B = i2;
        if (i2 > i3) {
            this.C = i3;
            a(i2, i3);
        } else {
            this.C = i2;
            a(i2, i2);
        }
    }

    private static final Path d(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        float f6 = (f4 + f2) / 2.0f;
        path.moveTo(f6, f3);
        float f7 = f5 - f3;
        float f8 = f7 / 2.0f;
        path.lineTo(f4 - f8, f3);
        RectF rectF = new RectF(f4 - f7, f3, f4, f5);
        path.arcTo(rectF, 270.0f, 180.0f);
        path.lineTo(f8 + f2, f5);
        rectF.set(f2, f3, f7 + f2, f5);
        path.arcTo(rectF, 90.0f, 180.0f);
        path.lineTo(f6, f3);
        return path;
    }

    private final void e(View view) {
        Drawable drawable;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
        if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null) {
            drawable.setColorFilter(null);
            drawable.setAlpha(255);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            background.setColorFilter(null);
            if (view != this) {
                background.setAlpha(255);
            }
        }
        setAlpha(1.0f);
    }

    private final void h() {
        setAlpha(this.f39141c);
    }

    public final void A() {
        this.u = 0L;
        invalidate();
    }

    public final void B(float f2) {
        if (f2 < 0.0f) {
            this.v = false;
            this.q = null;
            return;
        }
        this.v = true;
        this.z = new PathMeasure(this.t, false).getLength();
        this.p.setColor(this.f39146h);
        this.p.setStrokeWidth(this.m);
        float f3 = 1.0f - (f2 / 100.0f);
        float f4 = this.z;
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{f4, f4}, f3 * f4);
        this.q = dashPathEffect;
        this.p.setPathEffect(dashPathEffect);
        invalidate();
    }

    public final boolean D() {
        return this.u != 0 && System.currentTimeMillis() > this.w + this.u;
    }

    public final void E() {
        this.s = false;
        a(this.B, this.C);
        invalidate();
    }

    public final void F() {
        this.F = false;
    }

    public final void G(long j2) {
        this.w = j2;
    }

    public final void H() {
        this.f39150l = (int) this.n;
        a(this.B, this.C);
        invalidate();
    }

    public final void J(com.google.firebase.messaging.l lVar) {
        this.I = lVar;
    }

    public void bz(int i2) {
        int i3;
        this.f39139a = i2;
        this.f39140b = i2;
        int i4 = this.B;
        if (i4 > 0 && (i3 = this.C) > 0) {
            a(i4, i3);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        if (isClickable()) {
            int[] drawableState = getDrawableState();
            int length = drawableState.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else {
                    if (drawableState[i2] == 16842919) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            float[] fArr = new float[3];
            Color.colorToHSV(this.f39139a, fArr);
            fArr[2] = fArr[2] * 0.9f;
            u uVar = new u(this, Color.HSVToColor(fArr));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.addUpdateListener(uVar);
            if (z) {
                this.A = true;
                valueAnimatorOfFloat.start();
            } else if (this.A) {
                this.A = false;
                valueAnimatorOfFloat.reverse();
            }
        }
    }

    public void f(int i2) {
        this.f39146h = i2;
        Paint paint = this.p;
        if (paint != null) {
            paint.setColor(i2);
        }
        invalidate();
    }

    public void g(int i2) {
        this.f39145g = i2;
        Paint paint = this.o;
        if (paint != null) {
            paint.setColor(i2);
        }
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.G;
        if (path != null) {
            canvas.drawPath(path, this.H);
        }
        Path path2 = this.t;
        if (path2 != null) {
            if (this.s || this.u > 0 || this.v) {
                canvas.drawPath(path2, this.o);
                if (this.u > 0 || this.v) {
                    canvas.drawPath(this.t, this.p);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.x == i2 && this.y == i3) {
            return;
        }
        this.x = i2;
        this.y = i3;
        c(i2, i3);
        postInvalidate();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (isEnabled()) {
            return;
        }
        h();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (isEnabled()) {
            return;
        }
        e(view);
    }

    final void r(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39066d, i2, i3);
        this.r = typedArrayObtainStyledAttributes.getBoolean(9, this.r);
        this.s = typedArrayObtainStyledAttributes.getBoolean(5, this.s);
        int color = typedArrayObtainStyledAttributes.getColor(0, this.f39139a);
        this.f39139a = color;
        this.f39140b = color;
        this.f39141c = typedArrayObtainStyledAttributes.getFloat(2, this.f39141c);
        if (typedArrayObtainStyledAttributes.hasValue(3) || typedArrayObtainStyledAttributes.hasValue(4)) {
            this.f39144f = true;
            this.f39142d = typedArrayObtainStyledAttributes.getColor(3, this.f39142d);
            this.f39143e = typedArrayObtainStyledAttributes.getColor(4, this.f39143e);
            float[] fArr = new float[3];
            if (!typedArrayObtainStyledAttributes.hasValue(3)) {
                ColorUtils.colorToHSL(this.f39143e, fArr);
                fArr[2] = fArr[2] * 0.85f;
                this.f39142d = ColorUtils.HSLToColor(fArr);
            }
            if (!typedArrayObtainStyledAttributes.hasValue(4)) {
                ColorUtils.colorToHSL(this.f39142d, fArr);
                fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
                this.f39143e = ColorUtils.HSLToColor(fArr);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, this.f39148j);
        this.f39148j = dimensionPixelSize;
        this.f39149k = dimensionPixelSize;
        this.f39147i = typedArrayObtainStyledAttributes.getColor(6, this.f39147i);
        this.f39145g = typedArrayObtainStyledAttributes.getColor(14, this.f39145g);
        this.f39145g = ColorUtils.setAlphaComponent(this.f39145g, (int) (typedArrayObtainStyledAttributes.getFloat(13, 1.0f) * 255.0f));
        this.f39146h = typedArrayObtainStyledAttributes.getColor(8, this.f39146h);
        this.f39150l = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, this.f39150l);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, this.m);
        this.E = typedArrayObtainStyledAttributes.getBoolean(12, this.E);
        this.D = typedArrayObtainStyledAttributes.getBoolean(1, this.D);
        typedArrayObtainStyledAttributes.recycle();
        if (this.s) {
            this.f39150l = this.m / 2;
        }
    }

    void s(Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        this.n = f2;
        if (this.f39148j < 0) {
            int i2 = (int) (5.0f * f2);
            this.f39148j = i2;
            this.f39149k = i2;
        }
        if (this.f39150l < 0) {
            this.f39150l = (int) (3.0f * f2);
        }
        if (this.m < 0) {
            this.m = (int) (f2 * 4.0f);
        }
        setWillNotDraw(false);
        setPersistentDrawingCache(3);
        if (this.r || this.s) {
            Paint paint = new Paint(1);
            this.o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.o.setColor(this.f39145g);
            this.o.setStrokeWidth(this.m);
            Paint paint2 = new Paint(1);
            this.p = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.p.setColor(ContextCompat.getColor(getContext(), R.color.transparent));
            this.p.setStrokeWidth(ContextCompat.getColor(getContext(), R.color.transparent));
            this.p.setPathEffect(this.q);
        }
        if (this.D) {
            setBackground(null);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        int i2;
        super.setEnabled(z);
        if (z) {
            e(this);
        } else {
            h();
        }
        int i3 = this.B;
        if (i3 > 0 && (i2 = this.C) > 0) {
            a(i3, i2);
        }
        invalidate();
    }

    public final void t(int i2) {
        int color = ContextCompat.getColor(getContext(), i2);
        this.f39139a = color;
        this.f39140b = color;
        a(this.B, this.C);
        invalidate();
    }

    public final void u() {
        this.r = true;
        s(getContext());
        c(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void v(int i2) {
        int i3;
        this.f39147i = i2;
        int i4 = this.B;
        if (i4 > 0 && (i3 = this.C) > 0) {
            a(i4, i3);
        }
        invalidate();
    }

    public final void w(int i2) {
        int i3;
        this.f39148j = i2;
        int i4 = this.B;
        if (i4 > 0 && (i3 = this.C) > 0) {
            a(i4, i3);
        }
        invalidate();
    }

    public final void x(int i2) {
        this.m = i2;
        Paint paint = this.p;
        if (paint != null) {
            paint.setStrokeWidth(i2);
        }
        Paint paint2 = this.o;
        if (paint2 != null) {
            paint2.setStrokeWidth(this.m);
        }
        invalidate();
    }

    public final void y() {
        if (this.r) {
            this.u = System.currentTimeMillis();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            s sVar = new s(this, valueAnimatorOfFloat);
            postDelayed(sVar, this.w);
            valueAnimatorOfFloat.addUpdateListener(new t(this, valueAnimatorOfFloat, sVar));
            valueAnimatorOfFloat.setDuration(this.w);
            valueAnimatorOfFloat.start();
        }
    }

    public final void z(long j2) {
        u();
        this.w = j2;
        y();
    }

    public OvalButton(Context context) {
        super(context);
        int color = ContextCompat.getColor(getContext(), R.color.surface_default);
        this.f39139a = color;
        this.f39140b = color;
        this.f39141c = 0.3f;
        this.f39142d = color;
        this.f39143e = color;
        this.f39144f = false;
        this.f39145g = color;
        this.f39146h = ContextCompat.getColor(getContext(), R.color.primary_variant);
        this.f39147i = ContextCompat.getColor(getContext(), R.color.transparent);
        this.f39148j = -1;
        this.f39149k = -1;
        this.f39150l = -1;
        this.m = -1;
        this.r = false;
        this.s = false;
        this.v = false;
        this.x = -1;
        this.y = -1;
        this.A = false;
        this.B = -1;
        this.C = -1;
        this.E = false;
        this.F = true;
        s(context);
    }

    public OvalButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color = ContextCompat.getColor(getContext(), R.color.surface_default);
        this.f39139a = color;
        this.f39140b = color;
        this.f39141c = 0.3f;
        this.f39142d = color;
        this.f39143e = color;
        this.f39144f = false;
        this.f39145g = color;
        this.f39146h = ContextCompat.getColor(getContext(), R.color.primary_variant);
        this.f39147i = ContextCompat.getColor(getContext(), R.color.transparent);
        this.f39148j = -1;
        this.f39149k = -1;
        this.f39150l = -1;
        this.m = -1;
        this.r = false;
        this.s = false;
        this.v = false;
        this.x = -1;
        this.y = -1;
        this.A = false;
        this.B = -1;
        this.C = -1;
        this.E = false;
        this.F = true;
        r(context, attributeSet, i2, 0);
        s(context);
    }

    public OvalButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        int color = ContextCompat.getColor(getContext(), R.color.surface_default);
        this.f39139a = color;
        this.f39140b = color;
        this.f39141c = 0.3f;
        this.f39142d = color;
        this.f39143e = color;
        this.f39144f = false;
        this.f39145g = color;
        this.f39146h = ContextCompat.getColor(getContext(), R.color.primary_variant);
        this.f39147i = ContextCompat.getColor(getContext(), R.color.transparent);
        this.f39148j = -1;
        this.f39149k = -1;
        this.f39150l = -1;
        this.m = -1;
        this.r = false;
        this.s = false;
        this.v = false;
        this.x = -1;
        this.y = -1;
        this.A = false;
        this.B = -1;
        this.C = -1;
        this.E = false;
        this.F = true;
        r(context, attributeSet, i2, i3);
        s(context);
    }
}
