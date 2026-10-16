package androidx.media3.common.util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean block(long j2) {
        if (j2 <= 0) {
        } else {
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j3 = j2 + jElapsedRealtime;
            if (j3 < jElapsedRealtime) {
                block();
            } else {
                while (!this.isOpen && jElapsedRealtime < j3) {
                    this.clock.onThreadBlocked();
                    wait(j3 - jElapsedRealtime);
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
            }
        }
        return this.isOpen;
    }

    public synchronized boolean blockUninterruptible(long j2) {
        if (j2 <= 0) {
        } else {
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j3 = j2 + jElapsedRealtime;
            if (j3 < jElapsedRealtime) {
                blockUninterruptible();
            } else {
                boolean z = false;
                while (!this.isOpen && jElapsedRealtime < j3) {
                    try {
                        this.clock.onThreadBlocked();
                        wait(j3 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return this.isOpen;
    }

    public synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() {
        while (!this.isOpen) {
            this.clock.onThreadBlocked();
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.isOpen) {
            try {
                this.clock.onThreadBlocked();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
