package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cv extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cv f51067a = new cv();

    private cv() {
        super(kotlinx.b.a.b.y(h.y.f48305a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        short[] sArrB = ((h.z) obj).b();
        h.g.b.x.f(sArrB, "$this$collectionSize");
        return sArrB.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        short[] sArrB = ((h.z) obj).b();
        h.g.b.x.f(sArrB, "$this$toBuilder");
        return new cu(sArrB);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        cu cuVar = (cu) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(cuVar, "builder");
        cuVar.c(cVar.decodeInlineElement(getDescriptor(), i2).decodeShort());
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        short[] sArr = new short[0];
        h.z.c(sArr);
        return h.z.a(sArr);
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        short[] sArrB = ((h.z) obj).b();
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(sArrB, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeInlineElement(getDescriptor(), i3).encodeShort(sArrB[i3]);
        }
    }
}
