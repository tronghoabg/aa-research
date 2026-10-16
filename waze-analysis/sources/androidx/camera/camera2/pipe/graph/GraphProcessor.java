package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.Request;
import h.a.i;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface GraphProcessor {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.GraphProcessor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateGraphParameters$default(GraphProcessor graphProcessor, Map map, List list, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateGraphParameters");
            }
            if ((i2 & 2) != 0) {
                list = i.h();
            }
            graphProcessor.updateGraphParameters(map, list);
        }
    }

    void abort();

    void close();

    ch<GraphState> getGraphState();

    Request getRepeatingRequest();

    void invalidate();

    void setRepeatingRequest(Request request);

    boolean submit(Request request);

    boolean submit(List<Request> list);

    boolean trigger(Map<?, ? extends Object> map);

    void update3AParameters(Map<?, ? extends Object> map);

    void updateGraphParameters(Map<?, ? extends Object> map, List<? extends Request.Listener> list);

    void updateRequestListeners(List<? extends Request.Listener> list);
}
