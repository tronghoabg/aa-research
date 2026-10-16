package defpackage;

import j$.time.Duration;

/* loaded from: classes2.dex */
public final class ipy {
    public final int a;
    public final int b;
    public final Object c = new Object();
    public int d;
    public boolean e;

    public ipy(Duration duration, Duration duration2, Duration duration3) {
        duration.getClass();
        duration2.getClass();
        duration3.getClass();
        zen.c(duration);
        zen.c(duration2);
        zen.b(duration3);
        woy.O(duration3.compareTo(duration2) <= 0, "resumeQueueDuration must be <= maxQueueDuration");
        long nanos = duration.toNanos();
        this.a = (int) (duration2.toNanos() / nanos);
        this.b = (int) (duration3.toNanos() / nanos);
    }

    public final void a() {
        synchronized (this.c) {
            this.d = Math.max(0, this.d - 1);
        }
    }

    public final void b() {
        synchronized (this.c) {
            this.d++;
        }
    }
}
