package androidx.media3.exoplayer.video;

import androidx.media3.common.C;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;
    static final long MAX_MATCHING_FRAME_DIFFERENCE_NS = 1000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_FRAME_RATE_ESTIMATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.1f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private boolean candidateMatcherActive;
    private long frameIndex;
    private int framesWithoutSyncCount;
    private final Listener listener;
    private boolean switchToCandidateMatcherWhenSynced;
    private Matcher currentMatcher = new Matcher();
    private Matcher candidateMatcher = new Matcher();
    private long lastFramePresentationTimeNs = C.TIME_UNSET;
    private float formatFrameRate = -1.0f;
    private float frameRateEstimate = -1.0f;

    /* compiled from: WazeSource */
    public interface Listener {
        void onFrameRateEstimateChanged(float f2);
    }

    /* compiled from: WazeSource */
    final class Matcher {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags = new boolean[15];

        private static int getRecentFrameOutlierIndex(long j2) {
            return (int) (j2 % 15);
        }

        public long getFrameDurationNs() {
            long j2 = this.matchingFrameCount;
            if (j2 == 0) {
                return 0L;
            }
            return this.matchingFrameDurationSumNs / j2;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.matchingFrameDurationSumNs;
        }

        public boolean isLastFrameOutlier() {
            long j2 = this.frameCount;
            if (j2 == 0) {
                return false;
            }
            return this.recentFrameOutlierFlags[getRecentFrameOutlierIndex(j2 - 1)];
        }

        public boolean isSynced() {
            return this.frameCount > 15 && this.recentFrameOutlierCount == 0;
        }

        public void onNextFrame(long j2) {
            long j3 = this.frameCount;
            if (j3 == 0) {
                this.firstFramePresentationTimeNs = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.firstFramePresentationTimeNs;
                this.firstFrameDurationNs = j4;
                this.matchingFrameDurationSumNs = j4;
                this.matchingFrameCount = 1L;
            } else {
                long j5 = j2 - this.lastFramePresentationTimeNs;
                long j6 = j5 - this.firstFrameDurationNs;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j3);
                if (Math.abs(j6) <= 1000000) {
                    this.matchingFrameCount++;
                    this.matchingFrameDurationSumNs += j5;
                    boolean[] zArr = this.recentFrameOutlierFlags;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.recentFrameOutlierCount--;
                    }
                } else {
                    boolean[] zArr2 = this.recentFrameOutlierFlags;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.recentFrameOutlierCount++;
                    }
                }
            }
            this.frameCount++;
            this.lastFramePresentationTimeNs = j2;
        }

        public void reset() {
            this.frameCount = 0L;
            this.matchingFrameCount = 0L;
            this.matchingFrameDurationSumNs = 0L;
            this.recentFrameOutlierCount = 0;
            Arrays.fill(this.recentFrameOutlierFlags, false);
        }
    }

    public FixedFrameRateEstimator(Listener listener) {
        this.listener = listener;
    }

    private void updateReportedFrameRate() {
        boolean zIsSynced = this.currentMatcher.isSynced();
        float frameDurationNs = zIsSynced ? (float) (1.0E9d / this.currentMatcher.getFrameDurationNs()) : this.formatFrameRate;
        float f2 = this.frameRateEstimate;
        if (frameDurationNs == f2) {
            return;
        }
        if (frameDurationNs != -1.0f && f2 != -1.0f) {
            float f3 = 1.0f;
            if (zIsSynced && this.currentMatcher.getMatchingFrameDurationSumNs() >= MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) {
                f3 = 0.1f;
            }
            if (Math.abs(frameDurationNs - this.frameRateEstimate) < f3) {
                return;
            }
        } else if (frameDurationNs == -1.0f && this.framesWithoutSyncCount < 30) {
            return;
        }
        this.frameRateEstimate = frameDurationNs;
        this.listener.onFrameRateEstimateChanged(frameDurationNs);
    }

    public long getFrameDurationNs() {
        return this.currentMatcher.isSynced() ? this.currentMatcher.getFrameDurationNs() : C.TIME_UNSET;
    }

    public long getFrameIndex() {
        return this.frameIndex;
    }

    public void onFormatChanged(float f2) {
        this.formatFrameRate = f2;
        this.currentMatcher.reset();
        this.candidateMatcher.reset();
        this.candidateMatcherActive = false;
        this.lastFramePresentationTimeNs = C.TIME_UNSET;
        this.framesWithoutSyncCount = 0;
        updateReportedFrameRate();
    }

    public void onNextFrame(long j2) {
        if (j2 == this.lastFramePresentationTimeNs) {
            return;
        }
        this.frameIndex++;
        this.currentMatcher.onNextFrame(j2);
        if (this.currentMatcher.isSynced() && !this.switchToCandidateMatcherWhenSynced) {
            this.candidateMatcherActive = false;
        } else if (this.lastFramePresentationTimeNs != C.TIME_UNSET) {
            if (!this.candidateMatcherActive || this.candidateMatcher.isLastFrameOutlier()) {
                this.candidateMatcher.reset();
                this.candidateMatcher.onNextFrame(this.lastFramePresentationTimeNs);
            }
            this.candidateMatcherActive = true;
            this.candidateMatcher.onNextFrame(j2);
        }
        if (this.candidateMatcherActive && this.candidateMatcher.isSynced()) {
            Matcher matcher = this.currentMatcher;
            this.currentMatcher = this.candidateMatcher;
            this.candidateMatcher = matcher;
            this.candidateMatcherActive = false;
            this.switchToCandidateMatcherWhenSynced = false;
        }
        this.lastFramePresentationTimeNs = j2;
        this.framesWithoutSyncCount = this.currentMatcher.isSynced() ? 0 : this.framesWithoutSyncCount + 1;
        updateReportedFrameRate();
    }
}
