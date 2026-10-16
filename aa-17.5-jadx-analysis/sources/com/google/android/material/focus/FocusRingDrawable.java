package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.woy;
import defpackage.wpn;
import defpackage.wpo;
import defpackage.wpp;
import defpackage.wpq;
import defpackage.wpr;
import defpackage.wue;
import defpackage.wui;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.wum;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public float b;
    public wpp c;
    private final Paint g;
    private final RectF h;
    private final Rect i;
    private final Path j;
    private final Path k;
    private final Matrix l;
    private final wum m;
    private WeakReference n;
    private float o;
    private ObjectAnimator p;
    private boolean q;
    private boolean r;
    private boolean s;
    private static final Drawable d = new ColorDrawable(0);
    public static final int[] a = {R.attr.state_focused, R.attr.state_window_focused};
    private static final TimeInterpolator e = new OvershootInterpolator(4.0f);
    private static final FloatProperty f = new wpn();

    private FocusRingDrawable(wpp wppVar, Resources resources) {
        super(null);
        this.g = new Paint(1);
        this.h = new RectF();
        this.i = new Rect();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = wum.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        wpp wppVar2 = new wpp(wppVar);
        this.c = wppVar2;
        Drawable.ConstantState constantState = wppVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        k();
    }

    public static Drawable a(Context context, Drawable drawable) {
        return !m(context) ? drawable : new FocusRingDrawable(context, drawable);
    }

    public static FocusRingDrawable b(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static FocusRingDrawable c(Context context, LayerDrawable layerDrawable, wue wueVar) {
        if (!m(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, d);
        if (wueVar != null) {
            focusRingDrawable.d(wueVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    private final float f() {
        wpp wppVar = this.c;
        return wppVar.p + ((wppVar.j / 2.0f) * this.b);
    }

    private final void g(RectF rectF) {
        Rect rect = this.c.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.n;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((wue) this.n.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.i;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    private final void h(Canvas canvas, Path path, float f2, float f3, int i) {
        RectF rectF = this.h;
        g(rectF);
        float f4 = f2 + f2;
        float fWidth = f4 / rectF.width();
        float fHeight = f4 / rectF.height();
        Matrix matrix = this.l;
        matrix.reset();
        matrix.postScale(1.0f - fWidth, 1.0f - fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.j;
        path.transform(matrix, path2);
        float f5 = f3 * this.b;
        Paint paint = this.g;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    private final void i(Canvas canvas, float f2, float f3, float f4, int i) {
        RectF rectF = this.h;
        g(rectF);
        rectF.inset(f3, f3);
        float f5 = f4 * this.b;
        Paint paint = this.g;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    private final void j(Resources.Theme theme) {
        TypedValue typedValueX;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(wpr.a);
        int i = this.c.d;
        if (i != Integer.MIN_VALUE && (typedValueX = woy.x(theme, i)) != null) {
            this.c.c = typedValueX.data != 0;
            this.c.e = true;
        }
        wpp wppVar = this.c;
        if (!wppVar.e) {
            wppVar.c = woy.A(theme, com.google.android.projection.gearhead.R.attr.focusRingsEnabled, wppVar.c);
        }
        wpp wppVar2 = this.c;
        if (wppVar2.c) {
            wppVar2.f = q(wppVar2.f, theme, wppVar2.g, typedArrayObtainStyledAttributes, 13, -16777216);
            wpp wppVar3 = this.c;
            wppVar3.h = q(wppVar3.h, theme, wppVar3.i, typedArrayObtainStyledAttributes, 9, -1);
            wpp wppVar4 = this.c;
            wppVar4.j = r(wppVar4.j, theme, wppVar4.k, typedArrayObtainStyledAttributes, 14, com.google.android.projection.gearhead.R.dimen.mtrl_focus_ring_outer_stroke_width);
            wpp wppVar5 = this.c;
            wppVar5.l = r(wppVar5.l, theme, wppVar5.m, typedArrayObtainStyledAttributes, 11, com.google.android.projection.gearhead.R.dimen.mtrl_focus_ring_inner_stroke_width);
            wpp wppVar6 = this.c;
            wppVar6.n = r(wppVar6.n, theme, wppVar6.o, typedArrayObtainStyledAttributes, 15, 0);
            wpp wppVar7 = this.c;
            wppVar7.p = r(wppVar7.p, theme, wppVar7.q, typedArrayObtainStyledAttributes, 12, 0);
            if (Float.isNaN(this.c.p)) {
                this.c.p = BitmapDescriptorFactory.HUE_RED;
            }
            wpp wppVar8 = this.c;
            wppVar8.r = r(wppVar8.r, theme, wppVar8.s, typedArrayObtainStyledAttributes, 10, com.google.android.projection.gearhead.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            wpp wppVar9 = this.c;
            int i2 = wppVar9.u;
            if (i2 != Integer.MIN_VALUE) {
                wppVar9.t = new wuk(wuk.h(theme, i2));
            } else {
                int i3 = wppVar9.v;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = com.google.android.projection.gearhead.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueX2 = woy.x(theme, i3);
                if (typedValueX2 != null) {
                    this.c.t = new wuk(wuk.h(theme, typedValueX2.resourceId));
                }
            }
            wpp wppVar10 = this.c;
            int i4 = wppVar10.y;
            if (i4 != Integer.MIN_VALUE) {
                wppVar10.x = o(theme, i4);
            } else {
                TypedValue typedValueX3 = woy.x(theme, com.google.android.projection.gearhead.R.attr.focusRingsStateSet);
                if (typedValueX3 != null && typedValueX3.resourceId != 0) {
                    this.c.x = o(theme, typedValueX3.resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        k();
    }

    private final void k() {
        Paint paint = this.g;
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.c.j)) {
            return;
        }
        paint.setStrokeWidth(this.c.j);
    }

    private final void l(wui wuiVar) {
        RectF rectF = this.h;
        g(rectF);
        wuk wukVarB = wuiVar.b(a);
        if (!wukVarB.j(rectF)) {
            this.m.c(wukVarB, null, 1.0f, rectF, null, this.k);
            this.o = -1.0f;
        } else {
            float f2 = f();
            rectF.inset(f2, f2);
            this.o = wukVarB.b.a(rectF);
            this.k.reset();
        }
    }

    private static boolean m(Context context) {
        return woy.A(context.getTheme(), com.google.android.projection.gearhead.R.attr.focusRingsEnabled, false);
    }

    private static final int n(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 1) {
            return typedArray.getResourceId(i, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private static final int[] o(Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = theme.getResources().obtainTypedArray(i);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    private static final int p(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private static final int q(int i, Resources.Theme theme, int i2, TypedArray typedArray, int i3, int i4) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i3, i4);
    }

    private static final float r(float f2, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f2)) {
            return f2;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        j(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(wue wueVar) {
        this.n = new WeakReference(wueVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.draw(android.graphics.Canvas):void");
    }

    public final void e(wui wuiVar) {
        this.c.t = wuiVar;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        wpp wppVar = this.c;
        if (wppVar.a == null) {
            return null;
        }
        wppVar.b = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.c.c;
        } catch (NoSuchMethodError unused) {
            return this.c.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, wpr.a, 0, 0) : resources.obtainAttributes(attributeSet, wpr.a);
        this.c.d = p(typedArrayObtainStyledAttributes, 8);
        if (this.c.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(8)) {
            wpp wppVar = this.c;
            wppVar.c = typedArrayObtainStyledAttributes.getBoolean(8, wppVar.c);
            this.c.e = true;
        }
        this.c.g = p(typedArrayObtainStyledAttributes, 13);
        wpp wppVar2 = this.c;
        if (wppVar2.g == Integer.MIN_VALUE) {
            wppVar2.f = typedArrayObtainStyledAttributes.getColor(13, Integer.MIN_VALUE);
        }
        this.c.i = p(typedArrayObtainStyledAttributes, 9);
        wpp wppVar3 = this.c;
        if (wppVar3.i == Integer.MIN_VALUE) {
            wppVar3.h = typedArrayObtainStyledAttributes.getColor(9, Integer.MIN_VALUE);
        }
        this.c.k = p(typedArrayObtainStyledAttributes, 14);
        wpp wppVar4 = this.c;
        if (wppVar4.k == Integer.MIN_VALUE) {
            wppVar4.j = typedArrayObtainStyledAttributes.getDimension(14, Float.NaN);
        }
        this.c.m = p(typedArrayObtainStyledAttributes, 11);
        wpp wppVar5 = this.c;
        if (wppVar5.m == Integer.MIN_VALUE) {
            wppVar5.l = typedArrayObtainStyledAttributes.getDimension(11, Float.NaN);
        }
        this.c.m = p(typedArrayObtainStyledAttributes, 11);
        wpp wppVar6 = this.c;
        if (wppVar6.m == Integer.MIN_VALUE) {
            wppVar6.l = typedArrayObtainStyledAttributes.getDimension(11, Float.NaN);
        }
        this.c.o = p(typedArrayObtainStyledAttributes, 15);
        wpp wppVar7 = this.c;
        if (wppVar7.o == Integer.MIN_VALUE) {
            wppVar7.n = typedArrayObtainStyledAttributes.getDimension(15, Float.NaN);
        }
        this.c.q = p(typedArrayObtainStyledAttributes, 12);
        wpp wppVar8 = this.c;
        if (wppVar8.q == Integer.MIN_VALUE) {
            wppVar8.p = typedArrayObtainStyledAttributes.getDimension(12, Float.NaN);
        }
        this.c.s = p(typedArrayObtainStyledAttributes, 10);
        wpp wppVar9 = this.c;
        if (wppVar9.s == Integer.MIN_VALUE) {
            wppVar9.r = typedArrayObtainStyledAttributes.getDimension(10, Float.NaN);
        }
        this.c.v = p(typedArrayObtainStyledAttributes, 16);
        this.c.u = n(typedArrayObtainStyledAttributes, 16);
        this.c.y = n(typedArrayObtainStyledAttributes, 17);
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.c.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            Drawable drawable = d;
            setDrawable(drawable);
            this.c.a = drawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.c.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.p = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.c = new wpp(this.c);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.c.a = drawable.getConstantState();
            }
            this.s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        super.onBoundsChange(rect);
        wpp wppVar = this.c;
        if (wppVar.c) {
            wui wuiVar = wppVar.t;
            if (wuiVar != null) {
                l(wuiVar);
                return;
            }
            Drawable drawable = getDrawable();
            wuk wukVar = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > BitmapDescriptorFactory.HUE_RED) {
                    wuj wujVar = new wuj();
                    wujVar.e(outline.getRadius());
                    wukVar = new wuk(wujVar);
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    wuj wujVar2 = new wuj();
                    wujVar2.c(Math.min(cornerRadii[0], cornerRadii[1]));
                    wujVar2.d(Math.min(cornerRadii[2], cornerRadii[3]));
                    wujVar2.b(Math.min(cornerRadii[4], cornerRadii[5]));
                    wujVar2.a(Math.min(cornerRadii[6], cornerRadii[7]));
                    wukVar = new wuk(wujVar2);
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > BitmapDescriptorFactory.HUE_RED) {
                        wuj wujVar3 = new wuj();
                        wujVar3.e(cornerRadius);
                        wukVar = new wuk(wujVar3);
                    }
                }
            }
            if (wukVar != null) {
                l(wukVar);
            } else {
                this.o = -1.0f;
                this.k.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        wpp wppVar = this.c;
        if (!wppVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(wppVar.x, iArr);
        boolean z = this.r != zStateSetMatches;
        this.r = zStateSetMatches;
        if (z && iArr.length > 0 && !this.q) {
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f, BitmapDescriptorFactory.HUE_RED, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(e);
                objectAnimatorOfFloat.addListener(new wpo(this));
                this.p = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.b = 1.0f;
            }
        }
        this.q = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.g = new Paint(1);
        this.h = new RectF();
        this.i = new Rect();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = wum.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        this.c = new wpp(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.g = new Paint(1);
        this.h = new RectF();
        this.i = new Rect();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = wum.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        wpp wppVar = new wpp(null);
        this.c = wppVar;
        if (drawable != null) {
            wppVar.a = drawable.getConstantState();
        }
        j(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(wpp wppVar, Resources resources, wpq wpqVar) {
        this(wppVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
