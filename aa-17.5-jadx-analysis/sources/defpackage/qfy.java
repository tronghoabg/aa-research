package defpackage;

import android.view.animation.Animation;
import com.google.android.gearhead.appdecor.DrawerContentLayout;

/* loaded from: classes2.dex */
public final class qfy extends oln {
    final /* synthetic */ DrawerContentLayout a;

    public qfy(DrawerContentLayout drawerContentLayout) {
        this.a = drawerContentLayout;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        DrawerContentLayout drawerContentLayout = this.a;
        drawerContentLayout.i.setVisibility(8);
        drawerContentLayout.h();
    }
}
