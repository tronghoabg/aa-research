package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import java.io.EOFException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {
    private static final String TAG = "SubtitleTranscodingTO";
    private Format currentFormat;
    private SubtitleParser currentSubtitleParser;
    private final TrackOutput delegate;
    private boolean shouldSuppressParsingErrors;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final CueEncoder cueEncoder = new CueEncoder();
    private int sampleDataStart = 0;
    private int sampleDataEnd = 0;
    private byte[] sampleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray parsableScratch = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    private void ensureSampleDataCapacity(int i2) {
        int length = this.sampleData.length;
        int i3 = this.sampleDataEnd;
        if (length - i3 >= i2) {
            return;
        }
        int i4 = i3 - this.sampleDataStart;
        int iMax = Math.max(i4 + i4, i2 + i4);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i4);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i4;
        this.sampleData = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outputSample, reason: merged with bridge method [inline-methods] */
    public void lambda$sampleMetadata$0(CuesWithTiming cuesWithTiming, long j2, int i2) {
        an.B(this.currentFormat);
        byte[] bArrEncode = this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs);
        this.parsableScratch.reset(bArrEncode);
        int length = bArrEncode.length;
        this.delegate.sampleData(this.parsableScratch, length);
        long j3 = cuesWithTiming.startTimeUs;
        Format format = this.currentFormat;
        if (j3 == C.TIME_UNSET) {
            an.u(format.subsampleOffsetUs == Long.MAX_VALUE);
        } else {
            long j4 = format.subsampleOffsetUs;
            j2 = j4 == Long.MAX_VALUE ? j2 + j3 : j3 + j4;
        }
        this.delegate.sampleMetadata(j2, i2 | 1, length, 0, null);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public /* synthetic */ void durationUs(long j2) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        an.B(format.sampleMimeType);
        an.l(MimeTypes.getTrackType(format.sampleMimeType) == 3);
        if (!format.equals(this.currentFormat)) {
            this.currentFormat = format;
            this.currentSubtitleParser = this.subtitleParserFactory.supportsFormat(format) ? this.subtitleParserFactory.create(format) : null;
        }
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        TrackOutput trackOutput = this.delegate;
        if (subtitleParser == null) {
            trackOutput.format(format);
            return;
        }
        Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES);
        builderBuildUpon.setCodecs(format.sampleMimeType);
        builderBuildUpon.setSubsampleOffsetUs(Long.MAX_VALUE);
        builderBuildUpon.setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
        trackOutput.format(builderBuildUpon.build());
    }

    public void resetSubtitleParser() {
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        if (subtitleParser != null) {
            subtitleParser.reset();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i2, boolean z, int i3) throws EOFException {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData(dataReader, i2, z, i3);
        }
        ensureSampleDataCapacity(i2);
        int i4 = dataReader.read(this.sampleData, this.sampleDataEnd, i2);
        if (i4 != -1) {
            this.sampleDataEnd += i4;
            return i4;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(final long r5, final int r7, int r8, int r9, androidx.media3.extractor.TrackOutput.CryptoData r10) {
        /*
            r4 = this;
            androidx.media3.extractor.text.SubtitleParser r0 = r4.currentSubtitleParser
            if (r0 != 0) goto La
            androidx.media3.extractor.TrackOutput r4 = r4.delegate
            r4.sampleMetadata(r5, r7, r8, r9, r10)
            return
        La:
            r1 = 0
            if (r10 != 0) goto Lf
            r10 = 1
            goto L10
        Lf:
            r10 = r1
        L10:
            java.lang.String r0 = "DRM on subtitles is not supported"
            com.google.d.b.an.m(r10, r0)
            int r10 = r4.sampleDataEnd
            int r10 = r10 - r9
            int r10 = r10 - r8
            r2 = r5
            androidx.media3.extractor.text.SubtitleParser r5 = r4.currentSubtitleParser     // Catch: java.lang.RuntimeException -> L2f
            byte[] r6 = r4.sampleData     // Catch: java.lang.RuntimeException -> L2f
            androidx.media3.extractor.text.SubtitleParser$OutputOptions r9 = androidx.media3.extractor.text.SubtitleParser.OutputOptions.allCues()     // Catch: java.lang.RuntimeException -> L2f
            r0 = r7
            r7 = r10
            androidx.media3.extractor.text.SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0 r10 = new androidx.media3.extractor.text.SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0     // Catch: java.lang.RuntimeException -> L2d
            r10.<init>()     // Catch: java.lang.RuntimeException -> L2d
            r5.parse(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L2d
            goto L3d
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r7 = r10
        L31:
            r5 = r0
            boolean r6 = r4.shouldSuppressParsingErrors
            if (r6 == 0) goto L4a
            java.lang.String r6 = "SubtitleTranscodingTO"
            java.lang.String r9 = "Parsing subtitles failed, ignoring sample."
            androidx.media3.common.util.Log.w(r6, r9, r5)
        L3d:
            int r10 = r7 + r8
            r4.sampleDataStart = r10
            int r5 = r4.sampleDataEnd
            if (r10 != r5) goto L49
            r4.sampleDataStart = r1
            r4.sampleDataEnd = r1
        L49:
            return
        L4a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.SubtitleTranscodingTrackOutput.sampleMetadata(long, int, int, int, androidx.media3.extractor.TrackOutput$CryptoData):void");
    }

    public void shouldSuppressParsingErrors(boolean z) {
        this.shouldSuppressParsingErrors = z;
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
    public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i2, i3);
            return;
        }
        ensureSampleDataCapacity(i2);
        parsableByteArray.readBytes(this.sampleData, this.sampleDataEnd, i2);
        this.sampleDataEnd += i2;
    }
}
