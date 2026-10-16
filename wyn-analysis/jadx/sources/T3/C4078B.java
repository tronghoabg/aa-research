package t3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.moloco.sdk.internal.publisher.H;

/* renamed from: t3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4078B extends AnimatorListenerAdapter implements InterfaceC4095o {

    /* renamed from: a, reason: collision with root package name */
    public final View f45649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45650b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f45651c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45653e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45654f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45652d = true;

    public C4078B(View view, int i5) {
        this.f45649a = view;
        this.f45650b = i5;
        this.f45651c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // t3.InterfaceC4095o
    public final void a() {
        f(false);
    }

    @Override // t3.InterfaceC4095o
    public final void c() {
        f(true);
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f45654f) {
            AbstractC4104x.f45735a.K(this.f45650b, this.f45649a);
            ViewGroup viewGroup = this.f45651c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        abstractC4096p.w(this);
    }

    public final void f(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f45652d || this.f45653e == z2 || (viewGroup = this.f45651c) == null) {
            return;
        }
        this.f45653e = z2;
        H.t0(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f45654f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f45654f) {
            AbstractC4104x.f45735a.K(this.f45650b, this.f45649a);
            ViewGroup viewGroup = this.f45651c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f45654f) {
            return;
        }
        AbstractC4104x.f45735a.K(this.f45650b, this.f45649a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f45654f) {
            return;
        }
        AbstractC4104x.f45735a.K(0, this.f45649a);
    }

    @Override // t3.InterfaceC4095o
    public final void b() {
    }

    @Override // t3.InterfaceC4095o
    public final void e(AbstractC4096p abstractC4096p) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
