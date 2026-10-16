package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kdb implements defpackage.kct {
    public final com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView a;
    private final defpackage.gfa b;

    public kdb(com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView responsiveTravelEstimateView, defpackage.gfa gfaVar) {
        this.a = responsiveTravelEstimateView;
        this.b = gfaVar;
    }

    @Override // defpackage.kct
    public final android.view.View a() {
        return this.a;
    }

    @Override // defpackage.kct
    public final com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView b() {
        return this.a;
    }

    @Override // defpackage.kct
    public final void c(java.lang.Runnable runnable) {
        com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView responsiveTravelEstimateView = this.a;
        if (responsiveTravelEstimateView.getVisibility() == 8) {
            return;
        }
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.b, com.google.android.projection.gearhead.R.anim.travel_estimate_card_hide_animation);
        animationLoadAnimation.setAnimationListener(new defpackage.kcz(this, runnable));
        responsiveTravelEstimateView.setAnimation(animationLoadAnimation);
    }

    @Override // defpackage.kct
    public final void d(java.lang.Runnable runnable) {
        com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView responsiveTravelEstimateView = this.a;
        if (responsiveTravelEstimateView.getVisibility() == 0) {
            return;
        }
        responsiveTravelEstimateView.setVisibility(0);
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.b, com.google.android.projection.gearhead.R.anim.travel_estimate_card_show_animation);
        animationLoadAnimation.setAnimationListener(new defpackage.kda(runnable));
        responsiveTravelEstimateView.setAnimation(animationLoadAnimation);
    }
}
