package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class fdx extends AnimatorListenerAdapter implements ffz {
    private final Rect a;
    private final Rect b;
    private final View c;

    public fdx(View view, Rect rect, Rect rect2) {
        this.c = view;
        this.a = rect;
        this.b = rect2;
    }

    @Override // defpackage.ffz
    public final void d() {
        View view = this.c;
        Rect clipBounds = view.getClipBounds();
        if (clipBounds == null) {
            clipBounds = fdy.a;
        }
        view.setTag(R.id.transition_clip, clipBounds);
        view.setClipBounds(this.b);
    }

    @Override // defpackage.ffz
    public final void e() {
        View view = this.c;
        view.setClipBounds((Rect) view.getTag(R.id.transition_clip));
        view.setTag(R.id.transition_clip, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        View view = this.c;
        if (z) {
            view.setClipBounds(this.a);
        } else {
            view.setClipBounds(this.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.ffz
    public final void f() {
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
    public final /* synthetic */ void g(fgc fgcVar) {
    }
}
