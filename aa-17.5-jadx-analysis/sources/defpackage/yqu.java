package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class yqu {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a(yqt yqtVar) {
        if (yqtVar == null) {
            yqtVar = yrc.c;
        }
        if (!a.p(yqy.d, yqtVar)) {
            throw new IllegalStateException("Logger backends can only be configured once.");
        }
        yqy.c();
    }

    public static void b() {
        if (!a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
    }
}
