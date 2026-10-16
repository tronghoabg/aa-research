package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cm extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cm f51052a = new cm();

    private cm() {
        super(kotlinx.b.a.b.v(h.q.f48292a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        byte[] bArrB = ((h.r) obj).b();
        h.g.b.x.f(bArrB, "$this$collectionSize");
        return bArrB.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        byte[] bArrB = ((h.r) obj).b();
        h.g.b.x.f(bArrB, "$this$toBuilder");
        return new cl(bArrB);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        cl clVar = (cl) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(clVar, "builder");
        clVar.c(cVar.decodeInlineElement(getDescriptor(), i2).decodeByte());
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        byte[] bArr = new byte[0];
        h.r.c(bArr);
        return h.r.a(bArr);
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        byte[] bArrB = ((h.r) obj).b();
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(bArrB, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeInlineElement(getDescriptor(), i3).encodeByte(bArrB[i3]);
        }
    }
}
