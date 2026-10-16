package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class feh extends AnimatorListenerAdapter {
    private boolean a;
    private final Matrix b = new Matrix();
    private final boolean c;
    private final boolean d;
    private final View e;
    private final fej f;
    private final fei g;
    private final Matrix h;

    public feh(View view, fej fejVar, fei feiVar, Matrix matrix, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = view;
        this.f = fejVar;
        this.g = feiVar;
        this.h = matrix;
    }

    private final void a(Matrix matrix) {
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        View view = this.e;
        view.setTag(R.id.transition_transform, matrix2);
        this.f.a(view);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            if (this.c && this.d) {
                a(this.h);
            } else {
                View view = this.e;
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
            }
        }
        View view2 = this.e;
        fgu.b(view2, null);
        this.f.a(view2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        a(this.g.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        fek.f(this.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
