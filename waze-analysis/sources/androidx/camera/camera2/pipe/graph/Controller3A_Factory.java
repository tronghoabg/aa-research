package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Controller3A_Factory implements c<Controller3A> {
    private final e<Listener3A> graphListener3AProvider;
    private final e<GraphProcessor> graphProcessorProvider;
    private final e<GraphState3A> graphState3AProvider;
    private final e<CameraMetadata> metadataProvider;

    private Controller3A_Factory(e<GraphProcessor> eVar, e<CameraMetadata> eVar2, e<GraphState3A> eVar3, e<Listener3A> eVar4) {
        this.graphProcessorProvider = eVar;
        this.metadataProvider = eVar2;
        this.graphState3AProvider = eVar3;
        this.graphListener3AProvider = eVar4;
    }

    public static Controller3A_Factory create(e<GraphProcessor> eVar, e<CameraMetadata> eVar2, e<GraphState3A> eVar3, e<Listener3A> eVar4) {
        return new Controller3A_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static Controller3A newInstance(GraphProcessor graphProcessor, CameraMetadata cameraMetadata, GraphState3A graphState3A, Listener3A listener3A) {
        return new Controller3A(graphProcessor, cameraMetadata, graphState3A, listener3A);
    }

    @Override // g.a.a, f.a.a
    public Controller3A get() {
        return newInstance(this.graphProcessorProvider.get(), this.metadataProvider.get(), this.graphState3AProvider.get(), this.graphListener3AProvider.get());
    }
}
