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
import com.google.android.material.internal.t;
import com.google.android.material.k.k;
import com.google.android.material.k.o;
import com.google.android.material.k.p;
import com.google.android.material.k.r;
import com.google.android.material.k.u;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* renamed from: a, reason: collision with root package name */
    private static final Drawable f6515a = new ColorDrawable(0);

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6516b = {R.attr.state_focused, R.attr.state_window_focused};

    /* renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f6517c = new OvershootInterpolator(4.0f);

    /* renamed from: d, reason: collision with root package name */
    private static final FloatProperty f6518d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final Paint f6519e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f6520f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f6521g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f6522h;

    /* renamed from: i, reason: collision with root package name */
    private final Path f6523i;

    /* renamed from: j, reason: collision with root package name */
    private final Matrix f6524j;

    /* renamed from: k, reason: collision with root package name */
    private final u f6525k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference f6526l;
    private float m;
    private ObjectAnimator n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r;
    private c s;

    private FocusRingDrawable(c cVar, Resources resources) {
        super(null);
        this.f6519e = new Paint(1);
        this.f6520f = new RectF();
        this.f6521g = new Rect();
        this.f6522h = new Path();
        this.f6523i = new Path();
        this.f6524j = new Matrix();
        this.f6525k = u.a();
        this.m = -1.0f;
        this.o = 1.0f;
        this.q = false;
        this.r = false;
        c cVar2 = new c(cVar);
        this.s = cVar2;
        Drawable.ConstantState constantState = cVar2.f6528a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        p();
    }

    public static Drawable b(Context context, Drawable drawable) {
        return !r(context) ? drawable : new FocusRingDrawable(context, drawable);
    }

    public static FocusRingDrawable c(Context context, LayerDrawable layerDrawable) {
        return d(context, layerDrawable, null);
    }

    public static FocusRingDrawable d(Context context, LayerDrawable layerDrawable, k kVar) {
        if (!r(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f6515a);
        if (kVar != null) {
            focusRingDrawable.g(kVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    private final float k() {
        return this.s.p + ((this.s.f6537j / 2.0f) * this.o);
    }

    private final void l(RectF rectF) {
        if (this.s.w != null) {
            rectF.set(this.s.w);
            return;
        }
        WeakReference weakReference = this.f6526l;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((k) this.f6526l.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect = this.f6521g;
        rippleDrawable.getHotspotBounds(rect);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect.inset(Math.max(0, (rect.width() / 2) - radius), Math.max(0, (rect.height() / 2) - radius));
        }
        rectF.set(rect);
    }

    private final void m(Canvas canvas, Path path, float f2, float f3, int i2) {
        RectF rectF = this.f6520f;
        l(rectF);
        float f4 = f2 + f2;
        float fWidth = f4 / rectF.width();
        float fHeight = f4 / rectF.height();
        Matrix matrix = this.f6524j;
        matrix.reset();
        matrix.postScale(1.0f - fWidth, 1.0f - fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f6522h;
        path.transform(matrix, path2);
        float f5 = f3 * this.o;
        Paint paint = this.f6519e;
        paint.setStrokeWidth(f5);
        paint.setColor(i2);
        canvas.drawPath(path2, paint);
    }

    private final void n(Canvas canvas, float f2, float f3, float f4, int i2) {
        RectF rectF = this.f6520f;
        l(rectF);
        rectF.inset(f3, f3);
        float f5 = f4 * this.o;
        Paint paint = this.f6519e;
        paint.setStrokeWidth(f5);
        paint.setColor(i2);
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    private final void o(Resources.Theme theme) {
        TypedValue typedValueH;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(e.f6540a);
        if (this.s.f6531d != Integer.MIN_VALUE && (typedValueH = t.h(theme, this.s.f6531d)) != null) {
            this.s.f6530c = typedValueH.data != 0;
            this.s.f6532e = true;
        }
        if (!this.s.f6532e) {
            c cVar = this.s;
            cVar.f6530c = t.k(theme, com.waze.R.attr.focusRingsEnabled, cVar.f6530c);
        }
        if (this.s.f6530c) {
            c cVar2 = this.s;
            cVar2.f6533f = v(cVar2.f6533f, theme, this.s.f6534g, typedArrayObtainStyledAttributes, 5, -16777216);
            c cVar3 = this.s;
            cVar3.f6535h = v(cVar3.f6535h, theme, this.s.f6536i, typedArrayObtainStyledAttributes, 1, -1);
            c cVar4 = this.s;
            cVar4.f6537j = w(cVar4.f6537j, theme, this.s.f6538k, typedArrayObtainStyledAttributes, 6, com.waze.R.dimen.mtrl_focus_ring_outer_stroke_width);
            c cVar5 = this.s;
            cVar5.f6539l = w(cVar5.f6539l, theme, this.s.m, typedArrayObtainStyledAttributes, 3, com.waze.R.dimen.mtrl_focus_ring_inner_stroke_width);
            c cVar6 = this.s;
            cVar6.n = w(cVar6.n, theme, this.s.o, typedArrayObtainStyledAttributes, 7, 0);
            c cVar7 = this.s;
            cVar7.p = w(cVar7.p, theme, this.s.q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.s.p)) {
                this.s.p = 0.0f;
            }
            c cVar8 = this.s;
            cVar8.r = w(cVar8.r, theme, this.s.s, typedArrayObtainStyledAttributes, 2, com.waze.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            int i2 = this.s.u;
            c cVar9 = this.s;
            if (i2 != Integer.MIN_VALUE) {
                cVar9.t = r.k(theme, cVar9.u).i();
            } else {
                TypedValue typedValueH2 = t.h(theme, cVar9.v != Integer.MIN_VALUE ? this.s.v : com.waze.R.attr.focusRingsShapeAppearance);
                if (typedValueH2 != null) {
                    this.s.t = r.k(theme, typedValueH2.resourceId).i();
                }
            }
            if (this.s.y != Integer.MIN_VALUE) {
                c cVar10 = this.s;
                cVar10.x = t(theme, cVar10.y);
            } else {
                TypedValue typedValueH3 = t.h(theme, com.waze.R.attr.focusRingsStateSet);
                if (typedValueH3 != null && typedValueH3.resourceId != 0) {
                    this.s.x = t(theme, typedValueH3.resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        p();
    }

    private final void p() {
        Paint paint = this.f6519e;
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.s.f6537j)) {
            return;
        }
        paint.setStrokeWidth(this.s.f6537j);
    }

    private final void q(o oVar) {
        RectF rectF = this.f6520f;
        l(rectF);
        r rVarB = oVar.b(f6516b);
        if (!rVarB.o(rectF)) {
            this.f6525k.b(rVarB, null, 1.0f, rectF, null, this.f6523i);
            this.m = -1.0f;
        } else {
            float fK = k();
            rectF.inset(fK, fK);
            this.m = rVarB.i().a(rectF);
            this.f6523i.reset();
        }
    }

    private static boolean r(Context context) {
        return t.k(context.getTheme(), com.waze.R.attr.focusRingsEnabled, false);
    }

    private static final int s(TypedArray typedArray, int i2) {
        if (typedArray.getType(i2) == 1) {
            return typedArray.getResourceId(i2, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private static final int[] t(Resources.Theme theme, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = theme.getResources().obtainTypedArray(i2);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
            iArr[i3] = typedArrayObtainTypedArray.getResourceId(i3, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    private static final int u(TypedArray typedArray, int i2) {
        if (typedArray.getType(i2) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i2, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private static final int v(int i2, Resources.Theme theme, int i3, TypedArray typedArray, int i4, int i5) {
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i3, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i4, i5);
    }

    private static final float w(float f2, Resources.Theme theme, int i2, TypedArray typedArray, int i3, int i4) {
        if (!Float.isNaN(f2)) {
            return f2;
        }
        Resources resources = theme.getResources();
        if (i2 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i3, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i4 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i4);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        o(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.draw(android.graphics.Canvas):void");
    }

    public final void f(float f2) {
        this.s.p = f2;
    }

    public final void g(k kVar) {
        this.f6526l = new WeakReference(kVar);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.s;
        if (cVar.f6528a == null) {
            return null;
        }
        cVar.f6529b = getChangingConfigurations();
        return this.s;
    }

    public final void h(o oVar) {
        this.s.t = oVar;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.s.f6530c;
        } catch (NoSuchMethodError unused) {
            return this.s.f6530c;
        }
    }

    public final void i(int[] iArr) {
        this.s.x = iArr;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, e.f6540a, 0, 0) : resources.obtainAttributes(attributeSet, e.f6540a);
        this.s.f6531d = u(typedArrayObtainStyledAttributes, 0);
        if (this.s.f6531d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            c cVar = this.s;
            cVar.f6530c = typedArrayObtainStyledAttributes.getBoolean(0, cVar.f6530c);
            this.s.f6532e = true;
        }
        this.s.f6534g = u(typedArrayObtainStyledAttributes, 5);
        if (this.s.f6534g == Integer.MIN_VALUE) {
            this.s.f6533f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.s.f6536i = u(typedArrayObtainStyledAttributes, 1);
        if (this.s.f6536i == Integer.MIN_VALUE) {
            this.s.f6535h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.s.f6538k = u(typedArrayObtainStyledAttributes, 6);
        if (this.s.f6538k == Integer.MIN_VALUE) {
            this.s.f6537j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.s.m = u(typedArrayObtainStyledAttributes, 3);
        if (this.s.m == Integer.MIN_VALUE) {
            this.s.f6539l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.s.m = u(typedArrayObtainStyledAttributes, 3);
        if (this.s.m == Integer.MIN_VALUE) {
            this.s.f6539l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.s.o = u(typedArrayObtainStyledAttributes, 7);
        if (this.s.o == Integer.MIN_VALUE) {
            this.s.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.s.q = u(typedArrayObtainStyledAttributes, 4);
        if (this.s.q == Integer.MIN_VALUE) {
            this.s.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.s.s = u(typedArrayObtainStyledAttributes, 2);
        if (this.s.s == Integer.MIN_VALUE) {
            this.s.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.s.v = u(typedArrayObtainStyledAttributes, 8);
        this.s.u = s(typedArrayObtainStyledAttributes, 8);
        this.s.y = s(typedArrayObtainStyledAttributes, 9);
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
            this.s.f6528a = drawableCreateFromXmlInner.getConstantState();
        } else {
            Drawable drawable = f6515a;
            setDrawable(drawable);
            this.s.f6528a = drawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.s.f6530c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.n = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.r && super.mutate() == this) {
            this.s = new c(this.s);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.s.f6528a = drawable.getConstantState();
            }
            this.r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        super.onBoundsChange(rect);
        if (this.s.f6530c) {
            if (this.s.t != null) {
                q(this.s.t);
                return;
            }
            Drawable drawable = getDrawable();
            r rVarI = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    p pVar = new p();
                    pVar.s(outline.getRadius());
                    rVarI = pVar.i();
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    p pVar2 = new p();
                    pVar2.o(Math.min(cornerRadii[0], cornerRadii[1]));
                    pVar2.q(Math.min(cornerRadii[2], cornerRadii[3]));
                    pVar2.m(Math.min(cornerRadii[4], cornerRadii[5]));
                    pVar2.k(Math.min(cornerRadii[6], cornerRadii[7]));
                    rVarI = pVar2.i();
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        p pVar3 = new p();
                        pVar3.s(cornerRadius);
                        rVarI = pVar3.i();
                    }
                }
            }
            if (rVarI != null) {
                q(rVarI);
            } else {
                this.m = -1.0f;
                this.f6523i.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (!this.s.f6530c) {
            this.q = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(this.s.x, iArr);
        boolean z = this.q != zStateSetMatches;
        this.q = zStateSetMatches;
        if (z && iArr.length > 0 && !this.p) {
            ObjectAnimator objectAnimator = this.n;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.n = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6518d, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f6517c);
                objectAnimatorOfFloat.addListener(new b(this));
                this.n = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.o = 1.0f;
            }
        }
        this.p = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.f6519e = new Paint(1);
        this.f6520f = new RectF();
        this.f6521g = new Rect();
        this.f6522h = new Path();
        this.f6523i = new Path();
        this.f6524j = new Matrix();
        this.f6525k = u.a();
        this.m = -1.0f;
        this.o = 1.0f;
        this.q = false;
        this.r = false;
        this.s = new c(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f6519e = new Paint(1);
        this.f6520f = new RectF();
        this.f6521g = new Rect();
        this.f6522h = new Path();
        this.f6523i = new Path();
        this.f6524j = new Matrix();
        this.f6525k = u.a();
        this.m = -1.0f;
        this.o = 1.0f;
        this.q = false;
        this.r = false;
        c cVar = new c(null);
        this.s = cVar;
        if (drawable != null) {
            cVar.f6528a = drawable.getConstantState();
        }
        o(context.getTheme());
    }

    /* synthetic */ FocusRingDrawable(c cVar, Resources resources, d dVar) {
        this(cVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
