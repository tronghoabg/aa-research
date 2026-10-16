package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WavUtil;
import androidx.media3.extractor.ExtractorInput;
import com.google.d.b.an;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";
    private static final byte[] WAVEEXT_SUBFORMAT = {0, 0, 0, 0, StylePropertiesKt.BottomId, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] AMBISONIC_SUBFORMAT = {0, 0, StylePropertiesKt.CameraDistanceId, 7, -45, StylePropertiesKt.MinWidthId, -122, 68, -56, -63, -54, 0, 0, 0};

    /* compiled from: WazeSource */
    final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int i2, long j2) {
            this.id = i2;
            this.size = j2;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static boolean checkFileType(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i2 = ChunkHeader.peek(extractorInput, parsableByteArray).id;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i3 = parsableByteArray.readInt();
        if (i3 == 1463899717) {
            return true;
        }
        Log.e(TAG, "Unsupported form type: " + i3);
        return false;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) throws ParserException {
        byte[] bArr;
        int i2;
        byte[] bArr2;
        int i3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(WavUtil.FMT_FOURCC, extractorInput, parsableByteArray);
        an.u(chunkHeaderSkipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i4 = ((int) chunkHeaderSkipToChunk.size) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            extractorInput.peekFully(bArr, 0, i4);
            if (littleEndianUnsignedShort == 65534) {
                if (i4 == 24) {
                    ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr);
                    parsableByteArray2.readLittleEndianUnsignedShort();
                    int littleEndianUnsignedShort5 = parsableByteArray2.readLittleEndianUnsignedShort();
                    if (littleEndianUnsignedShort5 != 0 && littleEndianUnsignedShort5 != littleEndianUnsignedShort4) {
                        throw ParserException.createForUnsupportedContainerFeature("validBits ( " + littleEndianUnsignedShort5 + ")  != bitsPerSample( " + littleEndianUnsignedShort4 + ") are not supported");
                    }
                    int littleEndianUnsignedIntToInt3 = parsableByteArray2.readLittleEndianUnsignedIntToInt();
                    if (!WavUtil.isChannelMaskValid(littleEndianUnsignedIntToInt3, littleEndianUnsignedShort2)) {
                        throw ParserException.createForUnsupportedContainerFeature("Channel mask " + littleEndianUnsignedIntToInt3 + " is invalid or does not match channel count " + littleEndianUnsignedShort2);
                    }
                    int littleEndianUnsignedShort6 = parsableByteArray2.readLittleEndianUnsignedShort();
                    byte[] bArr3 = new byte[14];
                    parsableByteArray2.readBytes(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, WAVEEXT_SUBFORMAT) && !Arrays.equals(bArr3, AMBISONIC_SUBFORMAT)) {
                        throw ParserException.createForUnsupportedContainerFeature("invalid wav format extension guid");
                    }
                    i3 = littleEndianUnsignedIntToInt3;
                    bArr2 = bArr;
                    i2 = littleEndianUnsignedShort6;
                    extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
                    return new WavFormat(i2, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2, i3);
                }
                bArr2 = bArr;
                i2 = 65534;
            }
            i3 = 0;
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            return new WavFormat(i2, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2, i3);
        }
        bArr = Util.EMPTY_BYTE_ARRAY;
        i2 = littleEndianUnsignedShort;
        bArr2 = bArr;
        i3 = 0;
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new WavFormat(i2, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2, i3);
    }

    public static long readRf64SampleDataSize(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        if (chunkHeaderPeek.id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long littleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) chunkHeaderPeek.size) + 8);
        return littleEndianLong;
    }

    private static ChunkHeader skipToChunk(int i2, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws ParserException {
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (true) {
            int i3 = chunkHeaderPeek.id;
            if (i3 == i2) {
                return chunkHeaderPeek;
            }
            Log.w(TAG, "Ignoring unknown WAV chunk: " + i3);
            long j2 = chunkHeaderPeek.size;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = j2 + 9;
            }
            if (j3 > SieveCacheKt.NodeLinkMask) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.id);
            }
            extractorInput.skipFully((int) j3);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
    }

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) throws ParserException {
        extractorInput.resetPeekPosition();
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(chunkHeaderSkipToChunk.size));
    }
}
