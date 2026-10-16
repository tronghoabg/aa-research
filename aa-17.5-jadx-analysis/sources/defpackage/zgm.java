package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes3.dex */
final class zgm extends AbstractOwnableSynchronizer implements Runnable {
    private final zgn a;

    public zgm(zgn zgnVar) {
        this.a = zgnVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
