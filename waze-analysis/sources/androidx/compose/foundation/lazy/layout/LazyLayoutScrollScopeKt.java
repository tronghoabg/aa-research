package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.b.am;
import h.g.b.an;
import h.g.b.ao;
import h.g.b.aq;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutScrollScopeKt {
    private static final float BoundDistance = 1500.0f;
    private static final boolean DEBUG = false;
    private static final float MinimumDistance = 50.0f;
    private static final float TargetDistance = 2500.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyLayoutScrollScopeKt.animateScrollToItem(null, 0, 0, 0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:42:0x0109, B:38:0x00fa], limit reached: 127 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3 A[Catch: ItemFoundInScroll -> 0x01eb, TryCatch #8 {ItemFoundInScroll -> 0x01eb, blocks: (B:32:0x00df, B:34:0x00e3, B:36:0x00e9, B:38:0x00fa, B:46:0x0110, B:53:0x0154), top: B:125:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa A[Catch: ItemFoundInScroll -> 0x01eb, TryCatch #8 {ItemFoundInScroll -> 0x01eb, blocks: (B:32:0x00df, B:34:0x00e3, B:36:0x00e9, B:38:0x00fa, B:46:0x0110, B:53:0x0154), top: B:125:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a6 -> B:18:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollToItem(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r37, int r38, int r39, int r40, androidx.compose.ui.unit.Density r41, h.c.e<? super h.ab> r42) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, int, int, int, androidx.compose.ui.unit.Density, h.c.e):java.lang.Object");
    }

    private static final boolean animateScrollToItem$isOvershot(boolean z, LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3) {
        if (z) {
            if (lazyLayoutScrollScope.getFirstVisibleItemIndex() > i2) {
                return true;
            }
            return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i2 && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() > i3;
        }
        if (lazyLayoutScrollScope.getFirstVisibleItemIndex() < i2) {
            return true;
        }
        return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i2 && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() < i3;
    }

    static final ab animateScrollToItem$lambda$5(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, float f2, an anVar, am amVar, boolean z, float f3, ao aoVar, int i3, int i4, aq aqVar, AnimationScope animationScope) {
        if (!isItemVisible(lazyLayoutScrollScope, i2)) {
            float f4 = (f2 > 0.0f ? n.f(((Number) animationScope.getValue()).floatValue(), f2) : n.e(((Number) animationScope.getValue()).floatValue(), f2)) - anVar.f48102a;
            float fScrollBy = lazyLayoutScrollScope.scrollBy(f4);
            if (!isItemVisible(lazyLayoutScrollScope, i2) && !animateScrollToItem$isOvershot(z, lazyLayoutScrollScope, i2, i4)) {
                if (f4 != fScrollBy) {
                    animationScope.cancelAnimation();
                    amVar.f48101a = false;
                    return ab.f48028a;
                }
                anVar.f48102a += f4;
                if (z) {
                    if (((Number) animationScope.getValue()).floatValue() > f3) {
                        animationScope.cancelAnimation();
                    }
                } else if (((Number) animationScope.getValue()).floatValue() < (-f3)) {
                    animationScope.cancelAnimation();
                }
                if (z) {
                    if (aoVar.f48103a >= 2 && i2 - lazyLayoutScrollScope.getLastVisibleItemIndex() > i3) {
                        lazyLayoutScrollScope.snapToItem(i2 - i3, 0);
                    }
                } else if (aoVar.f48103a >= 2 && lazyLayoutScrollScope.getFirstVisibleItemIndex() - i2 > i3) {
                    lazyLayoutScrollScope.snapToItem(i3 + i2, 0);
                }
            }
        }
        if (!animateScrollToItem$isOvershot(z, lazyLayoutScrollScope, i2, i4)) {
            if (isItemVisible(lazyLayoutScrollScope, i2)) {
                throw new ItemFoundInScroll(LazyLayoutScrollScope.CC.calculateDistanceTo$default(lazyLayoutScrollScope, i2, 0, 2, null), (AnimationState) aqVar.f48105a);
            }
            return ab.f48028a;
        }
        lazyLayoutScrollScope.snapToItem(i2, i4);
        amVar.f48101a = false;
        animationScope.cancelAnimation();
        return ab.f48028a;
    }

    static final ab animateScrollToItem$lambda$7(float f2, an anVar, LazyLayoutScrollScope lazyLayoutScrollScope, AnimationScope animationScope) {
        float fE = 0.0f;
        if (f2 > 0.0f) {
            fE = n.f(((Number) animationScope.getValue()).floatValue(), f2);
        } else if (f2 < 0.0f) {
            fE = n.e(((Number) animationScope.getValue()).floatValue(), f2);
        }
        float f3 = fE - anVar.f48102a;
        if (f3 != lazyLayoutScrollScope.scrollBy(f3) || fE != ((Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        anVar.f48102a += f3;
        return ab.f48028a;
    }

    public static final boolean isItemVisible(LazyLayoutScrollScope lazyLayoutScrollScope, int i2) {
        return i2 <= lazyLayoutScrollScope.getLastVisibleItemIndex() && lazyLayoutScrollScope.getFirstVisibleItemIndex() <= i2;
    }

    private static final void debugLog(a<String> aVar) {
    }
}
