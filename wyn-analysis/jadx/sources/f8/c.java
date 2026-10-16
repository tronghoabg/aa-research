package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f35124b;

    public /* synthetic */ c(d dVar, int i5) {
        this.f35123a = i5;
        this.f35124b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f35123a) {
            case 1:
                this.f35124b.f35177b.g(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f35123a) {
            case 0:
                this.f35124b.f35177b.g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
