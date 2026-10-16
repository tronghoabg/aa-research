package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import com.google.d.b.an;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    /* compiled from: WazeSource */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* compiled from: WazeSource */
    public interface Target {
        void handleMessage(int i2, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i2, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i2;
    }

    public synchronized boolean blockUntilDelivered(long j2) {
        boolean z;
        an.u(this.isSent);
        an.u(this.looper.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.clock.elapsedRealtime() + j2;
        while (true) {
            z = this.isProcessed;
            if (z || j2 <= 0) {
                break;
            }
            this.clock.onThreadBlocked();
            wait(j2);
            j2 = jElapsedRealtime - this.clock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.isDelivered;
    }

    public synchronized PlayerMessage cancel() {
        an.u(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.isDelivered = z | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public PlayerMessage send() {
        an.u(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            an.l(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z) {
        an.u(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public PlayerMessage setLooper(Looper looper) {
        an.u(!this.isSent);
        this.looper = looper;
        return this;
    }

    public PlayerMessage setPayload(Object obj) {
        an.u(!this.isSent);
        this.payload = obj;
        return this;
    }

    public PlayerMessage setPosition(int i2, long j2) {
        an.u(!this.isSent);
        an.l(j2 != C.TIME_UNSET);
        if (i2 < 0 || (!this.timeline.isEmpty() && i2 >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i2, j2);
        }
        this.mediaItemIndex = i2;
        this.positionMs = j2;
        return this;
    }

    public PlayerMessage setType(int i2) {
        an.u(!this.isSent);
        this.type = i2;
        return this;
    }

    public PlayerMessage setPosition(long j2) {
        an.u(!this.isSent);
        this.positionMs = j2;
        return this;
    }

    public synchronized boolean blockUntilDelivered() {
        an.u(this.isSent);
        an.u(this.looper.getThread() != Thread.currentThread());
        while (!this.isProcessed) {
            wait();
        }
        return this.isDelivered;
    }
}
