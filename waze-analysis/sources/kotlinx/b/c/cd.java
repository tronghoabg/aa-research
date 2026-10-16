package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cd f51033a = new cd();

    private cd() {
        super(kotlinx.b.a.b.t(h.g.b.as.f48107a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        short[] sArr = (short[]) obj;
        h.g.b.x.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        short[] sArr = (short[]) obj;
        h.g.b.x.f(sArr, "<this>");
        return new cc(sArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        cc ccVar = (cc) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(ccVar, "builder");
        ccVar.c(cVar.decodeShortElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new short[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        short[] sArr = (short[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(sArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeShortElement(getDescriptor(), i3, sArr[i3]);
        }
    }
}
