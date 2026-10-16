package defpackage;

import android.view.animation.Animation;
import com.google.android.gearhead.appdecor.DrawerContentLayout;

/* loaded from: classes2.dex */
public final class qfw extends oln {
    final /* synthetic */ DrawerContentLayout a;

    public qfw(DrawerContentLayout drawerContentLayout) {
        this.a = drawerContentLayout;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.d.setVisibility(8);
    }
}
