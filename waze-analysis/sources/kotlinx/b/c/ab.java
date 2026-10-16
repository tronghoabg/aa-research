package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ab f50945a = new ab();

    private ab() {
        super(kotlinx.b.a.b.p(h.g.b.p.f48126a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        double[] dArr = (double[]) obj;
        h.g.b.x.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        double[] dArr = (double[]) obj;
        h.g.b.x.f(dArr, "<this>");
        return new aa(dArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        aa aaVar = (aa) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(aaVar, "builder");
        aaVar.c(cVar.decodeDoubleElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new double[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        double[] dArr = (double[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(dArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeDoubleElement(getDescriptor(), i3, dArr[i3]);
        }
    }
}
