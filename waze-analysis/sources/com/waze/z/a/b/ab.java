package com.waze.z.a.b;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final AnchoredDraggableState f45719a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f45720b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45721c;

    /* renamed from: d, reason: collision with root package name */
    private FlingBehavior f45722d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableState f45723e;

    /* renamed from: f, reason: collision with root package name */
    private final MutableState f45724f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableState f45725g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f45726h;

    public ab(ad adVar, m mVar) {
        h.g.b.x.f(adVar, "initialValue");
        h.g.b.x.f(mVar, "initialAnchors");
        this.f45719a = new AnchoredDraggableState(adVar);
        this.f45720b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.f45723e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.f45724f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mVar, null, 2, null);
        this.f45725g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final void A(boolean z) {
        this.f45720b.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Integer x() {
        return (Integer) this.f45725g.getValue();
    }

    private final Object y(ad adVar, h.c.e eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.f45719a, adVar, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
    }

    private final void z(boolean z) {
        this.f45723e.setValue(Boolean.valueOf(z));
    }

    public final float a() {
        return h.k.n.e((x() != null ? r0.intValue() : 0) - b(), 0.0f);
    }

    public final float b() {
        return this.f45719a.getOffset();
    }

    public final float c() {
        Integer numX = x();
        if (numX == null) {
            return 0.0f;
        }
        if (numX.intValue() == 0) {
            numX = null;
        }
        if (numX == null) {
            return 0.0f;
        }
        return b() / numX.intValue();
    }

    public final AnchoredDraggableState d() {
        return this.f45719a;
    }

    public final FlingBehavior e() {
        return this.f45722d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m f() {
        return (m) this.f45724f.getValue();
    }

    public final ad g() {
        return (ad) this.f45719a.getCurrentValue();
    }

    public final ad h() {
        return (ad) this.f45719a.getSettledValue();
    }

    public final ad i() {
        return (ad) this.f45719a.getTargetValue();
    }

    public final Float j(ad adVar) {
        Float fValueOf;
        h.g.b.x.f(adVar, "value");
        Integer numX = x();
        if (numX != null) {
            float fIntValue = numX.intValue();
            h.g.b.x.f(adVar, "value");
            fValueOf = Float.valueOf(fIntValue - this.f45719a.getAnchors().positionOf(adVar));
        } else {
            fValueOf = null;
        }
        if (fValueOf == null || Float.isNaN(fValueOf.floatValue())) {
            return null;
        }
        return fValueOf;
    }

    public final Object k(h.c.e eVar) {
        Object objY = y(ad.f45734b, eVar);
        return objY == h.c.a.a.f48038a ? objY : h.ab.f48028a;
    }

    public final Object l(h.c.e eVar) {
        Object objY = y(ad.f45736d, eVar);
        return objY == h.c.a.a.f48038a ? objY : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.z.a.b.z
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.z.a.b.z r0 = (com.waze.z.a.b.z) r0
            int r1 = r0.f45796c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45796c = r1
            goto L18
        L13:
            com.waze.z.a.b.z r0 = new com.waze.z.a.b.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45794a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f45796c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            r4.A(r3)
            com.waze.z.a.b.m r5 = r4.f()
            com.waze.z.a.b.ad r2 = com.waze.z.a.b.ad.f45734b
            r4.s(r5, r2)
            com.waze.z.a.b.ad r5 = com.waze.z.a.b.ad.f45733a
            r0.f45796c = r3
            java.lang.Object r5 = r4.y(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r4.f45721c = r3
            com.waze.z.a.b.m r5 = r4.f()
            com.waze.z.a.b.ad r0 = com.waze.z.a.b.ad.f45733a
            r4.s(r5, r0)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.b.ab.m(h.c.e):java.lang.Object");
    }

    public final Object n(h.c.e eVar) {
        ad adVar = (ad) this.f45719a.getCurrentValue();
        ad adVar2 = ad.f45733a;
        int iOrdinal = adVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            Object objY = y(ad.f45735c, eVar);
            if (objY == h.c.a.a.f48038a) {
                return objY;
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            Object objY2 = y(ad.f45735c, eVar);
            if (objY2 == h.c.a.a.f48038a) {
                return objY2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.z.a.b.aa
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.z.a.b.aa r0 = (com.waze.z.a.b.aa) r0
            int r1 = r0.f45718c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45718c = r1
            goto L18
        L13:
            com.waze.z.a.b.aa r0 = new com.waze.z.a.b.aa
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f45716a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f45718c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L67
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            boolean r6 = r5.f45721c
            if (r6 != 0) goto L4d
            boolean r6 = r5.v()
            if (r6 != 0) goto L4d
            com.waze.z.a.b.ad r6 = r5.g()
            com.waze.z.a.b.ad r2 = com.waze.z.a.b.ad.f45733a
            if (r6 == r2) goto L4d
            com.waze.z.a.b.ad r6 = r5.i()
            if (r6 == r2) goto L4d
            h.ab r5 = h.ab.f48028a
            return r5
        L4d:
            r6 = 0
            r5.f45721c = r6
            com.waze.z.a.b.m r2 = r5.f()
            com.waze.z.a.b.ad r4 = com.waze.z.a.b.ad.f45733a
            r5.s(r2, r4)
            r5.A(r6)
            com.waze.z.a.b.ad r6 = com.waze.z.a.b.ad.f45734b
            r0.f45718c = r3
            java.lang.Object r6 = r5.y(r6, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            com.waze.z.a.b.m r6 = r5.f()
            com.waze.z.a.b.ad r0 = com.waze.z.a.b.ad.f45734b
            r5.s(r6, r0)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.b.ab.o(h.c.e):java.lang.Object");
    }

    public final void p() {
        z(false);
    }

    public final void q() {
        z(true);
    }

    public final void r(FlingBehavior flingBehavior) {
        this.f45722d = flingBehavior;
    }

    public final void s(m mVar, ad adVar) {
        h.g.b.x.f(mVar, "newAnchors");
        this.f45724f.setValue(mVar);
        Integer numX = x();
        if (numX != null) {
            if (numX.intValue() <= 0) {
                numX = null;
            }
            if (numX != null) {
                final int iIntValue = numX.intValue();
                Integer num = this.f45726h;
                final boolean z = this.f45721c;
                final boolean zV = v();
                float f2 = iIntValue;
                float fA = (1.0f - mVar.b().a()) * f2;
                int iH = h.k.n.h(h.k.n.h((iIntValue - mVar.a().a()) - (num != null ? num.intValue() : 0), 0), 0);
                final float fE = h.k.n.e(f2 * 0.0f, 0.0f);
                final float f3 = iH;
                final float fE2 = h.k.n.e(fA, 0.0f);
                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new h.g.a.l() { // from class: com.waze.z.a.b.ac
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                        h.g.b.x.f(draggableAnchorsConfig, "$this$DraggableAnchors");
                        draggableAnchorsConfig.at(ad.f45736d, fE);
                        draggableAnchorsConfig.at(ad.f45735c, fE2);
                        if (!z) {
                            draggableAnchorsConfig.at(ad.f45734b, f3);
                        }
                        if (zV) {
                            draggableAnchorsConfig.at(ad.f45733a, iIntValue);
                        }
                        return h.ab.f48028a;
                    }
                });
                AnchoredDraggableState anchoredDraggableState = this.f45719a;
                if (adVar == null) {
                    adVar = (ad) anchoredDraggableState.getSettledValue();
                }
                anchoredDraggableState.updateAnchors(DraggableAnchors, adVar);
            }
        }
    }

    public final void t(Integer num, Integer num2) {
        boolean z = true;
        if (h.g.b.x.n(num, x()) && h.g.b.x.n(num2, this.f45726h)) {
            z = false;
        }
        this.f45725g.setValue(num);
        this.f45726h = num2;
        if (z) {
            s(f(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.f45723e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.f45720b.getValue()).booleanValue();
    }
}
