package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f51090a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51091b = new bw("kotlin.Char", kotlinx.b.a.i.f50913a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return Character.valueOf(eVar.decodeChar());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51091b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeChar(cCharValue);
    }
}
