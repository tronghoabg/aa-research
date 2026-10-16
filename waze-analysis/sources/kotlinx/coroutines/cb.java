package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cb extends h.c.b.a.f implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f51791a;

    /* renamed from: b, reason: collision with root package name */
    Object f51792b;

    /* renamed from: c, reason: collision with root package name */
    int f51793c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cf f51794d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f51795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cb(cf cfVar, h.c.e eVar) {
        super(2, eVar);
        this.f51794d = cfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cb cbVar = new cb(this.f51794d, eVar);
        cbVar.f51795e = obj;
        return cbVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cb) create((h.m.j) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r6.a(((kotlinx.coroutines.q) r1).f52061a, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r3.a(r6, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0063 -> B:24:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:24:0x007a). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.f51793c
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L19
            java.lang.Object r1 = r5.f51792b
            kotlinx.coroutines.e.z r1 = (kotlinx.coroutines.e.z) r1
            java.lang.Object r2 = r5.f51791a
            kotlinx.coroutines.e.x r2 = (kotlinx.coroutines.e.x) r2
            java.lang.Object r3 = r5.f51795e
            h.m.j r3 = (h.m.j) r3
            e.b.c.b(r6)
            goto L7a
        L19:
            e.b.c.b(r6)
            goto L7f
        L1d:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f51795e
            h.m.j r6 = (h.m.j) r6
            kotlinx.coroutines.cf r1 = r5.f51794d
            java.lang.Object r1 = r1.bX()
            boolean r3 = r1 instanceof kotlinx.coroutines.q
            if (r3 == 0) goto L3e
            kotlinx.coroutines.q r1 = (kotlinx.coroutines.q) r1
            kotlinx.coroutines.cf r1 = r1.f52061a
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r5.f51793c = r2
            java.lang.Object r5 = r6.a(r1, r3)
            if (r5 != r0) goto L7f
            goto L79
        L3e:
            boolean r2 = r1 instanceof kotlinx.coroutines.bl
            if (r2 == 0) goto L7f
            kotlinx.coroutines.bl r1 = (kotlinx.coroutines.bl) r1
            kotlinx.coroutines.ck r1 = r1.bL()
            if (r1 == 0) goto L7f
            kotlinx.coroutines.e.x r1 = (kotlinx.coroutines.e.x) r1
            java.lang.Object r2 = r1.g()
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            h.g.b.x.d(r2, r3)
            kotlinx.coroutines.e.z r2 = (kotlinx.coroutines.e.z) r2
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r6
        L5b:
            boolean r6 = h.g.b.x.n(r1, r2)
            if (r6 != 0) goto L7f
            boolean r6 = r1 instanceof kotlinx.coroutines.q
            if (r6 == 0) goto L7a
            r6 = r1
            kotlinx.coroutines.q r6 = (kotlinx.coroutines.q) r6
            kotlinx.coroutines.cf r6 = r6.f52061a
            r5.f51795e = r3
            r5.f51791a = r2
            r5.f51792b = r1
            r4 = 2
            r5.f51793c = r4
            java.lang.Object r6 = r3.a(r6, r5)
            if (r6 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlinx.coroutines.e.z r1 = r1.h()
            goto L5b
        L7f:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.cb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
