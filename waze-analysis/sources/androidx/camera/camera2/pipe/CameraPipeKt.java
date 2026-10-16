package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraPipe;
import h.g.b.x;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeKt {
    private static final b cameraPipeIds = h.e.b.f(0);

    public static final CameraPipe CameraPipe(CameraPipe.Config config) {
        x.f(config, "config");
        return CameraPipe.Companion.create(config);
    }

    public static final b getCameraPipeIds() {
        return cameraPipeIds;
    }
}
