package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f51078a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51079b = new bw("kotlin.Boolean", kotlinx.b.a.g.f50911a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Boolean.valueOf(eVar.decodeBoolean());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51079b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeBoolean(zBooleanValue);
    }
}
