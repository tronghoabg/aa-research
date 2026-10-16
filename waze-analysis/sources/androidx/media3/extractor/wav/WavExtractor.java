package androidx.media3.extractor.wav;

import android.net.Uri;
import android.util.Pair;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WavUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.muxer.MuxerUtil;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.waze.strings.DisplayStrings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.wav.WavExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.lambda$static$0();
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
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    /* compiled from: WazeSource */
    interface OutputWriter {
        void init(int i2, long j2);

        void reset(long j2);

        boolean sampleData(ExtractorInput extractorInput, long j2);
    }

    /* compiled from: WazeSource */
    final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i2) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i3 = wavFormat.numChannels * wavFormat.bitsPerSample;
            int i4 = wavFormat.blockSize;
            int i5 = i3 / 8;
            if (i4 != i5) {
                throw ParserException.createForMalformedContainer("Expected block size: " + i5 + "; got: " + i4, null);
            }
            int i6 = wavFormat.frameRateHz * i5;
            int i7 = i6 * 8;
            int iMax = Math.max(i5, i6 / 10);
            this.targetSampleSizeBytes = iMax;
            Format.Builder builder = new Format.Builder();
            builder.setContainerMimeType(MimeTypes.AUDIO_WAV);
            builder.setSampleMimeType(str);
            builder.setAverageBitrate(i7);
            builder.setPeakBitrate(i7);
            builder.setMaxInputSize(iMax);
            builder.setChannelCount(wavFormat.numChannels);
            builder.setChannelMask(WavUtil.mapToAudioFormatChannelMask(wavFormat.channelMask));
            builder.setSampleRate(wavFormat.frameRateHz);
            builder.setPcmEncoding(i2);
            this.format = builder.build();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i2, long j2) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, 1, i2, j2);
            this.extractorOutput.seekMap(wavSeekMap);
            this.trackOutput.format(this.format);
            this.trackOutput.durationUs(wavSeekMap.getDurationUs());
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j2) {
            this.startTimeUs = j2;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j2) {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.pendingOutputBytes) < (i3 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i3 - i2, j3), true);
                if (iSampleData == -1) {
                    j3 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j3 -= iSampleData;
                }
            }
            int i4 = this.wavFormat.blockSize;
            int i5 = this.pendingOutputBytes / i4;
            if (i5 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, r1.frameRateHz);
                int i6 = i5 * i4;
                int i7 = this.pendingOutputBytes - i6;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i6, i7, null);
                this.outputFrameCount += i5;
                this.pendingOutputBytes = i7;
            }
            return j3 <= 0;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    private void assertInitialized() {
        an.B(this.trackOutput);
        int i2 = Util.SDK_INT;
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    private void readFileType(ExtractorInput extractorInput) throws ParserException {
        an.u(extractorInput.getPosition() == 0);
        int i2 = this.dataStartPosition;
        if (i2 != -1) {
            extractorInput.skipFully(i2);
            this.state = 4;
        } else {
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    private void readFormat(ExtractorInput extractorInput) throws ParserException {
        WavFormat format = WavHeaderReader.readFormat(extractorInput);
        int i2 = format.formatType;
        if (i2 == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, format);
        } else if (i2 == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_ALAW, -1);
        } else if (i2 == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i2, format.bitsPerSample);
            if (pcmEncodingForType == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.formatType);
            }
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private int readSampleData(ExtractorInput extractorInput) {
        an.u(this.dataEndPosition != -1);
        long position = this.dataEndPosition - extractorInput.getPosition();
        OutputWriter outputWriter = this.outputWriter;
        an.B(outputWriter);
        return outputWriter.sampleData(extractorInput, position) ? -1 : 0;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws ParserException {
        Pair<Long, Long> pairSkipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j2 = this.rf64SampleDataSize;
        if (j2 != -1 && jLongValue == MuxerUtil.UNSIGNED_INT_MAX_VALUE) {
            jLongValue = j2;
        }
        this.dataEndPosition = this.dataStartPosition + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1) {
            long j3 = this.dataEndPosition;
            if (j3 > length) {
                Log.w(TAG, "Data exceeds input length: " + j3 + ", " + length);
                this.dataEndPosition = length;
            }
        }
        OutputWriter outputWriter = this.outputWriter;
        an.B(outputWriter);
        outputWriter.init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
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
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        assertInitialized();
        int i2 = this.state;
        if (i2 == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i2 == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i2 == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i2 == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i2 == 4) {
            return readSampleData(extractorInput);
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.state = j2 == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j3);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return WavHeaderReader.checkFileType(extractorInput);
    }

    /* compiled from: WazeSource */
    final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_8, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_1, DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS, 307, DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_TOLL_MESSAGE, DisplayStrings.DS_EVERYDAY_MOODS, 408, DisplayStrings.DS_WEATHER, DisplayStrings.DS_REPORT_MENU_V2_POLICE_REPORT_LABEL, DisplayStrings.DS_REPORT_MENU_V2_WEATHER_REPORT_TITLE, DisplayStrings.DS_AHEAD, DisplayStrings.DS_CONSTRUCTION, DisplayStrings.DS_MISSING_SIGN, DisplayStrings.DS_SNOW, DisplayStrings.DS_CLOSURE, DisplayStrings.DS_HOME_WORK_WIZ_SET_WORK_SUBTITLE, DisplayStrings.DS_VIEWING_YOUR_DRIVE, DisplayStrings.DS_PLACE_CANNOT_ADD_CATEGORY_BODY, DisplayStrings.DS_LOCATION_PREVIEW_24_HOURS, DisplayStrings.DS_FUTURE_DRIVES_TIME_TO_LEAVE_FOOTER_CELL_TEXT, DisplayStrings.DS_MAP_POPUP_USER_MESSAGE_BUTTON, DisplayStrings.DS_CALENDAR_REMINDER_OPTIONS_EARLY_AND_TTL, DisplayStrings.DS_REPORT_TITLE, 2066, DisplayStrings.DS_NO_REPORTS_TEXT, 2499, 2749, DisplayStrings.DS_AAOS_SEARCH_ND4C_CLOSE_BUTTON, DisplayStrings.DS_QR_LOGIN_ERROR_SUBTITLE, DisplayStrings.DS_REALTIME_ALERTS_MOBILE_PHONE_CAMERA, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int iMax = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i2 = wavFormat.numChannels;
            int i3 = (((wavFormat.blockSize - (i2 * 4)) * 8) / (wavFormat.bitsPerSample * i2)) + 1;
            if (littleEndianUnsignedShort != i3) {
                throw ParserException.createForMalformedContainer("Expected frames per block: " + i3 + "; got: " + littleEndianUnsignedShort, null);
            }
            int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
            this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
            this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i2));
            int i4 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / littleEndianUnsignedShort;
            Format.Builder builder = new Format.Builder();
            builder.setSampleMimeType(MimeTypes.AUDIO_RAW);
            builder.setAverageBitrate(i4);
            builder.setPeakBitrate(i4);
            builder.setMaxInputSize(numOutputFramesToBytes(iMax, i2));
            builder.setChannelCount(wavFormat.numChannels);
            builder.setChannelMask(WavUtil.mapToAudioFormatChannelMask(wavFormat.channelMask));
            builder.setSampleRate(wavFormat.frameRateHz);
            builder.setPcmEncoding(2);
            this.format = builder.build();
        }

        private void decode(byte[] bArr, int i2, ParsableByteArray parsableByteArray) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.wavFormat.numChannels; i4++) {
                    decodeBlockForChannel(bArr, i3, i4, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i2);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i2, int i3, byte[] bArr2) {
            WavFormat wavFormat = this.wavFormat;
            int i4 = wavFormat.blockSize;
            int i5 = i2 * i4;
            int i6 = wavFormat.numChannels;
            int i7 = i6 * 4;
            int i8 = (i4 / i6) - 4;
            int i9 = i5 + (i3 * 4);
            int i10 = bArr[i9 + 1] & 255;
            int i11 = bArr[i9] & 255;
            int iMin = Math.min(bArr[i9 + 2] & 255, 88);
            int i12 = STEP_TABLE[iMin];
            int i13 = i2 * this.framesPerBlock * i6;
            int iConstrainValue = (short) ((i10 << 8) | i11);
            int i14 = i13 + i3;
            int i15 = i14 + i14;
            bArr2[i15] = (byte) (iConstrainValue & 255);
            bArr2[i15 + 1] = (byte) (iConstrainValue >> 8);
            for (int i16 = 0; i16 < i8 + i8; i16++) {
                byte b2 = bArr[i9 + i7 + ((i16 / 8) * i6 * 4) + ((i16 / 2) % 4)];
                int i17 = i16 % 2 == 0 ? b2 & StylePropertiesKt.RightId : (b2 & 255) >> 4;
                int i18 = i17 & 7;
                int i19 = (((i18 + i18) + 1) * i12) >> 3;
                if ((i17 & 8) != 0) {
                    i19 = -i19;
                }
                i15 += i6 + i6;
                iConstrainValue = Util.constrainValue(iConstrainValue + i19, -32768, 32767);
                bArr2[i15] = (byte) (iConstrainValue & 255);
                bArr2[i15 + 1] = (byte) (iConstrainValue >> 8);
                int i20 = iMin + INDEX_TABLE[i17];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(i20, 0, iArr.length - 1);
                i12 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i2) {
            int i3 = this.wavFormat.numChannels;
            return i2 / (i3 + i3);
        }

        private int numOutputFramesToBytes(int i2) {
            return numOutputFramesToBytes(i2, this.wavFormat.numChannels);
        }

        private void writeSampleMetadata(int i2) {
            long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i2);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += i2;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i2, long j2) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, this.framesPerBlock, i2, j2);
            this.extractorOutput.seekMap(wavSeekMap);
            this.trackOutput.format(this.format);
            this.trackOutput.durationUs(wavSeekMap.getDurationUs());
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j2) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j2;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sampleData(androidx.media3.extractor.ExtractorInput r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.pendingOutputBytes
                int r0 = r6.numOutputBytesToFrames(r0)
                int r1 = r6.targetSampleSizeFrames
                int r1 = r1 - r0
                androidx.media3.extractor.wav.WavFormat r0 = r6.wavFormat
                int r2 = r6.framesPerBlock
                int r1 = androidx.media3.common.util.Util.ceilDivide(r1, r2)
                int r0 = r0.blockSize
                int r1 = r1 * r0
                r2 = 0
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                r2 = 1
                if (r0 != 0) goto L1d
            L1b:
                r0 = r2
                goto L1e
            L1d:
                r0 = 0
            L1e:
                if (r0 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r1) goto L3e
                int r3 = r1 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L73
                byte[] r8 = r6.inputData
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                androidx.media3.common.util.ParsableByteArray r7 = r6.decodedData
                androidx.media3.extractor.TrackOutput r8 = r6.trackOutput
                int r9 = r7.limit()
                r8.sampleData(r7, r9)
                int r7 = r6.pendingOutputBytes
                int r7 = r7 + r9
                r6.pendingOutputBytes = r7
                int r7 = r6.numOutputBytesToFrames(r7)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L73
                r6.writeSampleMetadata(r8)
            L73:
                if (r0 == 0) goto L80
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L80
                r6.writeSampleMetadata(r7)
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(androidx.media3.extractor.ExtractorInput, long):boolean");
        }

        private static int numOutputFramesToBytes(int i2, int i3) {
            return (i2 + i2) * i3;
        }
    }
}
