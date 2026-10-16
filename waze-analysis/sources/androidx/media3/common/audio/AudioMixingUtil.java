package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioMixingUtil {
    private static final float FLOAT_PCM_MAX_VALUE = 1.0f;
    private static final float FLOAT_PCM_MIN_VALUE = -1.0f;

    private AudioMixingUtil() {
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        int i2 = audioFormat.encoding;
        return i2 == 2 || i2 == 4;
    }

    private static float floatSampleToInt16Pcm(float f2) {
        return Util.constrainValue(f2 * (f2 < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    private static float getPcmSample(ByteBuffer byteBuffer, boolean z, boolean z2) {
        return z2 ? z ? byteBuffer.getShort() : floatSampleToInt16Pcm(byteBuffer.getFloat()) : z ? int16SampleToFloatPcm(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    private static float int16SampleToFloatPcm(short s) {
        return s / (s < 0 ? 32768 : 32767);
    }

    public static ByteBuffer mix(ByteBuffer byteBuffer, AudioProcessor.AudioFormat audioFormat, ByteBuffer byteBuffer2, AudioProcessor.AudioFormat audioFormat2, ChannelMixingMatrix channelMixingMatrix, int i2, boolean z, boolean z2) {
        int i3 = audioFormat.encoding;
        int i4 = audioFormat2.encoding;
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i5 = 0; i5 < i2; i5++) {
            boolean z3 = i4 == 2;
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i6 = 0; i6 < outputChannelCount; i6++) {
                    fArr2[i6] = getPcmSample(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i7 = 0; i7 < inputChannelCount; i7++) {
                fArr[i7] = getPcmSample(byteBuffer, i3 == 2, z3);
            }
            for (int i8 = 0; i8 < outputChannelCount; i8++) {
                for (int i9 = 0; i9 < inputChannelCount; i9++) {
                    fArr2[i8] = fArr2[i8] + (fArr[i9] * channelMixingMatrix.getMixingCoefficient(i9, i8));
                }
                if (z3) {
                    byteBuffer2.putShort((short) Util.constrainValue(fArr2[i8], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z2 ? Util.constrainValue(fArr2[i8], -1.0f, 1.0f) : fArr2[i8]);
                }
                fArr2[i8] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat, AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }
}
