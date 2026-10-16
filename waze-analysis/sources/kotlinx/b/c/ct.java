package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ct implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ct f51063a = new ct();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51064b = ca.d("kotlin.ULong", kotlinx.b.a.b.s(h.g.b.z.f48129a));

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return h.v.b(eVar.decodeInline(f51064b).decodeLong());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51064b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        long jA = ((h.v) obj).a();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeInline(f51064b).encodeLong(jA);
    }
}
