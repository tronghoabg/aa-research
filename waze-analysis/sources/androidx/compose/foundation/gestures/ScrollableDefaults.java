package androidx.compose.foundation.gestures;

import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    /* compiled from: WazeSource */
    final class NoOpOverscrollEffect implements OverscrollEffect {
        public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

        private NoOpOverscrollEffect() {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToFling-BMRW4eQ */
        public Object mo1949applyToFlingBMRW4eQ(long j2, p<? super Velocity, ? super e<? super Velocity>, ? extends Object> pVar, e<? super ab> eVar) {
            Object objInvoke = pVar.invoke(Velocity.m11397boximpl(j2), eVar);
            return objInvoke == a.f48038a ? objInvoke : ab.f48028a;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToScroll-Rhakbz0 */
        public long mo1950applyToScrollRhakbz0(long j2, int i2, l<? super Offset, Offset> lVar) {
            return lVar.invoke(Offset.m7969boximpl(j2)).m7990unboximpl();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public /* synthetic */ Modifier getEffectModifier() {
            return Modifier.Companion;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public DelegatableNode getNode() {
            return new Modifier.Node() { // from class: androidx.compose.foundation.gestures.ScrollableDefaults$NoOpOverscrollEffect$node$1
            };
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }
    }

    private ScrollableDefaults() {
    }

    public final FlingBehavior flingBehavior(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107739818, i2, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:615)");
        }
        FlingBehavior flingBehaviorRememberPlatformDefaultFlingBehavior = Scrollable_androidKt.rememberPlatformDefaultFlingBehavior(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flingBehaviorRememberPlatformDefaultFlingBehavior;
    }

    public final OverscrollEffect overscrollEffect(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, i2, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:632)");
        }
        NoOpOverscrollEffect noOpOverscrollEffectRememberPlatformOverscrollEffect = AndroidOverscroll_androidKt.rememberPlatformOverscrollEffect(composer, 0);
        if (noOpOverscrollEffectRememberPlatformOverscrollEffect == null) {
            noOpOverscrollEffectRememberPlatformOverscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return noOpOverscrollEffectRememberPlatformOverscrollEffect;
    }

    public final boolean reverseDirection(LayoutDirection layoutDirection, Orientation orientation, boolean z) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z : z;
    }
}
