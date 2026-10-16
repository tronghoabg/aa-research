package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.graph.GraphProcessor;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphParametersImpl_Factory implements c<CameraGraphParametersImpl> {
    private final e<GraphProcessor> graphProcessorProvider;
    private final e<af> graphScopeProvider;
    private final e<GraphSessionLock> sessionLockProvider;

    private CameraGraphParametersImpl_Factory(e<GraphSessionLock> eVar, e<GraphProcessor> eVar2, e<af> eVar3) {
        this.sessionLockProvider = eVar;
        this.graphProcessorProvider = eVar2;
        this.graphScopeProvider = eVar3;
    }

    public static CameraGraphParametersImpl_Factory create(e<GraphSessionLock> eVar, e<GraphProcessor> eVar2, e<af> eVar3) {
        return new CameraGraphParametersImpl_Factory(eVar, eVar2, eVar3);
    }

    public static CameraGraphParametersImpl newInstance(GraphSessionLock graphSessionLock, GraphProcessor graphProcessor, af afVar) {
        return new CameraGraphParametersImpl(graphSessionLock, graphProcessor, afVar);
    }

    @Override // g.a.a, f.a.a
    public CameraGraphParametersImpl get() {
        return newInstance(this.sessionLockProvider.get(), this.graphProcessorProvider.get(), this.graphScopeProvider.get());
    }
}
