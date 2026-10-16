package androidx.media3.muxer;

import android.util.Pair;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.common.Format;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.container.OpusUtil;
import com.google.d.b.an;
import com.google.d.d.bs;
import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AacWriter {
    private static final int ADTS_HEADER_LENGTH = 7;
    private static final bs<Integer, Integer> SAMPLE_RATE_TABLE_INDEX = bs.d(Arrays.asList(AacWriter$$ExternalSyntheticBackport1.m(Integer.valueOf(DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE), 0), AacWriter$$ExternalSyntheticBackport1.m(88200, 1), AacWriter$$ExternalSyntheticBackport1.m(64000, 2), AacWriter$$ExternalSyntheticBackport1.m(Integer.valueOf(OpusUtil.SAMPLE_RATE), 3), AacWriter$$ExternalSyntheticBackport1.m(44100, 4), AacWriter$$ExternalSyntheticBackport1.m(32000, 5), AacWriter$$ExternalSyntheticBackport1.m(24000, 6), AacWriter$$ExternalSyntheticBackport1.m(22050, 7), AacWriter$$ExternalSyntheticBackport1.m(16000, 8), AacWriter$$ExternalSyntheticBackport1.m(12000, 9), AacWriter$$ExternalSyntheticBackport1.m(11025, 10), AacWriter$$ExternalSyntheticBackport1.m(8000, 11), AacWriter$$ExternalSyntheticBackport1.m(7350, 12)));
    private Format format;
    private final FileChannel outputFileChannel;
    private int profileCode;
    private int sampleFreqIndex;

    public AacWriter(FileOutputStream fileOutputStream) {
        this.outputFileChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
    }

    private ByteBuffer createAdtsHeader(int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(7);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -15);
        Format format = this.format;
        an.B(format);
        int i3 = format.channelCount;
        byteBufferAllocate.put((byte) ((this.sampleFreqIndex << 2) | (this.profileCode << 6) | (i3 >> 2)));
        byteBufferAllocate.put((byte) (((i2 & 6144) >> 11) | ((i3 & 3) << 6)));
        byteBufferAllocate.put((byte) ((i2 & 2040) >> 3));
        byteBufferAllocate.put((byte) (((i2 & 7) << 5) | 31));
        byteBufferAllocate.put((byte) -4);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public void setFormat(Format format) {
        int i2 = format.channelCount;
        boolean z = false;
        if (i2 > 0 && i2 <= 7) {
            z = true;
        }
        an.o(z, "Channel count must be between 1 and 7, got %s", i2);
        Pair<Integer, Integer> codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format);
        an.B(codecProfileAndLevel);
        this.profileCode = ((Integer) codecProfileAndLevel.first).intValue();
        Integer num = SAMPLE_RATE_TABLE_INDEX.get(Integer.valueOf(format.sampleRate));
        an.B(num);
        this.sampleFreqIndex = num.intValue();
        this.format = format;
    }

    public void writeSampleData(ByteBuffer byteBuffer, BufferInfo bufferInfo) throws IOException {
        this.outputFileChannel.write(createAdtsHeader(bufferInfo.size + 7));
        this.outputFileChannel.write(byteBuffer);
    }
}
