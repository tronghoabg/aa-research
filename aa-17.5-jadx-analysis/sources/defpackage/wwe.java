package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public final class wwe implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;

    public wwe(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.d = i;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
        this.b = baseBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d != 0) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((wkz) this.b).M((CoordinatorLayout) this.a, this.c, iIntValue, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Object obj = this.b;
        ((wwf) this.c).c(this.a, (View) obj, animatedFraction);
    }

    public wwe(wwf wwfVar, View view, View view2, int i) {
        this.d = i;
        this.a = view;
        this.b = view2;
        this.c = wwfVar;
    }
}
