package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class fgq extends AnimatorListenerAdapter implements ffz {
    private final View a;
    private final View b;
    private int[] c;
    private float d;
    private float e;
    private final float f;
    private final float g;
    private boolean h;

    public fgq(View view, View view2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.f = f;
        this.g = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // defpackage.ffz
    public final void a(fgc fgcVar) {
        this.h = true;
        View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.ffz
    public final void b(fgc fgcVar) {
        throw null;
    }

    @Override // defpackage.ffz
    public final void c(fgc fgcVar) {
        if (this.h) {
            return;
        }
        this.a.setTag(R.id.transition_position, null);
    }

    @Override // defpackage.ffz
    public final void d() {
        int[] iArr = this.c;
        if (iArr == null) {
            iArr = new int[2];
            this.c = iArr;
        }
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(R.id.transition_position, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.ffz
    public final void e() {
        View view = this.b;
        view.setTranslationX(this.d);
        view.setTranslationY(this.e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.ffz
    public final void f() {
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void g(fgc fgcVar) {
    }
}
