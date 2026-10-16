package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cn implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cn f51053a = new cn();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51054b = ca.d("kotlin.UByte", kotlinx.b.a.b.n(h.g.b.h.f48120a));

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return h.q.c(eVar.decodeInline(f51054b).decodeByte());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51054b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        byte bA = ((h.q) obj).a();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeInline(f51054b).encodeByte(bA);
    }
}
