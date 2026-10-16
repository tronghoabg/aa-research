package com.waze.places;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    private final PlacesNativeManager f33127a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33128b;

    public l(PlacesNativeManager placesNativeManager, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(placesNativeManager, "placesNativeManager");
        h.g.b.x.f(eVar, "logger");
        this.f33127a = placesNativeManager;
        this.f33128b = eVar;
    }

    @Override // com.waze.places.g
    public final Object a(String str, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        ab.removeEvent$default(PlacesNativeManager.INSTANCE, str, new h(completableDeferredJ, 0), null, 4, null);
        return completableDeferredJ.c(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.places.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.places.i
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.places.i r0 = (com.waze.places.i) r0
            int r1 = r0.f33120c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33120c = r1
            goto L18
        L13:
            com.waze.places.i r0 = new com.waze.places.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f33118a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33120c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            com.waze.places.PlacesNativeManager r4 = r4.f33127a
            com.waze.places.ab r4 = (com.waze.places.ab) r4
            r0.f33120c = r3
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.login.b r2 = new com.waze.car_lib.login.b
            r3 = 18
            r2.<init>(r7, r3)
            r4.removeFavorite(r5, r2)
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L5b
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L55
            boolean r4 = r7.booleanValue()
            goto L56
        L55:
            r4 = 0
        L56:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.places.l.b(long, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.places.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.places.j
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.places.j r0 = (com.waze.places.j) r0
            int r1 = r0.f33123c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33123c = r1
            goto L18
        L13:
            com.waze.places.j r0 = new com.waze.places.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f33121a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33123c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            com.waze.places.PlacesNativeManager r4 = r4.f33127a
            com.waze.places.ab r4 = (com.waze.places.ab) r4
            r0.f33123c = r3
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.screens.am r2 = new com.waze.car_lib.screens.am
            r3 = 6
            r2.<init>(r7, r3)
            r4.removeRecentPlace(r5, r2)
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L5a
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L54
            boolean r4 = r7.booleanValue()
            goto L55
        L54:
            r4 = 0
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.places.l.c(long, h.c.e):java.lang.Object");
    }

    @Override // com.waze.places.g
    public final Object d(String str, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        ab.removeEvent$default(PlacesNativeManager.INSTANCE, str, new h(completableDeferredJ, 1), null, 4, null);
        return completableDeferredJ.c(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.places.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.waze.av.b.n r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.places.k
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.places.k r0 = (com.waze.places.k) r0
            int r1 = r0.f33126c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33126c = r1
            goto L18
        L13:
            com.waze.places.k r0 = new com.waze.places.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f33124a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33126c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            e.b.c.b(r8)
            goto L77
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            e.b.c.b(r8)
            goto L60
        L37:
            e.b.c.b(r8)
            boolean r8 = r7 instanceof com.waze.av.b.j
            if (r8 != 0) goto L97
            boolean r8 = r7 instanceof com.waze.av.b.k
            if (r8 == 0) goto L63
            com.waze.places.PlacesNativeManager r6 = r6.f33127a
            com.waze.places.ab r6 = (com.waze.places.ab) r6
            com.waze.jni.protos.places.GenericPlace r7 = com.waze.ac.e.i(r7)
            r0.f33126c = r5
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.login.b r2 = new com.waze.car_lib.login.b
            r4 = 19
            r2.<init>(r8, r4)
            r6.storeFavoritePlace(r7, r2)
            java.lang.Object r8 = r8.c(r0)
            if (r8 == r1) goto L7a
        L60:
            com.waze.jni.protos.places.GenericPlace r8 = (com.waze.jni.protos.places.GenericPlace) r8
            goto L89
        L63:
            boolean r8 = r7 instanceof com.waze.av.b.l
            if (r8 == 0) goto L7b
            com.waze.places.PlacesNativeManager r6 = r6.f33127a
            com.waze.places.ab r6 = (com.waze.places.ab) r6
            com.waze.jni.protos.places.GenericPlace r7 = com.waze.ac.e.i(r7)
            r0.f33126c = r4
            java.lang.Object r8 = com.waze.perf.tracer.a.f(r6, r7, r0)
            if (r8 == r1) goto L7a
        L77:
            com.waze.jni.protos.places.GenericPlace r8 = (com.waze.jni.protos.places.GenericPlace) r8
            goto L89
        L7a:
            return r1
        L7b:
            boolean r7 = r7 instanceof com.waze.av.b.m
            if (r7 == 0) goto L91
            com.waze.shared_infra.i.e r6 = r6.f33128b
            java.lang.String r7 = "Cannot store Standard Place, there is no flow supporting that"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.g(r7)
            r8 = r3
        L89:
            if (r8 == 0) goto L90
            com.waze.av.b.n r6 = com.waze.ac.e.m(r8)
            return r6
        L90:
            return r3
        L91:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        L97:
            h.j r6 = new h.j
            java.lang.String r7 = "An operation is not implemented: TODO(b/273886916): implement the sync way with FF and add the call here"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.places.l.e(com.waze.av.b.n, h.c.e):java.lang.Object");
    }
}
