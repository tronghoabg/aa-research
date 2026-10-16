package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class geg {
    public static final j$.time.Duration a = j$.time.Duration.ofSeconds(10);
    public android.animation.ObjectAnimator b;
    public final float c;
    public final j$.time.Duration d;

    public geg(float f, j$.time.Duration duration) {
        this.c = f;
        this.d = duration.toMillis() <= 0 ? j$.time.Duration.ofMillis(0L) : duration;
    }

    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.removeAllListeners();
        this.b.cancel();
    }
}
