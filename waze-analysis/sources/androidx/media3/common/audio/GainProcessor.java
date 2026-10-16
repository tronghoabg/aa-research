package androidx.media3.common.audio;

import androidx.media3.common.C;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GainProcessor extends BaseAudioProcessor {
    private final GainProvider gainProvider;
    private long readFrames;

    /* compiled from: WazeSource */
    public interface GainProvider {
        float getGainFactorAtSamplePosition(long j2, int i2);

        long isUnityUntil(long j2, int i2);
    }

    public GainProcessor(GainProvider gainProvider) {
        an.B(gainProvider);
        this.gainProvider = gainProvider;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return (!super.isActive() || Objects.equals(this.inputAudioFormat, AudioProcessor.AudioFormat.NOT_SET) || this.gainProvider.isUnityUntil(0L, this.inputAudioFormat.sampleRate) == Long.MIN_VALUE) ? false : true;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.encoding;
        if (i2 == 2 || i2 == 4) {
            return audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException("Invalid PCM encoding. Expected 16 bit PCM or float PCM.", audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        this.readFrames = Util.durationUsToSampleCount(streamMetadata.positionOffsetUs, this.inputAudioFormat.sampleRate);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.readFrames = 0L;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        an.v(!Objects.equals(this.inputAudioFormat, AudioProcessor.AudioFormat.NOT_SET), "Audio processor must be configured and flushed before calling queueInput().");
        if (byteBuffer.hasRemaining()) {
            an.m(byteBuffer.remaining() % this.inputAudioFormat.bytesPerFrame == 0, "Queued an incomplete frame.");
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            while (byteBuffer.hasRemaining()) {
                float gainFactorAtSamplePosition = this.gainProvider.getGainFactorAtSamplePosition(this.readFrames, this.inputAudioFormat.sampleRate);
                if (gainFactorAtSamplePosition != 1.0f) {
                    int i2 = 0;
                    while (true) {
                        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
                        if (i2 >= audioFormat.channelCount) {
                            this.readFrames++;
                            break;
                        }
                        int i3 = audioFormat.encoding;
                        if (i3 == 2) {
                            byteBufferReplaceOutputBuffer.putShort((short) (byteBuffer.getShort() * gainFactorAtSamplePosition));
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Unexpected PCM encoding: " + i3);
                            }
                            byteBufferReplaceOutputBuffer.putFloat(byteBuffer.getFloat() * gainFactorAtSamplePosition);
                        }
                        i2++;
                    }
                } else {
                    int iLimit = byteBuffer.limit();
                    long jIsUnityUntil = this.gainProvider.isUnityUntil(this.readFrames, this.inputAudioFormat.sampleRate);
                    an.v(jIsUnityUntil != C.TIME_UNSET, "Expected a valid end boundary for unity region.");
                    if (jIsUnityUntil != Long.MIN_VALUE) {
                        byteBuffer.limit(Math.min(iLimit, ((int) ((jIsUnityUntil - this.readFrames) * this.inputAudioFormat.bytesPerFrame)) + byteBuffer.position()));
                    }
                    this.readFrames += byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
                    byteBufferReplaceOutputBuffer.put(byteBuffer);
                    byteBuffer.limit(iLimit);
                }
            }
            byteBufferReplaceOutputBuffer.flip();
        }
    }
}
