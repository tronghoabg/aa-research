package We;

import a9.C1342b;
import android.os.Process;
import cg.C1616e;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15499a = 1;

    public /* synthetic */ k(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        C1616e c1616eH;
        switch (this.f15499a) {
            case 1:
                break;
            case 2:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C1616e.f19894h;
                reentrantLock = C1616e.f19894h;
                reentrantLock.lock();
                try {
                    c1616eH = C1342b.h();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
            if (c1616eH == C1616e.f19897l) {
                C1616e.f19897l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c1616eH != null) {
                    c1616eH.j();
                }
            }
        }
    }

    public /* synthetic */ k(String str, Runnable runnable) {
        super(runnable, str);
    }

    public /* synthetic */ k(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
