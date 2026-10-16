package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.AudioStats;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioSource {
    static final long DEFAULT_START_RETRY_INTERVAL_MS = 3000;
    private static final String TAG = "AudioSource";
    private FutureCallback<InputBuffer> mAcquireBufferCallback;
    long mAmplitudeTimestamp;
    double mAudioAmplitude;
    private final int mAudioFormat;
    public final int mAudioSource;
    AudioSourceCallback mAudioSourceCallback;
    final AudioStream mAudioStream;
    boolean mAudioStreamSilenced;
    BufferProvider<? extends InputBuffer> mBufferProvider;
    BufferProvider.State mBufferProviderState;
    Executor mCallbackExecutor;
    final Executor mExecutor;
    boolean mInSilentStartState;
    boolean mIsSendingAudio;
    private long mLatestFailedStartTimeNs;
    boolean mMuted;
    final AtomicReference<Boolean> mNotifiedSilenceState;
    final AtomicBoolean mNotifiedSuspendState;
    final SilentAudioStream mSilentAudioStream;
    private final long mStartRetryIntervalNs;
    InternalState mState;
    private Observable.Observer<BufferProvider.State> mStateObserver;
    private byte[] mZeroBytes;

    /* compiled from: WazeSource */
    class AudioStreamCallback implements AudioStream.AudioStreamCallback {
        AudioStreamCallback() {
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback
        public void onSilenceStateChanged(boolean z) {
            AudioSource audioSource = AudioSource.this;
            audioSource.mAudioStreamSilenced = z;
            if (audioSource.mState == InternalState.STARTED) {
                AudioSource.this.notifySilenced();
            }
        }
    }

    /* compiled from: WazeSource */
    enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    AudioSource(AudioSettings audioSettings, Executor executor, Context context, AudioStreamFactory audioStreamFactory, long j2) throws AudioSourceAccessException {
        this.mNotifiedSilenceState = new AtomicReference<>(null);
        this.mNotifiedSuspendState = new AtomicBoolean(false);
        this.mState = InternalState.CONFIGURED;
        this.mBufferProviderState = BufferProvider.State.INACTIVE;
        this.mAmplitudeTimestamp = 0L;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = executorNewSequentialExecutor;
        this.mStartRetryIntervalNs = TimeUnit.MILLISECONDS.toNanos(j2);
        try {
            BufferedAudioStream bufferedAudioStream = new BufferedAudioStream(audioStreamFactory.create(audioSettings, context), audioSettings);
            this.mAudioStream = bufferedAudioStream;
            bufferedAudioStream.setCallback(new AudioStreamCallback(), executorNewSequentialExecutor);
            this.mSilentAudioStream = new SilentAudioStream(audioSettings);
            this.mAudioFormat = audioSettings.getAudioFormat();
            this.mAudioSource = audioSettings.getAudioSource();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e2) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e2);
        }
    }

    private static BufferProvider.State fetchBufferProviderState(BufferProvider<? extends InputBuffer> bufferProvider) {
        try {
            bm<? extends InputBuffer> bmVarFetchData = bufferProvider.fetchData();
            if (bmVarFetchData.isDone()) {
                return (BufferProvider.State) bmVarFetchData.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    private static long getCurrentSystemTimeNs() {
        return System.nanoTime();
    }

    public static boolean isSettingsSupported(int i2, int i3, int i4) {
        return AudioStreamImpl.isSettingsSupported(i2, i3, i4);
    }

    private void resetBufferProvider(final BufferProvider<? extends InputBuffer> bufferProvider) {
        BufferProvider<? extends InputBuffer> bufferProvider2 = this.mBufferProvider;
        if (bufferProvider2 != null) {
            bufferProvider2.removeObserver((Observable.Observer) Objects.requireNonNull(this.mStateObserver));
            this.mBufferProvider = null;
            this.mStateObserver = null;
            this.mAcquireBufferCallback = null;
            this.mBufferProviderState = BufferProvider.State.INACTIVE;
            updateSendingAudio();
        }
        if (bufferProvider != null) {
            this.mBufferProvider = bufferProvider;
            this.mStateObserver = new Observable.Observer<BufferProvider.State>() { // from class: androidx.camera.video.internal.audio.AudioSource.1
                @Override // androidx.camera.core.impl.Observable.Observer
                public void onError(Throwable th) {
                    AudioSource audioSource = AudioSource.this;
                    if (audioSource.mBufferProvider == bufferProvider) {
                        audioSource.notifyError(th);
                    }
                }

                @Override // androidx.camera.core.impl.Observable.Observer
                public void onNewData(BufferProvider.State state) {
                    Objects.requireNonNull(state);
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        Logger.d(AudioSource.TAG, "Receive BufferProvider state change: " + AudioSource.this.mBufferProviderState + " to " + state);
                        AudioSource audioSource = AudioSource.this;
                        if (audioSource.mBufferProviderState != state) {
                            audioSource.mBufferProviderState = state;
                            audioSource.updateSendingAudio();
                        }
                    }
                }
            };
            this.mAcquireBufferCallback = new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.audio.AudioSource.2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    if (AudioSource.this.mBufferProvider != bufferProvider) {
                        return;
                    }
                    Logger.d(AudioSource.TAG, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                    if (th instanceof IllegalStateException) {
                        return;
                    }
                    AudioSource.this.notifyError(th);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(InputBuffer inputBuffer) {
                    AudioSource audioSource = AudioSource.this;
                    if (audioSource.mIsSendingAudio) {
                        if (audioSource.mBufferProvider == bufferProvider) {
                            if (audioSource.mInSilentStartState && audioSource.isStartRetryIntervalReached()) {
                                AudioSource.this.retryStartAudioStream();
                            }
                            AudioStream currentAudioStream = AudioSource.this.getCurrentAudioStream();
                            ByteBuffer byteBuffer = inputBuffer.getByteBuffer();
                            AudioStream.PacketInfo packetInfo = currentAudioStream.read(byteBuffer);
                            if (packetInfo.getSizeInBytes() > 0) {
                                AudioSource audioSource2 = AudioSource.this;
                                if (audioSource2.mMuted) {
                                    audioSource2.overrideBySilence(byteBuffer, packetInfo.getSizeInBytes());
                                }
                                if (AudioSource.this.mCallbackExecutor != null) {
                                    long timestampNs = packetInfo.getTimestampNs();
                                    AudioSource audioSource3 = AudioSource.this;
                                    if (timestampNs - audioSource3.mAmplitudeTimestamp >= 200) {
                                        audioSource3.mAmplitudeTimestamp = packetInfo.getTimestampNs();
                                        AudioSource.this.postMaxAmplitude(byteBuffer);
                                    }
                                }
                                byteBuffer.limit(byteBuffer.position() + packetInfo.getSizeInBytes());
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                inputBuffer.setPresentationTimeUs(packetInfo.getTimestampNs() / 1000);
                                inputBuffer.submit();
                            } else {
                                Logger.w(AudioSource.TAG, "Unable to read data from AudioStream.");
                                inputBuffer.cancel();
                            }
                            AudioSource.this.sendNextAudio();
                            return;
                        }
                    }
                    inputBuffer.cancel();
                }
            };
            BufferProvider.State stateFetchBufferProviderState = fetchBufferProviderState(bufferProvider);
            if (stateFetchBufferProviderState != null) {
                this.mBufferProviderState = stateFetchBufferProviderState;
                updateSendingAudio();
            }
            this.mBufferProvider.addObserver(this.mExecutor, this.mStateObserver);
        }
    }

    private void startSendingAudio() {
        if (this.mIsSendingAudio) {
            return;
        }
        try {
            Logger.d(TAG, "startSendingAudio");
            this.mAudioStream.start();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e2) {
            Logger.w(TAG, "Failed to start AudioStream", e2);
            this.mInSilentStartState = true;
            this.mSilentAudioStream.start();
            this.mLatestFailedStartTimeNs = getCurrentSystemTimeNs();
            notifySilenced();
        }
        this.mIsSendingAudio = true;
        sendNextAudio();
    }

    private void stopSendingAudio() {
        if (this.mIsSendingAudio) {
            this.mIsSendingAudio = false;
            Logger.d(TAG, "stopSendingAudio");
            this.mAudioStream.stop();
        }
    }

    AudioStream getCurrentAudioStream() {
        return this.mInSilentStartState ? this.mSilentAudioStream : this.mAudioStream;
    }

    boolean isStartRetryIntervalReached() {
        Preconditions.checkState(this.mLatestFailedStartTimeNs > 0);
        return getCurrentSystemTimeNs() - this.mLatestFailedStartTimeNs >= this.mStartRetryIntervalNs;
    }

    /* renamed from: lambda$mute$7$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1477lambda$mute$7$androidxcameravideointernalaudioAudioSource(boolean z) {
        int iOrdinal = this.mState.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (this.mMuted != z) {
            this.mMuted = z;
            if (this.mState == InternalState.STARTED) {
                notifySilenced();
            }
        }
    }

    /* renamed from: lambda$postMaxAmplitude$11$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1478xdf9dee1c(AudioSourceCallback audioSourceCallback) {
        audioSourceCallback.onAmplitudeValue(this.mAudioAmplitude);
    }

    /* renamed from: lambda$release$4$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1479xb3b7fe6a(CallbackToFutureAdapter.Completer completer) {
        try {
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                resetBufferProvider(null);
                this.mSilentAudioStream.release();
                this.mAudioStream.release();
                stopSendingAudio();
                setState(InternalState.RELEASED);
            }
            completer.set(null);
        } catch (Throwable th) {
            completer.setException(th);
        }
    }

    /* renamed from: lambda$release$5$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ Object m1480xa561a489(final CallbackToFutureAdapter.Completer completer) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1479xb3b7fe6a(completer);
            }
        });
        return "AudioSource-release";
    }

    /* renamed from: lambda$setAudioSourceCallback$6$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1481xcbe526c1(Executor executor, AudioSourceCallback audioSourceCallback) {
        int iOrdinal = this.mState.ordinal();
        if (iOrdinal == 0) {
            this.mCallbackExecutor = executor;
            this.mAudioSourceCallback = audioSourceCallback;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    /* renamed from: lambda$setBufferProvider$0$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1482x885db6e2(BufferProvider bufferProvider) {
        int iOrdinal = this.mState.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (this.mBufferProvider != bufferProvider) {
            resetBufferProvider(bufferProvider);
        }
    }

    /* renamed from: lambda$start$1$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1483lambda$start$1$androidxcameravideointernalaudioAudioSource() {
        start(this.mMuted);
    }

    /* renamed from: lambda$start$2$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1484lambda$start$2$androidxcameravideointernalaudioAudioSource(boolean z) {
        int iOrdinal = this.mState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        this.mNotifiedSilenceState.set(null);
        this.mNotifiedSuspendState.set(false);
        setState(InternalState.STARTED);
        mute(z);
        updateSendingAudio();
    }

    /* renamed from: lambda$stop$3$androidx-camera-video-internal-audio-AudioSource, reason: not valid java name */
    /* synthetic */ void m1485lambda$stop$3$androidxcameravideointernalaudioAudioSource() {
        int iOrdinal = this.mState.ordinal();
        if (iOrdinal == 1) {
            setState(InternalState.CONFIGURED);
            updateSendingAudio();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            Logger.w(TAG, "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    public void mute(final boolean z) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1477lambda$mute$7$androidxcameravideointernalaudioAudioSource(z);
            }
        });
    }

    void notifyError(final Throwable th) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                audioSourceCallback.onError(th);
            }
        });
    }

    void notifySilenced() {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        final boolean z = true;
        if (!this.mMuted && !this.mInSilentStartState && !this.mAudioStreamSilenced) {
            z = false;
        }
        AtomicReference<Boolean> atomicReference = this.mNotifiedSilenceState;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (Objects.equals(atomicReference.getAndSet(boolValueOf), boolValueOf)) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                audioSourceCallback.onSilenceStateChanged(z);
            }
        });
    }

    void notifySuspended(final boolean z) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null || this.mNotifiedSuspendState.getAndSet(z) == z) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                audioSourceCallback.onSuspendStateChanged(z);
            }
        });
    }

    void overrideBySilence(ByteBuffer byteBuffer, int i2) {
        byte[] bArr = this.mZeroBytes;
        if (bArr == null || bArr.length < i2) {
            this.mZeroBytes = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.mZeroBytes, 0, i2);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    void postMaxAmplitude(ByteBuffer byteBuffer) {
        int i2 = this.mAudioFormat;
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (i2 == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = AudioStats.AUDIO_AMPLITUDE_NONE;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.mAudioAmplitude = dMax / 32767.0d;
            if (executor == null || audioSourceCallback == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1478xdf9dee1c(audioSourceCallback);
                }
            });
        }
    }

    public bm<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1480xa561a489(completer);
            }
        });
    }

    void retryStartAudioStream() {
        Preconditions.checkState(this.mInSilentStartState);
        try {
            this.mAudioStream.start();
            Logger.d(TAG, "Retry start AudioStream succeed");
            this.mSilentAudioStream.stop();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e2) {
            Logger.w(TAG, "Retry start AudioStream failed", e2);
            this.mLatestFailedStartTimeNs = getCurrentSystemTimeNs();
        }
    }

    void sendNextAudio() {
        Futures.addCallback(((BufferProvider) Objects.requireNonNull(this.mBufferProvider)).acquireBuffer(), (FutureCallback) Objects.requireNonNull(this.mAcquireBufferCallback), this.mExecutor);
    }

    public void setAudioSourceCallback(final Executor executor, final AudioSourceCallback audioSourceCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1481xcbe526c1(executor, audioSourceCallback);
            }
        });
    }

    public void setBufferProvider(final BufferProvider<? extends InputBuffer> bufferProvider) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1482x885db6e2(bufferProvider);
            }
        });
    }

    void setState(InternalState internalState) {
        Logger.d(TAG, "Transitioning internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    public void start() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1483lambda$start$1$androidxcameravideointernalaudioAudioSource();
            }
        });
    }

    public void stop() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1485lambda$stop$3$androidxcameravideointernalaudioAudioSource();
            }
        });
    }

    void updateSendingAudio() {
        if (this.mState != InternalState.STARTED) {
            stopSendingAudio();
            return;
        }
        BufferProvider.State state = this.mBufferProviderState;
        BufferProvider.State state2 = BufferProvider.State.ACTIVE;
        notifySuspended(state != state2);
        if (state == state2) {
            startSendingAudio();
        } else {
            stopSendingAudio();
        }
    }

    public void start(final boolean z) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1484lambda$start$2$androidxcameravideointernalaudioAudioSource(z);
            }
        });
    }

    /* compiled from: WazeSource */
    public interface AudioSourceCallback {
        void onAmplitudeValue(double d2);

        void onError(Throwable th);

        void onSilenceStateChanged(boolean z);

        void onSuspendStateChanged(boolean z);

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.video.internal.audio.AudioSource$AudioSourceCallback$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onSuspendStateChanged(AudioSourceCallback audioSourceCallback, boolean z) {
            }
        }
    }

    public AudioSource(AudioSettings audioSettings, Executor executor, Context context) {
        this(audioSettings, executor, context, new AudioStreamFactory() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda12
            @Override // androidx.camera.video.internal.audio.AudioStreamFactory
            public final AudioStream create(AudioSettings audioSettings2, Context context2) {
                return new AudioStreamImpl(audioSettings2, context2);
            }
        }, 3000L);
    }
}
