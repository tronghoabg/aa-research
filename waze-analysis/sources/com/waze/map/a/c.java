package com.waze.map.a;

import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f27918a;

    public c(l lVar) {
        this.f27918a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.map.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.map.a.b r0 = (com.waze.map.a.b) r0
            int r1 = r0.f27916b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27916b = r1
            goto L18
        L13:
            com.waze.map.a.b r0 = new com.waze.map.a.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f27915a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27916b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.l r4 = r4.f27918a
            r6 = r0
            h.c.e r6 = (h.c.e) r6
            com.waze.map.b.dm r5 = (com.waze.map.b.dm) r5
            if (r5 == 0) goto L40
            com.waze.shared_infra.h.c r5 = r5.e()
            goto L41
        L40:
            r5 = 0
        L41:
            r0.f27916b = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L4a
            return r1
        L4a:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.a.c.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
