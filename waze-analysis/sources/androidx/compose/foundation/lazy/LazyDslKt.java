package androidx.compose.foundation.lazy;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.a.s;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(androidx.compose.ui.Modifier r31, androidx.compose.foundation.lazy.LazyListState r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, androidx.compose.foundation.layout.Arrangement.Vertical r35, androidx.compose.ui.Alignment.Horizontal r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, androidx.compose.foundation.OverscrollEffect r39, final h.g.a.l<? super androidx.compose.foundation.lazy.LazyListScope, h.ab> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LazyColumn$lambda$0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, overscrollEffect, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LazyColumn$lambda$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LazyColumn$lambda$2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(androidx.compose.ui.Modifier r31, androidx.compose.foundation.lazy.LazyListState r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, androidx.compose.foundation.layout.Arrangement.Horizontal r35, androidx.compose.ui.Alignment.Vertical r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, androidx.compose.foundation.OverscrollEffect r39, final h.g.a.l<? super androidx.compose.foundation.lazy.LazyListScope, h.ab> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LazyRow$lambda$0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z2, overscrollEffect, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LazyRow$lambda$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LazyRow$lambda$2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, l lVar, int i2, int i3, Composer composer, int i4) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, l lVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar2 = AnonymousClass1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(list.size(), lVar != null ? new AnonymousClass2(lVar, list) : null, new AnonymousClass3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new AnonymousClass4(rVar, list)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, ab> sVar) {
        lazyListScope.items(list.size(), pVar != null ? new C02692(pVar, list) : null, new C02703(pVar2, list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new C02714(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
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
        lazyListScope.items(list.size(), pVar != null ? new C02692(pVar, list) : null, new C02703(pVar2, list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new C02714(sVar, list)));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name */
    public final class AnonymousClass1 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }

        @Override // h.g.a.l
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5, reason: invalid class name */
    public final class AnonymousClass5 implements l {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }

        @Override // h.g.a.l
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6, reason: invalid class name */
    public final class AnonymousClass6 implements l<Integer, Object> {
        final /* synthetic */ Object[] $items;
        final /* synthetic */ l $key;

        public AnonymousClass6(l lVar, Object[] objArr) {
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7, reason: invalid class name */
    public final class AnonymousClass7 implements l<Integer, Object> {
        final /* synthetic */ l $contentType;
        final /* synthetic */ Object[] $items;

        public AnonymousClass7(l lVar, Object[] objArr) {
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name */
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name */
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6, reason: invalid class name and case insensitive filesystem */
    public final class C02736 implements l<Integer, Object> {
        final /* synthetic */ Object[] $items;
        final /* synthetic */ p $key;

        public C02736(p pVar, Object[] objArr) {
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    public final class C02747 implements l<Integer, Object> {
        final /* synthetic */ p $contentType;
        final /* synthetic */ Object[] $items;

        public C02747(p pVar, Object[] objArr) {
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    public final class C02692 implements l<Integer, Object> {
        final /* synthetic */ List $items;
        final /* synthetic */ p $key;

        public C02692(p pVar, List list) {
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
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    public final class C02703 implements l<Integer, Object> {
        final /* synthetic */ p $contentType;
        final /* synthetic */ List $items;

        public C02703(p pVar, List list) {
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

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, ab> rVar) {
        lazyListScope.items(list.size(), lVar != null ? new AnonymousClass2(lVar, list) : null, new AnonymousClass3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new AnonymousClass4(rVar, list)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, ab> sVar) {
        lazyListScope.items(tArr.length, pVar != null ? new C02736(pVar, tArr) : null, new C02747(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1763000017, true, new C02758(sVar, tArr)));
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, ab> rVar) {
        lazyListScope.items(tArr.length, lVar != null ? new AnonymousClass6(lVar, tArr) : null, new AnonymousClass7(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new AnonymousClass8(rVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, l lVar, r rVar, int i2, Object obj) {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        int i3 = i2 & 2;
        int size = list.size();
        if (i3 != 0) {
            lVar = null;
        }
        lazyListScope.items(size, lVar != null ? new AnonymousClass2(lVar, list) : null, new AnonymousClass3(anonymousClass1, list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new AnonymousClass4(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, s sVar, int i2, Object obj) {
        int i3 = i2 & 2;
        int size = list.size();
        if (i3 != 0) {
            pVar = null;
        }
        lazyListScope.items(size, pVar != null ? new C02692(pVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new C02714(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
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
        lazyListScope.items(objArr.length, pVar != null ? new C02736(pVar, objArr) : null, new C02747(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1763000017, true, new C02758(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, l lVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar2 = AnonymousClass5.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(objArr.length, lVar != null ? new AnonymousClass6(lVar, objArr) : null, new AnonymousClass7(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new AnonymousClass8(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, s sVar, int i2, Object obj) {
        int i3 = i2 & 2;
        int length = objArr.length;
        if (i3 != 0) {
            pVar = null;
        }
        lazyListScope.items(length, pVar != null ? new C02736(pVar, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1763000017, true, new C02758(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, l lVar, r rVar, int i2, Object obj) {
        AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
        int i3 = i2 & 2;
        int length = objArr.length;
        if (i3 != 0) {
            lVar = null;
        }
        lazyListScope.items(length, lVar != null ? new AnonymousClass6(lVar, objArr) : null, new AnonymousClass7(anonymousClass5, objArr), ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new AnonymousClass8(rVar, objArr)));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8, reason: invalid class name */
    public final class AnonymousClass8 implements r<LazyItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ r $itemContent;
        final /* synthetic */ Object[] $items;

        public AnonymousClass8(r rVar, Object[] objArr) {
            this.$itemContent = rVar;
            this.$items = objArr;
        }

        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(-1781742563, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:250)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    public final class AnonymousClass4 implements r<LazyItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ r $itemContent;
        final /* synthetic */ List $items;

        public AnonymousClass4(r rVar, List list) {
            this.$itemContent = rVar;
            this.$items = list;
        }

        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(802480018, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    public final class C02758 implements r<LazyItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ Object[] $items;

        public C02758(s sVar, Object[] objArr) {
            this.$itemContent = sVar;
            this.$items = objArr;
        }

        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(1763000017, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:286)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    public final class C02714 implements r<LazyItemScope, Integer, Composer, Integer, ab> {
        final /* synthetic */ s $itemContent;
        final /* synthetic */ List $items;

        public C02714(s sVar, List list) {
            this.$itemContent = sVar;
            this.$items = list;
        }

        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (true != composer.changed(lazyItemScope) ? 2 : 4) | i3;
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
                ComposerKt.traceEventStart(2039820996, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return ab.f48028a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r23, androidx.compose.foundation.lazy.LazyListState r24, androidx.compose.foundation.layout.PaddingValues r25, boolean r26, androidx.compose.foundation.layout.Arrangement.Horizontal r27, androidx.compose.ui.Alignment.Vertical r28, androidx.compose.foundation.gestures.FlingBehavior r29, final h.g.a.l r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r23, androidx.compose.foundation.lazy.LazyListState r24, androidx.compose.foundation.layout.PaddingValues r25, boolean r26, androidx.compose.foundation.layout.Arrangement.Vertical r27, androidx.compose.ui.Alignment.Horizontal r28, androidx.compose.foundation.gestures.FlingBehavior r29, final h.g.a.l r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Horizontal r29, androidx.compose.ui.Alignment.Vertical r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final h.g.a.l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Vertical r29, androidx.compose.ui.Alignment.Horizontal r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final h.g.a.l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
