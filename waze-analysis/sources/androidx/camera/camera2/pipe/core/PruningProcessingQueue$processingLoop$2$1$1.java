package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.a.u;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.aq;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.a.t;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PruningProcessingQueue$processingLoop$2$1$1<T> extends g implements p<T, e<? super ab>, Object> {
    final /* synthetic */ aq<T> $currentElement;
    final /* synthetic */ aq<CompletableDeferred<ab>> $currentElementAborted;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PruningProcessingQueue<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningProcessingQueue$processingLoop$2$1$1(PruningProcessingQueue<T> pruningProcessingQueue, aq<T> aqVar, aq<CompletableDeferred<ab>> aqVar2, e<? super PruningProcessingQueue$processingLoop$2$1$1> eVar) {
        super(2, eVar);
        this.this$0 = pruningProcessingQueue;
        this.$currentElement = aqVar;
        this.$currentElementAborted = aqVar2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        PruningProcessingQueue$processingLoop$2$1$1 pruningProcessingQueue$processingLoop$2$1$1 = new PruningProcessingQueue$processingLoop$2$1$1(this.this$0, this.$currentElement, this.$currentElementAborted, eVar);
        pruningProcessingQueue$processingLoop$2$1$1.L$0 = obj;
        return pruningProcessingQueue$processingLoop$2$1$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(T t, e<? super ab> eVar) {
        return ((PruningProcessingQueue$processingLoop$2$1$1) create(t, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PruningProcessingQueue<T> pruningProcessingQueue;
        CompletableDeferred completableDeferred;
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        ((PruningProcessingQueue) this.this$0).queue.add(this.L$0);
        Object objH = ((PruningProcessingQueue) this.this$0).channel.h();
        while (true) {
            boolean zG = t.g(objH);
            pruningProcessingQueue = this.this$0;
            if (!zG) {
                break;
            }
            u uVar = ((PruningProcessingQueue) pruningProcessingQueue).queue;
            t.h(objH);
            uVar.add(objH);
            objH = ((PruningProcessingQueue) this.this$0).channel.h();
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            u uVar2 = ((PruningProcessingQueue) pruningProcessingQueue).queue;
            Objects.toString(uVar2);
            android.util.Log.d(Log.TAG, "PruningProcessingQueue: Pruning ".concat(String.valueOf(uVar2)));
        }
        PruningProcessingQueue<T> pruningProcessingQueue2 = this.this$0;
        if (((Boolean) ((PruningProcessingQueue) pruningProcessingQueue2).prune.invoke(((PruningProcessingQueue) pruningProcessingQueue2).queue, this.$currentElement.f48105a)).booleanValue() && (completableDeferred = (CompletableDeferred) this.$currentElementAborted.f48105a) != null) {
            completableDeferred.a(ab.f48028a);
        }
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super ab> eVar) {
        return invoke2((PruningProcessingQueue$processingLoop$2$1$1<T>) obj, eVar);
    }
}
