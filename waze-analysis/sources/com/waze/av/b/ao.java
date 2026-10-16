package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ao implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f15871a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f15872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f15873c;

    public ao(kotlinx.coroutines.b.l lVar, long j2, long j3) {
        this.f15871a = lVar;
        this.f15872b = j2;
        this.f15873c = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r11, h.c.e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.waze.av.b.an
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.av.b.an r0 = (com.waze.av.b.an) r0
            int r1 = r0.f15869b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15869b = r1
            goto L18
        L13:
            com.waze.av.b.an r0 = new com.waze.av.b.an
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f15868a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15869b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r12)
            goto L96
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            e.b.c.b(r12)
            kotlinx.coroutines.b.l r12 = r10.f15871a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r11 = r11.iterator()
        L46:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r11.next()
            r5 = r4
            com.waze.av.b.aa r5 = (com.waze.av.b.aa) r5
            java.util.List r5 = r5.b()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L67
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L67
            goto L46
        L67:
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L46
            java.lang.Object r6 = r5.next()
            com.waze.av.b.c r6 = (com.waze.av.b.c) r6
            long r6 = r6.b()
            long r8 = r10.f15872b
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 > 0) goto L6b
            long r8 = r10.f15873c
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L6b
            r2.add(r4)
            goto L46
        L8b:
            java.util.List r2 = (java.util.List) r2
            r0.f15869b = r3
            java.lang.Object r10 = r12.emit(r2, r0)
            if (r10 != r1) goto L96
            return r1
        L96:
            h.ab r10 = h.ab.f48028a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.ao.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
