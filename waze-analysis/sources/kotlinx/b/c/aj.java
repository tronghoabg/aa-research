package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final aj f50961a = new aj();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f50962b = new bw("kotlin.Float", kotlinx.b.a.k.f50915a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Float.valueOf(eVar.decodeFloat());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f50962b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeFloat(fFloatValue);
    }
}
