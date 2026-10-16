package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes2.dex */
final class kcg extends oln {
    final /* synthetic */ kch a;

    public kcg(kch kchVar) {
        this.a = kchVar;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.a.b;
        viewGroup.clearAnimation();
        viewGroup.setVisibility(8);
    }
}
