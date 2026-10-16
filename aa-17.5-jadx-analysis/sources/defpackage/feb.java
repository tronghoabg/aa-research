package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class feb extends AnimatorListenerAdapter implements ffz {
    private final ImageView a;
    private final Matrix b;
    private final Matrix c;
    private boolean d = true;

    public feb(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.a = imageView;
        this.b = matrix;
        this.c = matrix2;
    }

    private final void h() {
        ImageView imageView = this.a;
        Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
        if (matrix != null) {
            ffb.a(imageView, matrix);
            imageView.setTag(R.id.transition_image_transform, null);
        }
    }

    private final void i(Matrix matrix) {
        ImageView imageView = this.a;
        imageView.setTag(R.id.transition_image_transform, matrix);
        ffb.a(imageView, this.c);
    }

    @Override // defpackage.ffz
    public final void d() {
        if (this.d) {
            i(this.b);
        }
    }

    @Override // defpackage.ffz
    public final void e() {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        i((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        this.d = false;
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
