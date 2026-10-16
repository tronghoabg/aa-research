package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tub extends android.animation.ValueAnimator {
    final /* synthetic */ defpackage.tuc a;

    protected tub(defpackage.tuc tucVar) {
        this.a = tucVar;
    }

    final void a(long j) {
        long startDelay = getStartDelay() + getDuration();
        if (startDelay == 0) {
            super.setDuration(j);
            return;
        }
        long startDelay2 = (long) ((j / startDelay) * getStartDelay());
        super.setStartDelay(startDelay2);
        super.setDuration(j - startDelay2);
    }

    public final void b(long j) {
        super.setDuration(j);
        this.a.n();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ android.animation.Animator setDuration(long j) {
        b(j);
        return this;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        super.setStartDelay(j);
        this.a.n();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ android.animation.ValueAnimator setDuration(long j) {
        b(j);
        return this;
    }
}
