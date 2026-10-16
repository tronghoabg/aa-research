package androidx.camera.camera2.pipe;

import h.g.b.o;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphId {
    public static final Companion Companion = new Companion(null);
    private static final b cameraGraphIds = h.e.b.f(0);
    private final String name;

    private CameraGraphId(String str) {
        this.name = str;
    }

    public static final CameraGraphId nextId(boolean z) {
        return Companion.nextId(z);
    }

    public String toString() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CameraGraphId nextId(boolean z) {
            o oVar = null;
            if (z) {
                return new CameraGraphId("FrameGraph-" + CameraGraphId.cameraGraphIds.e(), oVar);
            }
            return new CameraGraphId("CameraGraph-" + CameraGraphId.cameraGraphIds.e(), oVar);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ CameraGraphId(String str, o oVar) {
        this(str);
    }
}
