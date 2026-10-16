package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final k f51083a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51084b = new bw("kotlin.Byte", kotlinx.b.a.h.f50912a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Byte.valueOf(eVar.decodeByte());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51084b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeByte(bByteValue);
    }
}
