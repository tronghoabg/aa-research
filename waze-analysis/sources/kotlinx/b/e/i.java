package kotlinx.b.e;

import h.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51249a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final e f51250b = new e(r.j(), r.j(), r.j(), r.j(), r.j(), false);

    public static final e a() {
        return f51250b;
    }

    public static final e b(e eVar, e eVar2) {
        x.f(eVar, "<this>");
        x.f(eVar2, "other");
        f fVar = new f();
        fVar.g(eVar);
        eVar2.d(new h(fVar));
        return fVar.f();
    }
}
