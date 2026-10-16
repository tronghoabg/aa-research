package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.aq;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PruningProcessingQueue$processingLoop$2$1$2 extends g implements p<ab, e<? super ab>, Object> {
    final /* synthetic */ aq<T> $currentElement;
    final /* synthetic */ aq<CompletableDeferred<ab>> $currentElementAborted;
    final /* synthetic */ aq<am<ab>> $processDeferred;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningProcessingQueue$processingLoop$2$1$2(aq<T> aqVar, aq<CompletableDeferred<ab>> aqVar2, aq<am<ab>> aqVar3, e<? super PruningProcessingQueue$processingLoop$2$1$2> eVar) {
        super(2, eVar);
        this.$currentElement = aqVar;
        this.$currentElementAborted = aqVar2;
        this.$processDeferred = aqVar3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new PruningProcessingQueue$processingLoop$2$1$2(this.$currentElement, this.$currentElementAborted, this.$processDeferred, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(ab abVar, e<? super ab> eVar) {
        return ((PruningProcessingQueue$processingLoop$2$1$2) create(abVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$currentElement.f48105a = null;
        this.$currentElementAborted.f48105a = null;
        this.$processDeferred.f48105a = null;
        return ab.f48028a;
    }
}
