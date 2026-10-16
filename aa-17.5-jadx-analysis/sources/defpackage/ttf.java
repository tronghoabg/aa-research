package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class ttf extends ValueAnimator {
    final /* synthetic */ ttg a;

    protected ttf(ttg ttgVar) {
        this.a = ttgVar;
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
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        b(j);
        return this;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        super.setStartDelay(j);
        this.a.n();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ ValueAnimator setDuration(long j) {
        b(j);
        return this;
    }
}
