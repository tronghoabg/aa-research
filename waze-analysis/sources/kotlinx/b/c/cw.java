package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cw implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cw f51068a = new cw();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51069b = ca.d("kotlin.UShort", kotlinx.b.a.b.t(h.g.b.as.f48107a));

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return h.y.b(eVar.decodeInline(f51069b).decodeShort());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51069b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        short sC = ((h.y) obj).c();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeInline(f51069b).encodeShort(sC);
    }
}
