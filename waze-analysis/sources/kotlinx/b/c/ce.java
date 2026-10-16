package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ce implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ce f51034a = new ce();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51035b = new bw("kotlin.Short", kotlinx.b.a.n.f50918a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Short.valueOf(eVar.decodeShort());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51035b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeShort(sShortValue);
    }
}
