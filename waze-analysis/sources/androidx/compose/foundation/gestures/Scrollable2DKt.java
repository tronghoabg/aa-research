package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Velocity;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Scrollable2DKt {
    private static final Scroll2DScope NoOpScrollScope = new Scroll2DScope() { // from class: androidx.compose.foundation.gestures.Scrollable2DKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.Scroll2DScope
        /* renamed from: scrollBy-MK-Hz9U */
        public long mo2169scrollByMKHz9U(long j2) {
            return j2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAngle-TH1AsA0, reason: not valid java name */
    public static final float m2291getAngleTH1AsA0(long j2) {
        return (float) Math.atan2(Velocity.m11407getYimpl(j2), Velocity.m11406getXimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMagnitude-TH1AsA0, reason: not valid java name */
    public static final float m2292getMagnitudeTH1AsA0(long j2) {
        return (float) Math.sqrt(((float) Math.pow(Velocity.m11406getXimpl(j2), 2.0d)) + ((float) Math.pow(Velocity.m11407getYimpl(j2), 2.0d)));
    }

    public static final Modifier scrollable2D(Modifier modifier, Scrollable2DState scrollable2DState, boolean z, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        return modifier.then(new Scrollable2DElement(scrollable2DState, overscrollEffect, z, flingBehavior, mutableInteractionSource));
    }

    public static /* synthetic */ Modifier scrollable2D$default(Modifier modifier, Scrollable2DState scrollable2DState, boolean z, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            overscrollEffect = null;
        }
        if ((i2 & 8) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return scrollable2D(modifier, scrollable2DState, z2, overscrollEffect, flingBehavior, mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: semanticsScrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2293semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic2D r6, long r7, h.c.e<? super androidx.compose.ui.geometry.Offset> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.L$0
            h.g.b.ap r6 = (h.g.b.ap) r6
            e.b.c.b(r9)
            goto L58
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            e.b.c.b(r9)
            h.g.b.ap r9 = new h.g.b.ap
            r9.<init>()
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r2.m7996getZeroF1C5BW0()
            r9.f48104a = r4
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2 r4 = new androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2
            r5 = 0
            r4.<init>(r7, r9, r5)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r6 = r6.scroll(r2, r4, r0)
            if (r6 == r1) goto L5f
            r6 = r9
        L58:
            long r6 = r6.f48104a
            androidx.compose.ui.geometry.Offset r6 = androidx.compose.ui.geometry.Offset.m7969boximpl(r6)
            return r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.Scrollable2DKt.m2293semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic2D, long, h.c.e):java.lang.Object");
    }
}
