package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    public static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private final Context context;
    private long lastAdjustedFrameIndex;
    private long lastAdjustedPresentationTimeUs;
    private long lastAdjustedReleaseTimeNs;
    private long lastVsyncHysteresisOffsetNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private long pendingLastPresentationTimeUs;
    private long pendingVsyncHysteresisOffsetNs;
    private boolean started;
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private boolean vsyncSampleBuilt;
    private VSyncSampler vsyncSampler;
    private float playbackSpeed = 1.0f;
    private int changeFrameRateStrategy = 0;

    /* compiled from: WazeSource */
    final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(Surface surface, float f2) {
            try {
                surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                Log.e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    /* compiled from: WazeSource */
    abstract class VSyncSampler implements DisplayManager.DisplayListener {
        final Choreographer choreographer;
        final DisplayManager displayManager;
        volatile long sampledVsyncTimeNs;
        volatile long vsyncDurationNs;

        private VSyncSampler(Choreographer choreographer, DisplayManager displayManager) {
            this.choreographer = choreographer;
            this.displayManager = displayManager;
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static VSyncSampler maybeBuildInstance(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return null;
            }
            try {
                Choreographer choreographer = Choreographer.getInstance();
                return Build.VERSION.SDK_INT >= 33 ? new VSyncSamplerV33(choreographer, displayManager) : new VSyncSamplerBase(choreographer, displayManager);
            } catch (RuntimeException e2) {
                Log.w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e2);
                return null;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i2) {
        }

        void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
        }

        void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }
    }

    /* compiled from: WazeSource */
    final class VSyncSamplerBase extends VSyncSampler implements Choreographer.FrameCallback {
        private VSyncSamplerBase(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
        }

        private static long getVsyncDurationNsFromDefaultDisplay(DisplayManager displayManager) {
            if (displayManager.getDisplay(0) != null) {
                return (long) (1.0E9d / r4.getRefreshRate());
            }
            Log.w(VideoFrameReleaseHelper.TAG, "Unable to query display refresh rate");
            return C.TIME_UNSET;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.sampledVsyncTimeNs = j2;
            this.choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                this.choreographer.postFrameCallback(this);
                this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        void register() {
            super.register();
            this.choreographer.postFrameCallback(this);
            this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        void unregister() {
            super.unregister();
            this.choreographer.removeFrameCallback(this);
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }
    }

    /* compiled from: WazeSource */
    final class VSyncSamplerV33 extends VSyncSampler implements Choreographer$VsyncCallback {
        private final Handler handler;

        private VSyncSamplerV33(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.handler = Util.createHandlerForCurrentLooper();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVsync$0() {
            this.choreographer.postVsyncCallback(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                this.choreographer.postVsyncCallback(this);
            }
        }

        public void onVsync(Choreographer.FrameData frameData) {
            this.sampledVsyncTimeNs = frameData.getFrameTimeNanos();
            Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            int length = frameTimelines.length;
            long j2 = C.TIME_UNSET;
            if (length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                if (expectedPresentationTimeNanos != 0) {
                    j2 = expectedPresentationTimeNanos;
                }
                this.vsyncDurationNs = j2;
            } else {
                this.vsyncDurationNs = C.TIME_UNSET;
            }
            this.handler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoFrameReleaseHelper$VSyncSamplerV33$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onVsync$0();
                }
            }, 500L);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        void register() {
            super.register();
            this.choreographer.postVsyncCallback(this);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        void unregister() {
            super.unregister();
            this.handler.removeCallbacksAndMessages(null);
            this.choreographer.removeVsyncCallback(this);
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        this.context = context;
    }

    private static boolean adjustmentAllowed(long j2, long j3) {
        return Math.abs(j2 - j3) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f || !surface.isValid()) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        Api30.setSurfaceFrameRate(this.surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long findClosestVsyncAndUpdateHysteresis(long r19, long r21, long r23) {
        /*
            r18 = this;
            r0 = r18
            long r1 = r19 - r21
            long r1 = r1 / r23
            long r1 = r1 * r23
            long r1 = r21 + r1
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 > 0) goto L11
            long r3 = r1 - r23
            goto L18
        L11:
            long r3 = r1 + r23
            r16 = r3
            r3 = r1
            r1 = r16
        L18:
            r5 = 2
            long r5 = r23 / r5
            long r7 = r1 - r19
            long r9 = r19 - r3
            long r11 = r7 - r9
            long r11 = java.lang.Math.abs(r11)
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 >= 0) goto L47
            r5 = 4
            long r5 = r23 / r5
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r12 = 0
            if (r11 >= 0) goto L49
            long r14 = r0.lastVsyncHysteresisOffsetNs
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 == 0) goto L3e
            r0.pendingVsyncHysteresisOffsetNs = r14
            r12 = r14
            goto L4b
        L3e:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L43
            long r5 = -r5
        L43:
            r0.pendingVsyncHysteresisOffsetNs = r5
            r12 = r5
            goto L4b
        L47:
            long r12 = r0.lastVsyncHysteresisOffsetNs
        L49:
            r0.pendingVsyncHysteresisOffsetNs = r12
        L4b:
            long r7 = r7 + r12
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L51
            return r1
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseHelper.findClosestVsyncAndUpdateHysteresis(long, long, long):long");
    }

    private void resetAdjustment() {
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
        this.pendingLastPresentationTimeUs = C.TIME_UNSET;
        this.lastVsyncHysteresisOffsetNs = 0L;
        this.pendingVsyncHysteresisOffsetNs = 0L;
    }

    private void updateSurfacePlaybackFrameRate(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f2 = 0.0f;
        if (this.started) {
            float f3 = this.surfaceMediaFrameRate;
            if (f3 != -1.0f) {
                f2 = this.playbackSpeed * f3;
            }
        }
        if (z || this.surfacePlaybackFrameRate != f2) {
            this.surfacePlaybackFrameRate = f2;
            Api30.setSurfaceFrameRate(this.surface, f2);
        }
    }

    public long adjustReleaseTime(long j2, long j3, long j4, long j5) {
        float f2;
        long j6;
        long j7 = this.pendingLastPresentationTimeUs;
        if (j3 != j7) {
            this.lastAdjustedFrameIndex = this.pendingLastAdjustedFrameIndex;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
            this.lastAdjustedPresentationTimeUs = j7;
            this.lastVsyncHysteresisOffsetNs = this.pendingVsyncHysteresisOffsetNs;
        }
        long j8 = this.lastAdjustedFrameIndex;
        if (j8 != -1) {
            if (j4 != C.TIME_UNSET) {
                f2 = this.playbackSpeed;
                j6 = (j5 - j8) * j4;
            } else {
                long j9 = j3 - this.lastAdjustedPresentationTimeUs;
                f2 = this.playbackSpeed;
                j6 = j9 * 1000;
            }
            long j10 = this.lastAdjustedReleaseTimeNs + ((long) (j6 / f2));
            if (adjustmentAllowed(j2, j10)) {
                j2 = j10;
            } else {
                resetAdjustment();
            }
        }
        this.pendingLastAdjustedFrameIndex = j5;
        this.pendingLastAdjustedReleaseTimeNs = j2;
        this.pendingLastPresentationTimeUs = j3;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            long j11 = vSyncSampler.sampledVsyncTimeNs;
            long j12 = this.vsyncSampler.vsyncDurationNs;
            if (j11 != C.TIME_UNSET && j12 != C.TIME_UNSET) {
                return findClosestVsyncAndUpdateHysteresis(j2, j11, j12) - ((VSYNC_OFFSET_PERCENTAGE * j12) / 100);
            }
        }
        return j2;
    }

    public void onPlaybackSpeed(float f2) {
        this.playbackSpeed = f2;
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (!this.vsyncSampleBuilt) {
            this.vsyncSampler = VSyncSampler.maybeBuildInstance(this.context);
        }
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.unregister();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(Surface surface) {
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i2) {
        if (this.changeFrameRateStrategy == i2) {
            return;
        }
        this.changeFrameRateStrategy = i2;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setSurfaceMediaFrameRate(float f2) {
        if (this.surfaceMediaFrameRate == f2) {
            return;
        }
        this.surfaceMediaFrameRate = f2;
        updateSurfacePlaybackFrameRate(false);
    }

    public void setVsyncData(long j2, long j3) {
        VSyncSampler vSyncSampler = this.vsyncSampler;
        an.B(vSyncSampler);
        vSyncSampler.sampledVsyncTimeNs = j2;
        this.vsyncSampler.vsyncDurationNs = j3;
    }
}
