package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51716a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f51717b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f51718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(long j2, h.c.e eVar) {
        super(2, eVar);
        this.f51717b = j2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f51717b, eVar);
        sVar.f51718c = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[PHI: r3
  0x004b: PHI (r3v2 kotlinx.coroutines.a.ad) = (r3v3 kotlinx.coroutines.a.ad), (r3v8 kotlinx.coroutines.a.ad) binds: [B:16:0x0049, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:15:0x0038). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f51716a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L17
            java.lang.Object r3 = r6.f51718c
            if (r1 == r2) goto L11
            kotlinx.coroutines.a.ad r3 = (kotlinx.coroutines.a.ad) r3
            goto L1c
        L11:
            kotlinx.coroutines.a.ad r3 = (kotlinx.coroutines.a.ad) r3
            e.b.c.b(r7)
            goto L4b
        L17:
            java.lang.Object r1 = r6.f51718c
            r3 = r1
            kotlinx.coroutines.a.ad r3 = (kotlinx.coroutines.a.ad) r3
        L1c:
            e.b.c.b(r7)
            goto L38
        L20:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f51718c
            kotlinx.coroutines.a.ad r7 = (kotlinx.coroutines.a.ad) r7
            long r4 = r6.f51717b
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f51718c = r7
            r6.f51716a = r3
            java.lang.Object r1 = kotlinx.coroutines.aj.q(r4, r1)
            if (r1 != r0) goto L37
            goto L5b
        L37:
            r3 = r7
        L38:
            kotlinx.coroutines.a.ag r7 = r3.U()
            h.ab r1 = h.ab.f48028a
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f51718c = r3
            r6.f51716a = r2
            java.lang.Object r7 = r7.g(r1, r4)
            if (r7 == r0) goto L5b
        L4b:
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f51718c = r3
            r1 = 3
            r6.f51716a = r1
            long r4 = r6.f51717b
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r4, r7)
            if (r7 != r0) goto L38
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
