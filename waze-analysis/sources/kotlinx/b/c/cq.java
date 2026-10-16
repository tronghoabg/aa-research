package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cq f51058a = new cq();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51059b = ca.d("kotlin.UInt", kotlinx.b.a.b.r(h.g.b.v.f48128a));

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return h.s.b(eVar.decodeInline(f51059b).decodeInt());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51059b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        int iA = ((h.s) obj).a();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeInline(f51059b).encodeInt(iA);
    }
}
