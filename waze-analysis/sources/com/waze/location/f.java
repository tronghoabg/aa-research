package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f25394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f25395b;

    public f(kotlinx.coroutines.b.l lVar, g gVar) {
        this.f25394a = lVar;
        this.f25395b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r11, h.c.e r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.waze.location.e
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.location.e r0 = (com.waze.location.e) r0
            int r1 = r0.f25392b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25392b = r1
            goto L18
        L13:
            com.waze.location.e r0 = new com.waze.location.e
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f25391a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f25392b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            e.b.c.b(r12)
            goto Ldd
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            e.b.c.b(r12)
            kotlinx.coroutines.b.l r12 = r10.f25394a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            com.waze.jni.protos.navigate.PolylineGeometry r11 = (com.waze.jni.protos.navigate.PolylineGeometry) r11
            com.waze.location.g r10 = r10.f25395b
            java.util.List r11 = com.waze.navigate.et.r(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r5 = h.a.i.q(r11, r4)
            r2.<init>(r5)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r11 = r11.iterator()
        L53:
            boolean r5 = r11.hasNext()
            r6 = 0
            if (r5 == 0) goto L84
            java.lang.Object r5 = r11.next()
            com.waze.shared_infra.h.c r5 = (com.waze.shared_infra.h.c) r5
            android.location.Location r7 = new android.location.Location
            java.lang.String r8 = ""
            r7.<init>(r8)
            double r8 = r5.b()
            r7.setLongitude(r8)
            double r8 = r5.a()
            r7.setLatitude(r8)
            r7.setAccuracy(r6)
            r5 = 1109393408(0x42200000, float:40.0)
            r7.setSpeed(r5)
            androidx.core.location.LocationCompat.setMock(r7, r3)
            r2.add(r7)
            goto L53
        L84:
            java.util.List r2 = (java.util.List) r2
            r11 = r2
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            int r4 = h.a.i.q(r11, r4)
            r5.<init>(r4)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
        L99:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto Lce
            java.lang.Object r7 = r11.next()
            int r8 = r4 + 1
            if (r4 >= 0) goto Laa
            h.a.i.p()
        Laa:
            android.location.Location r7 = (android.location.Location) r7
            int r9 = r2.size()
            int r9 = r9 + (-1)
            if (r4 != r9) goto Lba
            com.waze.location.c r4 = new com.waze.location.c
            r4.<init>(r7, r6)
            goto Lc9
        Lba:
            com.waze.location.c r4 = new com.waze.location.c
            java.lang.Object r9 = r2.get(r8)
            android.location.Location r9 = (android.location.Location) r9
            float r9 = r7.distanceTo(r9)
            r4.<init>(r7, r9)
        Lc9:
            r5.add(r4)
            r4 = r8
            goto L99
        Lce:
            java.util.List r5 = (java.util.List) r5
            java.util.List r10 = com.waze.location.g.e(r10, r5)
            r0.f25392b = r3
            java.lang.Object r10 = r12.emit(r10, r0)
            if (r10 != r1) goto Ldd
            return r1
        Ldd:
            h.ab r10 = h.ab.f48028a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.f.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
