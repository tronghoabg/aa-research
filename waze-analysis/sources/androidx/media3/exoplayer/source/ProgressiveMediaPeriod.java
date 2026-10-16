package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.IcyDataSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.ForwardingTrackOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.d.b.an;
import com.google.d.d.bq;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final Format ICY_FORMAT;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final String TAG = "ProgressiveMediaPeriod";
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private ControlledTrackOutput[] controlledTrackOutputs;
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private long endPositionUs = Long.MIN_VALUE;
    private final boolean experimentalEnableHagcPlayback;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final boolean loadOnlySelectedTracks;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final List<MergingMetadataSampleStream> mergingSampleStreams;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private boolean pendingInitialDiscontinuity;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private final Format singleTrackFormat;
    private final int singleTrackId;
    private TrackState trackState;
    private final Uri uri;
    private boolean usesStreamPrerollFlags;

    /* compiled from: WazeSource */
    final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private DataSpec dataSpec;
        private final ExtractorOutput extractorOutput;
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final long loadTaskId;
        private boolean pendingExtractorSeek;
        private final PositionHolder positionHolder;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        final /* synthetic */ ProgressiveMediaPeriod this$0;
        private final Uri uri;

        public ExtractingLoadable(ProgressiveMediaPeriod progressiveMediaPeriod, Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            Objects.requireNonNull(progressiveMediaPeriod);
            this.this$0 = progressiveMediaPeriod;
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
            this.positionHolder = new PositionHolder();
            this.pendingExtractorSeek = true;
            this.loadTaskId = LoadEventInfo.getNewId();
            this.dataSpec = buildDataSpec(0L, null);
        }

        private DataSpec buildDataSpec(long j2, String str) {
            Map<String, String> mapA = ProgressiveMediaPeriod.ICY_METADATA_HEADERS;
            if (str != null && !str.startsWith("W/")) {
                bq bqVar = new bq();
                bqVar.e(mapA.entrySet());
                bqVar.d("If-Range", str);
                mapA = bqVar.a();
            }
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.setUri(this.uri);
            builder.setPosition(j2);
            builder.setKey(this.this$0.customCacheKey);
            builder.setFlags(6);
            builder.setHttpRequestHeaders(mapA);
            return builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j2, long j3) {
            this.positionHolder.position = j2;
            this.seekTimeUs = j3;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws Throwable {
            int i2 = 0;
            String str = null;
            int i3 = 0;
            while (i3 == 0 && !this.loadCanceled) {
                try {
                    long j2 = this.positionHolder.position;
                    DataSpec dataSpecBuildDataSpec = buildDataSpec(j2, str);
                    this.dataSpec = dataSpecBuildDataSpec;
                    long jOpen = this.dataSource.open(dataSpecBuildDataSpec);
                    if (this.loadCanceled) {
                        if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                            this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                        }
                        DataSourceUtil.closeQuietly(this.dataSource);
                        return;
                    }
                    List<String> list = this.dataSource.getResponseHeaders().get("ETag");
                    str = (list == null || list.isEmpty()) ? null : list.get(0);
                    if (jOpen != -1) {
                        jOpen += j2;
                        this.this$0.onLengthKnown();
                    }
                    long j3 = jOpen;
                    this.this$0.icyHeaders = IcyHeaders.parse(this.dataSource.getResponseHeaders());
                    DataReader icyDataSource = this.dataSource;
                    if (this.this$0.icyHeaders != null && this.this$0.icyHeaders.metadataInterval != -1) {
                        icyDataSource = new IcyDataSource(this.dataSource, this.this$0.icyHeaders.metadataInterval, this);
                        TrackOutput trackOutputIcyTrack = this.this$0.icyTrack();
                        this.icyTrackOutput = trackOutputIcyTrack;
                        trackOutputIcyTrack.format(ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    this.progressiveMediaExtractor.init(icyDataSource, this.uri, this.dataSource.getResponseHeaders(), j2, j3, this.extractorOutput);
                    if (this.this$0.icyHeaders != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(j2, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 != 0) {
                            break;
                        }
                        try {
                            if (this.loadCanceled) {
                                i4 = 0;
                                break;
                            }
                            try {
                                this.loadCondition.block();
                                i4 = this.progressiveMediaExtractor.read(this.positionHolder);
                                long currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                                if (currentInputPosition > this.this$0.continueLoadingCheckIntervalBytes + j2) {
                                    this.loadCondition.close();
                                    this.this$0.handler.post(this.this$0.onContinueLoadingRequestedRunnable);
                                    j2 = currentInputPosition;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = i4;
                            if (i2 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                                this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                            }
                            DataSourceUtil.closeQuietly(this.dataSource);
                            throw th;
                        }
                    }
                    if (i4 == 1) {
                        i3 = 0;
                    } else {
                        if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                            this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                        }
                        i3 = i4;
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long jMax = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(this.this$0.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            int iBytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = this.icyTrackOutput;
            an.B(trackOutput);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    /* compiled from: WazeSource */
    interface Listener {
        void onSourceInfoRefreshed(long j2, SeekMap seekMap, boolean z);
    }

    /* compiled from: WazeSource */
    final class SampleStreamImpl implements SampleStream {
        private final boolean hasPreroll;
        final /* synthetic */ ProgressiveMediaPeriod this$0;
        private final int track;

        private SampleStreamImpl(ProgressiveMediaPeriod progressiveMediaPeriod, int i2, boolean z) {
            Objects.requireNonNull(progressiveMediaPeriod);
            this.this$0 = progressiveMediaPeriod;
            this.track = i2;
            this.hasPreroll = z;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int getFlags() {
            return this.hasPreroll ? 4 : 0;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.this$0.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.this$0.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            return this.this$0.readData(this.track, formatHolder, decoderInputBuffer, i2);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j2) {
            return this.this$0.skipData(this.track, j2);
        }
    }

    /* compiled from: WazeSource */
    final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int i2, boolean z) {
            this.id = i2;
            this.isIcyTrack = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                TrackId trackId = (TrackId) obj;
                if (this.id == trackId.id && this.isIcyTrack == trackId.isIcyTrack) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    /* compiled from: WazeSource */
    final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i2 = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i2];
            this.trackNotifiedDownstreamFormats = new boolean[i2];
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.setId("icy");
        builder.setSampleMimeType(MimeTypes.APPLICATION_ICY);
        ICY_FORMAT = builder.build();
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, String str, int i2, boolean z, boolean z2, int i3, Format format, long j2, ReleasableExecutor releasableExecutor) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i2;
        this.loadOnlySelectedTracks = z;
        this.experimentalEnableHagcPlayback = z2;
        this.singleTrackId = i3;
        this.singleTrackFormat = format;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j2;
        this.loadCondition = new ConditionVariable();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.maybeFinishPrepare();
            }
        };
        this.onContinueLoadingRequestedRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.handler = Util.createHandlerForCurrentLooper();
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.controlledTrackOutputs = new ControlledTrackOutput[0];
        this.mergingSampleStreams = new ArrayList();
        this.pendingResetPositionUs = C.TIME_UNSET;
        this.dataType = 1;
    }

    private void assertPrepared() {
        an.u(this.prepared);
        an.B(this.trackState);
        an.B(this.seekMap);
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i2) {
        SeekMap seekMap;
        if (this.isLengthKnown || !((seekMap = this.seekMap) == null || seekMap.getDurationUs() == C.TIME_UNSET)) {
            this.extractedSamplesCountAtStartOfLoad = i2;
            return true;
        }
        boolean z = this.prepared;
        if (z && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = z;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return DesugarCollections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getLargestQueuedTimestampUs(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            androidx.media3.exoplayer.source.SampleQueue[] r3 = r5.sampleQueues
            int r3 = r3.length
            if (r0 >= r3) goto L27
            if (r6 != 0) goto L18
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod$TrackState r3 = r5.trackState
            com.google.d.b.an.B(r3)
            r4 = r3
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod$TrackState r4 = (androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackState) r4
            boolean[] r3 = r3.trackEnabledStates
            boolean r3 = r3[r0]
            if (r3 == 0) goto L24
        L18:
            androidx.media3.exoplayer.source.SampleQueue[] r3 = r5.sampleQueues
            r3 = r3[r0]
            long r3 = r3.getLargestQueuedTimestampUs()
            long r1 = java.lang.Math.max(r1, r3)
        L24:
            int r0 = r0 + 1
            goto L3
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.getLargestQueuedTimestampUs(boolean):long");
    }

    private static int getTrackTypePriority(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : 2;
        }
        return 1;
    }

    private boolean haveSampleQueuesReachedEndTimeUs() {
        int i2 = 0;
        if (this.endPositionUs == Long.MIN_VALUE) {
            return false;
        }
        assertPrepared();
        boolean zHasQueuedTimestampsUpToReadEndTimeUs = true;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i2 >= sampleQueueArr.length) {
                return zHasQueuedTimestampsUpToReadEndTimeUs;
            }
            TrackState trackState = this.trackState;
            if (trackState.trackEnabledStates[i2] && (trackState.trackIsAudioVideoFlags[i2] || !this.haveAudioVideoTracks)) {
                zHasQueuedTimestampsUpToReadEndTimeUs &= sampleQueueArr[i2].hasQueuedTimestampsUpToReadEndTimeUs();
            }
            i2++;
        }
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.released) {
            return;
        }
        MediaPeriod.Callback callback = this.callback;
        an.B(callback);
        callback.onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$0() {
        this.isLengthKnown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Format upstreamFormat = this.sampleQueues[i4].getUpstreamFormat();
            an.B(upstreamFormat);
            int trackType = MimeTypes.getTrackType(upstreamFormat.sampleMimeType);
            int trackTypePriority = getTrackTypePriority(trackType);
            int trackTypePriority2 = getTrackTypePriority(i2);
            if (trackTypePriority > trackTypePriority2) {
                i2 = trackType;
            }
            if (trackTypePriority > trackTypePriority2) {
                i3 = i4;
            }
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            Format upstreamFormat2 = this.sampleQueues[i5].getUpstreamFormat();
            an.B(upstreamFormat2);
            String str = upstreamFormat2.sampleMimeType;
            boolean zIsAudio = MimeTypes.isAudio(str);
            boolean z = zIsAudio || MimeTypes.isVideo(str);
            zArr[i5] = z;
            this.haveAudioVideoTracks = z | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != C.TIME_UNSET && length == 1 && MimeTypes.isImage(str);
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (zIsAudio || this.sampleQueueTrackIds[i5].isIcyTrack) {
                    Metadata metadata = upstreamFormat2.metadata;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders);
                    Format.Builder builderBuildUpon = upstreamFormat2.buildUpon();
                    builderBuildUpon.setMetadata(metadata2);
                    upstreamFormat2 = builderBuildUpon.build();
                }
                if (zIsAudio && upstreamFormat2.averageBitrate == -1 && upstreamFormat2.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    Format.Builder builderBuildUpon2 = upstreamFormat2.buildUpon();
                    builderBuildUpon2.setAverageBitrate(icyHeaders.bitrate);
                    upstreamFormat2 = builderBuildUpon2.build();
                }
            }
            Format formatCopyWithCryptoType = upstreamFormat2.copyWithCryptoType(this.drmSessionManager.getCryptoType(upstreamFormat2));
            if (i5 != i3) {
                Format.Builder builderBuildUpon3 = formatCopyWithCryptoType.buildUpon();
                builderBuildUpon3.setPrimaryTrackGroupId(Integer.toString(i3));
                formatCopyWithCryptoType = builderBuildUpon3.build();
            }
            trackGroupArr[i5] = new TrackGroup(Integer.toString(i5), formatCopyWithCryptoType);
            this.sampleQueues[i5].setReadEndTimeUs(this.endPositionUs);
        }
        this.trackState = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        if (this.isSingleSample && this.durationUs == C.TIME_UNSET) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new ForwardingSeekMap(this, this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                final /* synthetic */ ProgressiveMediaPeriod this$0;

                {
                    Objects.requireNonNull(this);
                    this.this$0 = this;
                }

                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public long getDurationUs() {
                    return this.this$0.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap, this.isLive);
        this.prepared = true;
        MediaPeriod.Callback callback = this.callback;
        an.B(callback);
        callback.onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i2) {
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (zArr[i2]) {
            return;
        }
        Format format = trackState.tracks.get(i2).getFormat(0);
        this.mediaSourceEventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
        zArr[i2] = true;
    }

    private void maybeStartDeferredRetry(int i2) {
        assertPrepared();
        if (this.pendingDeferredRetry) {
            if (!this.haveAudioVideoTracks || this.trackState.trackIsAudioVideoFlags[i2]) {
                if (this.sampleQueues[i2].isReady(false)) {
                    return;
                }
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (SampleQueue sampleQueue : this.sampleQueues) {
                    sampleQueue.reset();
                }
                MediaPeriod.Callback callback = this.callback;
                an.B(callback);
                callback.onContinueLoadingRequested(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onLengthKnown$0();
            }
        });
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (trackId.equals(this.sampleQueueTrackIds[i2])) {
                return this.sampleQueues[i2];
            }
        }
        if (this.sampleQueuesBuilt) {
            Log.w(TAG, "Extractor added new track (id=" + trackId.id + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        ControlledTrackOutput controlledTrackOutput = new ControlledTrackOutput(sampleQueueCreateWithDrm);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i3 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i3);
        trackIdArr[length] = trackId;
        int i4 = Util.SDK_INT;
        this.sampleQueueTrackIds = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i3);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.sampleQueues = sampleQueueArr;
        ControlledTrackOutput[] controlledTrackOutputArr = (ControlledTrackOutput[]) Arrays.copyOf(this.controlledTrackOutputs, i3);
        controlledTrackOutputArr[length] = controlledTrackOutput;
        this.controlledTrackOutputs = controlledTrackOutputArr;
        return controlledTrackOutput;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j2, boolean z) {
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            SampleQueue sampleQueue = this.sampleQueues[i2];
            if (this.controlledTrackOutputs[i2].isSelected() && (sampleQueue.getReadIndex() != 0 || !z)) {
                if (!(this.isSingleSample ? sampleQueue.seekTo(sampleQueue.getFirstIndex()) : sampleQueue.seekTo(j2, this.loadingFinished)) && (zArr[i2] || !this.haveAudioVideoTracks)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$0(SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new SeekMap.Unseekable(C.TIME_UNSET);
        this.durationUs = seekMap.getDurationUs();
        boolean z = false;
        if (!this.isLengthKnown && seekMap.getDurationUs() == C.TIME_UNSET) {
            z = true;
        }
        this.isLive = z;
        this.dataType = true == z ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap, z);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this, this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            an.u(isPendingReset());
            long j2 = this.endPositionUs;
            if (j2 == Long.MIN_VALUE) {
                j2 = this.durationUs;
            }
            if (j2 != C.TIME_UNSET && this.pendingResetPositionUs > j2) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = C.TIME_UNSET;
                return;
            }
            SeekMap seekMap = this.seekMap;
            an.B(seekMap);
            extractingLoadable.setLoadPosition(seekMap.getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = C.TIME_UNSET;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if ((this.prepared || this.singleTrackFormat != null) && this.enabledTrackCount == 0) {
            return false;
        }
        ConditionVariable conditionVariable = this.loadCondition;
        Loader loader = this.loader;
        boolean zOpen = conditionVariable.open();
        if (loader.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.sampleQueues[i2].discardTo(j2, z, zArr[i2]);
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j2);
        return seekParameters.resolveSeekPositionUs(j2, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                TrackState trackState = this.trackState;
                if (trackState.trackIsAudioVideoFlags[i2] && trackState.trackEnabledStates[i2] && !this.sampleQueues[i2].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i2].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        return largestQueuedTimestampUs == Long.MIN_VALUE ? this.lastSeekPositionUs : largestQueuedTimestampUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    TrackOutput icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished && this.loader.isLoading() && this.loadCondition.isOpen();
    }

    boolean isReady(int i2) {
        return !suppressRead() && this.sampleQueues[i2].isReady(this.loadingFinished);
    }

    void maybeThrowError() throws IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j2, long j3, boolean z) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            MediaPeriod.Callback callback = this.callback;
            an.B(callback);
            callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j2, long j3) {
        if (this.durationUs == C.TIME_UNSET && this.seekMap != null) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j4 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j4;
            this.listener.onSourceInfoRefreshed(j4, this.seekMap, this.isLive);
        }
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        MediaPeriod.Callback callback = this.callback;
        an.B(callback);
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j2, long j3, IOException iOException, int i2) {
        ExtractingLoadable extractingLoadable2;
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs)), iOException, i2));
        if (retryDelayMsFor == C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
            extractingLoadable2 = extractingLoadable;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            extractingLoadable2 = extractingLoadable;
            loadErrorActionCreateRetryAction = configureRetry(extractingLoadable2, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable2.seekTimeUs, this.durationUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable2.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(ExtractingLoadable extractingLoadable, long j2, long j3, int i2) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        this.mediaSourceEventDispatcher.loadStarted(i2 == 0 ? new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, j2) : new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead()), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, i2);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        this.callback = callback;
        if (this.singleTrackFormat == null) {
            this.loadCondition.open();
            startLoading();
        } else {
            track(this.singleTrackId, 3).format(this.singleTrackFormat);
            lambda$seekMap$0(new IndexSeekMap(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.pendingResetPositionUs = j2;
        }
    }

    int readData(int i2, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i3) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i2);
        int i4 = this.sampleQueues[i2].read(formatHolder, decoderInputBuffer, i3, this.loadingFinished);
        if (i4 != -3) {
            return i4;
        }
        maybeStartDeferredRetry(i2);
        return -3;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.usesStreamPrerollFlags && this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
        } else {
            if (!this.notifyDiscontinuity) {
                return C.TIME_UNSET;
            }
            if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
                return C.TIME_UNSET;
            }
            this.notifyDiscontinuity = false;
        }
        return this.lastSeekPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        if (this.enabledTrackCount <= 0 || isPendingReset() || !haveSampleQueuesReachedEndTimeUs()) {
            return;
        }
        this.loadingFinished = true;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$seekMap$0(seekMap);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j2) {
        Iterator<MergingMetadataSampleStream> it = this.mergingSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (true != this.seekMap.isSeekable()) {
            j2 = 0;
        }
        int i2 = 0;
        this.notifyDiscontinuity = false;
        boolean z = this.lastSeekPositionUs == j2;
        this.lastSeekPositionUs = j2;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j2;
            return j2;
        }
        if (this.dataType == 7 || ((!this.loadingFinished && !this.loader.isLoading()) || !seekInsideBufferUs(zArr, j2, z))) {
            this.pendingDeferredRetry = false;
            this.pendingResetPositionUs = j2;
            this.loadingFinished = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].discardToEnd();
                    i2++;
                }
                this.loader.cancelLoading();
                return j2;
            }
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i2 < length2) {
                sampleQueueArr2[i2].reset();
                i2++;
            }
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r22, boolean[] r23, androidx.media3.exoplayer.source.SampleStream[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[], boolean[], androidx.media3.exoplayer.source.SampleStream[], boolean[], long):long");
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j2) {
        this.endPositionUs = j2;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setReadEndTimeUs(j2);
        }
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void setUsesStreamPrerollFlags() {
        this.usesStreamPrerollFlags = true;
    }

    int skipData(int i2, long j2) throws Throwable {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i2);
        SampleQueue sampleQueue = this.sampleQueues[i2];
        int skipCount = sampleQueue.getSkipCount(j2, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount != 0) {
            return skipCount;
        }
        maybeStartDeferredRetry(i2);
        return 0;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i2, int i3) {
        return prepareTrackOutput(new TrackId(i2, false));
    }

    /* compiled from: WazeSource */
    class ControlledTrackOutput extends ForwardingTrackOutput {
        private final DiscardingTrackOutput discardingTrackOutput;
        private final AtomicReference<OutputMode> outputMode;
        private final SampleQueue sampleQueue;

        /* compiled from: WazeSource */
        enum OutputMode {
            PASS_THROUGH,
            DISCARD_AFTER_NEXT_SAMPLE_METADATA,
            DISCARDING
        }

        ControlledTrackOutput(SampleQueue sampleQueue) {
            super(sampleQueue);
            this.sampleQueue = sampleQueue;
            this.discardingTrackOutput = new DiscardingTrackOutput();
            this.outputMode = new AtomicReference<>(OutputMode.PASS_THROUGH);
        }

        private TrackOutput getCurrentOutput() {
            return this.outputMode.get() == OutputMode.DISCARDING ? this.discardingTrackOutput : this.sampleQueue;
        }

        boolean isSelected() {
            return this.outputMode.get() == OutputMode.PASS_THROUGH;
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i2, boolean z) {
            return getCurrentOutput().sampleData(dataReader, i2, z);
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j2, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
            getCurrentOutput().sampleMetadata(j2, i2, i3, i4, cryptoData);
            if (this.outputMode.get() == OutputMode.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
                this.sampleQueue.reset();
                this.outputMode.set(OutputMode.DISCARDING);
            }
        }

        void updateSelectionState(boolean z) {
            this.outputMode.set(z ? OutputMode.PASS_THROUGH : OutputMode.DISCARD_AFTER_NEXT_SAMPLE_METADATA);
            if (z) {
                return;
            }
            this.sampleQueue.discardToEnd();
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i2, boolean z, int i3) {
            return getCurrentOutput().sampleData(dataReader, i2, z, i3);
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i2) {
            getCurrentOutput().sampleData(parsableByteArray, i2);
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
            getCurrentOutput().sampleData(parsableByteArray, i2, i3);
        }
    }

    void maybeThrowError(int i2) throws IOException {
        this.sampleQueues[i2].maybeThrowError();
        maybeThrowError();
    }
}
