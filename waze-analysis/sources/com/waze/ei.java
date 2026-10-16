package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ei extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23648a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f23649b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ el f23650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ei(el elVar, h.c.e eVar) {
        super(3, eVar);
        this.f23650c = elVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ei eiVar = new ei(this.f23650c, (h.c.e) obj3);
        eiVar.f23648a = (com.waze.navigate.em) obj;
        eiVar.f23649b = zBooleanValue;
        return eiVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r3)
            java.lang.Object r3 = r2.f23648a
            com.waze.navigate.em r3 = (com.waze.navigate.em) r3
            boolean r2 = r2.f23649b
            r0 = 0
            if (r2 == 0) goto L2a
            boolean r2 = r3 instanceof com.waze.navigate.ej
            r1 = 1
            if (r2 == 0) goto L15
        L13:
            r0 = r1
            goto L2a
        L15:
            boolean r2 = r3 instanceof com.waze.navigate.el
            if (r2 == 0) goto L24
            com.waze.navigate.el r3 = (com.waze.navigate.el) r3
            com.waze.navigate.ek r2 = r3.a()
            com.waze.navigate.ek r3 = com.waze.navigate.ek.f31323j
            if (r2 != r3) goto L2a
            goto L13
        L24:
            h.i r2 = new h.i
            r2.<init>()
            throw r2
        L2a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ei.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
