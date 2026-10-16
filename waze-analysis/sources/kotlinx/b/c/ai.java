package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends bv implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ai f50960a = new ai();

    private ai() {
        super(kotlinx.b.a.b.q(h.g.b.q.f48127a));
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        float[] fArr = (float[]) obj;
        h.g.b.x.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        float[] fArr = (float[]) obj;
        h.g.b.x.f(fArr, "<this>");
        return new ah(fArr);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        ah ahVar = (ah) obj;
        h.g.b.x.f(cVar, "decoder");
        h.g.b.x.f(ahVar, "builder");
        ahVar.c(cVar.decodeFloatElement(getDescriptor(), i2));
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ Object l() {
        return new float[0];
    }

    @Override // kotlinx.b.c.bv
    public final /* bridge */ /* synthetic */ void m(kotlinx.b.b.d dVar, Object obj, int i2) {
        float[] fArr = (float[]) obj;
        h.g.b.x.f(dVar, "encoder");
        h.g.b.x.f(fArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            dVar.encodeFloatElement(getDescriptor(), i3, fArr[i3]);
        }
    }
}
