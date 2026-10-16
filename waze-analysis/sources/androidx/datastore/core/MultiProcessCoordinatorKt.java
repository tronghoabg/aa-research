package androidx.datastore.core;

import h.c.j;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(j jVar, File file) {
        x.f(jVar, "context");
        x.f(file, "file");
        return new MultiProcessCoordinator(jVar, file);
    }
}
