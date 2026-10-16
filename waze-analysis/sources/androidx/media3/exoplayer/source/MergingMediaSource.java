package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import com.google.d.d.dw;
import com.google.d.d.eb;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM;
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final Map<Object, Long> clippedDurationsUs;
    private final dw<Object, ClippingMediaPeriod> clippedMediaPeriods;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private boolean enableClippingInMediaPeriod;
    private final List<List<MediaPeriodAndId>> mediaPeriods;
    private final MediaSource[] mediaSources;
    private IllegalMergeException mergeError;
    private final ArrayList<MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final Timeline[] timelines;

    /* compiled from: WazeSource */
    final class ClippedTimeline extends ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int windowCount = timeline.getWindowCount();
            this.windowDurationsUs = new long[timeline.getWindowCount()];
            Timeline.Window window = new Timeline.Window();
            for (int i2 = 0; i2 < windowCount; i2++) {
                this.windowDurationsUs[i2] = timeline.getWindow(i2, window).durationUs;
            }
            int periodCount = timeline.getPeriodCount();
            this.periodDurationsUs = new long[periodCount];
            Timeline.Period period = new Timeline.Period();
            for (int i3 = 0; i3 < periodCount; i3++) {
                timeline.getPeriod(i3, period, true);
                Long l2 = map.get(period.uid);
                an.B(l2);
                long jLongValue = l2.longValue();
                long[] jArr = this.periodDurationsUs;
                jLongValue = jLongValue == Long.MIN_VALUE ? period.durationUs : jLongValue;
                jArr[i3] = jLongValue;
                long j2 = period.durationUs;
                if (j2 != C.TIME_UNSET) {
                    long[] jArr2 = this.windowDurationsUs;
                    int i4 = period.windowIndex;
                    jArr2[i4] = jArr2[i4] - (j2 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            super.getPeriod(i2, period, z);
            period.durationUs = this.periodDurationsUs[i2];
            return period;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.common.Timeline.Window getWindow(int r3, androidx.media3.common.Timeline.Window r4, long r5) {
            /*
                r2 = this;
                super.getWindow(r3, r4, r5)
                long[] r2 = r2.windowDurationsUs
                r5 = r2[r3]
                r4.durationUs = r5
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r0 == 0) goto L1e
                long r0 = r4.defaultPositionUs
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L19
                goto L1e
            L19:
                long r2 = java.lang.Math.min(r0, r5)
                goto L20
            L1e:
                long r2 = r4.defaultPositionUs
            L20:
                r4.defaultPositionUs = r2
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.MergingMediaSource.ClippedTimeline.getWindow(int, androidx.media3.common.Timeline$Window, long):androidx.media3.common.Timeline$Window");
        }
    }

    /* compiled from: WazeSource */
    public final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i2) {
            this.reason = i2;
        }
    }

    /* compiled from: WazeSource */
    final class MediaPeriodAndId {
        private final MediaPeriod mediaPeriod;
        private final MediaSource.MediaPeriodId mediaPeriodId;

        private MediaPeriodAndId(MediaSource.MediaPeriodId mediaPeriodId, MediaPeriod mediaPeriod) {
            this.mediaPeriodId = mediaPeriodId;
            this.mediaPeriod = mediaPeriod;
        }
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setMediaId("MergingMediaSource");
        PLACEHOLDER_MEDIA_ITEM = builder.build();
    }

    public MergingMediaSource(boolean z, boolean z2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSourceArr) {
        this.adjustPeriodTimeOffsets = z;
        this.clipDurations = z2;
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
        this.mediaPeriods = new ArrayList(mediaSourceArr.length);
        int i2 = 0;
        while (true) {
            int length = mediaSourceArr.length;
            if (i2 >= length) {
                this.timelines = new Timeline[length];
                this.periodTimeOffsetsUs = new long[0][];
                this.clippedDurationsUs = new HashMap();
                this.clippedMediaPeriods = eb.a().b().c();
                return;
            }
            this.mediaPeriods.add(new ArrayList());
            i2++;
        }
    }

    private void computePeriodTimeOffsets() {
        Timeline.Period period = new Timeline.Period();
        for (int i2 = 0; i2 < this.periodCount; i2++) {
            long j2 = -this.timelines[0].getPeriod(i2, period).getPositionInWindowUs();
            int i3 = 1;
            while (true) {
                Timeline[] timelineArr = this.timelines;
                if (i3 < timelineArr.length) {
                    this.periodTimeOffsetsUs[i2][i3] = j2 - (-timelineArr[i3].getPeriod(i2, period).getPositionInWindowUs());
                    i3++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        Timeline[] timelineArr;
        Timeline.Period period = new Timeline.Period();
        for (int i2 = 0; i2 < this.periodCount; i2++) {
            int i3 = 0;
            long j2 = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.timelines;
                if (i3 >= timelineArr.length) {
                    break;
                }
                long durationUs = timelineArr[i3].getPeriod(i2, period).getDurationUs();
                if (durationUs != C.TIME_UNSET) {
                    long j3 = durationUs + this.periodTimeOffsetsUs[i2][i3];
                    if (j2 == Long.MIN_VALUE || j3 < j2) {
                        j2 = j3;
                    }
                }
                i3++;
            }
            Object uidOfPeriod = timelineArr[0].getUidOfPeriod(i2);
            this.clippedDurationsUs.put(uidOfPeriod, Long.valueOf(j2));
            Iterator it = this.clippedMediaPeriods.g(uidOfPeriod).iterator();
            while (it.hasNext()) {
                ((ClippingMediaPeriod) it.next()).updateClipping(0L, j2);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 && mediaSourceArr[0].canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        int length = this.mediaSources.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int indexOfPeriod = this.timelines[0].getIndexOfPeriod(mediaPeriodId.periodUid);
        for (int i2 = 0; i2 < length; i2++) {
            MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(this.timelines[i2].getUidOfPeriod(indexOfPeriod));
            mediaPeriodArr[i2] = this.mediaSources[i2].createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j2 - this.periodTimeOffsetsUs[indexOfPeriod][i2]);
            this.mediaPeriods.get(i2).add(new MediaPeriodAndId(mediaPeriodIdCopyWithPeriodUid, mediaPeriodArr[i2]));
        }
        MergingMediaPeriod mergingMediaPeriod = new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
        if (!this.clipDurations) {
            return mergingMediaPeriod;
        }
        Long l2 = this.clippedDurationsUs.get(mediaPeriodId.periodUid);
        an.B(l2);
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(mergingMediaPeriod, false, 0L, l2.longValue(), this.enableClippingInMediaPeriod);
        this.clippedMediaPeriods.y(mediaPeriodId.periodUid, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : PLACEHOLDER_MEDIA_ITEM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        List<MediaPeriodAndId> list = this.mediaPeriods.get(num.intValue());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).mediaPeriodId.equals(mediaPeriodId)) {
                return this.mediaPeriods.get(0).get(i2).mediaPeriodId;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        int periodCount;
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            periodCount = timeline.getPeriodCount();
            this.periodCount = periodCount;
        } else {
            int periodCount2 = timeline.getPeriodCount();
            int i2 = this.periodCount;
            if (periodCount2 != i2) {
                this.mergeError = new IllegalMergeException(0);
                return;
            }
            periodCount = i2;
        }
        if (this.periodTimeOffsetsUs.length == 0) {
            this.periodTimeOffsetsUs = (long[][]) Array.newInstance((Class<?>) Long.TYPE, periodCount, this.timelines.length);
        }
        this.pendingTimelineSources.remove(mediaSource);
        this.timelines[num.intValue()] = timeline;
        if (this.pendingTimelineSources.isEmpty()) {
            if (this.adjustPeriodTimeOffsets) {
                computePeriodTimeOffsets();
            }
            Timeline clippedTimeline = this.timelines[0];
            if (this.clipDurations) {
                updateClippedDuration();
                clippedTimeline = new ClippedTimeline(clippedTimeline, this.clippedDurationsUs);
            }
            refreshSourceInfo(clippedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        int i2 = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.mediaSources;
            if (i2 >= mediaSourceArr.length) {
                return;
            }
            prepareChildSource(Integer.valueOf(i2), mediaSourceArr[i2]);
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        if (this.clipDurations) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            Iterator it = this.clippedMediaPeriods.z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((ClippingMediaPeriod) entry.getValue()).equals(clippingMediaPeriod)) {
                    this.clippedMediaPeriods.G(entry.getKey(), entry.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        for (int i2 = 0; i2 < this.mediaSources.length; i2++) {
            List<MediaPeriodAndId> list = this.mediaPeriods.get(i2);
            MediaPeriod childPeriod = mergingMediaPeriod.getChildPeriod(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                if (list.get(i3).mediaPeriod.equals(childPeriod)) {
                    list.remove(i3);
                    break;
                }
                i3++;
            }
            this.mediaSources[i2].releasePeriod(mergingMediaPeriod.getChildPeriod(i2));
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.timelines, (Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    public void setEnableClippingInMediaPeriod(boolean z) {
        this.enableClippingInMediaPeriod = z;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSources[0].updateMediaItem(mediaItem);
    }

    public MergingMediaSource(boolean z, boolean z2, MediaSource... mediaSourceArr) {
        this(z, z2, new DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    public MergingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, false, mediaSourceArr);
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }
}
