package androidx.datastore.core;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface DataMigration<T> {
    Object cleanUp(e<? super ab> eVar);

    Object migrate(T t, e<? super T> eVar);

    Object shouldMigrate(T t, e<? super Boolean> eVar);
}
