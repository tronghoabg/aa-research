package androidx.datastore.core;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InterProcessCoordinatorKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(String str) {
        x.f(str, "filePath");
        return new SingleProcessCoordinator(str);
    }
}
