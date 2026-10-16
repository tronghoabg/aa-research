package com.waze.w;

import com.waze.places.PlacesNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PlacesNativeManager placesNativeManager) {
        super(placesNativeManager);
        h.g.b.x.f(placesNativeManager, "placesNativeManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.w.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.w.k
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.w.k r0 = (com.waze.w.k) r0
            int r1 = r0.f45444c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45444c = r1
            goto L18
        L13:
            com.waze.w.k r0 = new com.waze.w.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45442a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f45444c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L4e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            com.waze.places.PlacesNativeManager r4 = r4.b()
            com.waze.places.ab r4 = (com.waze.places.ab) r4
            r0.f45444c = r3
            kotlinx.coroutines.CompletableDeferred r5 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.login.b r2 = new com.waze.car_lib.login.b
            r3 = 17
            r2.<init>(r5, r3)
            r4.fetchFutureEvents(r2)
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L88
        L4e:
            com.waze.jni.protos.places.GenericPlaces r5 = (com.waze.jni.protos.places.GenericPlaces) r5
            if (r5 != 0) goto L56
            com.waze.jni.protos.places.GenericPlaces r5 = com.waze.jni.protos.places.GenericPlaces.getDefaultInstance()
        L56:
            java.util.List r4 = r5.getGenericPlacesList()
            java.lang.String r5 = "getGenericPlacesList(...)"
            h.g.b.x.e(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            h.m.h r4 = h.a.i.av(r4)
            com.waze.car_lib.r r5 = new com.waze.car_lib.r
            r0 = 9
            r5.<init>(r0)
            h.m.h r4 = h.m.k.p(r4, r5)
            com.waze.w.j r5 = com.waze.w.j.f45441a
            h.g.a.l r5 = (h.g.a.l) r5
            h.m.h r4 = h.m.k.k(r4, r5)
            com.waze.car_lib.r r5 = new com.waze.car_lib.r
            r0 = 10
            r5.<init>(r0)
            h.m.h r4 = h.m.k.k(r4, r5)
            java.util.List r4 = h.m.k.j(r4)
            return r4
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.w.l.a(h.c.e):java.lang.Object");
    }
}
