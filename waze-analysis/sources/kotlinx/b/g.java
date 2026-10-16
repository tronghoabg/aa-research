package kotlinx.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.b.c.b f51254a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f51255b;

    public /* synthetic */ g(kotlinx.b.c.b bVar, int i2) {
        this.f51255b = i2;
        this.f51254a = bVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f51255b;
        if (i2 == 0) {
            return i.a((i) this.f51254a, (kotlinx.b.a.a) obj);
        }
        if (i2 != 1) {
            return i.c((i) this.f51254a, (kotlinx.b.a.a) obj);
        }
        return f.a((f) this.f51254a, (kotlinx.b.a.a) obj);
    }
}
