package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ba f50980a = new ba();

    private ba() {
        super(kotlinx.b.a.b.s(h.g.b.z.f48129a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        long[] jArr = (long[]) obj;
        h.g.b.x.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        long[] jArr = (long[]) obj;
        h.g.b.x.f(jArr, "<this>");
        return new az(jArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        az azVar = (az) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(azVar, "builder");
        azVar.c(cVar.decodeLongElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new long[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        long[] jArr = (long[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(jArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeLongElement(getDescriptor(), i3, jArr[i3]);
        }
    }
}
