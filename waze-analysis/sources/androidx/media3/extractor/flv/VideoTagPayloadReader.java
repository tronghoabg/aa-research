package androidx.media3.extractor.flv;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.flv.TagPayloadReader;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class VideoTagPayloadReader extends TagPayloadReader {
    private static final int AVC_PACKET_TYPE_AVC_NALU = 1;
    private static final int AVC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int VIDEO_CODEC_AVC = 7;
    private static final int VIDEO_FRAME_KEYFRAME = 1;
    private static final int VIDEO_FRAME_VIDEO_INFO = 5;
    private int frameType;
    private boolean hasOutputFormat;
    private boolean hasOutputKeyframe;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int nalUnitLengthFieldLength;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean parseHeader(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = unsignedByte >> 4;
        int i3 = unsignedByte & 15;
        if (i3 == 7) {
            this.frameType = i2;
            return i2 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i3);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean parsePayload(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        int i2;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        long int24 = parsableByteArray.readInt24();
        if (unsignedByte == 0) {
            if (!this.hasOutputFormat) {
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.bytesLeft()]);
                parsableByteArray.readBytes(parsableByteArray2.getData(), 0, parsableByteArray.bytesLeft());
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray2);
                this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                Format.Builder builder = new Format.Builder();
                builder.setContainerMimeType(MimeTypes.VIDEO_FLV);
                builder.setSampleMimeType("video/avc");
                builder.setCodecs(avcConfig.codecs);
                builder.setWidth(avcConfig.width);
                builder.setHeight(avcConfig.height);
                builder.setPixelWidthHeightRatio(avcConfig.pixelWidthHeightRatio);
                builder.setInitializationData(avcConfig.initializationData);
                this.output.format(builder.build());
                this.hasOutputFormat = true;
                return false;
            }
        } else if (unsignedByte == 1 && this.hasOutputFormat) {
            int i3 = this.frameType == 1 ? 1 : 0;
            if (this.hasOutputKeyframe) {
                i2 = i3;
            } else if (i3 != 0) {
                i2 = 1;
            }
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i4 = 4 - this.nalUnitLengthFieldLength;
            int i5 = 0;
            while (parsableByteArray.bytesLeft() > 0) {
                parsableByteArray.readBytes(this.nalLength.getData(), i4, this.nalUnitLengthFieldLength);
                this.nalLength.setPosition(0);
                ParsableByteArray parsableByteArray3 = this.nalLength;
                ParsableByteArray parsableByteArray4 = this.nalStartCode;
                int unsignedIntToInt = parsableByteArray3.readUnsignedIntToInt();
                parsableByteArray4.setPosition(0);
                this.output.sampleData(this.nalStartCode, 4);
                this.output.sampleData(parsableByteArray, unsignedIntToInt);
                i5 = i5 + 4 + unsignedIntToInt;
            }
            this.output.sampleMetadata(j2 + (int24 * 1000), i2, i5, 0, null);
            this.hasOutputKeyframe = true;
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public void seek() {
        this.hasOutputKeyframe = false;
    }
}
