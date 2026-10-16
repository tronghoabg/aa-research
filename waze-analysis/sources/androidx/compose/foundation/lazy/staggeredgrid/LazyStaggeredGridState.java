package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSet;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.j;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) obj2;
            return i.i(lazyStaggeredGridState.scrollPosition.getIndices(), lazyStaggeredGridState.scrollPosition.getScrollOffsets());
        }
    }, new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return LazyStaggeredGridState.Saver$lambda$1((List) obj);
        }
    });
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private final LazyStaggeredGridState$_scrollIndicatorState$1 _scrollIndicatorState;
    private LazyStaggeredGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final MutableIntObjectMap<LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private boolean hasLookaheadOccurred;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final MutableState<ab> measurementScopeInvalidator;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<ab> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ LazyStaggeredGridMeasureResult $layoutInfo;
        final /* synthetic */ int $numOfItemsToTeleport;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i2, int i3, int i4, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$index = i2;
            this.$scrollOffset = i3;
            this.$numOfItemsToTeleport = i4;
            this.$layoutInfo = lazyStaggeredGridMeasureResult;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = LazyStaggeredGridState.this.new AnonymousClass2(this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ScrollScope scrollScope = (ScrollScope) this.L$0;
                this.label = 1;
                if (LazyLayoutScrollScopeKt.animateScrollToItem(LazyStaggeredGridScrollScopeKt.LazyLayoutScrollScope(LazyStaggeredGridState.this, scrollScope), this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo.getDensity(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return LazyStaggeredGridState.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(LazyStaggeredGridState.this, (MutatePriority) null, this, 1, (Object) null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1, reason: invalid class name and case insensitive filesystem */
    final class C03011 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C03011(e<? super C03011> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyStaggeredGridState.this.scroll(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2, reason: invalid class name and case insensitive filesystem */
    final class C03022 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03022(int i2, int i3, e<? super C03022> eVar) {
            super(2, eVar);
            this.$index = i2;
            this.$scrollOffset = i3;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return LazyStaggeredGridState.this.new C03022(this.$index, this.$scrollOffset, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((C03022) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation(this.$index, this.$scrollOffset, true);
            return ab.f48028a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
                return LazyStaggeredGridMeasureResultKt.calculateContentSize(lazyStaggeredGridState.getLayoutInfo(), lazyStaggeredGridState.getLaneCount$foundation());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                return this.this$0.calculateScrollOffset();
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return LazyStaggeredGridMeasureResultKt.getSingleAxisViewportSize(this.this$0.getLayoutInfo());
            }
        };
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean all(l lVar) {
                return Modifier.Element.CC.$default$all(this, lVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean any(l lVar) {
                return Modifier.Element.CC.$default$any(this, lVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ Object foldIn(Object obj, p pVar) {
                return Modifier.Element.CC.$default$foldIn(this, obj, pVar);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ Object foldOut(Object obj, p pVar) {
                return Modifier.Element.CC.$default$foldOut(this, obj, pVar);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return Modifier.CC.$default$then(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Float.valueOf(LazyStaggeredGridState.scrollableState$lambda$0(this.f$0, ((Float) obj).floatValue()));
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = IntObjectMapKt.mutableIntObjectMapOf();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m2967constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m2967constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    static final LazyStaggeredGridState Saver$lambda$1(List list) {
        return new LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1), null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, e eVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i2, i3, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        LazyStaggeredGridLayoutInfo layoutInfo = getLayoutInfo();
        if (layoutInfo.getTotalItemsCount() == 0) {
            return 0;
        }
        return ((LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(layoutInfo) * getFirstVisibleItemIndex()) / getLaneCount$foundation()) + getFirstVisibleItemScrollOffset();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void cancelPrefetchIfVisibleItemsChanged(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r15) {
        /*
            r14 = this;
            java.util.List r15 = r15.getVisibleItemsInfo()
            int r0 = r14.prefetchBaseIndex
            r1 = -1
            if (r0 == r1) goto L7c
            r0 = r15
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7c
            java.lang.Object r0 = h.a.i.P(r15)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r0
            int r0 = r0.getIndex()
            java.lang.Object r15 = h.a.i.T(r15)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r15 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r15
            int r15 = r15.getIndex()
            int r2 = r14.prefetchBaseIndex
            if (r0 > r2) goto L2c
            if (r2 <= r15) goto L7c
        L2c:
            r14.prefetchBaseIndex = r1
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r15 = r14.currentItemPrefetchHandles
            androidx.collection.IntObjectMap r15 = (androidx.collection.IntObjectMap) r15
            java.lang.Object[] r0 = r15.values
            long[] r15 = r15.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L77
            r2 = 0
            r3 = r2
        L3d:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L72
            int r6 = r3 - r1
            int r6 = ~r6
            r7 = r2
        L51:
            int r8 = r6 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L70
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L6c
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r0[r8]
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r8 = (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) r8
            r8.cancel()
        L6c:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L51
        L70:
            if (r8 != r9) goto L77
        L72:
            if (r3 == r1) goto L77
            int r3 = r3 + 1
            goto L3d
        L77:
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r14 = r14.currentItemPrefetchHandles
            r14.clear()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.cancelPrefetchIfVisibleItemsChanged(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo):void");
    }

    private final void clearLeftoverPrefetchHandles(IntSet intSet) {
        int i2;
        MutableIntObjectMap<LazyLayoutPrefetchState.PrefetchHandle> mutableIntObjectMap = this.currentItemPrefetchHandles;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = mutableIntObjectMap.keys[i6];
                        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = (LazyLayoutPrefetchState.PrefetchHandle) mutableIntObjectMap.values[i6];
                        if (!intSet.contains(i7)) {
                            prefetchHandle.cancel();
                            mutableIntObjectMap.removeValueAt(i6);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i2, int i3) {
        int[] iArr = new int[i3];
        int iMin = 0;
        if (this.layoutInfoState.getValue().getSpanProvider().isFullSpan(i2)) {
            h.a.c.ay(iArr, i2, 0, 6);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i2 + i3);
        int lane = this.laneInfo.getLane(i2);
        if (lane != -2 && lane != -1) {
            if (lane < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("Expected positive lane number, got " + lane + " instead.");
            }
            iMin = Math.min(lane, i3);
        }
        int i4 = iMin - 1;
        int iFindPreviousItemIndex = i2;
        while (true) {
            if (i4 < 0) {
                break;
            }
            iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i4);
            iArr[i4] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                h.a.c.ay(iArr, -1, i4, 2);
                break;
            }
            i4--;
        }
        iArr[iMin] = i2;
        while (true) {
            iMin++;
            if (iMin >= i3) {
                return iArr;
            }
            i2 = this.laneInfo.findNextItemIndex(i2, iMin);
            iArr[iMin] = i2;
        }
    }

    private final void notifyPrefetch(float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int i2;
        if (!this.prefetchingEnabled || lazyStaggeredGridMeasureResult.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z = f2 < 0.0f;
        int index = z ? ((LazyStaggeredGridMeasuredItem) i.T(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem) i.P(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        MutableIntSet mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
        LazyStaggeredGridSlots slots = lazyStaggeredGridMeasureResult.getSlots();
        int length = slots.getSizes().length;
        int i3 = 0;
        while (i3 < length) {
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = this.laneInfo;
            int iFindNextItemIndex = z ? lazyStaggeredGridLaneInfo.findNextItemIndex(index, i3) : lazyStaggeredGridLaneInfo.findPreviousItemIndex(index, i3);
            if (iFindNextItemIndex < 0 || iFindNextItemIndex >= lazyStaggeredGridMeasureResult.getTotalItemsCount() || mutableIntSetMutableIntSetOf.contains(iFindNextItemIndex)) {
                break;
            }
            mutableIntSetMutableIntSetOf.plusAssign(iFindNextItemIndex);
            if (!this.currentItemPrefetchHandles.containsKey(iFindNextItemIndex)) {
                boolean zIsFullSpan = lazyStaggeredGridMeasureResult.getSpanProvider().isFullSpan(iFindNextItemIndex);
                int i4 = true != zIsFullSpan ? i3 : 0;
                int i5 = true != zIsFullSpan ? 1 : length;
                if (i5 == 1) {
                    i2 = slots.getSizes()[i4];
                } else {
                    int i6 = slots.getPositions()[i4];
                    int i7 = (i4 + i5) - 1;
                    i2 = (slots.getPositions()[i7] + slots.getSizes()[i7]) - i6;
                }
                this.currentItemPrefetchHandles.set(iFindNextItemIndex, LazyLayoutPrefetchState.m2956schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, iFindNextItemIndex, lazyStaggeredGridMeasureResult.getOrientation() == Orientation.Vertical ? Constraints.Companion.m11119fixedWidthOenEA2s(i2) : Constraints.Companion.m11118fixedHeightOenEA2s(i2), null, 4, null));
            }
            i3++;
            index = iFindNextItemIndex;
        }
        clearLeftoverPrefetchHandles(mutableIntSetMutableIntSetOf);
    }

    static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lazyStaggeredGridMeasureResult = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f2, lazyStaggeredGridMeasureResult);
    }

    private final float onScroll(float f2) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        if ((f2 < 0.0f && !getCanScrollForward()) || (f2 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        float f3 = this.scrollToBeConsumed + f2;
        this.scrollToBeConsumed = f3;
        if (Math.abs(f3) > 0.5f) {
            float f4 = this.scrollToBeConsumed;
            int iB = h.h.a.b(f4);
            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(iB, !this.hasLookaheadOccurred);
            if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = lazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(iB, true);
                if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                } else {
                    lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation(lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m2971invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f4 - this.scrollToBeConsumed, lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f4 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f2;
        }
        float f5 = f2 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f5;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i2, i3);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, e eVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i2, i3, eVar);
    }

    static final float scrollableState$lambda$0(LazyStaggeredGridState lazyStaggeredGridState, float f2) {
        return -lazyStaggeredGridState.onScroll(-f2);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    public final Object animateScrollToItem(int i2, int i3, e<? super ab> eVar) {
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        Object objScroll$default = ScrollableState.CC.scroll$default(this, null, new AnonymousClass2(i2, i3, value.getSlots().getSizes().length * 100, value, null), eVar, 1, null);
        return objScroll$default == a.f48038a ? objScroll$default : ab.f48028a;
    }

    public final void applyMeasureResult$foundation(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z, boolean z2) {
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyStaggeredGridMeasureResult;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (this._lazyLayoutScrollDeltaBetweenPasses.isActive$foundation() && Arrays.equals(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), this.scrollPosition.getIndices()) && Arrays.equals(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets(), this.scrollPosition.getScrollOffsets())) {
                    this._lazyLayoutScrollDeltaBetweenPasses.stop$foundation();
                }
                return;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = this.scrollPosition;
        if (z2) {
            lazyStaggeredGridScrollPosition.updateScrollOffset(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
        } else {
            lazyStaggeredGridScrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        }
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        if (z) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation(lazyStaggeredGridMeasureResult.getScrollBackAmount(), lazyStaggeredGridMeasureResult.getDensity(), lazyStaggeredGridMeasureResult.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo$foundation() {
        return this.approachLayoutInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final boolean getHasLookaheadOccurred$foundation() {
        return this.hasLookaheadOccurred;
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation() {
        return this.itemAnimator;
    }

    public final int getLaneCount$foundation() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation() {
        return this.laneInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation() {
        return this.measurePassCount;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<ab> m3010getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation() {
        return this.mutableInteractionSource;
    }

    public final j getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<ab> m3011getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation() {
        return this.prefetchingEnabled;
    }

    public final Remeasurement getRemeasurement$foundation() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation() {
        return this.remeasurementModifier;
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this._lazyLayoutScrollDeltaBetweenPasses.getScrollDeltaBetweenPasses$foundation();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation() {
        return this.scrollPosition;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void requestScrollToItem(int i2, int i3) {
        if (isScrollInProgress()) {
            aj.z(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
        }
        snapToItemInternal$foundation(i2, i3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5.scroll(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, h.g.a.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r7, h.c.e<? super h.ab> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C03011
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C03011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L6d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            h.g.a.p r7 = (h.g.a.p) r7
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            e.b.c.b(r8)
            goto L5d
        L3f:
            e.b.c.b(r8)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> r8 = r5.layoutInfoState
            java.lang.Object r8 = r8.getValue()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r2 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo()
            if (r8 != r2) goto L5d
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L5d
            goto L6c
        L5d:
            androidx.compose.foundation.gestures.ScrollableState r5 = r5.scrollableState
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r5 = r5.scroll(r6, r7, r0)
            if (r5 != r1) goto L6d
        L6c:
            return r1
        L6d:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, h.g.a.p, h.c.e):java.lang.Object");
    }

    public final float scrollToBeConsumed$foundation(boolean z) {
        return (z || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : getScrollDeltaBetweenPasses$foundation();
    }

    public final Object scrollToItem(int i2, int i3, e<? super ab> eVar) {
        Object objScroll$default = ScrollableState.CC.scroll$default(this, null, new C03022(i2, i3, null), eVar, 1, null);
        return objScroll$default == a.f48038a ? objScroll$default : ab.f48028a;
    }

    public final void setMeasurePassCount$foundation(int i2) {
        this.measurePassCount = i2;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void snapToItemInternal$foundation(int i2, int i3, boolean z) {
        boolean z2 = true;
        if (this.scrollPosition.getIndex() == i2 && this.scrollPosition.getScrollOffset() == i3) {
            z2 = false;
        }
        if (z2) {
            this.itemAnimator.reset();
        }
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(value, i2);
        if (lazyStaggeredGridItemInfoFindVisibleItem == null || !z2) {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(i2, i3);
        } else {
            int iM11297getYimpl = (value.getOrientation() == Orientation.Vertical ? IntOffset.m11297getYimpl(lazyStaggeredGridItemInfoFindVisibleItem.mo2989getOffsetnOccac()) : IntOffset.m11296getXimpl(lazyStaggeredGridItemInfoFindVisibleItem.mo2989getOffsetnOccac())) + i3;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = value.getFirstVisibleItemScrollOffsets()[i4] + iM11297getYimpl;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        }
        if (!z) {
            ObservableScopeInvalidator.m2971invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider, iArr);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int i2, int i3, int i4, o oVar) {
        this(1 == (i4 & 1) ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public LazyStaggeredGridState(int i2, int i3) {
        this(new int[]{i2}, new int[]{i3}, null);
    }
}
