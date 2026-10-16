package defpackage;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class kcv extends oln {
    final /* synthetic */ kcx a;
    final /* synthetic */ Runnable b;

    public kcv(kcx kcxVar, Runnable runnable) {
        this.a = kcxVar;
        this.b = runnable;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.a.setVisibility(8);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
