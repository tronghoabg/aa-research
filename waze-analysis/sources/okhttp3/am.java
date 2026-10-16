package okhttp3;

import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class am extends ao {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f55892a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ File f55893b;

    am(ae aeVar, File file) {
        this.f55892a = aeVar;
        this.f55893b = file;
    }

    @Override // okhttp3.ao
    public final long a() {
        return this.f55893b.length();
    }

    @Override // okhttp3.ao
    public final ae b() {
        return this.f55892a;
    }

    @Override // okhttp3.ao
    public final void c(k.i iVar) throws IOException {
        h.g.b.x.f(iVar, "sink");
        k.am amVarE = k.y.e(this.f55893b);
        try {
            iVar.ac(amVarE);
            h.a.i.aW(amVarE, null);
        } finally {
        }
    }
}
