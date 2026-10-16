package com.waze.trip_overview.c;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.transition.Transition;
import h.ab;
import h.g.b.x;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f41281a;

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f41282b;

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.2f, 0.2f, 0.0f, 1.0f);
        x.e(interpolatorCreate, "create(...)");
        f41281a = interpolatorCreate;
        Interpolator interpolatorCreate2 = PathInterpolatorCompat.create(0.8f, 0.0f, 1.0f, 0.8f);
        x.e(interpolatorCreate2, "create(...)");
        f41282b = interpolatorCreate2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (com.waze.ad.a.j.n(r5, r0) == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.view.View r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.trip_overview.c.c
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.trip_overview.c.c r0 = (com.waze.trip_overview.c.c) r0
            int r1 = r0.f41280d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41280d = r1
            goto L18
        L13:
            com.waze.trip_overview.c.c r0 = new com.waze.trip_overview.c.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.f41278b
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.f41280d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            e.b.c.b(r5)
            goto L7b
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.f41277a
            android.view.View r6 = (android.view.View) r6
            e.b.c.b(r5)
            goto L47
        L3a:
            e.b.c.b(r5)
            r0.f41277a = r6
            r0.f41280d = r3
            java.lang.Object r5 = com.waze.ad.a.j.o(r6, r0)
            if (r5 == r7) goto L7e
        L47:
            int r5 = r6.getHeight()
            float r5 = (float) r5
            r6.setTranslationY(r5)
            android.view.ViewPropertyAnimator r5 = r6.animate()
            r6 = 0
            android.view.ViewPropertyAnimator r5 = r5.translationY(r6)
            r3 = 400(0x190, double:1.976E-321)
            android.view.ViewPropertyAnimator r5 = r5.setStartDelay(r3)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r3)
            android.view.animation.Interpolator r6 = com.waze.trip_overview.c.d.f41281a
            android.animation.TimeInterpolator r6 = (android.animation.TimeInterpolator) r6
            android.view.ViewPropertyAnimator r5 = r5.setInterpolator(r6)
            java.lang.String r6 = "setInterpolator(...)"
            h.g.b.x.e(r5, r6)
            r6 = 0
            r0.f41277a = r6
            r0.f41280d = r2
            java.lang.Object r5 = com.waze.ad.a.j.n(r5, r0)
            if (r5 != r7) goto L7b
            goto L7e
        L7b:
            h.ab r5 = h.ab.f48028a
            return r5
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.d.g(android.view.View, h.c.e):java.lang.Object");
    }

    @Override // com.waze.trip_overview.c.e
    public final Transition c(Set set) {
        x.f(set, "bottomSheetViewIds");
        a aVar = new a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.addTarget(((Number) it.next()).intValue());
        }
        return aVar;
    }

    @Override // com.waze.trip_overview.c.e
    public final Object d(View view, h.c.e eVar) {
        Object objG = g(view, eVar);
        return objG == h.c.a.a.f48038a ? objG : ab.f48028a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (com.waze.ad.a.j.n(r5, r0) == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.trip_overview.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.view.View r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.trip_overview.c.b
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.trip_overview.c.b r0 = (com.waze.trip_overview.c.b) r0
            int r1 = r0.f41276d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41276d = r1
            goto L18
        L13:
            com.waze.trip_overview.c.b r0 = new com.waze.trip_overview.c.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.f41274b
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.f41276d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            e.b.c.b(r5)
            goto L87
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.f41273a
            android.view.View r6 = (android.view.View) r6
            e.b.c.b(r5)
            goto L47
        L3a:
            e.b.c.b(r5)
            r0.f41273a = r6
            r0.f41276d = r3
            java.lang.Object r5 = com.waze.ad.a.j.o(r6, r0)
            if (r5 == r7) goto L8a
        L47:
            r5 = 1128792064(0x43480000, float:200.0)
            r6.setTranslationY(r5)
            r5 = 0
            r6.setAlpha(r5)
            android.view.ViewPropertyAnimator r6 = r6.animate()
            android.view.ViewPropertyAnimator r5 = r6.translationY(r5)
            android.view.animation.OvershootInterpolator r6 = new android.view.animation.OvershootInterpolator
            r1 = 1072064102(0x3fe66666, float:1.8)
            r6.<init>(r1)
            android.animation.TimeInterpolator r6 = (android.animation.TimeInterpolator) r6
            android.view.ViewPropertyAnimator r5 = r5.setInterpolator(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            r3 = 400(0x190, double:1.976E-321)
            android.view.ViewPropertyAnimator r5 = r5.setStartDelay(r3)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r3)
            java.lang.String r6 = "setDuration(...)"
            h.g.b.x.e(r5, r6)
            r6 = 0
            r0.f41273a = r6
            r0.f41276d = r2
            java.lang.Object r5 = com.waze.ad.a.j.n(r5, r0)
            if (r5 != r7) goto L87
            goto L8a
        L87:
            h.ab r5 = h.ab.f48028a
            return r5
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.d.e(android.view.View, h.c.e):java.lang.Object");
    }
}
