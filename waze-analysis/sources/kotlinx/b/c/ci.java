package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ci implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f51043a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f51044b;

    public /* synthetic */ ci(Object obj, int i2) {
        this.f51044b = i2;
        this.f51043a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f51044b != 0) {
            return bm.a((bm) this.f51043a, (kotlinx.b.a.a) obj);
        }
        return cj.a((cj) this.f51043a, (kotlinx.b.a.a) obj);
    }
}
