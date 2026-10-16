package androidx.media3.exoplayer.video;

import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class VideoFrameRenderControl {
    private final FixedFrameRateEstimator frameRateEstimator;
    private final FrameRenderer frameRenderer;
    private long outputStreamStartPositionUs;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final TimedValueQueue<VideoSize> videoSizes = new TimedValueQueue<>();
    private final TimedValueQueue<Long> streamStartPositionsUs = new TimedValueQueue<>();
    private final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    private long latestInputPresentationTimeUs = C.TIME_UNSET;
    private VideoSize outputVideoSize = VideoSize.UNKNOWN;
    private long latestOutputPresentationTimeUs = C.TIME_UNSET;
    private long lastPresentationTimeUs = C.TIME_UNSET;

    /* compiled from: WazeSource */
    interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j2, long j3, boolean z);
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster, FixedFrameRateEstimator fixedFrameRateEstimator) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.frameRateEstimator = fixedFrameRateEstimator;
    }

    private void dropFrame() {
        this.presentationTimestampsUs.remove();
        this.frameRenderer.dropFrame();
    }

    private static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        an.l(timedValueQueue.size() > 0);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        T tPollFirst = timedValueQueue.pollFirst();
        an.B(tPollFirst);
        return tPollFirst;
    }

    private boolean maybeUpdateOutputStream(long j2) {
        Long lPollFloor = this.streamStartPositionsUs.pollFloor(j2);
        if (lPollFloor == null || lPollFloor.longValue() == this.outputStreamStartPositionUs) {
            return false;
        }
        this.outputStreamStartPositionUs = lPollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateOutputVideoSize(long j2) {
        VideoSize videoSizePollFloor = this.videoSizes.pollFloor(j2);
        if (videoSizePollFloor == null || videoSizePollFloor.equals(VideoSize.UNKNOWN) || videoSizePollFloor.equals(this.outputVideoSize)) {
            return false;
        }
        this.outputVideoSize = videoSizePollFloor;
        return true;
    }

    private void renderFrame(boolean z) {
        long jRemove = this.presentationTimestampsUs.remove();
        if (maybeUpdateOutputVideoSize(jRemove)) {
            this.frameRenderer.onVideoSizeChanged(this.outputVideoSize);
        }
        this.frameRenderer.renderFrame(z ? SystemClock.DEFAULT.nanoTime() : this.videoFrameReleaseInfo.getReleaseTimeNs(), jRemove, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.latestInputPresentationTimeUs = C.TIME_UNSET;
        this.latestOutputPresentationTimeUs = C.TIME_UNSET;
        this.lastPresentationTimeUs = C.TIME_UNSET;
        if (this.streamStartPositionsUs.size() > 0) {
            this.outputStreamStartPositionUs = ((Long) getLastAndClear(this.streamStartPositionsUs)).longValue();
        }
        if (this.videoSizes.size() > 0) {
            this.videoSizes.add(0L, (VideoSize) getLastAndClear(this.videoSizes));
        }
    }

    public boolean isEnded() {
        long j2 = this.lastPresentationTimeUs;
        return j2 != C.TIME_UNSET && this.latestOutputPresentationTimeUs == j2;
    }

    public void onFrameAvailableForRendering(long j2) {
        this.presentationTimestampsUs.add(j2);
        this.latestInputPresentationTimeUs = j2;
        this.lastPresentationTimeUs = C.TIME_UNSET;
    }

    public void onStreamChanged(int i2, long j2) {
        if (this.presentationTimestampsUs.isEmpty()) {
            this.videoFrameReleaseControl.onStreamChanged(i2);
            this.outputStreamStartPositionUs = j2;
        } else {
            TimedValueQueue<Long> timedValueQueue = this.streamStartPositionsUs;
            long j3 = this.latestInputPresentationTimeUs;
            timedValueQueue.add(j3 == C.TIME_UNSET ? SieveCacheKt.NodeMetaMask : j3 + 1, Long.valueOf(j2));
        }
    }

    public void onVideoSizeChanged(int i2, int i3) {
        long j2 = this.latestInputPresentationTimeUs;
        this.videoSizes.add(j2 == C.TIME_UNSET ? 0L : j2 + 1, new VideoSize(i2, i3));
    }

    public void render(long j2, long j3) {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long jElement = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStream(jElement)) {
                this.videoFrameReleaseControl.onStreamChanged(2);
            }
            this.frameRateEstimator.onNextFrame(1000 * jElement);
            VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
            long j4 = this.outputStreamStartPositionUs;
            FixedFrameRateEstimator fixedFrameRateEstimator = this.frameRateEstimator;
            int frameReleaseAction = videoFrameReleaseControl.getFrameReleaseAction(jElement, j2, j3, j4, false, false, fixedFrameRateEstimator.getFrameDurationNs(), fixedFrameRateEstimator.getFrameIndex(), this.videoFrameReleaseInfo);
            if (frameReleaseAction != 5 && frameReleaseAction != 4) {
                this.videoFrameReleaseEarlyTimeForecaster.onVideoFrameProcessed(jElement, this.videoFrameReleaseInfo.getEarlyUs());
            }
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.latestOutputPresentationTimeUs = jElement;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction == 2 || frameReleaseAction == 3) {
                this.latestOutputPresentationTimeUs = jElement;
                dropFrame();
            } else if (frameReleaseAction != 4) {
                return;
            } else {
                this.latestOutputPresentationTimeUs = jElement;
            }
        }
    }

    public void signalEndOfInput() {
        long j2 = this.latestInputPresentationTimeUs;
        if (j2 == C.TIME_UNSET) {
            j2 = Long.MIN_VALUE;
            this.latestInputPresentationTimeUs = Long.MIN_VALUE;
            this.latestOutputPresentationTimeUs = Long.MIN_VALUE;
        }
        this.lastPresentationTimeUs = j2;
    }
}
