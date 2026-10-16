package androidx.datastore.core;

import androidx.datastore.core.Message;
import androidx.tracing.PropagationToken;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.i;
import kotlinx.coroutines.af;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$handleUpdate$2$1$1<T> extends g implements p<af, e<? super T>, Object> {
    final /* synthetic */ PropagationToken $handleUpdateToken;
    final /* synthetic */ DataStoreImpl<T> $this_runCatching;
    final /* synthetic */ Message.Update<T> $update;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$handleUpdate$2$1$1(DataStoreImpl<T> dataStoreImpl, Message.Update<T> update, PropagationToken propagationToken, e<? super DataStoreImpl$handleUpdate$2$1$1> eVar) {
        super(2, eVar);
        this.$this_runCatching = dataStoreImpl;
        this.$update = update;
        this.$handleUpdateToken = propagationToken;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DataStoreImpl$handleUpdate$2$1$1(this.$this_runCatching, this.$update, this.$handleUpdateToken, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super T> eVar) {
        return ((DataStoreImpl$handleUpdate$2$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                obj2 = this.L$0;
            } else if (i2 == 2) {
                c.b(obj);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        State<T> currentState = ((DataStoreImpl) this.$this_runCatching).inMemoryCache.getCurrentState();
        if (currentState instanceof Data) {
            DataStoreImpl<T> dataStoreImpl = this.$this_runCatching;
            Message.Update<T> update = this.$update;
            PropagationToken propagationToken = this.$handleUpdateToken;
            this.L$0 = null;
            this.label = 1;
            Object objTransformAndWrite = dataStoreImpl.transformAndWrite(update.getTransform(), update.getCallerContext(), propagationToken, this);
            if (objTransformAndWrite != aVar) {
                return objTransformAndWrite;
            }
        } else {
            if (!(currentState instanceof ReadException) && !(currentState instanceof UnInitialized)) {
                if (currentState instanceof Final) {
                    throw ((Final) currentState).getFinalException();
                }
                if (currentState instanceof NoValueDataState) {
                    throw new IllegalStateException(DataStoreImpl.BUG_MESSAGE);
                }
                throw new i();
            }
            if (currentState != this.$update.getLastState()) {
                throw ((ReadException) currentState).getReadException();
            }
            this.L$0 = null;
            this.label = 2;
            if (this.$this_runCatching.readAndInitOrPropagateAndThrowFailure(this.$handleUpdateToken, this) != aVar) {
            }
        }
        DataStoreImpl<T> dataStoreImpl2 = this.$this_runCatching;
        Message.Update<T> update2 = this.$update;
        PropagationToken propagationToken2 = this.$handleUpdateToken;
        this.L$0 = null;
        this.label = 3;
        Object objTransformAndWrite2 = dataStoreImpl2.transformAndWrite(update2.getTransform(), update2.getCallerContext(), propagationToken2, this);
        return objTransformAndWrite2 == aVar ? aVar : objTransformAndWrite2;
    }
}
