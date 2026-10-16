package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.d.b.an;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {
    private static final String TAG = "ChunkSampleStream";
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> callback;
    private BaseMediaChunk canceledMediaChunk;
    private final BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final SampleQueue[] embeddedSampleQueues;
    private final Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private long endPositionUs;
    private boolean hasInitialDiscontinuity;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private Chunk loadingChunk;
    boolean loadingFinished;
    private final ArrayList<BaseMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean needToEvaluateInitialDiscontinuity;
    private final ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private Format primaryDownstreamTrackFormat;
    private final SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final List<BaseMediaChunk> readOnlyMediaChunks;
    private ReleaseCallback<T> releaseCallback;
    private boolean suppressRead;
    private boolean usesStreamPrerollFlags;

    /* compiled from: WazeSource */
    public final class EmbeddedSampleStream implements SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final ChunkSampleStream<T> parent;
        private final SampleQueue sampleQueue;
        final /* synthetic */ ChunkSampleStream this$0;

        public EmbeddedSampleStream(ChunkSampleStream chunkSampleStream, ChunkSampleStream<T> chunkSampleStream2, SampleQueue sampleQueue, int i2) {
            Objects.requireNonNull(chunkSampleStream);
            this.this$0 = chunkSampleStream;
            this.parent = chunkSampleStream2;
            this.sampleQueue = sampleQueue;
            this.index = i2;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            ChunkSampleStream chunkSampleStream = this.this$0;
            int i2 = this.index;
            MediaSourceEventListener.EventDispatcher eventDispatcher = chunkSampleStream.mediaSourceEventDispatcher;
            int i3 = chunkSampleStream.embeddedTrackTypes[i2];
            ChunkSampleStream chunkSampleStream2 = this.this$0;
            eventDispatcher.downstreamFormatChanged(i3, chunkSampleStream2.embeddedTrackFormats[this.index], 0, null, this.this$0.lastSeekPositionUs);
            this.notifiedDownstreamFormat = true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public /* synthetic */ int getFlags() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !this.this$0.isPendingReset() && this.sampleQueue.isReady(this.this$0.loadingFinished);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (this.this$0.isPendingReset()) {
                return -3;
            }
            if (this.this$0.canceledMediaChunk != null) {
                if (this.this$0.canceledMediaChunk.getFirstSampleIndex(this.index + 1) <= this.sampleQueue.getReadIndex()) {
                    return -3;
                }
            }
            maybeNotifyDownstreamFormat();
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i2, this.this$0.loadingFinished);
        }

        public void release() {
            an.u(this.this$0.embeddedTracksSelected[this.index]);
            this.this$0.embeddedTracksSelected[this.index] = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j2) throws Throwable {
            if (this.this$0.isPendingReset()) {
                return 0;
            }
            int skipCount = this.sampleQueue.getSkipCount(j2, this.this$0.loadingFinished);
            if (this.this$0.canceledMediaChunk != null) {
                skipCount = Math.min(skipCount, this.this$0.canceledMediaChunk.getFirstSampleIndex(this.index + 1) - this.sampleQueue.getReadIndex());
            }
            this.sampleQueue.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }
    }

    /* compiled from: WazeSource */
    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i2, int[] iArr, Format[] formatArr, T t, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j2, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, boolean z, long j3, ReleasableExecutor releasableExecutor) {
        this.primaryTrackType = i2;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr == null ? new Format[0] : formatArr;
        this.chunkSource = t;
        this.callback = callback;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.nextChunkHolder = new ChunkHolder();
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        SampleQueue[] sampleQueueArr = new SampleQueue[i3];
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(allocator, drmSessionManager, eventDispatcher);
        this.primarySampleQueue = sampleQueueCreateWithDrm;
        iArr2[0] = i2;
        sampleQueueArr[0] = sampleQueueCreateWithDrm;
        int i4 = 0;
        while (i4 < length) {
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(allocator);
            this.embeddedSampleQueues[i4] = sampleQueueCreateWithoutDrm;
            int i5 = i4 + 1;
            sampleQueueArr[i5] = sampleQueueCreateWithoutDrm;
            iArr2[i5] = this.embeddedTrackTypes[i4];
            i4 = i5;
        }
        this.chunkOutput = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j2;
        this.lastSeekPositionUs = j2;
        this.endPositionUs = Long.MIN_VALUE;
        this.needToEvaluateInitialDiscontinuity = z;
        if (!z || j3 == C.TIME_UNSET) {
            return;
        }
        this.needToEvaluateInitialDiscontinuity = false;
        this.hasInitialDiscontinuity = j3 < j2;
    }

    private void discardDownstreamMediaChunks(int i2) {
        int iMin = Math.min(primarySampleIndexToMediaChunkIndex(i2, 0), this.nextNotifyPrimaryFormatMediaChunkIndex);
        if (iMin > 0) {
            Util.removeRange(this.mediaChunks, 0, iMin);
            this.nextNotifyPrimaryFormatMediaChunkIndex -= iMin;
        }
    }

    private void discardUpstream(int i2) {
        an.u(!this.loader.isLoading());
        int size = this.mediaChunks.size();
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (!haveReadFromMediaChunk(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j2 = getLastMediaChunk().endTimeUs;
        BaseMediaChunk baseMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i2);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, baseMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j2);
    }

    private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i2) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i2);
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i2, arrayList.size());
        this.nextNotifyPrimaryFormatMediaChunkIndex = Math.max(this.nextNotifyPrimaryFormatMediaChunkIndex, this.mediaChunks.size());
        int i3 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i3 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i3];
            i3++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i3));
        }
    }

    private BaseMediaChunk getLastMediaChunk() {
        return this.mediaChunks.get(this.mediaChunks.size() - 1);
    }

    private boolean haveReadFromMediaChunk(int i2) {
        int readIndex;
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i2);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i3 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i3 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i3].getReadIndex();
            i3++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i3));
        return true;
    }

    private boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof BaseMediaChunk;
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i2) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i2);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.mediaSourceEventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }

    private int primarySampleIndexToMediaChunkIndex(int i2, int i3) {
        ArrayList<BaseMediaChunk> arrayList;
        do {
            i3++;
            int size = this.mediaChunks.size();
            arrayList = this.mediaChunks;
            if (i3 >= size) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i3).getFirstSampleIndex(0) <= i2);
        return i3 - 1;
    }

    private void resetSampleQueues() {
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
    }

    public boolean consumeInitialDiscontinuity() {
        try {
            return this.hasInitialDiscontinuity;
        } finally {
            this.hasInitialDiscontinuity = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo r12) {
        /*
            r11 = this;
            boolean r0 = r11.loadingFinished
            r1 = 0
            if (r0 != 0) goto Lb9
            androidx.media3.exoplayer.upstream.Loader r0 = r11.loader
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto Lb9
            androidx.media3.exoplayer.upstream.Loader r0 = r11.loader
            boolean r0 = r0.hasFatalError()
            if (r0 == 0) goto L17
            goto Lb9
        L17:
            boolean r0 = r11.isPendingReset()
            if (r0 == 0) goto L22
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            long r3 = r11.pendingResetPositionUs
            goto L2a
        L22:
            java.util.List<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> r2 = r11.readOnlyMediaChunks
            androidx.media3.exoplayer.source.chunk.BaseMediaChunk r3 = r11.getLastMediaChunk()
            long r3 = r3.endTimeUs
        L2a:
            r9 = r2
            r7 = r3
            T extends androidx.media3.exoplayer.source.chunk.ChunkSource r5 = r11.chunkSource
            androidx.media3.exoplayer.source.chunk.ChunkHolder r10 = r11.nextChunkHolder
            r6 = r12
            r5.getNextChunk(r6, r7, r9, r10)
            androidx.media3.exoplayer.source.chunk.ChunkHolder r12 = r11.nextChunkHolder
            boolean r2 = r12.endOfStream
            androidx.media3.exoplayer.source.chunk.Chunk r3 = r12.chunk
            r12.clear()
            r12 = 1
            if (r3 == 0) goto L50
            long r4 = r11.endPositionUs
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L50
            long r6 = r3.startTimeUs
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L50
            r4 = r12
            goto L51
        L50:
            r4 = r1
        L51:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto Lb4
            if (r4 == 0) goto L5b
            goto Lb4
        L5b:
            if (r3 == 0) goto Lb9
            r11.loadingChunk = r3
            boolean r2 = r11.isMediaChunk(r3)
            if (r2 == 0) goto L9a
            r2 = r3
            androidx.media3.exoplayer.source.chunk.BaseMediaChunk r2 = (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) r2
            if (r0 == 0) goto L8f
            long r7 = r2.startTimeUs
            long r9 = r11.pendingResetPositionUs
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L8b
            androidx.media3.exoplayer.source.SampleQueue r0 = r11.primarySampleQueue
            r0.setStartTimeUs(r9)
            androidx.media3.exoplayer.source.SampleQueue[] r0 = r11.embeddedSampleQueues
            int r4 = r0.length
            r7 = r1
        L7b:
            if (r7 >= r4) goto L87
            r8 = r0[r7]
            long r9 = r11.pendingResetPositionUs
            r8.setStartTimeUs(r9)
            int r7 = r7 + 1
            goto L7b
        L87:
            boolean r0 = r11.needToEvaluateInitialDiscontinuity
            r11.hasInitialDiscontinuity = r0
        L8b:
            r11.needToEvaluateInitialDiscontinuity = r1
            r11.pendingResetPositionUs = r5
        L8f:
            androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput r0 = r11.chunkOutput
            r2.init(r0)
            java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> r0 = r11.mediaChunks
            r0.add(r2)
            goto La6
        L9a:
            boolean r0 = r3 instanceof androidx.media3.exoplayer.source.chunk.InitializationChunk
            if (r0 == 0) goto La6
            r0 = r3
            androidx.media3.exoplayer.source.chunk.InitializationChunk r0 = (androidx.media3.exoplayer.source.chunk.InitializationChunk) r0
            androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput r1 = r11.chunkOutput
            r0.init(r1)
        La6:
            androidx.media3.exoplayer.upstream.Loader r0 = r11.loader
            androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy r1 = r11.loadErrorHandlingPolicy
            int r2 = r3.type
            int r1 = r1.getMinimumLoadableRetryCount(r2)
            r0.startLoading(r3, r11, r1)
            return r12
        Lb4:
            r11.pendingResetPositionUs = r5
            r11.loadingFinished = r12
            return r12
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.chunk.ChunkSampleStream.continueLoading(androidx.media3.exoplayer.LoadingInfo):boolean");
    }

    public void discardBuffer(long j2, boolean z) {
        if (isPendingReset()) {
            return;
        }
        SampleQueue sampleQueue = this.primarySampleQueue;
        int firstIndex = sampleQueue.getFirstIndex();
        sampleQueue.discardTo(j2, z, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i2 = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i2 >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i2].discardTo(firstTimestampUs, z, this.embeddedTracksSelected[i2]);
                i2++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    public void discardUpstreamSamplesForClippedDuration(long j2) {
        an.u(!this.loader.isLoading());
        if (isPendingReset() || j2 == C.TIME_UNSET || this.mediaChunks.isEmpty()) {
            return;
        }
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        long j3 = lastMediaChunk.clippedEndTimeUs;
        if (j3 == C.TIME_UNSET) {
            j3 = lastMediaChunk.endTimeUs;
        }
        if (j3 > j2) {
            long largestQueuedTimestampUs = this.primarySampleQueue.getLargestQueuedTimestampUs();
            if (largestQueuedTimestampUs > j2) {
                this.primarySampleQueue.discardUpstreamFrom(Math.max(j2, this.primarySampleQueue.getLargestReadTimestampUs() + 1));
                for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
                    sampleQueue.discardUpstreamFrom(Math.max(j2, sampleQueue.getLargestReadTimestampUs() + 1));
                }
                this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, j2, largestQueuedTimestampUs);
            }
        }
    }

    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j2, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long jMax = this.lastSeekPositionUs;
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                lastMediaChunk = this.mediaChunks.get(r2.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        return Math.max(jMax, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.chunkSource;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int getFlags() {
        if (this.needToEvaluateInitialDiscontinuity) {
            return 2;
        }
        return this.hasInitialDiscontinuity ? 4 : 0;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return !isPendingReset() && this.primarySampleQueue.isReady(this.loadingFinished);
    }

    public boolean mayHaveInitialDiscontinuity() {
        return ((!this.needToEvaluateInitialDiscontinuity && !this.hasInitialDiscontinuity) || this.loadingFinished || this.loader.hasFatalError()) ? false : true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.primarySampleQueue.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j2, long j3, boolean z) {
        this.loadingChunk = null;
        this.canceledMediaChunk = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j2, j3, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z) {
            return;
        }
        if (isPendingReset()) {
            resetSampleQueues();
        } else if (isMediaChunk(chunk)) {
            discardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1);
            if (this.mediaChunks.isEmpty()) {
                this.pendingResetPositionUs = this.lastSeekPositionUs;
            }
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j2, long j3) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j2, j3, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk chunk, long j2, long j3, IOException iOException, int i2) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        long jBytesLoaded = chunk.bytesLoaded();
        int size = arrayList.size() - 1;
        boolean zIsMediaChunk = isMediaChunk(chunk);
        boolean z = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j2, j3, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, Util.usToMs(chunk.startTimeUs), Util.usToMs(chunk.endTimeUs)), iOException, i2);
        if (!this.chunkSource.onChunkLoadError(chunk, z, loadErrorInfo, this.loadErrorHandlingPolicy)) {
            loadErrorActionCreateRetryAction = null;
        } else if (z) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
            if (zIsMediaChunk) {
                an.u(discardUpstreamMediaChunksFromIndex(size) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
        } else {
            Log.w(TAG, "Ignoring attempt to cancel non-cancelable load.");
            loadErrorActionCreateRetryAction = null;
        }
        if (loadErrorActionCreateRetryAction == null) {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(Chunk chunk, long j2, long j3, int i2) {
        this.mediaSourceEventDispatcher.loadStarted(i2 == 0 ? new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, j2) : new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j2, j3, chunk.bytesLoaded()), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, i2);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.release();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.release();
        }
        this.chunkSource.release();
        ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        boolean z = !this.usesStreamPrerollFlags && mayHaveInitialDiscontinuity();
        if (isPendingReset() || z || this.suppressRead) {
            return -3;
        }
        BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.primarySampleQueue.read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            Chunk chunk = this.loadingChunk;
            an.B(chunk);
            if (isMediaChunk(chunk) && haveReadFromMediaChunk(this.mediaChunks.size() - 1)) {
                return;
            }
            long j3 = this.endPositionUs;
            if ((j3 == Long.MIN_VALUE || chunk.startTimeUs < j3) && !this.chunkSource.shouldCancelLoad(j2, chunk, this.readOnlyMediaChunks)) {
                return;
            }
            this.loader.cancelLoading();
            if (isMediaChunk(chunk)) {
                this.canceledMediaChunk = (BaseMediaChunk) chunk;
                return;
            }
            return;
        }
        int iMin = Math.min(this.mediaChunks.size(), this.chunkSource.getPreferredQueueSize(j2, this.readOnlyMediaChunks));
        boolean z = false;
        if (this.endPositionUs != Long.MIN_VALUE) {
            while (iMin > 0) {
                int i2 = iMin - 1;
                if (this.mediaChunks.get(i2).startTimeUs < this.endPositionUs) {
                    break;
                }
                z = true;
                iMin = i2;
            }
        }
        if (iMin < this.mediaChunks.size()) {
            discardUpstream(iMin);
        }
        if (z) {
            this.pendingResetPositionUs = C.TIME_UNSET;
            this.loadingFinished = true;
        }
    }

    public void release(ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.preRelease();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.preRelease();
        }
        this.loader.release(this);
    }

    public void seekToUs(long j2) throws Throwable {
        BaseMediaChunk baseMediaChunk;
        boolean zSeekTo;
        BaseMediaChunk baseMediaChunk2;
        this.lastSeekPositionUs = j2;
        int i2 = 0;
        this.needToEvaluateInitialDiscontinuity = false;
        this.hasInitialDiscontinuity = false;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j2;
            return;
        }
        int i3 = 0;
        while (true) {
            baseMediaChunk = null;
            if (i3 >= this.mediaChunks.size()) {
                break;
            }
            BaseMediaChunk baseMediaChunk3 = this.mediaChunks.get(i3);
            long j3 = baseMediaChunk3.startTimeUs;
            if (j3 == j2 && baseMediaChunk3.clippedStartTimeUs == C.TIME_UNSET) {
                baseMediaChunk = baseMediaChunk3;
                break;
            } else if (j3 > j2) {
                break;
            } else {
                i3++;
            }
        }
        if (baseMediaChunk != null) {
            zSeekTo = this.primarySampleQueue.seekTo(baseMediaChunk.getFirstSampleIndex(0));
        } else {
            long nextLoadPositionUs = getNextLoadPositionUs();
            zSeekTo = this.primarySampleQueue.seekTo(j2, nextLoadPositionUs == Long.MIN_VALUE || j2 < nextLoadPositionUs);
        }
        if (zSeekTo && ((baseMediaChunk2 = this.canceledMediaChunk) == null || baseMediaChunk2.getFirstSampleIndex(0) > this.primarySampleQueue.getReadIndex())) {
            this.nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), 0);
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            int length = sampleQueueArr.length;
            while (i2 < length) {
                sampleQueueArr[i2].seekTo(j2, true);
                i2++;
            }
            return;
        }
        this.pendingResetPositionUs = j2;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        this.nextNotifyPrimaryFormatMediaChunkIndex = 0;
        if (!this.loader.isLoading()) {
            this.loader.clearFatalError();
            resetSampleQueues();
            return;
        }
        this.primarySampleQueue.discardToEnd();
        SampleQueue[] sampleQueueArr2 = this.embeddedSampleQueues;
        int length2 = sampleQueueArr2.length;
        while (i2 < length2) {
            sampleQueueArr2[i2].discardToEnd();
            i2++;
        }
        this.loader.cancelLoading();
    }

    public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j2, int i2) throws Throwable {
        for (int i3 = 0; i3 < this.embeddedSampleQueues.length; i3++) {
            if (this.embeddedTrackTypes[i3] == i2) {
                an.u(!this.embeddedTracksSelected[i3]);
                this.embeddedTracksSelected[i3] = true;
                this.embeddedSampleQueues[i3].seekTo(j2, true);
                return new EmbeddedSampleStream(this, this, this.embeddedSampleQueues[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEndPositionUs(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.loadingFinished
            r1 = 0
            if (r0 == 0) goto L17
            long r2 = r6.endPositionUs
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L17
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r4 = 1
            if (r0 == 0) goto L18
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L18
        L17:
            r4 = r1
        L18:
            r6.endPositionUs = r7
            androidx.media3.exoplayer.source.SampleQueue r0 = r6.primarySampleQueue
            r0.setReadEndTimeUs(r7)
            androidx.media3.exoplayer.source.SampleQueue[] r0 = r6.embeddedSampleQueues
            int r2 = r0.length
            r3 = r1
        L23:
            if (r3 >= r2) goto L2d
            r5 = r0[r3]
            r5.setReadEndTimeUs(r7)
            int r3 = r3 + 1
            goto L23
        L2d:
            if (r4 == 0) goto L36
            r6.loadingFinished = r1
            androidx.media3.exoplayer.source.SequenceableLoader$Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T extends androidx.media3.exoplayer.source.chunk.ChunkSource>> r7 = r6.callback
            r7.onContinueLoadingRequested(r6)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.chunk.ChunkSampleStream.setEndPositionUs(long):void");
    }

    public void setSuppressRead(boolean z) {
        this.suppressRead = z;
    }

    public void setUsesStreamPrerollFlags() {
        this.usesStreamPrerollFlags = true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j2) throws Throwable {
        boolean z = !this.usesStreamPrerollFlags && mayHaveInitialDiscontinuity();
        if (isPendingReset() || z || this.suppressRead) {
            return 0;
        }
        int skipCount = this.primarySampleQueue.getSkipCount(j2, this.loadingFinished);
        BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null) {
            skipCount = Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.primarySampleQueue.getReadIndex());
        }
        this.primarySampleQueue.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    public void release() {
        release(null);
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int iPrimarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), this.nextNotifyPrimaryFormatMediaChunkIndex - 1);
        while (true) {
            int i2 = this.nextNotifyPrimaryFormatMediaChunkIndex;
            if (i2 > iPrimarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.nextNotifyPrimaryFormatMediaChunkIndex = i2 + 1;
            maybeNotifyPrimaryTrackFormatChanged(i2);
        }
    }
}
