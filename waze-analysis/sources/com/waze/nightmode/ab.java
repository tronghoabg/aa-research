package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f32443a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f32444b;

    public ab(kotlinx.coroutines.b.l lVar, int i2) {
        this.f32444b = i2;
        this.f32443a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            int r0 = r6.f32444b
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L54
            boolean r0 = r8 instanceof com.waze.nightmode.c
            if (r0 == 0) goto L1a
            r0 = r8
            com.waze.nightmode.c r0 = (com.waze.nightmode.c) r0
            int r4 = r0.f32458b
            r5 = r4 & r3
            if (r5 == 0) goto L1a
            int r4 = r4 - r3
            r0.f32458b = r4
            goto L1f
        L1a:
            com.waze.nightmode.c r0 = new com.waze.nightmode.c
            r0.<init>(r6, r8)
        L1f:
            java.lang.Object r8 = r0.f32457a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r0.f32458b
            if (r4 == 0) goto L33
            if (r4 != r2) goto L2d
            e.b.c.b(r8)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L33:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r6 = r6.f32443a
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            h.g.b.x.c(r7)
            boolean r7 = r7.booleanValue()
            com.waze.nightmode.a r7 = com.waze.nightmode.d.c(r7)
            r0.f32458b = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r3) goto L51
            return r3
        L51:
            h.ab r6 = h.ab.f48028a
            return r6
        L54:
            boolean r0 = r8 instanceof com.waze.nightmode.aa
            if (r0 == 0) goto L65
            r0 = r8
            com.waze.nightmode.aa r0 = (com.waze.nightmode.aa) r0
            int r4 = r0.f32441b
            r5 = r4 & r3
            if (r5 == 0) goto L65
            int r4 = r4 - r3
            r0.f32441b = r4
            goto L6a
        L65:
            com.waze.nightmode.aa r0 = new com.waze.nightmode.aa
            r0.<init>(r6, r8)
        L6a:
            java.lang.Object r8 = r0.f32440a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r0.f32441b
            if (r4 == 0) goto L7e
            if (r4 != r2) goto L78
            e.b.c.b(r8)
            goto L9a
        L78:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L7e:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r6 = r6.f32443a
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            com.waze.nightmode.x r7 = (com.waze.nightmode.x) r7
            int r7 = com.waze.nightmode.ae.e(r7)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            r0.f32441b = r2
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r3) goto L9a
            return r3
        L9a:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.nightmode.ab.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
