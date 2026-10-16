package androidx.datastore.core;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CorruptionHandler<T> {
    Object handleCorruption(CorruptionException corruptionException, e<? super T> eVar);
}
