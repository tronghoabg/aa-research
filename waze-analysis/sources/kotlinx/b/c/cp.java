package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cp extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cp f51057a = new cp();

    private cp() {
        super(kotlinx.b.a.b.w(h.s.f48295a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        int[] iArrB = ((h.u) obj).b();
        h.g.b.x.f(iArrB, "$this$collectionSize");
        return iArrB.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        int[] iArrB = ((h.u) obj).b();
        h.g.b.x.f(iArrB, "$this$toBuilder");
        return new co(iArrB);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        co coVar = (co) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(coVar, "builder");
        coVar.c(cVar.decodeInlineElement(getDescriptor(), i2).decodeInt());
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        int[] iArr = new int[0];
        h.u.c(iArr);
        return h.u.a(iArr);
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        int[] iArrB = ((h.u) obj).b();
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(iArrB, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeInlineElement(getDescriptor(), i3).encodeInt(iArrB[i3]);
        }
    }
}
