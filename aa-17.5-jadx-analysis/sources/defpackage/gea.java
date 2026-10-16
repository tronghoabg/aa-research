package defpackage;

import android.animation.ObjectAnimator;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class gea {
    public static final Duration a = Duration.ofSeconds(10);
    public ObjectAnimator b;
    public final float c;
    public final Duration d;

    public gea(float f, Duration duration) {
        this.c = f;
        this.d = duration.toMillis() <= 0 ? Duration.ofMillis(0L) : duration;
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.removeAllListeners();
        this.b.cancel();
    }
}
