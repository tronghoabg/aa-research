package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.PlaybackLooperProvider;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.source.preload.RankingDataComparator;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.d.b.ab;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultPreloadManager extends BasePreloadManager<Integer, PreloadStatus> {
    private final PreCacheHelper.Factory preCacheHelperFactory;
    private final HandlerThread preCacheThread;
    private final HandlerWrapper preloadHandler;
    private final PlaybackLooperProvider preloadLooperProvider;
    private final PreloadMediaSource.Factory preloadMediaSourceFactory;
    private boolean releaseCalled;
    private final RendererCapabilitiesList rendererCapabilitiesList;
    private final TrackSelector trackSelector;

    /* compiled from: WazeSource */
    final class PreCacheHelperListener implements PreCacheHelper.Listener {
        final /* synthetic */ DefaultPreloadManager this$0;

        private PreCacheHelperListener(DefaultPreloadManager defaultPreloadManager) {
            Objects.requireNonNull(defaultPreloadManager);
            this.this$0 = defaultPreloadManager;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onDownloadError(MediaItem mediaItem, IOException iOException) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            this.this$0.onError(new PreloadException(mediaItem, null, iOException), mediaItem, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreCacheHelperListener$$ExternalSyntheticLambda2
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPreCacheCompleted(MediaItem mediaItem) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            this.this$0.onCompleted(mediaItem, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreCacheHelperListener$$ExternalSyntheticLambda1
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public /* synthetic */ void onPreCacheProgress(MediaItem mediaItem, long j2, long j3, float f2) {
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPrepareError(MediaItem mediaItem, IOException iOException) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            this.this$0.onError(new PreloadException(mediaItem, null, iOException), mediaItem, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreCacheHelperListener$$ExternalSyntheticLambda0
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPrepared(MediaItem mediaItem, MediaItem mediaItem2) {
            PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            this.this$0.onMediaSourceUpdated(mediaItem, this.this$0.preloadMediaSourceFactory.createMediaSource(mediaItem2));
        }
    }

    /* compiled from: WazeSource */
    final class PreloadMediaSourceControl implements PreloadMediaSource.PreloadControl {
        final /* synthetic */ DefaultPreloadManager this$0;

        private PreloadMediaSourceControl(DefaultPreloadManager defaultPreloadManager) {
            Objects.requireNonNull(defaultPreloadManager);
            this.this$0 = defaultPreloadManager;
        }

        private boolean continueOrCompletePreloading(PreloadMediaSource preloadMediaSource, ab<PreloadStatus> abVar) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return false;
            }
            if (abVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
                return true;
            }
            this.this$0.onCompleted(preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda6
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
            return false;
        }

        static /* synthetic */ boolean lambda$onContinueLoadingRequested$0(long j2, PreloadStatus preloadStatus) {
            if (preloadStatus.stage != 2) {
                return false;
            }
            long j3 = preloadStatus.durationMs;
            return j3 != C.TIME_UNSET && j3 > Util.usToMs(j2);
        }

        static /* synthetic */ boolean lambda$onSourcePrepared$0(PreloadStatus preloadStatus) {
            return preloadStatus.stage > 0;
        }

        static /* synthetic */ boolean lambda$onTracksSelected$0(PreloadStatus preloadStatus) {
            return preloadStatus.stage > 1;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, final long j2) {
            return continueOrCompletePreloading(preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda3
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onContinueLoadingRequested$0(j2, (DefaultPreloadManager.PreloadStatus) obj);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            this.this$0.onCompleted(preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda5
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onLoadingUnableToContinue(PreloadMediaSource preloadMediaSource) {
            BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder mediaSourceHolderToClear = this.this$0.getMediaSourceHolderToClear();
            if (mediaSourceHolderToClear == null) {
                return false;
            }
            ((PreloadMediaSource) mediaSourceHolderToClear.getMediaSource()).clear();
            this.this$0.onSourceCleared();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            this.this$0.onError(preloadException, preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda4
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda0
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onSourcePrepared$0((DefaultPreloadManager.PreloadStatus) obj);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda2
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onTracksSelected$0((DefaultPreloadManager.PreloadStatus) obj);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(PreloadMediaSource preloadMediaSource) {
            final PreloadStatus targetPreloadStatusIfCurrentlyPreloading = this.this$0.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            this.this$0.onSkipped(preloadMediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$PreloadMediaSourceControl$$ExternalSyntheticLambda1
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return ((DefaultPreloadManager.PreloadStatus) obj).equals(targetPreloadStatusIfCurrentlyPreloading);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    final class PreloadMediaSourceHolder extends BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder {
        public PreCacheHelper preCacheHelper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreloadMediaSourceHolder(DefaultPreloadManager defaultPreloadManager, MediaItem mediaItem, PreloadMediaSource preloadMediaSource, Integer num) {
            super(defaultPreloadManager, mediaItem, num, preloadMediaSource);
            Objects.requireNonNull(defaultPreloadManager);
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder
        public synchronized PreloadMediaSource getMediaSource() {
            return (PreloadMediaSource) super.getMediaSource();
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder
        public synchronized void setMediaSource(MediaSource mediaSource) {
            getMediaSource().releasePreloadMediaSource();
            super.setMediaSource(mediaSource);
        }
    }

    /* compiled from: WazeSource */
    public class SimpleRankingDataComparator implements RankingDataComparator<Integer> {
        private int currentPlayingIndex = -1;
        private RankingDataComparator.InvalidationListener invalidationListener;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.currentPlayingIndex), Math.abs(num2.intValue() - this.currentPlayingIndex));
        }

        protected final int getCurrentPlayingIndex() {
            return this.currentPlayingIndex;
        }

        public final void setCurrentPlayingIndex(int i2) {
            if (i2 != this.currentPlayingIndex) {
                this.currentPlayingIndex = i2;
                RankingDataComparator.InvalidationListener invalidationListener = this.invalidationListener;
                if (invalidationListener != null) {
                    invalidationListener.onRankingDataComparatorInvalidated();
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator
        public final void setInvalidationListener(RankingDataComparator.InvalidationListener invalidationListener) {
            this.invalidationListener = invalidationListener;
        }
    }

    private DefaultPreloadManager(Builder builder) {
        super(builder.rankingDataComparator, builder.targetPreloadStatusControl, builder.mediaSourceFactorySupplier.get2());
        DefaultRendererCapabilitiesList defaultRendererCapabilitiesListCreateRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory((RenderersFactory) builder.renderersFactorySupplier.get2()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = defaultRendererCapabilitiesListCreateRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        TrackSelector trackSelectorCreateTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = trackSelectorCreateTrackSelector;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get2();
        trackSelectorCreateTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
            }

            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
            }
        }, bandwidthMeter);
        Looper looperObtainLooper = playbackLooperProvider.obtainLooper();
        PreloadMediaSource.Factory factory = new PreloadMediaSource.Factory(builder.mediaSourceFactorySupplier.get2(), new PreloadMediaSourceControl(), trackSelectorCreateTrackSelector, bandwidthMeter, defaultRendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), (LoadControl) builder.loadControlSupplier.get2(), looperObtainLooper);
        factory.setClock(builder.clock);
        this.preloadMediaSourceFactory = factory;
        Cache cache = builder.cache;
        if (cache != null) {
            HandlerThread handlerThread = new HandlerThread("DefaultPreloadManager:PreCacheHelper");
            this.preCacheThread = handlerThread;
            handlerThread.start();
            PreCacheHelper.Factory factory2 = new PreCacheHelper.Factory(builder.context, cache, builder.dataSourceFactory != null ? builder.dataSourceFactory : new DefaultDataSource.Factory(builder.context), handlerThread.getLooper());
            factory2.setDownloadExecutor(builder.cachingExecutor);
            factory2.setListener(new PreCacheHelperListener());
            this.preCacheHelperFactory = factory2;
        } else {
            this.preCacheThread = null;
            this.preCacheHelperFactory = null;
        }
        this.preloadHandler = builder.clock.createHandler(looperObtainLooper, null);
    }

    static /* synthetic */ void lambda$new$0() {
    }

    static /* synthetic */ boolean lambda$preloadMediaSourceHolderInternal$0(PreloadStatus preloadStatus) {
        return preloadStatus.stage == Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadUtils$0() {
        this.rendererCapabilitiesList.release();
        this.trackSelector.release();
        this.preloadLooperProvider.releaseLooper();
    }

    private void maybeClearPreloadMediaSource(PreloadMediaSource preloadMediaSource, PreloadStatus preloadStatus) {
        int i2 = preloadStatus.stage;
        if (i2 == Integer.MIN_VALUE || i2 == -1 || i2 == 0) {
            preloadMediaSource.clear();
        }
    }

    private void releasePreCacheUtils() {
        HandlerThread handlerThread = this.preCacheThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    private void releasePreloadUtils() {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$releasePreloadUtils$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder createMediaSourceHolder(MediaItem mediaItem, MediaSource mediaSource, Integer num) {
        PreloadMediaSource.Factory factory = this.preloadMediaSourceFactory;
        return new PreloadMediaSourceHolder(this, mediaItem, mediaSource != null ? factory.createMediaSource(mediaSource) : factory.createMediaSource(mediaItem), num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void preloadMediaSourceHolderInternal(BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder mediaSourceHolder, PreloadStatus preloadStatus) {
        if (this.releaseCalled) {
            return;
        }
        an.l(mediaSourceHolder instanceof PreloadMediaSourceHolder);
        PreloadMediaSourceHolder preloadMediaSourceHolder = (PreloadMediaSourceHolder) mediaSourceHolder;
        PreloadMediaSource mediaSource = preloadMediaSourceHolder.getMediaSource();
        maybeClearPreloadMediaSource(mediaSource, preloadStatus);
        if (preloadStatus.equals(PreloadStatus.PRELOAD_STATUS_NOT_PRELOADED)) {
            onSkipped(mediaSource, new ab() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$$ExternalSyntheticLambda1
                @Override // com.google.d.b.ab
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.lambda$preloadMediaSourceHolderInternal$0((DefaultPreloadManager.PreloadStatus) obj);
                }
            });
            return;
        }
        if (preloadStatus.stage != -1) {
            mediaSource.preload(Util.msToUs(preloadStatus.startPositionMs));
            return;
        }
        if (preloadMediaSourceHolder.preCacheHelper == null) {
            PreCacheHelper.Factory factory = this.preCacheHelperFactory;
            an.C(factory, "DefaultPreloadManager wasn't configured with a Cache");
            preloadMediaSourceHolder.preCacheHelper = factory.create(mediaSourceHolder.mediaItem);
        }
        PreCacheHelper preCacheHelper = preloadMediaSourceHolder.preCacheHelper;
        an.B(preCacheHelper);
        preCacheHelper.preCache(preloadStatus.startPositionMs, preloadStatus.durationMs);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void releaseInternal() {
        this.releaseCalled = true;
        releasePreloadUtils();
        releasePreCacheUtils();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void releaseMediaSourceHolderInternal(BasePreloadManager<Integer, PreloadStatus>.MediaSourceHolder mediaSourceHolder) {
        if (this.releaseCalled) {
            return;
        }
        super.releaseMediaSourceHolderInternal(mediaSourceHolder);
        an.l(mediaSourceHolder instanceof PreloadMediaSourceHolder);
        PreloadMediaSourceHolder preloadMediaSourceHolder = (PreloadMediaSourceHolder) mediaSourceHolder;
        preloadMediaSourceHolder.getMediaSource().releasePreloadMediaSource();
        PreCacheHelper preCacheHelper = preloadMediaSourceHolder.preCacheHelper;
        if (preCacheHelper != null) {
            preCacheHelper.release(true);
            preloadMediaSourceHolder.preCacheHelper = null;
        }
    }

    public void setCurrentPlayingIndex(int i2) {
        ((SimpleRankingDataComparator) this.rankingDataComparator).setCurrentPlayingIndex(i2);
    }

    /* compiled from: WazeSource */
    class DefaultMediaSourceFactorySupplier implements MediaSourceFactorySupplier {
        private Cache cache;
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private final aj<DefaultMediaSourceFactory> defaultMediaSourceFactorySupplier;

        private DefaultMediaSourceFactorySupplier(final Context context) {
            this.context = context;
            this.defaultMediaSourceFactorySupplier = an.a(new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$DefaultMediaSourceFactorySupplier$$ExternalSyntheticLambda0
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return DefaultPreloadManager.DefaultMediaSourceFactorySupplier.lambda$new$0(context);
                }
            });
        }

        static /* synthetic */ DefaultMediaSourceFactory lambda$new$0(Context context) {
            return new DefaultMediaSourceFactory(context);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.d.b.aj
        /* renamed from: get */
        public MediaSource.Factory get2() {
            DefaultMediaSourceFactory defaultMediaSourceFactory = this.defaultMediaSourceFactorySupplier.get2();
            DataSource.Factory factory = this.dataSourceFactory;
            if (factory == null) {
                factory = new DefaultDataSource.Factory(this.context);
            }
            Cache cache = this.cache;
            if (cache == null) {
                defaultMediaSourceFactory.setDataSourceFactory(factory);
                return defaultMediaSourceFactory;
            }
            CacheDataSource.Factory factory2 = new CacheDataSource.Factory();
            factory2.setUpstreamDataSourceFactory(factory);
            factory2.setCache(cache);
            factory2.setCacheWriteDataSinkFactory(null);
            defaultMediaSourceFactory.setDataSourceFactory(factory2);
            return defaultMediaSourceFactory;
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
        public DefaultMediaSourceFactorySupplier setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
        public DefaultMediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class PreloadStatus {
        public static final PreloadStatus PRELOAD_STATUS_NOT_PRELOADED = new PreloadStatus(Integer.MIN_VALUE, C.TIME_UNSET, 0);
        public static final PreloadStatus PRELOAD_STATUS_SOURCE_PREPARED = new PreloadStatus(0, C.TIME_UNSET, 0);
        public static final PreloadStatus PRELOAD_STATUS_TRACKS_SELECTED = new PreloadStatus(1, C.TIME_UNSET, 0);
        public static final int STAGE_NOT_PRELOADED = Integer.MIN_VALUE;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_SPECIFIED_RANGE_CACHED = -1;
        public static final int STAGE_SPECIFIED_RANGE_LOADED = 2;
        public static final int STAGE_TRACKS_SELECTED = 1;
        public final long durationMs;
        public final int stage;
        public final long startPositionMs;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        private PreloadStatus(int i2, long j2, long j3) {
            an.l(j2 == C.TIME_UNSET || j2 >= 0);
            an.l(j3 == C.TIME_UNSET || j3 >= 0);
            this.stage = i2;
            this.startPositionMs = j2;
            this.durationMs = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPreCachingCategory() {
            return this.stage == -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPreloadingCategory() {
            int i2 = this.stage;
            return i2 == 0 || i2 == 1 || i2 == 2;
        }

        public static PreloadStatus specifiedRangeCached(long j2) {
            return new PreloadStatus(-1, C.TIME_UNSET, j2);
        }

        public static PreloadStatus specifiedRangeLoaded(long j2) {
            return new PreloadStatus(2, C.TIME_UNSET, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                PreloadStatus preloadStatus = (PreloadStatus) obj;
                if (this.stage == preloadStatus.stage && this.startPositionMs == preloadStatus.startPositionMs && this.durationMs == preloadStatus.durationMs) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.stage + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + ((int) this.startPositionMs)) * 31) + ((int) this.durationMs);
        }

        public static PreloadStatus specifiedRangeCached(long j2, long j3) {
            return new PreloadStatus(-1, j2, j3);
        }

        public static PreloadStatus specifiedRangeLoaded(long j2, long j3) {
            return new PreloadStatus(2, j2, j3);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends BasePreloadManager.BuilderBase<Integer, PreloadStatus> {
        private aj<BandwidthMeter> bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private Cache cache;
        private Executor cachingExecutor;
        private Clock clock;
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private aj<LoadControl> loadControlSupplier;
        private PlaybackLooperProvider preloadLooperProvider;
        private aj<RenderersFactory> renderersFactorySupplier;
        private TrackSelector.Factory trackSelectorFactory;

        public Builder(final Context context, SimpleRankingDataComparator simpleRankingDataComparator, TargetPreloadStatusControl<Integer, PreloadStatus> targetPreloadStatusControl) {
            super(simpleRankingDataComparator, targetPreloadStatusControl, new DefaultMediaSourceFactorySupplier(context));
            this.context = context;
            this.preloadLooperProvider = new PlaybackLooperProvider();
            this.trackSelectorFactory = new TrackSelector.Factory() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda3
                @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
                public final TrackSelector createTrackSelector(Context context2) {
                    return new DefaultTrackSelector(context2);
                }
            };
            this.bandwidthMeterSupplier = new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda4
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            };
            this.renderersFactorySupplier = an.a(new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda5
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return DefaultPreloadManager.Builder.lambda$new$1(context);
                }
            });
            this.loadControlSupplier = an.a(new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda6
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return new DefaultLoadControl();
                }
            });
            this.cachingExecutor = new Executor() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda7
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            this.clock = Clock.DEFAULT;
        }

        static /* synthetic */ RenderersFactory lambda$new$1(Context context) {
            return new DefaultRenderersFactory(context);
        }

        static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$0(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ LoadControl lambda$setLoadControl$0(LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ RenderersFactory lambda$setRenderersFactory$0(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public BasePreloadManager<Integer, PreloadStatus> build() {
            an.u(!this.buildCalled);
            this.buildCalled = true;
            return new DefaultPreloadManager(this);
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            builder.setMediaSourceFactory(this.mediaSourceFactorySupplier.get2());
            builder.setBandwidthMeter(this.bandwidthMeterSupplier.get2());
            builder.setRenderersFactory(this.renderersFactorySupplier.get2());
            builder.setLoadControl(this.loadControlSupplier.get2());
            builder.setPlaybackLooperProvider(this.preloadLooperProvider);
            builder.setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context));
            return builder.build();
        }

        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            an.u((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            an.l(bandwidthMeter != BandwidthMeter.NO_OP);
            this.bandwidthMeterSupplier = new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda2
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return bandwidthMeter;
                }
            };
            return this;
        }

        public Builder setCache(Cache cache) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.cache = cache;
            this.mediaSourceFactorySupplier.setCache(cache);
            return this;
        }

        public Builder setCachingExecutor(Executor executor) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.cachingExecutor = executor;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setDataSourceFactory(DataSource.Factory factory) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.dataSourceFactory = factory;
            this.mediaSourceFactorySupplier.setDataSourceFactory(factory);
            return this;
        }

        public Builder setLoadControl(final LoadControl loadControl) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.loadControlSupplier = new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda0
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return loadControl;
                }
            };
            return this;
        }

        @Deprecated
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.mediaSourceFactorySupplier = new MediaSourceFactorySupplier(this) { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.1
                {
                    Objects.requireNonNull(this);
                }

                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
                public MediaSourceFactorySupplier setCache(Cache cache) {
                    return this;
                }

                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
                public MediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory2) {
                    return this;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public MediaSource.Factory get2() {
                    return factory;
                }
            };
            return this;
        }

        public Builder setMediaSourceFactorySupplier(MediaSourceFactorySupplier mediaSourceFactorySupplier) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.mediaSourceFactorySupplier = mediaSourceFactorySupplier.setCache(this.cache).setDataSourceFactory(this.dataSourceFactory);
            return this;
        }

        public Builder setPreloadLooper(Looper looper) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled && looper != Looper.getMainLooper()) {
                z = true;
            }
            an.u(z);
            this.preloadLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.renderersFactorySupplier = new aj() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda1
                @Override // com.google.d.b.aj
                /* renamed from: get */
                public final Object get2() {
                    return renderersFactory;
                }
            };
            return this;
        }

        public Builder setTrackSelectorFactory(TrackSelector.Factory factory) {
            boolean z = false;
            if (!this.buildCalled && !this.buildExoPlayerCalled) {
                z = true;
            }
            an.u(z);
            this.trackSelectorFactory = factory;
            return this;
        }

        public Builder(Context context, TargetPreloadStatusControl<Integer, PreloadStatus> targetPreloadStatusControl) {
            this(context, new SimpleRankingDataComparator(), targetPreloadStatusControl);
        }

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.Builder(this.context));
        }
    }
}
