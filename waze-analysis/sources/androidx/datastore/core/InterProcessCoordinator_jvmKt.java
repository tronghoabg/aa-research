package androidx.datastore.core;

import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        x.f(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        x.e(absolutePath, "getAbsolutePath(...)");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
