package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class bd extends android.view.animation.AnimationSet implements java.lang.Runnable {
    private final android.view.ViewGroup a;
    private final android.view.View b;
    private boolean c;
    private boolean d;
    private boolean e;

    public bd(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
        super(false);
        this.e = true;
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, android.view.animation.Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            defpackage.ear.b(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c || !this.e) {
            this.a.endViewTransition(this.b);
            this.d = true;
        } else {
            this.e = false;
            this.a.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, android.view.animation.Transformation transformation, float f) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.c = true;
            defpackage.ear.b(this.a, this);
        }
        return true;
    }
}
