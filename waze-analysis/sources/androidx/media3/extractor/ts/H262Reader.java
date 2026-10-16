package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final String containerMimeType;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    /* compiled from: WazeSource */
    final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i2) {
            this.data = new byte[i2];
        }

        public void onData(byte[] bArr, int i2, int i3) {
            if (this.isFilling) {
                int i4 = i3 - i2;
                byte[] bArrCopyOf = this.data;
                int length = bArrCopyOf.length;
                int i5 = this.length + i4;
                if (length < i5) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5 + i5);
                    this.data = bArrCopyOf;
                }
                System.arraycopy(bArr, i2, bArrCopyOf, this.length, i4);
                this.length += i4;
            }
        }

        public boolean onStartCode(int i2, int i3) {
            if (this.isFilling) {
                int i4 = this.length - i3;
                this.length = i4;
                if (this.sequenceExtensionPosition != 0 || i2 != 181) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i4;
            } else if (i2 == 179) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    H262Reader(UserDataReader userDataReader, String str) {
        ParsableByteArray parsableByteArray;
        this.userDataReader = userDataReader;
        this.containerMimeType = str;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(178, 128);
            parsableByteArray = new ParsableByteArray();
        } else {
            parsableByteArray = null;
            this.userData = null;
        }
        this.userDataParsable = parsableByteArray;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<androidx.media3.common.Format, java.lang.Long> parseCsdBuffer(androidx.media3.extractor.ts.H262Reader.CsdBuffer r9, java.lang.String r10, java.lang.String r11) {
        /*
            byte[] r0 = r9.data
            int r1 = r9.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 7
            r8 = r0[r7]
            r8 = r8 & 240(0xf0, float:3.36E-43)
            r4 = r4 & 15
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            int r5 = r8 >> 4
            int r4 = r4 << 8
            r4 = r4 | r6
            r6 = 2
            if (r5 == r6) goto L3b
            r6 = 3
            if (r5 == r6) goto L36
            if (r5 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L42
        L31:
            int r1 = r4 * 121
            int r5 = r2 * 100
            goto L3f
        L36:
            int r1 = r4 * 16
            int r5 = r2 * 9
            goto L3f
        L3b:
            int r1 = r4 * 4
            int r5 = r2 * 3
        L3f:
            float r1 = (float) r1
            float r5 = (float) r5
            float r1 = r1 / r5
        L42:
            androidx.media3.common.Format$Builder r5 = new androidx.media3.common.Format$Builder
            r5.<init>()
            r5.setId(r10)
            r5.setContainerMimeType(r11)
            java.lang.String r10 = "video/mpeg2"
            r5.setSampleMimeType(r10)
            r5.setWidth(r2)
            r5.setHeight(r4)
            r5.setPixelWidthHeightRatio(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            r5.setInitializationData(r10)
            androidx.media3.common.Format r10 = r5.build()
            r11 = r0[r7]
            r11 = r11 & 15
            int r11 = r11 + (-1)
            r1 = 0
            if (r11 < 0) goto L94
            double[] r4 = androidx.media3.extractor.ts.H262Reader.FRAME_RATE_VALUES
            int r5 = r4.length
            if (r11 >= r5) goto L94
            r1 = r4[r11]
            int r9 = r9.sequenceExtensionPosition
            int r9 = r9 + 9
            r9 = r0[r9]
            r11 = r9 & 96
            int r11 = r11 >> r3
            r9 = r9 & 31
            if (r11 == r9) goto L8d
            double r3 = (double) r11
            int r9 = r9 + 1
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            double r5 = (double) r9
            double r3 = r3 / r5
            double r1 = r1 * r3
        L8d:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L94:
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H262Reader.parseCsdBuffer(androidx.media3.extractor.ts.H262Reader$CsdBuffer, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(androidx.media3.common.util.ParsableByteArray r20) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H262Reader.consume(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        an.B(this.output);
        long j2 = this.sampleTimeUs;
        if (j2 != C.TIME_UNSET) {
            boolean z = this.sampleIsKeyframe;
            long j3 = this.totalBytesWritten - this.samplePosition;
            this.output.sampleMetadata(j2, z ? 1 : 0, (int) j3, 0, null);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public /* synthetic */ void packetFinished() {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.pesTimeUs = j2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    public H262Reader(String str) {
        this(null, str);
    }
}
