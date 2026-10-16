package androidx.camera.video.internal.audio;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AudioStreamImpl implements AudioStream {
    private static final long DIFF_LIMIT_FROM_SYSTEM_TIME_NS;
    private static final String TAG = "AudioStreamImpl";
    private AudioRecord mAudioRecord;
    private AudioManager$AudioRecordingCallback mAudioRecordingCallback;
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBufferSize;
    private final int mBytesPerFrame;
    private Executor mCallbackExecutor;
    private final AudioSettings mSettings;
    private long mTotalFramesRead;
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicReference<Boolean> mNotifiedSilenceState = new AtomicReference<>(null);
    private boolean mShouldFallbackToSystemTime = false;

    /* compiled from: WazeSource */
    class AudioRecordingApi29Callback extends AudioManager$AudioRecordingCallback {
        AudioRecordingApi29Callback() {
        }

        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            Iterator<AudioRecordingConfiguration> it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfigurationM10m = a$$ExternalSyntheticApiModelOutline0.m10m((Object) it.next());
                if (Api24Impl.getClientAudioSessionId(audioRecordingConfigurationM10m) == AudioStreamImpl.this.mAudioRecord.getAudioSessionId()) {
                    AudioStreamImpl.this.notifySilenced(Api29Impl.isClientSilenced(audioRecordingConfigurationM10m));
                    return;
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        DIFF_LIMIT_FROM_SYSTEM_TIME_NS = 500000000L;
    }

    public AudioStreamImpl(AudioSettings audioSettings, Context context) throws AudioStream.AudioStreamException, IllegalArgumentException {
        if (!isSettingsSupported(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(audioSettings.getCaptureSampleRate()), Integer.valueOf(audioSettings.getChannelCount()), Integer.valueOf(audioSettings.getAudioFormat())));
        }
        this.mSettings = audioSettings;
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        int minBufferSize = getMinBufferSize(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
        Preconditions.checkState(minBufferSize > 0);
        int i2 = minBufferSize + minBufferSize;
        this.mBufferSize = i2;
        AudioRecord audioRecordCreateAudioRecord = createAudioRecord(i2, audioSettings, context);
        this.mAudioRecord = audioRecordCreateAudioRecord;
        checkAudioRecordInitialStateOrReleaseAndThrow(audioRecordCreateAudioRecord);
    }

    private static void checkAudioRecordInitialStateOrReleaseAndThrow(AudioRecord audioRecord) throws AudioStream.AudioStreamException {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    private static AudioFormat createAudioFormat(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(AudioUtils.channelCountToChannelMask(i3)).setEncoding(i4).build();
    }

    private static AudioRecord createAudioRecord(int i2, AudioSettings audioSettings, Context context) throws IllegalArgumentException {
        AudioFormat audioFormatCreateAudioFormat = createAudioFormat(audioSettings);
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            Api31Impl.setContext(builder, context);
        }
        builder.setAudioSource(audioSettings.getAudioSource());
        builder.setAudioFormat(audioFormatCreateAudioFormat);
        builder.setBufferSizeInBytes(i2);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private long generatePresentationTimeNs() {
        long jComputeInterpolatedTimeNs;
        if (this.mShouldFallbackToSystemTime) {
            jComputeInterpolatedTimeNs = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (Api24Impl.getTimestamp(this.mAudioRecord, audioTimestamp, 0) == 0) {
                jComputeInterpolatedTimeNs = AudioUtils.computeInterpolatedTimeNs(this.mSettings.getCaptureSampleRate(), this.mTotalFramesRead, audioTimestamp);
                if (Math.abs(jComputeInterpolatedTimeNs - System.nanoTime()) > DIFF_LIMIT_FROM_SYSTEM_TIME_NS) {
                    this.mShouldFallbackToSystemTime = true;
                }
            } else {
                Logger.w(TAG, "Unable to get audio timestamp");
            }
            jComputeInterpolatedTimeNs = -1;
        }
        return jComputeInterpolatedTimeNs == -1 ? System.nanoTime() : jComputeInterpolatedTimeNs;
    }

    private static int getMinBufferSize(int i2, int i3, int i4) {
        return AudioRecord.getMinBufferSize(i2, AudioUtils.channelCountToChannelConfig(i3), i4);
    }

    private static boolean hasAudioTimestampQuirk() {
        return DeviceQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean isSettingsSupported(int i2, int i3, int i4) {
        if (i2 <= 0 || i3 <= 0 || getMinBufferSize(i2, i3, i4) <= 0) {
            return false;
        }
        try {
            createAudioFormat(i2, i3, i4);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    void notifySilenced(final boolean z) {
        Executor executor = this.mCallbackExecutor;
        final AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        if (executor == null || audioStreamCallback == null) {
            return;
        }
        AtomicReference<Boolean> atomicReference = this.mNotifiedSilenceState;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (Objects.equals(atomicReference.getAndSet(boolValueOf), boolValueOf)) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioStreamImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                audioStreamCallback.onSilenceStateChanged(z);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public AudioStream.PacketInfo read(ByteBuffer byteBuffer) {
        long jGeneratePresentationTimeNs;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        int i2 = this.mAudioRecord.read(byteBuffer, this.mBufferSize);
        if (i2 > 0) {
            byteBuffer.limit(i2);
            jGeneratePresentationTimeNs = generatePresentationTimeNs();
            this.mTotalFramesRead += AudioUtils.sizeToFrameCount(i2, this.mBytesPerFrame);
        } else {
            jGeneratePresentationTimeNs = 0;
        }
        return AudioStream.PacketInfo.of(i2, jGeneratePresentationTimeNs);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback = this.mAudioRecordingCallback;
        if (audioManager$AudioRecordingCallback != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioManager$AudioRecordingCallback);
        }
        this.mAudioRecord.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.mAudioStreamCallback = audioStreamCallback;
        this.mCallbackExecutor = executor;
        AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback = this.mAudioRecordingCallback;
        if (audioManager$AudioRecordingCallback != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioManager$AudioRecordingCallback);
        }
        if (audioStreamCallback == null) {
            return;
        }
        if (this.mAudioRecordingCallback == null) {
            this.mAudioRecordingCallback = new AudioRecordingApi29Callback();
        }
        Api29Impl.registerAudioRecordingCallback(this.mAudioRecord, executor, this.mAudioRecordingCallback);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws IllegalStateException, AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        if (hasAudioTimestampQuirk()) {
            checkAudioRecordInitialStateOrReleaseAndThrow(this.mAudioRecord);
        }
        this.mAudioRecord.startRecording();
        if (this.mAudioRecord.getRecordingState() != 3) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
        }
        this.mTotalFramesRead = 0L;
        this.mShouldFallbackToSystemTime = false;
        this.mNotifiedSilenceState.set(null);
        AudioRecordingConfiguration activeRecordingConfiguration = Api29Impl.getActiveRecordingConfiguration(this.mAudioRecord);
        notifySilenced(activeRecordingConfiguration != null && Api29Impl.isClientSilenced(activeRecordingConfiguration));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws IllegalStateException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mAudioRecord.stop();
            if (this.mAudioRecord.getRecordingState() != 1) {
                Logger.w(TAG, "Failed to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            }
            if (hasAudioTimestampQuirk()) {
                this.mAudioRecord.release();
                this.mAudioRecord = createAudioRecord(this.mBufferSize, this.mSettings, null);
            }
        }
    }

    private static AudioFormat createAudioFormat(AudioSettings audioSettings) {
        return createAudioFormat(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
    }
}
