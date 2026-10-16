package e.a;

import j$.util.Objects;
import java.net.URI;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dg extends cz {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ di f47326a;

    /* synthetic */ dg(di diVar) {
        Objects.requireNonNull(diVar);
        this.f47326a = diVar;
    }

    @Override // e.a.cz
    public final dd b(URI uri, cx cxVar) {
        de deVarA = this.f47326a.a(uri.getScheme());
        if (deVarA == null) {
            return null;
        }
        return deVarA.b(uri, cxVar);
    }

    @Override // e.a.cz
    public final String c() {
        throw null;
    }
}
