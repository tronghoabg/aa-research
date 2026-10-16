package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final g f51077a = new g();

    private g() {
        super(kotlinx.b.a.b.m(h.g.b.g.f48119a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        h.g.b.x.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        h.g.b.x.f(zArr, "<this>");
        return new f(zArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        f fVar = (f) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(fVar, "builder");
        fVar.c(cVar.decodeBooleanElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new boolean[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        boolean[] zArr = (boolean[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(zArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeBooleanElement(getDescriptor(), i3, zArr[i3]);
        }
    }
}
