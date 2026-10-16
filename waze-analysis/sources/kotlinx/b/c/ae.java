package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ae implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50952c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f50953d;

    public /* synthetic */ ae(int i2, String str, af afVar, int i3) {
        this.f50953d = i3;
        this.f50950a = i2;
        this.f50951b = str;
        this.f50952c = afVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f50953d != 0) {
            int i2 = com.waze.search.v2.cu.f36302a;
            this.f50952c.invoke(new com.waze.search.v2.ak(((com.waze.search.v2.r) this.f50951b).d(), this.f50950a));
            return h.ab.f48028a;
        }
        int i3 = this.f50950a;
        kotlinx.b.a.q[] qVarArr = new kotlinx.b.a.q[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = this.f50952c;
            qVarArr[i4] = h.k.n.z(((String) this.f50951b) + '.' + ((br) obj).c(i4), kotlinx.b.a.ab.f50903a, new kotlinx.b.a.q[0], new kotlinx.coroutines.z(6));
        }
        return qVarArr;
    }

    public /* synthetic */ ae(h.g.a.l lVar, com.waze.search.v2.r rVar, int i2, int i3) {
        this.f50953d = i3;
        this.f50952c = lVar;
        this.f50951b = rVar;
        this.f50950a = i2;
    }
}
