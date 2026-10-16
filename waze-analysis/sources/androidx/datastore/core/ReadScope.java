package androidx.datastore.core;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ReadScope<T> extends Closeable {
    Object readData(e<? super T> eVar);
}
