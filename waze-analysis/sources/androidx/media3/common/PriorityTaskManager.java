package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* compiled from: WazeSource */
    public class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i2, int i3) {
            super("Priority too low [priority=" + i2 + ", highest=" + i3 + "]");
        }
    }

    public void add(int i2) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i2));
            this.highestPriority = Math.max(this.highestPriority, i2);
        }
    }

    public void proceed(int i2) {
        synchronized (this.lock) {
            while (this.highestPriority != i2) {
                this.lock.wait();
            }
        }
    }

    public boolean proceedNonBlocking(int i2) {
        boolean z;
        synchronized (this.lock) {
            z = this.highestPriority == i2;
        }
        return z;
    }

    public void proceedOrThrow(int i2) {
        synchronized (this.lock) {
            int i3 = this.highestPriority;
            if (i3 != i2) {
                throw new PriorityTooLowException(i2, i3);
            }
        }
    }

    public void remove(int i2) {
        int iIntValue;
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i2));
            if (this.queue.isEmpty()) {
                iIntValue = Integer.MIN_VALUE;
            } else {
                Integer numPeek = this.queue.peek();
                int i3 = Util.SDK_INT;
                Integer num = numPeek;
                iIntValue = numPeek.intValue();
            }
            this.highestPriority = iIntValue;
            this.lock.notifyAll();
        }
    }
}
