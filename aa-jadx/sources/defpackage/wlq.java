package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wlq {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final android.animation.TimeInterpolator e;

    public wlq(long j, long j2, android.animation.TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final android.animation.TimeInterpolator a() {
        android.animation.TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator != null ? timeInterpolator : defpackage.wlm.b;
    }

    public final void b(android.animation.Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof android.animation.ValueAnimator) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wlq)) {
            return false;
        }
        defpackage.wlq wlqVar = (defpackage.wlq) obj;
        if (this.c == wlqVar.c && this.d == wlqVar.d && this.a == wlqVar.a && this.b == wlqVar.b) {
            return a().getClass().equals(wlqVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = a().getClass().hashCode();
        long j = this.d;
        long j2 = this.c;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + this.a) * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "\n" + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
