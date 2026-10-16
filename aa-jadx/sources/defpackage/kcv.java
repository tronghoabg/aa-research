package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcv implements defpackage.kct {
    public final android.view.View a;
    private final android.view.View b;
    private final defpackage.gfa c;
    private final java.util.List d;
    private final defpackage.kdb e;

    public kcv(android.view.View view, defpackage.gfa gfaVar, java.util.List list) {
        java.lang.Object next;
        view.getClass();
        this.b = view;
        this.c = gfaVar;
        this.d = list;
        this.a = view.findViewById(com.google.android.projection.gearhead.R.id.minimized_bottom_bar);
        defpackage.jxf jxfVar = new defpackage.jxf(11);
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((java.lang.Boolean) jxfVar.invoke(next)).booleanValue());
        androidx.car.app.model.Action action = (androidx.car.app.model.Action) next;
        if (action != null) {
            defpackage.tc tcVar = new defpackage.tc();
            tcVar.b(action);
            androidx.car.app.model.ActionStrip actionStripA = tcVar.a();
            android.view.View viewFindViewById = this.b.findViewById(com.google.android.projection.gearhead.R.id.minimized_primary_action);
            viewFindViewById.getClass();
            com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView actionStripView = (com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView) viewFindViewById;
            actionStripView.setVisibility(0);
            actionStripView.b(this.c, actionStripA, defpackage.gia.b, false, false);
        }
        com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView responsiveTravelEstimateView = (com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView) this.b.findViewById(com.google.android.projection.gearhead.R.id.responsive_travel_estimate_view_for_primary_actions_experiment_launch);
        responsiveTravelEstimateView.setVisibility(0);
        responsiveTravelEstimateView.getClass();
        this.e = new defpackage.kdb(responsiveTravelEstimateView, this.c);
    }

    private final void e(int i, java.lang.Runnable runnable) {
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.c, i);
        animationLoadAnimation.setAnimationListener(new defpackage.kcu(this, runnable));
        this.a.setAnimation(animationLoadAnimation);
    }

    @Override // defpackage.kct
    public final android.view.View a() {
        android.view.View view = this.a;
        view.getClass();
        return view;
    }

    @Override // defpackage.kct
    public final com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView b() {
        return this.e.a;
    }

    @Override // defpackage.kct
    public final void c(java.lang.Runnable runnable) {
        if (this.a.getVisibility() == 8) {
            return;
        }
        e(com.google.android.projection.gearhead.R.anim.bottom_bar_hide_animation, new defpackage.jlb(this, runnable, 19, (byte[]) null));
    }

    @Override // defpackage.kct
    public final void d(java.lang.Runnable runnable) {
        if (this.a.getVisibility() == 0) {
            return;
        }
        e(com.google.android.projection.gearhead.R.anim.bottom_bar_show_animation, runnable);
    }
}
