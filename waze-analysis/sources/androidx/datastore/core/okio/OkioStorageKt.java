package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import h.g.b.x;
import k.ab;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(ab abVar) {
        x.f(abVar, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(abVar.h().toString());
    }
}
