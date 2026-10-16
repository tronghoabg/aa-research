package defpackage;

import android.view.animation.Animation;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;

/* loaded from: classes2.dex */
public final class kcy extends oln {
    final /* synthetic */ Runnable a;
    final /* synthetic */ lks b;

    public kcy(lks lksVar, Runnable runnable) {
        this.b = lksVar;
        this.a = runnable;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ((BleedingCardView) this.b.d).setVisibility(8);
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
