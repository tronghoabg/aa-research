package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ad f50948a = new ad();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f50949b = new bw("kotlin.time.Duration", kotlinx.b.a.o.f50919a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        h.o.c cVar = h.o.a.f48264a;
        return h.o.a.z(h.o.c.l(eVar.decodeString()));
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f50949b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        long jW = ((h.o.a) obj).w();
        h.g.b.x.f(fVar, "encoder");
        fVar.encodeString(h.o.a.x(jW));
    }
}
