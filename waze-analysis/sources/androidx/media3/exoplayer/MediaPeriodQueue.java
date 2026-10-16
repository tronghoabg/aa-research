package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private static final long MAX_EFFECTIVE_START_POSITION_DIFF_WITH_PROJECTION_US = 5000000;
    static final int UPDATE_PERIOD_QUEUE_ALTERED_PREWARMING_PERIOD = 2;
    static final int UPDATE_PERIOD_QUEUE_ALTERED_READING_PERIOD = 1;
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper analyticsCollectorHandler;
    private int length;
    private MediaPeriodHolder loading;
    private final MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private MediaPeriodHolder playing;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private MediaPeriodHolder preloading;
    private final MediaPeriodHolder[] prewarmingPeriods;
    private final MediaPeriodHolder[] readingPeriods;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();
    private List<MediaPeriodHolder> preloadPriorityList = new ArrayList();

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface UpdatePeriodQueueResult {
    }

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, MediaPeriodHolder.Factory factory, ExoPlayer.PreloadConfiguration preloadConfiguration, int i2) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
        this.readingPeriods = new MediaPeriodHolder[i2];
        this.prewarmingPeriods = new MediaPeriodHolder[i2];
    }

    static boolean areDurationsCompatible(long j2, long j3) {
        return j2 == C.TIME_UNSET || j2 == j3;
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        if (!mediaPeriodInfo.id.equals(mediaPeriodInfo2.id)) {
            return false;
        }
        long j2 = mediaPeriodInfo.startPositionUs;
        long j3 = mediaPeriodInfo2.startPositionUs;
        if (j2 == j3) {
            return true;
        }
        long j4 = mediaPeriodInfo.liveStreamStartPositionProjectionUs;
        if (j4 != C.TIME_UNSET) {
            long j5 = mediaPeriodInfo2.liveStreamStartPositionProjectionUs;
            if (j5 != C.TIME_UNSET) {
                if (Math.abs((j3 - j5) - (j2 - j4)) < MAX_EFFECTIVE_START_POSITION_DIFF_WITH_PROJECTION_US) {
                    return true;
                }
            }
        }
        return false;
    }

    private Pair<Object, Long> getDefaultPeriodPositionOfNextWindow(Timeline timeline, Object obj) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, C.TIME_UNSET);
        }
        return null;
    }

    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs, C.TIME_UNSET);
    }

    private MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j2) {
        long j3;
        long j4;
        long j5;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i2 = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        Object obj = this.period.uid;
        an.B(obj);
        long j6 = mediaPeriodInfo.id.windowSequenceNumber;
        if (timeline.getWindow(i2, this.window).firstPeriodIndex == nextPeriodIndex) {
            Timeline.Period period = this.period;
            long jMax = shouldUseLiveStartPositionProjection(timeline, period.windowIndex, period.durationUs, this.window) ? Math.max(0L, j2) : -9223372036854775807L;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i2, C.TIME_UNSET, jMax);
            if (periodPositionUs == null) {
                return null;
            }
            obj = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next == null || !next.uid.equals(obj)) {
                long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
                if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
                j6 = jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            } else {
                j6 = next.info.id.windowSequenceNumber;
            }
            j4 = jLongValue;
            j5 = jMax;
            j3 = -9223372036854775807L;
        } else {
            j3 = 0;
            j4 = 0;
            j5 = -9223372036854775807L;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j4, j6, this.window, this.period);
        if (j3 != C.TIME_UNSET && mediaPeriodInfo.requestedContentPositionUs != C.TIME_UNSET) {
            boolean zHasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.id.periodUid, timeline);
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd()) {
                if (zHasServerSideInsertedAds) {
                    j3 = mediaPeriodInfo.requestedContentPositionUs;
                }
            } else if (zHasServerSideInsertedAds) {
                j4 = mediaPeriodInfo.requestedContentPositionUs;
            }
        }
        return getMediaPeriodInfo(timeline, mediaPeriodIdResolveMediaPeriodIdForAds, j3, j4, j5);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j2) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j2;
        return mediaPeriodInfo.isLastInTimelinePeriod ? getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, mediaPeriodHolder, rendererOffset);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j2) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            int i2 = mediaPeriodId.nextAdGroupIndex;
            if (i2 != -1 && this.period.isLivePostrollPlaceholder(i2)) {
                return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, j2);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
            boolean z = false;
            if (this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3) {
                z = true;
            }
            if (firstAdIndexToPlay != this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) && !z) {
                return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), C.TIME_UNSET, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        int i3 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i3);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i3, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i3, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long jLongValue = mediaPeriodInfo.requestedContentPositionUs;
        long jMax = C.TIME_UNSET;
        if (jLongValue == C.TIME_UNSET) {
            Timeline.Period period = this.period;
            if (shouldUseLiveStartPositionProjection(timeline, period.windowIndex, period.durationUs, this.window)) {
                jMax = Math.max(0L, j2);
            }
            long j3 = jMax;
            Timeline.Window window = this.window;
            Timeline.Period period2 = this.period;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period2, period2.windowIndex, C.TIME_UNSET, j3);
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
            jMax = j3;
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), jMax, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
    }

    private long getMediaPeriodDuration(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            return this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }
        int i2 = mediaPeriodId.nextAdGroupIndex;
        Timeline.Period period = this.period;
        if (i2 == -1) {
            return period.getDurationUs();
        }
        long adGroupTimeUs = period.getAdGroupTimeUs(i2);
        return adGroupTimeUs == Long.MIN_VALUE ? this.period.getDurationUs() : adGroupTimeUs;
    }

    private MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return mediaPeriodId.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j2, mediaPeriodId.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j3, j4, j2, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i2, int i3, long j2, long j3) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i2, i3, j3);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i3 == this.period.getFirstAdIndexToPlay(i2) ? this.period.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        if (adDurationUs != C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, (-1) + adDurationUs);
        }
        return new MediaPeriodInfo(mediaPeriodId, adResumePositionUs, C.TIME_UNSET, j2, adDurationUs, zIsServerSideInsertedAdGroup, false, false, false);
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(Timeline timeline, Object obj, long j2, long j3, long j4, long j5) {
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j2);
        if (adGroupIndexAfterPositionUs != -1 && this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs)) {
            long adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
            Timeline.Period period = this.period;
            if (adGroupTimeUs == period.durationUs && period.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                adGroupIndexAfterPositionUs = -1;
            }
        }
        boolean z = false;
        if (adGroupIndexAfterPositionUs != -1 && this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) && !this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs)) {
            z = true;
        }
        boolean z2 = z;
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j5, adGroupIndexAfterPositionUs);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        long mediaPeriodDuration = getMediaPeriodDuration(timeline, mediaPeriodId);
        return new MediaPeriodInfo(mediaPeriodId, (mediaPeriodDuration == C.TIME_UNSET || j2 < mediaPeriodDuration) ? j2 : Math.max(0L, mediaPeriodDuration - 1), j3, j4, mediaPeriodDuration, z2, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(Timeline timeline, Object obj, long j2, long j3) {
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j2, j3, this.window, this.period);
        return mediaPeriodIdResolveMediaPeriodIdForAds.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, mediaPeriodIdResolveMediaPeriodIdForAds.adGroupIndex, mediaPeriodIdResolveMediaPeriodIdForAds.adIndexInAdGroup, j2, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, j2, C.TIME_UNSET, C.TIME_UNSET, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object obj, int i2) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i2);
        Timeline.Period period = this.period;
        return adGroupTimeUs == Long.MIN_VALUE ? period.durationUs : adGroupTimeUs + period.getContentResumeOffsetUs(i2);
    }

    private boolean hasAnyRendererReadBeyondDuration(MediaPeriodHolder[] mediaPeriodHolderArr, long[] jArr, MediaPeriodHolder mediaPeriodHolder, long j2) {
        for (int i2 = 0; i2 < mediaPeriodHolderArr.length; i2++) {
            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolderArr[i2];
            if (mediaPeriodHolder2 != null) {
                if (isPeriodAfter(mediaPeriodHolder2, mediaPeriodHolder)) {
                    return true;
                }
                if (mediaPeriodHolder2.equals(mediaPeriodHolder)) {
                    long j3 = jArr[i2];
                    if (j3 == Long.MIN_VALUE || j3 >= j2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private boolean hasServerSideInsertedAds(Object obj, Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        if (adGroupCount <= 0 || !this.period.isServerSideInsertedAdGroup(removedAdGroupCount)) {
            return false;
        }
        return adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE;
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z;
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private boolean isPeriodAfter(MediaPeriodHolder mediaPeriodHolder, MediaPeriodHolder mediaPeriodHolder2) {
        for (MediaPeriodHolder next = mediaPeriodHolder2.getNext(); next != null; next = next.getNext()) {
            if (next.equals(mediaPeriodHolder)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean isSkippableAdPeriod(androidx.media3.common.Timeline.Period r8) {
        /*
            int r0 = r8.getAdGroupCount()
            r1 = 0
            if (r0 == 0) goto L4a
            r2 = 1
            if (r0 != r2) goto L11
            boolean r0 = r8.isLivePostrollPlaceholder(r1)
            if (r0 != 0) goto L4a
            r0 = r2
        L11:
            int r3 = r8.getRemovedAdGroupCount()
            boolean r3 = r8.isServerSideInsertedAdGroup(r3)
            if (r3 == 0) goto L4a
            r3 = 0
            int r5 = r8.getAdGroupIndexForPositionUs(r3)
            r6 = -1
            if (r5 == r6) goto L25
            goto L4a
        L25:
            long r5 = r8.durationUs
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L2c
            return r2
        L2c:
            int r5 = r0 + (-1)
            boolean r5 = r8.isLivePostrollPlaceholder(r5)
            if (r2 == r5) goto L36
            r5 = r2
            goto L37
        L36:
            r5 = 2
        L37:
            int r0 = r0 - r5
            r5 = r1
        L39:
            if (r5 > r0) goto L43
            long r6 = r8.getContentResumeOffsetUs(r5)
            long r3 = r3 + r6
            int r5 = r5 + 1
            goto L39
        L43:
            long r5 = r8.durationUs
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L4a
            return r2
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaPeriodQueue.isSkippableAdPeriod(androidx.media3.common.Timeline$Period):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyQueueUpdate$0(bi biVar, MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(biVar.f(), mediaPeriodId);
    }

    private void notifyQueueUpdate() {
        MediaPeriodHolder mediaPeriodHolder;
        int i2 = bn.f7456d;
        final bi biVar = new bi();
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            biVar.g(next.info.id);
        }
        MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
        final MediaSource.MediaPeriodId mediaPeriodId = null;
        if (mediaPeriodHolderArr.length != 0 && (mediaPeriodHolder = mediaPeriodHolderArr[0]) != null) {
            mediaPeriodId = mediaPeriodHolder.info.id;
        }
        this.analyticsCollectorHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.MediaPeriodQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$notifyQueueUpdate$0(biVar, mediaPeriodId);
            }
        });
    }

    private void releaseAndResetPreloadPriorityList(List<MediaPeriodHolder> list) {
        for (int i2 = 0; i2 < this.preloadPriorityList.size(); i2++) {
            this.preloadPriorityList.get(i2).release();
        }
        this.preloadPriorityList = list;
        this.preloading = null;
        maybeUpdatePreloadMediaPeriodHolder();
    }

    private MediaPeriodHolder removePreloadedMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        for (int i2 = 0; i2 < this.preloadPriorityList.size(); i2++) {
            if (this.preloadPriorityList.get(i2).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i2);
            }
        }
        return null;
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j2, long j3, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            obj = period.uid;
            an.B(obj);
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j2);
        return adGroupIndexForPositionUs == -1 ? new MediaSource.MediaPeriodId(obj, j3, period.getAdGroupIndexAfterPositionUs(j2)) : new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j3);
    }

    private long resolvePeriodUidToWindowSequenceNumber(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i2 = timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i2) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            if (next.uid.equals(obj)) {
                return next.info.id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder next2 = this.playing; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(next2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i2) {
                return next2.info.id.windowSequenceNumber;
            }
        }
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j2 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j2;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j2;
        }
        return j2;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i2 = 0; i2 < this.preloadPriorityList.size(); i2++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i2);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    private static boolean shouldUseLiveStartPositionProjection(Timeline timeline, int i2, long j2, Timeline.Window window) {
        if (j2 != C.TIME_UNSET) {
            return false;
        }
        timeline.getWindow(i2, window);
        return window.isDynamic && !window.isPlaceholder;
    }

    private int updateForPlaybackModeChange(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder next = this.playing;
        if (next == null) {
            return 0;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(next.uid);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (true) {
                an.B(next);
                if (next.getNext() == null || next.info.isLastInTimelinePeriod) {
                    break;
                }
                next = next.getNext();
            }
            MediaPeriodHolder next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || timeline2.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
            timeline = timeline2;
        }
        int iRemoveAfter = removeAfter(next);
        next.info = getUpdatedMediaPeriodInfo(timeline2, next.info);
        return iRemoveAfter;
    }

    private void updatePrewarmingMatchingPlayingPeriod() {
        an.B(this.playing);
        int i2 = 0;
        while (true) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.prewarmingPeriods;
            if (i2 >= mediaPeriodHolderArr.length) {
                return;
            }
            if (this.playing.equals(mediaPeriodHolderArr[i2])) {
                this.prewarmingPeriods[i2] = this.playing.getNext();
            }
            i2++;
        }
    }

    private void updateReadingMatchingPlayingPeriod() {
        an.B(this.playing);
        int i2 = 0;
        while (true) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
            if (i2 >= mediaPeriodHolderArr.length) {
                return;
            }
            if (this.playing.equals(mediaPeriodHolderArr[i2])) {
                this.readingPeriods[i2] = this.playing.getNext();
            }
            i2++;
        }
    }

    public MediaPeriodHolder advancePlayingPeriod() {
        if (this.playing == null) {
            return null;
        }
        updateReadingMatchingPlayingPeriod();
        updatePrewarmingMatchingPlayingPeriod();
        an.B(this.playing);
        this.playing.release();
        int i2 = this.length - 1;
        this.length = i2;
        if (i2 == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.info.id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public void advancePrewarmingPeriod(int i2) {
        MediaPeriodHolder mediaPeriodHolder = this.prewarmingPeriods[i2];
        an.B(mediaPeriodHolder);
        this.prewarmingPeriods[i2] = mediaPeriodHolder.getNext();
        notifyQueueUpdate();
    }

    public MediaPeriodHolder advanceReadingPeriod(int i2) {
        if (Objects.equals(this.prewarmingPeriods[i2], this.readingPeriods[i2])) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.prewarmingPeriods;
            MediaPeriodHolder mediaPeriodHolder = this.readingPeriods[i2];
            an.B(mediaPeriodHolder);
            mediaPeriodHolderArr[i2] = mediaPeriodHolder.getNext();
        }
        MediaPeriodHolder[] mediaPeriodHolderArr2 = this.readingPeriods;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolderArr2[i2];
        an.B(mediaPeriodHolder2);
        mediaPeriodHolderArr2[i2] = mediaPeriodHolder2.getNext();
        notifyQueueUpdate();
        MediaPeriodHolder mediaPeriodHolder3 = this.readingPeriods[i2];
        an.B(mediaPeriodHolder3);
        return mediaPeriodHolder3;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder next = this.playing;
        an.B(next);
        this.oldFrontPeriodUid = next.uid;
        this.oldFrontPeriodWindowSequenceNumber = next.info.id.windowSequenceNumber;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.playing = null;
        this.loading = null;
        Arrays.fill(this.readingPeriods, (Object) null);
        Arrays.fill(this.prewarmingPeriods, (Object) null);
        this.length = 0;
        notifyQueueUpdate();
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? INITIAL_RENDERER_POSITION_OFFSET_US : (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfo.startPositionUs;
        MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        } else {
            this.playing = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
            Arrays.fill(this.readingPeriods, mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
            Arrays.fill(this.prewarmingPeriods, mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
    }

    public MediaPeriodHolder getEarliestPrewarmingPeriod() {
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            for (MediaPeriodHolder mediaPeriodHolder : this.prewarmingPeriods) {
                if (next.equals(mediaPeriodHolder)) {
                    return next;
                }
            }
        }
        return null;
    }

    public MediaPeriodHolder getEarliestReadingPeriod() {
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            for (MediaPeriodHolder mediaPeriodHolder : this.readingPeriods) {
                if (next.equals(mediaPeriodHolder)) {
                    return next;
                }
            }
        }
        return null;
    }

    public MediaPeriodHolder getLatestReadingPeriod() {
        MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
        if (mediaPeriodHolderArr.length == 0) {
            return null;
        }
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodHolderArr[0];
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            MediaPeriodHolder[] mediaPeriodHolderArr2 = this.readingPeriods;
            int length = mediaPeriodHolderArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (next.equals(mediaPeriodHolderArr2[i2])) {
                    mediaPeriodHolder = next;
                    break;
                }
                i2++;
            }
        }
        return mediaPeriodHolder;
    }

    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public MediaPeriodInfo getNextMediaPeriodInfo(long j2, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder, j2);
    }

    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public MediaPeriodHolder getPreloadHolderByMediaPeriod(MediaPeriod mediaPeriod) {
        for (int i2 = 0; i2 < this.preloadPriorityList.size(); i2++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i2);
            if (mediaPeriodHolder.mediaPeriod == mediaPeriod) {
                return mediaPeriodHolder;
            }
        }
        return null;
    }

    public MediaPeriodHolder getPreloadingPeriod() {
        return this.preloading;
    }

    public MediaPeriodHolder getPrewarmingPeriod(int i2) {
        return this.prewarmingPeriods[i2];
    }

    public MediaPeriodHolder getReadingPeriod(int i2) {
        return this.readingPeriods[i2];
    }

    public MediaPeriodInfo getUpdatedMediaPeriodInfo(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        boolean z;
        boolean zIsServerSideInsertedAdGroup;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        long mediaPeriodDuration = getMediaPeriodDuration(timeline, mediaPeriodInfo.id);
        timeline.getPeriodByUid(mediaPeriodInfo.id.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        } else {
            int i2 = mediaPeriodId.nextAdGroupIndex;
            if (i2 == -1 || !this.period.isServerSideInsertedAdGroup(i2) || this.period.isLivePostrollPlaceholder(mediaPeriodId.nextAdGroupIndex)) {
                z = false;
                return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.liveStreamStartPositionProjectionUs, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodDuration, z, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
            }
            zIsServerSideInsertedAdGroup = true;
        }
        z = zIsServerSideInsertedAdGroup;
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.liveStreamStartPositionProjectionUs, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodDuration, z, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invalidatePreloadPool(androidx.media3.common.Timeline r15) {
        /*
            r14 = this;
            androidx.media3.exoplayer.ExoPlayer$PreloadConfiguration r0 = r14.preloadConfiguration
            long r0 = r0.targetPreloadDurationUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7e
            androidx.media3.exoplayer.MediaPeriodHolder r0 = r14.loading
            if (r0 != 0) goto L12
            goto L7e
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.media3.exoplayer.MediaPeriodInfo r2 = r0.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r2 = r2.id
            java.lang.Object r2 = r2.periodUid
            android.util.Pair r2 = r14.getDefaultPeriodPositionOfNextWindow(r15, r2)
            if (r2 == 0) goto L79
            androidx.media3.common.Timeline$Period r3 = r14.period
            java.lang.Object r4 = r2.first
            androidx.media3.common.Timeline$Period r3 = r15.getPeriodByUid(r4, r3)
            int r3 = r3.windowIndex
            androidx.media3.common.Timeline$Window r4 = r14.window
            androidx.media3.common.Timeline$Window r3 = r15.getWindow(r3, r4)
            boolean r3 = r3.isLive()
            if (r3 != 0) goto L79
            java.lang.Object r3 = r2.first
            long r3 = r14.resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(r3)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L4c
            long r3 = r14.nextWindowSequenceNumber
            r5 = 1
            long r5 = r5 + r3
            r14.nextWindowSequenceNumber = r5
        L4c:
            r12 = r3
            java.lang.Object r9 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r7 = r14
            r8 = r15
            androidx.media3.exoplayer.MediaPeriodInfo r14 = r7.getMediaPeriodInfoForPeriodPosition(r8, r9, r10, r12)
            androidx.media3.exoplayer.MediaPeriodHolder r15 = r7.removePreloadedMediaPeriodHolder(r14)
            if (r15 != 0) goto L75
            long r2 = r0.getRendererOffset()
            androidx.media3.exoplayer.MediaPeriodInfo r15 = r0.info
            long r4 = r15.durationUs
            long r2 = r2 + r4
            long r4 = r14.startPositionUs
            androidx.media3.exoplayer.MediaPeriodHolder$Factory r15 = r7.mediaPeriodHolderFactory
            long r2 = r2 - r4
            androidx.media3.exoplayer.MediaPeriodHolder r15 = r15.create(r14, r2)
        L75:
            r1.add(r15)
            goto L7a
        L79:
            r7 = r14
        L7a:
            r7.releaseAndResetPreloadPriorityList(r1)
            return
        L7e:
            r7 = r14
            r7.releasePreloadPool()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaPeriodQueue.invalidatePreloadPool(androidx.media3.common.Timeline):void");
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public boolean isPreloading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void maybeUpdatePreloadMediaPeriodHolder() {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        if (mediaPeriodHolder == null || mediaPeriodHolder.isFullyPreloaded()) {
            this.preloading = null;
            for (int i2 = 0; i2 < this.preloadPriorityList.size(); i2++) {
                MediaPeriodHolder mediaPeriodHolder2 = this.preloadPriorityList.get(i2);
                if (!mediaPeriodHolder2.isFullyPreloaded()) {
                    this.preloading = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public void reevaluateBuffer(long j2) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j2);
        }
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new ArrayList());
    }

    public int removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        an.B(mediaPeriodHolder);
        if (mediaPeriodHolder.equals(this.loading)) {
            return 0;
        }
        this.loading = mediaPeriodHolder;
        int i2 = 0;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
            an.B(mediaPeriodHolder);
            int i3 = 0;
            while (true) {
                MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
                if (i3 >= mediaPeriodHolderArr.length) {
                    break;
                }
                if (mediaPeriodHolder.equals(mediaPeriodHolderArr[i3])) {
                    MediaPeriodHolder[] mediaPeriodHolderArr2 = this.readingPeriods;
                    MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                    mediaPeriodHolderArr2[i3] = mediaPeriodHolder2;
                    this.prewarmingPeriods[i3] = mediaPeriodHolder2;
                    i2 = 3;
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                MediaPeriodHolder[] mediaPeriodHolderArr3 = this.prewarmingPeriods;
                if (i4 < mediaPeriodHolderArr3.length) {
                    if (mediaPeriodHolder.equals(mediaPeriodHolderArr3[i4])) {
                        this.prewarmingPeriods[i4] = this.readingPeriods[i4];
                        i2 |= 2;
                    }
                    i4++;
                }
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        MediaPeriodHolder mediaPeriodHolder3 = this.loading;
        an.B(mediaPeriodHolder3);
        mediaPeriodHolder3.setNext(null);
        notifyQueueUpdate();
        return i2;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(PlaybackInfo playbackInfo, Timeline timeline, Object obj, long j2, boolean z, boolean z2) {
        Object obj2 = obj;
        long jResolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj2);
        if (!z && !z2) {
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
            MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj2, j2, jResolvePeriodUidToWindowSequenceNumber, this.window, this.period);
            if (mediaPeriodId.isAd() && mediaPeriodId.equals(mediaPeriodIdResolveMediaPeriodIdForAds)) {
                return mediaPeriodId;
            }
            timeline.getPeriodByUid(obj2, this.period);
            return new MediaSource.MediaPeriodId(obj2, jResolvePeriodUidToWindowSequenceNumber, this.period.getAdGroupIndexAfterPositionUs(j2));
        }
        timeline.getPeriodByUid(obj2, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z3 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z4 = this.period.getAdGroupCount() > 0;
            z3 |= z4;
            Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj2 = this.period.uid;
                an.B(obj2);
            }
            if (z3 && (!z4 || this.period.durationUs != 0)) {
                break;
            }
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds2 = resolveMediaPeriodIdForAds(timeline, obj2, j2, jResolvePeriodUidToWindowSequenceNumber, this.window, this.period);
        if (mediaPeriodIdResolveMediaPeriodIdForAds2.adGroupIndex == -1 || z) {
            return mediaPeriodIdResolveMediaPeriodIdForAds2;
        }
        timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAds2.periodUid, this.period);
        if (this.period.adPlaybackState.getAdGroup(mediaPeriodIdResolveMediaPeriodIdForAds2.adGroupIndex).timeUs != j2) {
            return new MediaSource.MediaPeriodId(mediaPeriodIdResolveMediaPeriodIdForAds2.periodUid, mediaPeriodIdResolveMediaPeriodIdForAds2.windowSequenceNumber, this.period.getAdGroupIndexAfterPositionUs(j2));
        }
        return mediaPeriodIdResolveMediaPeriodIdForAds2;
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != C.TIME_UNSET && this.length < 100;
        }
        return true;
    }

    public void updatePreloadConfiguration(Timeline timeline, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        return removeAfter(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int updateQueuedPeriods(androidx.media3.common.Timeline r14, long r15, long[] r17, long[] r18) {
        /*
            r13 = this;
            androidx.media3.exoplayer.MediaPeriodHolder r0 = r13.playing
            r1 = 0
        L3:
            r5 = r0
            r0 = 0
            if (r5 == 0) goto L9b
            androidx.media3.exoplayer.MediaPeriodInfo r8 = r5.info
            if (r1 != 0) goto L11
            androidx.media3.exoplayer.MediaPeriodInfo r1 = r13.getUpdatedMediaPeriodInfo(r14, r8)
            r2 = r15
            goto L30
        L11:
            r2 = r15
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r13.getFollowingMediaPeriodInfo(r14, r1, r2)
            if (r4 == 0) goto L96
            boolean r6 = r13.canKeepMediaPeriodHolder(r8, r4)
            if (r6 != 0) goto L20
            goto L96
        L20:
            long r6 = r8.startPositionUs
            long r9 = r4.startPositionUs
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L2f
            long r9 = r8.liveStreamStartPositionProjectionUs
            androidx.media3.exoplayer.MediaPeriodInfo r1 = r4.copyWithStartPositionUs(r6, r9)
            goto L30
        L2f:
            r1 = r4
        L30:
            long r6 = r8.requestedContentPositionUs
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r1.copyWithRequestedContentPositionUs(r6)
            r5.info = r4
            long r6 = r8.durationUs
            long r9 = r1.durationUs
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L8f
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L4f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L53
        L4f:
            long r1 = r5.toRendererTime(r9)
        L53:
            r6 = r1
            androidx.media3.exoplayer.MediaPeriodInfo r14 = r5.info
            boolean r14 = r14.isFollowedByTransitionToSameStream
            r1 = 1
            if (r14 != 0) goto L68
            androidx.media3.exoplayer.MediaPeriodHolder[] r3 = r13.readingPeriods
            r2 = r13
            r4 = r17
            boolean r14 = r2.hasAnyRendererReadBeyondDuration(r3, r4, r5, r6)
            if (r14 == 0) goto L68
            r14 = r1
            goto L69
        L68:
            r14 = r0
        L69:
            androidx.media3.exoplayer.MediaPeriodHolder[] r3 = r13.prewarmingPeriods
            r2 = r13
            r4 = r18
            boolean r3 = r2.hasAnyRendererReadBeyondDuration(r3, r4, r5, r6)
            int r13 = r13.removeAfter(r5)
            if (r13 == 0) goto L79
            return r13
        L79:
            if (r14 == 0) goto L89
            long r13 = r8.durationUs
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L88
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r13 = r8.id
            int r13 = r13.nextAdGroupIndex
            r14 = -1
            if (r13 == r14) goto L89
        L88:
            r0 = r1
        L89:
            if (r3 == 0) goto L8e
            r13 = r0 | 2
            return r13
        L8e:
            return r0
        L8f:
            androidx.media3.exoplayer.MediaPeriodHolder r0 = r5.getNext()
            r1 = r5
            goto L3
        L96:
            int r13 = r13.removeAfter(r1)
            return r13
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaPeriodQueue.updateQueuedPeriods(androidx.media3.common.Timeline, long, long[], long[]):int");
    }

    public int updateRepeatMode(Timeline timeline, int i2) {
        this.repeatMode = i2;
        return updateForPlaybackModeChange(timeline);
    }

    public int updateShuffleModeEnabled(Timeline timeline, boolean z) {
        this.shuffleModeEnabled = z;
        return updateForPlaybackModeChange(timeline);
    }

    public void advancePrewarmingPeriod() {
        for (int i2 = 0; i2 < this.prewarmingPeriods.length; i2++) {
            advancePrewarmingPeriod(i2);
        }
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        int i2 = 0;
        while (true) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
            if (i2 < mediaPeriodHolderArr.length) {
                advanceReadingPeriod(i2);
                i2++;
            } else {
                MediaPeriodHolder mediaPeriodHolder = mediaPeriodHolderArr[0];
                an.B(mediaPeriodHolder);
                return mediaPeriodHolder;
            }
        }
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j2) {
        return resolveMediaPeriodIdForAds(timeline, obj, j2, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }
}
