package androidx.camera.camera2.pipe.graph;

import h.ab;
import h.g.a.l;
import h.g.b.u;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class GraphLoop$processingQueue$1 extends u implements l<List<? extends GraphCommand>, ab> {
    GraphLoop$processingQueue$1(Object obj) {
        super(1, obj, GraphLoop.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends GraphCommand> list) {
        x.f(list, "p0");
        ((GraphLoop) this.receiver).finalizeUnprocessedCommands(list);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(List<? extends GraphCommand> list) {
        invoke2(list);
        return ab.f48028a;
    }
}
