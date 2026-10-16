package androidx.window.java.core;

import androidx.core.util.Consumer;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class CallbackToFlowAdapter$connect$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Consumer $consumer;
    final /* synthetic */ k $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CallbackToFlowAdapter$connect$1$1(k kVar, Consumer consumer, e<? super CallbackToFlowAdapter$connect$1$1> eVar) {
        super(2, eVar);
        this.$flow = kVar;
        this.$consumer = consumer;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CallbackToFlowAdapter$connect$1$1(this.$flow, this.$consumer, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CallbackToFlowAdapter$connect$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            k kVar = this.$flow;
            final Consumer consumer = this.$consumer;
            this.label = 1;
            if (kVar.collect(new l() { // from class: androidx.window.java.core.CallbackToFlowAdapter$connect$1$1.1
                @Override // kotlinx.coroutines.b.l
                public final Object emit(T t, e<? super ab> eVar) {
                    consumer.accept(t);
                    return ab.f48028a;
                }
            }, this) == aVar) {
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
