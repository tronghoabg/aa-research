package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ey implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28873a;

    ey(com.waze.map.canvas.a.e eVar) {
        this.f28873a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.waze.map.ck r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.map.ex
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.ex r0 = (com.waze.map.ex) r0
            int r1 = r0.f28871c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28871c = r1
            goto L18
        L13:
            com.waze.map.ex r0 = new com.waze.map.ex
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28869a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28871c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.map.ck r6 = r0.f28872d
            r5 = r6
            com.waze.map.ck r5 = (com.waze.map.ck) r5
            e.b.c.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            e.b.c.b(r7)
            com.waze.map.canvas.a.e r5 = r5.f28873a
            com.waze.jni.protos.map.MapConfiguration$Builder r7 = com.waze.jni.protos.map.MapConfiguration.newBuilder()
            com.waze.jni.protos.map.MapConfiguration$CameraConfiguration$Builder r2 = com.waze.jni.protos.map.MapConfiguration.CameraConfiguration.newBuilder()
            com.waze.map.b.ch r4 = r6.a()
            com.waze.map.b.cb r4 = r4.a()
            boolean r4 = r4.a()
            r2.setHandleTouches(r4)
            r7.setCamera(r2)
            com.google.v.du r7 = r7.build()
            java.lang.String r2 = "build(...)"
            h.g.b.x.e(r7, r2)
            com.waze.jni.protos.map.MapConfiguration r7 = (com.waze.jni.protos.map.MapConfiguration) r7
            r0.f28872d = r6
            r0.f28871c = r3
            java.lang.Object r5 = r5.updateMapConfiguration(r7, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            kotlinx.coroutines.CompletableDeferred r5 = r6.b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r5.a(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.ey.emit(com.waze.map.ck, h.c.e):java.lang.Object");
    }
}
