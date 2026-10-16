package androidx.media3.extractor.ts;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.d.bn;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.AdtsExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AdtsExtractor.lambda$static$0();
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return createExtractors();
        }
    };
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private final ParsableByteArray scratch;
    private final ParsableBitArray scratchBits;
    private boolean startedPacket;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor(int i2) {
        this.flags = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.reader = new AdtsReader(true, "audio/mp4a-latm");
        this.packetBuffer = new ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new ParsableBitArray(parsableByteArray.getData());
    }

    private void calculateAverageFrameSize(ExtractorInput extractorInput) throws ParserException {
        int bits;
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j2 = 0;
        int i2 = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i3 = 0;
        do {
            try {
                if (!extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
                    break;
                }
                this.scratch.setPosition(0);
                if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                    break;
                }
                if (!extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                    break;
                }
                this.scratchBits.setPosition(14);
                bits = this.scratchBits.readBits(13);
                if (bits <= 6) {
                    this.hasCalculatedAverageFrameSize = true;
                    throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j2 += bits;
                i3++;
                if (i3 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (extractorInput.advancePeekPosition(bits - 6, true));
        i2 = i3;
        extractorInput.resetPeekPosition();
        if (i2 > 0) {
            this.averageFrameSize = (int) (j2 / i2);
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private static int getBitrateFromFrameSize(int i2, long j2) {
        return (int) ((i2 * 8000000) / j2);
    }

    private SeekMap getConstantBitrateSeekMap(long j2, boolean z) {
        return new ConstantBitrateSeekMap(j2, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z);
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new AdtsExtractor()};
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void maybeOutputSeekMap(long r7, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.hasOutputSeekMap
            if (r0 == 0) goto L5
            goto L21
        L5:
            int r0 = r6.flags
            r1 = 1
            r0 = r0 & r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L3f
            int r0 = r6.averageFrameSize
            if (r0 <= 0) goto L3f
            androidx.media3.extractor.ts.AdtsReader r0 = r6.reader
            long r4 = r0.getSampleDurationUs()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L22
            if (r9 == 0) goto L21
            goto L22
        L21:
            return
        L22:
            androidx.media3.extractor.ts.AdtsReader r9 = r6.reader
            long r4 = r9.getSampleDurationUs()
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 == 0) goto L3f
            androidx.media3.extractor.ExtractorOutput r9 = r6.extractorOutput
            int r0 = r6.flags
            r0 = r0 & 2
            if (r0 == 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = 0
        L37:
            androidx.media3.extractor.SeekMap r7 = r6.getConstantBitrateSeekMap(r7, r0)
            r9.seekMap(r7)
            goto L49
        L3f:
            androidx.media3.extractor.ExtractorOutput r7 = r6.extractorOutput
            androidx.media3.extractor.SeekMap$Unseekable r8 = new androidx.media3.extractor.SeekMap$Unseekable
            r8.<init>(r2)
            r7.seekMap(r8)
        L49:
            r6.hasOutputSeekMap = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.AdtsExtractor.maybeOutputSeekMap(long, boolean):void");
    }

    private int peekId3Header(ExtractorInput extractorInput) {
        int i2 = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            i2 += synchSafeInt + 10;
            extractorInput.advancePeekPosition(synchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i2);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i2;
        }
        return i2;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ List getSniffFailureDetails() {
        return bn.p();
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(androidx.media3.extractor.ExtractorInput r7, androidx.media3.extractor.PositionHolder r8) throws androidx.media3.common.ParserException {
        /*
            r6 = this;
            androidx.media3.extractor.ExtractorOutput r8 = r6.extractorOutput
            com.google.d.b.an.B(r8)
            int r8 = r6.flags
            r0 = r8 & 2
            long r1 = r7.getLength()
            r3 = 1
            if (r0 != 0) goto L1c
            r8 = r8 & r3
            if (r8 == 0) goto L1f
            r4 = -1
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 == 0) goto L1a
            goto L1c
        L1a:
            r1 = r4
            goto L1f
        L1c:
            r6.calculateAverageFrameSize(r7)
        L1f:
            androidx.media3.common.util.ParsableByteArray r8 = r6.packetBuffer
            byte[] r8 = r8.getData()
            r0 = 2048(0x800, float:2.87E-42)
            r4 = 0
            int r7 = r7.read(r8, r4, r0)
            r8 = -1
            if (r7 != r8) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r4
        L32:
            r6.maybeOutputSeekMap(r1, r0)
            if (r0 == 0) goto L38
            return r8
        L38:
            androidx.media3.common.util.ParsableByteArray r8 = r6.packetBuffer
            r8.setPosition(r4)
            androidx.media3.common.util.ParsableByteArray r8 = r6.packetBuffer
            r8.setLimit(r7)
            boolean r7 = r6.startedPacket
            if (r7 != 0) goto L50
            androidx.media3.extractor.ts.AdtsReader r7 = r6.reader
            long r0 = r6.firstSampleTimestampUs
            r8 = 4
            r7.packetStarted(r0, r8)
            r6.startedPacket = r3
        L50:
            androidx.media3.extractor.ts.AdtsReader r7 = r6.reader
            androidx.media3.common.util.ParsableByteArray r6 = r6.packetBuffer
            r7.consume(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.AdtsExtractor.read(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j3;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        int iPeekId3Header = peekId3Header(extractorInput);
        int i2 = iPeekId3Header;
        int i3 = 0;
        int i4 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int bits = this.scratchBits.readBits(13);
                if (bits <= 6) {
                    i2++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i2);
                } else {
                    extractorInput.advancePeekPosition(bits - 6);
                    i4 += bits;
                }
            } else {
                i2++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - iPeekId3Header < 8192);
        return false;
    }

    public AdtsExtractor() {
        this(0);
    }
}
