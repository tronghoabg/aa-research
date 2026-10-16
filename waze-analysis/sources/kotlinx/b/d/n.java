package kotlinx.b.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final n f51215a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51216b = h.k.n.z("kotlinx.serialization.json.JsonElement", kotlinx.b.a.e.f50910a, new kotlinx.b.a.q[0], new kotlinx.coroutines.z(7));

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return aa.b(eVar).i();
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51216b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        k kVar = (k) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(kVar, "value");
        aa.c(fVar);
        if (kVar instanceof y) {
            fVar.encodeSerializableValue(z.f51231a, kVar);
        } else if (kVar instanceof v) {
            fVar.encodeSerializableValue(x.f51229a, kVar);
        } else {
            if (!(kVar instanceof c)) {
                throw new h.i();
            }
            fVar.encodeSerializableValue(e.f51203a, kVar);
        }
    }
}
