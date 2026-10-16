package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioProcessingPipeline {
    private final bn<AudioProcessor> audioProcessors;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final List<AudioProcessor> activeAudioProcessors = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];

    public AudioProcessingPipeline(bn<AudioProcessor> bnVar) {
        this.audioProcessors = bnVar;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }

    private void processData(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i2 = 0;
            z = false;
            while (i2 <= getFinalOutputBufferIndex()) {
                if (!this.outputBuffers[i2].hasRemaining()) {
                    AudioProcessor audioProcessor = this.activeAudioProcessors.get(i2);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.outputBuffers[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.EMPTY_BUFFER;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i2] = audioProcessor.getOutput();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (jRemaining2 <= 0 && !this.outputBuffers[i2].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.outputBuffers[i2].hasRemaining() && i2 < getFinalOutputBufferIndex()) {
                        this.activeAudioProcessors.get(i2 + 1).queueEndOfStream();
                    }
                }
                i2++;
            }
        } while (z);
    }

    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i2);
            AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                an.u(!audioFormatConfigure.equals(AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = audioFormatConfigure;
            }
        }
        this.pendingOutputAudioFormat = audioFormat;
        return audioFormat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            if (this.audioProcessors.get(i2) != audioProcessingPipeline.audioProcessors.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public void flush(AudioProcessor.StreamMetadata streamMetadata) {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i2);
            audioProcessor.flush(streamMetadata);
            if (audioProcessor.isActive()) {
                AudioProcessor.StreamMetadata.Builder builderBuildUpon = streamMetadata.buildUpon();
                builderBuildUpon.setPositionOffsetUs(audioProcessor.getDurationAfterProcessorApplied(streamMetadata.positionOffsetUs));
                streamMetadata = builderBuildUpon.build();
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new ByteBuffer[this.activeAudioProcessors.size()];
        for (int i3 = 0; i3 <= getFinalOutputBufferIndex(); i3++) {
            this.outputBuffers[i3] = this.activeAudioProcessors.get(i3).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return AudioProcessor.EMPTY_BUFFER;
        }
        ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        processData(AudioProcessor.EMPTY_BUFFER);
        return this.outputBuffers[getFinalOutputBufferIndex()];
    }

    public AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public int hashCode() {
        return this.audioProcessors.hashCode();
    }

    public boolean isEnded() {
        return this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        this.inputEnded = true;
        this.activeAudioProcessors.get(0).queueEndOfStream();
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        processData(byteBuffer);
    }

    public void reset() {
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i2);
            audioProcessor.flush(AudioProcessor.StreamMetadata.DEFAULT);
            audioProcessor.reset();
        }
        this.activeAudioProcessors.clear();
        this.outputBuffers = new ByteBuffer[0];
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    @Deprecated
    public void flush() {
        flush(AudioProcessor.StreamMetadata.DEFAULT);
    }
}
