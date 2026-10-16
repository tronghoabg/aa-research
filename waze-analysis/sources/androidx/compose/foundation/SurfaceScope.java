package androidx.compose.foundation;

import android.view.Surface;
import h.ab;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SurfaceScope {
    void onChanged(Surface surface, q<? super Surface, ? super Integer, ? super Integer, ab> qVar);

    void onDestroyed(Surface surface, l<? super Surface, ab> lVar);
}
