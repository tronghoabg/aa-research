package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.a.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridDslKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    public final class AnonymousClass3 implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List $items;
        final /* synthetic */ p $span;

        public AnonymousClass3(p pVar, List list) {
            this.$span = pVar;
            this.$items = list;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m2895boximpl(m2904invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m2904invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i2))).m2902unboximpl();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    public final class AnonymousClass8 implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ Object[] $items;
        final /* synthetic */ p $span;

        public AnonymousClass8(p pVar, Object[] objArr) {
            this.$span = pVar;
            this.$items = objArr;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m2895boximpl(m2905invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m2905invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i2])).m2902unboximpl();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    public final class C02823 implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List $items;
        final /* synthetic */ q $span;

        public C02823(q qVar, List list) {
            this.$span = qVar;
            this.$items = list;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m2895boximpl(m2906invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m2906invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            List list = this.$items;
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), list.get(i2))).m2902unboximpl();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    public final class C02878 implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ Object[] $items;
        final /* synthetic */ q $span;

        public C02878(q qVar, Object[] objArr) {
            this.$span = qVar;
            this.$items = objArr;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m2895boximpl(m2907invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m2907invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            Object[] objArr = this.$items;
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), objArr[i2])).m2902unboximpl();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r31, androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.grid.LazyGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Horizontal r36, androidx.compose.foundation.layout.Arrangement.Vertical r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final h.g.a.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, h.ab> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab LazyHorizontalGrid$lambda$0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, l lVar, int i2, int i3, int i4, Composer composer, int i5) {
        LazyHorizontalGrid(gridCells, modifier, lazyGridState, paddingValues, z, horizontal, vertical, flingBehavior, z2, overscrollEffect, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab LazyHorizontalGrid$lambda$1(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyHorizontalGrid(gridCells, modifier, lazyGridState, paddingValues, z, horizontal, vertical, flingBehavior, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r31, androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.grid.LazyGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Vertical r36, androidx.compose.foundation.layout.Arrangement.Horizontal r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final h.g.a.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, h.ab> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab LazyVerticalGrid$lambda$0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, l lVar, int i2, int i3, int i4, Composer composer, int i5) {
        LazyVerticalGrid(gridCells, modifier, lazyGridState, paddingValues, z, vertical, horizontal, flingBehavior, z2, overscrollEffect, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab LazyVerticalGrid$lambda$1(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyVerticalGrid(gridCells, modifier, lazyGridState, paddingValues, z, vertical, horizontal, flingBehavior, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i2, int i3, int i4) {
        int i5 = i2 - (i4 * (i3 - 1));
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }

    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> list, l<? super T, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, l<? super T, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, ab> rVar) {
        lazyGridScope.items(list.size(), lVar != null ? new AnonymousClass2(lVar, list) : null, pVar != null ? new AnonymousClass3(pVar, list) : null, new AnonymousClass4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new AnonymousClass5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, l lVar, p pVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
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
        int size = list.size();
        AnonymousClass2 anonymousClass2 = lVar != null ? new AnonymousClass2(lVar, list) : null;
        if ((i2 & 4) != 0) {
            pVar = null;
        }
        lazyGridScope.items(size, anonymousClass2, pVar != null ? new AnonymousClass3(pVar, list) : null, new AnonymousClass4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new AnonymousClass5(rVar, list)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, ab> sVar) {
        lazyGridScope.items(list.size(), pVar != null ? new C02812(pVar, list) : null, qVar != null ? new C02823(qVar, list) : null, new C02834(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new C02845(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, p pVar, q qVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
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
        int size = list.size();
        C02812 c02812 = pVar != null ? new C02812(pVar, list) : null;
        if ((i2 & 4) != 0) {
            qVar = null;
        }
        lazyGridScope.items(size, c02812, qVar != null ? new C02823(qVar, list) : null, new C02834(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new C02845(sVar, list)));
    }

    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76500289, i2, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i2 & 48) == 32);
        GridSlotCache gridSlotCacheRememberedValue = composer.rememberedValue();
        if (z || gridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            gridSlotCacheRememberedValue = new GridSlotCache(new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyGridDslKt.rememberColumnWidthSums$lambda$0$0(gridCells, horizontal, (Density) obj, (Constraints) obj2);
                }
            });
            composer.updateRememberedValue(gridSlotCacheRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) gridSlotCacheRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSlots rememberColumnWidthSums$lambda$0$0(GridCells gridCells, Arrangement.Horizontal horizontal, Density density, Constraints constraints) {
        if (Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl()) == Integer.MAX_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl());
        int[] iArrAA = i.aA(gridCells.calculateCrossAxisCellSizes(density, iM11107getMaxWidthimpl, density.mo2121roundToPx0680j_4(horizontal.mo2446getSpacingD9Ej5fM())));
        int[] iArr = new int[iArrAA.length];
        horizontal.arrange(density, iM11107getMaxWidthimpl, iArrAA, LayoutDirection.Ltr, iArr);
        return new LazyGridSlots(iArrAA, iArr);
    }

    private static final LazyGridSlotsProvider rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-150818144, i2, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:245)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i2 & 48) == 32);
        GridSlotCache gridSlotCacheRememberedValue = composer.rememberedValue();
        if (z || gridSlotCacheRememberedValue == Composer.Companion.getEmpty()) {
            gridSlotCacheRememberedValue = new GridSlotCache(new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyGridDslKt.rememberRowHeightSums$lambda$0$0(gridCells, vertical, (Density) obj, (Constraints) obj2);
                }
            });
            composer.updateRememberedValue(gridSlotCacheRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) gridSlotCacheRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSlots rememberRowHeightSums$lambda$0$0(GridCells gridCells, Arrangement.Vertical vertical, Density density, Constraints constraints) {
        if (Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl()) == Integer.MAX_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
        }
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl());
        int[] iArrAA = i.aA(gridCells.calculateCrossAxisCellSizes(density, iM11106getMaxHeightimpl, density.mo2121roundToPx0680j_4(vertical.mo2446getSpacingD9Ej5fM())));
        int[] iArr = new int[iArrAA.length];
        vertical.arrange(density, iM11106getMaxHeightimpl, iArrAA, iArr);
        return new LazyGridSlots(iArrAA, iArr);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    public final class AnonymousClass7 implements l<Integer, Object> {
        final /* synthetic */ Object[] $items;
        final /* synthetic */ l $key;

        public AnonymousClass7(l lVar, Object[] objArr) {
            this.$key = lVar;
            this.$items = objArr;
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(this.$items[i2]);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    public final class AnonymousClass9 implements l<Integer, Object> {
        final /* synthetic */ l $contentType;
        final /* synthetic */ Object[] $items;

        public AnonymousClass9(l lVar, Object[] objArr) {
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
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name */
    public final class AnonymousClass2 implements l<Integer, Object> {
        final /* synthetic */ List $items;
        final /* synthetic */ l $key;

        public AnonymousClass2(l lVar, List list) {
            this.$key = lVar;
            this.$items = list;
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(this.$items.get(i2));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    public final class AnonymousClass4 implements l<Integer, Object> {
        final /* synthetic */ l $contentType;
        final /* synthetic */ List $items;

        public AnonymousClass4(l lVar, List list) {
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
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    public final class C02867 implements l<Integer, Object> {
        final /* synthetic */ Object[] $items;
        final /* synthetic */ p $key;

        public C02867(p pVar, Object[] objArr) {
            this.$key = pVar;
            this.$items = objArr;
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), this.$items[i2]);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    public final class C02889 implements l<Integer, Object> {
        final /* synthetic */ p $contentType;
        final /* synthetic */ Object[] $items;

        public C02889(p pVar, Object[] objArr) {
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
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    public final class C02812 implements l<Integer, Object> {
        final /* synthetic */ List $items;
        final /* synthetic */ p $key;

        public C02812(p pVar, List list) {
            this.$key = pVar;
            this.$items = list;
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), this.$items.get(i2));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    public final class C02834 implements l<Integer, Object> {
        final /* synthetic */ p $contentType;
        final /* synthetic */ List $items;

        public C02834(p pVar, List list) {
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

    public static final <T> void items(LazyGridScope lazyGridScope, T[] tArr, l<? super T, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, l<? super T, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, ab> rVar) {
        lazyGridScope.items(tArr.length, lVar != null ? new AnonymousClass7(lVar, tArr) : null, pVar != null ? new AnonymousClass8(pVar, tArr) : null, new AnonymousClass9(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1179065086, true, new AnonymousClass10(rVar, tArr)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, ab> sVar) {
        lazyGridScope.items(tArr.length, pVar != null ? new C02867(pVar, tArr) : null, qVar != null ? new C02878(qVar, tArr) : null, new C02889(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(49283819, true, new C028010(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, l lVar, p pVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
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
        int length = objArr.length;
        AnonymousClass7 anonymousClass7 = lVar != null ? new AnonymousClass7(lVar, objArr) : null;
        if ((i2 & 4) != 0) {
            pVar = null;
        }
        lazyGridScope.items(length, anonymousClass7, pVar != null ? new AnonymousClass8(pVar, objArr) : null, new AnonymousClass9(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1179065086, true, new AnonymousClass10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, p pVar, q qVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
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
        int length = objArr.length;
        C02867 c02867 = pVar != null ? new C02867(pVar, objArr) : null;
        if ((i2 & 4) != 0) {
            qVar = null;
        }
        lazyGridScope.items(length, c02867, qVar != null ? new C02878(qVar, objArr) : null, new C02889(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(49283819, true, new C028010(sVar, objArr)));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    public final class AnonymousClass10 implements r<LazyGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ r $itemContent;
        final /* synthetic */ Object[] $items;

        public AnonymousClass10(r rVar, Object[] objArr) {
            this.$itemContent = rVar;
            this.$items = objArr;
        }

        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyGridItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(1179065086, i4, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:613)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    public final class AnonymousClass5 implements r<LazyGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ r $itemContent;
        final /* synthetic */ List $items;

        public AnonymousClass5(r rVar, List list) {
            this.$itemContent = rVar;
            this.$items = list;
        }

        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyGridItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(-1117249557, i4, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    public final class C028010 implements r<LazyGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ Object[] $items;

        public C028010(s sVar, Object[] objArr) {
            this.$itemContent = sVar;
            this.$items = objArr;
        }

        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyGridItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(49283819, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:650)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    public final class C02845 implements r<LazyGridItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ List $items;

        public C02845(s sVar, List list) {
            this.$itemContent = sVar;
            this.$items = list;
        }

        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyGridItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(-1942245546, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Horizontal r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final h.g.a.l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final h.g.a.l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
