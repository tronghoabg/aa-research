package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes2.dex */
public final class fct extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public fct(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int iAbs = swipeRefreshLayout.g - Math.abs(swipeRefreshLayout.f);
        swipeRefreshLayout.j((swipeRefreshLayout.e + ((int) ((iAbs - r0) * f))) - swipeRefreshLayout.d.getTop());
        swipeRefreshLayout.h.c(1.0f - f);
    }
}
