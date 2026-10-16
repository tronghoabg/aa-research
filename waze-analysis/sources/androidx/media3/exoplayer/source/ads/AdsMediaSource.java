package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final Map<ClippingMediaPeriod, MediaSource.MediaPeriodId> activeContentClippingMediaPeriods;
    private final List<AdMediaSourceHolder> activeMediaSourceHolders;
    private Timeline activeTimeline;
    private final MediaSource.Factory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    final MediaItem.DrmConfiguration contentDrmConfiguration;
    private final MaskingMediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;
    private Handler playerHandler;
    private final boolean useAdMediaSourceClipping;
    private final boolean useLazyContentSourcePreparation;

    /* compiled from: WazeSource */
    public final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i2, Exception exc) {
            super(exc);
            this.type = i2;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i2) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + i2, exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            an.u(this.type == 3);
            Throwable cause = getCause();
            an.B(cause);
            return (RuntimeException) cause;
        }
    }

    /* compiled from: WazeSource */
    final class AdMediaSourceHolder {
        private final List<MediaPeriod> activeMediaPeriods;
        private MediaItem adMediaItem;
        private MediaSource adMediaSource;
        private long endPositionUs;
        private final MediaSource.MediaPeriodId id;
        final /* synthetic */ AdsMediaSource this$0;
        private Timeline timeline;

        private AdMediaSourceHolder(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            Objects.requireNonNull(adsMediaSource);
            this.this$0 = adsMediaSource;
            this.id = mediaPeriodId;
            this.endPositionUs = j2;
            this.activeMediaPeriods = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2, boolean z) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
            MediaPeriod clippingMediaPeriod = z ? new ClippingMediaPeriod(maskingMediaPeriod, false, j2, this.endPositionUs) : maskingMediaPeriod;
            this.activeMediaPeriods.add(clippingMediaPeriod);
            MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                AdsMediaSource adsMediaSource = this.this$0;
                MediaItem mediaItem = this.adMediaItem;
                an.B(mediaItem);
                maskingMediaPeriod.setPrepareListener(new AdPrepareListener(adsMediaSource, mediaItem));
            }
            Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return clippingMediaPeriod;
        }

        private MaskingMediaPeriod getActiveMaskingMediaPeriod(int i2) {
            MediaPeriod mediaPeriod = this.activeMediaPeriods.get(i2);
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaPeriod = ((ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            return (MaskingMediaPeriod) mediaPeriod;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getDurationUs() {
            Timeline timeline = this.timeline;
            return timeline == null ? C.TIME_UNSET : timeline.getPeriod(0, this.this$0.period).getDurationUs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleSourceInfoRefresh(Timeline timeline) {
            an.l(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i2 = 0; i2 < this.activeMediaPeriods.size(); i2++) {
                    MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i2);
                    activeMaskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, activeMaskingMediaPeriod.id.windowSequenceNumber));
                }
                setEndPositionUs(this.endPositionUs);
            }
            this.timeline = timeline;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initializeWithMediaSource(MediaSource mediaSource, MediaItem mediaItem) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = mediaItem;
            for (int i2 = 0; i2 < this.activeMediaPeriods.size(); i2++) {
                MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i2);
                activeMaskingMediaPeriod.setMediaSource(mediaSource);
                activeMaskingMediaPeriod.setPrepareListener(new AdPrepareListener(this.this$0, mediaItem));
            }
            this.this$0.prepareChildSource(this.id, mediaSource);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            if (hasMediaSource()) {
                this.this$0.releaseChildSource(this.id);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void releaseMediaPeriod(MediaPeriod mediaPeriod) {
            this.activeMediaPeriods.remove(mediaPeriod);
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaPeriod = ((ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndPositionUs(long j2) {
            if (this.this$0.useAdMediaSourceClipping && this.endPositionUs == Long.MIN_VALUE && j2 != Long.MIN_VALUE) {
                this.endPositionUs = j2;
                for (int i2 = 0; i2 < this.activeMediaPeriods.size(); i2++) {
                    if (this.activeMediaPeriods.get(i2) instanceof ClippingMediaPeriod) {
                        ((ClippingMediaPeriod) this.activeMediaPeriods.get(i2)).updateClipping(0L, j2);
                    }
                }
            }
        }
    }

    /* compiled from: WazeSource */
    final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final MediaItem adMediaItem;
        final /* synthetic */ AdsMediaSource this$0;

        public AdPrepareListener(AdsMediaSource adsMediaSource, MediaItem mediaItem) {
            Objects.requireNonNull(adsMediaSource);
            this.this$0 = adsMediaSource;
            this.adMediaItem = mediaItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareComplete$0(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource adsMediaSource = this.this$0;
            adsMediaSource.adsLoader.handlePrepareComplete(adsMediaSource, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$0(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            AdsMediaSource adsMediaSource = this.this$0;
            adsMediaSource.adsLoader.handlePrepareError(adsMediaSource, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(final MediaSource.MediaPeriodId mediaPeriodId) {
            this.this$0.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPrepareComplete$0(mediaPeriodId);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            MediaItem mediaItem = this.adMediaItem;
            MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = this.this$0.createEventDispatcher(mediaPeriodId);
            long newId = LoadEventInfo.getNewId();
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            an.B(localConfiguration);
            eventDispatcherCreateEventDispatcher.loadError(new LoadEventInfo(newId, new DataSpec(localConfiguration.uri), SystemClock.elapsedRealtime()), 6, (IOException) AdLoadException.createForAd(iOException), true);
            this.this$0.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPrepareError$0(mediaPeriodId, iOException);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler;
        private volatile boolean stopped;
        final /* synthetic */ AdsMediaSource this$0;

        public ComponentListener(AdsMediaSource adsMediaSource, Handler handler) {
            Objects.requireNonNull(adsMediaSource);
            this.this$0 = adsMediaSource;
            this.playerHandler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.this$0.onAdPlaybackState(adPlaybackState);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdClicked() {
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            this.this$0.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()), 6, (IOException) adLoadException, true);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$ComponentListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onAdPlaybackState$0(adPlaybackState);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdTapped() {
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider, boolean z, boolean z2) {
        this.contentMediaSource = new MaskingMediaSource(mediaSource, z);
        MediaItem.LocalConfiguration localConfiguration = mediaSource.getMediaItem().localConfiguration;
        an.B(localConfiguration);
        this.contentDrmConfiguration = localConfiguration.drmConfiguration;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        this.useLazyContentSourcePreparation = z;
        this.useAdMediaSourceClipping = z2;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.period = new Timeline.Period();
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.activeMediaSourceHolders = new ArrayList();
        this.activeContentClippingMediaPeriods = new HashMap();
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    private static int checkValidAdPlaybackStateUpdate(AdPlaybackState adPlaybackState, AdPlaybackState adPlaybackState2) {
        an.u(adPlaybackState.endsWithLivePostrollPlaceHolder() == adPlaybackState2.endsWithLivePostrollPlaceHolder());
        int i2 = adPlaybackState2.adGroupCount - adPlaybackState.adGroupCount;
        an.u(i2 >= 0);
        int i3 = adPlaybackState2.removedAdGroupCount;
        while (i3 < adPlaybackState.adGroupCount) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            if (adGroup.isLivePostrollPlaceholder()) {
                an.u(i3 == adPlaybackState.adGroupCount + (-1));
                return i2;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState2.getAdGroup(i3);
            an.u(adGroup.timeUs == adGroup2.timeUs);
            if (adGroup.hasUnplayedAds()) {
                an.u(adGroup.count <= adGroup2.count);
                for (int i4 = 0; i4 < adGroup.count; i4++) {
                    MediaItem mediaItem = adGroup.mediaItems[i4];
                    if (mediaItem != null && adGroup.states[i4] == 1) {
                        an.u(mediaItem.equals(adGroup2.mediaItems[i4]));
                    }
                }
            }
            i3++;
        }
        return i2;
    }

    private long[][] getAdDurationsUs(AdPlaybackState adPlaybackState) {
        AdMediaSourceHolder adMediaSourceHolder;
        boolean zEndsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
        int length = this.adMediaSourceHolders.length + (zEndsWithLivePostrollPlaceHolder ? 1 : 0);
        long[][] jArr = new long[length][];
        int i2 = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i2 >= adMediaSourceHolderArr.length) {
                break;
            }
            int iMax = this.useAdMediaSourceClipping ? Math.max(adPlaybackState.getAdGroup(i2).count, 0) : adMediaSourceHolderArr[i2].length;
            jArr[i2] = new long[iMax];
            int i3 = 0;
            while (i3 < iMax) {
                long j2 = adPlaybackState.getAdGroup(i2).durationsUs.length > i3 ? adPlaybackState.getAdGroup(i2).durationsUs[i3] : -9223372036854775807L;
                if (j2 == C.TIME_UNSET || !this.useAdMediaSourceClipping) {
                    AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i2];
                    if (adMediaSourceHolderArr2.length <= i3 || (adMediaSourceHolder = adMediaSourceHolderArr2[i3]) == null) {
                        jArr[i2][i3] = -9223372036854775807L;
                    } else {
                        jArr[i2][i3] = adMediaSourceHolder.getDurationUs();
                    }
                } else {
                    jArr[i2][i3] = j2;
                }
                i3++;
            }
            i2++;
        }
        if (zEndsWithLivePostrollPlaceHolder) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    private static MediaItem.AdsConfiguration getAdsConfiguration(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return null;
        }
        return localConfiguration.adsConfiguration;
    }

    private long getContentClippingEndPositionUs(Timeline timeline, Object obj, int i2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return Long.MIN_VALUE;
        }
        timeline.getPeriod(indexOfPeriod, this.period);
        return this.period.adPlaybackState.getAdGroup(i2).timeUs;
    }

    private static AdMediaSourceHolder[][] growAdMediaSourceHolderGrid(AdMediaSourceHolder[][] adMediaSourceHolderArr, int i2) {
        int length = adMediaSourceHolderArr.length;
        int i3 = i2 + length;
        AdMediaSourceHolder[][] adMediaSourceHolderArr2 = new AdMediaSourceHolder[i3][];
        System.arraycopy(adMediaSourceHolderArr, 0, adMediaSourceHolderArr2, 0, length);
        while (length < i3) {
            adMediaSourceHolderArr2[length] = new AdMediaSourceHolder[0];
            length++;
        }
        return adMediaSourceHolderArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChildSourceInfoRefreshed$0(Timeline timeline) {
        boolean zHandleContentTimelineChanged = this.adsLoader.handleContentTimelineChanged(this, timeline);
        boolean z = true;
        if (zHandleContentTimelineChanged && this.useLazyContentSourcePreparation) {
            z = false;
        }
        an.u(z);
        if (zHandleContentTimelineChanged || this.useLazyContentSourcePreparation) {
            return;
        }
        Handler handler = this.playerHandler;
        an.B(handler);
        handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.maybeUpdateSourceInfo();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$0(ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    private void maybeUpdateAdMediaSources() {
        MediaItem mediaItemBuild;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState != null) {
            for (int i2 = 0; i2 < this.adMediaSourceHolders.length; i2++) {
                int i3 = 0;
                while (true) {
                    AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i2];
                    if (i3 < adMediaSourceHolderArr.length) {
                        AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i3];
                        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
                        if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource()) {
                            MediaItem[] mediaItemArr = adGroup.mediaItems;
                            if (i3 < mediaItemArr.length && (mediaItemBuild = mediaItemArr[i3]) != null) {
                                if (this.contentDrmConfiguration != null) {
                                    MediaItem.Builder builderBuildUpon = mediaItemBuild.buildUpon();
                                    builderBuildUpon.setDrmConfiguration(this.contentDrmConfiguration);
                                    mediaItemBuild = builderBuildUpon.build();
                                }
                                adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(mediaItemBuild), mediaItemBuild);
                            }
                        }
                        i3++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdateSourceInfo() {
        Timeline timeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            this.activeTimeline = timeline;
            refreshSourceInfo(timeline);
            return;
        }
        AdPlaybackState adPlaybackStateWithAdDurationsUs = adPlaybackState.withAdDurationsUs(getAdDurationsUs(adPlaybackState));
        this.adPlaybackState = adPlaybackStateWithAdDurationsUs;
        AdTimeline adTimeline = new AdTimeline(timeline, adPlaybackStateWithAdDurationsUs);
        this.activeTimeline = adTimeline;
        for (Map.Entry<ClippingMediaPeriod, MediaSource.MediaPeriodId> entry : this.activeContentClippingMediaPeriods.entrySet()) {
            MediaSource.MediaPeriodId value = entry.getValue();
            entry.getKey().updateClipping(0L, getContentClippingEndPositionUs(adTimeline, value.periodUid, value.nextAdGroupIndex));
        }
        refreshSourceInfo(adTimeline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdMediaSourceHolder[adPlaybackState.adGroupCount - (adPlaybackState.endsWithLivePostrollPlaceHolder() ? 1 : 0)][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            Arrays.fill(adMediaSourceHolderArr, new AdMediaSourceHolder[0]);
        } else {
            int iCheckValidAdPlaybackStateUpdate = checkValidAdPlaybackStateUpdate(adPlaybackState2, adPlaybackState);
            if (iCheckValidAdPlaybackStateUpdate > 0) {
                this.adMediaSourceHolders = growAdMediaSourceHolderGrid(this.adMediaSourceHolders, iCheckValidAdPlaybackStateUpdate);
            }
            if (this.useAdMediaSourceClipping) {
                for (int i2 = 0; i2 < this.activeMediaSourceHolders.size(); i2++) {
                    AdMediaSourceHolder adMediaSourceHolder = this.activeMediaSourceHolders.get(i2);
                    MediaSource.MediaPeriodId mediaPeriodId = adMediaSourceHolder.id;
                    long j2 = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex).durationsUs[mediaPeriodId.adIndexInAdGroup];
                    if (j2 != C.TIME_UNSET) {
                        adMediaSourceHolder.setEndPositionUs(j2);
                    }
                }
            }
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return Objects.equals(getAdsConfiguration(getMediaItem()), getAdsConfiguration(mediaItem)) && this.contentMediaSource.canUpdateMediaItem(mediaItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // androidx.media3.exoplayer.source.MediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r14, androidx.media3.exoplayer.upstream.Allocator r15, long r16) {
        /*
            r13 = this;
            androidx.media3.common.AdPlaybackState r0 = r13.adPlaybackState
            com.google.d.b.an.B(r0)
            r3 = r0
            androidx.media3.common.AdPlaybackState r3 = (androidx.media3.common.AdPlaybackState) r3
            int r3 = r0.adGroupCount
            if (r3 <= 0) goto L77
            boolean r3 = r14.isAd()
            if (r3 == 0) goto L77
            int r6 = r14.adGroupIndex
            int r7 = r14.adIndexInAdGroup
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r13.adMediaSourceHolders
            r4 = r3[r6]
            int r5 = r4.length
            if (r5 > r7) goto L27
            int r5 = r7 + 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[] r4 = (androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[]) r4
            r3[r6] = r4
        L27:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r13.adMediaSourceHolders
            r3 = r3[r6]
            r3 = r3[r7]
            if (r3 != 0) goto L6b
            boolean r3 = r13.useAdMediaSourceClipping
            r4 = -9223372036854775808
            if (r3 == 0) goto L53
            int r3 = r14.adGroupIndex
            androidx.media3.common.AdPlaybackState$AdGroup r0 = r0.getAdGroup(r3)
            com.google.d.b.an.B(r0)
            r3 = r0
            androidx.media3.common.AdPlaybackState$AdGroup r3 = (androidx.media3.common.AdPlaybackState.AdGroup) r3
            long[] r0 = r0.durationsUs
            int r3 = r0.length
            if (r3 <= r7) goto L53
            r8 = r0[r7]
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L53
            r3 = r8
            goto L54
        L53:
            r3 = r4
        L54:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder r0 = new androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder
            r5 = 0
            r1 = r13
            r2 = r14
            r0.<init>(r2, r3)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = r13.adMediaSourceHolders
            r2 = r2[r6]
            r2[r7] = r0
            java.util.List<androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder> r2 = r13.activeMediaSourceHolders
            r2.add(r0)
            r13.maybeUpdateAdMediaSources()
            goto L6c
        L6b:
            r0 = r3
        L6c:
            boolean r5 = r13.useAdMediaSourceClipping
            r1 = r14
            r2 = r15
            r3 = r16
            androidx.media3.exoplayer.source.MediaPeriod r0 = androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder.m12807$$Nest$mcreateMediaPeriod(r0, r1, r2, r3, r5)
            return r0
        L77:
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r0 = new androidx.media3.exoplayer.source.MediaSource$MediaPeriodId
            java.lang.Object r3 = r14.periodUid
            long r4 = r14.windowSequenceNumber
            r0.<init>(r3, r4)
            androidx.media3.exoplayer.source.MaskingMediaPeriod r7 = new androidx.media3.exoplayer.source.MaskingMediaPeriod
            r4 = r16
            r7.<init>(r0, r15, r4)
            androidx.media3.exoplayer.source.MaskingMediaSource r3 = r13.contentMediaSource
            r7.setMediaSource(r3)
            r7.createPeriod(r0)
            int r0 = r14.nextAdGroupIndex
            r3 = -1
            if (r0 != r3) goto L95
            return r7
        L95:
            androidx.media3.common.Timeline r0 = r13.activeTimeline
            com.google.d.b.an.B(r0)
            r3 = r0
            androidx.media3.common.Timeline r3 = (androidx.media3.common.Timeline) r3
            java.lang.Object r3 = r14.periodUid
            int r4 = r14.nextAdGroupIndex
            long r11 = r13.getContentClippingEndPositionUs(r0, r3, r4)
            androidx.media3.exoplayer.source.ClippingMediaPeriod r6 = new androidx.media3.exoplayer.source.ClippingMediaPeriod
            r8 = 1
            r9 = 0
            r6.<init>(r7, r8, r9, r11)
            java.util.Map<androidx.media3.exoplayer.source.ClippingMediaPeriod, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId> r0 = r13.activeContentClippingMediaPeriods
            r0.put(r6, r14)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.AdsMediaSource.createPeriod(androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, androidx.media3.exoplayer.upstream.Allocator, long):androidx.media3.exoplayer.source.MediaPeriod");
    }

    public Object getAdsId() {
        return this.adsId;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, final Timeline timeline) {
        if (!mediaPeriodId.isAd()) {
            this.contentTimeline = timeline;
            this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onChildSourceInfoRefreshed$0(timeline);
                }
            });
            if (this.useLazyContentSourcePreparation) {
                maybeUpdateSourceInfo();
                return;
            }
            return;
        }
        int i2 = mediaPeriodId.adGroupIndex;
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[i2][mediaPeriodId.adIndexInAdGroup];
        an.B(adMediaSourceHolder);
        adMediaSourceHolder.handleSourceInfoRefresh(timeline);
        maybeUpdateSourceInfo();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playerHandler = Util.createHandlerForCurrentLooper();
        final ComponentListener componentListener = new ComponentListener(this, this.playerHandler);
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$prepareSourceInternal$0(componentListener);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        boolean z = mediaPeriod instanceof ClippingMediaPeriod;
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) (z ? ((ClippingMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod);
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            if (z) {
                this.activeContentClippingMediaPeriods.remove(mediaPeriod);
            }
            maskingMediaPeriod.releasePeriod();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
        an.B(adMediaSourceHolder);
        adMediaSourceHolder.releaseMediaPeriod(mediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            adMediaSourceHolder.release();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
            this.activeMediaSourceHolders.remove(adMediaSourceHolder);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        final ComponentListener componentListener = this.componentListener;
        an.B(componentListener);
        this.componentListener = null;
        this.playerHandler = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.activeTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$releaseSourceInternal$0(componentListener);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.contentMediaSource.updateMediaItem(mediaItem);
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this(mediaSource, dataSpec, obj, factory, adsLoader, adViewProvider, true, false);
    }
}
