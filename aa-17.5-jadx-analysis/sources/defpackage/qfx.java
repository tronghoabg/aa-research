package defpackage;

import android.view.animation.Animation;
import com.google.android.gearhead.appdecor.DrawerContentLayout;

/* loaded from: classes2.dex */
public final class qfx extends oln {
    final /* synthetic */ DrawerContentLayout a;

    public qfx(DrawerContentLayout drawerContentLayout) {
        this.a = drawerContentLayout;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.g.setVisibility(8);
    }
}
