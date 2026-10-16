package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import androidx.work.WorkInfo;
import com.google.d.l.j;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ToFloatPcmAudioProcessor extends BaseAudioProcessor {
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i2, ByteBuffer byteBuffer) {
        float f2 = (float) (i2 * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR);
        byteBuffer.putInt(Float.isNaN(f2) ? 0 : Float.floatToIntBits(f2));
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.encoding;
        if (Util.isEncodingLinearPcm(i2)) {
            return i2 != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferReplaceOutputBuffer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.inputAudioFormat.encoding;
        if (i3 == 2) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2 + i2);
            while (iPosition < iLimit) {
                writePcm32BitFloat(byteBuffer.getShort(iPosition) << 16, byteBufferReplaceOutputBuffer);
                iPosition += 2;
            }
        } else if (i3 == 3) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2 * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) << 24, byteBufferReplaceOutputBuffer);
                iPosition++;
            }
        } else if (i3 == 21) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i2 / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(j.j(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2);
            while (iPosition < iLimit) {
                writePcm32BitFloat(byteBuffer.getInt(iPosition), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2 + i2);
            while (iPosition < iLimit) {
                writePcm32BitFloat(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferReplaceOutputBuffer);
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i2 / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(j.j(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2);
            while (iPosition < iLimit) {
                writePcm32BitFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i3 == 1895825408) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2);
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                iPosition += 4;
            }
        } else {
            if (i3 != 1912602624) {
                throw new IllegalStateException();
            }
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
