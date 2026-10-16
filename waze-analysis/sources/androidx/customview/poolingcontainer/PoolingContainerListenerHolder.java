package androidx.customview.poolingcontainer;

import h.a.i;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener poolingContainerListener) {
        x.f(poolingContainerListener, "listener");
        this.listeners.add(poolingContainerListener);
    }

    public final void onRelease() {
        for (int iE = i.e(this.listeners); iE >= 0; iE--) {
            this.listeners.get(iE).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener poolingContainerListener) {
        x.f(poolingContainerListener, "listener");
        this.listeners.remove(poolingContainerListener);
    }
}
