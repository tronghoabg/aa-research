package defpackage;

import android.content.ComponentName;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class inw implements Runnable {
    private final ComponentName a;
    private final Runnable b;

    public inw(Runnable runnable, ComponentName componentName) {
        this.a = componentName;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof inw) {
            return this.a.equals(((inw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ype) iob.b.l().ai(654)).y("Running ResumeThenStopRunnable for %s", this.a);
        this.b.run();
    }

    public final String toString() {
        return "ResumeThenStopRunnable{" + String.valueOf(this.a) + "}";
    }
}
