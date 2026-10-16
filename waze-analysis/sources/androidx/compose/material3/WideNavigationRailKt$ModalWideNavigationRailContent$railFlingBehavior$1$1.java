package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import h.ab;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 implements FlingBehavior {
    final /* synthetic */ TargetedFlingBehavior $anchoredDraggableFlingBehavior;
    final /* synthetic */ l<e<? super ab>, Object> $modalAnimateToDismiss;

    /* JADX WARN: Multi-variable type inference failed */
    WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1(TargetedFlingBehavior targetedFlingBehavior, l<? super e<? super ab>, ? extends Object> lVar) {
        this.$anchoredDraggableFlingBehavior = targetedFlingBehavior;
        this.$modalAnimateToDismiss = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r7, float r8, h.c.e<? super java.lang.Float> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1 r0 = (androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1 r0 = new androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            e.b.c.b(r9)
            goto L7a
        L39:
            float r6 = r0.F$0
            e.b.c.b(r9)
            goto L66
        L3f:
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L43
            goto L53
        L43:
            r7 = move-exception
            goto L6c
        L45:
            e.b.c.b(r9)
            androidx.compose.foundation.gestures.TargetedFlingBehavior r9 = r6.$anchoredDraggableFlingBehavior     // Catch: java.lang.Throwable -> L43
            r0.label = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r9 = r9.performFling(r7, r8, r0)     // Catch: java.lang.Throwable -> L43
            if (r9 != r1) goto L53
            goto L78
        L53:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L43
            float r7 = r9.floatValue()     // Catch: java.lang.Throwable -> L43
            h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r6 = r6.$modalAnimateToDismiss
            r0.F$0 = r7
            r0.label = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 == r1) goto L78
            r6 = r7
        L66:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        L6c:
            h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r6 = r6.$modalAnimateToDismiss
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L79
        L78:
            return r1
        L79:
            r6 = r7
        L7a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1.performFling(androidx.compose.foundation.gestures.ScrollScope, float, h.c.e):java.lang.Object");
    }
}
