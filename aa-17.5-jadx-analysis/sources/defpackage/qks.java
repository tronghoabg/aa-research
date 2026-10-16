package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class qks extends Thread {
    public final CountDownLatch a;
    private final WeakReference b;
    private final long c;

    public qks(qku qkuVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.b = new WeakReference(qkuVar);
        this.c = j;
        this.a = new CountDownLatch(1);
        start();
    }

    private final void a() {
        qku qkuVar = (qku) this.b.get();
        if (qkuVar != null) {
            qkuVar.a();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
