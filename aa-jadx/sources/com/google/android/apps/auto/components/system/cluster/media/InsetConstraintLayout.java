package com.google.android.apps.auto.components.system.cluster.media;

/* JADX INFO: loaded from: classes2.dex */
public class InsetConstraintLayout extends android.support.constraint.ConstraintLayout {
    public InsetConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void c(defpackage.h hVar, int i, int i2, boolean z, int i3) {
        defpackage.g gVarA = hVar.a(i);
        gVarA.a = true;
        gVarA.z = i3;
        if (z) {
            hVar.a(i).e = i2;
            hVar.a(i).f = -1;
            hVar.a(i).g = -1.0f;
        } else {
            hVar.a(i).f = i2;
            hVar.a(i).e = -1;
            hVar.a(i).g = -1.0f;
        }
    }

    private final void d(int i, int i2, int i3, int i4) {
        defpackage.h hVar = new defpackage.h();
        hVar.e(this);
        c(hVar, com.google.android.projection.gearhead.R.id.insetConstraint_systemWindow_left, i, getLayoutDirection() == 0, 1);
        c(hVar, com.google.android.projection.gearhead.R.id.insetConstraint_systemWindow_top, i2, true, 0);
        c(hVar, com.google.android.projection.gearhead.R.id.insetConstraint_systemWindow_right, i3, getLayoutDirection() != 0, 1);
        c(hVar, com.google.android.projection.gearhead.R.id.insetConstraint_systemWindow_bottom, i4, false, 0);
        hVar.b(this);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        d(0, 0, 0, 0);
        super.onFinishInflate();
    }

    public InsetConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
