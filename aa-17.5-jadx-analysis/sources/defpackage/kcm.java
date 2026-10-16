package defpackage;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
final class kcm extends oln {
    final /* synthetic */ kcp a;

    public kcm(kcp kcpVar) {
        this.a = kcpVar;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.fb();
    }
}
