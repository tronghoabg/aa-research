package h.f;

import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    private boolean f48078a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(File file) {
        super(file);
        x.f(file, "rootFile");
    }

    @Override // h.f.j
    public final File a() {
        if (this.f48078a) {
            return null;
        }
        this.f48078a = true;
        return b();
    }
}
