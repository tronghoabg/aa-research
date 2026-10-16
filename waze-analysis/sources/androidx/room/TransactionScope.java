package androidx.room;

import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface TransactionScope<T> extends PooledConnection {
    Object rollback(T t, e<?> eVar);

    <R> Object withNestedTransaction(p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar);
}
