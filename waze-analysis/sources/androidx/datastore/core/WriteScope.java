package androidx.datastore.core;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface WriteScope<T> extends ReadScope<T> {
    Object writeData(T t, e<? super ab> eVar);
}
