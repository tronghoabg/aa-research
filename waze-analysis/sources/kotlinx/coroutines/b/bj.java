package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f51586a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f51587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f51588c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f51589d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f51590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(h.c.e eVar, h.g.a.r rVar, int i2) {
        super(3, eVar);
        this.f51590e = i2;
        this.f51588c = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [h.g.a.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.s, java.lang.Object] */
    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = this.f51590e;
        if (i2 == 0) {
            bj bjVar = new bj((h.c.e) obj3, (h.g.a.r) this.f51588c, 0);
            bjVar.f51589d = (l) obj;
            bjVar.f51587b = (Object[]) obj2;
            return bjVar.invokeSuspend(h.ab.f48028a);
        }
        if (i2 == 1) {
            bj bjVar2 = new bj((h.g.a.p) this.f51588c, (h.c.e) obj3, 1);
            bjVar2.f51589d = (l) obj;
            bjVar2.f51587b = obj2;
            return bjVar2.invokeSuspend(h.ab.f48028a);
        }
        if (i2 == 2) {
            bj bjVar3 = new bj((h.c.e) obj3, (h.g.a.s) this.f51588c, 2);
            bjVar3.f51589d = (l) obj;
            bjVar3.f51587b = (Object[]) obj2;
            return bjVar3.invokeSuspend(h.ab.f48028a);
        }
        if (i2 == 3) {
            bj bjVar4 = new bj((h.c.e) obj3, (h.g.a.t) this.f51588c, 3);
            bjVar4.f51589d = (l) obj;
            bjVar4.f51587b = (Object[]) obj2;
            return bjVar4.invokeSuspend(h.ab.f48028a);
        }
        bj bjVar5 = new bj((h.g.a.q) this.f51588c, (h.c.e) obj3, 4);
        bjVar5.f51589d = (l) obj;
        bjVar5.f51587b = (Object[]) obj2;
        return bjVar5.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r10.emit(r0, r13) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r9.emit(r0, r13) == r6) goto L45;
     */
    /* JADX WARN: Type inference failed for: r0v21, types: [h.g.a.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [h.g.a.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [h.g.a.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [h.g.a.q, java.lang.Object] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(h.c.e eVar, h.g.a.s sVar, int i2) {
        super(3, eVar);
        this.f51590e = i2;
        this.f51588c = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(h.c.e eVar, h.g.a.t tVar, int i2) {
        super(3, eVar);
        this.f51590e = i2;
        this.f51588c = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(h.g.a.p pVar, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f51590e = i2;
        this.f51588c = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(h.g.a.q qVar, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f51590e = i2;
        this.f51588c = qVar;
    }
}
