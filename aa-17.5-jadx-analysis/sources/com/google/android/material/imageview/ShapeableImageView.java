package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.jf;
import defpackage.wps;
import defpackage.wpt;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuk;
import defpackage.wul;
import defpackage.wum;
import defpackage.wuv;
import defpackage.wxp;

/* loaded from: classes3.dex */
public class ShapeableImageView extends jf implements wuv {
    public final RectF a;
    public wue b;
    public wuk c;
    private final wum d;
    private final RectF e;
    private final Paint f;
    private final Paint g;
    private final Path h;
    private ColorStateList i;
    private float j;
    private Path k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(wxp.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.d = wul.a;
        this.h = new Path();
        this.r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
        this.e = new RectF();
        this.k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, wps.a, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.i = wub.h(context2, typedArrayObtainStyledAttributes, 9);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.c = new wuk(wuk.l(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView));
        setOutlineProvider(new wpt(this));
    }

    private final void h(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        int paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.a;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        wum wumVar = this.d;
        wuk wukVar = this.c;
        Path path = this.h;
        wumVar.c(wukVar, null, 1.0f, rectF, null, path);
        this.k.rewind();
        this.k.addPath(path);
        RectF rectF2 = this.e;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
        this.k.addRect(rectF2, Path.Direction.CCW);
    }

    private final boolean i() {
        return (this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) ? false : true;
    }

    private final boolean j() {
        return getLayoutDirection() == 1;
    }

    public final int b() {
        int i = this.q;
        return i != Integer.MIN_VALUE ? i : j() ? this.l : this.n;
    }

    public final int c() {
        int i;
        int i2;
        if (i()) {
            if (j() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!j() && (i = this.p) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.l;
    }

    @Override // defpackage.wuv
    public final void d(wuk wukVar) {
        this.c = wukVar;
        wue wueVar = this.b;
        if (wueVar != null) {
            wueVar.d(wukVar);
        }
        h(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public final int e() {
        int i;
        int i2;
        if (i()) {
            if (j() && (i2 = this.p) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!j() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    public final int f() {
        int i = this.p;
        return i != Integer.MIN_VALUE ? i : j() ? this.n : this.l;
    }

    @Override // defpackage.wuv
    public final wuk fD() {
        throw null;
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.l) + i, (super.getPaddingTop() - this.m) + i2, (super.getPaddingRight() - this.n) + i3, (super.getPaddingBottom() - this.o) + i4);
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = i4;
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.o;
    }

    @Override // android.view.View
    public final int getPaddingEnd() {
        return super.getPaddingEnd() - b();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - c();
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return super.getPaddingRight() - e();
    }

    @Override // android.view.View
    public final int getPaddingStart() {
        return super.getPaddingStart() - f();
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return super.getPaddingTop() - this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.g);
        if (this.i == null) {
            return;
        }
        Paint paint = this.f;
        paint.setStrokeWidth(this.j);
        int colorForState = this.i.getColorForState(getDrawableState(), this.i.getDefaultColor());
        if (this.j <= BitmapDescriptorFactory.HUE_RED || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.h, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.r && isLayoutDirectionResolved()) {
            this.r = true;
            if (isPaddingRelative() || i()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + c(), i2 + this.m, i3 + e(), i4 + this.o);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + f(), i2 + this.m, i3 + b(), i4 + this.o);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
