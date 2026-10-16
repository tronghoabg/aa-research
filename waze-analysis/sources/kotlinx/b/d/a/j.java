package kotlinx.b.d.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends i {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, boolean z) {
        super(vVar);
        h.g.b.x.f(vVar, "writer");
        this.f51164b = z;
    }

    @Override // kotlinx.b.d.a.i
    public final void j(String str) throws IOException {
        h.g.b.x.f(str, "value");
        if (this.f51164b) {
            super.j(str);
        } else {
            super.h(str);
        }
    }
}
