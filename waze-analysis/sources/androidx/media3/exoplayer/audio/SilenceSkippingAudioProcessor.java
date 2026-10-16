package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    private static final int AVOID_TRUNCATION_FACTOR = 1000;
    public static final long DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US = 2000000;
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 100000;
    public static final int DEFAULT_MIN_VOLUME_TO_KEEP_PERCENTAGE = 10;

    @Deprecated
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final float DEFAULT_SILENCE_RETENTION_RATIO = 0.2f;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int DO_NOT_CHANGE_VOLUME = 3;
    private static final int FADE_IN = 2;
    private static final int FADE_OUT = 0;
    private static final int MUTE = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SHORTENING_SILENCE = 1;
    private int bytesPerFrame;
    private byte[] contiguousOutputBuffer;
    private boolean enabled;
    private final long maxSilenceToKeepDurationUs;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferContentsSize;
    private int maybeSilenceBufferStartIndex;
    private final int minVolumeToKeepPercentageWhenMuting;
    private final long minimumSilenceDurationUs;
    private int outputSilenceFramesSinceNoise;
    private final float silenceRetentionRatio;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface VolumeChangeType {
    }

    public SilenceSkippingAudioProcessor(long j2, float f2, long j3, int i2, short s) {
        boolean z = false;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            z = true;
        }
        an.l(z);
        this.minimumSilenceDurationUs = j2;
        this.silenceRetentionRatio = f2;
        this.maxSilenceToKeepDurationUs = j3;
        this.minVolumeToKeepPercentageWhenMuting = i2;
        this.silenceThresholdLevel = s;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    private int alignToBytePerFrameBoundary(float f2) {
        return alignToBytePerFrameBoundary((int) f2);
    }

    private int calculateFadeInPercentage(int i2, int i3) {
        int i4 = this.minVolumeToKeepPercentageWhenMuting;
        return i4 + ((((100 - i4) * (i2 * 1000)) / i3) / 1000);
    }

    private int calculateFadeOutPercentage(int i2, int i3) {
        return (((this.minVolumeToKeepPercentageWhenMuting - 100) * ((i2 * 1000) / i3)) / 1000) + 100;
    }

    private int calculateShortenedSilenceLength(int i2) {
        int iDurationUsToFrames = ((durationUsToFrames(this.maxSilenceToKeepDurationUs) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length >> 1);
        an.u(iDurationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(Math.min((i2 * this.silenceRetentionRatio) + 0.5f, iDurationUsToFrames));
    }

    private int durationUsToFrames(long j2) {
        return (int) ((j2 * this.inputAudioFormat.sampleRate) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (isNoise(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i2 = this.bytesPerFrame;
                return ((iLimit / i2) * i2) + i2;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (isNoise(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i2 = this.bytesPerFrame;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    private boolean isNoise(byte b2, byte b3) {
        return Math.abs(twoByteSampleToInt(b2, b3)) > this.silenceThresholdLevel;
    }

    private void modifyVolume(byte[] bArr, int i2, int i3) {
        if (i3 != 3) {
            for (int i4 = 0; i4 < i2; i4 += 2) {
                sampleIntToTwoBigEndianBytes(bArr, i4, (twoByteSampleToInt(bArr[i4 + 1], bArr[i4]) * (i3 == 0 ? calculateFadeOutPercentage(i4, i2 - 1) : i3 == 2 ? calculateFadeInPercentage(i4, i2 - 1) : this.minVolumeToKeepPercentageWhenMuting)) / 100);
            }
        }
    }

    private void output(ByteBuffer byteBuffer) {
        replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void outputRange(byte[] bArr, int i2, int i3) {
        an.o(i2 % this.bytesPerFrame == 0, "byteOutput size is not aligned to frame size %s", i2);
        modifyVolume(bArr, i2, i3);
        replaceOutputBuffer(i2).put(bArr, 0, i2).flip();
    }

    private void outputShortenedSilenceBuffer(boolean z) {
        int i2;
        int length;
        int i3 = this.maybeSilenceBufferContentsSize;
        int length2 = this.maybeSilenceBuffer.length;
        if (i3 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.outputSilenceFramesSinceNoise == 0) {
            if (z) {
                outputSilence(i3, 3);
                length = i3;
            } else {
                an.u(i3 >= (length2 >> 1));
                length = this.maybeSilenceBuffer.length >> 1;
                outputSilence(length, 0);
            }
            i2 = length;
        } else {
            int i4 = length2 >> 1;
            int i5 = i3 - i4;
            if (z) {
                int iCalculateShortenedSilenceLength = calculateShortenedSilenceLength(i5) + (this.maybeSilenceBuffer.length >> 1);
                outputSilence(iCalculateShortenedSilenceLength, 2);
                int i6 = i4 + i5;
                i2 = iCalculateShortenedSilenceLength;
                length = i6;
            } else {
                int iCalculateShortenedSilenceLength2 = calculateShortenedSilenceLength(i5);
                outputSilence(iCalculateShortenedSilenceLength2, 1);
                i2 = iCalculateShortenedSilenceLength2;
                length = i5;
            }
        }
        an.w(length % this.bytesPerFrame == 0, "bytesConsumed is not aligned to frame size: %s", length);
        an.u(i3 >= i2);
        this.maybeSilenceBufferContentsSize -= length;
        int i7 = this.maybeSilenceBufferStartIndex + length;
        this.maybeSilenceBufferStartIndex = i7;
        this.maybeSilenceBufferStartIndex = i7 % this.maybeSilenceBuffer.length;
        this.outputSilenceFramesSinceNoise = this.outputSilenceFramesSinceNoise + (i2 / this.bytesPerFrame);
        this.skippedFrames += (length - i2) / r2;
    }

    private void outputSilence(int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        an.l(this.maybeSilenceBufferContentsSize >= i2);
        int i4 = this.maybeSilenceBufferStartIndex;
        if (i3 == 2) {
            int i5 = this.maybeSilenceBufferContentsSize;
            int i6 = i4 + i5;
            byte[] bArr = this.maybeSilenceBuffer;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i2, this.contiguousOutputBuffer, 0, i2);
            } else {
                int i7 = i5 - (length - i4);
                byte[] bArr2 = this.contiguousOutputBuffer;
                if (i7 >= i2) {
                    System.arraycopy(bArr, i7 - i2, bArr2, 0, i2);
                } else {
                    int i8 = i2 - i7;
                    System.arraycopy(bArr, length - i8, bArr2, 0, i8);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i8, i7);
                }
            }
        } else {
            int i9 = i4 + i2;
            byte[] bArr3 = this.maybeSilenceBuffer;
            int length2 = bArr3.length;
            byte[] bArr4 = this.contiguousOutputBuffer;
            if (i9 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i2);
            } else {
                int i10 = length2 - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, i10);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i10, i2 - i10);
            }
        }
        an.o(i2 % this.bytesPerFrame == 0, "sizeToOutput is not aligned to frame size: %s", i2);
        an.u(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        outputRange(this.contiguousOutputBuffer, i2, i3);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(Math.min(iFindNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i2, int i3) {
        int i4 = i2 + 1;
        if (i3 >= 32767) {
            bArr[i2] = -1;
            bArr[i4] = 127;
        } else if (i3 <= -32768) {
            bArr[i2] = 0;
            bArr[i4] = -128;
        } else {
            bArr[i2] = (byte) (i3 & 255);
            bArr[i4] = (byte) (i3 >> 8);
        }
    }

    private void shortenSilenceSilenceUntilNoise(ByteBuffer byteBuffer) {
        int i2;
        an.u(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        int i3 = this.maybeSilenceBufferStartIndex;
        int i4 = this.maybeSilenceBufferContentsSize;
        int i5 = i3 + i4;
        int length = this.maybeSilenceBuffer.length;
        if (i5 < length) {
            i2 = length - i5;
        } else {
            i5 = i4 - (length - i3);
            i2 = i3 - i5;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, i5, iMin);
        int i6 = this.maybeSilenceBufferContentsSize + iMin;
        this.maybeSilenceBufferContentsSize = i6;
        an.u(i6 <= this.maybeSilenceBuffer.length);
        boolean z = iFindNoisePosition < iLimit && iPosition < i2;
        outputShortenedSilenceBuffer(z);
        if (z) {
            this.state = 0;
            this.outputSilenceFramesSinceNoise = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int twoByteSampleToInt(byte b2, byte b3) {
        return (b2 << 8) | (b3 & 255);
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.enabled;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return audioFormat.sampleRate == -1 ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        if (isActive()) {
            int i2 = this.inputAudioFormat.channelCount;
            this.bytesPerFrame = i2 + i2;
            int iAlignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.minimumSilenceDurationUs) / 2);
            int i3 = iAlignToBytePerFrameBoundary + iAlignToBytePerFrameBoundary;
            if (this.maybeSilenceBuffer.length != i3) {
                this.maybeSilenceBuffer = new byte[i3];
                this.contiguousOutputBuffer = new byte[i3];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.enabled = false;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i2 = this.state;
            if (i2 == 0) {
                processNoisy(byteBuffer);
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException();
                }
                shortenSilenceSilenceUntilNoise(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    private int alignToBytePerFrameBoundary(int i2) {
        int i3 = this.bytesPerFrame;
        return (i2 / i3) * i3;
    }

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    @Deprecated
    public SilenceSkippingAudioProcessor(long j2, long j3, short s) {
        this(j2, j3 / j2, j2, 0, s);
    }
}
