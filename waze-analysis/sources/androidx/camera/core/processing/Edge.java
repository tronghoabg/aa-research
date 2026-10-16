package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(T t) {
        x.d(this.mListener, "Listener is not set.");
        this.mListener.accept(t);
    }

    public void setListener(Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
