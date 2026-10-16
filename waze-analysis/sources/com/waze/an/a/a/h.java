package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f14474a;

    /* renamed from: b, reason: collision with root package name */
    int f14475b;

    /* renamed from: c, reason: collision with root package name */
    int f14476c;

    /* renamed from: d, reason: collision with root package name */
    int f14477d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f14478e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f14479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, h.c.e eVar) {
        super(2, eVar);
        this.f14478e = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f14478e, eVar);
        hVar.f14479f = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (kotlinx.coroutines.aj.r(r6, r8) != r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0048 -> B:17:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0075 -> B:17:0x0078). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f14477d
            r2 = 1
            if (r1 == 0) goto L27
            int r3 = r8.f14476c
            if (r1 == r2) goto L19
            int r1 = r8.f14475b
            java.lang.Object r4 = r8.f14474a
            com.waze.an.a.a.j r4 = (com.waze.an.a.a.j) r4
            java.lang.Object r5 = r8.f14479f
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            e.b.c.b(r9)
            goto L78
        L19:
            int r1 = r8.f14475b
            java.lang.Object r4 = r8.f14474a
            com.waze.an.a.a.j r4 = (com.waze.an.a.a.j) r4
            java.lang.Object r5 = r8.f14479f
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            e.b.c.b(r9)
            goto L62
        L27:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f14479f
            kotlinx.coroutines.b.l r9 = (kotlinx.coroutines.b.l) r9
            com.waze.an.a.a.j r1 = r8.f14478e
            java.util.List r3 = com.waze.an.a.a.j.b(r1)
            int r3 = r3.size()
            r4 = 0
            r5 = r4
            r4 = r1
            r1 = r3
            r3 = r5
            r5 = r9
        L3e:
            if (r3 >= r1) goto L7a
            h.c.j r9 = r8.getContext()
            boolean r9 = h.g.b.o.h(r9)
            if (r9 == 0) goto L78
            java.util.List r9 = com.waze.an.a.a.j.b(r4)
            java.lang.Object r9 = r9.get(r3)
            r8.f14479f = r5
            r8.f14474a = r4
            r8.f14475b = r1
            r8.f14476c = r3
            r8.f14477d = r2
            java.lang.Object r9 = r5.emit(r9, r8)
            if (r9 == r0) goto L77
        L62:
            long r6 = com.waze.an.a.a.k.a()
            r8.f14479f = r5
            r8.f14474a = r4
            r8.f14475b = r1
            r8.f14476c = r3
            r9 = 2
            r8.f14477d = r9
            java.lang.Object r9 = kotlinx.coroutines.aj.r(r6, r8)
            if (r9 != r0) goto L78
        L77:
            return r0
        L78:
            int r3 = r3 + r2
            goto L3e
        L7a:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.an.a.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
