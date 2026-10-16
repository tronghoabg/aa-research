package h.c.b.a;

import h.c.j;
import h.c.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class e extends a {
    public e(h.c.e<Object> eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != k.f48060a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // h.c.e
    public j getContext() {
        return k.f48060a;
    }
}
