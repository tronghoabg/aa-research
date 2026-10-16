package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.a.s;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2985LazyHorizontalStaggeredGrid121YqSk(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r31, androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Vertical r36, float r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final h.g.a.l<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, h.ab> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m2985LazyHorizontalStaggeredGrid121YqSk(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2986LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final h.g.a.l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m2986LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LazyHorizontalStaggeredGrid_121YqSk$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f2, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, l lVar, int i2, int i3, int i4, Composer composer, int i5) {
        m2985LazyHorizontalStaggeredGrid121YqSk(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, vertical, f2, flingBehavior, z2, overscrollEffect, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f2, FlingBehavior flingBehavior, boolean z2, l lVar, int i2, int i3, Composer composer, int i4) {
        m2986LazyHorizontalStaggeredGridcJHQLPU(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, vertical, f2, flingBehavior, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* renamed from: LazyVerticalStaggeredGrid-6qCrX9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2987LazyVerticalStaggeredGrid6qCrX9Q(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r31, androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, float r36, androidx.compose.foundation.layout.Arrangement.Horizontal r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final h.g.a.l<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, h.ab> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m2987LazyVerticalStaggeredGrid6qCrX9Q(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2988LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final h.g.a.l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m2988LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LazyVerticalStaggeredGrid_6qCrX9Q$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f2, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, l lVar, int i2, int i3, int i4, Composer composer, int i5) {
        m2987LazyVerticalStaggeredGrid6qCrX9Q(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, f2, horizontal, flingBehavior, z2, overscrollEffect, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab LazyVerticalStaggeredGrid_zadm560$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f2, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, l lVar, int i2, int i3, Composer composer, int i4) {
        m2988LazyVerticalStaggeredGridzadm560(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, f2, horizontal, flingBehavior, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, l<? super T, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, ab> rVar) {
        lazyStaggeredGridScope.items(list.size(), lVar != null ? new LazyStaggeredGridDslKt$items$2$1(lVar, list) : null, new AnonymousClass3(lVar2, list), lVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(lVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-334987442, true, new AnonymousClass5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, l lVar, l lVar2, l lVar3, r rVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return null;
                }

                @Override // h.g.a.l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 8) != 0) {
            lVar3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), lVar != null ? new LazyStaggeredGridDslKt$items$2$1(lVar, list) : null, new AnonymousClass3(lVar2, list), lVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(lVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-334987442, true, new AnonymousClass5(rVar, list)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, p<? super Integer, ? super T, StaggeredGridItemSpan> pVar3, s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, ab> sVar) {
        lazyStaggeredGridScope.items(list.size(), pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(pVar, list) : null, new C02973(pVar2, list), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(pVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new C02985(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, p pVar, p pVar2, p pVar3, s sVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                @Override // h.g.a.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    ((Number) obj2).intValue();
                    return null;
                }

                public final Void invoke(int i3, Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 8) != 0) {
            pVar3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(pVar, list) : null, new C02973(pVar2, list), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(pVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new C02985(sVar, list)));
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256);
        LazyStaggeredGridSlotCache lazyStaggeredGridSlotCacheRememberedValue = composer.rememberedValue();
        if (z || lazyStaggeredGridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            lazyStaggeredGridSlotCacheRememberedValue = new LazyStaggeredGridSlotCache(new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyStaggeredGridDslKt.rememberColumnSlots$lambda$0$0(paddingValues, staggeredGridCells, horizontal, (Density) obj, (Constraints) obj2);
                }
            });
            composer.updateRememberedValue(lazyStaggeredGridSlotCacheRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) lazyStaggeredGridSlotCacheRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridSlots rememberColumnSlots$lambda$0$0(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, Density density, Constraints constraints) {
        if (Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl()) == Integer.MAX_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl()) - density.mo2121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(paddingValues, LayoutDirection.Ltr));
        int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, iM11107getMaxWidthimpl, density.mo2121roundToPx0680j_4(horizontal.mo2446getSpacingD9Ej5fM()));
        int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
        horizontal.arrange(density, iM11107getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, LayoutDirection.Ltr, iArr);
        return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:255)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256);
        LazyStaggeredGridSlotCache lazyStaggeredGridSlotCacheRememberedValue = composer.rememberedValue();
        if (z || lazyStaggeredGridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            lazyStaggeredGridSlotCacheRememberedValue = new LazyStaggeredGridSlotCache(new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyStaggeredGridDslKt.rememberRowSlots$lambda$0$0(paddingValues, staggeredGridCells, vertical, (Density) obj, (Constraints) obj2);
                }
            });
            composer.updateRememberedValue(lazyStaggeredGridSlotCacheRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) lazyStaggeredGridSlotCacheRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridSlots rememberRowSlots$lambda$0$0(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, Density density, Constraints constraints) {
        if (Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl()) == Integer.MAX_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
        }
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl()) - density.mo2121roundToPx0680j_4(paddingValues.mo2707calculateTopPaddingD9Ej5fM() + paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
        int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, iM11106getMaxHeightimpl, density.mo2121roundToPx0680j_4(vertical.mo2446getSpacingD9Ej5fM()));
        int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
        vertical.arrange(density, iM11106getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
        return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    public final class AnonymousClass8 implements l<Integer, Object> {
        final /* synthetic */ l $contentType;
        final /* synthetic */ Object[] $items;

        public AnonymousClass8(l lVar, Object[] objArr) {
            this.$contentType = lVar;
            this.$items = objArr;
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items[i2]);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    public final class AnonymousClass3 implements l<Integer, Object> {
        final /* synthetic */ l $contentType;
        final /* synthetic */ List $items;

        public AnonymousClass3(l lVar, List list) {
            this.$contentType = lVar;
            this.$items = list;
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items.get(i2));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    public final class C03008 implements l<Integer, Object> {
        final /* synthetic */ p $contentType;
        final /* synthetic */ Object[] $items;

        public C03008(p pVar, Object[] objArr) {
            this.$contentType = pVar;
            this.$items = objArr;
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items[i2]);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    public final class C02973 implements l<Integer, Object> {
        final /* synthetic */ p $contentType;
        final /* synthetic */ List $items;

        public C02973(p pVar, List list) {
            this.$contentType = pVar;
            this.$items = list;
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items.get(i2));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, l<? super T, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, ab> rVar) {
        lazyStaggeredGridScope.items(tArr.length, lVar != null ? new LazyStaggeredGridDslKt$items$7$1(lVar, tArr) : null, new AnonymousClass8(lVar2, tArr), lVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(lVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-1775984467, true, new AnonymousClass10(rVar, tArr)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, p<? super Integer, ? super T, StaggeredGridItemSpan> pVar3, s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, ab> sVar) {
        lazyStaggeredGridScope.items(tArr.length, pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(pVar, tArr) : null, new C03008(pVar2, tArr), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(pVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(425846862, true, new C029610(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, l lVar, l lVar2, l lVar3, r rVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return null;
                }

                @Override // h.g.a.l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 8) != 0) {
            lVar3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, lVar != null ? new LazyStaggeredGridDslKt$items$7$1(lVar, objArr) : null, new AnonymousClass8(lVar2, objArr), lVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(lVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-1775984467, true, new AnonymousClass10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, p pVar, p pVar2, p pVar3, s sVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                @Override // h.g.a.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    ((Number) obj2).intValue();
                    return null;
                }

                public final Void invoke(int i3, Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 8) != 0) {
            pVar3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(pVar, objArr) : null, new C03008(pVar2, objArr), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(pVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(425846862, true, new C029610(sVar, objArr)));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    public final class AnonymousClass10 implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ r $itemContent;
        final /* synthetic */ Object[] $items;

        public AnonymousClass10(r rVar, Object[] objArr) {
            this.$itemContent = rVar;
            this.$items = objArr;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyStaggeredGridItemScope) ? 2 : 4) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= true != composer.changed(i2) ? 16 : 32;
            }
            if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1775984467, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:472)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    public final class AnonymousClass5 implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ r $itemContent;
        final /* synthetic */ List $items;

        public AnonymousClass5(r rVar, List list) {
            this.$itemContent = rVar;
            this.$items = list;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyStaggeredGridItemScope) ? 2 : 4) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= true != composer.changed(i2) ? 16 : 32;
            }
            if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-334987442, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:400)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    public final class C029610 implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ Object[] $items;

        public C029610(s sVar, Object[] objArr) {
            this.$itemContent = sVar;
            this.$items = objArr;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyStaggeredGridItemScope) ? 2 : 4) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= true != composer.changed(i2) ? 16 : 32;
            }
            if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(425846862, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:508)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    public final class C02985 implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ List $items;

        public C02985(s sVar, List list) {
            this.$itemContent = sVar;
            this.$items = list;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyStaggeredGridItemScope) ? 2 : 4) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= true != composer.changed(i2) ? 16 : 32;
            }
            if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1466459515, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:436)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }
}
