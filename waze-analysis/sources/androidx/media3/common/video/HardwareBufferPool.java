package androidx.media3.common.video;

import android.hardware.HardwareBuffer;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import com.google.d.b.an;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HardwareBufferPool {
    private int allocatedBufferCount;
    private final int capacity;
    private boolean isReleased;
    private final Object lock = new Object();
    private final Queue<HardwareBufferWithFence> pool;
    private Runnable wakeupListener;

    /* compiled from: WazeSource */
    public final class HardwareBufferWithFence {
        public final SyncFenceWrapper acquireFence;
        public final HardwareBuffer hardwareBuffer;

        public HardwareBufferWithFence(HardwareBuffer hardwareBuffer, SyncFenceWrapper syncFenceWrapper) {
            this.hardwareBuffer = hardwareBuffer;
            this.acquireFence = syncFenceWrapper;
        }
    }

    public HardwareBufferPool(int i2) {
        this.capacity = i2;
        this.pool = new ArrayDeque(i2);
    }

    private static long adjustUsageFlags(long j2) {
        return j2 | 256;
    }

    private void closeFence(SyncFenceWrapper syncFenceWrapper) {
        if (syncFenceWrapper != null) {
            syncFenceWrapper.close();
        }
    }

    private static HardwareBufferWithFence createNewBufferWithFence(Format format, long j2) {
        HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(format.width, format.height, getPixelFormat(format), 1, adjustUsageFlags(j2));
        an.u(!hardwareBufferCreate.isClosed());
        return new HardwareBufferWithFence(hardwareBufferCreate, null);
    }

    private static int getPixelFormat(Format format) {
        int i2 = format.pixelFormat;
        return i2 != -1 ? i2 : ColorInfo.isTransferHdr(format.colorInfo) ? 43 : 1;
    }

    private static boolean isCompatible(HardwareBuffer hardwareBuffer, Format format, long j2) {
        return hardwareBuffer.getWidth() == format.width && hardwareBuffer.getHeight() == format.height && hardwareBuffer.getFormat() == getPixelFormat(format) && hardwareBuffer.getUsage() == adjustUsageFlags(j2);
    }

    private boolean poolContainsBuffer(HardwareBuffer hardwareBuffer) {
        Iterator<HardwareBufferWithFence> it = this.pool.iterator();
        while (it.hasNext()) {
            if (it.next().hardwareBuffer == hardwareBuffer) {
                return true;
            }
        }
        return false;
    }

    public HardwareBufferWithFence get(Format format, long j2, Runnable runnable) {
        synchronized (this.lock) {
            if (this.isReleased) {
                return null;
            }
            while (true) {
                HardwareBufferWithFence hardwareBufferWithFencePoll = this.pool.poll();
                if (hardwareBufferWithFencePoll == null) {
                    int i2 = this.allocatedBufferCount;
                    if (i2 >= this.capacity) {
                        this.wakeupListener = runnable;
                        return null;
                    }
                    this.allocatedBufferCount = i2 + 1;
                    return createNewBufferWithFence(format, j2);
                }
                HardwareBuffer hardwareBuffer = hardwareBufferWithFencePoll.hardwareBuffer;
                if (isCompatible(hardwareBuffer, format, j2)) {
                    return hardwareBufferWithFencePoll;
                }
                hardwareBuffer.close();
                closeFence(hardwareBufferWithFencePoll.acquireFence);
                this.allocatedBufferCount--;
            }
        }
    }

    public void recycle(HardwareBuffer hardwareBuffer, SyncFenceWrapper syncFenceWrapper) {
        an.l(!hardwareBuffer.isClosed());
        closeFence(syncFenceWrapper);
        synchronized (this.lock) {
            if (this.isReleased) {
                hardwareBuffer.close();
                closeFence(syncFenceWrapper);
                return;
            }
            Runnable runnable = null;
            if (!poolContainsBuffer(hardwareBuffer)) {
                this.pool.add(new HardwareBufferWithFence(hardwareBuffer, null));
                Runnable runnable2 = this.wakeupListener;
                if (runnable2 != null) {
                    this.wakeupListener = null;
                    runnable = runnable2;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void release() {
        synchronized (this.lock) {
            if (this.isReleased) {
                return;
            }
            this.isReleased = true;
            while (true) {
                HardwareBufferWithFence hardwareBufferWithFencePoll = this.pool.poll();
                if (hardwareBufferWithFencePoll == null) {
                    return;
                }
                hardwareBufferWithFencePoll.hardwareBuffer.close();
                closeFence(hardwareBufferWithFencePoll.acquireFence);
            }
        }
    }
}
