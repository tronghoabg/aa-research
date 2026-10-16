package androidx.camera.core.processing;

import androidx.camera.core.CameraEffect;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Consumer;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class SurfaceProcessorWithExecutor implements SurfaceProcessorInternal {
    private static final String TAG = "SurfaceProcessor";
    private final Consumer<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final SurfaceProcessor mSurfaceProcessor;

    public SurfaceProcessorWithExecutor(CameraEffect cameraEffect) {
        this.mSurfaceProcessor = (SurfaceProcessor) Objects.requireNonNull(cameraEffect.getSurfaceProcessor());
        this.mExecutor = cameraEffect.getExecutor();
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public SurfaceProcessor getProcessor() {
        return this.mSurfaceProcessor;
    }

    /* renamed from: lambda$onInputSurface$0$androidx-camera-core-processing-SurfaceProcessorWithExecutor, reason: not valid java name */
    /* synthetic */ void m1404x3d0be2a7(SurfaceRequest surfaceRequest) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceRequest);
        } catch (ProcessingException e2) {
            Logger.e(TAG, "Failed to setup SurfaceProcessor input.", e2);
            this.mErrorListener.accept(e2);
        }
    }

    /* renamed from: lambda$onOutputSurface$1$androidx-camera-core-processing-SurfaceProcessorWithExecutor, reason: not valid java name */
    /* synthetic */ void m1405x6df3c9b5(SurfaceOutput surfaceOutput) {
        try {
            this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
        } catch (ProcessingException e2) {
            Logger.e(TAG, "Failed to setup SurfaceProcessor output.", e2);
            this.mErrorListener.accept(e2);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final SurfaceRequest surfaceRequest) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1404x3d0be2a7(surfaceRequest);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final SurfaceOutput surfaceOutput) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1405x6df3c9b5(surfaceOutput);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public bm<Void> snapshot(int i2, int i3) {
        return Futures.immediateFailedFuture(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public String toString() {
        return "SurfaceProcessorWithExecutor(" + this.mSurfaceProcessor + ")";
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }
}
