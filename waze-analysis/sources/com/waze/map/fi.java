package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fi implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb f28945a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28946b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f28947c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28948d;

    fi(gb gbVar, com.waze.map.canvas.a.e eVar, h.g.b.am amVar, kotlinx.coroutines.b.bn bnVar) {
        this.f28945a = gbVar;
        this.f28946b = eVar;
        this.f28947c = amVar;
        this.f28948d = bnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(android.graphics.Rect r9, h.c.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.map.fh
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.map.fh r0 = (com.waze.map.fh) r0
            int r1 = r0.f28942d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28942d = r1
            goto L18
        L13:
            com.waze.map.fh r0 = new com.waze.map.fh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f28940b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28942d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            android.graphics.Rect r9 = r0.f28943e
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            e.b.c.b(r10)
            goto L97
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            com.waze.map.gb r9 = r0.f28944f
            r2 = r9
            com.waze.map.gb r2 = (com.waze.map.gb) r2
            java.lang.Object r2 = r0.f28939a
            com.waze.map.canvas.a.e r2 = (com.waze.map.canvas.a.e) r2
            android.graphics.Rect r4 = r0.f28943e
            r5 = r4
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            e.b.c.b(r10)
            goto L7c
        L49:
            e.b.c.b(r10)
            com.waze.map.gb r10 = r8.f28945a
            com.waze.shared_infra.i.e r2 = com.waze.map.gb.f(r10)
            java.util.Objects.toString(r9)
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.String r6 = "new viewport "
            java.lang.String r5 = r6.concat(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.a(r5)
            com.waze.map.canvas.a.e r2 = r8.f28946b
            h.g.a.l r5 = com.waze.map.gb.i(r10)
            r0.f28943e = r9
            r0.f28939a = r2
            r0.f28944f = r10
            r0.f28942d = r4
            java.lang.Object r4 = r5.invoke(r0)
            if (r4 == r1) goto L9f
            r7 = r4
            r4 = r9
            r9 = r10
            r10 = r7
        L7c:
            h.g.b.am r5 = r8.f28947c
            android.graphics.Rect r10 = (android.graphics.Rect) r10
            boolean r5 = r5.f48101a
            com.waze.jni.protos.map.MapBounds r9 = com.waze.map.gb.b(r9, r10, r4, r5)
            r0.f28943e = r4
            r10 = 0
            r0.f28939a = r10
            r0.f28944f = r10
            r0.f28942d = r3
            java.lang.Object r9 = r2.updateMapBounds(r9, r0)
            if (r9 != r1) goto L96
            goto L9f
        L96:
            r9 = r4
        L97:
            kotlinx.coroutines.b.bn r8 = r8.f28948d
            r8.e(r9)
            h.ab r8 = h.ab.f48028a
            return r8
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.fi.emit(android.graphics.Rect, h.c.e):java.lang.Object");
    }
}
