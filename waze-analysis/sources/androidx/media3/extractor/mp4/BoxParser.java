package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.Chapter;
import androidx.media3.extractor.mp4.Track;
import androidx.work.WorkInfo;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.b.w;
import com.google.d.d.bn;
import com.google.d.l.c;
import com.google.d.l.d;
import com.google.d.l.j;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BoxParser {
    private static final int EDIT_LIST_DURATION_TOLERANCE_TIMESCALE_UNITS = 2;
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subp = 1937072752;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* compiled from: WazeSource */
    final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j2, long j3) {
            this.avgBitrate = j2;
            this.maxBitrate = j3;
        }
    }

    /* compiled from: WazeSource */
    final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i2 = this.index + 1;
            this.index = i2;
            if (i2 == this.length) {
                return false;
            }
            boolean z = this.chunkOffsetsAreLongs;
            ParsableByteArray parsableByteArray = this.chunkOffsets;
            this.offset = z ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i3 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i3;
                this.nextSamplesPerChunkChangeIndex = i3 > 0 ? (-1) + this.stsc.readUnsignedIntToInt() : -1;
            }
            return true;
        }
    }

    /* compiled from: WazeSource */
    final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j2, long j3) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j2;
            this.peakBitrate = j3;
        }
    }

    /* compiled from: WazeSource */
    final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    /* compiled from: WazeSource */
    final class MdhdData {
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j2, long j3, String str) {
            this.timescale = j2;
            this.mediaDurationUs = j3;
            this.language = str;
        }
    }

    /* compiled from: WazeSource */
    interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* compiled from: WazeSource */
    final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z, boolean z2, boolean z3) {
            this.hasLeftEyeView = z;
            this.hasRightEyeView = z2;
            this.eyeViewsReversed = z3;
        }
    }

    /* compiled from: WazeSource */
    final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i2) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i2];
        }
    }

    /* compiled from: WazeSource */
    final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i2 = this.fixedSampleSize;
            return i2 == -1 ? this.data.readUnsignedIntToInt() : i2;
        }
    }

    /* compiled from: WazeSource */
    final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i2 = this.fieldSize;
            if (i2 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i2 == 16) {
                return this.data.readUnsignedShort();
            }
            int i3 = this.sampleIndex;
            this.sampleIndex = i3 + 1;
            if (i3 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    /* compiled from: WazeSource */
    final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int height;
        private final int id;
        private final boolean mirrorHorizontal;
        private final int rotationDegrees;
        private final int width;

        public TkhdData(int i2, long j2, int i3, int i4, boolean z, int i5, int i6) {
            this.id = i2;
            this.duration = j2;
            this.alternateGroup = i3;
            this.rotationDegrees = i4;
            this.mirrorHorizontal = z;
            this.width = i5;
            this.height = i6;
        }
    }

    /* compiled from: WazeSource */
    final class VexuData {
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private BoxParser() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length;
        int i2 = length - 1;
        return jArr[0] <= j3 && j3 < jArr[Util.constrainValue(4, 0, i2)] && jArr[Util.constrainValue(length + (-4), 0, i2)] < j4 && j4 <= j2 + 2;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i2, int i3, int i4) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i3, null);
        while (position - i3 < i4) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i2) {
                return position;
            }
            position += i5;
        }
        return -1;
    }

    private static String formatVobsubIdx(byte[] bArr, int i2, int i3) throws IOException {
        an.u(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i4 = 0; i4 < bArr.length - 3; i4 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(vobsubYuvToRgb(j.j(bArr[i4], bArr[i4 + 1], bArr[i4 + 2], bArr[i4 + 3])))));
        }
        return "size: " + i2 + "x" + i3 + "\npalette: " + w.b(", ").d(arrayList) + "\n";
    }

    private static String getLanguageFromCode(int i2) {
        char[] cArr = {(char) (((i2 >> 10) & 31) + 96), (char) (((i2 >> 5) & 31) + 96), (char) ((i2 & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c2 = cArr[i3];
            if (c2 < 'a' || c2 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i2) {
        if (i2 == TYPE_soun) {
            return 1;
        }
        if (i2 == TYPE_vide) {
            return 2;
        }
        if (i2 == TYPE_text || i2 == TYPE_sbtl || i2 == TYPE_subt || i2 == TYPE_clcp || i2 == TYPE_subp) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(8);
        for (int i2 = 0; i2 < bits; i2++) {
            parsableBitArray.skipBytes(1);
            int bits2 = parsableBitArray.readBits(8);
            for (int i3 = 0; i3 < bits2; i3++) {
                parsableBitArray.skipBits(6);
                boolean bit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int bits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(bits3);
                builder.setChromaBitdepth(bits3);
                parsableBitArray.skipBytes(1);
                if (bit) {
                    int bits4 = parsableBitArray.readBits(8);
                    int bits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    boolean bit2 = parsableBitArray.readBit();
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits4));
                    builder.setColorRange(true != bit2 ? 2 : 1);
                    builder.setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits5));
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray r27, int r28, int r29, int r30, int r31, java.lang.String r32, boolean r33, androidx.media3.common.DrmInitData r34, androidx.media3.extractor.mp4.BoxParser.StsdData r35, int r36) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.BoxParser$StsdData, int):void");
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    static Metadata parseChpl(ParsableByteArray parsableByteArray) {
        try {
            parsableByteArray.skipBytes(5);
            int i2 = parsableByteArray.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = parsableByteArray.readLong() / 10000;
                if (j2 < 0) {
                    j2 = C.TIME_UNSET;
                }
                String string = parsableByteArray.readString(parsableByteArray.readUnsignedByte());
                Chapter.Builder builder = new Chapter.Builder();
                builder.setStartTimeMs(j2);
                builder.setTitle(new Label(null, string));
                arrayList.add(builder.build());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new Metadata(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        int i4 = i2 + 8;
        String string = null;
        Integer numValueOf = null;
        int i5 = 0;
        int i6 = -1;
        while (i4 - i2 < i3) {
            parsableByteArray.setPosition(i4);
            int i7 = parsableByteArray.readInt();
            int i8 = parsableByteArray.readInt();
            if (i8 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i8 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i8 == 1935894633) {
                i6 = i4;
                i5 = i7;
            }
            i4 += i7;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i6 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i6, i5, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        int i9 = Util.SDK_INT;
        return Pair.create(numValueOf, schiFromParent);
    }

    private static Pair<d, d> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        c cVarC = d.c(unsignedIntToInt);
        c cVarC2 = d.c(unsignedIntToInt);
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            cVarC.b(fullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt());
            cVarC2.b(fullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt());
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(cVarC.a(), cVarC2.a());
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j2 = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j2, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i2 = (i2 << 7) | (unsignedByte & 127);
        }
        return i2;
    }

    public static int parseFullBoxFlags(int i2) {
        return i2 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int parseFullBoxVersion(int i2) {
        return (i2 >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i2, boolean z) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i2) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray, z);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j2;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i2 = 0;
        while (true) {
            int i3 = fullBoxVersion == 0 ? 4 : 8;
            if (i2 >= i3) {
                parsableByteArray.skipBytes(i3);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long unsignedInt2 = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt2 == 0) {
                    break;
                }
                long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedInt2, 1000000L, unsignedInt);
                unsignedInt = unsignedInt;
                j2 = jScaleLargeTimestamp;
            } else {
                i2++;
            }
        }
        j2 = -9223372036854775807L;
        return new MdhdData(unsignedInt, j2, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int i2 = parsableByteArray.readInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i3] = parsableByteArray.readString(i4 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition() + parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 < 0 || i5 >= i2) {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i5);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i4, StsdData stsdData) {
        parsableByteArray.setPosition(i3 + 16);
        if (i2 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                Format.Builder builder = new Format.Builder();
                builder.setId(i4);
                builder.setSampleMimeType(nullTerminatedString);
                stsdData.format = builder.build();
                return;
            }
            return;
        }
        if (i2 == 1769222965) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            byte[] bArr = new byte[unsignedByte];
            parsableByteArray.readBytes(bArr, 0, unsignedByte);
            Format.Builder builder2 = new Format.Builder();
            builder2.setId(i4);
            builder2.setSampleMimeType(MimeTypes.APPLICATION_ITUT_T35);
            builder2.setInitializationData(bn.q(bArr));
            stsdData.format = builder2.build();
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            parsableByteArray.setPosition(i4);
            int i5 = parsableByteArray.readInt() + i4;
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i4, i5);
            }
            i4 = i5;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i4)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i4;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            parsableByteArray.setPosition(i6);
            int i7 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i4 = unsignedByte & 15;
                    i5 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i5, i4, bArr);
            }
            i6 += i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0391  */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.mp4.TrackSampleTable parseStbl(androidx.media3.extractor.mp4.Track r43, androidx.media3.container.Mp4Box.ContainerBox r44, androidx.media3.extractor.GaplessInfoHolder r45, boolean r46) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseStbl(androidx.media3.extractor.mp4.Track, androidx.media3.container.Mp4Box$ContainerBox, androidx.media3.extractor.GaplessInfoHolder, boolean):androidx.media3.extractor.mp4.TrackSampleTable");
    }

    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        parsableByteArray.setPosition(i2 + 8);
        int position = parsableByteArray.getPosition();
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int i5 = unsignedByte & 1;
                return new EyesData(new StriData(1 == i5, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8));
            }
            position += i4;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, TkhdData tkhdData, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int i2 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i2);
        int i3 = 0;
        while (i3 < i2) {
            int position = parsableByteArray.getPosition();
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            int i5 = parsableByteArray.readInt();
            if (i5 == 1635148593 || i5 == 1635148595 || i5 == 1701733238 || i5 == 1831958048 || i5 == 1836070006 || i5 == 1752589105 || i5 == 1751479857 || i5 == 1987470129 || i5 == 1987471665 || i5 == 1932670515 || i5 == 1211250227 || i5 == 1748121139 || i5 == 1987063864 || i5 == 1987063865 || i5 == 1635135537 || i5 == 1685479798 || i5 == 1685479729 || i5 == 1685481573 || i5 == 1685481521 || i5 == 1634760241 || i5 == 1684108849) {
                StsdData stsdData2 = stsdData;
                parseVideoSampleEntry(parsableByteArray, i5, position, i4, tkhdData, str, drmInitData, stsdData2, i3);
                stsdData = stsdData2;
            } else if (i5 == 1836069985 || i5 == 1701733217 || i5 == 1633889587 || i5 == 1700998451 || i5 == 1633889588 || i5 == 1835823201 || i5 == 1685353315 || i5 == 1685353317 || i5 == 1685353320 || i5 == 1685353324 || i5 == 1685353336 || i5 == 1935764850 || i5 == 1935767394 || i5 == 1819304813 || i5 == 1936684916 || i5 == 1953984371 || i5 == 778924082 || i5 == 778924083 || i5 == 1835557169 || i5 == 1835560241 || i5 == 1634492771 || i5 == 1634492791 || i5 == 1970037111 || i5 == 1332770163 || i5 == 1716281667 || i5 == 1767992678 || i5 == 1768973165 || i5 == 1718641517) {
                int i6 = i3;
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i5, position, i4, tkhdData.id, str, z, drmInitData, stsdData3, i6);
                stsdData = stsdData3;
                i3 = i6;
            } else if (i5 == 1414810956 || i5 == 1954034535 || i5 == 2004251764 || i5 == 1937010800 || i5 == 1664495672 || i5 == 1836070003 || i5 == TYPE_text) {
                parseTextSampleEntry(parsableByteArray, i5, position, i4, tkhdData, str, stsdData);
            } else if (i5 == 1835365492 || i5 == 1769222965) {
                parseMetaDataSampleEntry(parsableByteArray, i5, position, tkhdData.id, stsdData);
            } else if (i5 == 1667329389) {
                Format.Builder builder = new Format.Builder();
                builder.setId(tkhdData.id);
                builder.setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION);
                stsdData.format = builder.build();
            }
            parsableByteArray.setPosition(position + i4);
            i3++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i4, TkhdData tkhdData, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i3 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        long j2 = Long.MAX_VALUE;
        bn bnVarQ = null;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i5 = i4 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                bnVarQ = bn.q(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i2 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else if (i2 == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else if (i2 == 1836070003) {
                int position = parsableByteArray.getPosition();
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.readInt() == 1702061171) {
                    EsdsData esdsFromParent = parseEsdsFromParent(parsableByteArray, position);
                    if (esdsFromParent.initializationData == null || esdsFromParent.initializationData.length != 64) {
                        return;
                    }
                    bnVarQ = bn.q(Util.getUtf8Bytes(formatVobsubIdx(esdsFromParent.initializationData, tkhdData.width, tkhdData.height)));
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                } else {
                    str2 = null;
                }
            } else {
                if (i2 != TYPE_text) {
                    throw new IllegalStateException();
                }
                str2 = MimeTypes.TEXT_UNKNOWN;
            }
        }
        if (str2 != null) {
            Format.Builder builder = new Format.Builder();
            builder.setId(tkhdData.id);
            builder.setSampleMimeType(str2);
            builder.setLanguage(str);
            builder.setSubsampleOffsetUs(j2);
            builder.setInitializationData(bnVarQ);
            stsdData.format = builder.build();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.mp4.BoxParser.TkhdData parseTkhd(androidx.media3.common.util.ParsableByteArray r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseTkhd(androidx.media3.common.util.ParsableByteArray):androidx.media3.extractor.mp4.BoxParser$TkhdData");
    }

    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j2, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        d dVar;
        d dVar2;
        Format formatBuild;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<d, d> edts;
        Mp4Box.LeafBox leafBoxOfType;
        Mp4Box.ContainerBox containerBoxOfType2 = containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia);
        an.B(containerBoxOfType2);
        Mp4Box.LeafBox leafBoxOfType2 = containerBoxOfType2.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        an.B(leafBoxOfType2);
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(leafBoxOfType2.data));
        int i2 = -1;
        if (trackTypeForHdlr != -1) {
            Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd);
            an.B(leafBoxOfType3);
            ParsableByteArray parsableByteArray = leafBoxOfType3.data;
            long jScaleLargeTimestamp = C.TIME_UNSET;
            TkhdData tkhd = parseTkhd(parsableByteArray);
            long j3 = j2 == C.TIME_UNSET ? tkhd.duration : j2;
            long j4 = parseMvhd(leafBox.data).timescale;
            if (j3 != C.TIME_UNSET) {
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(j3, 1000000L, j4);
            }
            Mp4Box.ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(Mp4Box.TYPE_minf);
            an.B(containerBoxOfType3);
            Mp4Box.ContainerBox containerBoxOfType4 = containerBoxOfType3.getContainerBoxOfType(Mp4Box.TYPE_stbl);
            an.B(containerBoxOfType4);
            Mp4Box.LeafBox leafBoxOfType4 = containerBoxOfType2.getLeafBoxOfType(Mp4Box.TYPE_mdhd);
            an.B(leafBoxOfType4);
            MdhdData mdhd = parseMdhd(leafBoxOfType4.data);
            Mp4Box.LeafBox leafBoxOfType5 = containerBoxOfType4.getLeafBoxOfType(Mp4Box.TYPE_stsd);
            if (leafBoxOfType5 == null) {
                Log.w(TAG, "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                return null;
            }
            StsdData stsd = parseStsd(leafBoxOfType5.data, tkhd, mdhd.language, drmInitData, z2);
            Mp4Box.ContainerBox containerBoxOfType5 = containerBox.getContainerBoxOfType(Mp4Box.TYPE_tref);
            if (containerBoxOfType5 != null && (leafBoxOfType = containerBoxOfType5.getLeafBoxOfType(Mp4Box.TYPE_chap)) != null) {
                ParsableByteArray parsableByteArray2 = leafBoxOfType.data;
                parsableByteArray2.setPosition(8);
                if (parsableByteArray2.bytesLeft() >= 4) {
                    i2 = parsableByteArray2.readInt();
                }
            }
            if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
                dVar = null;
                dVar2 = null;
            } else {
                dVar2 = (d) edts.first;
                dVar = (d) edts.second;
            }
            if (stsd.format != null) {
                if (tkhd.alternateGroup != 0) {
                    Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(tkhd.alternateGroup);
                    Format.Builder builderBuildUpon = stsd.format.buildUpon();
                    Metadata metadata = stsd.format.metadata;
                    builderBuildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData));
                    formatBuild = builderBuildUpon.build();
                } else {
                    formatBuild = stsd.format;
                }
                boolean zEquals = true ^ Objects.equals(formatBuild.sampleMimeType, MimeTypes.TEXT_UNKNOWN);
                Track.Builder builder = new Track.Builder();
                builder.setId(tkhd.id);
                builder.setType(trackTypeForHdlr);
                builder.setTimescale(mdhd.timescale);
                builder.setMovieTimescale(j4);
                builder.setDurationUs(jScaleLargeTimestamp);
                builder.setMediaDurationUs(mdhd.mediaDurationUs);
                builder.setFormat(formatBuild);
                builder.setSampleTransformation(stsd.requiredSampleTransformation);
                builder.setSampleDescriptionEncryptionBoxes(stsd.trackEncryptionBoxes);
                builder.setNalUnitLengthFieldLength(stsd.nalUnitLengthFieldLength);
                builder.setEditListDurations(dVar2);
                builder.setEditListMediaTimes(dVar);
                builder.setShouldBeExposed(zEquals);
                builder.setChapterTrackId(i2);
                return builder.build();
            }
        }
        return null;
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j2, DrmInitData drmInitData, boolean z, boolean z2, t<Track, Track> tVar, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < containerBox.containerChildren.size(); i2++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i2);
            if (containerBox2.type == 1953653099) {
                Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd);
                an.B(leafBoxOfType);
                Track trackApply = tVar.apply(parseTrak(containerBox2, leafBoxOfType, j2, drmInitData, z, z2));
                if (trackApply != null) {
                    Mp4Box.ContainerBox containerBoxOfType = containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia);
                    an.B(containerBoxOfType);
                    Mp4Box.ContainerBox containerBoxOfType2 = containerBoxOfType.getContainerBoxOfType(Mp4Box.TYPE_minf);
                    an.B(containerBoxOfType2);
                    Mp4Box.ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(Mp4Box.TYPE_stbl);
                    an.B(containerBoxOfType3);
                    arrayList.add(parseStbl(trackApply, containerBoxOfType3, gaplessInfoHolder, z3));
                }
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox, boolean z) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt() + position;
            int i3 = parsableByteArray.readInt();
            if (i3 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, i2, z));
            } else if (i3 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, i2));
            } else if (i3 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            } else if (i3 == 1667788908) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseChpl(parsableByteArray));
            }
            parsableByteArray.setPosition(i2);
        }
        return metadata;
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i2, boolean z) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt() + position;
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, i3, z);
            }
            parsableByteArray.setPosition(i3);
        }
        return null;
    }

    static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        parsableByteArray.setPosition(i2 + 8);
        int position = parsableByteArray.getPosition();
        EyesData stereoViewBox = null;
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(parsableByteArray, position, i4);
            }
            position += i4;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new VexuData(stereoViewBox);
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x0649  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseVideoSampleEntry(androidx.media3.common.util.ParsableByteArray r45, int r46, int r47, int r48, androidx.media3.extractor.mp4.BoxParser.TkhdData r49, java.lang.String r50, androidx.media3.common.DrmInitData r51, androidx.media3.extractor.mp4.BoxParser.StsdData r52, int r53) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseVideoSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, androidx.media3.extractor.mp4.BoxParser$TkhdData, java.lang.String, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.BoxParser$StsdData, int):void");
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i2) {
        int i3 = ((i2 >> 8) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i4 = (i2 >> 16) & 255;
        int iConstrainValue = Util.constrainValue(((i3 * 14075) / 10000) + i4, 0, 255) << 16;
        int i5 = (i2 & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        return iConstrainValue | (Util.constrainValue((i4 - ((i5 * DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CUSTOMER_PARKING) / 10000)) - ((i3 * 7169) / 10000), 0, 255) << 8) | Util.constrainValue(i4 + ((i5 * 17790) / 10000), 0, 255);
    }
}
