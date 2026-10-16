package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.graph.GraphProcessor;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphRequestListenersImpl_Factory implements c<CameraGraphRequestListenersImpl> {
    private final e<GraphProcessor> graphProcessorProvider;
    private final e<af> graphScopeProvider;
    private final e<GraphSessionLock> sessionLockProvider;

    private CameraGraphRequestListenersImpl_Factory(e<GraphSessionLock> eVar, e<GraphProcessor> eVar2, e<af> eVar3) {
        this.sessionLockProvider = eVar;
        this.graphProcessorProvider = eVar2;
        this.graphScopeProvider = eVar3;
    }

    public static CameraGraphRequestListenersImpl_Factory create(e<GraphSessionLock> eVar, e<GraphProcessor> eVar2, e<af> eVar3) {
        return new CameraGraphRequestListenersImpl_Factory(eVar, eVar2, eVar3);
    }

    public static CameraGraphRequestListenersImpl newInstance(GraphSessionLock graphSessionLock, GraphProcessor graphProcessor, af afVar) {
        return new CameraGraphRequestListenersImpl(graphSessionLock, graphProcessor, afVar);
    }

    @Override // g.a.a, f.a.a
    public CameraGraphRequestListenersImpl get() {
        return newInstance(this.sessionLockProvider.get(), this.graphProcessorProvider.get(), this.graphScopeProvider.get());
    }
}
