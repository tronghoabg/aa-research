package androidx.camera.camera2.pipe.graph;

import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.u;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class GraphLoop$processingQueue$2 extends u implements p<List<GraphCommand>, e<? super ab>, Object> {
    GraphLoop$processingQueue$2(Object obj) {
        super(2, obj, GraphLoop.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.p
    public final Object invoke(List<GraphCommand> list, e<? super ab> eVar) {
        return ((GraphLoop) this.receiver).process(list, eVar);
    }
}
