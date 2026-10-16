package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wmo {
    public static final Drawable a;
    private static final double w = Math.cos(Math.toRadians(45.0d));
    private final int A;
    public final MaterialCardView b;
    public final wue d;
    public final wue e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Drawable k;
    public Drawable l;
    public ColorStateList m;
    public ColorStateList n;
    public wui o;
    public ColorStateList p;
    public Drawable q;
    public LayerDrawable r;
    public wue s;
    public boolean u;
    private ValueAnimator x;
    private final TimeInterpolator y;
    private final int z;
    public final Rect c = new Rect();
    public boolean t = false;
    public float v = BitmapDescriptorFactory.HUE_RED;

    static {
        a = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public wmo(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.f = -1.0f;
        this.b = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ym.a, i, R.style.CardView);
        wue wueVar = new wue(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.d = wueVar;
        wueVar.K(materialCardView.getContext());
        wueVar.Y();
        wuj wujVar = new wuj(wueVar.fD());
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
            this.f = dimension;
            wujVar.e(dimension);
        }
        this.e = new wue();
        g(new wuk(wujVar));
        this.y = woy.C(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, wkn.a);
        this.z = woy.u(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.A = woy.u(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float p() {
        wuk[] wukVarArrF = this.o.f();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (wuk wukVar : wukVarArrF) {
            if (wukVar != null) {
                wue wueVar = this.d;
                float fMax2 = Math.max(r(wukVar.j, wueVar.x()), r(wukVar.k, wueVar.y()));
                float[] fArr = wueVar.z;
                float fA = fArr != null ? fArr[1] : wueVar.p.a.a().d.a(wueVar.F());
                wub wubVar = wukVar.l;
                wub wubVar2 = wukVar.m;
                float fR = r(wubVar, fA);
                float[] fArr2 = wueVar.z;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fR, r(wubVar2, fArr2 != null ? fArr2[2] : wueVar.p.a.a().e.a(wueVar.F())))));
            }
        }
        return fMax;
    }

    private final boolean q() {
        return this.d.X();
    }

    private static final float r(wub wubVar, float f) {
        return wubVar instanceof wuh ? (float) ((1.0d - w) * f) : wubVar instanceof wua ? f / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    public final float a() {
        return this.b.fC() + (n() ? p() : BitmapDescriptorFactory.HUE_RED);
    }

    public final float b() {
        return (this.b.fC() * 1.5f) + (n() ? p() : BitmapDescriptorFactory.HUE_RED);
    }

    public final Drawable c() {
        if (this.q == null) {
            this.s = new wue(this.o);
            this.q = new RippleDrawable(this.m, null, this.s);
        }
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.q, this.e, this.l});
        FocusRingDrawable.c(this.b.getContext(), layerDrawable2, this.s);
        layerDrawable2.setId(2, R.id.mtrl_card_checked_layer_id);
        this.r = layerDrawable2;
        return layerDrawable2;
    }

    public final Drawable d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.b.a) {
            int iCeil2 = (int) Math.ceil(b());
            iCeil = (int) Math.ceil(a());
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new wmn(drawable, iCeil, i, iCeil, i);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.O(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        Drawable drawable = this.l;
        if (drawable != null) {
            float f = true != z ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.v = f;
                return;
            }
            float f2 = this.v;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, f);
            this.x = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new nt(this, 11, null));
            this.x.setInterpolator(this.y);
            this.x.setDuration((long) ((z ? this.z : this.A) * f2));
            this.x.start();
        }
    }

    public final void g(wui wuiVar) {
        this.o = wuiVar;
        wue wueVar = this.d;
        wueVar.R(wuiVar);
        this.e.R(wuiVar);
        wue wueVar2 = this.s;
        if (wueVar2 != null) {
            wueVar2.R(wuiVar);
        }
        wueVar.x = !wueVar.X();
    }

    public final void h() {
        Drawable drawable = this.k;
        Drawable drawableC = o() ? c() : this.e;
        this.k = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.b;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void i() {
        boolean zM = m();
        float fAg = BitmapDescriptorFactory.HUE_RED;
        float fP = (zM || n()) ? p() : 0.0f;
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            fAg = (float) ((1.0d - w) * ca.ag(materialCardView.e));
        }
        Rect rect = this.c;
        int i = (int) (fP - fAg);
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        ca.ah(materialCardView.e);
    }

    public final void j() {
        this.e.T(this.j, this.p);
    }

    public final boolean k() {
        return (this.i & 80) == 80;
    }

    public final boolean l() {
        return (this.i & 8388613) == 8388613;
    }

    public final boolean m() {
        return this.b.b && !q();
    }

    public final boolean n() {
        MaterialCardView materialCardView = this.b;
        return materialCardView.b && q() && materialCardView.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    public final boolean o() {
        MaterialCardView materialCardView = this.b;
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
}
