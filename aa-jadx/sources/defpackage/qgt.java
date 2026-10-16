package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgt extends defpackage.omg {
    final /* synthetic */ com.google.android.gearhead.appdecor.DrawerContentLayout a;

    public qgt(com.google.android.gearhead.appdecor.DrawerContentLayout drawerContentLayout) {
        this.a = drawerContentLayout;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.google.android.gearhead.appdecor.DrawerContentLayout drawerContentLayout = this.a;
        drawerContentLayout.i.setVisibility(8);
        drawerContentLayout.h();
    }
}
