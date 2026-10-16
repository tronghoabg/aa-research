package com.google.android.material.focus;

/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends android.graphics.drawable.DrawableWrapper {
    public float b;
    public defpackage.wqm c;
    private final android.graphics.Paint g;
    private final android.graphics.RectF h;
    private final android.graphics.Rect i;
    private final android.graphics.Path j;
    private final android.graphics.Path k;
    private final android.graphics.Matrix l;
    private final defpackage.wvk m;
    private java.lang.ref.WeakReference n;
    private float o;
    private android.animation.ObjectAnimator p;
    private boolean q;
    private boolean r;
    private boolean s;
    private static final android.graphics.drawable.Drawable d = new android.graphics.drawable.ColorDrawable(0);
    public static final int[] a = {android.R.attr.state_focused, android.R.attr.state_window_focused};
    private static final android.animation.TimeInterpolator e = new android.view.animation.OvershootInterpolator(4.0f);
    private static final android.util.FloatProperty f = new defpackage.wqk();

    private FocusRingDrawable(defpackage.wqm wqmVar, android.content.res.Resources resources) {
        super(null);
        this.g = new android.graphics.Paint(1);
        this.h = new android.graphics.RectF();
        this.i = new android.graphics.Rect();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Path();
        this.l = new android.graphics.Matrix();
        this.m = defpackage.wvk.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        defpackage.wqm wqmVar2 = new defpackage.wqm(wqmVar);
        this.c = wqmVar2;
        android.graphics.drawable.Drawable.ConstantState constantState = wqmVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        k();
    }

    public static android.graphics.drawable.Drawable a(android.content.Context context, android.graphics.drawable.Drawable drawable) {
        return !m(context) ? drawable : new com.google.android.material.focus.FocusRingDrawable(context, drawable);
    }

    public static com.google.android.material.focus.FocusRingDrawable b(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof com.google.android.material.focus.FocusRingDrawable) {
            return (com.google.android.material.focus.FocusRingDrawable) drawable;
        }
        if (drawable instanceof android.graphics.drawable.DrawableWrapper) {
            android.graphics.drawable.Drawable drawable2 = ((android.graphics.drawable.DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof com.google.android.material.focus.FocusRingDrawable) {
                return (com.google.android.material.focus.FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof android.graphics.drawable.LayerDrawable)) {
            return null;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            android.graphics.drawable.Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof com.google.android.material.focus.FocusRingDrawable) {
                return (com.google.android.material.focus.FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static com.google.android.material.focus.FocusRingDrawable c(android.content.Context context, android.graphics.drawable.LayerDrawable layerDrawable, defpackage.wvd wvdVar) {
        if (!m(context)) {
            return null;
        }
        com.google.android.material.focus.FocusRingDrawable focusRingDrawable = new com.google.android.material.focus.FocusRingDrawable(context, d);
        if (wvdVar != null) {
            focusRingDrawable.d(wvdVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    private final float f() {
        defpackage.wqm wqmVar = this.c;
        return wqmVar.p + ((wqmVar.j / 2.0f) * this.b);
    }

    private final void g(android.graphics.RectF rectF) {
        android.graphics.Rect rect = this.c.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.n;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((defpackage.wvd) this.n.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof android.graphics.drawable.RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = (android.graphics.drawable.RippleDrawable) getDrawable();
        android.graphics.Rect rect2 = this.i;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(java.lang.Math.max(0, (rect2.width() / 2) - radius), java.lang.Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    private final void h(android.graphics.Canvas canvas, android.graphics.Path path, float f2, float f3, int i) {
        android.graphics.RectF rectF = this.h;
        g(rectF);
        float f4 = f2 + f2;
        float fWidth = f4 / rectF.width();
        float fHeight = f4 / rectF.height();
        android.graphics.Matrix matrix = this.l;
        matrix.reset();
        matrix.postScale(1.0f - fWidth, 1.0f - fHeight, rectF.centerX(), rectF.centerY());
        android.graphics.Path path2 = this.j;
        path.transform(matrix, path2);
        float f5 = f3 * this.b;
        android.graphics.Paint paint = this.g;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    private final void i(android.graphics.Canvas canvas, float f2, float f3, float f4, int i) {
        android.graphics.RectF rectF = this.h;
        g(rectF);
        rectF.inset(f3, f3);
        float f5 = f4 * this.b;
        android.graphics.Paint paint = this.g;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    private final void j(android.content.res.Resources.Theme theme) {
        android.util.TypedValue typedValueBo;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(defpackage.wqo.a);
        int i = this.c.d;
        if (i != Integer.MIN_VALUE && (typedValueBo = defpackage.sqs.bo(theme, i)) != null) {
            this.c.c = typedValueBo.data != 0;
            this.c.e = true;
        }
        defpackage.wqm wqmVar = this.c;
        if (!wqmVar.e) {
            wqmVar.c = defpackage.sqs.br(theme, com.google.android.projection.gearhead.R.attr.focusRingsEnabled, wqmVar.c);
        }
        defpackage.wqm wqmVar2 = this.c;
        if (wqmVar2.c) {
            wqmVar2.f = q(wqmVar2.f, theme, wqmVar2.g, typedArrayObtainStyledAttributes, 13, -16777216);
            defpackage.wqm wqmVar3 = this.c;
            wqmVar3.h = q(wqmVar3.h, theme, wqmVar3.i, typedArrayObtainStyledAttributes, 9, -1);
            defpackage.wqm wqmVar4 = this.c;
            wqmVar4.j = r(wqmVar4.j, theme, wqmVar4.k, typedArrayObtainStyledAttributes, 14, com.google.android.projection.gearhead.R.dimen.mtrl_focus_ring_outer_stroke_width);
            defpackage.wqm wqmVar5 = this.c;
            wqmVar5.l = r(wqmVar5.l, theme, wqmVar5.m, typedArrayObtainStyledAttributes, 11, com.google.android.projection.gearhead.R.dimen.mtrl_focus_ring_inner_stroke_width);
            defpackage.wqm wqmVar6 = this.c;
            wqmVar6.n = r(wqmVar6.n, theme, wqmVar6.o, typedArrayObtainStyledAttributes, 15, 0);
            defpackage.wqm wqmVar7 = this.c;
            wqmVar7.p = r(wqmVar7.p, theme, wqmVar7.q, typedArrayObtainStyledAttributes, 12, 0);
            if (java.lang.Float.isNaN(this.c.p)) {
                this.c.p = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
            defpackage.wqm wqmVar8 = this.c;
            wqmVar8.r = r(wqmVar8.r, theme, wqmVar8.s, typedArrayObtainStyledAttributes, 10, com.google.android.projection.gearhead.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            defpackage.wqm wqmVar9 = this.c;
            int i2 = wqmVar9.u;
            if (i2 != Integer.MIN_VALUE) {
                wqmVar9.t = new defpackage.wvi(defpackage.wvi.i(theme, i2));
            } else {
                int i3 = wqmVar9.v;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = com.google.android.projection.gearhead.R.attr.focusRingsShapeAppearance;
                }
                android.util.TypedValue typedValueBo2 = defpackage.sqs.bo(theme, i3);
                if (typedValueBo2 != null) {
                    this.c.t = new defpackage.wvi(defpackage.wvi.i(theme, typedValueBo2.resourceId));
                }
            }
            defpackage.wqm wqmVar10 = this.c;
            int i4 = wqmVar10.y;
            if (i4 != Integer.MIN_VALUE) {
                wqmVar10.x = o(theme, i4);
            } else {
                android.util.TypedValue typedValueBo3 = defpackage.sqs.bo(theme, com.google.android.projection.gearhead.R.attr.focusRingsStateSet);
                if (typedValueBo3 != null && typedValueBo3.resourceId != 0) {
                    this.c.x = o(theme, typedValueBo3.resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        k();
    }

    private final void k() {
        android.graphics.Paint paint = this.g;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        if (java.lang.Float.isNaN(this.c.j)) {
            return;
        }
        paint.setStrokeWidth(this.c.j);
    }

    private final void l(defpackage.wvh wvhVar) {
        android.graphics.RectF rectF = this.h;
        g(rectF);
        defpackage.wvi wviVarB = wvhVar.b(a);
        if (!wviVarB.h(rectF)) {
            this.m.c(wviVarB, null, 1.0f, rectF, null, this.k);
            this.o = -1.0f;
        } else {
            float f2 = f();
            rectF.inset(f2, f2);
            this.o = wviVarB.b.a(rectF);
            this.k.reset();
        }
    }

    private static boolean m(android.content.Context context) {
        return defpackage.sqs.br(context.getTheme(), com.google.android.projection.gearhead.R.attr.focusRingsEnabled, false);
    }

    private static final int n(android.content.res.TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 1) {
            return typedArray.getResourceId(i, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private static final int[] o(android.content.res.Resources.Theme theme, int i) {
        android.content.res.TypedArray typedArrayObtainTypedArray = theme.getResources().obtainTypedArray(i);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    private static final int p(android.content.res.TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private static final int q(int i, android.content.res.Resources.Theme theme, int i2, android.content.res.TypedArray typedArray, int i3, int i4) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 != Integer.MIN_VALUE) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i3, i4);
    }

    private static final float r(float f2, android.content.res.Resources.Theme theme, int i, android.content.res.TypedArray typedArray, int i2, int i3) {
        if (!java.lang.Float.isNaN(f2)) {
            return f2;
        }
        android.content.res.Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!java.lang.Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
        j(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(defpackage.wvd wvdVar) {
        this.n = new java.lang.ref.WeakReference(wvdVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        float fMax;
        android.graphics.drawable.Drawable drawable;
        float f2;
        int radius;
        super.draw(canvas);
        if (this.c.c && this.r) {
            float f3 = f();
            defpackage.wqm wqmVar = this.c;
            float f4 = wqmVar.p + wqmVar.r;
            float f5 = (wqmVar.l / 2.0f) * this.b;
            android.graphics.Path path = this.k;
            if (path.isEmpty()) {
                java.lang.ref.WeakReference weakReference = this.n;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((defpackage.wvd) this.n.get()).v;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            float f6 = f4 + f5;
            defpackage.wqm wqmVar2 = this.c;
            if (path != null) {
                h(canvas, path, f6, wqmVar2.l, wqmVar2.h);
                defpackage.wqm wqmVar3 = this.c;
                h(canvas, path, f3, wqmVar3.j, wqmVar3.f);
                return;
            }
            if (java.lang.Float.isNaN(wqmVar2.n)) {
                fMax = this.o;
                if (fMax < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    java.lang.ref.WeakReference weakReference2 = this.n;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof android.graphics.drawable.RippleDrawable) || (radius = ((android.graphics.drawable.RippleDrawable) drawable).getRadius()) < 0) {
                            f2 = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        defpackage.wvd wvdVar = (defpackage.wvd) this.n.get();
                        float fT = wvdVar.t(wvdVar.F(), wvdVar.p.a.a(), wvdVar.z);
                        if (fT >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            fT *= wvdVar.p.k;
                        }
                        if (fT >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            fMax = java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fT - (this.c.j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof android.graphics.drawable.RippleDrawable) {
                            }
                            f2 = 0.0f;
                        }
                    }
                }
                float fMax2 = java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f2 - (this.c.j / 2.0f));
                defpackage.wqm wqmVar4 = this.c;
                i(canvas, fMax2, f6, wqmVar4.l, wqmVar4.h);
                defpackage.wqm wqmVar5 = this.c;
                i(canvas, f2, f3, wqmVar5.j, wqmVar5.f);
            }
            fMax = this.c.n;
            f2 = fMax;
            float fMax3 = java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f2 - (this.c.j / 2.0f));
            defpackage.wqm wqmVar6 = this.c;
            i(canvas, fMax3, f6, wqmVar6.l, wqmVar6.h);
            defpackage.wqm wqmVar7 = this.c;
            i(canvas, f2, f3, wqmVar7.j, wqmVar7.f);
        }
    }

    public final void e(defpackage.wvh wvhVar) {
        this.c.t = wvhVar;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        defpackage.wqm wqmVar = this.c;
        if (wqmVar.a == null) {
            return null;
        }
        wqmVar.b = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.c.c;
        } catch (java.lang.NoSuchMethodError unused) {
            return this.c.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, defpackage.wqo.a, 0, 0) : resources.obtainAttributes(attributeSet, defpackage.wqo.a);
        this.c.d = p(typedArrayObtainStyledAttributes, 8);
        if (this.c.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(8)) {
            defpackage.wqm wqmVar = this.c;
            wqmVar.c = typedArrayObtainStyledAttributes.getBoolean(8, wqmVar.c);
            this.c.e = true;
        }
        this.c.g = p(typedArrayObtainStyledAttributes, 13);
        defpackage.wqm wqmVar2 = this.c;
        if (wqmVar2.g == Integer.MIN_VALUE) {
            wqmVar2.f = typedArrayObtainStyledAttributes.getColor(13, Integer.MIN_VALUE);
        }
        this.c.i = p(typedArrayObtainStyledAttributes, 9);
        defpackage.wqm wqmVar3 = this.c;
        if (wqmVar3.i == Integer.MIN_VALUE) {
            wqmVar3.h = typedArrayObtainStyledAttributes.getColor(9, Integer.MIN_VALUE);
        }
        this.c.k = p(typedArrayObtainStyledAttributes, 14);
        defpackage.wqm wqmVar4 = this.c;
        if (wqmVar4.k == Integer.MIN_VALUE) {
            wqmVar4.j = typedArrayObtainStyledAttributes.getDimension(14, Float.NaN);
        }
        this.c.m = p(typedArrayObtainStyledAttributes, 11);
        defpackage.wqm wqmVar5 = this.c;
        if (wqmVar5.m == Integer.MIN_VALUE) {
            wqmVar5.l = typedArrayObtainStyledAttributes.getDimension(11, Float.NaN);
        }
        this.c.m = p(typedArrayObtainStyledAttributes, 11);
        defpackage.wqm wqmVar6 = this.c;
        if (wqmVar6.m == Integer.MIN_VALUE) {
            wqmVar6.l = typedArrayObtainStyledAttributes.getDimension(11, Float.NaN);
        }
        this.c.o = p(typedArrayObtainStyledAttributes, 15);
        defpackage.wqm wqmVar7 = this.c;
        if (wqmVar7.o == Integer.MIN_VALUE) {
            wqmVar7.n = typedArrayObtainStyledAttributes.getDimension(15, Float.NaN);
        }
        this.c.q = p(typedArrayObtainStyledAttributes, 12);
        defpackage.wqm wqmVar8 = this.c;
        if (wqmVar8.q == Integer.MIN_VALUE) {
            wqmVar8.p = typedArrayObtainStyledAttributes.getDimension(12, Float.NaN);
        }
        this.c.s = p(typedArrayObtainStyledAttributes, 10);
        defpackage.wqm wqmVar9 = this.c;
        if (wqmVar9.s == Integer.MIN_VALUE) {
            wqmVar9.r = typedArrayObtainStyledAttributes.getDimension(10, Float.NaN);
        }
        this.c.v = p(typedArrayObtainStyledAttributes, 16);
        this.c.u = n(typedArrayObtainStyledAttributes, 16);
        this.c.y = n(typedArrayObtainStyledAttributes, 17);
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        android.graphics.drawable.Drawable drawableCreateFromXmlInner = null;
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
                drawableCreateFromXmlInner = android.graphics.drawable.Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.c.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            android.graphics.drawable.Drawable drawable = d;
            setDrawable(drawable);
            this.c.a = drawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.c.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        android.animation.ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.p = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.c = new defpackage.wqm(this.c);
            android.graphics.drawable.Drawable drawable = getDrawable();
            if (drawable != null) {
                this.c.a = drawable.getConstantState();
            }
            this.s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        super.onBoundsChange(rect);
        defpackage.wqm wqmVar = this.c;
        if (wqmVar.c) {
            defpackage.wvh wvhVar = wqmVar.t;
            if (wvhVar != null) {
                l(wvhVar);
                return;
            }
            android.graphics.drawable.Drawable drawable = getDrawable();
            defpackage.wvi wviVar = null;
            if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
                android.graphics.Outline outline = new android.graphics.Outline();
                ((android.graphics.drawable.ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    defpackage.xta xtaVar = new defpackage.xta((char[]) null);
                    xtaVar.l(outline.getRadius());
                    wviVar = new defpackage.wvi(xtaVar);
                }
            } else if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (java.lang.NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    defpackage.xta xtaVar2 = new defpackage.xta((char[]) null);
                    xtaVar2.j(java.lang.Math.min(cornerRadii[0], cornerRadii[1]));
                    xtaVar2.k(java.lang.Math.min(cornerRadii[2], cornerRadii[3]));
                    xtaVar2.i(java.lang.Math.min(cornerRadii[4], cornerRadii[5]));
                    xtaVar2.h(java.lang.Math.min(cornerRadii[6], cornerRadii[7]));
                    wviVar = new defpackage.wvi(xtaVar2);
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (java.lang.NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        defpackage.xta xtaVar3 = new defpackage.xta((char[]) null);
                        xtaVar3.l(cornerRadius);
                        wviVar = new defpackage.wvi(xtaVar3);
                    }
                }
            }
            if (wviVar != null) {
                l(wviVar);
            } else {
                this.o = -1.0f;
                this.k.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        defpackage.wqm wqmVar = this.c;
        if (!wqmVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = android.util.StateSet.stateSetMatches(wqmVar.x, iArr);
        boolean z = this.r != zStateSetMatches;
        this.r = zStateSetMatches;
        if (z && iArr.length > 0 && !this.q) {
            android.animation.ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            if (zStateSetMatches) {
                android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(e);
                objectAnimatorOfFloat.addListener(new defpackage.wql(this));
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
        this.g = new android.graphics.Paint(1);
        this.h = new android.graphics.RectF();
        this.i = new android.graphics.Rect();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Path();
        this.l = new android.graphics.Matrix();
        this.m = defpackage.wvk.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        this.c = new defpackage.wqm(null);
    }

    public FocusRingDrawable(android.content.Context context, android.graphics.drawable.Drawable drawable) {
        super(drawable);
        this.g = new android.graphics.Paint(1);
        this.h = new android.graphics.RectF();
        this.i = new android.graphics.Rect();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Path();
        this.l = new android.graphics.Matrix();
        this.m = defpackage.wvk.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        defpackage.wqm wqmVar = new defpackage.wqm(null);
        this.c = wqmVar;
        if (drawable != null) {
            wqmVar.a = drawable.getConstantState();
        }
        j(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(defpackage.wqm wqmVar, android.content.res.Resources resources, defpackage.wqn wqnVar) {
        this(wqmVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
