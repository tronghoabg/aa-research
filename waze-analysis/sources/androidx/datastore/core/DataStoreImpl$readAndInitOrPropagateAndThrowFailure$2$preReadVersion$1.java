package androidx.datastore.core;

import androidx.tracing.PropagationToken;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1 extends g implements p<af, e<? super Integer>, Object> {
    final /* synthetic */ PropagationToken $readAndInitOrPropagateAndThrowFailureToken;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements l<e<? super Integer>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T> dataStoreImpl, e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super Integer> eVar) {
            return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
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
            Object version = this.this$0.getCoordinator().getVersion(this);
            return version == aVar ? aVar : version;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1(DataStoreImpl<T> dataStoreImpl, PropagationToken propagationToken, e<? super DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
        this.$readAndInitOrPropagateAndThrowFailureToken = propagationToken;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1(this.this$0, this.$readAndInitOrPropagateAndThrowFailureToken, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super Integer> eVar) {
        return ((DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
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
        DataStoreImpl<T> dataStoreImpl = this.this$0;
        PropagationToken propagationToken = this.$readAndInitOrPropagateAndThrowFailureToken;
        this.label = 1;
        Object objTrace = DataStoreTracer_androidKt.trace(((DataStoreImpl) dataStoreImpl).tracer, "DataStore.getCoordinatorVersion", propagationToken, new AnonymousClass1(dataStoreImpl, null), this);
        return objTrace == aVar ? aVar : objTrace;
    }
}
