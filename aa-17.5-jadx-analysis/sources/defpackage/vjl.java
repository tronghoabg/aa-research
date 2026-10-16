package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
final class vjl extends vjo {
    final /* synthetic */ vjm a;

    public vjl(vjm vjmVar) {
        this.a = vjmVar;
    }

    @Override // defpackage.vjo
    public final void a(long j) {
        vjm vjmVar = this.a;
        vjmVar.d++;
        Animator animator = vjmVar.a;
        if (vjmVar.a(animator) || animator.isStarted()) {
            return;
        }
        if (vjmVar.c != -1 && vjmVar.d >= 0) {
            return;
        }
        Runnable runnable = vjmVar.b;
        if (runnable != null) {
            runnable.run();
        }
        animator.start();
    }
}
