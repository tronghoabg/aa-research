package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class H263Reader implements ElementaryStreamReader {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private static final int START_CODE_VALUE_GROUP_OF_VOP = 179;
    private static final int START_CODE_VALUE_MAX_VIDEO_OBJECT = 31;
    private static final int START_CODE_VALUE_UNSET = -1;
    private static final int START_CODE_VALUE_USER_DATA = 178;
    private static final int START_CODE_VALUE_VISUAL_OBJECT = 181;
    private static final int START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE = 176;
    private static final int START_CODE_VALUE_VOP = 182;
    private static final String TAG = "H263Reader";
    private static final int VIDEO_OBJECT_LAYER_SHAPE_RECTANGULAR = 0;
    private final String containerMimeType;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private SampleReader sampleReader;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    /* compiled from: WazeSource */
    final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        private static final int STATE_EXPECT_VIDEO_OBJECT_LAYER_START = 3;
        private static final int STATE_EXPECT_VIDEO_OBJECT_START = 2;
        private static final int STATE_EXPECT_VISUAL_OBJECT_START = 1;
        private static final int STATE_SKIP_TO_VISUAL_OBJECT_SEQUENCE_START = 0;
        private static final int STATE_WAIT_FOR_VOP_START = 4;
        public byte[] data;
        private boolean isFilling;
        public int length;
        private int state;
        public int volStartPosition;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @interface State {
        }

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
            int i4 = this.state;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i2 == 179 || i2 == 181) {
                                this.length -= i3;
                                this.isFilling = false;
                                return true;
                            }
                        } else if ((i2 & 240) != 32) {
                            Log.w(H263Reader.TAG, "Unexpected start code value");
                            reset();
                        } else {
                            this.volStartPosition = this.length;
                            this.state = 4;
                        }
                    } else if (i2 > 31) {
                        Log.w(H263Reader.TAG, "Unexpected start code value");
                        reset();
                    } else {
                        this.state = 3;
                    }
                } else if (i2 != 181) {
                    Log.w(H263Reader.TAG, "Unexpected start code value");
                    reset();
                } else {
                    this.state = 2;
                }
            } else if (i2 == 176) {
                this.state = 1;
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.state = 0;
        }
    }

    /* compiled from: WazeSource */
    final class SampleReader {
        private static final int OFFSET_VOP_CODING_TYPE = 1;
        private static final int VOP_CODING_TYPE_INTRA = 0;
        private boolean lookingForVopCodingType;
        private final TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private int startCodeValue;
        private int vopBytesRead;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public void onData(byte[] bArr, int i2, int i3) {
            if (this.lookingForVopCodingType) {
                int i4 = this.vopBytesRead;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.vopBytesRead = i4 + (i3 - i2);
                } else {
                    this.sampleIsKeyframe = ((bArr[i5] & 192) >> 6) == 0;
                    this.lookingForVopCodingType = false;
                }
            }
        }

        public void onDataEnd(long j2, int i2, boolean z) {
            an.u(this.sampleTimeUs != C.TIME_UNSET);
            if (this.startCodeValue == 182 && z && this.readingSample) {
                this.output.sampleMetadata(this.sampleTimeUs, this.sampleIsKeyframe ? 1 : 0, (int) (j2 - this.samplePosition), i2, null);
            }
            if (this.startCodeValue != 179) {
                this.samplePosition = j2;
            }
        }

        public void onStartCode(int i2, long j2) {
            boolean z;
            this.startCodeValue = i2;
            this.sampleIsKeyframe = false;
            if (i2 == 182) {
                z = true;
            } else if (i2 == 179) {
                i2 = 179;
                z = true;
            } else {
                z = false;
            }
            this.readingSample = z;
            this.lookingForVopCodingType = i2 == 182;
            this.vopBytesRead = 0;
            this.sampleTimeUs = j2;
        }

        public void reset() {
            this.readingSample = false;
            this.lookingForVopCodingType = false;
            this.sampleIsKeyframe = false;
            this.startCodeValue = -1;
        }
    }

    H263Reader(UserDataReader userDataReader, String str) {
        ParsableByteArray parsableByteArray;
        this.userDataReader = userDataReader;
        this.containerMimeType = str;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        this.pesTimeUs = C.TIME_UNSET;
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(178, 128);
            parsableByteArray = new ParsableByteArray();
        } else {
            parsableByteArray = null;
            this.userData = null;
        }
        this.userDataParsable = parsableByteArray;
    }

    private static Format parseCsdBuffer(CsdBuffer csdBuffer, int i2, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        parsableBitArray.skipBytes(i2);
        parsableBitArray.skipBytes(4);
        parsableBitArray.skipBit();
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        int bits = parsableBitArray.readBits(4);
        float f2 = 1.0f;
        if (bits == 15) {
            int bits2 = parsableBitArray.readBits(8);
            int bits3 = parsableBitArray.readBits(8);
            if (bits3 == 0) {
                Log.w(TAG, "Invalid aspect ratio");
            } else {
                f2 = bits2 / bits3;
            }
        } else {
            float[] fArr = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO;
            if (bits < fArr.length) {
                f2 = fArr[bits];
            } else {
                Log.w(TAG, "Invalid aspect ratio");
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(3);
                parsableBitArray.skipBits(11);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
            }
        }
        if (parsableBitArray.readBits(2) != 0) {
            Log.w(TAG, "Unhandled video object layer shape");
        }
        parsableBitArray.skipBit();
        int bits4 = parsableBitArray.readBits(16);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            if (bits4 == 0) {
                Log.w(TAG, "Invalid vop_increment_time_resolution");
            } else {
                int i3 = bits4 - 1;
                int i4 = 0;
                while (i3 > 0) {
                    i3 >>= 1;
                    i4++;
                }
                parsableBitArray.skipBits(i4);
            }
        }
        parsableBitArray.skipBit();
        int bits5 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        int bits6 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        parsableBitArray.skipBit();
        Format.Builder builder = new Format.Builder();
        builder.setId(str);
        builder.setContainerMimeType(str2);
        builder.setSampleMimeType(MimeTypes.VIDEO_MP4V);
        builder.setWidth(bits5);
        builder.setHeight(bits6);
        builder.setPixelWidthHeightRatio(f2);
        builder.setInitializationData(Collections.singletonList(bArrCopyOf));
        return builder.build();
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        an.B(this.sampleReader);
        an.B(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i2 = iFindNalUnit + 3;
            int i3 = parsableByteArray.getData()[i2] & 255;
            int i4 = iFindNalUnit - position;
            int i5 = 0;
            if (!this.hasOutputFormat) {
                if (i4 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i3, i4 < 0 ? -i4 : 0)) {
                    TrackOutput trackOutput = this.output;
                    CsdBuffer csdBuffer = this.csdBuffer;
                    int i6 = csdBuffer.volStartPosition;
                    String str = this.formatId;
                    an.B(str);
                    trackOutput.format(parseCsdBuffer(csdBuffer, i6, str, this.containerMimeType));
                    this.hasOutputFormat = true;
                }
            }
            this.sampleReader.onData(data, position, iFindNalUnit);
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i4 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                } else {
                    i5 = -i4;
                }
                if (this.userData.endNalUnit(i5)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    int iUnescapeStream = NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength);
                    ParsableByteArray parsableByteArray2 = this.userDataParsable;
                    int i7 = Util.SDK_INT;
                    parsableByteArray2.reset(this.userData.nalData, iUnescapeStream);
                    this.userDataReader.consume(this.pesTimeUs, this.userDataParsable);
                }
                if (i3 == 178) {
                    if (parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                        this.userData.startNalUnit(178);
                    }
                    i3 = 178;
                }
            }
            int i8 = iLimit - iFindNalUnit;
            this.sampleReader.onDataEnd(this.totalBytesWritten - i8, i8, this.hasOutputFormat);
            this.sampleReader.onStartCode(i3, this.pesTimeUs);
            position = i2;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        this.sampleReader.onData(data, position, iLimit);
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.sampleReader = new SampleReader(this.output);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        an.B(this.sampleReader);
        this.sampleReader.onDataEnd(this.totalBytesWritten, 0, this.hasOutputFormat);
        this.sampleReader.reset();
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
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.pesTimeUs = C.TIME_UNSET;
    }

    public H263Reader(String str) {
        this(null, str);
    }
}
