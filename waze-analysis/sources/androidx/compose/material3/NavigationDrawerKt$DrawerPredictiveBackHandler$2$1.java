package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.an;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends g implements p<k<? extends BackEventCompat>, e<? super ab>, Object> {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ an $maxScaleXDistanceGrow;
    final /* synthetic */ an $maxScaleXDistanceShrink;
    final /* synthetic */ an $maxScaleYDistance;
    final /* synthetic */ af $scope;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DrawerPredictiveBackState drawerPredictiveBackState, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$drawerPredictiveBackState = drawerPredictiveBackState;
        }

        static final ab invokeSuspend$lambda$0(DrawerPredictiveBackState drawerPredictiveBackState, float f2, float f3) {
            drawerPredictiveBackState.setScaleXDistance(f2);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$drawerPredictiveBackState, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final DrawerPredictiveBackState drawerPredictiveBackState = this.$drawerPredictiveBackState;
                this.label = 1;
                if (SuspendAnimationKt.animate$default(drawerPredictiveBackState.getScaleXDistance(), 0.0f, 0.0f, null, new p() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2.invokeSuspend$lambda$0(drawerPredictiveBackState, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                }, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            this.$drawerPredictiveBackState.clear();
            return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, af afVar, DrawerState drawerState, boolean z, an anVar, an anVar2, an anVar3, e<? super NavigationDrawerKt$DrawerPredictiveBackHandler$2$1> eVar) {
        super(2, eVar);
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
        this.$scope = afVar;
        this.$drawerState = drawerState;
        this.$isRtl = z;
        this.$maxScaleXDistanceGrow = anVar;
        this.$maxScaleXDistanceShrink = anVar2;
        this.$maxScaleYDistance = anVar3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, eVar);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(k<BackEventCompat> kVar, e<? super ab> eVar) {
        return ((NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) create(kVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r13.$drawerState.close(r13) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r13.$drawerState.close(r13) != r1) goto L33;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            h.c.a.a r1 = h.c.a.a.f48038a
            int r0 = r13.label
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r0 == 0) goto L31
            if (r0 == r4) goto L29
            if (r0 == r3) goto L24
            if (r0 == r5) goto L24
            if (r0 == r2) goto L1b
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L1b:
            java.lang.Object r13 = r13.L$0
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            e.b.c.b(r14)
            goto Lcd
        L24:
            e.b.c.b(r14)
            goto La3
        L29:
            e.b.c.b(r14)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            goto L56
        L2d:
            r0 = move-exception
            r14 = r0
            goto La6
        L31:
            e.b.c.b(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.b.k r14 = (kotlinx.coroutines.b.k) r14
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$1 r7 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$1     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            androidx.compose.material3.DrawerPredictiveBackState r8 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            boolean r9 = r13.$isRtl     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            h.g.b.an r10 = r13.$maxScaleXDistanceGrow     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            h.g.b.an r11 = r13.$maxScaleXDistanceShrink     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            h.g.b.an r12 = r13.$maxScaleYDistance     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            kotlinx.coroutines.b.l r7 = (kotlinx.coroutines.b.l) r7     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            r0 = r13
            h.c.e r0 = (h.c.e) r0     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            r13.label = r4     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            java.lang.Object r14 = r14.collect(r7, r0)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L7a
            if (r14 != r1) goto L56
            goto Lcb
        L56:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L6c
            kotlinx.coroutines.af r14 = r13.$scope
            androidx.compose.material3.DrawerPredictiveBackState r0 = r13.$drawerPredictiveBackState
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 r2 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2
            r2.<init>(r0, r6)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.aj.z(r14, r6, r6, r2, r5)
        L6c:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r0 = r13
            h.c.e r0 = (h.c.e) r0
            r13.label = r3
            java.lang.Object r13 = r14.close(r0)
            if (r13 == r1) goto Lcb
            goto La3
        L7a:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2d
            r14.clear()     // Catch: java.lang.Throwable -> L2d
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L95
            kotlinx.coroutines.af r14 = r13.$scope
            androidx.compose.material3.DrawerPredictiveBackState r0 = r13.$drawerPredictiveBackState
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 r2 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2
            r2.<init>(r0, r6)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.aj.z(r14, r6, r6, r2, r5)
        L95:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r0 = r13
            h.c.e r0 = (h.c.e) r0
            r13.label = r5
            java.lang.Object r13 = r14.close(r0)
            if (r13 != r1) goto La3
            goto Lcb
        La3:
            h.ab r13 = h.ab.f48028a
            return r13
        La6:
            androidx.compose.material3.DrawerPredictiveBackState r0 = r13.$drawerPredictiveBackState
            boolean r0 = r0.getSwipeEdgeMatchesDrawer()
            if (r0 == 0) goto Lbc
            kotlinx.coroutines.af r0 = r13.$scope
            androidx.compose.material3.DrawerPredictiveBackState r3 = r13.$drawerPredictiveBackState
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 r4 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2
            r4.<init>(r3, r6)
            h.g.a.p r4 = (h.g.a.p) r4
            kotlinx.coroutines.aj.z(r0, r6, r6, r4, r5)
        Lbc:
            androidx.compose.material3.DrawerState r0 = r13.$drawerState
            r3 = r13
            h.c.e r3 = (h.c.e) r3
            r13.L$0 = r14
            r13.label = r2
            java.lang.Object r13 = r0.close(r3)
            if (r13 != r1) goto Lcc
        Lcb:
            return r1
        Lcc:
            r13 = r14
        Lcd:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(k<? extends BackEventCompat> kVar, e<? super ab> eVar) {
        return invoke2((k<BackEventCompat>) kVar, eVar);
    }
}
