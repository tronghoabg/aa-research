package androidx.datastore.core;

import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.h.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(a aVar, Object obj, l<? super Boolean, ? extends R> lVar) {
        x.f(aVar, "<this>");
        x.f(lVar, "block");
        boolean zTryLock = aVar.tryLock(obj);
        try {
            R rInvoke = lVar.invoke(Boolean.valueOf(zTryLock));
            if (zTryLock) {
                aVar.unlock(obj);
            }
            return rInvoke;
        } catch (Throwable th) {
            if (zTryLock) {
                aVar.unlock(obj);
            }
            throw th;
        }
    }

    public static /* synthetic */ Object withTryLock$default(a aVar, Object obj, l lVar, int i2, Object obj2) {
        x.f(aVar, "<this>");
        x.f(lVar, "block");
        if (1 == (i2 & 1)) {
            obj = null;
        }
        boolean zTryLock = aVar.tryLock(obj);
        try {
            Object objInvoke = lVar.invoke(Boolean.valueOf(zTryLock));
            if (zTryLock) {
                aVar.unlock(obj);
            }
            return objInvoke;
        } catch (Throwable th) {
            if (zTryLock) {
                aVar.unlock(obj);
            }
            throw th;
        }
    }
}
