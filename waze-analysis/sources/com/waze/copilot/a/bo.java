package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bo implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f22808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bq f22809b;

    public bo(kotlinx.coroutines.b.l lVar, bq bqVar) {
        this.f22808a = lVar;
        this.f22809b = bqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r9.emit(r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.copilot.a.bn
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.copilot.a.bn r0 = (com.waze.copilot.a.bn) r0
            int r1 = r0.f22804b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22804b = r1
            goto L18
        L13:
            com.waze.copilot.a.bn r0 = new com.waze.copilot.a.bn
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f22803a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22804b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r9)
            goto L91
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.waze.copilot.a.bq r7 = r0.f22807e
            r8 = r7
            com.waze.copilot.a.bq r8 = (com.waze.copilot.a.bq) r8
            java.lang.Object r8 = r0.f22805c
            kotlinx.coroutines.b.l r8 = (kotlinx.coroutines.b.l) r8
            e.b.c.b(r9)
            h.m r9 = (h.m) r9
            java.lang.Object r9 = r9.b()
            goto L77
        L45:
            e.b.c.b(r9)
            kotlinx.coroutines.b.l r9 = r7.f22808a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7d
            com.waze.copilot.a.bq r8 = r7.f22809b
            com.waze.ConfigManager r2 = com.waze.copilot.a.bq.a(r8)
            com.waze.config.b r5 = com.waze.config.ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_GALLERY_ENABLED
            boolean r2 = r2.getConfigValueBool(r5)
            if (r2 == 0) goto L7d
            com.waze.copilot.data.b.h r7 = com.waze.copilot.a.bq.b(r8)
            r0.f22805c = r9
            r0.f22807e = r8
            r0.f22804b = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L90
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
        L77:
            com.waze.bi.f r7 = com.waze.copilot.a.bq.d(r7, r9)
            r9 = r8
            goto L83
        L7d:
            com.waze.copilot.a.bq r7 = r7.f22809b
            com.waze.bi.f r7 = com.waze.copilot.a.bq.c(r7)
        L83:
            r8 = 0
            r0.f22805c = r8
            r0.f22807e = r8
            r0.f22804b = r3
            java.lang.Object r7 = r9.emit(r7, r0)
            if (r7 != r1) goto L91
        L90:
            return r1
        L91:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.bo.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
