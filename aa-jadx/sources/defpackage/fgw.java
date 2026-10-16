package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fgw extends android.animation.AnimatorListenerAdapter implements defpackage.fgg {
    private final android.view.View a;
    private final android.view.View b;
    private int[] c;
    private float d;
    private float e;
    private final float f;
    private final float g;
    private boolean h;

    public fgw(android.view.View view, android.view.View view2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.f = f;
        this.g = f2;
        int[] iArr = (int[]) view2.getTag(com.google.android.projection.gearhead.R.id.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(com.google.android.projection.gearhead.R.id.transition_position, null);
        }
    }

    @Override // defpackage.fgg
    public final void a(defpackage.fgj fgjVar) {
        this.h = true;
        android.view.View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.fgg
    public final void b(defpackage.fgj fgjVar) {
        throw null;
    }

    @Override // defpackage.fgg
    public final void c(defpackage.fgj fgjVar) {
        if (this.h) {
            return;
        }
        this.a.setTag(com.google.android.projection.gearhead.R.id.transition_position, null);
    }

    @Override // defpackage.fgg
    public final void d() {
        int[] iArr = this.c;
        if (iArr == null) {
            iArr = new int[2];
            this.c = iArr;
        }
        android.view.View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(com.google.android.projection.gearhead.R.id.transition_position, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.fgg
    public final void e() {
        android.view.View view = this.b;
        view.setTranslationX(this.d);
        view.setTranslationY(this.e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.h = true;
        android.view.View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        if (z) {
            return;
        }
        android.view.View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.fgg
    public final void f() {
    }

    @Override // defpackage.fgg
    public final /* synthetic */ void g(defpackage.fgj fgjVar) {
    }
}
