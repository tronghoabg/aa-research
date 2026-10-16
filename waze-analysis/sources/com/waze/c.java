package com.waze;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18214a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f18215b = h.g.a(new android.support.v4.a.a.c(5));

    public static final boolean c() {
        return ((Boolean) kotlinx.coroutines.aj.t(h.c.k.f48060a, new lw((h.c.e) null, 1, (byte[]) null))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableDeferred e() {
        return (CompletableDeferred) f18215b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.a
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.a r0 = (com.waze.a) r0
            int r1 = r0.f13570c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13570c = r1
            goto L18
        L13:
            com.waze.a r0 = new com.waze.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.f13568a
            h.c.a.a r5 = h.c.a.a.f48038a
            int r1 = r0.f13570c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            e.b.c.b(r4)
            goto L3e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r4)
            kotlinx.coroutines.CompletableDeferred r4 = e()
            r0.f13570c = r2
            java.lang.Object r4 = r4.c(r0)
            if (r4 == r5) goto L49
        L3e:
            com.google.android.gms.a.a.c r4 = (com.google.android.gms.a.a.c) r4
            if (r4 == 0) goto L47
            java.lang.String r4 = r4.a()
            return r4
        L47:
            r4 = 0
            return r4
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.a(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.b
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.b r0 = (com.waze.b) r0
            int r1 = r0.f16135d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16135d = r1
            goto L18
        L13:
            com.waze.b r0 = new com.waze.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.f16133b
            h.c.a.a r6 = h.c.a.a.f48038a
            int r1 = r0.f16135d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r6 = r0.f16132a
            kotlinx.coroutines.CompletableDeferred r6 = (kotlinx.coroutines.CompletableDeferred) r6
            e.b.c.b(r5)
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r5)
            kotlinx.coroutines.CompletableDeferred r5 = e()
            r0.f16132a = r5
            r0.f16135d = r2
            kotlinx.coroutines.ab r1 = kotlinx.coroutines.av.b()
            h.c.j r1 = (h.c.j) r1
            com.waze.md r3 = new com.waze.md
            r4 = 0
            r3.<init>(r4, r2, r4)
            h.g.a.p r3 = (h.g.a.p) r3
            java.lang.Object r0 = kotlinx.coroutines.aj.v(r1, r3, r0)
            if (r0 == r6) goto L5a
            r6 = r5
            r5 = r0
        L54:
            r6.a(r5)
            h.ab r5 = h.ab.f48028a
            return r5
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.b(h.c.e):java.lang.Object");
    }
}
