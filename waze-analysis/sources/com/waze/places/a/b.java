package com.waze.places.a;

import com.waze.av.a.p;
import com.waze.av.b.j;
import com.waze.av.b.k;
import com.waze.av.b.l;
import com.waze.av.b.m;
import com.waze.av.b.n;
import com.waze.av.b.z;
import com.waze.navigate.dc;
import com.waze.places.PlacesNativeManager;
import com.waze.shared_infra.i.e;
import h.g;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33096a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f33097b;

    public /* synthetic */ b(PlacesNativeManager placesNativeManager) {
        e eVarD = com.waze.shared_infra.i.a.d("GenericPlaceRecentsUpdater");
        x.e(eVarD, "create(...)");
        x.f(placesNativeManager, "placesNativeManager");
        x.f(eVarD, "logger");
        this.f33096a = placesNativeManager;
        this.f33097b = eVarD;
    }

    private static final l d(n nVar, boolean z) {
        String strE;
        z zVar;
        int iA = -1;
        if (!(nVar instanceof j)) {
            if (nVar instanceof k) {
                Integer numG = ((k) nVar).g();
                if (numG != null) {
                    iA = numG.intValue();
                }
            } else if (nVar instanceof l) {
                iA = ((l) nVar).a();
            } else if (!(nVar instanceof m)) {
                throw new i();
            }
        }
        int i2 = iA;
        k kVar = nVar instanceof k ? (k) nVar : null;
        String str = ((kVar == null || (strE = kVar.h()) == null) && (strE = nVar.e().c().e()) == null) ? "" : strE;
        p pVarE = nVar.e();
        if (nVar.e().c().d() == null || (zVar = z.f16014b) == null) {
            zVar = z.f16013a;
        }
        z zVar2 = zVar;
        String strD = nVar.e().c().d();
        return new l(pVarE, zVar2, str, strD == null ? "" : strD, 0L, i2, z, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r11 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r11 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.av.b.n r9, boolean r10, h.c.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.waze.places.a.a
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.places.a.a r0 = (com.waze.places.a.a) r0
            int r1 = r0.f33095c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33095c = r1
            goto L18
        L13:
            com.waze.places.a.a r0 = new com.waze.places.a.a
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f33093a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33095c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            e.b.c.b(r11)
            goto Lc8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            e.b.c.b(r11)
            goto Lb1
        L3e:
            e.b.c.b(r11)
            goto L94
        L42:
            e.b.c.b(r11)
            goto L77
        L46:
            e.b.c.b(r11)
            java.lang.Object r11 = r8.f33097b
            java.util.Objects.toString(r9)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r7 = "invoked with "
            java.lang.String r2 = r7.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r11.a(r2)
            boolean r11 = r9 instanceof com.waze.av.b.j
            if (r11 == 0) goto L7a
            java.lang.Object r8 = r8.f33096a
            com.waze.places.ab r8 = (com.waze.places.ab) r8
            com.waze.av.b.l r9 = d(r9, r10)
            com.waze.av.b.n r9 = (com.waze.av.b.n) r9
            com.waze.jni.protos.places.GenericPlace r9 = com.waze.ac.e.i(r9)
            r0.f33095c = r6
            java.lang.Object r11 = com.waze.perf.tracer.a.f(r8, r9, r0)
            if (r11 == r1) goto Ld3
        L77:
            com.waze.jni.protos.places.GenericPlace r11 = (com.waze.jni.protos.places.GenericPlace) r11
            goto Lca
        L7a:
            boolean r11 = r9 instanceof com.waze.av.b.m
            if (r11 == 0) goto L97
            java.lang.Object r8 = r8.f33096a
            com.waze.places.ab r8 = (com.waze.places.ab) r8
            com.waze.av.b.l r9 = d(r9, r10)
            com.waze.av.b.n r9 = (com.waze.av.b.n) r9
            com.waze.jni.protos.places.GenericPlace r9 = com.waze.ac.e.i(r9)
            r0.f33095c = r5
            java.lang.Object r11 = com.waze.perf.tracer.a.f(r8, r9, r0)
            if (r11 == r1) goto Ld3
        L94:
            com.waze.jni.protos.places.GenericPlace r11 = (com.waze.jni.protos.places.GenericPlace) r11
            goto Lca
        L97:
            boolean r11 = r9 instanceof com.waze.av.b.k
            if (r11 == 0) goto Lb4
            java.lang.Object r8 = r8.f33096a
            com.waze.places.ab r8 = (com.waze.places.ab) r8
            com.waze.av.b.l r9 = d(r9, r10)
            com.waze.av.b.n r9 = (com.waze.av.b.n) r9
            com.waze.jni.protos.places.GenericPlace r9 = com.waze.ac.e.i(r9)
            r0.f33095c = r4
            java.lang.Object r11 = com.waze.perf.tracer.a.f(r8, r9, r0)
            if (r11 == r1) goto Ld3
        Lb1:
            com.waze.jni.protos.places.GenericPlace r11 = (com.waze.jni.protos.places.GenericPlace) r11
            goto Lca
        Lb4:
            boolean r10 = r9 instanceof com.waze.av.b.l
            if (r10 == 0) goto Ld4
            java.lang.Object r8 = r8.f33096a
            com.waze.places.ab r8 = (com.waze.places.ab) r8
            com.waze.jni.protos.places.GenericPlace r9 = com.waze.ac.e.i(r9)
            r0.f33095c = r3
            java.lang.Object r11 = com.waze.perf.tracer.a.f(r8, r9, r0)
            if (r11 == r1) goto Ld3
        Lc8:
            com.waze.jni.protos.places.GenericPlace r11 = (com.waze.jni.protos.places.GenericPlace) r11
        Lca:
            if (r11 == 0) goto Ld1
            com.waze.av.b.n r8 = com.waze.ac.e.m(r11)
            return r8
        Ld1:
            r8 = 0
            return r8
        Ld3:
            return r1
        Ld4:
            h.i r8 = new h.i
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.places.a.b.a(com.waze.av.b.n, boolean, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final String b() {
        Object value = this.f33097b.getValue();
        x.e(value, "getValue(...)");
        return (String) value;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean c() {
        Object value = this.f33096a.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public b() {
        this.f33097b = g.a(new dc(1));
        this.f33096a = g.a(new dc(2));
    }
}
