package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import com.google.d.b.an;
import com.waze.mg$$ExternalSyntheticApiModelOutline0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioTrackAudioOutput implements AudioOutput {
    private static final int AUDIO_TRACK_VOLUME_RAMP_TIME_MS = 20;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    private static final String TAG = "AudioTrackAudioOutput";
    private static int pendingReleaseCount;
    private static ScheduledExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private final AudioTrack audioTrack;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final CapabilityChangeListener capabilityChangeListener;
    private final AudioOutputProvider.OutputConfig config;
    private int framesPerEncodedSample;
    private boolean hasBeenStopped;
    private boolean hasData;
    private final boolean isOutputPcm;
    private long lastTunnelingAvSyncPresentationTimeUs;
    private int lastUnderrunCount;
    private final ListenerSet<AudioOutput.Listener> listeners;
    private final float maxPlaybackSpeed;
    private final StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private OnRoutingChangedListenerApi24 onRoutingChangedListener;
    private final int pcmFrameSize;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* compiled from: WazeSource */
    public interface CapabilityChangeListener {
        void onRecoverableWriteError();

        void onRoutedDeviceChanged(AudioDeviceInfo audioDeviceInfo);
    }

    /* compiled from: WazeSource */
    final class OnRoutingChangedListenerApi24 {
        private final AudioTrack audioTrack;
        private final CapabilityChangeListener capabilityChangeListener;
        private AudioRouting$OnRoutingChangedListener listener;
        private final Handler playbackThreadHandler;

        private OnRoutingChangedListenerApi24(AudioTrack audioTrack, CapabilityChangeListener capabilityChangeListener) {
            this.audioTrack = audioTrack;
            this.capabilityChangeListener = capabilityChangeListener;
            Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.playbackThreadHandler = handlerCreateHandlerForCurrentLooper;
            AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = new AudioRouting$OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    this.f$0.onRoutingChanged(audioRouting);
                }
            };
            this.listener = audioRouting$OnRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handlerCreateHandlerForCurrentLooper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRoutingChanged$0(AudioRouting audioRouting) {
            final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                this.playbackThreadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$onRoutingChanged$1(routedDevice);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRoutingChanged$1(AudioDeviceInfo audioDeviceInfo) {
            if (this.listener == null) {
                return;
            }
            this.capabilityChangeListener.onRoutedDeviceChanged(audioDeviceInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(final AudioRouting audioRouting) {
            if (this.listener == null) {
                return;
            }
            BackgroundExecutor.get().execute(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onRoutingChanged$0(audioRouting);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.listener;
            an.B(audioRouting$OnRoutingChangedListener);
            this.audioTrack.removeOnRoutingChangedListener(mg$$ExternalSyntheticApiModelOutline0.m((Object) audioRouting$OnRoutingChangedListener));
            this.listener = null;
        }
    }

    /* compiled from: WazeSource */
    final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        final /* synthetic */ AudioTrackAudioOutput this$0;

        private PositionTrackerListener(AudioTrackAudioOutput audioTrackAudioOutput) {
            Objects.requireNonNull(audioTrackAudioOutput);
            this.this$0 = audioTrackAudioOutput;
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j2) {
            Log.w(AudioTrackAudioOutput.TAG, "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(final long j2) {
            if (this.this$0.listeners.isRunningOnCorrectThread()) {
                this.this$0.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$PositionTrackerListener$$ExternalSyntheticLambda0
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((AudioOutput.Listener) obj).onPositionAdvancing(j2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j2, long j3, long j4, long j5) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + this.this$0.getWrittenFrames();
            if (!MediaLibraryInfo.enableWorkarounds()) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w(AudioTrackAudioOutput.TAG, str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j2, long j3, long j4, long j5) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + this.this$0.getWrittenFrames();
            if (!MediaLibraryInfo.enableWorkarounds()) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w(AudioTrackAudioOutput.TAG, str);
        }
    }

    /* compiled from: WazeSource */
    final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler;
        final /* synthetic */ AudioTrackAudioOutput this$0;

        private StreamEventCallbackV29(AudioTrackAudioOutput audioTrackAudioOutput) {
            Objects.requireNonNull(audioTrackAudioOutput);
            this.this$0 = audioTrackAudioOutput;
            final Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.handler = handlerCreateHandlerForCurrentLooper;
            AudioTrack$StreamEventCallback audioTrack$StreamEventCallback = new AudioTrack$StreamEventCallback(this) { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput.StreamEventCallbackV29.1
                final /* synthetic */ StreamEventCallbackV29 this$1;

                {
                    Objects.requireNonNull(this);
                    this.this$1 = this;
                }

                public void onDataRequest(AudioTrack audioTrack, int i2) {
                    this.this$1.this$0.listeners.sendEvent(new AudioTrackAudioOutput$StreamEventCallbackV29$1$$ExternalSyntheticLambda0());
                }

                public void onPresentationEnded(AudioTrack audioTrack) {
                    this.this$1.this$0.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$StreamEventCallbackV29$1$$ExternalSyntheticLambda1
                        @Override // androidx.media3.common.util.ListenerSet.Event
                        public final void invoke(Object obj) {
                            ((AudioOutput.Listener) obj).onOffloadPresentationEnded();
                        }
                    });
                }

                public void onTearDown(AudioTrack audioTrack) {
                    this.this$1.this$0.listeners.sendEvent(new AudioTrackAudioOutput$StreamEventCallbackV29$1$$ExternalSyntheticLambda0());
                }
            };
            this.callback = audioTrack$StreamEventCallback;
            AudioTrack audioTrack = audioTrackAudioOutput.audioTrack;
            Objects.requireNonNull(handlerCreateHandlerForCurrentLooper);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$StreamEventCallbackV29$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handlerCreateHandlerForCurrentLooper.post(runnable);
                }
            }, audioTrack$StreamEventCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void unregister() {
            this.this$0.audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.OutputConfig outputConfig, CapabilityChangeListener capabilityChangeListener, float f2, Clock clock) {
        int pcmFrameSize;
        this.audioTrack = audioTrack;
        this.config = outputConfig;
        this.maxPlaybackSpeed = f2;
        this.capabilityChangeListener = capabilityChangeListener;
        this.listeners = new ListenerSet<>(Thread.currentThread());
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(outputConfig.encoding);
        this.isOutputPcm = zIsEncodingLinearPcm;
        if (zIsEncodingLinearPcm) {
            pcmFrameSize = Util.getPcmFrameSize(outputConfig.encoding, Integer.bitCount(outputConfig.channelMask));
            this.pcmFrameSize = pcmFrameSize;
        } else {
            pcmFrameSize = -1;
            this.pcmFrameSize = -1;
        }
        int i2 = pcmFrameSize;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener(), clock, audioTrack, outputConfig.encoding, i2, outputConfig.bufferSize);
        if (capabilityChangeListener != null) {
            this.onRoutingChangedListener = new OnRoutingChangedListenerApi24(audioTrack, capabilityChangeListener);
        }
        this.offloadStreamEventCallbackV29 = isOffloadedPlayback() ? new StreamEventCallbackV29() : null;
    }

    private int getAudioOutputUnderrunCount(long j2) {
        return this.audioTrack.getUnderrunCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        return this.isOutputPcm ? Util.ceilDivide(this.writtenPcmBytes, this.pcmFrameSize) : this.writtenEncodedFrames;
    }

    private boolean hasPendingAudioTrackUnderruns(long j2) {
        int audioOutputUnderrunCount = getAudioOutputUnderrunCount(j2);
        int i2 = this.lastUnderrunCount;
        this.lastUnderrunCount = audioOutputUnderrunCount;
        return audioOutputUnderrunCount > i2;
    }

    private static boolean isAudioTrackDeadObject(int i2) {
        return i2 == -6 || i2 == ERROR_NATIVE_DEAD_OBJECT;
    }

    static /* synthetic */ void lambda$releaseAudioTrackAsync$0(AudioTrack audioTrack, Handler handler, final ListenerSet listenerSet) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$1(listenerSet);
                    }
                });
            }
            synchronized (releaseExecutorLock) {
                int i2 = pendingReleaseCount - 1;
                pendingReleaseCount = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService = releaseExecutor;
                    an.B(scheduledExecutorService);
                    scheduledExecutorService.shutdown();
                    releaseExecutor = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$1(listenerSet);
                    }
                });
            }
            synchronized (releaseExecutorLock) {
                int i3 = pendingReleaseCount - 1;
                pendingReleaseCount = i3;
                if (i3 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = releaseExecutor;
                    an.B(scheduledExecutorService2);
                    scheduledExecutorService2.shutdown();
                    releaseExecutor = null;
                }
                throw th;
            }
        }
    }

    static /* synthetic */ void lambda$releaseAudioTrackAsync$1(ListenerSet listenerSet) {
        if (listenerSet.isRunningOnCorrectThread()) {
            listenerSet.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((AudioOutput.Listener) obj).onReleased();
                }
            });
        }
    }

    private void maybeReportUnderrun() {
        if (this.listeners.isRunningOnCorrectThread() && hasPendingAudioTrackUnderruns(getWrittenFrames())) {
            this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((AudioOutput.Listener) obj).onUnderrun();
                }
            });
        }
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, final ListenerSet<AudioOutput.Listener> listenerSet) {
        final Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (releaseExecutorLock) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = releaseExecutor;
            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor = Util.newSingleThreadScheduledExecutor("ExoPlayer:AudioTrackReleaseThread");
                releaseExecutor = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            }
            pendingReleaseCount++;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$0(audioTrack, handlerCreateHandlerForCurrentLooper, listenerSet);
                }
            }, 20L, TimeUnit.MILLISECONDS);
        }
    }

    private int writeWithAvSync(AudioTrack audioTrack, ByteBuffer byteBuffer, long j2) {
        return audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j2 * 1000);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void addListener(AudioOutput.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void attachAuxEffect(int i2) {
        this.audioTrack.attachAuxEffect(i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public /* synthetic */ boolean canReuseAudioOutput(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.FormatConfig formatConfig, AudioOutputProvider.OutputConfig outputConfig2) {
        return outputConfig2.equals(outputConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void flush() {
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.hasBeenStopped = false;
        this.framesPerEncodedSample = 0;
        this.audioTrack.flush();
        this.audioTrackPositionTracker.reset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getAudioSessionId() {
        return this.audioTrack.getAudioSessionId();
    }

    public AudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public PlaybackParameters getPlaybackParameters() {
        PlaybackParams playbackParams = this.audioTrack.getPlaybackParams();
        return new PlaybackParameters(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getPositionUs() {
        return this.audioTrackPositionTracker.getCurrentPositionUs(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getSampleRate() {
        return this.audioTrack.getSampleRate();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isOffloadedPlayback() {
        return this.audioTrack.isOffloadedPlayback();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isStalled() {
        return this.audioTrackPositionTracker.isStalled(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void pause() throws IllegalStateException {
        this.audioTrackPositionTracker.pause();
        if (!this.hasBeenStopped || isOffloadedPlayback()) {
            this.audioTrack.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void play() throws IllegalStateException {
        this.audioTrackPositionTracker.start();
        if (!this.hasBeenStopped || isOffloadedPlayback()) {
            this.audioTrack.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void release() throws IllegalStateException {
        if (this.audioTrackPositionTracker.isPlaying()) {
            this.audioTrack.pause();
        }
        if (isOffloadedPlayback()) {
            StreamEventCallbackV29 streamEventCallbackV29 = this.offloadStreamEventCallbackV29;
            an.B(streamEventCallbackV29);
            streamEventCallbackV29.unregister();
        }
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24 = this.onRoutingChangedListener;
        if (onRoutingChangedListenerApi24 != null) {
            onRoutingChangedListenerApi24.release();
            this.onRoutingChangedListener = null;
        }
        releaseAudioTrackAsync(this.audioTrack, this.listeners);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void removeListener(AudioOutput.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setAuxEffectSendLevel(float f2) {
        this.audioTrack.setAuxEffectSendLevel(f2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadDelayPadding(int i2, int i3) {
        this.audioTrack.setOffloadDelayPadding(i2, i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadEndOfStream() {
        if (this.audioTrack.getPlayState() != 3) {
            return;
        }
        this.audioTrack.setOffloadEndOfStream();
        this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        try {
            this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(Util.constrainValue(playbackParameters.speed, 0.1f, this.maxPlaybackSpeed)).setPitch(Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f)).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e2) {
            Log.w(TAG, "Failed to set playback params", e2);
        }
        this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(this.audioTrack.getPlaybackParams().getSpeed());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlayerId(PlayerId playerId) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionId = playerId.getLogSessionId();
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.audioTrack.setLogSessionId(logSessionId);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.audioTrack.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setVolume(float f2) {
        this.audioTrack.setVolume(f2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void stop() throws IllegalStateException {
        if (this.hasBeenStopped) {
            return;
        }
        this.hasBeenStopped = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean write(ByteBuffer byteBuffer, int i2, long j2) throws AudioOutput.WriteException {
        int iWrite;
        CapabilityChangeListener capabilityChangeListener;
        if (!this.isOutputPcm && this.framesPerEncodedSample == 0) {
            this.framesPerEncodedSample = DefaultAudioSink.getFramesPerEncodedSample(this.config.encoding, byteBuffer);
        }
        maybeReportUnderrun();
        int iRemaining = byteBuffer.remaining();
        if (this.config.isTunneling) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j2;
            }
            iWrite = writeWithAvSync(this.audioTrack, byteBuffer, j2);
        } else {
            iWrite = this.audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite < 0) {
            boolean zIsAudioTrackDeadObject = isAudioTrackDeadObject(iWrite);
            if (zIsAudioTrackDeadObject && (capabilityChangeListener = this.capabilityChangeListener) != null) {
                capabilityChangeListener.onRecoverableWriteError();
            }
            throw new AudioOutput.WriteException(iWrite, zIsAudioTrackDeadObject);
        }
        boolean z = iWrite == iRemaining;
        if (this.isOutputPcm) {
            this.writtenPcmBytes += iWrite;
            return z;
        }
        if (z) {
            this.writtenEncodedFrames += this.framesPerEncodedSample * i2;
        }
        return z;
    }

    /* compiled from: WazeSource */
    public final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    @Deprecated
    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.OutputConfig outputConfig, CapabilityChangeListener capabilityChangeListener, Clock clock) {
        this(audioTrack, outputConfig, capabilityChangeListener, 8.0f, clock);
    }
}
