package androidx.compose.foundation;

import android.view.Surface;
import h.ab;
import h.c.j;
import h.g.a.l;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, af {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ af $$delegate_1;

    BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, af afVar) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = afVar;
    }

    @Override // kotlinx.coroutines.af
    public j getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, q<? super Surface, ? super Integer, ? super Integer, ab> qVar) {
        this.$$delegate_0.onChanged(surface, qVar);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, l<? super Surface, ab> lVar) {
        this.$$delegate_0.onDestroyed(surface, lVar);
    }
}
