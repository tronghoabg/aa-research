package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fk implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f28952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f28953b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.b.ec f28954c;

    public fk(kotlinx.coroutines.b.l lVar, gb gbVar, com.waze.map.b.ec ecVar) {
        this.f28952a = lVar;
        this.f28953b = gbVar;
        this.f28954c = ecVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.map.fj
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.fj r0 = (com.waze.map.fj) r0
            int r1 = r0.f28950b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28950b = r1
            goto L18
        L13:
            com.waze.map.fj r0 = new com.waze.map.fj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28949a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28950b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            kotlinx.coroutines.b.l r7 = r5.f28952a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            if (r6 == 0) goto L54
            com.waze.map.gb r2 = r5.f28953b
            com.waze.map.b.ec r5 = r5.f28954c
            com.waze.map.b.ea r5 = (com.waze.map.b.ea) r5
            com.waze.map.b.bs r5 = r5.b()
            h.g.a.a r4 = com.waze.map.gb.h(r2)
            java.lang.Object r4 = r4.invoke()
            android.content.Context r4 = (android.content.Context) r4
            android.graphics.Rect r5 = com.waze.map.gb.a(r2, r6, r5, r4)
            goto L55
        L54:
            r5 = 0
        L55:
            r0.f28950b = r3
            java.lang.Object r5 = r7.emit(r5, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.fk.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
