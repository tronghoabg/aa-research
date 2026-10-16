package androidx.camera.video.internal.audio;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class BufferedAudioStream implements AudioStream {
    private static final int DATA_WAITING_TIME_MILLIS = 100;
    private static final int DEFAULT_BUFFER_SIZE_IN_FRAME = 1024;
    private static final int DEFAULT_QUEUE_SIZE = 500;
    private static final String TAG = "BufferedAudioStream";
    private final AudioStream mAudioStream;
    private int mBufferSize;
    private final int mBytesPerFrame;
    private final int mQueueMaxSize;
    private final int mSampleRate;
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    private final BlockingQueue<AudioData> mAudioDataQueue = new LinkedBlockingQueue();
    private final Executor mProducerExecutor = CameraXExecutors.newSequentialExecutor(CameraXExecutors.audioExecutor());
    private final Object mLock = new Object();
    private AudioData mAudioDataNotFullyRead = null;
    private final AtomicBoolean mIsCollectingAudioData = new AtomicBoolean(false);

    /* compiled from: WazeSource */
    class AudioData {
        private final ByteBuffer mByteBuffer;
        private final int mBytesPerFrame;
        private final int mSampleRate;
        private long mTimestampNs;

        AudioData(ByteBuffer byteBuffer, AudioStream.PacketInfo packetInfo, int i2, int i3) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == packetInfo.getSizeInBytes()) {
                this.mBytesPerFrame = i2;
                this.mSampleRate = i3;
                this.mByteBuffer = byteBuffer;
                this.mTimestampNs = packetInfo.getTimestampNs();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + packetInfo.getSizeInBytes());
        }

        public int getRemainingBufferSizeInBytes() {
            return this.mByteBuffer.remaining();
        }

        public AudioStream.PacketInfo read(ByteBuffer byteBuffer) {
            int iRemaining;
            ByteBuffer byteBuffer2 = this.mByteBuffer;
            long j2 = this.mTimestampNs;
            int iPosition = byteBuffer2.position();
            int iPosition2 = byteBuffer.position();
            if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.mTimestampNs += AudioUtils.frameCountToDurationNs(AudioUtils.sizeToFrameCount(iRemaining, this.mBytesPerFrame), this.mSampleRate);
                ByteBuffer byteBufferDuplicate = this.mByteBuffer.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                ByteBuffer byteBuffer3 = this.mByteBuffer;
                int iRemaining2 = byteBuffer3.remaining();
                byteBuffer.put(byteBuffer3).limit(iPosition2 + iRemaining2).position(iPosition2);
                iRemaining = iRemaining2;
            }
            this.mByteBuffer.position(iPosition + iRemaining);
            return AudioStream.PacketInfo.of(iRemaining, j2);
        }
    }

    public BufferedAudioStream(AudioStream audioStream, AudioSettings audioSettings) {
        this.mAudioStream = audioStream;
        int bytesPerFrame = audioSettings.getBytesPerFrame();
        this.mBytesPerFrame = bytesPerFrame;
        int captureSampleRate = audioSettings.getCaptureSampleRate();
        this.mSampleRate = captureSampleRate;
        Preconditions.checkArgument(((long) bytesPerFrame) > 0, "mBytesPerFrame must be greater than 0.");
        Preconditions.checkArgument(((long) captureSampleRate) > 0, "mSampleRate must be greater than 0.");
        this.mQueueMaxSize = 500;
        this.mBufferSize = bytesPerFrame * 1024;
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void collectAudioData() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.mIsCollectingAudioData
            boolean r0 = r0.get()
            if (r0 != 0) goto L9
            goto L55
        L9:
            int r0 = r5.mBufferSize
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            androidx.camera.video.internal.audio.AudioStream r1 = r5.mAudioStream
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r1 = r1.read(r0)
            int r2 = r5.mBytesPerFrame
            int r3 = r5.mSampleRate
            androidx.camera.video.internal.audio.BufferedAudioStream$AudioData r4 = new androidx.camera.video.internal.audio.BufferedAudioStream$AudioData
            r4.<init>(r0, r1, r2, r3)
            java.util.concurrent.BlockingQueue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r0 = r5.mAudioDataQueue
            boolean r0 = r0.offer(r4)
            java.lang.String r1 = "BufferedAudioStream"
            if (r0 == 0) goto L29
            goto L2e
        L29:
            java.lang.String r0 = "Failed to offer audio data to queue."
            androidx.camera.core.Logger.w(r1, r0)
        L2e:
            java.util.concurrent.BlockingQueue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r0 = r5.mAudioDataQueue
            int r2 = r5.mQueueMaxSize
            int r0 = r0.size()
            if (r0 <= r2) goto L43
            java.util.concurrent.BlockingQueue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r0 = r5.mAudioDataQueue
            r0.poll()
            java.lang.String r0 = "Drop audio data due to full of queue."
            androidx.camera.core.Logger.w(r1, r0)
            goto L2e
        L43:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.mIsCollectingAudioData
            boolean r0 = r0.get()
            if (r0 == 0) goto L55
            java.util.concurrent.Executor r0 = r5.mProducerExecutor
            androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda3 r1 = new androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda3
            r1.<init>()
            r0.execute(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.audio.BufferedAudioStream.collectAudioData():void");
    }

    private void startCollectingAudioData() {
        if (this.mIsCollectingAudioData.getAndSet(true)) {
            return;
        }
        collectAudioData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateCollectionBufferSize, reason: merged with bridge method [inline-methods] */
    public void m1491x75a1ac03(int i2) {
        int i3 = this.mBufferSize;
        if (i3 == i2) {
            return;
        }
        int i4 = this.mBytesPerFrame;
        this.mBufferSize = (i2 / i4) * i4;
        Logger.d(TAG, "Update buffer size from " + i3 + " to " + this.mBufferSize);
    }

    private void updateCollectionBufferSizeAsync(final int i2) {
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1491x75a1ac03(i2);
            }
        });
    }

    /* renamed from: lambda$release$2$androidx-camera-video-internal-audio-BufferedAudioStream, reason: not valid java name */
    /* synthetic */ void m1487x4385f432() {
        this.mIsCollectingAudioData.set(false);
        this.mAudioStream.release();
        this.mAudioDataQueue.clear();
        synchronized (this.mLock) {
            this.mAudioDataNotFullyRead = null;
        }
    }

    /* renamed from: lambda$setCallback$3$androidx-camera-video-internal-audio-BufferedAudioStream, reason: not valid java name */
    /* synthetic */ void m1488xf8dcf611(AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        this.mAudioStream.setCallback(audioStreamCallback, executor);
    }

    /* renamed from: lambda$start$0$androidx-camera-video-internal-audio-BufferedAudioStream, reason: not valid java name */
    /* synthetic */ void m1489x4e044ff9() {
        try {
            this.mAudioStream.start();
            startCollectingAudioData();
        } catch (AudioStream.AudioStreamException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: lambda$stop$1$androidx-camera-video-internal-audio-BufferedAudioStream, reason: not valid java name */
    /* synthetic */ void m1490xb26ac95e() {
        this.mIsCollectingAudioData.set(false);
        this.mAudioStream.stop();
        this.mAudioDataQueue.clear();
        synchronized (this.mLock) {
            this.mAudioDataNotFullyRead = null;
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public AudioStream.PacketInfo read(ByteBuffer byteBuffer) throws InterruptedException {
        AudioData audioDataPoll;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        updateCollectionBufferSizeAsync(byteBuffer.remaining());
        synchronized (this.mLock) {
            audioDataPoll = this.mAudioDataNotFullyRead;
            this.mAudioDataNotFullyRead = null;
        }
        if (audioDataPoll == null) {
            while (this.mIsStarted.get() && !this.mIsReleased.get()) {
                try {
                    audioDataPoll = this.mAudioDataQueue.poll(100L, TimeUnit.MILLISECONDS);
                    if (audioDataPoll != null) {
                        break;
                    }
                } catch (InterruptedException e2) {
                    Logger.w(TAG, "Interruption while waiting for audio data", e2);
                    return AudioStream.PacketInfo.of(0, 0L);
                }
            }
        }
        if (audioDataPoll == null) {
            return AudioStream.PacketInfo.of(0, 0L);
        }
        AudioStream.PacketInfo packetInfo = audioDataPoll.read(byteBuffer);
        if (audioDataPoll.getRemainingBufferSizeInBytes() <= 0) {
            return packetInfo;
        }
        synchronized (this.mLock) {
            this.mAudioDataNotFullyRead = audioDataPoll;
        }
        return packetInfo;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1487x4385f432();
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(final AudioStream.AudioStreamCallback audioStreamCallback, final Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1488xf8dcf611(audioStreamCallback, executor);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1489x4e044ff9();
            }
        }, null);
        this.mProducerExecutor.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e2) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException(e2);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1490xb26ac95e();
                }
            });
        }
    }
}
