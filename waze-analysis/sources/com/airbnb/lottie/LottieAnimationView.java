package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.ej;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.google.android.libraries.phenotype.client.stable.au;
import com.waze.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1729a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final u f1730b = new c();

    /* renamed from: c, reason: collision with root package name */
    private final u f1731c;

    /* renamed from: d, reason: collision with root package name */
    private final u f1732d;

    /* renamed from: e, reason: collision with root package name */
    private int f1733e;

    /* renamed from: f, reason: collision with root package name */
    private final s f1734f;

    /* renamed from: g, reason: collision with root package name */
    private String f1735g;

    /* renamed from: h, reason: collision with root package name */
    private int f1736h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1737i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1738j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1739k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f1740l;
    private final Set m;
    private ab n;

    public LottieAnimationView(Context context) {
        super(context);
        this.f1731c = new g(this, 0);
        this.f1732d = new g(this, 1, null);
        this.f1733e = 0;
        this.f1734f = new s();
        this.f1737i = false;
        this.f1738j = false;
        this.f1739k = true;
        this.f1740l = new HashSet();
        this.m = new HashSet();
        u(null, R.attr.lottieAnimationViewStyle);
    }

    public static /* synthetic */ y c(LottieAnimationView lottieAnimationView, int i2) {
        boolean z = lottieAnimationView.f1739k;
        Context context = lottieAnimationView.getContext();
        return z ? m.d(context, i2) : m.e(context, i2, null);
    }

    public static /* synthetic */ y d(LottieAnimationView lottieAnimationView, String str) {
        boolean z = lottieAnimationView.f1739k;
        Context context = lottieAnimationView.getContext();
        return z ? m.a(context, str, "asset_".concat(String.valueOf(str))) : m.a(context, str, null);
    }

    private final void t() {
        ab abVar = this.n;
        if (abVar != null) {
            abVar.g(this.f1731c);
            this.n.f(this.f1732d);
        }
    }

    private final void u(AttributeSet attributeSet, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, af.f1937a, i2, 0);
        this.f1739k = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                k(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                l(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            v(this.f1739k ? m.j(getContext(), string, "url_".concat(string)) : m.j(getContext(), string, null));
        }
        this.f1733e = typedArrayObtainStyledAttributes.getResourceId(8, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f1738j = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            this.f1734f.I(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            p(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            o(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f1734f.K(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.f1734f.B(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1734f.A(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f1734f.C(typedArrayObtainStyledAttributes.getString(6));
        }
        n(typedArrayObtainStyledAttributes.getString(11));
        w(typedArrayObtainStyledAttributes.getFloat(13, 0.0f), typedArrayObtainStyledAttributes.hasValue(13));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, false);
        s sVar = this.f1734f;
        sVar.t(z);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            sVar.p(new com.airbnb.lottie.d.e("**"), x.K, new com.airbnb.lottie.h.c(new ah(ContextCompat.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            ag agVar = ag.f1938a;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(15, agVar.ordinal());
            if (iOrdinal >= ag.values().length) {
                iOrdinal = agVar.ordinal();
            }
            sVar.H(ag.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            a aVar = a.f1741a;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(0, aVar.ordinal());
            if (iOrdinal2 >= ag.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            sVar.z(a.values()[iOrdinal2]);
        }
        sVar.E(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            sVar.M(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        sVar.L(Boolean.valueOf(com.airbnb.lottie.g.k.b(getContext()) != 0.0f));
    }

    private final void v(ab abVar) {
        s sVar;
        y yVarA = abVar.a();
        if (yVarA != null && (sVar = this.f1734f) == getDrawable() && sVar.i() == yVarA.a()) {
            return;
        }
        this.f1740l.add(f.f2302a);
        this.f1734f.r();
        t();
        abVar.e(this.f1731c);
        abVar.d(this.f1732d);
        this.n = abVar;
    }

    private final void w(float f2, boolean z) {
        if (z) {
            this.f1740l.add(f.f2303b);
        }
        this.f1734f.G(f2);
    }

    public final void e(Animator.AnimatorListener animatorListener) {
        this.f1734f.n(animatorListener);
    }

    public final void f(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1734f.o(animatorUpdateListener);
    }

    public final void g() {
        this.f1738j = false;
        this.f1740l.add(f.f2307f);
        this.f1734f.q();
    }

    public final void h() {
        this.f1740l.add(f.f2307f);
        this.f1734f.v();
    }

    public final void i() {
        this.f1734f.w();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof s) && ((s) drawable).k() == ag.f1940c) {
            this.f1734f.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        s sVar = this.f1734f;
        if (drawable2 == sVar) {
            super.invalidateDrawable(sVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        this.f1734f.x();
    }

    public final void k(int i2) {
        this.f1736h = i2;
        this.f1735g = null;
        v(isInEditMode() ? new ab(new e.a.b.a.b(this, i2, 1), true) : this.f1739k ? m.h(getContext(), i2) : m.i(getContext(), i2, null));
    }

    public final void l(String str) {
        this.f1735g = str;
        this.f1736h = 0;
        v(isInEditMode() ? new ab(new au(this, str, 1), true) : this.f1739k ? m.g(getContext(), str, "asset_".concat(String.valueOf(str))) : m.g(getContext(), str, null));
    }

    public final void m(h hVar) {
        s sVar = this.f1734f;
        sVar.setCallback(this);
        this.f1737i = true;
        boolean zS = sVar.S(hVar);
        if (this.f1738j) {
            sVar.v();
        }
        this.f1737i = false;
        if (getDrawable() == sVar) {
            if (!zS) {
                return;
            }
        } else if (!zS) {
            boolean zQ = q();
            setImageDrawable(null);
            setImageDrawable(sVar);
            if (zQ) {
                sVar.y();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a();
        }
    }

    public final void n(String str) {
        this.f1734f.F(str);
    }

    public final void o(int i2) {
        this.f1740l.add(f.f2305d);
        this.f1734f.I(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f1738j) {
            return;
        }
        this.f1734f.v();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f1735g = eVar.f2287a;
        Set set = this.f1740l;
        f fVar = f.f2302a;
        if (!set.contains(fVar) && !TextUtils.isEmpty(this.f1735g)) {
            l(this.f1735g);
        }
        this.f1736h = eVar.f2288b;
        if (!set.contains(fVar) && (i2 = this.f1736h) != 0) {
            k(i2);
        }
        if (!set.contains(f.f2303b)) {
            w(eVar.f2289c, false);
        }
        if (!set.contains(f.f2307f) && eVar.f2290d) {
            h();
        }
        if (!set.contains(f.f2306e)) {
            n(eVar.f2291e);
        }
        if (!set.contains(f.f2304c)) {
            p(eVar.f2292f);
        }
        if (set.contains(f.f2305d)) {
            return;
        }
        o(eVar.f2293g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f2287a = this.f1735g;
        eVar.f2288b = this.f1736h;
        s sVar = this.f1734f;
        eVar.f2289c = sVar.c();
        eVar.f2290d = sVar.R();
        eVar.f2291e = sVar.l();
        eVar.f2292f = sVar.f();
        eVar.f2293g = sVar.e();
        return eVar;
    }

    public final void p(int i2) {
        this.f1740l.add(f.f2304c);
        this.f1734f.J(i2);
    }

    public final boolean q() {
        return this.f1734f.Q();
    }

    public final void r(com.bumptech.glide.load.a.b.o oVar) {
        this.f1734f.f2487b = oVar;
    }

    public final void s(ej ejVar) {
        this.f1734f.W(ejVar);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        this.f1736h = 0;
        this.f1735g = null;
        t();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        this.f1736h = 0;
        this.f1735g = null;
        t();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i2) {
        this.f1736h = 0;
        this.f1735g = null;
        t();
        super.setImageResource(i2);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        s sVar;
        if (!this.f1737i && drawable == (sVar = this.f1734f) && sVar.Q()) {
            this.f1738j = false;
            sVar.u();
        } else if (!this.f1737i && (drawable instanceof s)) {
            s sVar2 = (s) drawable;
            if (sVar2.Q()) {
                sVar2.u();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1731c = new g(this, 0);
        this.f1732d = new g(this, 1, null);
        this.f1733e = 0;
        this.f1734f = new s();
        this.f1737i = false;
        this.f1738j = false;
        this.f1739k = true;
        this.f1740l = new HashSet();
        this.m = new HashSet();
        u(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1731c = new g(this, 0);
        this.f1732d = new g(this, 1, null);
        this.f1733e = 0;
        this.f1734f = new s();
        this.f1737i = false;
        this.f1738j = false;
        this.f1739k = true;
        this.f1740l = new HashSet();
        this.m = new HashSet();
        u(attributeSet, i2);
    }
}
