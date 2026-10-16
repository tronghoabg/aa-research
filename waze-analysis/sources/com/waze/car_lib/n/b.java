package com.waze.car_lib.n;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.j.b.a f20390a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.c.e f20391b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.z.a.al f20392c;

    public b(com.waze.j.b.a aVar, com.waze.z.a.al alVar, com.waze.car_lib.c.e eVar) {
        h.g.b.x.f(aVar, "addressAutocompleteRepository");
        h.g.b.x.f(alVar, "autoCompleteFilter");
        h.g.b.x.f(eVar, "autoCompleteAnalyticsSender");
        this.f20390a = aVar;
        this.f20392c = alVar;
        this.f20391b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.car_lib.n.b r5, java.lang.String r6, boolean r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.car_lib.n.a
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.car_lib.n.a r0 = (com.waze.car_lib.n.a) r0
            int r1 = r0.f20338d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20338d = r1
            goto L18
        L13:
            com.waze.car_lib.n.a r0 = new com.waze.car_lib.n.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f20336b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20338d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            boolean r7 = r0.f20335a
            java.lang.String r6 = r0.f20340f
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            com.waze.car_lib.n.b r5 = r0.f20339e
            r0 = r5
            com.waze.car_lib.n.b r0 = (com.waze.car_lib.n.b) r0
            e.b.c.b(r8)
            goto L4f
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            e.b.c.b(r8)
            com.waze.j.b.a r8 = r5.f20390a
            r0.f20339e = r5
            r0.f20340f = r6
            r0.f20335a = r7
            r0.f20338d = r4
            java.lang.Object r8 = r8.b(r6, r7, r3, r0)
            if (r8 == r1) goto L90
        L4f:
            com.waze.z.a.b.n r8 = (com.waze.z.a.b.n) r8
            boolean r0 = r8 instanceof com.waze.w.a
            if (r0 == 0) goto L67
            java.util.List r0 = h.a.i.h()
            com.waze.w.a r8 = (com.waze.w.a) r8
            int r8 = r8.a()
            r5.c(r6, r7, r0, r8)
            java.util.List r5 = h.a.i.h()
            return r5
        L67:
            boolean r0 = r8 instanceof com.waze.w.b
            if (r0 == 0) goto L8a
            com.waze.z.a.al r0 = r5.f20392c
            com.waze.w.b r8 = (com.waze.w.b) r8
            java.util.List r8 = r8.a()
            java.util.List r8 = r0.g(r6, r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.google.firebase.crashlytics.a.c.h r0 = new com.google.firebase.crashlytics.a.c.h
            r1 = 10
            r0.<init>(r1)
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.util.List r8 = h.a.i.al(r8, r0)
            r5.c(r6, r7, r8, r3)
            return r8
        L8a:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.b.a(com.waze.car_lib.n.b, java.lang.String, boolean, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ int b(com.waze.w.i iVar) {
        if (iVar instanceof com.waze.w.f) {
            return 1;
        }
        if ((iVar instanceof com.waze.w.e) || (iVar instanceof com.waze.w.h)) {
            return 2;
        }
        throw new h.i();
    }

    private final void c(String str, boolean z, List list, int i2) {
        this.f20391b.b(str, list.size(), i2, z);
    }
}
