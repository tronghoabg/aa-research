package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cf f51036a = new cf();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51037b = new bw("kotlin.String", kotlinx.b.a.o.f50919a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return eVar.decodeString();
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51037b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        String str = (String) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(str, "value");
        fVar.encodeString(str);
    }
}
