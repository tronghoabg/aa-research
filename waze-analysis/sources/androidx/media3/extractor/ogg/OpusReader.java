package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.ogg.StreamReader;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class OpusReader extends StreamReader {
    private boolean firstCommentHeaderSeen;
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    OpusReader() {
    }

    private static boolean peekPacketStartsWith(ParsableByteArray parsableByteArray, byte[] bArr) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        int length = bArr.length;
        if (iBytesLeft < length) {
            return false;
        }
        int position = parsableByteArray.getPosition();
        byte[] bArr2 = new byte[length];
        parsableByteArray.readBytes(bArr2, 0, length);
        parsableByteArray.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected long preparePayload(ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(OpusUtil.getPacketDurationUs(parsableByteArray.getData()));
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected boolean readHeaders(ParsableByteArray parsableByteArray, long j2, StreamReader.SetupData setupData) {
        if (peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            int channelCount = OpusUtil.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = OpusUtil.buildInitializationData(bArrCopyOf);
            if (setupData.format == null) {
                Format.Builder builder = new Format.Builder();
                builder.setContainerMimeType(MimeTypes.AUDIO_OGG);
                builder.setSampleMimeType(MimeTypes.AUDIO_OPUS);
                builder.setChannelCount(channelCount);
                builder.setSampleRate(OpusUtil.SAMPLE_RATE);
                builder.setInitializationData(listBuildInitializationData);
                setupData.format = builder.build();
                return true;
            }
        } else {
            byte[] bArr = OPUS_COMMENT_HEADER_SIGNATURE;
            if (!peekPacketStartsWith(parsableByteArray, bArr)) {
                an.B(setupData.format);
                return false;
            }
            an.B(setupData.format);
            if (!this.firstCommentHeaderSeen) {
                this.firstCommentHeaderSeen = true;
                parsableByteArray.skipBytes(bArr.length);
                Metadata vorbisComments = VorbisUtil.parseVorbisComments(bn.o(androidx.media3.container.VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments));
                if (vorbisComments != null) {
                    Format.Builder builderBuildUpon = setupData.format.buildUpon();
                    builderBuildUpon.setMetadata(vorbisComments.copyWithAppendedEntriesFrom(setupData.format.metadata));
                    setupData.format = builderBuildUpon.build();
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.firstCommentHeaderSeen = false;
        }
    }
}
