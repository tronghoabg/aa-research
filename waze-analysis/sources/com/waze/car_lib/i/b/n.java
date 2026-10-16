package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.map.canvas.bq;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements bq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f20010a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f20011b;

    n(WeakReference weakReference, com.waze.car_lib.i.a.a aVar) {
        this.f20010a = weakReference;
        this.f20011b = aVar;
    }

    @Override // com.waze.map.canvas.bq
    public final Context a() {
        return (Context) this.f20010a.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.canvas.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.car_lib.i.b.m
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.car_lib.i.b.m r0 = (com.waze.car_lib.i.b.m) r0
            int r1 = r0.f20009c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20009c = r1
            goto L18
        L13:
            com.waze.car_lib.i.b.m r0 = new com.waze.car_lib.i.b.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20007a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20009c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            com.waze.car_lib.i.a.a r4 = r4.f20011b
            kotlinx.coroutines.b.k r4 = r4.d()
            r0.f20009c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.h(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.waze.map.main.aa r5 = (com.waze.map.main.aa) r5
            android.graphics.Rect r4 = com.waze.z.a.e.b.h(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.i.b.n.b(h.c.e):java.lang.Object");
    }
}
