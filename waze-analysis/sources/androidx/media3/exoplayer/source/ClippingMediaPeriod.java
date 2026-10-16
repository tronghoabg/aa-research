package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private ClippingMediaSource.IllegalClippingException clippingError;
    private final boolean enableClippingInMediaPeriod;
    long endUs;
    private boolean hasProcessedInitialDiscontinuity;
    private boolean isPeriodClippingEndPosition;
    private long lastReportedDiscontinuityUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams;
    long startUs;
    private boolean usesStreamPrerollFlags;

    /* compiled from: WazeSource */
    final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private final boolean hasPreroll;
        private boolean sentEos;
        final /* synthetic */ ClippingMediaPeriod this$0;

        private ClippingSampleStream(ClippingMediaPeriod clippingMediaPeriod, SampleStream sampleStream, boolean z) {
            Objects.requireNonNull(clippingMediaPeriod);
            this.this$0 = clippingMediaPeriod;
            this.childStream = sampleStream;
            this.hasPreroll = z;
        }

        public void clearSentEos() {
            this.sentEos = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int getFlags() {
            ClippingMediaPeriod clippingMediaPeriod = this.this$0;
            int flags = this.childStream.getFlags();
            if (clippingMediaPeriod.endUs != Long.MIN_VALUE) {
                flags |= 1;
            }
            return this.hasPreroll ? (flags & (-3)) | 4 : flags;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !this.this$0.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            this.childStream.maybeThrowError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        
            if (r18.waitingForKeys == false) goto L35;
         */
        @Override // androidx.media3.exoplayer.source.SampleStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readData(androidx.media3.exoplayer.FormatHolder r17, androidx.media3.decoder.DecoderInputBuffer r18, int r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                r3 = r19
                androidx.media3.exoplayer.source.ClippingMediaPeriod r4 = r0.this$0
                boolean r4 = r4.isPendingInitialDiscontinuity()
                r5 = -3
                if (r4 == 0) goto L12
                return r5
            L12:
                androidx.media3.exoplayer.source.ClippingMediaPeriod r4 = r0.this$0
                boolean r4 = androidx.media3.exoplayer.source.ClippingMediaPeriod.m12744$$Nest$fgetisPeriodClippingEndPosition(r4)
                r6 = -5
                if (r4 == 0) goto L2e
                androidx.media3.exoplayer.source.SampleStream r4 = r0.childStream
                int r2 = r4.readData(r1, r2, r3)
                if (r2 != r6) goto L2d
                androidx.media3.exoplayer.source.ClippingMediaPeriod r0 = r0.this$0
                long r2 = r0.startUs
                long r4 = r0.endUs
                androidx.media3.exoplayer.source.ClippingMediaPeriod.m12747$$Nest$smupdateDecoderDelayPaddingForClipping(r1, r2, r4)
                return r6
            L2d:
                return r2
            L2e:
                boolean r4 = r0.sentEos
                r7 = 4
                r8 = -4
                if (r4 == 0) goto L38
                r2.setFlags(r7)
                return r8
            L38:
                androidx.media3.exoplayer.source.ClippingMediaPeriod r4 = r0.this$0
                androidx.media3.exoplayer.source.SampleStream r9 = r0.childStream
                long r10 = r4.getBufferedPositionUs()
                int r3 = r9.readData(r1, r2, r3)
                androidx.media3.exoplayer.source.ClippingMediaPeriod r4 = r0.this$0
                long r12 = androidx.media3.exoplayer.source.ClippingMediaPeriod.m12745$$Nest$fgetlastReportedDiscontinuityUs(r4)
                r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r4 == 0) goto L5a
                if (r3 == r5) goto L5a
                androidx.media3.exoplayer.source.ClippingMediaPeriod r4 = r0.this$0
                androidx.media3.exoplayer.source.ClippingMediaPeriod.m12746$$Nest$fputlastReportedDiscontinuityUs(r4, r14)
            L5a:
                androidx.media3.exoplayer.source.ClippingMediaPeriod r4 = r0.this$0
                if (r3 != r6) goto L66
                long r2 = r4.startUs
                long r4 = r4.endUs
                androidx.media3.exoplayer.source.ClippingMediaPeriod.m12747$$Nest$smupdateDecoderDelayPaddingForClipping(r1, r2, r4)
                return r6
            L66:
                long r12 = r4.endUs
                r14 = -9223372036854775808
                int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r1 == 0) goto L8b
                if (r3 != r8) goto L77
                long r3 = r2.timeUs
                int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r1 >= 0) goto L81
                r3 = r8
            L77:
                if (r3 != r5) goto L8b
                int r1 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r1 != 0) goto L8b
                boolean r1 = r2.waitingForKeys
                if (r1 != 0) goto L8b
            L81:
                r2.clear()
                r2.setFlags(r7)
                r1 = 1
                r0.sentEos = r1
                return r8
            L8b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream.readData(androidx.media3.exoplayer.FormatHolder, androidx.media3.decoder.DecoderInputBuffer, int):int");
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j2) {
            if (this.this$0.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j2);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j2, long j3, boolean z2) {
        this.mediaPeriod = mediaPeriod;
        this.sampleStreams = new ClippingSampleStream[0];
        this.pendingInitialDiscontinuityPositionUs = true != z ? -9223372036854775807L : j2;
        this.lastReportedDiscontinuityUs = C.TIME_UNSET;
        this.enableClippingInMediaPeriod = z2;
        updateClipping(j2, j3);
    }

    private SeekParameters clipSeekParameters(long j2, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j2 - this.startUs);
        long j3 = seekParameters.toleranceAfterUs;
        long j4 = this.endUs;
        long jConstrainValue2 = Util.constrainValue(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static long enforceClippingRange(long j2, long j3, long j4) {
        long jMax = Math.max(j2, j3);
        return j4 != Long.MIN_VALUE ? Math.min(jMax, j4) : jMax;
    }

    private static boolean shouldKeepInitialDiscontinuity(long j2, long j3, ExoTrackSelection[] exoTrackSelectionArr, int i2) {
        ExoTrackSelection exoTrackSelection;
        if (j2 < j3) {
            return true;
        }
        if (j2 != 0 && (exoTrackSelection = exoTrackSelectionArr[i2]) != null) {
            Format selectedFormat = exoTrackSelection.getSelectedFormat();
            if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateDecoderDelayPaddingForClipping(FormatHolder formatHolder, long j2, long j3) {
        Format format = formatHolder.format;
        an.B(format);
        int i2 = format.encoderDelay;
        if (i2 == 0) {
            if (format.encoderPadding == 0) {
                return;
            } else {
                i2 = 0;
            }
        }
        if (j2 != 0) {
            i2 = 0;
        }
        int i3 = j3 == Long.MIN_VALUE ? format.encoderPadding : 0;
        Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setEncoderDelay(i2);
        builderBuildUpon.setEncoderPadding(i3);
        formatHolder.format = builderBuildUpon.build();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        this.mediaPeriod.discardBuffer(j2, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        long j3 = this.startUs;
        if (j2 == j3) {
            return j3;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j2, clipSeekParameters(j2, seekParameters));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (this.isPeriodClippingEndPosition) {
            long j2 = this.endUs;
            if (j2 != Long.MIN_VALUE) {
                if (bufferedPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                return Math.min(j2, bufferedPositionUs);
            }
        } else {
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long j3 = this.endUs;
            if (j3 != Long.MIN_VALUE && bufferedPositionUs >= j3) {
                return Long.MIN_VALUE;
            }
        }
        return bufferedPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (this.isPeriodClippingEndPosition) {
            long j2 = this.endUs;
            if (j2 != Long.MIN_VALUE) {
                if (nextLoadPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                return Math.min(j2, nextLoadPositionUs);
            }
        } else {
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long j3 = this.endUs;
            if (j3 != Long.MIN_VALUE && nextLoadPositionUs >= j3) {
                return Long.MIN_VALUE;
            }
        }
        return nextLoadPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    boolean isPendingInitialDiscontinuity() {
        return (this.pendingInitialDiscontinuityPositionUs == C.TIME_UNSET || this.hasProcessedInitialDiscontinuity) ? false : true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        an.B(callback);
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        MediaPeriod.Callback callback = this.callback;
        an.B(callback);
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j2);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            this.hasProcessedInitialDiscontinuity = true;
            long j2 = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
            this.lastReportedDiscontinuityUs = j2;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j2;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long jEnforceClippingRange = enforceClippingRange(discontinuity2, this.startUs, this.endUs);
        if (jEnforceClippingRange == this.lastReportedDiscontinuityUs) {
            return C.TIME_UNSET;
        }
        this.lastReportedDiscontinuityUs = jEnforceClippingRange;
        return jEnforceClippingRange;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.mediaPeriod.reevaluateBuffer(j2);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j2) {
        this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        return enforceClippingRange(this.mediaPeriod.seekToUs(j2), this.startUs, this.endUs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int i2;
        Object[] objArr;
        int length = sampleStreamArr.length;
        this.sampleStreams = new ClippingSampleStream[length];
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        int i3 = 0;
        while (true) {
            SampleStream sampleStream = null;
            objArr = 0;
            if (i3 >= sampleStreamArr.length) {
                break;
            }
            ClippingSampleStream[] clippingSampleStreamArr = this.sampleStreams;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i3];
            clippingSampleStreamArr[i3] = clippingSampleStream;
            if (clippingSampleStream != null) {
                sampleStream = clippingSampleStream.childStream;
            }
            sampleStreamArr2[i3] = sampleStream;
            i3++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j2);
        long jEnforceClippingRange = enforceClippingRange(jSelectTracks, j2, this.endUs);
        int i4 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i4 >= sampleStreamArr.length) {
                break;
            }
            SampleStream sampleStream2 = sampleStreamArr2[i4];
            ClippingSampleStream[] clippingSampleStreamArr2 = this.sampleStreams;
            if (sampleStream2 == null) {
                clippingSampleStreamArr2[i4] = null;
            } else {
                ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i4];
                if (clippingSampleStream2 == null || clippingSampleStream2.childStream != sampleStream2) {
                    if (isPendingInitialDiscontinuity()) {
                        i2 = i4;
                        if (!shouldKeepInitialDiscontinuity(jSelectTracks, j2, exoTrackSelectionArr, i2)) {
                        }
                        ClippingSampleStream[] clippingSampleStreamArr3 = this.sampleStreams;
                        SampleStream sampleStream3 = sampleStreamArr2[i2];
                        an.B(sampleStream3);
                        clippingSampleStreamArr3[i2] = new ClippingSampleStream(sampleStream3, z2);
                        z |= z2;
                    } else {
                        i2 = i4;
                    }
                    z2 = false;
                    ClippingSampleStream[] clippingSampleStreamArr32 = this.sampleStreams;
                    SampleStream sampleStream32 = sampleStreamArr2[i2];
                    an.B(sampleStream32);
                    clippingSampleStreamArr32[i2] = new ClippingSampleStream(sampleStream32, z2);
                    z |= z2;
                }
                sampleStreamArr[i2] = this.sampleStreams[i2];
                i4 = i2 + 1;
            }
            i2 = i4;
            sampleStreamArr[i2] = this.sampleStreams[i2];
            i4 = i2 + 1;
        }
        this.pendingInitialDiscontinuityPositionUs = true != z ? C.TIME_UNSET : jEnforceClippingRange;
        if (this.usesStreamPrerollFlags) {
            this.hasProcessedInitialDiscontinuity = true;
        }
        return jEnforceClippingRange;
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public /* synthetic */ long setEndPositionUs(long j2) {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void setUsesStreamPrerollFlags() {
        this.usesStreamPrerollFlags = true;
        this.mediaPeriod.setUsesStreamPrerollFlags();
    }

    public void updateClipping(long j2, long j3) {
        this.startUs = j2;
        this.endUs = j3;
        if (this.enableClippingInMediaPeriod) {
            long endPositionUs = this.mediaPeriod.setEndPositionUs(j3);
            if (endPositionUs != Long.MIN_VALUE && endPositionUs != j3) {
                throw new IllegalStateException(an.d("Period updating end positions not supported, %s!=%s", Long.valueOf(endPositionUs), Long.valueOf(j3)));
            }
            this.isPeriodClippingEndPosition = endPositionUs == j3;
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j2, long j3) {
        this(mediaPeriod, z, j2, j3, false);
    }
}
