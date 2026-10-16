package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final bn<MediaSourceHolder> mediaSourceHolders;
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    /* compiled from: WazeSource */
    final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final bn<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final Object manifest;
        private final MediaItem mediaItem;
        private final bn<Long> periodOffsetsInWindowUs;
        private final bn<Timeline> timelines;

        public ConcatenatedTimeline(MediaItem mediaItem, bn<Timeline> bnVar, bn<Integer> bnVar2, bn<Long> bnVar3, boolean z, boolean z2, long j2, long j3, Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = bnVar;
            this.firstPeriodIndices = bnVar2;
            this.periodOffsetsInWindowUs = bnVar3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.durationUs = j2;
            this.defaultPositionUs = j3;
            this.manifest = obj;
        }

        private int getChildIndexByPeriodIndex(int i2) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i2 + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i2) {
            if (period.durationUs == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            return (i2 == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : this.periodOffsetsInWindowUs.get(i2 + 1).longValue()) - this.periodOffsetsInWindowUs.get(i2).longValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if ((obj instanceof Pair) && (((Pair) obj).first instanceof Integer)) {
                int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
                int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
                if (indexOfPeriod != -1) {
                    return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
                }
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            bn<Integer> bnVar = this.firstPeriodIndices;
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i2);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i2 - bnVar.get(childIndexByPeriodIndex).intValue(), period, z);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i2).longValue();
            period.durationUs = getPeriodDurationUs(period, i2);
            if (z) {
                Object obj = period.uid;
                an.B(obj);
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, obj);
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            bn<Timeline> bnVar = this.timelines;
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = bnVar.get(childIndex);
            int iIntValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(iIntValue).longValue();
            period.durationUs = getPeriodDurationUs(period, iIntValue);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i2) {
            bn<Integer> bnVar = this.firstPeriodIndices;
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i2);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i2 - bnVar.get(childIndexByPeriodIndex).intValue()));
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    /* compiled from: WazeSource */
    final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i2, long j2) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i2;
            this.initialPlaceholderDurationUs = j2;
        }
    }

    public static /* synthetic */ boolean $r8$lambda$FlDPCeXDDR6TtzTov4moj0L9Su8(ConcatenatingMediaSource2 concatenatingMediaSource2, Message message) {
        concatenatingMediaSource2.handleMessage(message);
        return true;
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, bn<MediaSourceHolder> bnVar) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = bnVar;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    private void disableUnusedMediaSources() {
        for (int i2 = 0; i2 < this.mediaSourceHolders.size(); i2++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i2);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j2, int i2) {
        return (int) (j2 % i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j2, int i2, int i3) {
        return (j2 * i2) + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i2, Object obj) {
        return Pair.create(Integer.valueOf(i2), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j2, int i2) {
        return j2 / i2;
    }

    private boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private androidx.media3.exoplayer.source.ConcatenatingMediaSource2.ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ConcatenatingMediaSource2.maybeCreateConcatenatedTimeline():androidx.media3.exoplayer.source.ConcatenatingMediaSource2$ConcatenatedTimeline");
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        Handler handler = this.playbackThreadHandler;
        an.B(handler);
        handler.obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline concatenatedTimelineMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (concatenatedTimelineMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(concatenatedTimelineMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        long jLongValue;
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        bn<MediaSourceHolder> bnVar = this.mediaSourceHolders;
        long j3 = mediaPeriodId.windowSequenceNumber;
        int size = bnVar.size();
        int i2 = mediaSourceHolder.index;
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodIdCopyWithPeriodUid.copyWithWindowSequenceNumber(getChildWindowSequenceNumber(j3, size, i2));
        enableChildSource(Integer.valueOf(i2));
        mediaSourceHolder.activeMediaPeriods++;
        if (mediaPeriodId.isAd()) {
            jLongValue = 0;
        } else {
            Long l2 = mediaSourceHolder.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid);
            an.B(l2);
            jLongValue = l2.longValue();
        }
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j2 - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Long l2;
        return (j2 == C.TIME_UNSET || mediaPeriodId == null || mediaPeriodId.isAd() || (l2 = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j2 : j2 + Util.usToMs(l2.longValue());
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ int getWindowIndexForChildWindowIndex(Integer num, int i2) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.ConcatenatingMediaSource2$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ConcatenatingMediaSource2.$r8$lambda$FlDPCeXDDR6TtzTov4moj0L9Su8(this.f$0, message);
                return true;
            }
        });
        for (int i2 = 0; i2 < this.mediaSourceHolders.size(); i2++) {
            prepareChildSource(Integer.valueOf(i2), this.mediaSourceHolders.get(i2).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        an.B(mediaSourceHolderRemove);
        mediaSourceHolderRemove.mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        mediaSourceHolderRemove.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    /* renamed from: getWindowIndexForChildWindowIndex, reason: avoid collision after fix types in other method */
    protected int getWindowIndexForChildWindowIndex2(Integer num, int i2) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private int index;
        private MediaItem mediaItem;
        private MediaSource.Factory mediaSourceFactory;
        private final bi<MediaSourceHolder> mediaSourceHoldersBuilder;

        public Builder() {
            int i2 = bn.f7456d;
            this.mediaSourceHoldersBuilder = new bi<>();
        }

        public Builder add(MediaItem mediaItem, long j2) {
            an.B(mediaItem);
            if (j2 == C.TIME_UNSET) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                j2 = clippingConfiguration.endPositionMs != Long.MIN_VALUE ? Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs) : -9223372036854775807L;
            }
            an.C(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            add(this.mediaSourceFactory.createMediaSource(mediaItem), j2);
            return this;
        }

        public ConcatenatingMediaSource2 build() {
            an.m(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.f());
        }

        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            an.B(factory);
            this.mediaSourceFactory = factory;
            return this;
        }

        public Builder useDefaultMediaSourceFactory(Context context) {
            setMediaSourceFactory(new DefaultMediaSourceFactory(context));
            return this;
        }

        public Builder add(MediaItem mediaItem) {
            add(mediaItem, C.TIME_UNSET);
            return this;
        }

        public Builder add(MediaSource mediaSource) {
            add(mediaSource, C.TIME_UNSET);
            return this;
        }

        public Builder add(MediaSource mediaSource, long j2) {
            an.B(mediaSource);
            boolean z = true;
            if ((mediaSource instanceof ProgressiveMediaSource) && j2 == C.TIME_UNSET) {
                z = false;
                j2 = -9223372036854775807L;
            }
            an.v(z, "Progressive media source must define an initial placeholder duration.");
            bi<MediaSourceHolder> biVar = this.mediaSourceHoldersBuilder;
            int i2 = this.index;
            this.index = i2 + 1;
            biVar.g(new MediaSourceHolder(mediaSource, i2, Util.msToUs(j2)));
            return this;
        }
    }
}
