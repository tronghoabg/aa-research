package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.R;
import androidx.core.view.GravityCompat;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.t;
import com.google.android.material.k.ae;
import com.google.android.material.k.e;
import com.google.android.material.k.f;
import com.google.android.material.k.k;
import com.google.android.material.k.n;
import com.google.android.material.k.o;
import com.google.android.material.k.p;
import com.google.android.material.k.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final double f6343a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    private final MaterialCardView f6344b;

    /* renamed from: d, reason: collision with root package name */
    private final k f6346d;

    /* renamed from: e, reason: collision with root package name */
    private final k f6347e;

    /* renamed from: f, reason: collision with root package name */
    private float f6348f;

    /* renamed from: g, reason: collision with root package name */
    private int f6349g;

    /* renamed from: h, reason: collision with root package name */
    private int f6350h;

    /* renamed from: i, reason: collision with root package name */
    private int f6351i;

    /* renamed from: j, reason: collision with root package name */
    private int f6352j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f6353k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f6354l;
    private ColorStateList m;
    private ColorStateList n;
    private o o;
    private ColorStateList p;
    private Drawable q;
    private LayerDrawable r;
    private k s;
    private boolean u;
    private ValueAnimator v;
    private final TimeInterpolator w;
    private final int x;
    private final int y;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f6345c = new Rect();
    private boolean t = false;
    private float z = 0.0f;

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i2) {
        this.f6348f = -1.0f;
        this.f6344b = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i2, com.waze.R.style.CardView);
        k kVar = new k(materialCardView.getContext(), attributeSet, i2, com.waze.R.style.Widget_MaterialComponents_CardView);
        this.f6346d = kVar;
        kVar.r(materialCardView.getContext());
        kVar.L();
        p pVar = new p(kVar.o());
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.f6348f = dimension;
            pVar.s(dimension);
        }
        this.f6347e = new k();
        m(pVar.i());
        this.w = f.d(materialCardView.getContext(), com.waze.R.attr.motionEasingLinearInterpolator, com.google.android.material.a.a.f6173a);
        this.x = t.e(materialCardView.getContext(), com.waze.R.attr.motionDurationShort2, 300);
        this.y = t.e(materialCardView.getContext(), com.waze.R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final boolean A() {
        return this.f6346d.E();
    }

    private final boolean B() {
        return (this.f6351i & 80) == 80;
    }

    private final boolean C() {
        return (this.f6351i & GravityCompat.END) == 8388613;
    }

    private final boolean D() {
        return this.f6344b.getPreventCornerOverlap() && !A();
    }

    private final boolean E() {
        MaterialCardView materialCardView = this.f6344b;
        return materialCardView.getPreventCornerOverlap() && A() && materialCardView.getUseCompatPadding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    private final boolean F() {
        MaterialCardView materialCardView = this.f6344b;
        boolean zIsClickable = materialCardView.isClickable();
        MaterialCardView materialCardView2 = materialCardView;
        if (zIsClickable) {
            return true;
        }
        while (materialCardView2.isDuplicateParentStateEnabled() && (materialCardView2.getParent() instanceof View)) {
            materialCardView2 = (View) materialCardView2.getParent();
        }
        return materialCardView2.isClickable();
    }

    private static final float G(f fVar, float f2) {
        if (fVar instanceof n) {
            return (float) ((1.0d - f6343a) * f2);
        }
        if (fVar instanceof e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public static /* synthetic */ void f(c cVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.f6354l.setAlpha((int) (255.0f * fFloatValue));
        cVar.z = fFloatValue;
    }

    private final float v() {
        float fMax = 0.0f;
        for (r rVar : this.o.e()) {
            if (rVar != null) {
                k kVar = this.f6346d;
                fMax = Math.max(fMax, Math.max(Math.max(G(rVar.r(), kVar.h()), G(rVar.s(), kVar.i())), Math.max(G(rVar.q(), kVar.d()), G(rVar.p(), kVar.c()))));
            }
        }
        return fMax;
    }

    private final float w() {
        return this.f6344b.getMaxCardElevation() + (E() ? v() : 0.0f);
    }

    private final float x() {
        return (this.f6344b.getMaxCardElevation() * 1.5f) + (E() ? v() : 0.0f);
    }

    private final Drawable y() {
        if (this.q == null) {
            this.s = new k(this.o);
            this.q = new RippleDrawable(this.m, null, this.s);
        }
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.q, this.f6347e, this.f6354l});
        FocusRingDrawable.d(this.f6344b.getContext(), layerDrawable2, this.s);
        layerDrawable2.setId(2, com.waze.R.id.mtrl_card_checked_layer_id);
        this.r = layerDrawable2;
        return layerDrawable2;
    }

    private final Drawable z(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f6344b.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(x());
            iCeil = (int) Math.ceil(w());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new b(this, drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    final float a() {
        return this.f6346d.h();
    }

    final ColorStateList b() {
        return this.f6346d.l();
    }

    final Rect c() {
        return this.f6345c;
    }

    final k d() {
        return this.f6346d;
    }

    final o e() {
        return this.o;
    }

    final void g() {
        Drawable drawable = this.q;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            this.q.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            this.q.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
    }

    final void h(TypedArray typedArray) {
        o oVarF;
        MaterialCardView materialCardView = this.f6344b;
        Context context = materialCardView.getContext();
        int[] iArr = d.f6355a;
        ColorStateList colorStateListN = t.n(context, typedArray, 11);
        this.p = colorStateListN;
        if (colorStateListN == null) {
            this.p = ColorStateList.valueOf(-1);
        }
        this.f6352j = typedArray.getDimensionPixelSize(12, 0);
        boolean z = typedArray.getBoolean(0, false);
        this.u = z;
        materialCardView.setLongClickable(z);
        this.n = t.n(materialCardView.getContext(), typedArray, 6);
        Drawable drawableP = t.p(materialCardView.getContext(), typedArray, 2);
        if (drawableP != null) {
            Drawable drawableMutate = drawableP.mutate();
            this.f6354l = drawableMutate;
            drawableMutate.setTintList(this.n);
            k(materialCardView.isChecked(), false);
        } else {
            this.f6354l = null;
        }
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.waze.R.id.mtrl_card_checked_layer_id, this.f6354l);
        }
        this.f6350h = typedArray.getDimensionPixelSize(5, 0);
        this.f6349g = typedArray.getDimensionPixelSize(4, 0);
        this.f6351i = typedArray.getInteger(3, 8388661);
        ColorStateList colorStateListN2 = t.n(materialCardView.getContext(), typedArray, 7);
        this.m = colorStateListN2;
        if (colorStateListN2 == null) {
            this.m = ColorStateList.valueOf(com.google.android.material.focus.d.b(materialCardView, com.waze.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListN3 = t.n(materialCardView.getContext(), typedArray, 1);
        k kVar = this.f6347e;
        if (colorStateListN3 == null) {
            colorStateListN3 = ColorStateList.valueOf(0);
        }
        kVar.v(colorStateListN3);
        Drawable drawable = this.q;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.m);
        }
        q();
        kVar.A(this.f6352j, this.p);
        k kVar2 = this.f6346d;
        materialCardView.d(z(kVar2));
        Drawable drawableY = F() ? y() : kVar;
        this.f6353k = drawableY;
        materialCardView.setForeground(z(drawableY));
        if (this.f6348f != -1.0f || (oVarF = ae.f(materialCardView.getContext(), typedArray, 8)) == null) {
            return;
        }
        SpringForce springForceE = f.e(materialCardView.getContext());
        kVar2.t(springForceE);
        kVar.t(springForceE);
        k kVar3 = this.s;
        if (kVar3 != null) {
            kVar3.t(springForceE);
        }
        m(oVarF);
    }

    final void i(int i2, int i3) {
        int iCeil;
        int iCeil2;
        if (this.r != null) {
            MaterialCardView materialCardView = this.f6344b;
            if (materialCardView.getUseCompatPadding()) {
                float fX = x();
                iCeil = (int) Math.ceil(fX + fX);
                float fW = w();
                iCeil2 = (int) Math.ceil(fW + fW);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            boolean zC = C();
            int i4 = this.f6349g;
            if (zC) {
                i4 = ((i2 - i4) - this.f6350h) - iCeil2;
            }
            boolean zB = B();
            int i5 = this.f6349g;
            if (!zB) {
                i5 = ((i3 - i5) - this.f6350h) - iCeil;
            }
            int i6 = i5;
            boolean zC2 = C();
            int i7 = this.f6349g;
            if (!zC2) {
                i7 = ((i2 - i7) - this.f6350h) - iCeil2;
            }
            boolean zB2 = B();
            int i8 = this.f6349g;
            if (zB2) {
                i8 = ((i3 - i8) - this.f6350h) - iCeil;
            }
            int i9 = i8;
            int layoutDirection = materialCardView.getLayoutDirection();
            this.r.setLayerInset(2, layoutDirection != 1 ? i4 : i7, i9, layoutDirection == 1 ? i4 : i7, i6);
        }
    }

    final void j(ColorStateList colorStateList) {
        this.f6346d.v(colorStateList);
    }

    public final void k(boolean z, boolean z2) {
        Drawable drawable = this.f6354l;
        if (drawable != null) {
            float f2 = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.z = f2;
                return;
            }
            float f3 = this.z;
            if (z) {
                f3 = 1.0f - f3;
            }
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.z, f2);
            this.v = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    c.f(this.f6342a, valueAnimator2);
                }
            });
            this.v.setInterpolator(this.w);
            this.v.setDuration((long) ((z ? this.x : this.y) * f3));
            this.v.start();
        }
    }

    final void l(float f2) {
        this.f6348f = f2;
        m(this.o.a().c(f2));
        this.f6353k.invalidateSelf();
        if (E() || D()) {
            p();
        }
        if (E()) {
            r();
        }
    }

    final void m(o oVar) {
        this.o = oVar;
        k kVar = this.f6346d;
        kVar.y(oVar);
        this.f6347e.y(oVar);
        k kVar2 = this.s;
        if (kVar2 != null) {
            kVar2.y(oVar);
        }
        kVar.E();
    }

    final void n(int i2, int i3, int i4, int i5) {
        this.f6345c.set(i2, i3, i4, i5);
        p();
    }

    final void o() {
        Drawable drawable = this.f6353k;
        Drawable drawableY = F() ? y() : this.f6347e;
        this.f6353k = drawableY;
        if (drawable != drawableY) {
            MaterialCardView materialCardView = this.f6344b;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableY);
            } else {
                materialCardView.setForeground(z(drawableY));
            }
        }
    }

    final void p() {
        float radius = 0.0f;
        float fV = (D() || E()) ? v() : 0.0f;
        MaterialCardView materialCardView = this.f6344b;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            radius = (float) ((1.0d - f6343a) * super/*androidx.cardview.widget.CardView*/.getRadius());
        }
        Rect rect = this.f6345c;
        int i2 = (int) (fV - radius);
        materialCardView.c(rect.left + i2, rect.top + i2, rect.right + i2, rect.bottom + i2);
    }

    final void q() {
        this.f6346d.u(this.f6344b.getCardElevation());
    }

    final void r() {
        if (!this.t) {
            this.f6344b.d(z(this.f6346d));
        }
        this.f6344b.setForeground(z(this.f6353k));
    }

    final boolean s() {
        return this.t;
    }

    final boolean t() {
        return this.u;
    }

    final void u() {
        this.t = true;
    }
}
