package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class fhb extends AnimatorListenerAdapter implements ffz {
    final /* synthetic */ fhd a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public fhb(fhd fhdVar, ViewGroup viewGroup, View view, View view2) {
        this.a = fhdVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.ffz
    public final void a(fgc fgcVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.ffz
    public final void b(fgc fgcVar) {
        throw null;
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void c(fgc fgcVar) {
        fgcVar.P(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.c;
        if (view.getParent() == null) {
            ebm.i(this.b, view);
        } else {
            this.a.o();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.d;
            View view2 = this.c;
            view.setTag(R.id.save_overlay_view, view2);
            ebm.i(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // defpackage.ffz
    public final void d() {
    }

    @Override // defpackage.ffz
    public final void e() {
    }

    @Override // defpackage.ffz
    public final void f() {
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void g(fgc fgcVar) {
    }
}
