package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FlacFrameReader {
    private static final String TAG = "FlacFrameReader";

    /* compiled from: WazeSource */
    public final class SampleNumberHolder {
        public long sampleNumber;
    }

    private FlacFrameReader() {
    }

    private static boolean checkAndReadBlockSizeSamples(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i2, long j2) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(parsableByteArray, i2);
        long j3 = flacStreamMetadata.totalSamples;
        return frameBlockSizeSamplesFromKey != -1 && (((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) == 0 || ((j2 + ((long) frameBlockSizeSamplesFromKey)) > j3 ? 1 : ((j2 + ((long) frameBlockSizeSamplesFromKey)) == j3 ? 0 : -1)) >= 0) || frameBlockSizeSamplesFromKey >= flacStreamMetadata.minBlockSizeSamples) && frameBlockSizeSamplesFromKey <= flacStreamMetadata.maxBlockSizeSamples;
    }

    private static boolean checkAndReadCrc(ParsableByteArray parsableByteArray, int i2) {
        return parsableByteArray.readUnsignedByte() == Util.crc8(parsableByteArray.getData(), i2, parsableByteArray.getPosition() + (-1), 0);
    }

    private static boolean checkAndReadFirstSampleNumber(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, boolean z, SampleNumberHolder sampleNumberHolder) {
        try {
            long utf8EncodedLong = parsableByteArray.readUtf8EncodedLong();
            if (!z) {
                utf8EncodedLong *= flacStreamMetadata.maxBlockSizeSamples;
            }
            long j2 = flacStreamMetadata.totalSamples;
            if (j2 != 0 && utf8EncodedLong > j2) {
                return false;
            }
            sampleNumberHolder.sampleNumber = utf8EncodedLong;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean checkAndReadFrameHeader(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i2, SampleNumberHolder sampleNumberHolder) {
        int position = parsableByteArray.getPosition();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long j2 = unsignedInt >>> 16;
        if (j2 != i2) {
            return false;
        }
        return checkChannelAssignment((int) ((unsignedInt >> 4) & 15), flacStreamMetadata) && checkBitsPerSample((int) ((unsignedInt >> 1) & 7), flacStreamMetadata) && (unsignedInt & 1) != 1 && checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, ((j2 & 1) > 1L ? 1 : ((j2 & 1) == 1L ? 0 : -1)) == 0, sampleNumberHolder) && checkAndReadBlockSizeSamples(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 12) & 15), sampleNumberHolder.sampleNumber) && checkAndReadSampleRate(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 8) & 15)) && checkAndReadCrc(parsableByteArray, position) && checkFirstSubframeHeaderFromPeek(parsableByteArray);
    }

    private static boolean checkAndReadSampleRate(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i2) {
        int i3 = flacStreamMetadata.sampleRate;
        if (i2 == 0) {
            return true;
        }
        if (i2 <= 11) {
            return i2 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i2 == 12) {
            return parsableByteArray.readUnsignedByte() * 1000 == i3;
        }
        if (i2 <= 14) {
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (i2 == 14) {
                unsignedShort *= 10;
            }
            if (unsignedShort == i3) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkBitsPerSample(int i2, FlacStreamMetadata flacStreamMetadata) {
        return i2 == 0 || i2 == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    private static boolean checkChannelAssignment(int i2, FlacStreamMetadata flacStreamMetadata) {
        return i2 <= 7 ? i2 == flacStreamMetadata.channels + (-1) : i2 <= 10 && flacStreamMetadata.channels == 2;
    }

    private static boolean checkFirstSubframeHeaderFromPeek(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() == 0) {
            return true;
        }
        int iPeekUnsignedByte = parsableByteArray.peekUnsignedByte();
        if ((iPeekUnsignedByte & 128) != 0) {
            return false;
        }
        int i2 = (iPeekUnsignedByte & 126) >> 1;
        if ((i2 < 2 || i2 > 7) && (i2 < 13 || i2 > 31)) {
            return true;
        }
        Log.i(TAG, "Ignoring frame where first subframe has a reserved type: " + i2);
        return false;
    }

    public static boolean checkFrameHeaderFromPeek(ExtractorInput extractorInput, FlacStreamMetadata flacStreamMetadata, int i2, SampleNumberHolder sampleNumberHolder) {
        long peekPosition = extractorInput.getPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(17);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 2);
        if (parsableByteArray.peekChar() != i2) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
            return false;
        }
        parsableByteArray.setLimit(ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 2, 15) + 2);
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
        return checkAndReadFrameHeader(parsableByteArray, flacStreamMetadata, i2, sampleNumberHolder);
    }

    public static long getFirstSampleNumber(ExtractorInput extractorInput, FlacStreamMetadata flacStreamMetadata) throws ParserException {
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        extractorInput.peekFully(bArr, 0, 1);
        int i2 = bArr[0] & 1;
        boolean z = 1 == i2;
        extractorInput.advancePeekPosition(2);
        int i3 = 1 != i2 ? 6 : 7;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i3);
        parsableByteArray.setLimit(ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 0, i3));
        extractorInput.resetPeekPosition();
        SampleNumberHolder sampleNumberHolder = new SampleNumberHolder();
        if (checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, z, sampleNumberHolder)) {
            return sampleNumberHolder.sampleNumber;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(ParsableByteArray parsableByteArray, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return DisplayStrings.DS_REPORT_MENU_V2_MAP_ISSUE_TURN_NOT_ALLOWED_LABEL << (i2 - 2);
            case 6:
                return parsableByteArray.readUnsignedByte() + 1;
            case 7:
                return parsableByteArray.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }
}
