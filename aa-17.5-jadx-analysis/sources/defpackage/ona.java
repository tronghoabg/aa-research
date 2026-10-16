package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView;

/* loaded from: classes2.dex */
public final class ona extends oln {
    final /* synthetic */ SpeedbumpView a;

    public ona(SpeedbumpView speedbumpView) {
        this.a = speedbumpView;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (SpeedbumpView.b()) {
            SpeedbumpView speedbumpView = this.a;
            ViewGroup viewGroup = speedbumpView.f;
            if (viewGroup != null) {
                viewGroup.setDescendantFocusability(speedbumpView.g);
            }
            speedbumpView.a.setFocusable(false);
        }
        this.a.a.setVisibility(8);
    }
}
