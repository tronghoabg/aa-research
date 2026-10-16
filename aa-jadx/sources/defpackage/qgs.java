package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgs extends defpackage.omg {
    final /* synthetic */ com.google.android.gearhead.appdecor.DrawerContentLayout a;

    public qgs(com.google.android.gearhead.appdecor.DrawerContentLayout drawerContentLayout) {
        this.a = drawerContentLayout;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.a.g.setVisibility(8);
    }
}
