package androidx.compose.runtime;

import h.ab;
import h.c.e;
import h.g.a.a;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, af {
    Object awaitDispose(a<ab> aVar, e<?> eVar);
}
