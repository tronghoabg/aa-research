package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ont extends defpackage.omg {
    final /* synthetic */ com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView a;

    public ont(com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView speedbumpView) {
        this.a = speedbumpView;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        if (com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView.b()) {
            com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView speedbumpView = this.a;
            android.view.ViewGroup viewGroup = speedbumpView.f;
            if (viewGroup != null) {
                viewGroup.setDescendantFocusability(speedbumpView.g);
            }
            speedbumpView.a.setFocusable(false);
        }
        this.a.a.setVisibility(8);
    }
}
