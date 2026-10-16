package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraImpl$start$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ UseCaseCameraImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraImpl$start$$inlined$confineLaunch$1(e eVar, UseCaseCameraImpl useCaseCameraImpl) {
        super(2, eVar);
        this.this$0 = useCaseCameraImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new UseCaseCameraImpl$start$$inlined$confineLaunch$1(eVar, this.this$0);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((UseCaseCameraImpl$start$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (this.this$0.closed.c()) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
            }
        } else {
            CameraGraph graph = this.this$0.useCaseCameraContext.getGraph();
            this.this$0.useCaseCameraContext.configureCameraStateListener();
            graph.start();
            Map<DeferrableSurface, StreamId> surfaceToStreamMap = this.this$0.useCaseCameraContext.getSurfaceToStreamMap();
            StreamId streamIdM280findStillCaptureStreamId4TVKcYk = this.this$0.m280findStillCaptureStreamId4TVKcYk();
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Setting up Surfaces with UseCaseSurfaceManager");
            }
            if (this.this$0.getSessionConfigAdapter().isSessionConfigValid()) {
                UseCaseSurfaceManager useCaseSurfaceManager = this.this$0.getUseCaseSurfaceManager();
                x.e(useCaseSurfaceManager, "access$getUseCaseSurfaceManager(...)");
                SessionConfigAdapter sessionConfigAdapter = this.this$0.getSessionConfigAdapter();
                x.e(sessionConfigAdapter, "access$getSessionConfigAdapter(...)");
                UseCaseSurfaceManager.setupAsync$default(useCaseSurfaceManager, graph, sessionConfigAdapter, surfaceToStreamMap, 0L, 8, null).bY(new l<Throwable, ab>() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$start$1$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        if (th == null || (th instanceof CancellationException)) {
                            return;
                        }
                        Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                        if (Logger.isErrorEnabled(Log.TAG)) {
                            android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Surface setup error!", th);
                        }
                    }

                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                        invoke2(th);
                        return ab.f48028a;
                    }
                });
            } else if (Logger.isErrorEnabled(Log.TAG)) {
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Unable to create capture session due to conflicting configurations");
            }
            this.this$0.m281setCaptureSessionRequestProcessor9O56998(streamIdM280findStillCaptureStreamId4TVKcYk, graph);
        }
        return ab.f48028a;
    }
}
