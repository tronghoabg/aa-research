package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.Request;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphParameters {
    private final List<Request.Listener> listeners;
    private final Map<?, Object> parameters;

    public /* synthetic */ GraphParameters(Map map, List list, int i2, o oVar) {
        this((i2 & 1) != 0 ? r.j() : map, (i2 & 2) != 0 ? i.h() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphParameters copy$default(GraphParameters graphParameters, Map map, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = graphParameters.parameters;
        }
        if ((i2 & 2) != 0) {
            list = graphParameters.listeners;
        }
        return graphParameters.copy(map, list);
    }

    public final Map<?, Object> component1() {
        return this.parameters;
    }

    public final List<Request.Listener> component2() {
        return this.listeners;
    }

    public final GraphParameters copy(Map<?, ? extends Object> map, List<? extends Request.Listener> list) {
        x.f(map, "parameters");
        x.f(list, "listeners");
        return new GraphParameters(map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphParameters)) {
            return false;
        }
        GraphParameters graphParameters = (GraphParameters) obj;
        return x.n(this.parameters, graphParameters.parameters) && x.n(this.listeners, graphParameters.listeners);
    }

    public final List<Request.Listener> getListeners() {
        return this.listeners;
    }

    public final Map<?, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return (this.parameters.hashCode() * 31) + this.listeners.hashCode();
    }

    public String toString() {
        return "GraphParameters(parameters=" + this.parameters + ", listeners=" + this.listeners + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphParameters(Map<?, ? extends Object> map, List<? extends Request.Listener> list) {
        x.f(map, "parameters");
        x.f(list, "listeners");
        this.parameters = map;
        this.listeners = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphParameters() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
