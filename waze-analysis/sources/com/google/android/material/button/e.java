package com.google.android.material.button;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.k.ac;
import com.google.android.material.k.ae;
import com.google.android.material.k.k;
import com.google.android.material.k.o;
import com.google.firebase.messaging.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f6317a;

    /* renamed from: b, reason: collision with root package name */
    private o f6318b;

    /* renamed from: c, reason: collision with root package name */
    private SpringForce f6319c;

    /* renamed from: d, reason: collision with root package name */
    private int f6320d;

    /* renamed from: e, reason: collision with root package name */
    private int f6321e;

    /* renamed from: f, reason: collision with root package name */
    private int f6322f;

    /* renamed from: g, reason: collision with root package name */
    private int f6323g;

    /* renamed from: h, reason: collision with root package name */
    private int f6324h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f6325i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f6326j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f6327k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f6328l;
    private Drawable m;
    private boolean o;
    private RippleDrawable q;
    private int r;
    private l s;
    private boolean n = false;
    private boolean p = true;

    e(MaterialButton materialButton, o oVar) {
        this.f6317a = materialButton;
        this.f6318b = oVar;
    }

    private final k n(boolean z) {
        RippleDrawable rippleDrawable = this.q;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (k) ((LayerDrawable) ((InsetDrawable) this.q.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final void o() {
        k kVarC = c();
        if (kVarC != null) {
            kVarC.y(this.f6318b);
            SpringForce springForce = this.f6319c;
            if (springForce != null) {
                kVarC.t(springForce);
            }
        }
        k kVarN = n(true);
        if (kVarN != null) {
            kVarN.y(this.f6318b);
            SpringForce springForce2 = this.f6319c;
            if (springForce2 != null) {
                kVarN.t(springForce2);
            }
        }
        RippleDrawable rippleDrawable = this.q;
        ac acVar = null;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (objFindDrawableByLayerId instanceof ac) {
                acVar = (ac) objFindDrawableByLayerId;
            }
        }
        if (acVar != null) {
            if (!(acVar instanceof k)) {
                acVar.e(this.f6318b.a());
                return;
            }
            k kVar = (k) acVar;
            kVar.y(this.f6318b);
            SpringForce springForce3 = this.f6319c;
            if (springForce3 != null) {
                kVar.t(springForce3);
            }
        }
    }

    final ColorStateList a() {
        return this.f6326j;
    }

    final PorterDuff.Mode b() {
        return this.f6325i;
    }

    final k c() {
        return n(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void d(android.content.res.TypedArray r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.e.d(android.content.res.TypedArray):void");
    }

    final void e() {
        this.n = true;
        MaterialButton materialButton = this.f6317a;
        materialButton.setSupportBackgroundTintList(this.f6326j);
        materialButton.setSupportBackgroundTintMode(this.f6325i);
    }

    final void f(SpringForce springForce) {
        this.f6319c = springForce;
        if (this.f6318b instanceof ae) {
            o();
        }
    }

    final void g(o oVar) {
        this.f6318b = oVar;
        o();
    }

    final void h(ColorStateList colorStateList) {
        if (this.f6326j != colorStateList) {
            this.f6326j = colorStateList;
            if (c() != null) {
                c().setTintList(this.f6326j);
            }
        }
    }

    final void i(PorterDuff.Mode mode) {
        if (this.f6325i != mode) {
            this.f6325i = mode;
            if (c() == null || this.f6325i == null) {
                return;
            }
            c().setTintMode(this.f6325i);
        }
    }

    final boolean j() {
        return this.n;
    }

    final boolean k() {
        return this.o;
    }

    final boolean l() {
        return this.p;
    }

    final void m(l lVar) {
        this.s = lVar;
        k kVarC = c();
        if (kVarC != null) {
            kVarC.N(lVar);
        }
    }
}
