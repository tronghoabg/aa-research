package h.c;

import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f48052a;

    /* renamed from: b, reason: collision with root package name */
    private final i f48053b;

    public b(i iVar, h.g.a.l lVar) {
        x.f(iVar, "baseKey");
        x.f(lVar, "safeCast");
        this.f48052a = lVar;
        this.f48053b = iVar instanceof b ? ((b) iVar).f48053b : iVar;
    }

    public final h a(h hVar) {
        x.f(hVar, "element");
        return (h) this.f48052a.invoke(hVar);
    }

    public final boolean b(i iVar) {
        x.f(iVar, "key");
        return iVar == this || this.f48053b == iVar;
    }

    public /* synthetic */ b() {
        this(ab.Key, new z(2));
    }
}
