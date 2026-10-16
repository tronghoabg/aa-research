package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 implements FlingBehavior {
    final /* synthetic */ TargetedFlingBehavior $anchoredDraggableFlingBehavior;
    final /* synthetic */ Density $density;
    final /* synthetic */ a<ab> $onDismissRequest;
    final /* synthetic */ SheetState $state;
    final /* synthetic */ ViewConfiguration $viewConfiguration;

    BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1(ViewConfiguration viewConfiguration, SheetState sheetState, Density density, TargetedFlingBehavior targetedFlingBehavior, a<ab> aVar) {
        this.$viewConfiguration = viewConfiguration;
        this.$state = sheetState;
        this.$density = density;
        this.$anchoredDraggableFlingBehavior = targetedFlingBehavior;
        this.$onDismissRequest = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r7, float r8, h.c.e<? super java.lang.Float> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1 r0 = (androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1 r0 = new androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L28
            goto Lb4
        L28:
            r7 = move-exception
            goto Lce
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            e.b.c.b(r9)
            androidx.compose.ui.platform.ViewConfiguration r9 = r6.$viewConfiguration
            float r9 = r9.getMaximumFlingVelocity()
            h.g.b.an r2 = new h.g.b.an
            r2.<init>()
            float r4 = -r9
            float r9 = h.k.n.g(r8, r4, r9)
            r2.f48102a = r9
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto La8
            androidx.compose.material3.SheetState r9 = r6.$state
            androidx.compose.foundation.gestures.AnchoredDraggableState r9 = r9.getAnchoredDraggableState$material3()
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r9.getAnchors()
            androidx.compose.material3.SheetValue r5 = androidx.compose.material3.SheetValue.Hidden
            boolean r9 = r9.hasPositionFor(r5)
            if (r9 == 0) goto La8
            androidx.compose.material3.SheetState r9 = r6.$state
            androidx.compose.foundation.gestures.AnchoredDraggableState r9 = r9.getAnchoredDraggableState$material3()
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r9.getAnchors()
            androidx.compose.material3.SheetValue r5 = androidx.compose.material3.SheetValue.Hidden
            float r9 = r9.positionOf(r5)
            androidx.compose.material3.SheetState r5 = r6.$state
            float r5 = r5.requireOffset()
            float r9 = r9 - r5
            float r9 = java.lang.Math.max(r4, r9)
            androidx.compose.ui.unit.Density r4 = r6.$density
            androidx.compose.material3.BottomSheetDefaults r5 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            float r5 = r5.m4389getBoundaryDampeningZoneD9Ej5fM$material3()
            float r4 = r4.mo2127toPx0680j_4(r5)
            int r5 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r5 >= 0) goto La8
            float r9 = r9 / r4
            float r4 = r2.f48102a
            float r4 = r4 * r9
            r2.f48102a = r4
            androidx.compose.ui.unit.Density r9 = r6.$density
            androidx.compose.material3.BottomSheetDefaults r4 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            float r4 = r4.m4394getVelocityThresholdD9Ej5fM$material3()
            float r9 = r9.mo2127toPx0680j_4(r4)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto La8
            float r8 = r2.f48102a
            float r8 = java.lang.Math.max(r8, r9)
            r2.f48102a = r8
        La8:
            androidx.compose.foundation.gestures.TargetedFlingBehavior r8 = r6.$anchoredDraggableFlingBehavior     // Catch: java.lang.Throwable -> L28
            float r9 = r2.f48102a     // Catch: java.lang.Throwable -> L28
            r0.label = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r8.performFling(r7, r9, r0)     // Catch: java.lang.Throwable -> L28
            if (r9 == r1) goto Lcd
        Lb4:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L28
            float r7 = r9.floatValue()     // Catch: java.lang.Throwable -> L28
            androidx.compose.material3.SheetState r8 = r6.$state
            boolean r8 = r8.isVisible()
            if (r8 != 0) goto Lc7
            h.g.a.a<h.ab> r6 = r6.$onDismissRequest
            r6.invoke()
        Lc7:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
        Lcd:
            return r1
        Lce:
            androidx.compose.material3.SheetState r8 = r6.$state
            boolean r8 = r8.isVisible()
            if (r8 == 0) goto Ld7
            goto Ldc
        Ld7:
            h.g.a.a<h.ab> r6 = r6.$onDismissRequest
            r6.invoke()
        Ldc:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1.performFling(androidx.compose.foundation.gestures.ScrollScope, float, h.c.e):java.lang.Object");
    }
}
