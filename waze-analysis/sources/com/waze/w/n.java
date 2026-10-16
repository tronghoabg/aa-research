package com.waze.w;

import com.waze.places.PlacesNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PlacesNativeManager placesNativeManager) {
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
            boolean r0 = r5 instanceof com.waze.w.m
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.w.m r0 = (com.waze.w.m) r0
            int r1 = r0.f45447c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45447c = r1
            goto L18
        L13:
            com.waze.w.m r0 = new com.waze.w.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45445a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f45447c
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
            r0.f45447c = r3
            kotlinx.coroutines.CompletableDeferred r5 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.login.b r2 = new com.waze.car_lib.login.b
            r3 = 16
            r2.<init>(r5, r3)
            r4.fetchFavorites(r2)
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto Lb4
        L4e:
            com.waze.jni.protos.places.GenericPlaces r5 = (com.waze.jni.protos.places.GenericPlaces) r5
            if (r5 != 0) goto L56
            com.waze.jni.protos.places.GenericPlaces r5 = com.waze.jni.protos.places.GenericPlaces.getDefaultInstance()
        L56:
            java.util.List r4 = r5.getGenericPlacesList()
            java.lang.String r5 = "getGenericPlacesList(...)"
            h.g.b.x.e(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L6c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.next()
            com.waze.jni.protos.places.GenericPlace r0 = (com.waze.jni.protos.places.GenericPlace) r0
            h.g.b.x.c(r0)
            com.waze.av.b.n r0 = com.waze.ac.e.m(r0)
            if (r0 == 0) goto L6c
            r5.add(r0)
            goto L6c
        L85:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L94:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.waze.av.b.n r1 = (com.waze.av.b.n) r1
            java.lang.String r1 = com.waze.ac.e.u(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L94
            r4.add(r0)
            goto L94
        Lb1:
            java.util.List r4 = (java.util.List) r4
            return r4
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.w.n.a(h.c.e):java.lang.Object");
    }
}
