package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.SeekMap;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.d.fu;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS;

    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT;
    private static final int MODE_NOT_PREPARE = 0;
    private static final int MODE_PREPARE_NON_PROGRESSIVE_SOURCE_AND_SELECT_TRACKS = 2;
    private static final int MODE_PREPARE_PROGRESSIVE_SOURCE = 1;
    private static final String TAG = "DownloadHelper";
    private boolean areTracksSelected;
    private Callback callback;
    private final Handler callbackHandler;
    private final boolean debugLoggingEnabled;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final MediaItem.LocalConfiguration localConfiguration;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private MediaPreparer mediaPreparer;
    private final MediaSource mediaSource;
    private final int mode;
    private final RendererCapabilitiesList rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    /* compiled from: WazeSource */
    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper, boolean z);
    }

    /* compiled from: WazeSource */
    final class DownloadTrackSelection extends BaseTrackSelection {

        /* compiled from: WazeSource */
        final class Factory implements ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i2 = 0; i2 < definitionArr.length; i2++) {
                    ExoTrackSelection.Definition definition = definitionArr[i2];
                    exoTrackSelectionArr[i2] = definition == null ? null : new DownloadTrackSelection(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }
    }

    /* compiled from: WazeSource */
    public class LiveContentUnsupportedException extends IOException {
    }

    /* compiled from: WazeSource */
    final class MediaPreparer implements MediaSource.MediaSourceCaller, ProgressiveMediaSource.Listener, MediaPeriod.Callback, Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final DownloadHelper downloadHelper;
        public MediaPeriod[] mediaPeriods;
        private final MediaSource mediaSource;
        private final Handler mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private boolean released;
        public SeekMap seekMap;
        public Timeline timeline;
        private final Allocator allocator = new DefaultAllocator(true, 65536);
        private final ArrayList<MediaPeriod> pendingMediaPeriods = new ArrayList<>();
        private final Handler downloadHelperHandler = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$MediaPreparer$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleDownloadHelperCallbackMessage(message);
            }
        });

        public MediaPreparer(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(Message message) {
            if (this.released) {
                return false;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (ExoPlaybackException e2) {
                    this.downloadHelperHandler.obtainMessage(2, new IOException(e2)).sendToTarget();
                }
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            release();
            DownloadHelper downloadHelper = this.downloadHelper;
            Object obj = message.obj;
            int i3 = Util.SDK_INT;
            downloadHelper.onMediaPreparationFailed((IOException) obj);
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                MediaSource mediaSource = this.mediaSource;
                if (mediaSource instanceof ProgressiveMediaSource) {
                    ((ProgressiveMediaSource) mediaSource).setListener(this);
                }
                this.mediaSource.prepareSource(this, PlayerId.UNSET, BandwidthMeter.NO_OP);
                this.mediaSourceHandler.sendEmptyMessage(2);
                return true;
            }
            int i3 = 0;
            if (i2 == 2) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i3 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i3).maybeThrowPrepareError();
                            i3++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100L);
                } catch (IOException e2) {
                    this.downloadHelperHandler.obtainMessage(2, e2).sendToTarget();
                }
                return true;
            }
            if (i2 == 3) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    LoadingInfo.Builder builder = new LoadingInfo.Builder();
                    builder.setPlaybackPositionUs(0L);
                    mediaPeriod.continueLoading(builder.build());
                }
                return true;
            }
            if (i2 != 4) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                while (i3 < mediaPeriodArr.length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i3]);
                    i3++;
                }
            }
            MediaSource mediaSource2 = this.mediaSource;
            if (mediaSource2 instanceof ProgressiveMediaSource) {
                ((ProgressiveMediaSource) mediaSource2).clearListener();
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(3, mediaPeriod).sendToTarget();
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(2);
                this.downloadHelperHandler.sendEmptyMessage(1);
            }
        }

        @Override // androidx.media3.exoplayer.source.ProgressiveMediaSource.Listener
        public void onSeekMap(MediaSource mediaSource, SeekMap seekMap) {
            this.seekMap = seekMap;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(2, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new MediaPeriod[timeline.getPeriodCount()];
            int i2 = 0;
            while (true) {
                MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
                if (i2 >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i2)), this.allocator, 0L);
                this.mediaPeriods[i2] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i2++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(4);
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface Mode {
    }

    /* compiled from: WazeSource */
    final class UnreleaseableRendererCapabilitiesList implements RendererCapabilitiesList {
        private final RendererCapabilities[] rendererCapabilities;

        private UnreleaseableRendererCapabilitiesList(RendererCapabilities[] rendererCapabilitiesArr) {
            this.rendererCapabilities = rendererCapabilitiesArr;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public RendererCapabilities[] getRendererCapabilities() {
            return this.rendererCapabilities;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public void release() {
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public int size() {
            return this.rendererCapabilities.length;
        }
    }

    static {
        DefaultTrackSelector.Parameters.Builder builderBuildUpon = DefaultTrackSelector.Parameters.DEFAULT.buildUpon();
        builderBuildUpon.setForceHighestSupportedBitrate(true);
        builderBuildUpon.setConstrainAudioChannelCountToDeviceCapabilities(false);
        DefaultTrackSelector.Parameters parametersBuild = builderBuildUpon.build();
        DEFAULT_TRACK_SELECTOR_PARAMETERS = parametersBuild;
        DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = parametersBuild;
    }

    public DownloadHelper(MediaItem mediaItem, MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilitiesList rendererCapabilitiesList, boolean z) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        an.B(localConfiguration);
        this.localConfiguration = localConfiguration;
        this.mediaSource = mediaSource;
        this.mode = mediaSource == null ? 0 : mediaSource instanceof ProgressiveMediaSource ? 1 : 2;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesList;
        this.debugLoggingEnabled = z;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda4
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
            }

            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DefaultTrackSelector.Parameters parameters = DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS;
            }
        }, BandwidthMeter.NO_OP);
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void addTrackSelectionInternal(int i2, TrackSelectionParameters trackSelectionParameters) {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i2);
        fu fuVarListIterator = trackSelectionParameters.overrides.values().listIterator();
        while (fuVarListIterator.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType((TrackSelectionOverride) fuVarListIterator.next()).build());
            runTrackSelection(i2);
        }
    }

    private void assertPreparedWithMedia() {
        an.u(this.mode != 0);
        an.u(this.isPreparedWithMedia);
    }

    private void assertPreparedWithNonProgressiveSourceAndTracksSelected() {
        an.u(this.mode == 2);
        an.u(this.isPreparedWithMedia);
        an.u(this.areTracksSelected);
    }

    private void assertPreparedWithProgressiveSource() {
        an.u(this.mode == 1);
        an.u(this.isPreparedWithMedia);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, final DrmSessionManager drmSessionManager, aj<ReleasableExecutor> ajVar) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        an.B(localConfiguration);
        MediaSource.Factory factory2 = isProgressive(localConfiguration) ? new ProgressiveMediaSource.Factory(factory) : new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (ajVar != null) {
            factory2.setDownloadExecutor(ajVar);
        }
        if (drmSessionManager != null) {
            factory2.setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
                public final DrmSessionManager get(MediaItem mediaItem2) {
                    DrmSessionManager drmSessionManager2 = drmSessionManager;
                    DefaultTrackSelector.Parameters parameters = DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS;
                    return drmSessionManager2;
                }
            });
        }
        return factory2.createMediaSource(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        an.B(localConfiguration);
        an.l(isProgressive(localConfiguration));
        return new Factory().create(mediaItem);
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DEFAULT_TRACK_SELECTOR_PARAMETERS;
    }

    private DownloadRequest.Builder getDownloadRequestBuilder(String str, byte[] bArr) {
        MediaItem.LocalConfiguration localConfiguration = this.localConfiguration;
        DownloadRequest.Builder builder = new DownloadRequest.Builder(str, localConfiguration.uri);
        builder.setMimeType(localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        builder.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null);
        builder.setCustomCacheKey(this.localConfiguration.customCacheKey);
        builder.setData(bArr);
        if (this.mode == 2) {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = this.trackSelectionsByPeriodAndRenderer.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList2.clear();
                int length2 = this.trackSelectionsByPeriodAndRenderer[i2].length;
                for (int i3 = 0; i3 < length2; i3++) {
                    arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i2][i3]);
                }
                arrayList.addAll(this.mediaPreparer.mediaPeriods[i2].getStreamKeys(arrayList2));
            }
            builder.setStreamKeys(arrayList);
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    static /* synthetic */ DrmSessionManager lambda$createMediaSourceInternal$0(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    static /* synthetic */ void lambda$new$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMediaPreparationFailed$0(IOException iOException) {
        Callback callback = this.callback;
        an.B(callback);
        callback.onPrepareError(this, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMediaPrepared$0(boolean z) {
        Callback callback = this.callback;
        an.B(callback);
        callback.onPrepared(this, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$0(Callback callback) {
        callback.onPrepared(this, false);
    }

    private static void logTrackSelectorResult(int i2, TrackSelectorResult trackSelectorResult) {
        Log.d(TAG, "Track selections changed, period index: " + i2 + ", tracks [");
        bn<Tracks.Group> groups = trackSelectorResult.tracks.getGroups();
        for (int i3 = 0; i3 < groups.size(); i3++) {
            Tracks.Group group = groups.get(i3);
            Log.d(TAG, "  group [");
            for (int i4 = 0; i4 < group.length; i4++) {
                String str = true != group.isTrackSelected(i4) ? "[ ]" : "[X]";
                String formatSupportString = Util.getFormatSupportString(group.getTrackSupport(i4));
                Log.d(TAG, "    " + str + " Track:" + i4 + ", " + Format.toLogString(group.getTrackFormat(i4)) + ", supported=" + formatSupportString);
            }
            Log.d(TAG, "  ]");
        }
        Log.d(TAG, "]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final IOException iOException) {
        Handler handler = this.callbackHandler;
        an.B(handler);
        handler.post(new Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onMediaPreparationFailed$0(iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() {
        an.B(this.mediaPreparer);
        an.B(this.mediaPreparer.mediaPeriods);
        an.B(this.mediaPreparer.timeline);
        int i2 = this.mode;
        final boolean z = false;
        if (i2 == 2) {
            int length = this.mediaPreparer.mediaPeriods.length;
            int size = this.rendererCapabilities.size();
            this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            for (int i3 = 0; i3 < length; i3++) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.trackSelectionsByPeriodAndRenderer[i3][i4] = new ArrayList();
                    this.immutableTrackSelectionsByPeriodAndRenderer[i3][i4] = DesugarCollections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i3][i4]);
                }
            }
            this.trackGroupArrays = new TrackGroupArray[length];
            this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
            for (int i5 = 0; i5 < length; i5++) {
                this.trackGroupArrays[i5] = this.mediaPreparer.mediaPeriods[i5].getTrackGroups();
                this.trackSelector.onSelectionActivated(runTrackSelection(i5).info);
                MappingTrackSelector.MappedTrackInfo[] mappedTrackInfoArr = this.mappedTrackInfos;
                MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
                an.B(currentMappedTrackInfo);
                mappedTrackInfoArr[i5] = currentMappedTrackInfo;
            }
            setPreparedWithNonProgressiveSourceAndTracksSelected();
            z = true;
        } else {
            an.u(i2 == 1);
            an.B(this.mediaPreparer.seekMap);
            setPreparedWithProgressiveSource();
        }
        Handler handler = this.callbackHandler;
        an.B(handler);
        handler.post(new Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onMediaPrepared$0(z);
            }
        });
    }

    private void populateDownloadRequestBuilderWithByteRange(DownloadRequest.Builder builder, long j2, long j3) {
        long jMsToUs;
        assertPreparedWithProgressiveSource();
        Timeline timeline = this.mediaPreparer.timeline;
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        long jLongValue = ((Long) timeline.getPeriodPositionUs(window, period, 0, Util.msToUs(j2)).second).longValue();
        long j4 = -1;
        if (j3 != C.TIME_UNSET) {
            jMsToUs = Util.msToUs(j3) + jLongValue;
            long j5 = period.durationUs;
            if (j5 != C.TIME_UNSET) {
                jMsToUs = Math.min(jMsToUs, j5 - 1);
            }
        } else {
            jMsToUs = -9223372036854775807L;
        }
        SeekMap seekMap = this.mediaPreparer.seekMap;
        if (!seekMap.isSeekable()) {
            Log.w(TAG, "Cannot set download byte range for progressive stream that is unseekable");
            return;
        }
        long j6 = seekMap.getSeekPoints(jLongValue).first.position;
        if (jMsToUs != C.TIME_UNSET) {
            long j7 = seekMap.getSeekPoints(jMsToUs).second.position;
            if (jLongValue == jMsToUs || j6 != j7) {
                j4 = j7 - j6;
            }
        }
        builder.setByteRange(j6, j4);
    }

    private void populateDownloadRequestBuilderWithDownloadRange(DownloadRequest.Builder builder, long j2, long j3) {
        int i2 = this.mode;
        if (i2 == 1) {
            populateDownloadRequestBuilderWithByteRange(builder, j2, j3);
        } else {
            if (i2 != 2) {
                return;
            }
            populateDownloadRequestBuilderWithTimeRange(builder, j2, j3);
        }
    }

    private void populateDownloadRequestBuilderWithTimeRange(DownloadRequest.Builder builder, long j2, long j3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        Timeline.Window window = this.mediaPreparer.timeline.getWindow(0, new Timeline.Window());
        long defaultPositionUs = j2 == C.TIME_UNSET ? window.getDefaultPositionUs() : Util.msToUs(j2);
        long durationUs = window.getDurationUs();
        long jMsToUs = j3 == C.TIME_UNSET ? durationUs : Util.msToUs(j3);
        if (durationUs != C.TIME_UNSET) {
            defaultPositionUs = Math.min(defaultPositionUs, durationUs);
            jMsToUs = Math.min(jMsToUs, durationUs - defaultPositionUs);
        }
        builder.setTimeRange(defaultPositionUs, jMsToUs);
    }

    private TrackSelectorResult runTrackSelection(int i2) {
        SparseIntArray sparseIntArray;
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities.getRendererCapabilities(), this.trackGroupArrays[i2], new MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i2)), this.mediaPreparer.timeline);
        for (int i3 = 0; i3 < trackSelectorResultSelectTracks.length; i3++) {
            ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i3];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i2][i3];
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        list.add(exoTrackSelection);
                        break;
                    }
                    ExoTrackSelection exoTrackSelection2 = list.get(i4);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i5 = 0; i5 < exoTrackSelection2.length(); i5++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i5), 0);
                        }
                        int i6 = 0;
                        while (true) {
                            int length = exoTrackSelection.length();
                            sparseIntArray = this.scratchSet;
                            if (i6 >= length) {
                                break;
                            }
                            sparseIntArray.put(exoTrackSelection.getIndexInTrackGroup(i6), 0);
                            i6++;
                        }
                        int[] iArr = new int[sparseIntArray.size()];
                        for (int i7 = 0; i7 < this.scratchSet.size(); i7++) {
                            iArr[i7] = this.scratchSet.keyAt(i7);
                        }
                        list.set(i4, new DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (this.debugLoggingEnabled) {
            logTrackSelectorResult(i2, trackSelectorResultSelectTracks);
        }
        return trackSelectorResultSelectTracks;
    }

    private void setPreparedWithNonProgressiveSourceAndTracksSelected() {
        this.isPreparedWithMedia = true;
        this.areTracksSelected = true;
    }

    private void setPreparedWithProgressiveSource() {
        this.isPreparedWithMedia = true;
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                builderBuildUpon.setPreferredAudioLanguage(str);
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.build();
                for (int i2 = 0; i2 < periodCount; i2++) {
                    addTrackSelectionInternal(i2, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void addTextLanguagesToSelection(boolean z, String... strArr) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                builderBuildUpon.setPreferredTextLanguage(str);
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.build();
                for (int i2 = 0; i2 < periodCount; i2++) {
                    addTrackSelectionInternal(i2, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void addTrackSelection(int i2, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            addTrackSelectionInternal(i2, trackSelectionParameters);
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i2, int i3, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            int i4 = 0;
            while (i4 < this.mappedTrackInfos[i2].getRendererCount()) {
                builderBuildUpon.setRendererDisabled(i4, i4 != i3);
                i4++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i2, builderBuildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i2].getTrackGroups(i3);
            for (int i5 = 0; i5 < list.size(); i5++) {
                builderBuildUpon.setSelectionOverride(i3, trackGroups, list.get(i5));
                addTrackSelectionInternal(i2, builderBuildUpon.build());
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void clearTrackSelections(int i2) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        for (int i3 = 0; i3 < this.rendererCapabilities.size(); i3++) {
            this.trackSelectionsByPeriodAndRenderer[i2][i3].clear();
        }
    }

    public DownloadRequest getDownloadRequest(String str, byte[] bArr, long j2, long j3) {
        DownloadRequest.Builder downloadRequestBuilder = getDownloadRequestBuilder(str, bArr);
        assertPreparedWithMedia();
        populateDownloadRequestBuilderWithDownloadRange(downloadRequestBuilder, j2, j3);
        return downloadRequestBuilder.build();
    }

    public Object getManifest() {
        if (this.mode == 0) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i2) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.mappedTrackInfos[i2];
    }

    public int getPeriodCount() {
        if (this.mode == 0) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.mediaPreparer.mediaPeriods.length;
    }

    public TrackGroupArray getTrackGroups(int i2) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.trackGroupArrays[i2];
    }

    public List<ExoTrackSelection> getTrackSelections(int i2, int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i2][i3];
    }

    public Tracks getTracks(int i2) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i2], this.immutableTrackSelectionsByPeriodAndRenderer[i2]);
    }

    public void prepare(final Callback callback) {
        an.u(this.callback == null);
        this.callback = callback;
        if (this.mode == 0) {
            this.callbackHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$prepare$0(callback);
                }
            });
            return;
        }
        MediaSource mediaSource = this.mediaSource;
        an.B(mediaSource);
        this.mediaPreparer = new MediaPreparer(mediaSource, this);
    }

    public void release() {
        MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
        this.rendererCapabilities.release();
    }

    public void replaceTrackSelections(int i2, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            clearTrackSelections(i2);
            addTrackSelectionInternal(i2, trackSelectionParameters);
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    public DownloadRequest getDownloadRequest(String str, byte[] bArr) {
        return getDownloadRequestBuilder(str, bArr).build();
    }

    public DownloadRequest getDownloadRequest(byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public DownloadRequest getDownloadRequest(byte[] bArr, long j2, long j3) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr, j2, j3);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, DataSource.Factory factory) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, DataSource.Factory factory, boolean z) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setDebugLoggingEnabled(z);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, RenderersFactory renderersFactory, DataSource.Factory factory) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setRenderersFactory(renderersFactory);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, RenderersFactory renderersFactory, DataSource.Factory factory, boolean z) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setRenderersFactory(renderersFactory);
        factory2.setDebugLoggingEnabled(z);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setTrackSelectionParameters(trackSelectionParameters);
        factory2.setRenderersFactory(renderersFactory);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory, DrmSessionManager drmSessionManager) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setTrackSelectionParameters(trackSelectionParameters);
        factory2.setRenderersFactory(renderersFactory);
        factory2.setDrmSessionManager(drmSessionManager);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory, DrmSessionManager drmSessionManager, boolean z) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setTrackSelectionParameters(trackSelectionParameters);
        factory2.setRenderersFactory(renderersFactory);
        factory2.setDrmSessionManager(drmSessionManager);
        factory2.setDebugLoggingEnabled(z);
        return factory2.create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory, boolean z) {
        Factory factory2 = new Factory();
        factory2.setDataSourceFactory(factory);
        factory2.setTrackSelectionParameters(trackSelectionParameters);
        factory2.setRenderersFactory(renderersFactory);
        factory2.setDebugLoggingEnabled(z);
        return factory2.create(mediaItem);
    }

    public DownloadHelper(MediaItem mediaItem, MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilitiesList rendererCapabilitiesList) {
        this(mediaItem, mediaSource, trackSelectionParameters, rendererCapabilitiesList, false);
    }

    /* compiled from: WazeSource */
    public final class Factory {
        private DataSource.Factory dataSourceFactory;
        private boolean debugLoggingEnabled;
        private DrmSessionManager drmSessionManager;
        private RenderersFactory renderersFactory;
        private TrackSelectionParameters trackSelectionParameters = DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS;
        private aj<ReleasableExecutor> loadExecutorSupplier = null;

        public DownloadHelper create(MediaItem mediaItem) {
            MediaSource mediaSourceCreateMediaSourceInternal;
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            an.B(localConfiguration);
            boolean zIsProgressive = DownloadHelper.isProgressive(localConfiguration);
            boolean z = true;
            if (!zIsProgressive && this.dataSourceFactory == null) {
                z = false;
            }
            an.l(z);
            if (zIsProgressive && this.dataSourceFactory == null) {
                mediaSourceCreateMediaSourceInternal = null;
            } else {
                DataSource.Factory factory = this.dataSourceFactory;
                int i2 = Util.SDK_INT;
                mediaSourceCreateMediaSourceInternal = DownloadHelper.createMediaSourceInternal(mediaItem, factory, this.drmSessionManager, this.loadExecutorSupplier);
            }
            TrackSelectionParameters trackSelectionParameters = this.trackSelectionParameters;
            RenderersFactory renderersFactory = this.renderersFactory;
            return new DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, renderersFactory != null ? new DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList() : new UnreleaseableRendererCapabilitiesList(new RendererCapabilities[0]), this.debugLoggingEnabled);
        }

        public Factory setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public Factory setDebugLoggingEnabled(boolean z) {
            this.debugLoggingEnabled = z;
            return this;
        }

        public Factory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            this.drmSessionManager = drmSessionManager;
            return this;
        }

        public Factory setLoadExecutor(aj<ReleasableExecutor> ajVar) {
            this.loadExecutorSupplier = ajVar;
            return this;
        }

        public Factory setRenderersFactory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
            return this;
        }

        public Factory setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
            this.trackSelectionParameters = trackSelectionParameters;
            return this;
        }

        public DownloadHelper create(MediaSource mediaSource) {
            RendererCapabilitiesList unreleaseableRendererCapabilitiesList;
            MediaItem mediaItem = mediaSource.getMediaItem();
            TrackSelectionParameters trackSelectionParameters = this.trackSelectionParameters;
            RenderersFactory renderersFactory = this.renderersFactory;
            if (renderersFactory != null) {
                unreleaseableRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList();
            } else {
                unreleaseableRendererCapabilitiesList = new UnreleaseableRendererCapabilitiesList(new RendererCapabilities[0]);
            }
            return new DownloadHelper(mediaItem, mediaSource, trackSelectionParameters, unreleaseableRendererCapabilitiesList, this.debugLoggingEnabled);
        }
    }
}
