package androidx.datastore.core.util;

import h.c.j;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreScopeUtilKt {
    public static final j getContextFromScope(af afVar) {
        x.f(afVar, "scope");
        return afVar.getCoroutineContext().get(br.f51766a) == null ? afVar.getCoroutineContext().plus(o.i()) : afVar.getCoroutineContext();
    }
}
