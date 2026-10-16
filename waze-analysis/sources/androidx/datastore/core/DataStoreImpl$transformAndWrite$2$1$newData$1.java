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

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$transformAndWrite$2$1$newData$1<T> extends g implements p<af, e<? super T>, Object> {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ p<T, e<? super T>, Object> $transform;
    final /* synthetic */ PropagationToken $transformAndWriteToken;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2$1$newData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements l<e<? super T>, Object> {
        final /* synthetic */ Data<T> $curData;
        final /* synthetic */ p<T, e<? super T>, Object> $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super T, ? super e<? super T>, ? extends Object> pVar, Data<T> data, e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.$transform = pVar;
            this.$curData = data;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass1(this.$transform, this.$curData, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super T> eVar) {
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
            p<T, e<? super T>, Object> pVar = this.$transform;
            T value = this.$curData.getValue();
            this.label = 1;
            Object objInvoke = pVar.invoke(value, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$transformAndWrite$2$1$newData$1(DataStoreImpl<T> dataStoreImpl, PropagationToken propagationToken, p<? super T, ? super e<? super T>, ? extends Object> pVar, Data<T> data, e<? super DataStoreImpl$transformAndWrite$2$1$newData$1> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
        this.$transformAndWriteToken = propagationToken;
        this.$transform = pVar;
        this.$curData = data;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DataStoreImpl$transformAndWrite$2$1$newData$1(this.this$0, this.$transformAndWriteToken, this.$transform, this.$curData, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super T> eVar) {
        return ((DataStoreImpl$transformAndWrite$2$1$newData$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        PropagationToken propagationToken = this.$transformAndWriteToken;
        p<T, e<? super T>, Object> pVar = this.$transform;
        Data<T> data = this.$curData;
        this.label = 1;
        Object objTrace = DataStoreTracer_androidKt.trace(((DataStoreImpl) dataStoreImpl).tracer, "DataStore.transform", propagationToken, new AnonymousClass1(pVar, data, null), this);
        return objTrace == aVar ? aVar : objTrace;
    }
}
