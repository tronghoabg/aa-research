package androidx.compose.runtime;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SnapshotStateKt__ProduceStateKt$produceState$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ p<ProduceStateScope, e<? super ab>, Object> $producer;
    final /* synthetic */ MutableState $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__ProduceStateKt$produceState$3$1(p<? super ProduceStateScope, ? super e<? super ab>, ? extends Object> pVar, MutableState mutableState, e<? super SnapshotStateKt__ProduceStateKt$produceState$3$1> eVar) {
        super(2, eVar);
        this.$producer = pVar;
        this.$result = mutableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SnapshotStateKt__ProduceStateKt$produceState$3$1 snapshotStateKt__ProduceStateKt$produceState$3$1 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(this.$producer, this.$result, eVar);
        snapshotStateKt__ProduceStateKt$produceState$3$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$3$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            af afVar = (af) this.L$0;
            p<ProduceStateScope, e<? super ab>, Object> pVar = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, afVar.getCoroutineContext());
            this.label = 1;
            if (pVar.invoke(produceStateScopeImpl, this) == aVar) {
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
