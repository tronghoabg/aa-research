package com.waze.map.canvas;

import android.content.Context;
import com.waze.map.MapViewChooser;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements bq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f28647a;

    l(WeakReference weakReference) {
        this.f28647a = weakReference;
    }

    @Override // com.waze.map.canvas.bq
    public final Context a() {
        MapViewChooser mapViewChooser = (MapViewChooser) this.f28647a.get();
        if (mapViewChooser != null) {
            return mapViewChooser.getContext();
        }
        return null;
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
            boolean r0 = r5 instanceof com.waze.map.canvas.k
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.map.canvas.k r0 = (com.waze.map.canvas.k) r0
            int r1 = r0.f28645c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28645c = r1
            goto L18
        L13:
            com.waze.map.canvas.k r0 = new com.waze.map.canvas.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28643a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28645c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.map.MapViewChooser r4 = r0.f28646d
            r0 = r4
            com.waze.map.MapViewChooser r0 = (com.waze.map.MapViewChooser) r0
            e.b.c.b(r5)
            goto L55
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r5)
            java.lang.ref.WeakReference r4 = r4.f28647a
            java.lang.Object r4 = r4.get()
            com.waze.map.MapViewChooser r4 = (com.waze.map.MapViewChooser) r4
            if (r4 != 0) goto L47
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            return r4
        L47:
            r5 = r4
            android.view.View r5 = (android.view.View) r5
            r0.f28646d = r4
            r0.f28645c = r3
            java.lang.Object r5 = com.waze.ad.a.j.o(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            android.view.View r4 = (android.view.View) r4
            android.graphics.Rect r4 = com.waze.ad.a.j.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.l.b(h.c.e):java.lang.Object");
    }
}
