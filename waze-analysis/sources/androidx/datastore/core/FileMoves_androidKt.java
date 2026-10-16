package androidx.datastore.core;

import h.g.b.x;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FileMoves_androidKt {
    public static final void atomicMoveTo(File file, File file2) throws IOException {
        x.f(file, "<this>");
        x.f(file2, "toFile");
        Api26Impl.INSTANCE.move(file, file2);
    }
}
