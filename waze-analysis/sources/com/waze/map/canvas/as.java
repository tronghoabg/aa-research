package com.waze.map.canvas;

import com.waze.map.b.ed;
import com.waze.map.gb;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class as extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.s f28551b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ed f28552c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28553d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bi f28554e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ gb f28555f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.n.c f28556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(bi biVar, kotlinx.coroutines.s sVar, ed edVar, gb gbVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, com.waze.shared_infra.n.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f28554e = biVar;
        this.f28551b = sVar;
        this.f28552c = edVar;
        this.f28555f = gbVar;
        this.f28553d = mainCanvasDelegatorImpl;
        this.f28556g = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new as(this.f28554e, this.f28551b, this.f28552c, this.f28555f, this.f28553d, this.f28556g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (kotlinx.coroutines.aj.v(r9, new com.waze.map.canvas.ar(r8.f28552c, r8.f28555f, r8.f28553d, r8.f28556g, r8.f28554e, null), r8) == r0) goto L12;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f28550a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            e.b.c.b(r9)
            goto L45
        Ld:
            e.b.c.b(r9)
            goto L22
        L11:
            e.b.c.b(r9)
            com.waze.map.canvas.bi r9 = r8.f28554e
            r1 = r8
            h.c.e r1 = (h.c.e) r1
            r8.f28550a = r2
            java.lang.Object r9 = r9.b(r1)
            if (r9 != r0) goto L22
            goto L44
        L22:
            kotlinx.coroutines.s r9 = r8.f28551b
            com.waze.map.b.ed r2 = r8.f28552c
            com.waze.map.gb r3 = r8.f28555f
            com.waze.map.canvas.MainCanvasDelegatorImpl r4 = r8.f28553d
            com.waze.shared_infra.n.c r5 = r8.f28556g
            com.waze.map.canvas.bi r6 = r8.f28554e
            h.c.j r9 = (h.c.j) r9
            com.waze.map.canvas.ar r1 = new com.waze.map.canvas.ar
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            h.g.a.p r1 = (h.g.a.p) r1
            r2 = r8
            h.c.e r2 = (h.c.e) r2
            r3 = 2
            r8.f28550a = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.v(r9, r1, r2)
            if (r8 != r0) goto L45
        L44:
            return r0
        L45:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.as.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
