package com.waze.reports_v2.presentation.a;

import android.animation.Animator;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.c.dj;
import com.waze.reports_v2.presentation.bp;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34622a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34623b;

    /* renamed from: c, reason: collision with root package name */
    private Object f34624c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f34625d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f34626e;

    public ab(List list, List list2, com.waze.ui.b.a.c cVar) {
        h.g.b.x.f(list, "trafficSegments");
        h.g.b.x.f(list2, "routeEvents");
        this.f34623b = list;
        this.f34622a = list2;
        this.f34626e = cVar;
        this.f34624c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(0.0f), null, 2, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.waze.ui.b.a.l) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.f34625d = arrayList;
    }

    private static final Animator.AnimatorListener s(CompletableDeferred completableDeferred) {
        return new w(completableDeferred);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.waze.reports_v2.presentation.a.x
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.reports_v2.presentation.a.x r0 = (com.waze.reports_v2.presentation.a.x) r0
            int r1 = r0.f34761c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34761c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.a.x r0 = new com.waze.reports_v2.presentation.a.x
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f34759a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34761c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r9)
            goto L6d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            e.b.c.b(r9)
            kotlinx.coroutines.CompletableDeferred r9 = kotlinx.coroutines.bo.j()
            java.lang.Object r2 = r8.f34624c
            if (r2 == 0) goto L64
            android.animation.Animator$AnimatorListener r4 = s(r9)
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            android.view.ViewPropertyAnimator r5 = com.waze.view.anim.g.d(r5)
            r6 = r2
            com.waze.reports_v2.presentation.ap r6 = (com.waze.reports_v2.presentation.ap) r6
            int r6 = r6.getMeasuredWidth()
            float r6 = (float) r6
            android.view.ViewPropertyAnimator r5 = r5.translationX(r6)
            r6 = 0
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            com.waze.g.f r6 = new com.waze.g.f
            r7 = 13
            r6.<init>(r2, r7)
            android.view.ViewPropertyAnimator r2 = r5.withEndAction(r6)
            r2.setListener(r4)
        L64:
            r0.f34761c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L6d
            return r1
        L6d:
            java.lang.Object r8 = r8.f34625d
            r9 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.e(r9)
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.a.ab.a(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.waze.reports_v2.presentation.a.y
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.reports_v2.presentation.a.y r0 = (com.waze.reports_v2.presentation.a.y) r0
            int r1 = r0.f34764c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34764c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.a.y r0 = new com.waze.reports_v2.presentation.a.y
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f34762a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34764c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L65
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            java.lang.Object r2 = r7.f34624c
            if (r2 == 0) goto L5c
            android.animation.Animator$AnimatorListener r4 = s(r8)
            r5 = r2
            com.waze.reports_v2.presentation.ap r5 = (com.waze.reports_v2.presentation.ap) r5
            r5.clearAnimation()
            r6 = 0
            r5.setVisibility(r6)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewPropertyAnimator r2 = com.waze.view.anim.g.d(r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r5)
            r5 = 0
            android.view.ViewPropertyAnimator r2 = r2.translationX(r5)
            r2.setListener(r4)
        L5c:
            r0.f34764c = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            java.lang.Object r7 = r7.f34625d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r7.e(r8)
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.a.ab.b(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9.c(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.waze.reports_v2.presentation.a.z
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.reports_v2.presentation.a.z r0 = (com.waze.reports_v2.presentation.a.z) r0
            int r1 = r0.f34767c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34767c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.a.z r0 = new com.waze.reports_v2.presentation.a.z
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f34765a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34767c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r9)
            goto L7d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            e.b.c.b(r9)
            goto L4d
        L36:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f34625d
            kotlinx.coroutines.b.k r9 = (kotlinx.coroutines.b.k) r9
            com.waze.reports_v2.presentation.a.aa r2 = new com.waze.reports_v2.presentation.a.aa
            r5 = 0
            r2.<init>(r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f34767c = r4
            java.lang.Object r9 = kotlinx.coroutines.b.ai.i(r9, r2, r0)
            if (r9 == r1) goto L80
        L4d:
            kotlinx.coroutines.CompletableDeferred r9 = kotlinx.coroutines.bo.j()
            java.lang.Object r8 = r8.f34624c
            if (r8 == 0) goto L74
            android.animation.Animator$AnimatorListener r2 = s(r9)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewPropertyAnimator r4 = com.waze.view.anim.g.d(r8)
            r5 = 0
            android.view.ViewPropertyAnimator r4 = r4.scaleX(r5)
            android.view.ViewPropertyAnimator r4 = r4.scaleY(r5)
            r4.setListener(r2)
            r6 = 167(0xa7, double:8.25E-322)
            android.view.ViewPropertyAnimator r8 = com.waze.view.anim.g.e(r8, r6)
            r8.alpha(r5)
        L74:
            r0.f34767c = r3
            java.lang.Object r8 = r9.c(r0)
            if (r8 != r1) goto L7d
            goto L80
        L7d:
            h.ab r8 = h.ab.f48028a
            return r8
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.a.ab.c(h.c.e):java.lang.Object");
    }

    public final Object d(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        Object obj = this.f34624c;
        if (obj != null) {
            View view = (View) obj;
            com.waze.view.anim.g.d(view).scaleX(1.0f).scaleY(1.0f).setListener(s(completableDeferredJ));
            com.waze.view.anim.g.e(view, 167L).alpha(1.0f);
        }
        Object objC = completableDeferredJ.c(eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch e() {
        return this.f34623b;
    }

    public final void f(com.waze.reports_v2.presentation.ba baVar) {
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        ((bp) this.f34626e).h(baVar);
    }

    public final void g(com.waze.reports_v2.presentation.ba baVar) {
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        ((bp) this.f34626e).i(baVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    public final void h() {
        ((bp) this.f34626e).j();
        this.f34622a.invoke(dj.f34409a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    public final void i() {
        ((bp) this.f34626e).l();
        this.f34622a.invoke(dj.f34412d);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    public final void j() {
        ((bp) this.f34626e).m();
        this.f34622a.invoke(dj.f34411c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    public final void k() {
        ((bp) this.f34626e).n();
        this.f34622a.invoke(dj.f34410b);
    }

    public final void l(com.waze.reports_v2.presentation.ap apVar) {
        this.f34624c = apVar;
    }

    public final void m(boolean z) {
        ((bp) this.f34626e).k(z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    public final MutableState n() {
        return this.f34624c;
    }

    public final com.waze.ui.b.a.c o() {
        return (com.waze.ui.b.a.c) this.f34626e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List p() {
        return this.f34622a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List q() {
        return this.f34625d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List r() {
        return this.f34623b;
    }

    public ab() {
        this(h.a.i.h(), h.a.i.h(), null);
    }

    public ab(bp bpVar, h.g.a.l lVar) {
        h.g.b.x.f(bpVar, "reportMenuButtonStateHolder");
        h.g.b.x.f(lVar, "onMenuClicked");
        this.f34626e = bpVar;
        this.f34622a = lVar;
        this.f34623b = bpVar.g();
        this.f34625d = ck.b(true);
    }
}
