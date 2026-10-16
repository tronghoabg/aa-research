package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import com.google.d.b.an;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SampleQueue implements TrackOutput {
    private static final int DEFAULT_MAX_NUM_REORDER_SAMPLES = 16;
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private DrmSession currentDrmSession;
    private Format downstreamFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private Format unadjustedUpstreamFormat;
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private long upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata = new SpannedData<>(new Consumer() { // from class: androidx.media3.exoplayer.source.SampleQueue$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.util.Consumer
        public final void accept(Object obj) {
            ((SampleQueue.SharedSampleMetadata) obj).drmSessionReference.release();
        }
    });
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;
    private boolean discardAllSamplesToStartTime = true;
    private long readEndTimeUs = Long.MIN_VALUE;
    private int readEndTimeAbsoluteIndex = -1;
    private int readEndTimeAbsoluteIndexCandidate = -1;

    /* compiled from: WazeSource */
    final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;

        SampleExtrasHolder() {
        }
    }

    /* compiled from: WazeSource */
    final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }

    /* compiled from: WazeSource */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    protected SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j2) {
        if (this.length == 0) {
            return j2 > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j2) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j2));
        return true;
    }

    private static boolean canDiscardAllSamplesToStartTime(String str, String str2) {
        return MimeTypes.getTrackType(str) == 1 && MimeTypes.allSamplesAreSyncSamples(str, str2);
    }

    private synchronized void commitSample(long j2, int i2, long j3, int i3, TrackOutput.CryptoData cryptoData) {
        int i4 = this.length;
        if (i4 > 0) {
            int relativeIndex = getRelativeIndex(i4 - 1);
            an.l(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j3);
        }
        this.isLastSampleQueued = (536870912 & i2) != 0;
        this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j2);
        updateReadEndTimeState(getWriteIndex(), j2, i2);
        int relativeIndex2 = getRelativeIndex(this.length);
        this.timesUs[relativeIndex2] = j2;
        this.offsets[relativeIndex2] = j3;
        this.sizes[relativeIndex2] = i3;
        this.flags[relativeIndex2] = i2;
        this.cryptoDatas[relativeIndex2] = cryptoData;
        this.sourceIds[relativeIndex2] = this.upstreamSourceId;
        if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
            Format format = this.upstreamFormat;
            an.B(format);
            DrmSessionManager drmSessionManager = this.drmSessionManager;
            this.sharedSampleMetadata.appendSpan(getWriteIndex(), new SharedSampleMetadata(format, drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, format) : DrmSessionManager.DrmSessionReference.EMPTY));
        }
        int i5 = this.length + 1;
        this.length = i5;
        int i6 = this.capacity;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            long[] jArr3 = new long[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i7];
            int i8 = this.relativeFirstIndex;
            int i9 = i6 - i8;
            System.arraycopy(this.offsets, i8, jArr2, 0, i9);
            System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i9);
            System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i9);
            System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i9);
            System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i9);
            System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i9);
            int i10 = this.relativeFirstIndex;
            System.arraycopy(this.offsets, 0, jArr2, i9, i10);
            System.arraycopy(this.timesUs, 0, jArr3, i9, i10);
            System.arraycopy(this.flags, 0, iArr, i9, i10);
            System.arraycopy(this.sizes, 0, iArr2, i9, i10);
            System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i9, i10);
            System.arraycopy(this.sourceIds, 0, jArr, i9, i10);
            this.offsets = jArr2;
            this.timesUs = jArr3;
            this.flags = iArr;
            this.sizes = iArr2;
            this.cryptoDatas = cryptoDataArr;
            this.sourceIds = jArr;
            this.relativeFirstIndex = 0;
            this.capacity = i7;
        }
    }

    private int countUnreadSamplesBefore(long j2) {
        int i2 = this.length;
        int relativeIndex = getRelativeIndex(i2 - 1);
        while (i2 > this.readPosition && this.timesUs[relativeIndex] >= j2) {
            i2--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i2;
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        an.B(drmSessionManager);
        an.B(eventDispatcher);
        return new SampleQueue(allocator, drmSessionManager, eventDispatcher);
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized long discardSampleMetadataTo(long r9, boolean r11, boolean r12) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.length     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L2e
            long[] r1 = r8.timesUs     // Catch: java.lang.Throwable -> L33
            int r3 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L33
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L33
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L2e
        L10:
            if (r12 == 0) goto L1d
            int r12 = r8.readPosition     // Catch: java.lang.Throwable -> L19
            if (r12 == r0) goto L1d
            int r0 = r12 + 1
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L36
        L1d:
            r2 = r8
            r5 = r9
            r7 = r11
            r4 = r0
            int r8 = r2.findSampleBefore(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L38
            r9 = -1
            if (r8 == r9) goto L2f
            long r8 = r2.discardSamples(r8)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r2)
            return r8
        L2e:
            r2 = r8
        L2f:
            monitor-exit(r2)
            r8 = -1
            return r8
        L33:
            r0 = move-exception
            r2 = r8
        L35:
            r9 = r0
        L36:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            throw r9
        L38:
            r0 = move-exception
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.discardSampleMetadataTo(long, boolean, boolean):long");
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i2 = this.length;
        if (i2 == 0) {
            return -1L;
        }
        return discardSamples(i2);
    }

    private long discardSamples(int i2) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        this.length -= i2;
        int i3 = this.absoluteFirstIndex + i2;
        this.absoluteFirstIndex = i3;
        int i4 = this.relativeFirstIndex + i2;
        this.relativeFirstIndex = i4;
        int i5 = this.capacity;
        if (i4 >= i5) {
            this.relativeFirstIndex = i4 - i5;
        }
        int i6 = this.readPosition - i2;
        this.readPosition = i6;
        if (i6 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i3);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i7 = this.relativeFirstIndex;
        if (i7 == 0) {
            i7 = this.capacity;
        }
        return this.offsets[i7 - 1] + this.sizes[r5];
    }

    private long discardUpstreamSampleMetadata(int i2) {
        int writeIndex = getWriteIndex() - i2;
        an.l(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i3 = this.length - writeIndex;
        this.length = i3;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i3));
        this.isLastSampleQueued = writeIndex == 0 && this.isLastSampleQueued;
        int i4 = this.readEndTimeAbsoluteIndex;
        if (i4 != -1 && i2 < i4) {
            this.readEndTimeAbsoluteIndex = -1;
        }
        int i5 = this.readEndTimeAbsoluteIndexCandidate;
        if (i5 != -1 && i2 < i5) {
            this.readEndTimeAbsoluteIndexCandidate = -1;
        }
        this.sharedSampleMetadata.discardFrom(i2);
        int i6 = this.length;
        if (i6 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i6 - 1)] + this.sizes[r9];
    }

    private int findSampleAfter(int i2, int i3, long j2, boolean z) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.timesUs[i2] >= j2) {
                return i4;
            }
            i2++;
            if (i2 == this.capacity) {
                i2 = 0;
            }
        }
        if (z) {
            return i3;
        }
        return -1;
    }

    private int findSampleBefore(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.timesUs[i2];
            if (j3 > j2) {
                break;
            }
            if (!z || (this.flags[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.capacity) {
                i2 = 0;
            }
        }
        return i4;
    }

    private long getLargestTimestamp(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                return jMax;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i2) {
        int i3 = this.relativeFirstIndex + i2;
        int i4 = this.capacity;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private int getUpstreamMaxNumReorderSamples() {
        int i2;
        Format format = this.upstreamFormat;
        if (format == null || (i2 = format.maxNumReorderSamples) == -1) {
            return 16;
        }
        return i2;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private boolean isReadEndTimeIndexMaybeReached() {
        int i2;
        return this.readEndTimeAbsoluteIndex == -1 && (i2 = this.readEndTimeAbsoluteIndexCandidate) != -1 && getReadIndex() >= i2;
    }

    private boolean mayReadSample(int i2) {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i2] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        DrmInitData drmInitData = format2 == null ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (format2 == null || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = drmSessionAcquireSession;
            formatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, SampleExtrasHolder sampleExtrasHolder) {
        boolean z3 = false;
        decoderInputBuffer.waitingForKeys = false;
        int readIndex = getReadIndex();
        int i2 = this.readEndTimeAbsoluteIndex;
        if (i2 != -1 && readIndex >= i2) {
            z3 = true;
        }
        if (hasNextSample() && !isReadEndTimeIndexMaybeReached() && !z3) {
            Format format = this.sharedSampleMetadata.get(readIndex).format;
            if (!z && format == this.downstreamFormat) {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!mayReadSample(relativeIndex)) {
                    decoderInputBuffer.waitingForKeys = true;
                    return -3;
                }
                decoderInputBuffer.setFlags(this.flags[relativeIndex]);
                if (this.readPosition == this.length - 1 && (z2 || this.isLastSampleQueued)) {
                    decoderInputBuffer.addFlag(536870912);
                }
                decoderInputBuffer.timeUs = this.timesUs[relativeIndex];
                sampleExtrasHolder.size = this.sizes[relativeIndex];
                sampleExtrasHolder.offset = this.offsets[relativeIndex];
                sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
                return -4;
            }
            onFormatResult(format, formatHolder);
            return -5;
        }
        if (!z2 && !this.isLastSampleQueued && !z3) {
            Format format2 = this.upstreamFormat;
            if (format2 == null || (!z && format2 == this.downstreamFormat)) {
                return -3;
            }
            onFormatResult(format2, formatHolder);
            return -5;
        }
        decoderInputBuffer.setFlags(4);
        decoderInputBuffer.timeUs = Long.MIN_VALUE;
        return -4;
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private void searchReadEndTimeAbsoluteIndex() {
        this.readEndTimeAbsoluteIndex = -1;
        this.readEndTimeAbsoluteIndexCandidate = -1;
        long j2 = this.readEndTimeUs;
        if (j2 == Long.MIN_VALUE || j2 > this.largestQueuedTimestampUs) {
            return;
        }
        for (int i2 = 0; i2 < this.length; i2++) {
            int relativeIndex = getRelativeIndex(i2);
            updateReadEndTimeState(this.absoluteFirstIndex + i2, this.timesUs[relativeIndex], this.flags[relativeIndex]);
            if (this.readEndTimeAbsoluteIndex != -1) {
                return;
            }
        }
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        this.upstreamFormatRequired = false;
        if (Objects.equals(format, this.upstreamFormat)) {
            return false;
        }
        if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(format)) {
            this.upstreamFormat = format;
        } else {
            format = this.sharedSampleMetadata.getEndValue().format;
            this.upstreamFormat = format;
        }
        this.discardAllSamplesToStartTime = canDiscardAllSamplesToStartTime(format.sampleMimeType, format.codecs) & this.discardAllSamplesToStartTime;
        this.loggedUnexpectedNonSyncSample = false;
        return true;
    }

    private void updateReadEndTimeState(int i2, long j2, int i3) {
        long j3 = this.readEndTimeUs;
        if (j3 != Long.MIN_VALUE && this.readEndTimeAbsoluteIndex == -1) {
            if (j2 < j3) {
                this.readEndTimeAbsoluteIndexCandidate = -1;
                return;
            }
            int i4 = this.readEndTimeAbsoluteIndexCandidate;
            if (i4 == -1) {
                this.readEndTimeAbsoluteIndexCandidate = i2;
                i4 = i2;
            }
            int i5 = i3 & 1;
            int i6 = i3 & 536870912;
            if ((i2 - i4) + 1 < getUpstreamMaxNumReorderSamples() + 1 && i5 == 0 && i6 == 0) {
                return;
            }
            this.readEndTimeAbsoluteIndex = i4;
            this.readEndTimeAbsoluteIndexCandidate = -1;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i2 = this.readPosition;
        if (i2 == 0) {
            return -1L;
        }
        return discardSamples(i2);
    }

    public final void discardTo(long j2, boolean z, boolean z2) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j2, z, z2));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j2) {
        if (this.length == 0) {
            return;
        }
        an.l(j2 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j2));
    }

    public final void discardUpstreamSamples(int i2) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i2));
    }

    @Override // androidx.media3.extractor.TrackOutput
    public /* synthetic */ void durationUs(long j2) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    protected Format getAdjustedUpstreamFormat(Format format) {
        if (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) {
            return format;
        }
        Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs);
        return builderBuildUpon.build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        if (this.length == 0) {
            return Long.MIN_VALUE;
        }
        return this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j2, boolean z) throws Throwable {
        SampleQueue sampleQueue;
        Throwable th;
        try {
            try {
                int i2 = this.readPosition;
                int relativeIndex = getRelativeIndex(i2);
                if (hasNextSample() && j2 >= this.timesUs[relativeIndex]) {
                    if (j2 <= this.largestQueuedTimestampUs || !z) {
                        int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - i2, j2, true);
                        if (iFindSampleBefore == -1) {
                            return 0;
                        }
                        return iFindSampleBefore;
                    }
                    try {
                        return this.length - i2;
                    } catch (Throwable th2) {
                        th = th2;
                        sampleQueue = this;
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            sampleQueue = this;
            th = th;
            throw th;
        }
    }

    public final synchronized Format getUpstreamFormat() {
        if (this.upstreamFormatRequired) {
            return null;
        }
        return this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final synchronized boolean hasQueuedTimestampsUpToReadEndTimeUs() {
        return this.readEndTimeAbsoluteIndex != -1;
    }

    protected final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    public synchronized boolean isReady(boolean z) {
        int readIndex = getReadIndex();
        int i2 = this.readEndTimeAbsoluteIndex;
        boolean z2 = true;
        if (i2 != -1 && readIndex >= i2) {
            return true;
        }
        if (hasNextSample() && !isReadEndTimeIndexMaybeReached()) {
            if (this.sharedSampleMetadata.get(readIndex).format != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z && !this.isLastSampleQueued) {
            Format format = this.upstreamFormat;
            if (format == null) {
                z2 = false;
            } else if (format == this.downstreamFormat) {
                return false;
            }
        }
        return z2;
    }

    public void maybeThrowError() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException error = this.currentDrmSession.getError();
        an.B(error);
        throw error;
    }

    public final synchronized long peekSourceId() {
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2, boolean z) {
        int iPeekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i2 & 2) != 0, z, this.extrasHolder);
        if (iPeekSampleMetadata != -4) {
            return iPeekSampleMetadata;
        }
        if (!decoderInputBuffer.isEndOfStream()) {
            int i3 = i2 & 1;
            if ((i2 & 4) == 0) {
                SampleDataQueue sampleDataQueue = this.sampleDataQueue;
                if (i3 != 0) {
                    sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                    return -4;
                }
                sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
            } else if (i3 != 0) {
                return -4;
            }
            this.readPosition++;
        }
        return -4;
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public void reset(boolean z) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.readEndTimeAbsoluteIndex = -1;
        this.readEndTimeAbsoluteIndexCandidate = -1;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
            this.discardAllSamplesToStartTime = true;
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i2, boolean z, int i3) {
        return this.sampleDataQueue.sampleData(dataReader, i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, androidx.media3.extractor.TrackOutput.CryptoData r17) {
        /*
            r11 = this;
            boolean r1 = r11.upstreamFormatAdjustmentRequired
            if (r1 == 0) goto Lf
            androidx.media3.common.Format r1 = r11.unadjustedUpstreamFormat
            com.google.d.b.an.B(r1)
            r2 = r1
            androidx.media3.common.Format r2 = (androidx.media3.common.Format) r2
            r11.format(r1)
        Lf:
            r1 = r14 & 1
            boolean r2 = r11.upstreamKeyframeRequired
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1d
            if (r1 != 0) goto L1a
            goto L5b
        L1a:
            r11.upstreamKeyframeRequired = r3
            r1 = r4
        L1d:
            r2 = r1
            long r5 = r11.sampleOffsetUs
            long r5 = r5 + r12
            boolean r7 = r11.discardAllSamplesToStartTime
            if (r7 == 0) goto L4b
            long r7 = r11.startTimeUs
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L5b
            if (r1 != 0) goto L4b
            boolean r1 = r11.loggedUnexpectedNonSyncSample
            if (r1 != 0) goto L48
            androidx.media3.common.Format r1 = r11.upstreamFormat
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r7 = "SampleQueue"
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            java.lang.String r1 = r8.concat(r1)
            androidx.media3.common.util.Log.w(r7, r1)
            r11.loggedUnexpectedNonSyncSample = r4
        L48:
            r1 = r14 | 1
            goto L4c
        L4b:
            r1 = r14
        L4c:
            boolean r4 = r11.pendingSplice
            if (r4 == 0) goto L5c
            if (r2 == 0) goto L5b
            boolean r2 = r11.attemptSplice(r5)
            if (r2 == 0) goto L5b
            r11.pendingSplice = r3
            goto L5c
        L5b:
            return
        L5c:
            androidx.media3.exoplayer.source.SampleDataQueue r2 = r11.sampleDataQueue
            long r7 = (long) r15
            long r9 = r2.getTotalBytesWritten()
            long r9 = r9 - r7
            r2 = r16
            long r7 = (long) r2
            long r9 = r9 - r7
            r0 = r11
            r7 = r17
            r3 = r1
            r1 = r5
            r4 = r9
            r6 = r15
            r0.commitSample(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.sampleMetadata(long, int, int, int, androidx.media3.extractor.TrackOutput$CryptoData):void");
    }

    public final synchronized boolean seekTo(long j2, boolean z) throws Throwable {
        Throwable th;
        SampleQueue sampleQueue;
        SampleQueue sampleQueue2;
        boolean z2;
        long j3;
        int iFindSampleBefore;
        try {
            try {
                rewind();
                int relativeIndex = getRelativeIndex(this.readPosition);
                long j4 = this.readEndTimeUs;
                long jMin = this.largestQueuedTimestampUs;
                if (j4 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(jMin, j4);
                    } catch (Throwable th2) {
                        th = th2;
                        sampleQueue = this;
                        throw th;
                    }
                }
                if (!hasNextSample() || j2 < this.timesUs[relativeIndex]) {
                    sampleQueue2 = this;
                } else {
                    if (j2 > jMin) {
                        if (z) {
                            z2 = true;
                        }
                        sampleQueue2 = this;
                    } else {
                        z2 = z;
                    }
                    boolean z3 = this.discardAllSamplesToStartTime;
                    int i2 = this.length;
                    if (z3) {
                        sampleQueue2 = this;
                        j3 = j2;
                        iFindSampleBefore = sampleQueue2.findSampleAfter(relativeIndex, i2 - this.readPosition, j3, z2);
                    } else {
                        sampleQueue2 = this;
                        j3 = j2;
                        iFindSampleBefore = sampleQueue2.findSampleBefore(relativeIndex, i2 - sampleQueue2.readPosition, j3, true);
                    }
                    if (iFindSampleBefore != -1) {
                        sampleQueue2.startTimeUs = j3;
                        sampleQueue2.readPosition += iFindSampleBefore;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                sampleQueue = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void setReadEndTimeUs(long j2) {
        if (j2 == this.readEndTimeUs) {
            return;
        }
        this.readEndTimeUs = j2;
        searchReadEndTimeAbsoluteIndex();
    }

    public final void setSampleOffsetUs(long j2) {
        if (this.sampleOffsetUs != j2) {
            this.sampleOffsetUs = j2;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j2) {
        this.startTimeUs = j2;
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final synchronized void skip(int i2) {
        boolean z = false;
        if (i2 >= 0) {
            try {
                if (this.readPosition + i2 <= this.length) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        an.l(z);
        this.readPosition += i2;
    }

    public final void sourceId(long j2) {
        this.upstreamSourceId = j2;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i2) {
        sampleData(parsableByteArray, i2, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public /* synthetic */ int sampleData(DataReader dataReader, int i2, boolean z) {
        return sampleData(dataReader, i2, z, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
        this.sampleDataQueue.sampleData(parsableByteArray, i2);
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        an.B(drmSessionManager);
        an.B(eventDispatcher);
        return new SampleQueue(allocator, drmSessionManager, eventDispatcher);
    }

    public final void reset() {
        reset(false);
    }

    public final synchronized boolean seekTo(int i2) {
        int i3;
        int i4;
        rewind();
        int i5 = this.absoluteFirstIndex;
        if (i2 >= i5 && i2 <= this.length + i5 && (((i3 = this.readEndTimeAbsoluteIndex) == -1 || i2 < i3) && ((i4 = this.readEndTimeAbsoluteIndexCandidate) == -1 || i2 < i4))) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i2 - i5;
            return true;
        }
        return false;
    }
}
