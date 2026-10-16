package androidx.camera.camera2.pipe.graph;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class GraphLoop$close$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ GraphRequestProcessor $processor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphLoop$close$1$1$1(GraphRequestProcessor graphRequestProcessor, e<? super GraphLoop$close$1$1$1> eVar) {
        super(2, eVar);
        this.$processor = graphRequestProcessor;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new GraphLoop$close$1$1$1(this.$processor, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((GraphLoop$close$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$processor.shutdown$camera_camera2_pipe(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
