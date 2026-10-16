package com.google.android.material.c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v7.app.k;
import android.support.v7.app.l;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.focus.d;
import com.google.android.material.internal.n;
import com.google.android.material.internal.t;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f6333a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f6334b;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context) {
        TypedValue typedValueG = t.g(context, R.attr.materialAlertDialogTheme);
        int i2 = typedValueG == null ? 0 : typedValueG.data;
        Context contextA = com.google.android.material.theme.a.a.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(i2 != 0 ? new ContextThemeWrapper(contextA, i2) : contextA, R.style.WazeAlertDialogStyle);
        Context contextA2 = a();
        Resources.Theme theme = contextA2.getTheme();
        int[] iArr = c.f6335a;
        TypedArray typedArrayA = n.a(contextA2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayA.recycle();
        int layoutDirection = contextA2.getResources().getConfiguration().getLayoutDirection();
        this.f6334b = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iG = d.g(contextA2, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = contextA2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes.getColor(4, iG);
        typedArrayObtainStyledAttributes.recycle();
        com.google.android.material.k.k kVar = new com.google.android.material.k.k(contextA2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        kVar.r(contextA2);
        kVar.v(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            kVar.s(dimension);
        }
        this.f6333a = kVar;
    }

    public final void A(DialogInterface.OnClickListener onClickListener) {
        super.o(onClickListener);
    }

    public final void B(CharSequence charSequence) {
        super.s(charSequence);
    }

    public final void C(View view) {
        super.t(view);
    }

    public final void D(DialogInterface.OnClickListener onClickListener) {
        super.l("Cancel", onClickListener);
    }

    public final void E(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.p(charSequence, onClickListener);
    }

    @Override // android.support.v7.app.k
    public final l b() {
        l lVarB = super.b();
        Window window = lVarB.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f6333a;
        ((com.google.android.material.k.k) drawable).u(decorView.getElevation());
        Rect rect = this.f6334b;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(lVarB, rect));
        return lVarB;
    }

    @Override // android.support.v7.app.k
    public final /* bridge */ /* synthetic */ void j(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.j(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // android.support.v7.app.k
    public final /* bridge */ /* synthetic */ void p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        E(null, null);
    }

    @Override // android.support.v7.app.k
    public final /* bridge */ /* synthetic */ void r(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        super.r(charSequenceArr, i2, onClickListener);
    }

    public final void u() {
        super.d();
    }

    public final void v() {
        super.f();
    }

    public final void w(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequenceArr, onClickListener);
    }

    public final void x(CharSequence charSequence) {
        super.i(charSequence);
    }

    public final void y(DialogInterface.OnClickListener onClickListener) {
        super.k(onClickListener);
    }

    public final void z(DialogInterface.OnDismissListener onDismissListener) {
        super.m(onDismissListener);
    }
}
