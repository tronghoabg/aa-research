package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f51445a;

    /* renamed from: b, reason: collision with root package name */
    Object f51446b;

    /* renamed from: c, reason: collision with root package name */
    int f51447c;

    /* renamed from: d, reason: collision with root package name */
    int f51448d;

    /* renamed from: e, reason: collision with root package name */
    int f51449e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k[] f51450f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f51451g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ h.g.a.q f51452h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f51453i;

    /* renamed from: j, reason: collision with root package name */
    private /* synthetic */ Object f51454j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(kotlinx.coroutines.b.k[] kVarArr, h.g.a.a aVar, h.g.a.q qVar, kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f51450f = kVarArr;
        this.f51451g = aVar;
        this.f51452h = qVar;
        this.f51453i = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        t tVar = new t(this.f51450f, this.f51451g, this.f51452h, this.f51453i, eVar);
        tVar.f51454j = obj;
        return tVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((t) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if (r11.invoke(r12, r10, r17) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        if (r12.invoke(r13, r11, r17) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[LOOP:0: B:22:0x009e->B:44:?, LOOP_START, PHI: r7 r11
  0x009e: PHI (r7v6 int) = (r7v5 int), (r7v7 int) binds: [B:21:0x009c, B:44:?] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r11v4 h.a.ag) = (r11v3 h.a.ag), (r11v17 h.a.ag) binds: [B:21:0x009c, B:44:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0105 -> B:17:0x007a). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
