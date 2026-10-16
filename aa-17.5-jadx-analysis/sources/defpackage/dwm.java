package defpackage;

import android.os.Process;

/* loaded from: classes2.dex */
public final class dwm extends Thread {
    private final int a;

    public dwm(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
