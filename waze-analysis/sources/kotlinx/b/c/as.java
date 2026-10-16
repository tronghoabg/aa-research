package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final as f50970a = new as();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f50971b = new bw("kotlin.Int", kotlinx.b.a.l.f50916a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Integer.valueOf(eVar.decodeInt());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f50971b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeInt(iIntValue);
    }
}
