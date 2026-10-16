package androidx.media3.exoplayer.source.preload;

import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreloadMediaSource extends WrappingMediaSource {
    private static final long CHECK_FOR_PRELOAD_ERROR_INTERVAL_MS = 100;
    private static final int CONTINUE_LOADING_RETRY_COUNT = 10;
    private static final long MAYBE_CONTINUE_LOADING_INTERVAL_MS = 100;
    private static final String TAG = "PreloadMediaSource";
    private final Allocator allocator;
    private final BandwidthMeter bandwidthMeter;
    private final LoadControl loadControl;
    private boolean onSourcePreparedNotified;
    private boolean onUsedByPlayerNotified;
    private Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> playingPreloadedMediaPeriodAndId;
    private boolean preloadCalled;
    private final PreloadControl preloadControl;
    private final HandlerWrapper preloadHandler;
    private Pair<PreloadMediaPeriod, MediaPeriodKey> preloadingMediaPeriodAndKey;
    private boolean prepareChildSourceCalled;
    private final HandlerWrapper releaseHandler;
    private boolean releasePreloadMediaSourceCalled;
    private final RendererCapabilities[] rendererCapabilities;
    private long startPositionUs;
    private Timeline timeline;
    private final TrackSelector trackSelector;

    /* compiled from: WazeSource */
    class MediaPeriodKey {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final Long startPositionUs;

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            this.mediaPeriodId = mediaPeriodId;
            this.startPositionUs = Long.valueOf(j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.mediaPeriodId, mediaPeriodKey.mediaPeriodId) && this.startPositionUs.equals(mediaPeriodKey.startPositionUs);
        }

        public int hashCode() {
            int iHashCode = this.mediaPeriodId.periodUid.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return (((((((iHashCode * 31) + mediaPeriodId.adGroupIndex) * 31) + mediaPeriodId.adIndexInAdGroup) * 31) + mediaPeriodId.nextAdGroupIndex) * 31) + this.startPositionUs.intValue();
        }
    }

    /* compiled from: WazeSource */
    public interface PreloadControl {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadControl$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onLoadedToTheEndOfSource(PreloadControl preloadControl, PreloadMediaSource preloadMediaSource) {
            }

            public static boolean $default$onLoadingUnableToContinue(PreloadControl preloadControl, PreloadMediaSource preloadMediaSource) {
                return false;
            }
        }

        boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, long j2);

        void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource);

        boolean onLoadingUnableToContinue(PreloadMediaSource preloadMediaSource);

        void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource);

        boolean onSourcePrepared(PreloadMediaSource preloadMediaSource);

        boolean onTracksSelected(PreloadMediaSource preloadMediaSource);

        void onUsedByPlayer(PreloadMediaSource preloadMediaSource);
    }

    /* compiled from: WazeSource */
    class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        private int continueLoadingRetryCountBeforeCallingPreloadControlAgain;
        private Runnable maybeContinueLoadingRunnable;
        private boolean onLoadToTheEndOfSourceNotified;
        private final long periodStartPositionUs;
        private boolean prepared;
        final /* synthetic */ PreloadMediaSource this$0;

        public PreloadMediaPeriodCallback(PreloadMediaSource preloadMediaSource, long j2) {
            Objects.requireNonNull(preloadMediaSource);
            this.this$0 = preloadMediaSource;
            this.periodStartPositionUs = j2;
            this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
        }

        private LoadControl.Parameters createLoadControlParameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            return new LoadControl.Parameters(playerId, timeline, mediaPeriodId, 0L, j2, 1.0f, false, false, C.TIME_UNSET, C.TIME_UNSET);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onContinueLoadingRequested$0(MediaPeriod mediaPeriod) {
            if (this.this$0.preloadingMediaPeriodAndKey == null || this.this$0.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            if (this.prepared) {
                long bufferedPositionUs = mediaPeriod.getBufferedPositionUs();
                if (bufferedPositionUs == Long.MIN_VALUE) {
                    onLoadToTheEndOfSource();
                    return;
                }
                PreloadMediaSource preloadMediaSource = this.this$0;
                if (!preloadMediaSource.preloadControl.onContinueLoadingRequested(preloadMediaSource, bufferedPositionUs - this.periodStartPositionUs)) {
                    this.this$0.stopPreloading();
                    return;
                }
            }
            Pair pair = this.this$0.preloadingMediaPeriodAndKey;
            an.B(pair);
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) pair.second;
            this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
            lambda$maybeContinueLoading$0(preloadMediaPeriod, mediaPeriodKey.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepared$0(MediaPeriod mediaPeriod) {
            TrackSelectorResult trackSelectorResultSelectTracks;
            if (this.this$0.preloadingMediaPeriodAndKey == null || this.this$0.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            TrackGroupArray trackGroups = preloadMediaPeriod.getTrackGroups();
            Pair pair = this.this$0.preloadingMediaPeriodAndKey;
            an.B(pair);
            MediaSource.MediaPeriodId mediaPeriodId = ((MediaPeriodKey) pair.second).mediaPeriodId;
            try {
                TrackSelector trackSelector = this.this$0.trackSelector;
                RendererCapabilities[] rendererCapabilitiesArr = this.this$0.rendererCapabilities;
                Timeline timeline = this.this$0.timeline;
                an.B(timeline);
                trackSelectorResultSelectTracks = trackSelector.selectTracks(rendererCapabilitiesArr, trackGroups, mediaPeriodId, timeline);
            } catch (ExoPlaybackException e2) {
                Log.e(PreloadMediaSource.TAG, "Failed to select tracks", e2);
                trackSelectorResultSelectTracks = null;
            }
            if (trackSelectorResultSelectTracks == null) {
                this.this$0.stopPreloading();
                return;
            }
            preloadMediaPeriod.selectTracksForPreloading(trackSelectorResultSelectTracks.selections, this.periodStartPositionUs);
            PreloadMediaSource preloadMediaSource = this.this$0;
            boolean zOnTracksSelected = preloadMediaSource.preloadControl.onTracksSelected(preloadMediaSource);
            PreloadMediaSource preloadMediaSource2 = this.this$0;
            if (!zOnTracksSelected) {
                preloadMediaSource2.stopPreloading();
                return;
            }
            LoadControl loadControl = preloadMediaSource2.loadControl;
            PlayerId playerId = preloadMediaSource2.getPlayerId();
            Timeline timeline2 = preloadMediaSource2.timeline;
            an.B(timeline2);
            loadControl.onTracksSelected(createLoadControlParameters(playerId, timeline2, mediaPeriodId, mediaPeriod.getBufferedPositionUs()), trackGroups, trackSelectorResultSelectTracks.selections);
            this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
            lambda$maybeContinueLoading$0(preloadMediaPeriod, mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: maybeContinueLoading, reason: merged with bridge method [inline-methods] */
        public void lambda$maybeContinueLoading$0(final MediaPeriod mediaPeriod, final MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.this$0.preloadingMediaPeriodAndKey == null || this.this$0.preloadingMediaPeriodAndKey.first != mediaPeriod) {
                return;
            }
            if (this.maybeContinueLoadingRunnable != null) {
                this.this$0.preloadHandler.removeCallbacks(this.maybeContinueLoadingRunnable);
                this.maybeContinueLoadingRunnable = null;
            }
            PreloadMediaSource preloadMediaSource = this.this$0;
            PlayerId playerId = preloadMediaSource.getPlayerId();
            Timeline timeline = preloadMediaSource.timeline;
            an.B(timeline);
            if (this.this$0.loadControl.shouldContinueLoading(createLoadControlParameters(playerId, timeline, mediaPeriodId, this.prepared ? mediaPeriod.getBufferedPositionUs() : 0L))) {
                this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
                LoadingInfo.Builder builder = new LoadingInfo.Builder();
                builder.setPlaybackPositionUs(this.periodStartPositionUs);
                mediaPeriod.continueLoading(builder.build());
                if (this.prepared && mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE) {
                    onLoadToTheEndOfSource();
                    return;
                }
                return;
            }
            int i2 = this.continueLoadingRetryCountBeforeCallingPreloadControlAgain;
            if (i2 == -1 || i2 >= 10) {
                PreloadMediaSource preloadMediaSource2 = this.this$0;
                if (preloadMediaSource2.preloadControl.onLoadingUnableToContinue(preloadMediaSource2)) {
                    this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = 0;
                } else {
                    this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = -1;
                }
            } else {
                this.continueLoadingRetryCountBeforeCallingPreloadControlAgain = i2 + 1;
            }
            this.maybeContinueLoadingRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadMediaPeriodCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$maybeContinueLoading$0(mediaPeriod, mediaPeriodId);
                }
            };
            this.this$0.preloadHandler.postDelayed(this.maybeContinueLoadingRunnable, 100L);
        }

        private void onLoadToTheEndOfSource() {
            if (!this.onLoadToTheEndOfSourceNotified) {
                PreloadMediaSource preloadMediaSource = this.this$0;
                preloadMediaSource.preloadControl.onLoadedToTheEndOfSource(preloadMediaSource);
                this.onLoadToTheEndOfSourceNotified = true;
            }
            this.this$0.stopPreloading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(final MediaPeriod mediaPeriod) {
            this.this$0.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadMediaPeriodCallback$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onContinueLoadingRequested$0(mediaPeriod);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(final MediaPeriod mediaPeriod) {
            this.prepared = true;
            this.this$0.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadMediaPeriodCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPrepared$0(mediaPeriod);
                }
            });
        }
    }

    private PreloadMediaSource(MediaSource mediaSource, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, LoadControl loadControl, Looper looper, Clock clock) {
        super(mediaSource);
        this.preloadControl = preloadControl;
        this.trackSelector = trackSelector;
        this.bandwidthMeter = bandwidthMeter;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.loadControl = loadControl;
        this.allocator = loadControl.getAllocator(PlayerId.PRELOAD);
        this.preloadHandler = clock.createHandler(looper, null);
        this.releaseHandler = clock.createHandler(looper, null);
        this.startPositionUs = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForPreloadError() {
        try {
            maybeThrowSourceInfoRefreshError();
            Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
            if (pair != null) {
                PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair.first;
                if (preloadMediaPeriod.prepared) {
                    preloadMediaPeriod.maybeThrowStreamError();
                } else {
                    preloadMediaPeriod.maybeThrowPrepareError();
                }
            }
            this.preloadHandler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.checkForPreloadError();
                }
            }, 100L);
        } catch (IOException e2) {
            this.preloadControl.onPreloadError(new PreloadException(getMediaItem(), null, e2), this);
            stopPreloading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return prepareSourceCalled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clear$0() {
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChildSourceInfoRefreshed$0(Timeline timeline) {
        if (isUsedByPlayer() || this.onSourcePreparedNotified) {
            return;
        }
        this.onSourcePreparedNotified = true;
        if (!this.preloadControl.onSourcePrepared(this)) {
            stopPreloading();
        } else {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(new Timeline.Window(), new Timeline.Period(), 0, this.startPositionUs);
            ((PreloadMediaPeriod) createPeriod(new MediaSource.MediaPeriodId(periodPositionUs.first), this.allocator, ((Long) periodPositionUs.second).longValue())).preload(new PreloadMediaPeriodCallback(this, ((Long) periodPositionUs.second).longValue()), ((Long) periodPositionUs.second).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preload$0(long j2) {
        this.onSourcePreparedNotified = false;
        if (isUsedByPlayer()) {
            onUsedByPlayer();
            return;
        }
        this.preloadCalled = true;
        this.startPositionUs = j2;
        setPlayerId(PlayerId.PRELOAD);
        setBandwidthMeter(this.bandwidthMeter);
        this.loadControl.onPrepared(PlayerId.PRELOAD);
        prepareSourceInternal(this.bandwidthMeter.getTransferListener());
        checkForPreloadError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadMediaSource$0() {
        if (this.preloadCalled) {
            this.loadControl.onReleased(PlayerId.PRELOAD);
        }
        this.releasePreloadMediaSourceCalled = true;
        this.preloadCalled = false;
        this.startPositionUs = C.TIME_UNSET;
        this.onSourcePreparedNotified = false;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        releaseSourceInternal();
        this.preloadHandler.removeCallbacksAndMessages(null);
        this.releaseHandler.removeCallbacksAndMessages(null);
    }

    private void maybeSetPlayerIdForAllocator() {
        Allocator allocator = this.allocator;
        if (allocator instanceof PlayerIdAwareAllocator) {
            ((PlayerIdAwareAllocator) allocator).setPlayerId(getPlayerId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid) && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup && mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex;
    }

    private void onUsedByPlayer() {
        this.preloadControl.onUsedByPlayer(this);
        stopPreloading();
        this.onUsedByPlayerNotified = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPreloading() {
        this.preloadHandler.removeCallbacksAndMessages(null);
    }

    public void clear() {
        Util.postOrRun(this.preloadHandler, new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$clear$0();
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j2);
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            Pair<PreloadMediaPeriod, MediaPeriodKey> pair2 = this.preloadingMediaPeriodAndKey;
            an.B(pair2);
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair2.first;
            if (isUsedByPlayer()) {
                this.preloadingMediaPeriodAndKey = null;
                this.playingPreloadedMediaPeriodAndId = new Pair<>(preloadMediaPeriod, mediaPeriodId);
            }
            return preloadMediaPeriod;
        }
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair3 = this.preloadingMediaPeriodAndKey;
        if (pair3 != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) pair3.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j2));
        if (!isUsedByPlayer()) {
            this.preloadingMediaPeriodAndKey = new Pair<>(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair = this.playingPreloadedMediaPeriodAndId;
        if (pair == null || !mediaPeriodIdEqualsWithoutWindowSequenceNumber(mediaPeriodId, (MediaSource.MediaPeriodId) pair.second)) {
            return mediaPeriodId;
        }
        Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
        an.B(pair2);
        return (MediaSource.MediaPeriodId) pair2.second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(final Timeline timeline) {
        this.timeline = timeline;
        refreshSourceInfo(timeline);
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onChildSourceInfoRefreshed$0(timeline);
            }
        });
    }

    public void preload(final long j2) {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$preload$0(j2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void prepareSourceInternal() {
        an.u(Looper.myLooper() == this.preloadHandler.getLooper());
        if (isUsedByPlayer() && !this.onUsedByPlayerNotified) {
            onUsedByPlayer();
        }
        maybeSetPlayerIdForAllocator();
        Timeline timeline = this.timeline;
        if (timeline != null) {
            onChildSourceInfoRefreshed(timeline);
        } else {
            if (this.prepareChildSourceCalled) {
                return;
            }
            this.prepareChildSourceCalled = true;
            prepareChildSource();
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair == null || preloadMediaPeriod != pair.first) {
            Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
            if (pair2 != null && preloadMediaPeriod == pair2.first) {
                this.playingPreloadedMediaPeriodAndId = null;
            }
        } else {
            this.preloadingMediaPeriodAndKey = null;
        }
        this.mediaSource.releasePeriod(preloadMediaPeriod.mediaPeriod);
    }

    public void releasePreloadMediaSource() {
        this.releaseHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$releasePreloadMediaSource$0();
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        if (isUsedByPlayer()) {
            return;
        }
        this.onUsedByPlayerNotified = false;
        if (this.preloadCalled && !this.releasePreloadMediaSourceCalled) {
            setPlayerId(PlayerId.PRELOAD);
            maybeSetPlayerIdForAllocator();
        } else {
            this.timeline = null;
            this.prepareChildSourceCalled = false;
            super.releaseSourceInternal();
        }
    }

    /* compiled from: WazeSource */
    public final class Factory implements MediaSource.Factory {
        private final BandwidthMeter bandwidthMeter;
        private Clock clock;
        private final LoadControl loadControl;
        private final MediaSource.Factory mediaSourceFactory;
        private final PreloadControl preloadControl;
        private final Looper preloadLooper;
        private final RendererCapabilities[] rendererCapabilities;
        private final TrackSelector trackSelector;

        public Factory(MediaSource.Factory factory, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, LoadControl loadControl, Looper looper) {
            this.mediaSourceFactory = factory;
            this.preloadControl = preloadControl;
            this.trackSelector = trackSelector;
            an.l(bandwidthMeter != BandwidthMeter.NO_OP);
            this.bandwidthMeter = bandwidthMeter;
            this.rendererCapabilities = (RendererCapabilities[]) Arrays.copyOf(rendererCapabilitiesArr, rendererCapabilitiesArr.length);
            this.loadControl = loadControl;
            this.preloadLooper = looper;
            this.clock = Clock.DEFAULT;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public PreloadMediaSource createMediaSource(MediaItem mediaItem) {
            return new PreloadMediaSource(this.mediaSourceFactory.createMediaSource(mediaItem), this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.loadControl, this.preloadLooper, this.clock);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return this.mediaSourceFactory.getSupportedTypes();
        }

        public Factory setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.mediaSourceFactory.setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ MediaSource.Factory setDownloadExecutor(aj ajVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        public PreloadMediaSource createMediaSource(MediaSource mediaSource) {
            return new PreloadMediaSource(mediaSource, this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.loadControl, this.preloadLooper, this.clock);
        }
    }
}
