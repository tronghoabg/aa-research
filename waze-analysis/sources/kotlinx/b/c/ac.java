package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f50946a = new ac();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f50947b = new bw("kotlin.Double", kotlinx.b.a.j.f50914a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Double.valueOf(eVar.decodeDouble());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f50947b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeDouble(dDoubleValue);
    }
}
