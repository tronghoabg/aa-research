package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ReThrowCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, e<? super T> eVar) throws CorruptionException {
        throw corruptionException;
    }
}
