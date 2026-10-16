package kotlinx.b.d;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final z f51231a = new z();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51232b = h.k.n.z("kotlinx.serialization.json.JsonPrimitive", kotlinx.b.a.o.f50919a, new kotlinx.b.a.q[0], new kotlinx.coroutines.z(6));

    @Override // kotlinx.b.a
    public final /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        k kVarI = aa.b(eVar).i();
        if (kVarI instanceof y) {
            return (y) kVarI;
        }
        Class<?> cls = kVarI.getClass();
        int i2 = ar.f48106a;
        h.g.b.m mVar = new h.g.b.m(cls);
        mVar.toString();
        throw kotlinx.coroutines.d.d.f(-1, "Unexpected JSON element, expected JsonPrimitive, had ".concat(mVar.toString()), kVarI.toString());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51232b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        y yVar = (y) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(yVar, "value");
        aa.c(fVar);
        if (yVar instanceof t) {
            fVar.encodeSerializableValue(u.f51223a, t.f51222a);
        } else {
            fVar.encodeSerializableValue(r.f51220a, (q) yVar);
        }
    }
}
