package defpackage;

import android.os.Process;

/* loaded from: classes2.dex */
final class qlj extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        super.run();
    }
}
