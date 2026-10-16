package androidx.datastore.core;

import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface InterProcessCoordinator {
    k<ab> getUpdateNotifications();

    Object getVersion(e<? super Integer> eVar);

    Object incrementAndGetVersion(e<? super Integer> eVar);

    <T> Object lock(l<? super e<? super T>, ? extends Object> lVar, e<? super T> eVar);

    <T> Object tryLock(p<? super Boolean, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar);
}
