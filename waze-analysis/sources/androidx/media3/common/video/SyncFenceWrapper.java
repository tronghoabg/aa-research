package androidx.media3.common.video;

import android.hardware.SyncFence;
import android.os.Build;
import j$.time.Duration;
import j$.time.TimeConversions;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SyncFenceWrapper {
    private final SyncFence syncFence;

    private SyncFenceWrapper(SyncFence syncFence) {
        this.syncFence = syncFence;
    }

    public static SyncFenceWrapper of(SyncFence syncFence) {
        return new SyncFenceWrapper(syncFence);
    }

    public SyncFence asSyncFence() {
        return this.syncFence;
    }

    public boolean await(Duration duration) {
        if (Build.VERSION.SDK_INT >= 33) {
            return this.syncFence.await(TimeConversions.convert(duration));
        }
        return true;
    }

    public void awaitForever() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.syncFence.awaitForever();
        }
    }

    public boolean awaitMs(long j2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return this.syncFence.await(TimeConversions.convert(Duration.ofMillis(j2)));
        }
        return true;
    }

    public void close() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.syncFence.close();
        }
    }
}
