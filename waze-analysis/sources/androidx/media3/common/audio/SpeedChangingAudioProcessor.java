package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpeedChangingAudioProcessor implements AudioProcessor {
    private final boolean areInputTimestampsAdjusted;
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;
    private long framesRead;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    private final Object lock;
    private final LongArrayQueue pendingCallbackInputTimesUs;
    private final Queue<TimestampConsumer> pendingCallbacks;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final boolean shouldMaintainPitch;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;
    private final SpeedProvider speedProvider;
    private final SpeedProviderUtil.SpeedProviderMapper speedProviderMapper;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider, boolean z, boolean z2) {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.speedProvider = speedProvider;
        this.speedProviderMapper = new SpeedProviderUtil.SpeedProviderMapper(speedProvider);
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj, true);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        this.currentSpeed = 1.0f;
        this.areInputTimestampsAdjusted = z;
        this.shouldMaintainPitch = z2;
    }

    private static long getDurationUsAfterProcessorApplied(SpeedProvider speedProvider, int i2, long j2) {
        return Util.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(speedProvider, i2, Util.scaleLargeValue(j2, i2, 1000000L, RoundingMode.HALF_EVEN)), i2);
    }

    static long getInputFrameCountForOutput(SpeedProvider speedProvider, int i2, long j2) {
        int i3 = i2;
        an.l(i3 > 0);
        an.l(j2 >= 0);
        long j3 = j2;
        long expectedInputFrameCountForOutputFrameCount = 0;
        while (j3 > 0) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, expectedInputFrameCountForOutputFrameCount, i2);
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, expectedInputFrameCountForOutputFrameCount, i2);
            long expectedFrameCountAfterProcessorApplied = Sonic.getExpectedFrameCountAfterProcessorApplied(i3, i2, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - expectedInputFrameCountForOutputFrameCount);
            if (nextSpeedChangeSamplePosition == -1 || expectedFrameCountAfterProcessorApplied > j3) {
                expectedInputFrameCountForOutputFrameCount += Sonic.getExpectedInputFrameCountForOutputFrameCount(i2, i2, sampleAlignedSpeed, sampleAlignedSpeed, j3);
                j3 = 0;
            } else {
                j3 -= expectedFrameCountAfterProcessorApplied;
                expectedInputFrameCountForOutputFrameCount = nextSpeedChangeSamplePosition;
            }
            i3 = i2;
        }
        return expectedInputFrameCountForOutputFrameCount;
    }

    public static long getSampleCountAfterProcessorApplied(SpeedProvider speedProvider, int i2, long j2) {
        an.l(speedProvider != null);
        an.l(i2 > 0);
        long j3 = 0;
        an.l(j2 >= 0);
        long expectedFrameCountAfterProcessorApplied = 0;
        while (j3 < j2) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j3, i2);
            if (nextSpeedChangeSamplePosition == -1 || nextSpeedChangeSamplePosition > j2) {
                nextSpeedChangeSamplePosition = j2;
            }
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j3, i2);
            expectedFrameCountAfterProcessorApplied += Sonic.getExpectedFrameCountAfterProcessorApplied(i2, i2, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j3);
            j3 = nextSpeedChangeSamplePosition;
        }
        return expectedFrameCountAfterProcessorApplied;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            if (this.inputAudioFormat.sampleRate != -1) {
                while (!this.pendingCallbacks.isEmpty()) {
                    this.pendingCallbacks.remove().onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, this.inputAudioFormat.sampleRate, this.pendingCallbackInputTimesUs.remove()));
                }
            }
        }
    }

    private void resetInternalState(boolean z) {
        if (z) {
            this.currentSpeed = 1.0f;
        }
        this.framesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateSpeed(float f2) {
        if (f2 != this.currentSpeed) {
            this.currentSpeed = f2;
            this.sonicAudioProcessor.setSpeed(f2);
            if (!this.shouldMaintainPitch) {
                this.sonicAudioProcessor.setPitch(f2);
            }
            this.sonicAudioProcessor.flush(AudioProcessor.StreamMetadata.DEFAULT);
            this.endOfStreamQueuedToSonic = false;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormatConfigure = this.sonicAudioProcessor.configure(audioFormat);
        this.pendingOutputAudioFormat = audioFormatConfigure;
        return audioFormatConfigure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush(AudioProcessor.StreamMetadata streamMetadata) {
        this.inputEnded = false;
        resetInternalState(false);
        synchronized (this.lock) {
            this.inputAudioFormat = this.pendingInputAudioFormat;
            this.sonicAudioProcessor.flush(streamMetadata);
            processPendingCallbacks();
            long originalTimeUs = streamMetadata.positionOffsetUs;
            if (this.areInputTimestampsAdjusted) {
                originalTimeUs = this.speedProviderMapper.getOriginalTimeUs(originalTimeUs);
            }
            this.framesRead = Util.durationUsToSampleCount(originalTimeUs, this.inputAudioFormat.sampleRate);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j2) {
        return this.areInputTimestampsAdjusted ? j2 : SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j2);
    }

    public long getMediaDurationUs(long j2) {
        int i2;
        synchronized (this.lock) {
            i2 = this.inputAudioFormat.sampleRate;
        }
        if (i2 == -1) {
            return j2;
        }
        return Util.sampleCountToDurationUs(getInputFrameCountForOutput(this.speedProvider, i2, Util.scaleLargeValue(j2, i2, 1000000L, RoundingMode.HALF_EVEN)), i2);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        return this.sonicAudioProcessor.getOutput();
    }

    public void getSpeedAdjustedTimeAsync(long j2, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            int i2 = this.inputAudioFormat.sampleRate;
            if (i2 != -1) {
                timestampConsumer.onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, i2, j2));
            } else {
                this.pendingCallbackInputTimesUs.add(j2);
                this.pendingCallbacks.add(timestampConsumer);
            }
        }
    }

    public SpeedProvider getSpeedProvider() {
        return this.speedProvider;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return !this.pendingOutputAudioFormat.equals(AudioProcessor.AudioFormat.NOT_SET);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueEndOfStream() {
        this.inputEnded = true;
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        AudioProcessor.AudioFormat audioFormat;
        int i2;
        synchronized (this.lock) {
            audioFormat = this.inputAudioFormat;
        }
        float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        updateSpeed(sampleAlignedSpeed);
        int iLimit = byteBuffer.limit();
        if (nextSpeedChangeSamplePosition != -1) {
            i2 = (int) ((nextSpeedChangeSamplePosition - this.framesRead) * audioFormat.bytesPerFrame);
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + i2));
        } else {
            i2 = -1;
        }
        long jPosition = byteBuffer.position();
        this.sonicAudioProcessor.queueInput(byteBuffer);
        if (i2 != -1 && byteBuffer.position() - jPosition == i2) {
            this.sonicAudioProcessor.queueEndOfStream();
            this.endOfStreamQueuedToSonic = true;
        }
        long jPosition2 = byteBuffer.position() - jPosition;
        an.v(jPosition2 % ((long) audioFormat.bytesPerFrame) == 0, "A frame was not queued completely.");
        this.framesRead += jPosition2 / audioFormat.bytesPerFrame;
        byteBuffer.limit(iLimit);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        flush(AudioProcessor.StreamMetadata.DEFAULT);
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        synchronized (this.lock) {
            this.inputAudioFormat = AudioProcessor.AudioFormat.NOT_SET;
            this.pendingCallbackInputTimesUs.clear();
            this.pendingCallbacks.clear();
        }
        resetInternalState(true);
        this.sonicAudioProcessor.reset();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public /* synthetic */ void flush() {
        AudioProcessor.CC.$default$flush(this);
    }

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this(speedProvider, false, false);
    }
}
