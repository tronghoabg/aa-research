package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cg implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f51038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f51039b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f51040c;

    public /* synthetic */ cg(Object obj, Object obj2, int i2) {
        this.f51040c = i2;
        this.f51038a = obj;
        this.f51039b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.b.a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlinx.b.a] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f51040c;
        if (i2 == 0) {
            return ((ch) this.f51038a).s(this.f51039b);
        }
        if (i2 == 1) {
            return ag.a((ag) this.f51038a, (String) this.f51039b);
        }
        Object obj = this.f51038a;
        ?? r3 = this.f51039b;
        kotlinx.b.b.e eVar = (kotlinx.b.b.e) obj;
        return (r3.getDescriptor().k() || eVar.decodeNotNullMark()) ? ((ch) obj).s(r3) : eVar.decodeNull();
    }
}
