package kotlinx.b.d;

import h.g.b.at;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final x f51229a = new x();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51230b = w.f51226a;

    @Override // kotlinx.b.a
    public final /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        aa.b(eVar);
        return new v((Map) kotlinx.b.a.b.k(kotlinx.b.a.b.u(at.f48108a), n.f51215a).deserialize(eVar));
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51230b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        v vVar = (v) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(vVar, "value");
        aa.c(fVar);
        kotlinx.b.a.b.k(kotlinx.b.a.b.u(at.f48108a), n.f51215a).serialize(fVar, vVar);
    }
}
