package kotlinx.b.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f51223a = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51224b = h.k.n.z("kotlinx.serialization.json.JsonNull", kotlinx.b.a.w.f50939a, new kotlinx.b.a.q[0], new kotlinx.coroutines.z(6));

    @Override // kotlinx.b.a
    public final /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        aa.b(eVar);
        if (eVar.decodeNotNullMark()) {
            throw new kotlinx.b.d.a.n("Expected 'null' literal");
        }
        eVar.decodeNull();
        return t.f51222a;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51224b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f((t) obj, "value");
        aa.c(fVar);
        fVar.encodeNull();
    }
}
