package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.work.WorkRequest;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private final long allowedJoiningTimeMs;
    private boolean disableAdvancingTimestampChecks;
    private boolean frameReadyWithoutSurface;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean hasOutputSurface;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = C.TIME_UNSET;
    private long joiningDeadlineMs = C.TIME_UNSET;
    private float playbackSpeed = 1.0f;
    private Clock clock = Clock.DEFAULT;
    private boolean requiresOutputSurface = true;
    private long earlySchedulingThresholdUs = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameReleaseAction {
    }

    /* compiled from: WazeSource */
    public class FrameReleaseInfo {
        private long earlyUs = C.TIME_UNSET;
        private long releaseTimeNs = C.TIME_UNSET;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = C.TIME_UNSET;
            this.releaseTimeNs = C.TIME_UNSET;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    /* compiled from: WazeSource */
    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j2, long j3, boolean z);

        boolean shouldForceReleaseFrame(long j2, long j3);

        boolean shouldIgnoreFrame(long j2, long j3, long j4, boolean z, boolean z2);
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j2) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j2;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    private long calculateEarlyTimeUs(long j2, long j3, long j4) {
        long j5 = (long) ((j4 - j2) / this.playbackSpeed);
        return this.started ? j5 - (Util.msToUs(this.clock.elapsedRealtime()) - j3) : j5;
    }

    private void lowerFirstFrameState(int i2) {
        this.firstFrameState = Math.min(this.firstFrameState, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean shouldForceRelease(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r0 = r7.joiningDeadlineMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r7.joiningRenderNextFrameImmediately
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r7.firstFrameState
            if (r0 == 0) goto L54
            r4 = 1
            if (r0 == r4) goto L53
            r5 = 2
            if (r0 == r5) goto L4d
            r12 = 3
            if (r0 != r12) goto L47
            androidx.media3.common.util.Clock r12 = r7.clock
            long r12 = r12.elapsedRealtime()
            long r12 = androidx.media3.common.util.Util.msToUs(r12)
            long r5 = r7.lastReleaseRealtimeUs
            long r12 = r12 - r5
            boolean r0 = r7.started
            if (r0 == 0) goto L46
            boolean r0 = r7.disableAdvancingTimestampChecks
            if (r0 != 0) goto L3d
            long r5 = r7.initialPositionUs
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L46
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L46
        L3d:
            androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameTimingEvaluator r7 = r7.frameTimingEvaluator
            boolean r7 = r7.shouldForceReleaseFrame(r10, r12)
            if (r7 == 0) goto L46
            return r4
        L46:
            return r1
        L47:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L4d:
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 < 0) goto L52
            return r4
        L52:
            return r1
        L53:
            return r4
        L54:
            boolean r7 = r7.started
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseControl.shouldForceRelease(long, long, long):boolean");
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    void experimentalDisableAdvancingTimestampChecks() {
        this.disableAdvancingTimestampChecks = true;
    }

    public int getFrameReleaseAction(long j2, long j3, long j4, long j5, boolean z, boolean z2, long j6, long j7, FrameReleaseInfo frameReleaseInfo) {
        VideoFrameReleaseControl videoFrameReleaseControl;
        boolean z3;
        frameReleaseInfo.reset();
        if (this.started && this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j3;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j3, j4, j2);
        if (z && !z2) {
            return 3;
        }
        if (!this.hasOutputSurface && this.requiresOutputSurface) {
            if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j3, j4, z2, true)) {
                return 4;
            }
            if (this.started && frameReleaseInfo.earlyUs < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                return 3;
            }
            this.frameReadyWithoutSurface = true;
            return 5;
        }
        if (!this.requiresOutputSurface) {
            this.frameReadyWithoutSurface = true;
        }
        if (shouldForceRelease(j3, frameReleaseInfo.earlyUs, j5)) {
            return 0;
        }
        if (!this.started || j3 == this.initialPositionUs) {
            return 5;
        }
        long jNanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + jNanoTime, j2, j6, j7);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - jNanoTime) / 1000;
        if (this.joiningDeadlineMs == C.TIME_UNSET || this.joiningRenderNextFrameImmediately) {
            videoFrameReleaseControl = this;
            z3 = false;
        } else {
            videoFrameReleaseControl = this;
            z3 = true;
        }
        if (videoFrameReleaseControl.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j3, j4, z2, z3)) {
            return 4;
        }
        return videoFrameReleaseControl.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j4, z2) ? z3 ? 3 : 2 : frameReleaseInfo.earlyUs > videoFrameReleaseControl.earlySchedulingThresholdUs ? 5 : 1;
    }

    public boolean isJoining() {
        return this.joiningDeadlineMs != C.TIME_UNSET;
    }

    public boolean isReady(boolean z) {
        if (z && (this.firstFrameState == 3 || (this.frameReadyWithoutSurface && (!this.hasOutputSurface || !this.requiresOutputSurface)))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public void join(boolean z) {
        this.joiningRenderNextFrameImmediately = z;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        int i2 = this.firstFrameState;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return i2 != 3;
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.frameReleaseHelper.onStopped();
    }

    public void onStreamChanged(int i2) {
        if (i2 == 0) {
            this.firstFrameState = 1;
        } else if (i2 == 1) {
            this.firstFrameState = 0;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            lowerFirstFrameState(2);
        }
        this.frameReleaseHelper.onPositionReset();
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.initialPositionUs = C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.frameReadyWithoutSurface = false;
    }

    public void setChangeFrameRateStrategy(int i2) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i2);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setEarlySchedulingThresholdUs(long j2) {
        this.earlySchedulingThresholdUs = j2;
    }

    public void setOutputSurface(Surface surface) {
        this.hasOutputSurface = surface != null;
        this.frameReadyWithoutSurface = false;
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(float f2) {
        an.l(f2 > 0.0f);
        if (f2 == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f2;
        this.frameReleaseHelper.onPlaybackSpeed(f2);
    }

    public void setRequiresOutputSurface(boolean z) {
        this.requiresOutputSurface = z;
    }

    public void setSurfaceMediaFrameRate(float f2) {
        this.frameReleaseHelper.setSurfaceMediaFrameRate(f2);
    }
}
