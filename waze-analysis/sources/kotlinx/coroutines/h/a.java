package kotlinx.coroutines.h;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface a {
    kotlinx.coroutines.g.f<Object, a> getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, h.c.e<? super ab> eVar);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
