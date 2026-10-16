package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p f51089a = new p();

    private p() {
        super(kotlinx.b.a.b.o(h.g.b.k.f48122a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        char[] cArr = (char[]) obj;
        h.g.b.x.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        char[] cArr = (char[]) obj;
        h.g.b.x.f(cArr, "<this>");
        return new o(cArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        o oVar = (o) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(oVar, "builder");
        oVar.c(cVar.decodeCharElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new char[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        char[] cArr = (char[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(cArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeCharElement(getDescriptor(), i3, cArr[i3]);
        }
    }
}
