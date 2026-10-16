package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.impl.GraphConfigBundle;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import g.a.a;
import h.f;
import h.g;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraConfig {
    public static final Companion Companion = new Companion(null);
    private final l<CameraGraph.Config, CameraGraph> cameraGraphFactory;
    private final GraphStateToCameraStateAdapter graphStateToCameraStateAdapter;
    private final f<GraphConfigBundle> lazyGraphConfigBundle;
    private final SessionConfigAdapter sessionConfigAdapter;
    private final SessionProcessor sessionProcessor;

    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseCameraConfig(l<? super CameraGraph.Config, ? extends CameraGraph> lVar, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, SessionConfigAdapter sessionConfigAdapter, SessionProcessor sessionProcessor, f<GraphConfigBundle> fVar) {
        x.f(lVar, "cameraGraphFactory");
        x.f(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        x.f(sessionConfigAdapter, "sessionConfigAdapter");
        x.f(fVar, "lazyGraphConfigBundle");
        this.cameraGraphFactory = lVar;
        this.graphStateToCameraStateAdapter = graphStateToCameraStateAdapter;
        this.sessionConfigAdapter = sessionConfigAdapter;
        this.sessionProcessor = sessionProcessor;
        this.lazyGraphConfigBundle = fVar;
    }

    private final l<CameraGraph.Config, CameraGraph> component1() {
        return this.cameraGraphFactory;
    }

    private final GraphStateToCameraStateAdapter component2() {
        return this.graphStateToCameraStateAdapter;
    }

    private final SessionConfigAdapter component3() {
        return this.sessionConfigAdapter;
    }

    private final SessionProcessor component4() {
        return this.sessionProcessor;
    }

    private final f<GraphConfigBundle> component5() {
        return this.lazyGraphConfigBundle;
    }

    public static /* synthetic */ UseCaseCameraConfig copy$default(UseCaseCameraConfig useCaseCameraConfig, l lVar, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, SessionConfigAdapter sessionConfigAdapter, SessionProcessor sessionProcessor, f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = useCaseCameraConfig.cameraGraphFactory;
        }
        if ((i2 & 2) != 0) {
            graphStateToCameraStateAdapter = useCaseCameraConfig.graphStateToCameraStateAdapter;
        }
        if ((i2 & 4) != 0) {
            sessionConfigAdapter = useCaseCameraConfig.sessionConfigAdapter;
        }
        if ((i2 & 8) != 0) {
            sessionProcessor = useCaseCameraConfig.sessionProcessor;
        }
        if ((i2 & 16) != 0) {
            fVar = useCaseCameraConfig.lazyGraphConfigBundle;
        }
        f fVar2 = fVar;
        SessionConfigAdapter sessionConfigAdapter2 = sessionConfigAdapter;
        return useCaseCameraConfig.copy(lVar, graphStateToCameraStateAdapter, sessionConfigAdapter2, sessionProcessor, fVar2);
    }

    public final UseCaseCameraConfig copy(l<? super CameraGraph.Config, ? extends CameraGraph> lVar, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, SessionConfigAdapter sessionConfigAdapter, SessionProcessor sessionProcessor, f<GraphConfigBundle> fVar) {
        x.f(lVar, "cameraGraphFactory");
        x.f(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        x.f(sessionConfigAdapter, "sessionConfigAdapter");
        x.f(fVar, "lazyGraphConfigBundle");
        return new UseCaseCameraConfig(lVar, graphStateToCameraStateAdapter, sessionConfigAdapter, sessionProcessor, fVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.camera.camera2.config.UseCaseCameraConfig");
        UseCaseCameraConfig useCaseCameraConfig = (UseCaseCameraConfig) obj;
        return x.n(this.sessionConfigAdapter, useCaseCameraConfig.sessionConfigAdapter) && x.n(this.graphStateToCameraStateAdapter, useCaseCameraConfig.graphStateToCameraStateAdapter) && x.n(this.sessionProcessor, useCaseCameraConfig.sessionProcessor);
    }

    public final CameraGraph.Config getCameraGraphConfig() {
        return this.lazyGraphConfigBundle.getValue().getGraphConfig();
    }

    public int hashCode() {
        int iHashCode = (this.sessionConfigAdapter.hashCode() * 31) + this.graphStateToCameraStateAdapter.hashCode();
        SessionProcessor sessionProcessor = this.sessionProcessor;
        return (iHashCode * 31) + (sessionProcessor != null ? sessionProcessor.hashCode() : 0);
    }

    @UseCaseCameraScope
    public final SessionConfigAdapter provideSessionConfigAdapter() {
        return this.sessionConfigAdapter;
    }

    @UseCaseCameraScope
    public final SessionProcessor provideSessionProcessor() {
        return this.sessionProcessor;
    }

    @UseCaseCameraScope
    public final UseCaseCameraContext provideUseCaseCameraContext(CameraStateAdapter cameraStateAdapter) {
        x.f(cameraStateAdapter, "cameraStateAdapter");
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Prepared UseCaseCameraContext (Deferred)");
        }
        return new UseCaseCameraContext(new a() { // from class: androidx.camera.camera2.config.UseCaseCameraConfig$$ExternalSyntheticLambda0
            @Override // g.a.a, f.a.a
            public final Object get() {
                UseCaseCameraConfig useCaseCameraConfig = this.f$0;
                return useCaseCameraConfig.cameraGraphFactory.invoke(useCaseCameraConfig.getCameraGraphConfig());
            }
        }, cameraStateAdapter, this.graphStateToCameraStateAdapter, new a() { // from class: androidx.camera.camera2.config.UseCaseCameraConfig$$ExternalSyntheticLambda1
            @Override // g.a.a, f.a.a
            public final Object get() {
                return this.f$0.lazyGraphConfigBundle.getValue().getStreamToSurfaceMap();
            }
        }, null, 16, null);
    }

    public String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.cameraGraphFactory + ", graphStateToCameraStateAdapter=" + this.graphStateToCameraStateAdapter + ", sessionConfigAdapter=" + this.sessionConfigAdapter + ", sessionProcessor=" + this.sessionProcessor + ", lazyGraphConfigBundle=" + this.lazyGraphConfigBundle + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final GraphConfigBundle create$lambda$0(SessionConfigAdapter sessionConfigAdapter, Integer num, CameraGraphConfigProvider cameraGraphConfigProvider, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter) {
            int sessionType;
            int iM537getNORMAL2uNL3no;
            SessionConfig validSessionConfigOrNull = sessionConfigAdapter.getValidSessionConfigOrNull();
            if (num != null) {
                iM537getNORMAL2uNL3no = CameraGraph.OperatingMode.Companion.m535getEXTENSION2uNL3no();
            } else if (validSessionConfigOrNull == null) {
                iM537getNORMAL2uNL3no = CameraGraph.OperatingMode.Companion.m537getNORMAL2uNL3no();
            } else if (validSessionConfigOrNull.getSessionType() == 1) {
                iM537getNORMAL2uNL3no = CameraGraph.OperatingMode.Companion.m536getHIGH_SPEED2uNL3no();
            } else {
                if (validSessionConfigOrNull.getSessionType() != 0) {
                    CameraGraph.OperatingMode.Companion companion = CameraGraph.OperatingMode.Companion;
                    sessionType = validSessionConfigOrNull.getSessionType();
                    companion.m534customEP6OhB0(sessionType);
                    return cameraGraphConfigProvider.m240create79VDu0o(sessionType, validSessionConfigOrNull, false, graphStateToCameraStateAdapter, num, sessionConfigAdapter.getSurfaceToStreamUseCaseMap(), sessionConfigAdapter.getSurfaceToStreamUseHintMap());
                }
                iM537getNORMAL2uNL3no = CameraGraph.OperatingMode.Companion.m537getNORMAL2uNL3no();
            }
            sessionType = iM537getNORMAL2uNL3no;
            return cameraGraphConfigProvider.m240create79VDu0o(sessionType, validSessionConfigOrNull, false, graphStateToCameraStateAdapter, num, sessionConfigAdapter.getSurfaceToStreamUseCaseMap(), sessionConfigAdapter.getSurfaceToStreamUseHintMap());
        }

        public final UseCaseCameraConfig create(final SessionConfigAdapter sessionConfigAdapter, final CameraGraphConfigProvider cameraGraphConfigProvider, l<? super CameraGraph.Config, ? extends CameraGraph> lVar, CameraStateAdapter cameraStateAdapter, SessionProcessor sessionProcessor, final Integer num) {
            x.f(sessionConfigAdapter, "sessionConfigAdapter");
            x.f(cameraGraphConfigProvider, "cameraGraphConfigProvider");
            x.f(lVar, "cameraGraphFactory");
            x.f(cameraStateAdapter, "cameraStateAdapter");
            final GraphStateToCameraStateAdapter graphStateToCameraStateAdapter = new GraphStateToCameraStateAdapter(cameraStateAdapter);
            return new UseCaseCameraConfig(lVar, graphStateToCameraStateAdapter, sessionConfigAdapter, sessionProcessor, g.a(new h.g.a.a() { // from class: androidx.camera.camera2.config.UseCaseCameraConfig$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return UseCaseCameraConfig.Companion.create$lambda$0(sessionConfigAdapter, num, cameraGraphConfigProvider, graphStateToCameraStateAdapter);
                }
            }));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
