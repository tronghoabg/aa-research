package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import g.a.a;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.e;
import h.e.b;
import h.f;
import h.g;
import h.g.b.x;
import h.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class UseCaseCameraImpl implements UseCaseCamera {
    private final f capturePipeline$delegate;
    private final a<CapturePipeline> capturePipelineProvider;
    private final kotlinx.a.a closed;
    private final int debugId;
    private final UseCaseCameraRequestControl requestControl;
    private final f sessionConfigAdapter$delegate;
    private final a<SessionConfigAdapter> sessionConfigAdapterProvider;
    private final SessionProcessor sessionProcessor;
    private final UseCaseThreads threads;
    private final UseCaseCameraContext useCaseCameraContext;
    private final f useCaseSurfaceManager$delegate;
    private final a<UseCaseSurfaceManager> useCaseSurfaceManagerProvider;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        @UseCaseCameraScope
        public abstract UseCaseCamera provideUseCaseCamera(UseCaseCameraImpl useCaseCameraImpl);
    }

    public UseCaseCameraImpl(UseCaseCameraContext useCaseCameraContext, UseCaseThreads useCaseThreads, SessionProcessor sessionProcessor, UseCaseCameraRequestControl useCaseCameraRequestControl, a<UseCaseSurfaceManager> aVar, a<SessionConfigAdapter> aVar2, a<CapturePipeline> aVar3) {
        x.f(useCaseCameraContext, "useCaseCameraContext");
        x.f(useCaseThreads, "threads");
        x.f(useCaseCameraRequestControl, "requestControl");
        x.f(aVar, "useCaseSurfaceManagerProvider");
        x.f(aVar2, "sessionConfigAdapterProvider");
        x.f(aVar3, "capturePipelineProvider");
        this.useCaseCameraContext = useCaseCameraContext;
        this.threads = useCaseThreads;
        this.sessionProcessor = sessionProcessor;
        this.requestControl = useCaseCameraRequestControl;
        this.useCaseSurfaceManagerProvider = aVar;
        this.sessionConfigAdapterProvider = aVar2;
        this.capturePipelineProvider = aVar3;
        this.debugId = UseCaseCameraKt.getUseCaseCameraIds().e();
        this.closed = b.e(false);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            toString();
            android.util.Log.d(str, "Configured ".concat(toString()));
        }
        this.useCaseSurfaceManager$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.useCaseSurfaceManagerProvider.get();
            }
        });
        this.sessionConfigAdapter$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.sessionConfigAdapterProvider.get();
            }
        });
        this.capturePipeline$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.capturePipelineProvider.get();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: findStillCaptureStreamId-4TVKcYk, reason: not valid java name */
    public final StreamId m280findStillCaptureStreamId4TVKcYk() {
        Object next;
        SessionConfig validSessionConfigOrNull = getSessionConfigAdapter().getValidSessionConfigOrNull();
        if (validSessionConfigOrNull != null) {
            List<DeferrableSurface> surfaces = validSessionConfigOrNull.getRepeatingCaptureConfig().getSurfaces();
            x.e(surfaces, "getSurfaces(...)");
            List<DeferrableSurface> surfaces2 = validSessionConfigOrNull.getSurfaces();
            x.e(surfaces2, "getSurfaces(...)");
            Iterator<T> it = surfaces2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!surfaces.contains((DeferrableSurface) next)) {
                    break;
                }
            }
            DeferrableSurface deferrableSurface = (DeferrableSurface) next;
            if (deferrableSurface != null) {
                return (StreamId) i.Q(this.useCaseCameraContext.getStreamIdsFromSurfaces(i.d(deferrableSurface)));
            }
        }
        return null;
    }

    private final CapturePipeline getCapturePipeline() {
        return (CapturePipeline) this.capturePipeline$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionConfigAdapter getSessionConfigAdapter() {
        return (SessionConfigAdapter) this.sessionConfigAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UseCaseSurfaceManager getUseCaseSurfaceManager() {
        return (UseCaseSurfaceManager) this.useCaseSurfaceManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCaptureSessionRequestProcessor-9O56998, reason: not valid java name */
    public final void m281setCaptureSessionRequestProcessor9O56998(final StreamId streamId, final CameraGraph cameraGraph) {
        SessionProcessor sessionProcessor = this.sessionProcessor;
        if (sessionProcessor != null) {
            sessionProcessor.setCaptureSessionRequestProcessor(new SessionProcessor.CaptureSessionRequestProcessor() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$setCaptureSessionRequestProcessor$1
                @Override // androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor
                public Pair<Long, Long> getRealtimeStillCaptureLatency() {
                    StreamGraph.OutputLatency outputLatencyM970getOutputLatencyIL232MI$default;
                    StreamId streamId2 = streamId;
                    if (streamId2 == null || (outputLatencyM970getOutputLatencyIL232MI$default = StreamGraph.CC.m970getOutputLatencyIL232MI$default(cameraGraph.getStreams(), streamId2.m980unboximpl(), null, 2, null)) == null) {
                        return null;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long estimatedCaptureLatencyNs = outputLatencyM970getOutputLatencyIL232MI$default.getEstimatedCaptureLatencyNs() / 1000000;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    return Pair.create(Long.valueOf(estimatedCaptureLatencyNs), Long.valueOf(outputLatencyM970getOutputLatencyIL232MI$default.getEstimatedProcessingLatencyNs() / 1000000));
                }

                @Override // androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor
                public void setExtensionStrength(int i2) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        UseCaseCameraRequestControl.CC.setParametersAsync$default(this.getRequestControl(), r.m(new k(CaptureRequest.EXTENSION_STRENGTH, Integer.valueOf(i2))), null, null, 6, null);
                    }
                }
            });
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public br close() {
        if (!this.closed.b(false, true)) {
            return bo.h(ab.f48028a);
        }
        getRequestControl().close();
        return aj.z(this.threads.getSequentialScope(), null, null, new UseCaseCameraImpl$close$$inlined$confineLaunch$1(null, this), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public Object getCameraCapturePipeline(int i2, int i3, int i4, e<? super CameraCapturePipeline> eVar) {
        return getCapturePipeline().getCameraCapturePipeline(i2, i3, i4, eVar);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public UseCaseCameraRequestControl getRequestControl() {
        return this.requestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public void setActiveResumeMode(boolean z) {
        aj.z(this.threads.getSequentialScope(), null, null, new UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1(null, this, z), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public void start() {
        aj.z(this.threads.getSequentialScope(), null, null, new UseCaseCameraImpl$start$$inlined$confineLaunch$1(null, this), 3);
    }

    public String toString() {
        return "UseCaseCamera-" + this.debugId;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public br updateRepeatingRequestAsync(boolean z, Collection<? extends UseCase> collection) {
        x.f(collection, "runningUseCases");
        return getRequestControl().updateRepeatingRequestAsync(z, collection);
    }
}
