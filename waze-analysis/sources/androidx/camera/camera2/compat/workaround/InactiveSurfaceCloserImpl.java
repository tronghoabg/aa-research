package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.impl.DeferrableSurface;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InactiveSurfaceCloserImpl implements InactiveSurfaceCloser {
    private final Object lock = new Object();
    private final List<ConfiguredOutput> configuredOutputs = new ArrayList();

    private final void closeIfConfigured(List<ConfiguredOutput> list, DeferrableSurface deferrableSurface) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ConfiguredOutput) it.next()).contains(deferrableSurface)) {
                deferrableSurface.close();
            }
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public void closeAll() {
        synchronized (this.lock) {
            Iterator<T> it = this.configuredOutputs.iterator();
            while (it.hasNext()) {
                ((ConfiguredOutput) it.next()).close();
            }
            this.configuredOutputs.clear();
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    /* renamed from: configure-hB7JTeY */
    public void mo225configurehB7JTeY(int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph) {
        x.f(deferrableSurface, "deferrableSurface");
        x.f(cameraGraph, "graph");
        synchronized (this.lock) {
            this.configuredOutputs.add(new ConfiguredOutput(i2, deferrableSurface, cameraGraph, null));
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public void onSurfaceInactive(DeferrableSurface deferrableSurface) {
        x.f(deferrableSurface, "deferrableSurface");
        synchronized (this.lock) {
            closeIfConfigured(this.configuredOutputs, deferrableSurface);
        }
    }

    /* compiled from: WazeSource */
    public final class ConfiguredOutput {
        private final DeferrableSurface deferrableSurface;
        private final CameraGraph graph;
        private final int streamId;

        private ConfiguredOutput(int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph) {
            x.f(deferrableSurface, "deferrableSurface");
            x.f(cameraGraph, "graph");
            this.streamId = i2;
            this.deferrableSurface = deferrableSurface;
            this.graph = cameraGraph;
        }

        /* renamed from: copy-hB7JTeY$default, reason: not valid java name */
        public static /* synthetic */ ConfiguredOutput m226copyhB7JTeY$default(ConfiguredOutput configuredOutput, int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = configuredOutput.streamId;
            }
            if ((i3 & 2) != 0) {
                deferrableSurface = configuredOutput.deferrableSurface;
            }
            if ((i3 & 4) != 0) {
                cameraGraph = configuredOutput.graph;
            }
            return configuredOutput.m228copyhB7JTeY(i2, deferrableSurface, cameraGraph);
        }

        public final void close() {
            this.graph.mo543setSurfaceNYG5g8E(this.streamId, null);
            this.deferrableSurface.close();
        }

        /* renamed from: component1-ptHMqGs, reason: not valid java name */
        public final int m227component1ptHMqGs() {
            return this.streamId;
        }

        public final DeferrableSurface component2() {
            return this.deferrableSurface;
        }

        public final CameraGraph component3() {
            return this.graph;
        }

        public final boolean contains(DeferrableSurface deferrableSurface) {
            x.f(deferrableSurface, "deferrableSurface");
            return x.n(this.deferrableSurface, deferrableSurface);
        }

        /* renamed from: copy-hB7JTeY, reason: not valid java name */
        public final ConfiguredOutput m228copyhB7JTeY(int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph) {
            x.f(deferrableSurface, "deferrableSurface");
            x.f(cameraGraph, "graph");
            return new ConfiguredOutput(i2, deferrableSurface, cameraGraph, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfiguredOutput)) {
                return false;
            }
            ConfiguredOutput configuredOutput = (ConfiguredOutput) obj;
            return StreamId.m977equalsimpl0(this.streamId, configuredOutput.streamId) && x.n(this.deferrableSurface, configuredOutput.deferrableSurface) && x.n(this.graph, configuredOutput.graph);
        }

        public final DeferrableSurface getDeferrableSurface() {
            return this.deferrableSurface;
        }

        public final CameraGraph getGraph() {
            return this.graph;
        }

        /* renamed from: getStreamId-ptHMqGs, reason: not valid java name */
        public final int m229getStreamIdptHMqGs() {
            return this.streamId;
        }

        public int hashCode() {
            return (((this.streamId * 31) + this.deferrableSurface.hashCode()) * 31) + this.graph.hashCode();
        }

        public String toString() {
            return "ConfiguredOutput(streamId=" + StreamId.m979toStringimpl(this.streamId) + ", deferrableSurface=" + this.deferrableSurface + ", graph=" + this.graph + ")";
        }

        public /* synthetic */ ConfiguredOutput(int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph, o oVar) {
            this(i2, deferrableSurface, cameraGraph);
        }
    }
}
