package A7;

import android.os.Process;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: A7.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0276o0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractQueue f1007b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1008c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0264k0 f1009d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0276o0(C0264k0 c0264k0, String str, BlockingQueue blockingQueue) {
        this.f1009d = c0264k0;
        AbstractC1732v.i(blockingQueue);
        this.f1006a = new Object();
        this.f1007b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f1006a) {
            this.f1006a.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        N nZzj = this.f1009d.zzj();
        nZzj.f608i.d(N0.a.f(getName(), " was interrupted"), interruptedException);
    }

    public final void c() {
        synchronized (this.f1009d.f936i) {
            try {
                if (!this.f1008c) {
                    this.f1009d.f937j.release();
                    this.f1009d.f936i.notifyAll();
                    C0264k0 c0264k0 = this.f1009d;
                    if (this == c0264k0.f930c) {
                        c0264k0.f930c = null;
                    } else if (this == c0264k0.f931d) {
                        c0264k0.f931d = null;
                    } else {
                        c0264k0.zzj().f605f.c("Current scheduler thread is neither worker nor network");
                    }
                    this.f1008c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z2 = false;
        while (!z2) {
            try {
                this.f1009d.f937j.acquire();
                z2 = true;
            } catch (InterruptedException e7) {
                b(e7);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C0267l0 c0267l0 = (C0267l0) this.f1007b.poll();
                if (c0267l0 != null) {
                    Process.setThreadPriority(c0267l0.f944b ? threadPriority : 10);
                    c0267l0.run();
                } else {
                    synchronized (this.f1006a) {
                        if (this.f1007b.peek() == null) {
                            this.f1009d.getClass();
                            try {
                                this.f1006a.wait(30000L);
                            } catch (InterruptedException e10) {
                                b(e10);
                            }
                        }
                    }
                    synchronized (this.f1009d.f936i) {
                        if (this.f1007b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
