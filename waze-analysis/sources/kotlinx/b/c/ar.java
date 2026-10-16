package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ar f50969a = new ar();

    private ar() {
        super(kotlinx.b.a.b.r(h.g.b.v.f48128a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        int[] iArr = (int[]) obj;
        h.g.b.x.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        int[] iArr = (int[]) obj;
        h.g.b.x.f(iArr, "<this>");
        return new aq(iArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        aq aqVar = (aq) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(aqVar, "builder");
        aqVar.c(cVar.decodeIntElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new int[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        int[] iArr = (int[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(iArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeIntElement(getDescriptor(), i3, iArr[i3]);
        }
    }
}
