package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class fen extends AnimatorListenerAdapter implements ffz {
    private final View a;
    private boolean b = false;

    public fen(View view) {
        this.a = view;
    }

    @Override // defpackage.ffz
    public final void d() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? fgu.a(view) : BitmapDescriptorFactory.HUE_RED));
    }

    @Override // defpackage.ffz
    public final void e() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        fgu.d(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        fgu.d(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.ffz
    public final void f() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.ffz
    public final void a(fgc fgcVar) {
    }

    @Override // defpackage.ffz
    public final void b(fgc fgcVar) {
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void c(fgc fgcVar) {
    }

    @Override // defpackage.ffz
    public final void g(fgc fgcVar) {
    }
}
