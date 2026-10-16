package androidx.work.impl;

import androidx.work.impl.WorkerWrapper;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class WorkerWrapper$launch$1$resolution$1 extends g implements p<af, e<? super WorkerWrapper.Resolution>, Object> {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$launch$1$resolution$1(WorkerWrapper workerWrapper, e<? super WorkerWrapper$launch$1$resolution$1> eVar) {
        super(2, eVar);
        this.this$0 = workerWrapper;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new WorkerWrapper$launch$1$resolution$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super WorkerWrapper.Resolution> eVar) {
        return ((WorkerWrapper$launch$1$resolution$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        this.label = 1;
        Object objRunWorker = this.this$0.runWorker(this);
        return objRunWorker == aVar ? aVar : objRunWorker;
    }
}
