package androidx.media3.exoplayer;

import androidx.media3.common.C;
import com.google.d.b.an;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j2) {
        long j3 = this.lastRebufferRealtimeMs;
        return (j3 == C.TIME_UNSET || j2 == C.TIME_UNSET || j3 < j2) ? false : true;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public Builder() {
            this.playbackPositionUs = C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = C.TIME_UNSET;
        }

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        public Builder setLastRebufferRealtimeMs(long j2) {
            boolean z = true;
            if (j2 < 0) {
                if (j2 == C.TIME_UNSET) {
                    j2 = -9223372036854775807L;
                } else {
                    z = false;
                }
            }
            an.l(z);
            this.lastRebufferRealtimeMs = j2;
            return this;
        }

        public Builder setPlaybackPositionUs(long j2) {
            this.playbackPositionUs = j2;
            return this;
        }

        public Builder setPlaybackSpeed(float f2) {
            boolean z = true;
            if (f2 <= 0.0f && f2 != -3.4028235E38f) {
                z = false;
            }
            an.l(z);
            this.playbackSpeed = f2;
            return this;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }
}
