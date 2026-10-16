package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40524a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f40525b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f40526c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f40527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(an anVar, long j2, h.c.e eVar) {
        super(2, eVar);
        this.f40525b = anVar;
        this.f40526c = j2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        am amVar = new am(this.f40525b, this.f40526c, eVar);
        amVar.f40527d = obj;
        return amVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((am) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (kotlinx.coroutines.aj.q(r6.f40526c, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (kotlinx.coroutines.aj.r(r6.f40525b.f40529b.e(), r6) != r0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004f -> B:16:0x0052). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f40524a
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.Object r3 = r6.f40527d
            if (r1 == r2) goto L11
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r7)
            goto L52
        L11:
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r7)
            goto L36
        L17:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f40527d
            r3 = r7
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            com.waze.stats.an r7 = r6.f40525b
            com.waze.stats.t r7 = com.waze.stats.an.b(r7)
            long r4 = r7.e()
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f40527d = r3
            r6.f40524a = r2
            java.lang.Object r7 = kotlinx.coroutines.aj.r(r4, r7)
            if (r7 == r0) goto L5b
        L36:
            com.waze.stats.an r7 = r6.f40525b
            com.waze.stats.an.m(r7)
        L3b:
            boolean r7 = kotlinx.coroutines.aj.j(r3)
            if (r7 == 0) goto L58
            long r1 = r6.f40526c
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f40527d = r3
            r4 = 2
            r6.f40524a = r4
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r1, r7)
            if (r7 != r0) goto L52
            goto L5b
        L52:
            com.waze.stats.an r7 = r6.f40525b
            com.waze.stats.an.m(r7)
            goto L3b
        L58:
            h.ab r6 = h.ab.f48028a
            return r6
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.am.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
