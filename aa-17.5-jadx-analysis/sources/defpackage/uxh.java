package defpackage;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class uxh {
    public static final uxh a = new uxh(Looper.getMainLooper().getThread());
    public final Thread b;
    public final String c = "Not on the main thread";

    private uxh(Thread thread) {
        this.b = thread;
    }
}
