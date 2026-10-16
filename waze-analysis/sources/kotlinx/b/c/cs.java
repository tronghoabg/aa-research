package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cs extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cs f51062a = new cs();

    private cs() {
        super(kotlinx.b.a.b.x(h.v.f48301a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        long[] jArrB = ((h.w) obj).b();
        h.g.b.x.f(jArrB, "$this$collectionSize");
        return jArrB.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        long[] jArrB = ((h.w) obj).b();
        h.g.b.x.f(jArrB, "$this$toBuilder");
        return new cr(jArrB);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        cr crVar = (cr) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(crVar, "builder");
        crVar.c(cVar.decodeInlineElement(getDescriptor(), i2).decodeLong());
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        long[] jArr = new long[0];
        h.w.c(jArr);
        return h.w.a(jArr);
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        long[] jArrB = ((h.w) obj).b();
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(jArrB, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeInlineElement(getDescriptor(), i3).encodeLong(jArrB[i3]);
        }
    }
}
