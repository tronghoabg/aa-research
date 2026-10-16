package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ComposeFoundationFlags;
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
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.j;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private final PagerState$_scrollIndicatorState$1 _scrollIndicatorState;
    private float accumulator;
    private PagerMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final PagerCacheWindowLogic cacheWindowLogic;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int latestPageSizeWithSpacing;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<ab> measurementScopeInvalidator;
    private long minScrollOffset;
    private final PagerState$pagerCacheWindow$1 pagerCacheWindow;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<ab> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;
    private final MutableIntState programmaticScrollTargetPage$delegate;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ int $targetPage;
        final /* synthetic */ float $targetPageOffsetToSnappedPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i2, float f2, AnimationSpec<Float> animationSpec, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$targetPage = i2;
            this.$targetPageOffsetToSnappedPosition = f2;
            this.$animationSpec = animationSpec;
        }

        static final ab invokeSuspend$lambda$0(PagerState pagerState, ScrollScope scrollScope, int i2) {
            pagerState.updateTargetPage(scrollScope, i2);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = PagerState.this.new AnonymousClass3(this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((AnonymousClass3) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(PagerState.this, (ScrollScope) this.L$0);
                int i3 = this.$targetPage;
                float f2 = this.$targetPageOffsetToSnappedPosition;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final PagerState pagerState = PagerState.this;
                this.label = 1;
                if (PagerStateKt.animateScrollToPage(LazyLayoutScrollScope, i3, f2, animationSpec, new p() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return PagerState.AnonymousClass3.invokeSuspend$lambda$0(pagerState, (ScrollScope) obj2, ((Integer) obj3).intValue());
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerState$requestScrollToPage$1, reason: invalid class name and case insensitive filesystem */
    final class C03031 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C03031(e<? super C03031> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return PagerState.this.new C03031(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03031) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(PagerState.this, (MutatePriority) null, this, 1, (Object) null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerState$scroll$1, reason: invalid class name and case insensitive filesystem */
    final class C03041 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C03041(e<? super C03041> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.scroll$suspendImpl(PagerState.this, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, int i2, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$pageOffsetFraction = f2;
            this.$page = i2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return PagerState.this.new AnonymousClass2(this.$pageOffsetFraction, this.$page, eVar);
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
                e.b.c.b(obj);
                this.label = 1;
                if (PagerState.this.awaitScrollDependencies(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            float f2 = this.$pageOffsetFraction;
            double d2 = f2;
            if (d2 < -0.5d || d2 > 0.5d) {
                InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5");
            }
            PagerState pagerState = PagerState.this;
            pagerState.snapToItem$foundation(pagerState.coerceInPageRange(this.$page), this.$pageOffsetFraction, true);
            return ab.f48028a;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1] */
    public PagerState(int i2, float f2, PrefetchScheduler prefetchScheduler) {
        double d2 = f2;
        if (d2 < -0.5d || d2 > 0.5d) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i2, f2, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i2;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new l() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Float.valueOf(this.f$0.performScroll(((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.density = PagerStateKt.UnitDensity;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new h.g.a.a() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(PagerState.settledPage_delegate$lambda$0(this.f$0));
            }
        });
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new h.g.a.a() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                PagerState pagerState = this.f$0;
                return Integer.valueOf(pagerState.coerceInPageRange(!pagerState.isScrollInProgress() ? pagerState.getCurrentPage() : pagerState.getProgrammaticScrollTargetPage() != -1 ? pagerState.getProgrammaticScrollTargetPage() : Math.abs(pagerState.getCurrentPageOffsetFraction()) >= Math.abs(pagerState.getPositionThresholdFraction$foundation()) ? pagerState.getLastScrolledForward() ? pagerState.firstVisiblePage + 1 : pagerState.firstVisiblePage : pagerState.getCurrentPage()));
            }
        });
        LazyLayoutPrefetchState lazyLayoutPrefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new l() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PagerState.prefetchState$lambda$0(this.f$0, (NestedPrefetchScope) obj);
            }
        });
        this.prefetchState = lazyLayoutPrefetchState;
        ?? r12 = new LazyLayoutCacheWindow() { // from class: androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public int calculateAheadWindow(Density density, int i3) {
                return this.this$0.getLatestPageSizeWithSpacing$foundation();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public int calculateBehindWindow(Density density, int i3) {
                return 0;
            }
        };
        this.pagerCacheWindow = r12;
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                PagerState pagerState = this.this$0;
                return PagerLayoutInfoKt.calculateContentSize(pagerState.getLayoutInfo(), pagerState.getPageCount());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                return this.this$0.calculateScrollOffset();
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return PagerLayoutInfoKt.getMainAxisViewportSize(this.this$0.getLayoutInfo());
            }
        };
        this.cacheWindowLogic = new PagerCacheWindowLogic((LazyLayoutCacheWindow) r12, lazyLayoutPrefetchState, new h.g.a.a() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(this.f$0.getPageCount());
            }
        });
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
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
                this.this$0.setRemeasurement(remeasurement);
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return Modifier.CC.$default$then(this, modifier);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m2967constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m2967constructorimpl$default(null, 1, null);
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i2, float f2, AnimationSpec animationSpec, e eVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i3 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i2, f2, animationSpec, eVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        pagerState.applyMeasureResult$foundation(pagerMeasureResult, z, z2 & ((i2 & 4) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(e<? super ab> eVar) {
        Object objWaitForFirstLayout;
        return (this.pagerLayoutInfoState.getValue() == PagerStateKt.getEmptyLayoutInfo() && (objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(eVar)) == a.f48038a) ? objWaitForFirstLayout : ab.f48028a;
    }

    private final int calculatePrefetchIndex(boolean z, PagerLayoutInfo pagerLayoutInfo) {
        if (!z) {
            return (((PageInfo) i.P(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1;
        }
        int beyondViewportPageCount = pagerLayoutInfo.getBeyondViewportPageCount() + 1;
        if (beyondViewportPageCount < 0) {
            return Integer.MAX_VALUE;
        }
        return ((PageInfo) i.T(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + beyondViewportPageCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        long pageSizeWithSpacing$foundation = (getPageSizeWithSpacing$foundation() * this.firstVisiblePage) + this.firstVisiblePageOffset;
        if (pageSizeWithSpacing$foundation > SieveCacheKt.NodeLinkMask) {
            pageSizeWithSpacing$foundation = 2147483647L;
        }
        return (int) pageSizeWithSpacing$foundation;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        if (this.indexToPrefetch == -1 || pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != calculatePrefetchIndex(this.wasPrefetchingForward, pagerLayoutInfo)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i2) {
        if (getPageCount() > 0) {
            return n.j(i2, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage$delegate.getIntValue();
    }

    private final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float f2) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m3044getUpDownDifferenceF1C5BW0$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))) {
                return true;
            }
        } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m3044getUpDownDifferenceF1C5BW0$foundation() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i3 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                i2 = currentPage;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProvider, i2);
    }

    private final void notifyPrefetch(float f2, PagerLayoutInfo pagerLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            boolean z = f2 > 0.0f;
            int iCalculatePrefetchIndex = calculatePrefetchIndex(z, pagerLayoutInfo);
            if (iCalculatePrefetchIndex < 0 || iCalculatePrefetchIndex >= getPageCount()) {
                return;
            }
            if (iCalculatePrefetchIndex != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z;
                this.indexToPrefetch = iCalculatePrefetchIndex;
                this.currentPrefetchHandle = LazyLayoutPrefetchState.m2956schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, iCalculatePrefetchIndex, this.premeasureConstraints, null, 4, null);
            }
            if (z) {
                if ((((PageInfo) i.T(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() + (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.getPageSpacing())) - pagerLayoutInfo.getViewportEndOffset() >= f2 || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
                return;
            }
            if (pagerLayoutInfo.getViewportStartOffset() - ((PageInfo) i.P(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() >= (-f2) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f2) {
        PagerMeasureResult pagerMeasureResult;
        long jCurrentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f3 = this.accumulator + f2;
        long jD = h.h.a.d(f3);
        this.accumulator = f3 - jD;
        if (Math.abs(f2) < 1.0E-4f) {
            return f2;
        }
        long j2 = jCurrentAbsoluteScrollOffset + jD;
        long jN = n.n(j2, this.minScrollOffset, this.maxScrollOffset);
        long j3 = jN - jCurrentAbsoluteScrollOffset;
        float f4 = j3;
        this.previousPassDelta = f4;
        if (Math.abs(j3) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f4 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f4 < 0.0f));
        }
        int i2 = (int) j3;
        int i3 = -i2;
        PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(i3);
        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i3);
            if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
            } else {
                pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation(pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.m2971invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i2);
            Remeasurement remeasurement$foundation = getRemeasurement$foundation();
            if (remeasurement$foundation != null) {
                remeasurement$foundation.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (j2 != jN ? Long.valueOf(j3) : Float.valueOf(f2)).floatValue();
    }

    static final ab prefetchState$lambda$0(PagerState pagerState, NestedPrefetchScope nestedPrefetchScope) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            nestedPrefetchScope.schedulePrecomposition(pagerState.firstVisiblePage);
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            return ab.f48028a;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i2, float f2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        pagerState.requestScrollToPage(i2, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, h.g.a.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r7, h.c.e<? super h.ab> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState.C03041
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState.C03041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            e.b.c.b(r8)
            goto L78
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            h.g.a.p r7 = (h.g.a.p) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            e.b.c.b(r8)
            goto L59
        L48:
            e.b.c.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 == r1) goto L7f
        L59:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L66
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L66:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L78
            goto L7f
        L78:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i2, float f2, e eVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        return pagerState.scrollToPage(i2, f2, eVar);
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setProgrammaticScrollTargetPage(int i2) {
        this.programmaticScrollTargetPage$delegate.setIntValue(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    private final void setSettledPageState(int i2) {
        this.settledPageState$delegate.setIntValue(i2);
    }

    static final int settledPage_delegate$lambda$0(PagerState pagerState) {
        return pagerState.isScrollInProgress() ? pagerState.getSettledPageState() : pagerState.getCurrentPage();
    }

    private final void tryRunPrefetch(PagerMeasureResult pagerMeasureResult) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (this.prefetchingEnabled && pagerMeasureResult.getBeyondViewportPageCount() < getPageCount() && Math.abs(this.previousPassDelta) > 0.5f && isGestureActionMatchesScroll(this.previousPassDelta)) {
                if (ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                    this.cacheWindowLogic.onScroll(this.previousPassDelta, pagerMeasureResult);
                } else {
                    notifyPrefetch(this.previousPassDelta, pagerMeasureResult);
                }
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i2, float f2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i2, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(r11, null, r3, r4, 1, null) != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r12, float r13, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r14, h.c.e<? super h.ab> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            e.b.c.b(r15)
            goto Lb1
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            float r13 = r4.F$0
            int r12 = r4.I$0
            java.lang.Object r14 = r4.L$0
            androidx.compose.animation.core.AnimationSpec r14 = (androidx.compose.animation.core.AnimationSpec) r14
            e.b.c.b(r15)
        L3f:
            r9 = r14
            goto L67
        L41:
            e.b.c.b(r15)
            int r15 = r11.getCurrentPage()
            if (r12 != r15) goto L52
            float r15 = r11.getCurrentPageOffsetFraction()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 == 0) goto Lb1
        L52:
            int r15 = r11.getPageCount()
            if (r15 == 0) goto Lb1
            r4.L$0 = r14
            r4.I$0 = r12
            r4.F$0 = r13
            r4.label = r3
            java.lang.Object r15 = r11.awaitScrollDependencies(r4)
            if (r15 != r0) goto L3f
            goto Lb0
        L67:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 < 0) goto L74
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L8a
        L74:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(r14)
        L8a:
            int r7 = r11.coerceInPageRange(r12)
            int r12 = r11.getPageSizeWithSpacing$foundation()
            float r12 = (float) r12
            float r8 = r13 * r12
            r1 = r11
            androidx.compose.foundation.gestures.ScrollableState r1 = (androidx.compose.foundation.gestures.ScrollableState) r1
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r5 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r10 = 0
            r6 = r11
            r5.<init>(r7, r8, r9, r10)
            r3 = r5
            h.g.a.p r3 = (h.g.a.p) r3
            r11 = 0
            r4.L$0 = r11
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            java.lang.Object r11 = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, h.c.e):java.lang.Object");
    }

    public final void applyMeasureResult$foundation(PagerMeasureResult pagerMeasureResult, boolean z, boolean z2) {
        this.prefetchState.setIdealNestedPrefetchCount$foundation(pagerMeasureResult.getVisiblePagesInfo().size());
        this.latestPageSizeWithSpacing = pagerMeasureResult.getPageSize() + pagerMeasureResult.getPageSpacing();
        if (z) {
            this.hasLookaheadOccurred = true;
        } else if (this.hasLookaheadOccurred) {
            this.approachLayoutInfo = pagerMeasureResult;
            return;
        }
        PagerScrollPosition pagerScrollPosition = this.scrollPosition;
        if (z2) {
            pagerScrollPosition.updateCurrentPageOffsetFraction(pagerMeasureResult.getCurrentPageOffsetFraction());
        } else {
            pagerScrollPosition.updateFromMeasureResult(pagerMeasureResult);
            if (!ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                cancelPrefetchIfVisibleItemsChanged(pagerMeasureResult);
            } else if (this.prefetchingEnabled) {
                this.cacheWindowLogic.onVisibleItemsChanged(pagerMeasureResult);
            }
        }
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        setCanScrollForward(pagerMeasureResult.getCanScrollForward());
        setCanScrollBackward(pagerMeasureResult.getCanScrollBackward());
        MeasuredPage firstVisiblePage = pagerMeasureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = pagerMeasureResult.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(pagerMeasureResult);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
        long jCalculateNewMinScrollOffset = PagerStateKt.calculateNewMinScrollOffset(pagerMeasureResult, getPageCount());
        long j2 = this.maxScrollOffset;
        if (jCalculateNewMinScrollOffset > j2) {
            jCalculateNewMinScrollOffset = j2;
        }
        this.minScrollOffset = jCalculateNewMinScrollOffset;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    public final PagerMeasureResult getApproachLayoutInfo$foundation() {
        return this.approachLayoutInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation() {
        return this.beyondBoundsInfo;
    }

    public final PagerCacheWindowLogic getCacheWindowLogic$foundation() {
        return this.cacheWindowLogic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    public final Density getDensity$foundation() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation() {
        return this.firstVisiblePageOffset;
    }

    public final boolean getHasLookaheadOccurred$foundation() {
        return this.hasLookaheadOccurred;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final int getLatestPageSizeWithSpacing$foundation() {
        return this.latestPageSizeWithSpacing;
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getLayoutWithMeasurement$foundation() {
        return this.layoutWithMeasurement;
    }

    public final long getMaxScrollOffset$foundation() {
        return this.maxScrollOffset;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<ab> m3041getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public final long getMinScrollOffset$foundation() {
        return this.minScrollOffset;
    }

    public final j getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final float getOffsetDistanceInPages(int i2) {
        if (i2 < 0 || i2 > getPageCount()) {
            InlineClassHelperKt.throwIllegalArgumentException("page " + i2 + " is not within the range 0 to " + getPageCount());
        }
        return (i2 - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation() {
        return getPageSize$foundation() + getPageSpacing$foundation();
    }

    public final int getPageSpacing$foundation() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation() {
        return this.pinnedPages;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<ab> m3042getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final float getPositionThresholdFraction$foundation() {
        return Math.min(this.density.mo2127toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation() / 2.0f) / getPageSize$foundation();
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation, reason: not valid java name */
    public final long m3043getPremeasureConstraintsmsEJaDk$foundation() {
        return this.premeasureConstraints;
    }

    public final Remeasurement getRemeasurement$foundation() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation() {
        return this.remeasurementModifier;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation, reason: not valid java name */
    public final long m3044getUpDownDifferenceF1C5BW0$foundation() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m7990unboximpl();
    }

    public final boolean isNotGestureAction$foundation() {
        return ((int) Float.intBitsToFloat((int) (m3044getUpDownDifferenceF1C5BW0$foundation() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m3044getUpDownDifferenceF1C5BW0$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) == 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        return this.scrollPosition.matchPageWithKey(pagerLazyLayoutItemProvider, i2);
    }

    public final void requestScrollToPage(int i2, float f2) {
        if (isScrollInProgress()) {
            aj.z(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new C03031(null), 3);
        }
        snapToItem$foundation(i2, f2, false);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        return scroll$suspendImpl(this, mutatePriority, pVar, eVar);
    }

    public final Object scrollToPage(int i2, float f2, e<? super ab> eVar) {
        Object objScroll$default = ScrollableState.CC.scroll$default(this, null, new AnonymousClass2(f2, i2, null), eVar, 1, null);
        return objScroll$default == a.f48038a ? objScroll$default : ab.f48028a;
    }

    public final void setDensity$foundation(Density density) {
        this.density = density;
    }

    public final void setLatestPageSizeWithSpacing$foundation(int i2) {
        this.latestPageSizeWithSpacing = i2;
    }

    public final void setMaxScrollOffset$foundation(long j2) {
        this.maxScrollOffset = j2;
    }

    public final void setMinScrollOffset$foundation(long j2) {
        this.minScrollOffset = j2;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation, reason: not valid java name */
    public final void m3045setPremeasureConstraintsBRTryo0$foundation(long j2) {
        this.premeasureConstraints = j2;
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation, reason: not valid java name */
    public final void m3046setUpDownDifferencek4lQ0M$foundation(long j2) {
        this.upDownDifference$delegate.setValue(Offset.m7969boximpl(j2));
    }

    public final void snapToItem$foundation(int i2, float f2, boolean z) {
        if (this.scrollPosition.getCurrentPage() != i2 || this.scrollPosition.getCurrentPageOffsetFraction() != f2) {
            this.cacheWindowLogic.resetStrategy();
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i2, f2);
        if (!z) {
            ObservableScopeInvalidator.m2971invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement$foundation = getRemeasurement$foundation();
        if (remeasurement$foundation != null) {
            remeasurement$foundation.forceRemeasure();
        }
    }

    public final void updateCurrentPage(ScrollScope scrollScope, int i2, float f2) {
        snapToItem$foundation(i2, f2, true);
    }

    public final void updateTargetPage(ScrollScope scrollScope, int i2) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i2));
    }

    public PagerState(int i2, float f2) {
        this(i2, f2, null);
    }

    public /* synthetic */ PagerState(int i2, float f2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2, (i3 & 2) != 0 ? 0.0f : f2);
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    public /* synthetic */ PagerState(int i2, float f2, PrefetchScheduler prefetchScheduler, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2, (i3 & 2) != 0 ? 0.0f : f2, (i3 & 4) != 0 ? null : prefetchScheduler);
    }
}
