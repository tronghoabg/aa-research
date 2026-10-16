package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PruningProcessingQueue$processingLoop$2$deferred$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ T $element;
    final /* synthetic */ CompletableDeferred<ab> $elementAborted;
    int label;
    final /* synthetic */ PruningProcessingQueue<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningProcessingQueue$processingLoop$2$deferred$1(PruningProcessingQueue<T> pruningProcessingQueue, T t, CompletableDeferred<ab> completableDeferred, e<? super PruningProcessingQueue$processingLoop$2$deferred$1> eVar) {
        super(2, eVar);
        this.this$0 = pruningProcessingQueue;
        this.$element = t;
        this.$elementAborted = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new PruningProcessingQueue$processingLoop$2$deferred$1(this.this$0, this.$element, this.$elementAborted, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((PruningProcessingQueue$processingLoop$2$deferred$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            T t = this.$element;
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                Objects.toString(t);
                android.util.Log.d(Log.TAG, "PruningProcessingQueue: Processing ".concat(String.valueOf(t)));
            }
            PruningProcessingQueue<T> pruningProcessingQueue = this.this$0;
            T t2 = this.$element;
            CompletableDeferred<ab> completableDeferred = this.$elementAborted;
            q qVar = ((PruningProcessingQueue) pruningProcessingQueue).process;
            this.label = 1;
            if (qVar.invoke(t2, completableDeferred, this) == aVar) {
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
