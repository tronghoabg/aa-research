package androidx.media3.exoplayer.source;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MaskingMediaSource extends WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final Timeline.Period period;
    private MaskingTimeline timeline;
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final Timeline.Window window;

    /* compiled from: WazeSource */
    final class MaskingTimeline extends ForwardingTimeline {
        public static final Object MASKING_EXTERNAL_PERIOD_UID = new Object();
        private final Object replacedInternalPeriodUid;
        private final Object replacedInternalWindowUid;

        private MaskingTimeline(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }

        public static MaskingTimeline createWithPlaceholderTimeline(MediaItem mediaItem) {
            return new MaskingTimeline(new PlaceholderTimeline(mediaItem), Timeline.Window.SINGLE_WINDOW_UID, MASKING_EXTERNAL_PERIOD_UID);
        }

        public static MaskingTimeline createWithRealTimeline(Timeline timeline, Object obj, Object obj2) {
            return new MaskingTimeline(timeline, obj, obj2);
        }

        public MaskingTimeline cloneWithUpdatedTimeline(Timeline timeline) {
            return new MaskingTimeline(timeline, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            if (MASKING_EXTERNAL_PERIOD_UID.equals(obj) && (obj2 = this.replacedInternalPeriodUid) != null) {
                obj = obj2;
            }
            return this.timeline.getIndexOfPeriod(obj);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(i2, period, z);
            if (Objects.equals(period.uid, this.replacedInternalPeriodUid) && z) {
                period.uid = MASKING_EXTERNAL_PERIOD_UID;
            }
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i2) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i2);
            return Objects.equals(uidOfPeriod, this.replacedInternalPeriodUid) ? MASKING_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            this.timeline.getWindow(i2, window, j2);
            if (Objects.equals(window.uid, this.replacedInternalWindowUid)) {
                window.uid = Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }
    }

    /* compiled from: WazeSource */
    public final class PlaceholderTimeline extends Timeline {
        private final MediaItem mediaItem;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            return obj == MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            period.set(z ? 0 : null, z ? MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID : null, 0, C.TIME_UNSET, 0L, AdPlaybackState.NONE, true);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i2) {
            return MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z) {
        super(mediaSource);
        boolean z2 = false;
        if (z && mediaSource.isSingleWindow()) {
            z2 = true;
        }
        this.useLazyPreparation = z2;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline == null) {
            this.timeline = MaskingTimeline.createWithPlaceholderTimeline(mediaSource.getMediaItem());
        } else {
            this.timeline = MaskingTimeline.createWithRealTimeline(initialTimeline, null, null);
            this.hasRealTimeline = true;
        }
    }

    private Object getExternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !this.timeline.replacedInternalPeriodUid.equals(obj)) ? obj : MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !obj.equals(MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID)) ? obj : this.timeline.replacedInternalPeriodUid;
    }

    private boolean setPreparePositionOverrideToUnpreparedMaskingPeriod(long j2) {
        MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.id.periodUid);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j3 = this.timeline.getPeriod(indexOfPeriod, this.period).durationUs;
        if (j3 != C.TIME_UNSET && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j2);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
            return maskingMediaPeriod;
        }
        this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
        if (!this.hasStartedPreparing) {
            this.hasStartedPreparing = true;
            prepareChildSource();
        }
        return maskingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onChildSourceInfoRefreshed(androidx.media3.common.Timeline r14) {
        /*
            r13 = this;
            boolean r2 = r13.isPrepared
            r7 = 0
            if (r2 == 0) goto L1a
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r2 = r13.timeline
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r1 = r2.cloneWithUpdatedTimeline(r14)
            r13.timeline = r1
            androidx.media3.exoplayer.source.MaskingMediaPeriod r1 = r13.unpreparedMaskingMediaPeriod
            if (r1 == 0) goto Lad
            long r1 = r1.getPreparePositionOverrideUs()
            r13.setPreparePositionOverrideToUnpreparedMaskingPeriod(r1)
            goto Lad
        L1a:
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L37
            boolean r2 = r13.hasRealTimeline
            if (r2 == 0) goto L2b
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r2 = r13.timeline
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r1 = r2.cloneWithUpdatedTimeline(r14)
            goto L33
        L2b:
            java.lang.Object r2 = androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID
            java.lang.Object r3 = androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r1 = androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r14, r2, r3)
        L33:
            r13.timeline = r1
            goto Lad
        L37:
            androidx.media3.common.Timeline$Window r2 = r13.window
            r3 = 0
            r14.getWindow(r3, r2)
            androidx.media3.common.Timeline$Window r2 = r13.window
            long r4 = r2.getDefaultPositionUs()
            java.lang.Object r8 = r2.uid
            androidx.media3.exoplayer.source.MaskingMediaPeriod r2 = r13.unpreparedMaskingMediaPeriod
            if (r2 == 0) goto L71
            long r9 = r2.getPreparePositionUs()
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r6 = r13.timeline
            androidx.media3.common.Timeline$Period r11 = r13.period
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r2 = r2.id
            java.lang.Object r2 = r2.periodUid
            r6.getPeriodByUid(r2, r11)
            androidx.media3.common.Timeline$Period r2 = r13.period
            long r11 = r2.getPositionInWindowUs()
            long r11 = r11 + r9
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r2 = r13.timeline
            androidx.media3.common.Timeline$Window r6 = r13.window
            androidx.media3.common.Timeline$Window r2 = r2.getWindow(r3, r6)
            long r2 = r2.getDefaultPositionUs()
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L71
            r5 = r11
            goto L72
        L71:
            r5 = r4
        L72:
            androidx.media3.common.Timeline$Window r2 = r13.window
            androidx.media3.common.Timeline$Period r3 = r13.period
            r4 = 0
            r1 = r14
            android.util.Pair r2 = r1.getPeriodPositionUs(r2, r3, r4, r5)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r13.hasRealTimeline
            if (r2 == 0) goto L91
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r2 = r13.timeline
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r1 = r2.cloneWithUpdatedTimeline(r14)
            goto L95
        L91:
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r1 = androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r14, r8, r3)
        L95:
            r13.timeline = r1
            androidx.media3.exoplayer.source.MaskingMediaPeriod r1 = r13.unpreparedMaskingMediaPeriod
            if (r1 == 0) goto Lad
            boolean r2 = r13.setPreparePositionOverrideToUnpreparedMaskingPeriod(r4)
            if (r2 == 0) goto Lad
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r1 = r1.id
            java.lang.Object r2 = r1.periodUid
            java.lang.Object r2 = r13.getInternalPeriodUid(r2)
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r7 = r1.copyWithPeriodUid(r2)
        Lad:
            r1 = 1
            r13.hasRealTimeline = r1
            r13.isPrepared = r1
            androidx.media3.exoplayer.source.MaskingMediaSource$MaskingTimeline r1 = r13.timeline
            r13.refreshSourceInfo(r1)
            if (r7 == 0) goto Lc4
            androidx.media3.exoplayer.source.MaskingMediaPeriod r0 = r13.unpreparedMaskingMediaPeriod
            com.google.d.b.an.B(r0)
            r1 = r0
            androidx.media3.exoplayer.source.MaskingMediaPeriod r1 = (androidx.media3.exoplayer.source.MaskingMediaPeriod) r1
            r0.createPeriod(r7)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.MaskingMediaSource.onChildSourceInfoRefreshed(androidx.media3.common.Timeline):void");
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        if (this.hasRealTimeline) {
            MaskingTimeline maskingTimeline = this.timeline;
            this.timeline = maskingTimeline.cloneWithUpdatedTimeline(TimelineWithUpdatedMediaItem.create(maskingTimeline.timeline, mediaItem));
        } else {
            this.timeline = MaskingTimeline.createWithPlaceholderTimeline(mediaItem);
        }
        this.mediaSource.updateMediaItem(mediaItem);
    }
}
