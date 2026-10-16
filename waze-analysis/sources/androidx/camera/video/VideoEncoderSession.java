package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import com.google.d.m.a.bm;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class VideoEncoderSession {
    private static final String TAG = "VideoEncoderSession";
    private final Executor mExecutor;
    private final Executor mSequentialExecutor;
    private final EncoderFactory mVideoEncoderFactory;
    private Encoder mVideoEncoder = null;
    private Surface mActiveSurface = null;
    private SurfaceRequest mSurfaceRequest = null;
    private VideoEncoderState mVideoEncoderState = VideoEncoderState.NOT_INITIALIZED;
    private bm<Void> mReleasedFuture = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));
    private CallbackToFutureAdapter.Completer<Void> mReleasedCompleter = null;
    private bm<Encoder> mReadyToReleaseFuture = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));
    private CallbackToFutureAdapter.Completer<Encoder> mReadyToReleaseCompleter = null;

    /* compiled from: WazeSource */
    enum VideoEncoderState {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    VideoEncoderSession(EncoderFactory encoderFactory, Executor executor, Executor executor2) {
        this.mExecutor = executor2;
        this.mSequentialExecutor = executor;
        this.mVideoEncoderFactory = encoderFactory;
    }

    private void closeInternal() {
        int iOrdinal = this.mVideoEncoderState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            terminateNow();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            Logger.d(TAG, "closeInternal in " + this.mVideoEncoderState + " state");
            this.mVideoEncoderState = VideoEncoderState.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            Logger.d(TAG, "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
    }

    private void configureVideoEncoderInternal(SurfaceRequest surfaceRequest, VideoEncoderConfig videoEncoderConfig, CallbackToFutureAdapter.Completer<Encoder> completer) {
        try {
            Encoder encoderCreateEncoder = this.mVideoEncoderFactory.createEncoder(this.mExecutor, videoEncoderConfig, surfaceRequest.getSessionType());
            this.mVideoEncoder = encoderCreateEncoder;
            if (!(encoderCreateEncoder.getInput() instanceof Encoder.SurfaceInput)) {
                completer.setException(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                return;
            }
            Surface surface = ((Encoder.SurfaceInput) this.mVideoEncoder.getInput()).getSurface();
            this.mActiveSurface = surface;
            Objects.toString(surface);
            Logger.d(TAG, "provide surface: ".concat(String.valueOf(surface)));
            surfaceRequest.provideSurface(surface, this.mSequentialExecutor, new Consumer() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.m1475x54b38fd2((SurfaceRequest.Result) obj);
                }
            });
            this.mVideoEncoderState = VideoEncoderState.READY;
            completer.set(this.mVideoEncoder);
        } catch (InvalidConfigException e2) {
            Logger.e(TAG, "Unable to initialize video encoder.", e2);
            completer.setException(e2);
        }
    }

    bm<Encoder> configure(final SurfaceRequest surfaceRequest, final VideoEncoderConfig videoEncoderConfig) {
        if (this.mVideoEncoderState.ordinal() != 0) {
            VideoEncoderState videoEncoderState = this.mVideoEncoderState;
            Objects.toString(videoEncoderState);
            return Futures.immediateFailedFuture(new IllegalStateException("configure() shouldn't be called in ".concat(String.valueOf(videoEncoderState))));
        }
        this.mVideoEncoderState = VideoEncoderState.INITIALIZING;
        this.mSurfaceRequest = surfaceRequest;
        toString();
        Logger.d(TAG, "Create VideoEncoderSession: ".concat(toString()));
        this.mReleasedFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1472lambda$configure$0$androidxcameravideoVideoEncoderSession(completer);
            }
        });
        this.mReadyToReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1473lambda$configure$1$androidxcameravideoVideoEncoderSession(completer);
            }
        });
        bm future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1474lambda$configure$2$androidxcameravideoVideoEncoderSession(surfaceRequest, videoEncoderConfig, completer);
            }
        });
        Futures.addCallback(future, new FutureCallback<Encoder>() { // from class: androidx.camera.video.VideoEncoderSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.w(VideoEncoderSession.TAG, "VideoEncoder configuration failed.", th);
                VideoEncoderSession.this.terminateNow();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
            }
        }, this.mSequentialExecutor);
        return Futures.nonCancellationPropagating(future);
    }

    Surface getActiveSurface() {
        if (this.mVideoEncoderState != VideoEncoderState.READY) {
            return null;
        }
        return this.mActiveSurface;
    }

    bm<Encoder> getReadyToReleaseFuture() {
        return Futures.nonCancellationPropagating(this.mReadyToReleaseFuture);
    }

    Encoder getVideoEncoder() {
        return this.mVideoEncoder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean isConfiguredSurfaceRequest(androidx.camera.core.SurfaceRequest r5) {
        /*
            r4 = this;
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = r4.mVideoEncoderState
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L36
            r2 = 1
            if (r0 == r2) goto L31
            r3 = 2
            if (r0 == r3) goto L36
            r3 = 3
            if (r0 == r3) goto L31
            r5 = 4
            if (r0 != r5) goto L16
            goto L36
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State "
            r0.<init>(r1)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r4 = r4.mVideoEncoderState
            r0.append(r4)
            java.lang.String r4 = " is not handled"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            androidx.camera.core.SurfaceRequest r4 = r4.mSurfaceRequest
            if (r4 != r5) goto L36
            return r2
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.VideoEncoderSession.isConfiguredSurfaceRequest(androidx.camera.core.SurfaceRequest):boolean");
    }

    /* renamed from: lambda$configure$0$androidx-camera-video-VideoEncoderSession, reason: not valid java name */
    /* synthetic */ Object m1472lambda$configure$0$androidxcameravideoVideoEncoderSession(CallbackToFutureAdapter.Completer completer) {
        this.mReleasedCompleter = completer;
        toString();
        return "ReleasedFuture ".concat(toString());
    }

    /* renamed from: lambda$configure$1$androidx-camera-video-VideoEncoderSession, reason: not valid java name */
    /* synthetic */ Object m1473lambda$configure$1$androidxcameravideoVideoEncoderSession(CallbackToFutureAdapter.Completer completer) {
        this.mReadyToReleaseCompleter = completer;
        toString();
        return "ReadyToReleaseFuture ".concat(toString());
    }

    /* renamed from: lambda$configure$2$androidx-camera-video-VideoEncoderSession, reason: not valid java name */
    /* synthetic */ Object m1474lambda$configure$2$androidxcameravideoVideoEncoderSession(SurfaceRequest surfaceRequest, VideoEncoderConfig videoEncoderConfig, CallbackToFutureAdapter.Completer completer) {
        configureVideoEncoderInternal(surfaceRequest, videoEncoderConfig, completer);
        toString();
        return "ConfigureVideoEncoderFuture ".concat(toString());
    }

    /* renamed from: lambda$configureVideoEncoderInternal$4$androidx-camera-video-VideoEncoderSession, reason: not valid java name */
    /* synthetic */ void m1475x54b38fd2(SurfaceRequest.Result result) {
        Surface surface = result.getSurface();
        Objects.toString(surface);
        Logger.d(TAG, "Surface can be closed: ".concat(String.valueOf(surface)));
        this.mActiveSurface = null;
        this.mReadyToReleaseCompleter.set(this.mVideoEncoder);
        closeInternal();
    }

    /* renamed from: lambda$terminateNow$3$androidx-camera-video-VideoEncoderSession, reason: not valid java name */
    /* synthetic */ void m1476lambda$terminateNow$3$androidxcameravideoVideoEncoderSession() {
        this.mReleasedCompleter.set(null);
    }

    bm<Void> signalTermination() {
        closeInternal();
        return Futures.nonCancellationPropagating(this.mReleasedFuture);
    }

    void terminateNow() {
        int iOrdinal = this.mVideoEncoderState.ordinal();
        if (iOrdinal == 0) {
            this.mVideoEncoderState = VideoEncoderState.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            VideoEncoderState videoEncoderState = this.mVideoEncoderState;
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + videoEncoderState + " is not handled");
            }
            Logger.d(TAG, "terminateNow in " + videoEncoderState + ", No-op");
            return;
        }
        this.mVideoEncoderState = VideoEncoderState.RELEASED;
        this.mReadyToReleaseCompleter.set(this.mVideoEncoder);
        this.mSurfaceRequest = null;
        if (this.mVideoEncoder == null) {
            Logger.w(TAG, "There's no VideoEncoder to release! Finish release completer.");
            this.mReleasedCompleter.set(null);
            return;
        }
        Encoder encoder = this.mVideoEncoder;
        Objects.toString(encoder);
        Logger.d(TAG, "VideoEncoder is releasing: ".concat(String.valueOf(encoder)));
        this.mVideoEncoder.release();
        this.mVideoEncoder.getReleasedFuture().addListener(new Runnable() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1476lambda$terminateNow$3$androidxcameravideoVideoEncoderSession();
            }
        }, this.mSequentialExecutor);
        this.mVideoEncoder = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + j$.util.Objects.toString(this.mSurfaceRequest, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
