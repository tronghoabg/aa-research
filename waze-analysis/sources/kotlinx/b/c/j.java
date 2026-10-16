package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f51082a = new j();

    private j() {
        super(kotlinx.b.a.b.n(h.g.b.h.f48120a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        byte[] bArr = (byte[]) obj;
        h.g.b.x.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        byte[] bArr = (byte[]) obj;
        h.g.b.x.f(bArr, "<this>");
        return new i(bArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        i iVar = (i) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(iVar, "builder");
        iVar.c(cVar.decodeByteElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new byte[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        byte[] bArr = (byte[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(bArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeByteElement(getDescriptor(), i3, bArr[i3]);
        }
    }
}
