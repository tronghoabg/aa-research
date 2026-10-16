package androidx.media3.exoplayer.source;

import androidx.core.os.EnvironmentCompat;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private MediaItem.ClippingConfiguration config;
    private final boolean enableClippingInMediaPeriod;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final Timeline.Window window;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean buildCalled;
        private MediaItem.ClippingConfiguration.Builder config;
        private boolean enableClippingInMediaPeriod;
        private final MediaSource mediaSource;

        public Builder(MediaSource mediaSource) {
            an.B(mediaSource);
            this.mediaSource = mediaSource;
            this.config = new MediaItem.ClippingConfiguration.Builder();
        }

        public ClippingMediaSource build() {
            this.buildCalled = true;
            return new ClippingMediaSource(this);
        }

        public Builder setAllowDynamicClippingUpdates(boolean z) {
            an.u(!this.buildCalled);
            this.config.setRelativeToLiveWindow(z);
            return this;
        }

        public Builder setAllowUnseekableMedia(boolean z) {
            an.u(!this.buildCalled);
            this.config.setAllowUnseekableMedia(z);
            return this;
        }

        public Builder setClippingConfiguration(MediaItem.ClippingConfiguration clippingConfiguration) {
            an.u(!this.buildCalled);
            this.config = clippingConfiguration.buildUpon();
            return this;
        }

        public Builder setEnableClippingInMediaPeriod(boolean z) {
            an.u(!this.buildCalled);
            this.enableClippingInMediaPeriod = z;
            return this;
        }

        public Builder setEnableInitialDiscontinuity(boolean z) {
            an.u(!this.buildCalled);
            this.config.setStartsAtKeyFrame(!z);
            return this;
        }

        public Builder setEndPositionMs(long j2) {
            setEndPositionUs(Util.msToUs(j2));
            return this;
        }

        public Builder setEndPositionUs(long j2) {
            an.u(!this.buildCalled);
            this.config.setEndPositionUs(j2);
            return this;
        }

        public Builder setRelativeToDefaultPosition(boolean z) {
            an.u(!this.buildCalled);
            this.config.setRelativeToDefaultPosition(z);
            return this;
        }

        public Builder setStartPositionMs(long j2) {
            setStartPositionUs(Util.msToUs(j2));
            return this;
        }

        public Builder setStartPositionUs(long j2) {
            an.u(!this.buildCalled);
            this.config.setStartPositionUs(j2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ClippingTimeline(androidx.media3.common.Timeline r7, long r8, long r10, boolean r12) throws androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException {
            /*
                r6 = this;
                r6.<init>(r7)
                r0 = -9223372036854775808
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L15
                int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r1 < 0) goto Le
                goto L15
            Le:
                androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException r6 = new androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                r7 = 2
                r6.<init>(r7, r8, r10)
                throw r6
            L15:
                int r1 = r7.getPeriodCount()
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L83
                androidx.media3.common.Timeline$Window r1 = new androidx.media3.common.Timeline$Window
                r1.<init>()
                androidx.media3.common.Timeline$Window r7 = r7.getWindow(r3, r1)
                r4 = 0
                long r8 = java.lang.Math.max(r4, r8)
                if (r12 != 0) goto L41
                boolean r12 = r7.isPlaceholder
                if (r12 != 0) goto L41
                int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r12 == 0) goto L41
                boolean r12 = r7.isSeekable
                if (r12 == 0) goto L3b
                goto L41
            L3b:
                androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException r6 = new androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                r6.<init>(r2)
                throw r6
            L41:
                if (r0 != 0) goto L46
                long r10 = r7.durationUs
                goto L4a
            L46:
                long r10 = java.lang.Math.max(r4, r10)
            L4a:
                long r0 = r7.durationUs
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r12 == 0) goto L60
                int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r12 > 0) goto L5a
                goto L5b
            L5a:
                r10 = r0
            L5b:
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto L60
                r8 = r10
            L60:
                r6.startUs = r8
                r6.endUs = r10
                int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r12 != 0) goto L6a
                r8 = r4
                goto L6c
            L6a:
                long r8 = r10 - r8
            L6c:
                r6.durationUs = r8
                boolean r8 = r7.isDynamic
                if (r8 == 0) goto L7f
                if (r12 == 0) goto L80
                long r7 = r7.durationUs
                int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r9 == 0) goto L7f
                int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r7 != 0) goto L7f
                goto L80
            L7f:
                r2 = r3
            L80:
                r6.isDynamic = r2
                return
            L83:
                androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException r6 = new androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                r6.<init>(r3)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ClippingMediaSource.ClippingTimeline.<init>(androidx.media3.common.Timeline, long, long, boolean):void");
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j2 = this.durationUs;
            long j3 = C.TIME_UNSET;
            if (j2 != C.TIME_UNSET) {
                j3 = j2 - positionInWindowUs;
            }
            period.set(period.id, period.uid, 0, j3, positionInWindowUs, AdPlaybackState.NONE, period.isPlaceholder);
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            this.timeline.getWindow(0, window, 0L);
            long j3 = window.positionInFirstPeriodUs;
            long j4 = this.startUs;
            window.positionInFirstPeriodUs = j3 + j4;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j5 = window.defaultPositionUs;
            if (j5 != C.TIME_UNSET) {
                long jMax = Math.max(j5, j4);
                window.defaultPositionUs = jMax;
                long j6 = this.endUs;
                if (j6 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j6);
                }
                window.defaultPositionUs = jMax;
                window.defaultPositionUs = jMax - this.startUs;
            }
            long j7 = this.startUs;
            int i3 = Util.SDK_INT;
            long j8 = window.presentationStartTimeMs;
            long jUsToMs = Util.usToMs(j7);
            if (j8 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j8 + jUsToMs;
            }
            long j9 = window.windowStartTimeMs;
            if (j9 != C.TIME_UNSET) {
                window.windowStartTimeMs = j9 + jUsToMs;
            }
            return window;
        }
    }

    private ClippingMediaSource(Builder builder) {
        super(builder.mediaSource);
        this.config = builder.config.build();
        this.enableClippingInMediaPeriod = builder.enableClippingInMediaPeriod;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j2;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (shouldKeepWindowFixed()) {
            j2 = this.periodStartUs - positionInFirstPeriodUs;
            long j3 = this.periodEndUs;
            if (j3 != Long.MIN_VALUE) {
                j = j3 - positionInFirstPeriodUs;
            }
        } else {
            MediaItem.ClippingConfiguration clippingConfiguration = this.config;
            j2 = clippingConfiguration.startPositionUs;
            long j4 = clippingConfiguration.endPositionUs;
            if (clippingConfiguration.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j2 += defaultPositionUs;
                if (j4 != Long.MIN_VALUE) {
                    j4 += defaultPositionUs;
                }
            }
            this.periodStartUs = positionInFirstPeriodUs + j2;
            this.periodEndUs = this.config.endPositionUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j4 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mediaPeriods.get(i2).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j = j4;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j2, j, this.config.allowUnseekableMedia);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e2) {
            this.clippingError = e2;
            for (int i3 = 0; i3 < this.mediaPeriods.size(); i3++) {
                this.mediaPeriods.get(i3).setClippingError(this.clippingError);
            }
        }
    }

    private boolean shouldKeepWindowFixed() {
        return (this.mediaPeriods.isEmpty() || this.clippingTimeline == null || this.config.relativeToLiveWindow) ? false : true;
    }

    private void updatePeriodClippingToNewConfig(MediaItem.ClippingConfiguration clippingConfiguration) {
        long defaultPositionUs = this.clippingTimeline.timeline.getWindow(0, this.window).getDefaultPositionUs();
        long j2 = clippingConfiguration.relativeToDefaultPosition ? -defaultPositionUs : 0L;
        MediaItem.ClippingConfiguration clippingConfiguration2 = this.config;
        if (true != clippingConfiguration2.relativeToDefaultPosition) {
            defaultPositionUs = 0;
        }
        long j3 = this.periodStartUs;
        long j4 = clippingConfiguration2.startPositionUs;
        long j5 = j3 + (((j2 + defaultPositionUs) + j4) - clippingConfiguration.startPositionUs);
        this.periodStartUs = j5;
        long j6 = clippingConfiguration2.endPositionUs;
        this.periodEndUs = j6 != Long.MIN_VALUE ? (j5 + j6) - j4 : Long.MIN_VALUE;
        int size = this.mediaPeriods.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mediaPeriods.get(i2).updateClipping(this.periodStartUs, this.periodEndUs);
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        if (this.mediaSource.canUpdateMediaItem(mediaItem)) {
            return this.enableClippingInMediaPeriod || getMediaItem().clippingConfiguration.equals(mediaItem.clippingConfiguration);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j2), !this.config.startsAtKeyFrame, this.periodStartUs, this.periodEndUs, this.enableClippingInMediaPeriod);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        an.u(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.config.relativeToLiveWindow) {
            return;
        }
        ClippingTimeline clippingTimeline = this.clippingTimeline;
        an.B(clippingTimeline);
        refreshClippedTimeline(clippingTimeline.timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        ClippingTimeline clippingTimeline;
        if (this.enableClippingInMediaPeriod) {
            MediaItem.ClippingConfiguration clippingConfiguration = this.config;
            this.config = mediaItem.clippingConfiguration;
            if (this.clippingTimeline != null && shouldKeepWindowFixed()) {
                updatePeriodClippingToNewConfig(clippingConfiguration);
            }
        }
        ClippingTimeline clippingTimeline2 = this.clippingTimeline;
        super.updateMediaItem(mediaItem);
        if (this.enableClippingInMediaPeriod && (clippingTimeline = this.clippingTimeline) != null && clippingTimeline == clippingTimeline2) {
            refreshClippedTimeline(clippingTimeline.timeline);
        }
    }

    /* compiled from: WazeSource */
    public final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i2, long j2, long j3) {
            super("Illegal clipping: ".concat(getReasonDescription(i2, j2, j3)));
            this.reason = i2;
        }

        private static String getReasonDescription(int i2, long j2, long j3) {
            if (i2 == 0) {
                return "invalid period count";
            }
            boolean z = true;
            if (i2 == 1) {
                return "not seekable to start";
            }
            if (i2 != 2) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            if (j2 == C.TIME_UNSET) {
                z = false;
            } else if (j3 == C.TIME_UNSET) {
                j3 = -9223372036854775807L;
                z = false;
            }
            an.u(z);
            return "start exceeds end. Start time: " + j2 + ", End time: " + j3;
        }

        public IllegalClippingException(int i2) {
            this(i2, C.TIME_UNSET, C.TIME_UNSET);
        }
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j2) {
        Builder builder = new Builder(mediaSource);
        builder.setEndPositionUs(j2);
        builder.setRelativeToDefaultPosition(true);
        this(builder);
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3) {
        Builder builder = new Builder(mediaSource);
        builder.setStartPositionUs(j2);
        builder.setEndPositionUs(j3);
        this(builder);
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3, boolean z, boolean z2, boolean z3) {
        Builder builder = new Builder(mediaSource);
        builder.setStartPositionUs(j2);
        builder.setEndPositionUs(j3);
        builder.setEnableInitialDiscontinuity(z);
        builder.setAllowDynamicClippingUpdates(z2);
        builder.setRelativeToDefaultPosition(z3);
        this(builder);
    }
}
