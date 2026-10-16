package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraGraph;
import h.a.r;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FrameGraph extends CameraGraphBase<Session>, CameraControls3A, UnsafeWrapper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEFAULT_FRAME_BUFFER_CAPACITY = 1;

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: captureWith---NP5ps$default, reason: not valid java name */
        public static /* synthetic */ FrameBuffer m679captureWithNP5ps$default(Companion companion, FrameGraph frameGraph, int i2, Map map, int i3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                map = r.j();
            }
            if ((i4 & 4) != 0) {
                i3 = 1;
            }
            return companion.m680captureWithNP5ps(frameGraph, i2, map, i3);
        }

        /* renamed from: captureWith---NP5ps, reason: not valid java name */
        public final FrameBuffer m680captureWithNP5ps(FrameGraph frameGraph, int i2, Map<Object, ? extends Object> map, int i3) {
            x.f(frameGraph, "$this$captureWith");
            x.f(map, "parameters");
            return frameGraph.captureWith(e.c.d.a.o(StreamId.m974boximpl(i2)), map, i3);
        }
    }

    /* compiled from: WazeSource */
    public final class ConcurrentConfig {
        private final CameraGraph.ConcurrentConfig cameraGraphConfigs;
        private final List<Config> frameGraphConfigs;

        public ConcurrentConfig(CameraGraph.ConcurrentConfig concurrentConfig, List<Config> list) {
            x.f(concurrentConfig, "cameraGraphConfigs");
            x.f(list, "frameGraphConfigs");
            this.cameraGraphConfigs = concurrentConfig;
            this.frameGraphConfigs = list;
            int size = concurrentConfig.getGraphConfigs().size();
            int size2 = concurrentConfig.getGraphConfigs().size();
            if (size2 != size) {
                throw new IllegalArgumentException("Invalid FrameGraph.ConcurrentConfig! Expected " + size + " configs, but received " + size2 + " FrameGraph.Config(s).");
            }
            for (Config config : list) {
                if (!this.cameraGraphConfigs.getGraphConfigs().contains(config.getCameraGraphConfig())) {
                    throw new IllegalArgumentException("Mismatched " + config + "! Config is not present within " + this.cameraGraphConfigs.getGraphConfigs());
                }
            }
        }

        public final CameraGraph.ConcurrentConfig getCameraGraphConfigs() {
            return this.cameraGraphConfigs;
        }

        public final List<Config> getFrameGraphConfigs() {
            return this.frameGraphConfigs;
        }
    }

    /* compiled from: WazeSource */
    public final class Config {
        private final CameraGraph.Config cameraGraphConfig;

        public Config(CameraGraph.Config config) {
            x.f(config, "cameraGraphConfig");
            this.cameraGraphConfig = config;
        }

        public final CameraGraph.Config getCameraGraphConfig() {
            return this.cameraGraphConfig;
        }
    }

    /* compiled from: WazeSource */
    public interface Session extends CameraGraph.Session {
    }

    FrameCapture capture(Request request);

    List<FrameCapture> capture(List<Request> list);

    FrameBuffer captureWith(Set<StreamId> set, Map<Object, ? extends Object> map, int i2);

    /* renamed from: drain-aKI5c8E, reason: not valid java name */
    void mo676drainaKI5c8E(int i2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.FrameGraph$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FrameBuffer captureWith$default(FrameGraph frameGraph, Set set, Map map, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureWith");
            }
            if ((i3 & 1) != 0) {
                set = e.c.d.a.p();
            }
            if ((i3 & 2) != 0) {
                map = r.j();
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return frameGraph.captureWith(set, map, i2);
        }

        /* renamed from: captureWith---NP5ps, reason: not valid java name */
        public static FrameBuffer m678captureWithNP5ps(FrameGraph frameGraph, int i2, Map<Object, ? extends Object> map, int i3) {
            return FrameGraph.Companion.m680captureWithNP5ps(frameGraph, i2, map, i3);
        }

        /* renamed from: $default$drain-aKI5c8E, reason: not valid java name */
        public static void m677$default$drainaKI5c8E(FrameGraph frameGraph, int i2) {
        }
    }
}
