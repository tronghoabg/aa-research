package com.waze.settings.f.b;

import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37228a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f37229b;

    public e(l lVar, g gVar) {
        this.f37228a = lVar;
        this.f37229b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r10, h.c.e r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.waze.settings.f.b.d
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.settings.f.b.d r0 = (com.waze.settings.f.b.d) r0
            int r1 = r0.f37226b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37226b = r1
            goto L18
        L13:
            com.waze.settings.f.b.d r0 = new com.waze.settings.f.b.d
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f37225a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f37226b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r11)
            goto L82
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            e.b.c.b(r11)
            kotlinx.coroutines.b.l r11 = r9.f37228a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r10 = r10.iterator()
        L46:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r10.next()
            java.lang.String r4 = (java.lang.String) r4
            com.waze.settings.f.b.g r5 = r9.f37229b
            java.lang.String r6 = com.waze.settings.f.b.g.f(r5, r4)
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L63
            r4 = 0
            goto L71
        L63:
            com.waze.settings.f.b.a r7 = new com.waze.settings.f.b.a
            boolean r8 = com.waze.settings.f.b.g.g(r5, r4)
            boolean r5 = com.waze.settings.f.b.g.h(r5, r4)
            r7.<init>(r4, r6, r8, r5)
            r4 = r7
        L71:
            if (r4 == 0) goto L46
            r2.add(r4)
            goto L46
        L77:
            java.util.List r2 = (java.util.List) r2
            r0.f37226b = r3
            java.lang.Object r9 = r11.emit(r2, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            h.ab r9 = h.ab.f48028a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.f.b.e.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
