package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WavUtil;
import com.google.d.b.an;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class WavWriter {
    private static final int FACT_CHUNK_SIZE_FLOAT_PCM = 12;
    private static final int FMT_CHUNK_SIZE_FLOAT_PCM = 18;
    private static final int FMT_CHUNK_SIZE_INT_PCM = 16;
    private long dataSize;
    private Format format;
    private boolean headerAdded;
    private final SeekableMuxerOutput muxerOutput;

    public WavWriter(SeekableMuxerOutput seekableMuxerOutput) {
        this.muxerOutput = seekableMuxerOutput;
    }

    private static void validateFormat(Format format) {
        an.l(Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_RAW));
        an.l(format.sampleRate > 0);
        an.l(format.channelCount > 0);
        an.l(format.pcmEncoding != -1);
        int typeForPcmEncoding = WavUtil.getTypeForPcmEncoding(format.pcmEncoding);
        an.m(typeForPcmEncoding == 1 || typeForPcmEncoding == 3, "Only integer PCM supported");
    }

    private void writeWavHeader() {
        an.B(this.format);
        int typeForPcmEncoding = WavUtil.getTypeForPcmEncoding(this.format.pcmEncoding);
        int i2 = typeForPcmEncoding == 3 ? 12 : 0;
        int i3 = typeForPcmEncoding == 3 ? 18 : 16;
        int i4 = i3 + 20 + i2;
        short s = (short) typeForPcmEncoding;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4 + 8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(Integer.reverseBytes(WavUtil.RIFF_FOURCC));
        long j2 = i4 + this.dataSize + ((int) (r7 % 2));
        an.u(j2 <= MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        byteBufferAllocate.putInt((int) j2);
        byteBufferAllocate.putInt(Integer.reverseBytes(WavUtil.WAVE_FOURCC));
        byteBufferAllocate.putInt(Integer.reverseBytes(WavUtil.FMT_FOURCC));
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort((short) this.format.channelCount);
        byteBufferAllocate.putInt(this.format.sampleRate);
        Format format = this.format;
        int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
        byteBufferAllocate.putInt(this.format.sampleRate * pcmFrameSize);
        byteBufferAllocate.putShort((short) pcmFrameSize);
        byteBufferAllocate.putShort((short) (Util.getByteDepth(this.format.pcmEncoding) * 8));
        if (typeForPcmEncoding == 3) {
            byteBufferAllocate.putShort((short) 0);
            byteBufferAllocate.putInt(Integer.reverseBytes(WavUtil.FACT_FOURCC));
            byteBufferAllocate.putInt(4);
            byteBufferAllocate.putInt((int) (this.dataSize / pcmFrameSize));
        }
        byteBufferAllocate.putInt(Integer.reverseBytes(1684108385));
        byteBufferAllocate.putInt(Util.toUnsignedInt(this.dataSize));
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
        this.headerAdded = true;
    }

    public void close() {
        if (this.headerAdded) {
            if (this.dataSize % 2 == 1) {
                this.muxerOutput.write(ByteBuffer.wrap(new byte[1]));
            }
            this.muxerOutput.setPosition(0L);
            writeWavHeader();
        }
        this.muxerOutput.close();
    }

    public void setFormat(Format format) {
        an.u(this.format == null);
        validateFormat(format);
        this.format = format;
    }

    public void writeSampleData(ByteBuffer byteBuffer) {
        if (!this.headerAdded) {
            writeWavHeader();
        }
        this.dataSize += this.muxerOutput.write(byteBuffer);
    }
}
