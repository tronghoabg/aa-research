package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kcx implements kcr {
    public final ResponsiveTravelEstimateView a;
    private final geu b;

    public kcx(ResponsiveTravelEstimateView responsiveTravelEstimateView, geu geuVar) {
        this.a = responsiveTravelEstimateView;
        this.b = geuVar;
    }

    @Override // defpackage.kcr
    public final View a() {
        return this.a;
    }

    @Override // defpackage.kcr
    public final ResponsiveTravelEstimateView b() {
        return this.a;
    }

    @Override // defpackage.kcr
    public final void c(Runnable runnable) throws Resources.NotFoundException {
        ResponsiveTravelEstimateView responsiveTravelEstimateView = this.a;
        if (responsiveTravelEstimateView.getVisibility() == 8) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.b, R.anim.travel_estimate_card_hide_animation);
        animationLoadAnimation.setAnimationListener(new kcv(this, runnable));
        responsiveTravelEstimateView.setAnimation(animationLoadAnimation);
    }

    @Override // defpackage.kcr
    public final void d(Runnable runnable) throws Resources.NotFoundException {
        ResponsiveTravelEstimateView responsiveTravelEstimateView = this.a;
        if (responsiveTravelEstimateView.getVisibility() == 0) {
            return;
        }
        responsiveTravelEstimateView.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.b, R.anim.travel_estimate_card_show_animation);
        animationLoadAnimation.setAnimationListener(new kcw(runnable));
        responsiveTravelEstimateView.setAnimation(animationLoadAnimation);
    }
}
