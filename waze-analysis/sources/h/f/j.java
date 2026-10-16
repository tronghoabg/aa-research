package h.f;

import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final File f48085a;

    public j(File file) {
        x.f(file, "root");
        this.f48085a = file;
    }

    public abstract File a();

    public final File b() {
        return this.f48085a;
    }
}
