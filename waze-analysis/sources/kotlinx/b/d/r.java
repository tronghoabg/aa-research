package kotlinx.b.d;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f51220a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51221b = h.k.n.w("kotlinx.serialization.json.JsonLiteral", kotlinx.b.a.o.f50919a);

    @Override // kotlinx.b.a
    public final /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        k kVarI = aa.b(eVar).i();
        if (kVarI instanceof q) {
            return (q) kVarI;
        }
        Class<?> cls = kVarI.getClass();
        int i2 = ar.f48106a;
        h.g.b.m mVar = new h.g.b.m(cls);
        mVar.toString();
        throw kotlinx.coroutines.d.d.f(-1, "Unexpected JSON element, expected JsonLiteral, had ".concat(mVar.toString()), kVarI.toString());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51221b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        q qVar = (q) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(qVar, "value");
        aa.c(fVar);
        if (qVar.b()) {
            fVar.encodeString(qVar.a());
            return;
        }
        Long lH = h.n.o.h(qVar.a());
        if (lH != null) {
            fVar.encodeLong(lH.longValue());
            return;
        }
        h.v vVarJ = h.b.a.j(qVar.a());
        if (vVarJ != null) {
            fVar.encodeInline(kotlinx.b.a.b.x(h.v.f48301a).getDescriptor()).encodeLong(vVarJ.a());
            return;
        }
        Double d2 = h.n.o.d(qVar.a());
        if (d2 != null) {
            fVar.encodeDouble(d2.doubleValue());
            return;
        }
        Boolean boolT = h.n.o.t(qVar.a());
        if (boolT != null) {
            fVar.encodeBoolean(boolT.booleanValue());
        } else {
            fVar.encodeString(qVar.a());
        }
    }
}
