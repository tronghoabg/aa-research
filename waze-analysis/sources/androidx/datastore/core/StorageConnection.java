package androidx.datastore.core;

import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(q<? super ReadScope<T>, ? super Boolean, ? super e<? super R>, ? extends Object> qVar, e<? super R> eVar);

    Object writeScope(p<? super WriteScope<T>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);
}
