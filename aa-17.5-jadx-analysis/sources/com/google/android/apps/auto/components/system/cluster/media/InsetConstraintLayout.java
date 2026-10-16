package com.google.android.apps.auto.components.system.cluster.media;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.WindowInsets;
import com.google.android.projection.gearhead.R;
import defpackage.g;
import defpackage.h;

/* loaded from: classes2.dex */
public class InsetConstraintLayout extends ConstraintLayout {
    public InsetConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void c(h hVar, int i, int i2, boolean z, int i3) {
        g gVarA = hVar.a(i);
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
        h hVar = new h();
        hVar.e(this);
        c(hVar, R.id.insetConstraint_systemWindow_left, i, getLayoutDirection() == 0, 1);
        c(hVar, R.id.insetConstraint_systemWindow_top, i2, true, 0);
        c(hVar, R.id.insetConstraint_systemWindow_right, i3, getLayoutDirection() != 0, 1);
        c(hVar, R.id.insetConstraint_systemWindow_bottom, i4, false, 0);
        hVar.b(this);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        d(0, 0, 0, 0);
        super.onFinishInflate();
    }

    public InsetConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
