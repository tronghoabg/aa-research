package defpackage;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.auto.components.apphost.basewidgets.action.MaterialActionStripView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class kcn extends oln {
    final /* synthetic */ kcp a;

    public kcn(kcp kcpVar) {
        this.a = kcpVar;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) throws Resources.NotFoundException {
        kcp kcpVar = this.a;
        kcpVar.a.setVisibility(8);
        MaterialActionStripView materialActionStripView = kcpVar.b;
        if (materialActionStripView.getVisibility() != 0) {
            materialActionStripView.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(kcpVar.i, R.anim.action_strip_fade_in_animation);
            animationLoadAnimation.setAnimationListener(new kco(kcpVar));
            materialActionStripView.setAnimation(animationLoadAnimation);
        }
        kcpVar.fb();
    }
}
