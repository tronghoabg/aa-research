package androidx.media3.extractor.ts;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.TsExtractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return TsExtractor.lambda$static$0();
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
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 1;
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DTS_HD = 136;
    public static final int TS_STREAM_TYPE_DTS_UHD = 139;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MHAS = 45;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final TsDurationReader durationReader;
    private final int extractorFlags;
    private boolean hasOutputSeekMap;
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private TsBinarySearchSeeker tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* compiled from: WazeSource */
    class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch;
        final /* synthetic */ TsExtractor this$0;

        public PatReader(TsExtractor tsExtractor) {
            Objects.requireNonNull(tsExtractor);
            this.this$0 = tsExtractor;
            this.patScratch = new ParsableBitArray(new byte[4]);
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i2 = 0; i2 < iBytesLeft; i2++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    ParsableBitArray parsableBitArray = this.patScratch;
                    int bits = parsableBitArray.readBits(16);
                    parsableBitArray.skipBits(3);
                    ParsableBitArray parsableBitArray2 = this.patScratch;
                    if (bits == 0) {
                        parsableBitArray2.skipBits(13);
                    } else {
                        int bits2 = parsableBitArray2.readBits(13);
                        if (this.this$0.tsPayloadReaders.get(bits2) == null) {
                            TsExtractor tsExtractor = this.this$0;
                            tsExtractor.tsPayloadReaders.put(bits2, new SectionReader(new PmtReader(tsExtractor, bits2)));
                            this.this$0.remainingPmts++;
                        }
                    }
                }
                if (this.this$0.mode != 2) {
                    this.this$0.tsPayloadReaders.remove(0);
                }
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    /* compiled from: WazeSource */
    class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_HD = 14;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_UHD = 33;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch;
        final /* synthetic */ TsExtractor this$0;
        private final SparseIntArray trackIdToPidScratch;
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch;

        public PmtReader(TsExtractor tsExtractor, int i2) {
            Objects.requireNonNull(tsExtractor);
            this.this$0 = tsExtractor;
            this.pmtScratch = new ParsableBitArray(new byte[5]);
            this.trackIdToReaderScratch = new SparseArray<>();
            this.trackIdToPidScratch = new SparseIntArray();
            this.pid = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private androidx.media3.extractor.ts.TsPayloadReader.EsInfo readEsInfo(androidx.media3.common.util.ParsableByteArray r19, int r20) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.PmtReader.readEsInfo(androidx.media3.common.util.ParsableByteArray, int):androidx.media3.extractor.ts.TsPayloadReader$EsInfo");
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (this.this$0.mode == 1 || this.this$0.mode == 2 || this.this$0.remainingPmts == 1) {
                timestampAdjuster = (TimestampAdjuster) this.this$0.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) this.this$0.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                this.this$0.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int i2 = 3;
                parsableByteArray.skipBytes(3);
                parsableByteArray.readBytes(this.pmtScratch, 2);
                this.pmtScratch.skipBits(3);
                int i3 = 13;
                this.this$0.pcrPid = this.pmtScratch.readBits(13);
                parsableByteArray.readBytes(this.pmtScratch, 2);
                int i4 = 4;
                this.pmtScratch.skipBits(4);
                parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
                if (this.this$0.mode == 2 && this.this$0.id3Reader == null) {
                    TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, 0, null, Util.EMPTY_BYTE_ARRAY);
                    TsExtractor tsExtractor = this.this$0;
                    tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                    if (this.this$0.id3Reader != null) {
                        TsExtractor tsExtractor2 = this.this$0;
                        tsExtractor2.id3Reader.init(timestampAdjuster, tsExtractor2.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
                    }
                }
                this.trackIdToReaderScratch.clear();
                this.trackIdToPidScratch.clear();
                int iBytesLeft = parsableByteArray.bytesLeft();
                while (iBytesLeft > 0) {
                    parsableByteArray.readBytes(this.pmtScratch, 5);
                    ParsableBitArray parsableBitArray = this.pmtScratch;
                    int bits = parsableBitArray.readBits(8);
                    parsableBitArray.skipBits(i2);
                    int bits2 = this.pmtScratch.readBits(i3);
                    this.pmtScratch.skipBits(i4);
                    int bits3 = this.pmtScratch.readBits(12);
                    TsPayloadReader.EsInfo esInfo2 = readEsInfo(parsableByteArray, bits3);
                    if (bits == 6 || bits == 5) {
                        bits = esInfo2.streamType;
                    }
                    iBytesLeft -= bits3 + 5;
                    int i5 = this.this$0.mode == 2 ? bits : bits2;
                    if (!this.this$0.trackIds.get(i5)) {
                        TsPayloadReader tsPayloadReaderCreatePayloadReader = (this.this$0.mode == 2 && bits == 21) ? this.this$0.id3Reader : this.this$0.payloadReaderFactory.createPayloadReader(bits, esInfo2);
                        if (this.this$0.mode != 2 || bits2 < this.trackIdToPidScratch.get(i5, 8192)) {
                            this.trackIdToPidScratch.put(i5, bits2);
                            this.trackIdToReaderScratch.put(i5, tsPayloadReaderCreatePayloadReader);
                        }
                    }
                    i2 = 3;
                    i4 = 4;
                    i3 = 13;
                }
                int size = this.trackIdToPidScratch.size();
                for (int i6 = 0; i6 < size; i6++) {
                    SparseIntArray sparseIntArray = this.trackIdToPidScratch;
                    TsExtractor tsExtractor3 = this.this$0;
                    int iKeyAt = sparseIntArray.keyAt(i6);
                    int iValueAt = sparseIntArray.valueAt(i6);
                    tsExtractor3.trackIds.put(iKeyAt, true);
                    this.this$0.trackPids.put(iValueAt, true);
                    TsPayloadReader tsPayloadReaderValueAt = this.trackIdToReaderScratch.valueAt(i6);
                    if (tsPayloadReaderValueAt != null) {
                        if (tsPayloadReaderValueAt != this.this$0.id3Reader) {
                            tsPayloadReaderValueAt.init(timestampAdjuster, this.this$0.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                        }
                        this.this$0.tsPayloadReaders.put(iValueAt, tsPayloadReaderValueAt);
                    }
                }
                int i7 = this.this$0.mode;
                TsExtractor tsExtractor4 = this.this$0;
                if (i7 == 2) {
                    if (tsExtractor4.tracksEnded) {
                        return;
                    }
                    this.this$0.output.endTracks();
                    this.this$0.remainingPmts = 0;
                    this.this$0.tracksEnded = true;
                    return;
                }
                tsExtractor4.tsPayloadReaders.remove(this.pid);
                TsExtractor tsExtractor5 = this.this$0;
                tsExtractor5.remainingPmts = tsExtractor5.mode == 1 ? 0 : this.this$0.remainingPmts - 1;
                if (this.this$0.remainingPmts == 0) {
                    this.this$0.output.endTracks();
                    this.this$0.tracksEnded = true;
                }
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public TsExtractor(int i2, int i3, SubtitleParser.Factory factory, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory2, int i4) {
        an.B(factory2);
        this.payloadReaderFactory = factory2;
        this.timestampSearchBytes = i4;
        this.mode = i2;
        this.extractorFlags = i3;
        this.subtitleParserFactory = factory;
        if (i2 == 1 || i2 == 2) {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        } else {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.trackPids = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new TsDurationReader(i4);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = this.tsPacketBuffer;
        byte[] data = parsableByteArray.getData();
        if (9400 - parsableByteArray.getPosition() < 188) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(data, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int iLimit = this.tsPacketBuffer.limit();
            int i2 = extractorInput.read(data, iLimit, 9400 - iLimit);
            if (i2 == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(iLimit + i2);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
        ParsableByteArray parsableByteArray = this.tsPacketBuffer;
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        int iFindSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), position, iLimit);
        this.tsPacketBuffer.setPosition(iFindSyncBytePosition);
        int i2 = iFindSyncBytePosition + 188;
        if (i2 <= iLimit) {
            this.bytesSinceLastSync = 0;
            return i2;
        }
        int i3 = this.bytesSinceLastSync + (iFindSyncBytePosition - position);
        this.bytesSinceLastSync = i3;
        if (this.mode != 2 || i3 <= 376) {
            return i2;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new TsExtractor(factory)};
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new TsExtractor(1, SubtitleParser.Factory.UNSUPPORTED)};
    }

    private void maybeOutputSeekMap(long j2) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() == C.TIME_UNSET) {
            this.output.seekMap(new SeekMap.Unseekable(this.durationReader.getDurationUs()));
            return;
        }
        TsDurationReader tsDurationReader = this.durationReader;
        TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(tsDurationReader.getPcrTimestampAdjuster(), tsDurationReader.getDurationUs(), j2, this.pcrPid, this.timestampSearchBytes);
        this.tsBinarySearchSeeker = tsBinarySearchSeeker;
        this.output.seekMap(tsBinarySearchSeeker.getSeekMap());
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.TsExtractor$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return TsExtractor.lambda$newFactory$0(factory);
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
            public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory2) {
                return this;
            }

            @Override // androidx.media3.extractor.ExtractorsFactory
            public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
                return createExtractors();
            }
        };
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        int i2 = 0;
        while (true) {
            SparseArray<TsPayloadReader> sparseArray = this.tsPayloadReaders;
            if (i2 >= size) {
                sparseArray.put(0, new SectionReader(new PatReader(this)));
                this.id3Reader = null;
                return;
            } else {
                sparseArray.put(sparseArrayCreateInitialPayloadReaders.keyAt(i2), sparseArrayCreateInitialPayloadReaders.valueAt(i2));
                i2++;
            }
        }
    }

    private boolean shouldConsumePacketPayload(int i2) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i2, false);
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
        if ((this.extractorFlags & 1) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        int i2;
        int i3 = this.mode;
        long length = extractorInput.getLength();
        boolean z = this.tracksEnded;
        boolean z2 = i3 == 2;
        if (z) {
            if (length != -1 && !z2 && !this.durationReader.isDurationReadFinished()) {
                return this.durationReader.readDuration(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            TsBinarySearchSeeker tsBinarySearchSeeker = this.tsBinarySearchSeeker;
            if (tsBinarySearchSeeker != null && tsBinarySearchSeeker.isSeeking()) {
                return tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            for (int i4 = 0; i4 < this.tsPayloadReaders.size(); i4++) {
                TsPayloadReader tsPayloadReaderValueAt = this.tsPayloadReaders.valueAt(i4);
                if (tsPayloadReaderValueAt instanceof PesReader) {
                    PesReader pesReader = (PesReader) tsPayloadReaderValueAt;
                    if (pesReader.canConsumeSynthesizedEmptyPusi(z2)) {
                        pesReader.consume(new ParsableByteArray(), 1);
                    }
                }
            }
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.tsPacketBuffer.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i5 = this.tsPacketBuffer.readInt();
        if ((8388608 & i5) != 0) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i6 = (4194304 & i5) != 0 ? 1 : 0;
        int i7 = i5 & 32;
        int i8 = (i5 >> 8) & 8191;
        TsPayloadReader tsPayloadReader = (i5 & 16) != 0 ? this.tsPayloadReaders.get(i8) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i9 = i5 & 15;
            i2 = 0;
            int i10 = this.continuityCounters.get(i8, i9 - 1);
            this.continuityCounters.put(i8, i9);
            if (i10 == i9) {
                this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i9 != ((i10 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        } else {
            i2 = 0;
        }
        if (i7 != 0) {
            ParsableByteArray parsableByteArray = this.tsPacketBuffer;
            int unsignedByte = parsableByteArray.readUnsignedByte();
            i6 |= (parsableByteArray.readUnsignedByte() & 64) != 0 ? 2 : i2;
            this.tsPacketBuffer.skipBytes(unsignedByte - 1);
        }
        boolean z3 = this.tracksEnded;
        if (shouldConsumePacketPayload(i8)) {
            this.tsPacketBuffer.setLimit(iFindEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i6);
            this.tsPacketBuffer.setLimit(iLimit);
        }
        if (this.mode != 2 && !z3 && this.tracksEnded && length != -1) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return i2;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void seek(long r9, long r11) {
        /*
            r8 = this;
            int r9 = r8.mode
            r10 = 2
            r0 = 0
            if (r9 == r10) goto L8
            r9 = 1
            goto L9
        L8:
            r9 = r0
        L9:
            com.google.d.b.an.u(r9)
            java.util.List<androidx.media3.common.util.TimestampAdjuster> r9 = r8.timestampAdjusters
            int r9 = r9.size()
            r10 = r0
        L13:
            r1 = 0
            if (r10 >= r9) goto L42
            java.util.List<androidx.media3.common.util.TimestampAdjuster> r3 = r8.timestampAdjusters
            java.lang.Object r3 = r3.get(r10)
            androidx.media3.common.util.TimestampAdjuster r3 = (androidx.media3.common.util.TimestampAdjuster) r3
            long r4 = r3.getTimestampOffsetUs()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r3.getFirstSampleTimestampUs()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L3f
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L3f
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L3f
        L3c:
            r3.reset(r11)
        L3f:
            int r10 = r10 + 1
            goto L13
        L42:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L4d
            androidx.media3.extractor.ts.TsBinarySearchSeeker r9 = r8.tsBinarySearchSeeker
            if (r9 == 0) goto L4d
            r9.setSeekTargetUs(r11)
        L4d:
            androidx.media3.common.util.ParsableByteArray r9 = r8.tsPacketBuffer
            r9.reset(r0)
            android.util.SparseIntArray r9 = r8.continuityCounters
            r9.clear()
            r9 = r0
        L58:
            android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> r10 = r8.tsPayloadReaders
            int r10 = r10.size()
            if (r9 >= r10) goto L6e
            android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> r10 = r8.tsPayloadReaders
            java.lang.Object r10 = r10.valueAt(r9)
            androidx.media3.extractor.ts.TsPayloadReader r10 = (androidx.media3.extractor.ts.TsPayloadReader) r10
            r10.seek()
            int r9 = r9 + 1
            goto L58
        L6e:
            r8.bytesSinceLastSync = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.seek(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r0 = r0 + 1;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sniff(androidx.media3.extractor.ExtractorInput r6) {
        /*
            r5 = this;
            androidx.media3.common.util.ParsableByteArray r5 = r5.tsPacketBuffer
            byte[] r5 = r5.getData()
            r0 = 940(0x3ac, float:1.317E-42)
            r1 = 0
            r6.peekFully(r5, r1, r0)
            r0 = r1
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r0 >= r2) goto L29
            r2 = r1
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r0
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r0 = r0 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.skipFully(r0)
            r5 = 1
            return r5
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.sniff(androidx.media3.extractor.ExtractorInput):boolean");
    }

    @Deprecated
    public TsExtractor(int i2) {
        this(1, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i2), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i2, int i3, int i4) {
        this(i2, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i3), i4);
    }

    @Deprecated
    public TsExtractor() {
        this(1, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i2, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this(i2, 1, SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i2, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i3) {
        this(i2, 1, SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, i3);
    }

    public TsExtractor(int i2, SubtitleParser.Factory factory) {
        this(1, i2, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public TsExtractor(SubtitleParser.Factory factory) {
        this(1, 0, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }
}
