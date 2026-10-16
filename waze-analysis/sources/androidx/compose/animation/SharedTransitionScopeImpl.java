package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;
import h.g.b.au;
import h.g.b.x;
import h.g.b.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;
    private final /* synthetic */ LookaheadScope $$delegate_0;
    private LayoutCoordinates _nullableLookaheadRoot;
    private final af coroutineScope;
    private a<ab> invalidateOverlay;
    private LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper;
    private LayoutCoordinates nullableRoot;
    private a<ab> testBlockToRun;
    private final MutableState isTransitionActive$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final a<ab> observeAnimatingBlock = new SharedTransitionScopeImpl$observeAnimatingBlock$1(this);
    private final MutableState renderers$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ArrayList(), null, 2, null);
    private final SnapshotStateMap<Object, SharedElement> sharedElements = SnapshotStateKt.mutableStateMapOf();

    /* compiled from: WazeSource */
    final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        private final Shape clipShape;
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo2037createOutlinePq9zytI(rect.m8013getSizeNHjbRc(), layoutDirection, density));
            this.path.mo8120translatek4lQ0M(rect.m8015getTopLeftF1C5BW0());
            return this.path;
        }

        public final Shape getClipShape() {
            return this.clipShape;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<EnterExitState, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public final Boolean invoke(EnterExitState enterExitState) {
            return Boolean.valueOf(enterExitState == EnterExitState.Visible);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedElement$1, reason: invalid class name and case insensitive filesystem */
    final class C02011 extends y implements l<EnterExitState, Boolean> {
        public static final C02011 INSTANCE = new C02011();

        C02011() {
            super(1);
        }

        @Override // h.g.a.l
        public final Boolean invoke(EnterExitState enterExitState) {
            return Boolean.valueOf(enterExitState == EnterExitState.Visible);
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, af afVar) {
        this.$$delegate_0 = lookaheadScope;
        this.coroutineScope = afVar;
    }

    private final List<LayerRenderer> getRenderers() {
        return (List) this.renderers$delegate.getValue();
    }

    private final Collection<SharedElement> getSharedElementsIterator() {
        return this.sharedElements.toMap().values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElementEntry rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f2, boolean z2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(864401334, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:1372)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SharedElementEntry(sharedElement, boundsAnimation, placeholderSize, z, overlayClip, z2, sharedContentState, f2);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedElementEntry sharedElementEntry = (SharedElementEntry) objRememberedValue;
        sharedContentState.setInternalState$animation(sharedElementEntry);
        sharedElementEntry.setSharedElement(sharedElement);
        sharedElementEntry.setRenderOnlyWhenVisible(z);
        sharedElementEntry.setBoundsAnimation(boundsAnimation);
        sharedElementEntry.setPlaceholderSize(placeholderSize);
        sharedElementEntry.setOverlayClip(overlayClip);
        sharedElementEntry.setZIndex(f2);
        sharedElementEntry.setRenderInOverlayDuringTransition(z2);
        sharedElementEntry.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementEntry;
    }

    private final void setRenderers(List<? extends LayerRenderer> list) {
        this.renderers$delegate.setValue(list);
    }

    private void setTransitionActive(boolean z) {
        this.isTransitionActive$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Modifier sharedBoundsImpl(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, Transition<T> transition, l<? super T, Boolean> lVar, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, boolean z2, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new C02001(sharedContentState, transition, lVar, this, placeholderSize, z, overlayClip, f2, z2, boundsTransform), 1, null);
    }

    public static /* synthetic */ Modifier sharedBoundsWithCallerManagedVisibility$animation$default(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f2, SharedTransitionScope.OverlayClip overlayClip, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            boundsTransform = SharedTransitionDefaults.INSTANCE.getBoundsTransform();
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i2 & 8) != 0) {
            placeholderSize = SharedTransitionScope.PlaceholderSize.Companion.getContentSize();
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation(modifier, sharedContentState, z, boundsTransform2, placeholderSize, (!((i2 & 16) == 0)) | z2, (i2 & 32) != 0 ? 0.0f : f2, (i2 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement sharedElementsFor(Object obj) {
        SnapshotStateMap<Object, SharedElement> snapshotStateMap = this.sharedElements;
        SharedElement sharedElement = snapshotStateMap.get(obj);
        if (sharedElement == null) {
            sharedElement = new SharedElement(obj, this);
            snapshotStateMap.put(obj, sharedElement);
        }
        return sharedElement;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.OverlayClip OverlayClip(Shape shape) {
        return new ShapeBasedClip(shape);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public /* synthetic */ SharedTransitionScope.SharedContentConfig SharedContentConfig() {
        return CachedSharedContentConfig.INSTANCE;
    }

    public final void drawInOverlay$animation(ContentDrawScope contentDrawScope, GraphicsContext graphicsContext) {
        List<? extends LayerRenderer> listAl = i.al(getRenderers(), LayerRenderer.LayerRendererComparator);
        int size = listAl.size();
        for (int i2 = 0; i2 < size; i2++) {
            listAl.get(i2).drawInOverlay(contentDrawScope, graphicsContext);
        }
        setRenderers(listAl);
    }

    public final af getCoroutineScope() {
        return this.coroutineScope;
    }

    public final a<ab> getInvalidateOverlay() {
        return this.invalidateOverlay;
    }

    public final LookaheadAnimationVisualDebugHelper getLookaheadAnimationVisualDebugHelper$animation() {
        return this.lookaheadAnimationVisualDebugHelper;
    }

    public final LayoutCoordinates getLookaheadRoot$animation() {
        LayoutCoordinates layoutCoordinates = this._nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    public final LayoutCoordinates getNullableRoot$animation() {
        return this.nullableRoot;
    }

    public final a<ab> getObserveAnimatingBlock$animation() {
        return this.observeAnimatingBlock;
    }

    public final LayoutCoordinates getRoot$animation() {
        LayoutCoordinates layoutCoordinates = this.nullableRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final a<ab> getTestBlockToRun() {
        return this.testBlockToRun;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo1828localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z) {
        return this.$$delegate_0.mo1828localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, z);
    }

    public final void onEntryAdded$animation(SharedElementEntry sharedElementEntry) {
        sharedElementEntry.getSharedElement().addEntry(sharedElementEntry);
        updateTransitionActiveness$animation();
        List<LayerRenderer> renderers = getRenderers();
        Iterator<LayerRenderer> it = renderers.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementEntry sharedElementEntry2 = next instanceof SharedElementEntry ? (SharedElementEntry) next : null;
            if (x.n(sharedElementEntry2 != null ? sharedElementEntry2.getSharedElement() : null, sharedElementEntry.getSharedElement())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || i2 >= renderers.size() - 1) {
            setRenderers(i.ag(getRenderers(), sharedElementEntry));
            return;
        }
        int i3 = i2 + 1;
        List listB = i.b();
        listB.addAll(renderers.subList(0, i3));
        listB.add(sharedElementEntry);
        listB.addAll(renderers.subList(i3, renderers.size()));
        setRenderers(i.a(listB));
    }

    public final void onEntryRemoved$animation(SharedElementEntry sharedElementEntry) {
        SharedElement sharedElement = sharedElementEntry.getSharedElement();
        sharedElement.removeEntry(sharedElementEntry);
        updateTransitionActiveness$animation();
        setRenderers(i.ae(getRenderers(), sharedElementEntry));
        if (sharedElement.getAllEntries().isEmpty()) {
            aj.z(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onEntryRemoved$2$1(sharedElement, sharedElementEntry, null), 3);
        }
    }

    public final void onLayerRendererCreated$animation(LayerRenderer layerRenderer) {
        setRenderers(i.ag(getRenderers(), layerRenderer));
    }

    public final void onLayerRendererRemoved$animation(LayerRenderer layerRenderer) {
        setRenderers(i.ae(getRenderers(), layerRenderer));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public /* synthetic */ SharedTransitionScope.SharedContentState rememberSharedContentState(Object obj, SharedTransitionScope.SharedContentConfig sharedContentConfig, Composer composer, int i2) {
        return SharedTransitionScope.CC.$default$rememberSharedContentState(this, obj, sharedContentConfig, composer, i2);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, float f2, a<Boolean> aVar) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, aVar, f2));
    }

    public final void setInvalidateOverlay(a<ab> aVar) {
        this.invalidateOverlay = aVar;
    }

    public final void setLookaheadAnimationVisualDebugHelper$animation(LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper) {
        this.lookaheadAnimationVisualDebugHelper = lookaheadAnimationVisualDebugHelper;
    }

    public final void setLookaheadRoot$animation(LayoutCoordinates layoutCoordinates) {
        this._nullableLookaheadRoot = layoutCoordinates;
    }

    public final void setRoot$animation(LayoutCoordinates layoutCoordinates) {
        this.nullableRoot = layoutCoordinates;
    }

    public final void setTestBlockToRun(a<ab> aVar) {
        this.testBlockToRun = aVar;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedBounds(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), AnonymousClass1.INSTANCE, boundsTransform, placeholderSize, false, z, f2, overlayClip), null, new AnonymousClass2(animatedVisibilityScope, enterTransition, exitTransition, sharedContentState, resizeMode), 1, null);
    }

    public final Modifier sharedBoundsWithCallerManagedVisibility$animation(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(z), boundsTransform, placeholderSize, false, z2, f2, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), C02011.INSTANCE, boundsTransform, placeholderSize, true, z, f2, overlayClip);
    }

    public final SharedElement sharedElementForKey$animation(Object obj) {
        return this.sharedElements.get(obj);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f2, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new C02021(z), boundsTransform, placeholderSize, true, z2, f2, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public /* synthetic */ Modifier skipToLookaheadPosition(Modifier modifier, a aVar) {
        return LookaheadScopeKt.approachLayout(modifier, SharedTransitionScope.AnonymousClass2.INSTANCE, new SharedTransitionScope.AnonymousClass3(aVar), new SharedTransitionScope.AnonymousClass4(aVar, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier skipToLookaheadSize(Modifier modifier, a<Boolean> aVar) {
        return modifier.then(new SkipToLookaheadSizeElement(null, aVar, 1, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }

    public final void updateTransitionActiveness$animation() {
        Collection<SharedElement> collectionValues = this.sharedElements.toMap().values();
        boolean z = false;
        for (SharedElement sharedElement : collectionValues) {
            z = z || (sharedElement.getFoundMatch() && sharedElement.isAnimating());
            sharedElement.updateMatch$animation();
        }
        if (z != isTransitionActive()) {
            setTransitionActive(z);
            if (z) {
                return;
            }
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                ((SharedElement) it.next()).onSharedTransitionFinished();
            }
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public /* synthetic */ SharedTransitionScope.SharedContentState rememberSharedContentState(Object obj, Composer composer, int i2) {
        return SharedTransitionScope.CC.$default$rememberSharedContentState(this, obj, composer, i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1, reason: invalid class name and case insensitive filesystem */
    final class C02021 extends y implements l<ab, Boolean> {
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02021(boolean z) {
            super(1);
            this.$visible = z;
        }

        @Override // h.g.a.l
        public final Boolean invoke(ab abVar) {
            return Boolean.valueOf(this.$visible);
        }
    }

    private final void attachLookaheadAnimationVisualDebugHelper() {
    }

    private final void detachLookaheadAnimationVisualDebugHelper() {
    }

    public static /* synthetic */ void getTestBlockToRun$annotations() {
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ AnimatedVisibilityScope $animatedVisibilityScope;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ SharedTransitionScope.ResizeMode $resizeMode;
        final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.ResizeMode resizeMode) {
            super(3);
            this.$animatedVisibilityScope = animatedVisibilityScope;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$sharedContentState = sharedContentState;
            this.$resizeMode = resizeMode;
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            Modifier.Companion companionCreateContentScaleModifier;
            composer.startReplaceGroup(-233734437);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-233734437, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:1091)");
            }
            AnimatedVisibilityScope animatedVisibilityScope = this.$animatedVisibilityScope;
            EnterTransition enterTransition = this.$enter;
            ExitTransition exitTransition = this.$exit;
            SharedTransitionScope.SharedContentState sharedContentState = this.$sharedContentState;
            Transition<EnterExitState> transition = animatedVisibilityScope.getTransition();
            boolean zChangedInstance = composer.changedInstance(sharedContentState);
            SharedTransitionScope.SharedContentState sharedContentState2 = this.$sharedContentState;
            SharedTransitionScopeImpl$sharedBounds$2$1$1 sharedTransitionScopeImpl$sharedBounds$2$1$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance || sharedTransitionScopeImpl$sharedBounds$2$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sharedTransitionScopeImpl$sharedBounds$2$1$1RememberedValue = new SharedTransitionScopeImpl$sharedBounds$2$1$1(sharedContentState2);
                composer.updateRememberedValue(sharedTransitionScopeImpl$sharedBounds$2$1$1RememberedValue);
            }
            Object key = this.$sharedContentState.getKey();
            Objects.toString(key);
            Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, false, (a) sharedTransitionScopeImpl$sharedBounds$2$1$1RememberedValue, null, "enter/exit for ".concat(String.valueOf(key)), composer, 0, 20);
            if (this.$resizeMode instanceof ScaleToBoundsImpl) {
                composer.startReplaceGroup(-1039792755);
                Modifier.Companion companion = Modifier.Companion;
                ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) this.$resizeMode;
                boolean zChangedInstance2 = composer.changedInstance(this.$sharedContentState);
                SharedTransitionScope.SharedContentState sharedContentState3 = this.$sharedContentState;
                SharedTransitionScopeImpl$sharedBounds$2$2$1 sharedTransitionScopeImpl$sharedBounds$2$2$1RememberedValue = composer.rememberedValue();
                if (zChangedInstance2 || sharedTransitionScopeImpl$sharedBounds$2$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    sharedTransitionScopeImpl$sharedBounds$2$2$1RememberedValue = new SharedTransitionScopeImpl$sharedBounds$2$2$1(sharedContentState3);
                    composer.updateRememberedValue(sharedTransitionScopeImpl$sharedBounds$2$2$1RememberedValue);
                }
                companionCreateContentScaleModifier = SkipToLookaheadSizeNodeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (a) sharedTransitionScopeImpl$sharedBounds$2$2$1RememberedValue);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1039175545);
                composer.endReplaceGroup();
                companionCreateContentScaleModifier = Modifier.Companion;
            }
            Modifier modifierThen = modifierCreateModifier.then(companionCreateContentScaleModifier);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsImpl$1, reason: invalid class name and case insensitive filesystem */
    final class C02001 extends y implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ SharedTransitionScope.OverlayClip $clipInOverlayDuringTransition;
        final /* synthetic */ Transition $parentTransition;
        final /* synthetic */ SharedTransitionScope.PlaceholderSize $placeholderSize;
        final /* synthetic */ boolean $renderInOverlayDuringTransition;
        final /* synthetic */ boolean $renderOnlyWhenVisible;
        final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;
        final /* synthetic */ l $visible;
        final /* synthetic */ float $zIndexInOverlay;
        final /* synthetic */ SharedTransitionScopeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02001(SharedTransitionScope.SharedContentState sharedContentState, Transition transition, l lVar, SharedTransitionScopeImpl sharedTransitionScopeImpl, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, float f2, boolean z2, BoundsTransform boundsTransform) {
            super(3);
            this.$sharedContentState = sharedContentState;
            this.$parentTransition = transition;
            this.$visible = lVar;
            this.this$0 = sharedTransitionScopeImpl;
            this.$placeholderSize = placeholderSize;
            this.$renderOnlyWhenVisible = z;
            this.$clipInOverlayDuringTransition = overlayClip;
            this.$zIndexInOverlay = f2;
            this.$renderInOverlayDuringTransition = z2;
            this.$boundsTransform = boundsTransform;
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            Transition transitionRememberTransition;
            Composer composer2 = composer;
            composer2.startReplaceGroup(-1539505585);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1539505585, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:1288)");
            }
            Object key = this.$sharedContentState.getKey();
            composer2.startMovableGroup(-1996110647, key);
            SharedTransitionScopeImpl sharedTransitionScopeImpl = this.this$0;
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
                composer2.updateRememberedValue(objRememberedValue);
            }
            SharedElement sharedElement = (SharedElement) objRememberedValue;
            composer2.startMovableGroup(-1996106866, this.$parentTransition);
            Boolean bool = null;
            boolean z = false;
            if (this.$parentTransition != null) {
                composer2.startReplaceGroup(-1749734647);
                Transition transition = this.$parentTransition;
                String string = key.toString();
                l lVar = this.$visible;
                boolean zChanged = composer2.changed(transition);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = transition.getCurrentState();
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                if (transition.isSeeking()) {
                    objRememberedValue2 = transition.getCurrentState();
                }
                composer2.startReplaceGroup(1498260051);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1297)");
                }
                Boolean bool2 = (Boolean) lVar.invoke(objRememberedValue2);
                bool2.booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                Object targetState = transition.getTargetState();
                composer2.startReplaceGroup(1498260051);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1297)");
                }
                Boolean bool3 = (Boolean) lVar.invoke(targetState);
                bool3.booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                transitionRememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, bool2, bool3, string, composer2, 0);
                composer2 = composer2;
                if (transition.isSeeking()) {
                    composer2.startReplaceGroup(782538635);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(782386797);
                    Object pendingTargetState = transition.getPendingTargetState();
                    if (pendingTargetState == null) {
                        composer2.startReplaceGroup(782437481);
                    } else {
                        composer2.startReplaceGroup(782437482);
                        composer2.startReplaceGroup(1498260051);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1297)");
                        }
                        bool = (Boolean) lVar.invoke(pendingTargetState);
                        bool.booleanValue();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                    transitionRememberTransition.updatePendingTarget(bool);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1749482679);
                l lVar2 = this.$visible;
                x.d(lVar2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                au.h(lVar2, 1);
                Boolean bool4 = (Boolean) lVar2.invoke(ab.f48028a);
                boolean zBooleanValue = bool4.booleanValue();
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    if (sharedElement.getEnabledEntries().isEmpty()) {
                        z = zBooleanValue;
                    } else if (!zBooleanValue) {
                        z = true;
                    }
                    objRememberedValue3 = new MutableTransitionState(Boolean.valueOf(z));
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                mutableTransitionState.setTargetState$animation_core(bool4);
                transitionRememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, (String) null, composer2, MutableTransitionState.$stable, 2);
                composer2.endReplaceGroup();
            }
            Transition transition2 = transitionRememberTransition;
            composer2.startMovableGroup(-1996043323, Boolean.valueOf(this.this$0.isTransitionActive()));
            Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition2, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer2, 0, 2);
            composer2.endMovableGroup();
            boolean zChanged2 = composer2.changed(transition2);
            SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this.this$0;
            BoundsTransform boundsTransform = this.$boundsTransform;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                BoundsAnimation boundsAnimation = new BoundsAnimation(sharedTransitionScopeImpl2, transition2, deferredAnimationCreateDeferredAnimation, boundsTransform, sharedElement.getMomentumAnimationOffset());
                composer2.updateRememberedValue(boundsAnimation);
                objRememberedValue4 = boundsAnimation;
            }
            BoundsAnimation boundsAnimation2 = (BoundsAnimation) objRememberedValue4;
            boundsAnimation2.updateAnimation(deferredAnimationCreateDeferredAnimation, this.$boundsTransform);
            composer2.endMovableGroup();
            SharedElementEntry sharedElementEntryRememberSharedElementState = this.this$0.rememberSharedElementState(sharedElement, boundsAnimation2, this.$placeholderSize, this.$renderOnlyWhenVisible, this.$sharedContentState, this.$clipInOverlayDuringTransition, this.$zIndexInOverlay, this.$renderInOverlayDuringTransition, composer, 0);
            composer.endMovableGroup();
            Modifier modifierThen = modifier.then(new SharedBoundsNodeElement(sharedElementEntryRememberSharedElementState));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }
}
