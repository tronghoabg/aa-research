package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final bb f50981a = new bb();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f50982b = new bw("kotlin.Long", kotlinx.b.a.m.f50917a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Long.valueOf(eVar.decodeLong());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f50982b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeLong(jLongValue);
    }
}
