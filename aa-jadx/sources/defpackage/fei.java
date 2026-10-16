package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fei extends android.animation.AnimatorListenerAdapter implements defpackage.fgg {
    private final android.widget.ImageView a;
    private final android.graphics.Matrix b;
    private final android.graphics.Matrix c;
    private boolean d = true;

    public fei(android.widget.ImageView imageView, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        this.a = imageView;
        this.b = matrix;
        this.c = matrix2;
    }

    private final void h() {
        android.widget.ImageView imageView = this.a;
        android.graphics.Matrix matrix = (android.graphics.Matrix) imageView.getTag(com.google.android.projection.gearhead.R.id.transition_image_transform);
        if (matrix != null) {
            defpackage.ffi.a(imageView, matrix);
            imageView.setTag(com.google.android.projection.gearhead.R.id.transition_image_transform, null);
        }
    }

    private final void i(android.graphics.Matrix matrix) {
        android.widget.ImageView imageView = this.a;
        imageView.setTag(com.google.android.projection.gearhead.R.id.transition_image_transform, matrix);
        defpackage.ffi.a(imageView, this.c);
    }

    @Override // defpackage.fgg
    public final void d() {
        if (this.d) {
            i(this.b);
        }
    }

    @Override // defpackage.fgg
    public final void e() {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator animator) {
        i((android.graphics.Matrix) ((android.animation.ObjectAnimator) animator).getAnimatedValue());
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        this.d = false;
    }

    @Override // defpackage.fgg
    public final void f() {
    }

    @Override // defpackage.fgg
    public final void a(defpackage.fgj fgjVar) {
    }

    @Override // defpackage.fgg
    public final void b(defpackage.fgj fgjVar) {
    }

    @Override // defpackage.fgg
    public final /* synthetic */ void c(defpackage.fgj fgjVar) {
    }

    @Override // defpackage.fgg
    public final /* synthetic */ void g(defpackage.fgj fgjVar) {
    }
}
