package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public interface ipu {
    void a(PrintWriter printWriter);

    void b();

    void c();

    void interrupt();

    boolean isAlive();

    void join(long j) throws InterruptedException;

    void start();
}
