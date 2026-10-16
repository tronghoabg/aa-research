package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachIntrinsicMeasureScope;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;
import h.k;
import h.k.n;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode, ObserverModifierNode, BoundsProvider, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Rect boundsBeforeDetached;
    private Density currentDensity;
    private LayoutDirection currentLayoutDirection;
    private FontFamily.Resolver currentResolver;
    private boolean isPlaced;
    private LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper;
    private final ModifierLocalMap providedValues;
    private SharedElementEntry sharedElementEntry;
    private TextMeasurer textMeasurer;

    public SharedBoundsNode(SharedElementEntry sharedElementEntry) {
        this.sharedElementEntry = sharedElementEntry;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(new k(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementEntry));
    }

    private final MeasureResult approachPlace(MeasureScope measureScope, Placeable placeable) {
        long width;
        if (getSharedElement().getState$animation().getMatchIsOrHasBeenConfigured()) {
            width = this.sharedElementEntry.getPlaceholderSize().mo1823calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo9743getSizeYbymL2g(), (placeable.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (placeable.getWidth() << 32));
        } else {
            width = (placeable.getWidth() << 32) | (placeable.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        return MeasureScope.CC.layout$default(measureScope, (int) (width >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & width), null, new AnonymousClass1(placeable), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void approachPlaceMatchBeyondTransition(Placeable.PlacementScope placementScope, Placeable placeable, Rect rect) {
        long jM11307getZeronOccac;
        if (getBoundsAnimation().getTarget()) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            jM11307getZeronOccac = IntOffsetKt.m11313roundk4lQ0M(Offset.m7984minusMKHz9U(rect.m8015getTopLeftF1C5BW0(), getRootCoords().mo9744localPositionOfR5De75A(coordinates, Offset.Companion.m7996getZeroF1C5BW0())));
        } else {
            jM11307getZeronOccac = IntOffset.Companion.m11307getZeronOccac();
        }
        Placeable.PlacementScope.place$default(placementScope, placeable, IntOffset.m11296getXimpl(jM11307getZeronOccac), IntOffset.m11297getYimpl(jM11307getZeronOccac), 0.0f, 4, null);
    }

    private final void drawContentWithLookaheadAnimationDebug(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, Rect rect, LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig) throws Throwable {
        if (this.lookaheadAnimationVisualDebugHelper == null) {
            this.lookaheadAnimationVisualDebugHelper = new LookaheadAnimationVisualDebugHelper();
        }
        if (this.currentDensity == null) {
            SharedBoundsNode sharedBoundsNode = this;
            this.currentDensity = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(sharedBoundsNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            this.currentLayoutDirection = (LayoutDirection) CompositionLocalConsumerModifierNodeKt.currentValueOf(sharedBoundsNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        }
        SharedBoundsNode sharedBoundsNode2 = this;
        long jM8238unboximpl = ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(sharedBoundsNode2, CompositionLocalsKt.getLocalLookaheadAnimationVisualDebugColor())).m8238unboximpl();
        float f2 = contentDrawScope.mo2127toPx0680j_4(2.5f);
        TargetData targetData = getSharedElement().getState$animation().getTargetData();
        updateTextMeasurer((FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(sharedBoundsNode2, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver()));
        if (graphicsLayer != null) {
            DrawScope.CC.m8839recordJVtK1S4$default(contentDrawScope, graphicsLayer, 0L, new C01961(contentDrawScope, this, lookaheadAnimationVisualDebugConfig, f2, targetData, rect, jM8238unboximpl), 1, null);
        } else {
            contentDrawScope.drawContent();
            drawContentWithLookaheadAnimationDebug$drawDebug(this, lookaheadAnimationVisualDebugConfig, f2, targetData, rect, jM8238unboximpl, contentDrawScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawContentWithLookaheadAnimationDebug$drawDebug(SharedBoundsNode sharedBoundsNode, LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig, float f2, TargetData targetData, Rect rect, long j2, ContentDrawScope contentDrawScope) throws Throwable {
        if (sharedBoundsNode.sharedElementEntry.isEnabled()) {
            LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper = sharedBoundsNode.lookaheadAnimationVisualDebugHelper;
            x.c(lookaheadAnimationVisualDebugHelper);
            if (!sharedBoundsNode.getSharedElement().getScope().isTransitionActive()) {
                lookaheadAnimationVisualDebugHelper.m1786drawInactiveVisualizations3IgeMak$animation(contentDrawScope, j2, lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled(), f2, sharedBoundsNode.getSharedElement().getKey(), sharedBoundsNode.textMeasurer);
                return;
            }
            if (!sharedBoundsNode.getSharedElement().getBoundsTransformIsActive()) {
                long jM1781getUnmatchedElementColor0d7_KjU = lookaheadAnimationVisualDebugConfig.m1781getUnmatchedElementColor0d7_KjU();
                boolean zIsShowKeyLabelEnabled = lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled();
                Object key = sharedBoundsNode.getSharedElement().getKey();
                TextMeasurer textMeasurer = sharedBoundsNode.textMeasurer;
                x.c(textMeasurer);
                lookaheadAnimationVisualDebugHelper.m1790drawUnmatchedElement3IgeMak$animation(contentDrawScope, jM1781getUnmatchedElementColor0d7_KjU, zIsShowKeyLabelEnabled, key, textMeasurer, f2);
                return;
            }
            if (sharedBoundsNode.getSharedElement().getEnabledEntries().size() <= 2) {
                if (targetData == null || rect == null) {
                    return;
                }
                lookaheadAnimationVisualDebugHelper.m1787drawLocalVisualizations0XenJco$animation(contentDrawScope, j2, SharedTransitionStateMachineKt.getTargetBounds(targetData).m8015getTopLeftF1C5BW0(), targetData.m1846getSizeNHjbRc(), rect, contentDrawScope.mo8750getCenterF1C5BW0(), lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled(), f2, sharedBoundsNode.getSharedElement().getKey(), sharedBoundsNode.textMeasurer);
                return;
            }
            long jM1779getMultipleMatchesColor0d7_KjU = lookaheadAnimationVisualDebugConfig.m1779getMultipleMatchesColor0d7_KjU();
            boolean zIsShowKeyLabelEnabled2 = lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled();
            Object key2 = sharedBoundsNode.getSharedElement().getKey();
            int size = sharedBoundsNode.getSharedElement().getEnabledEntries().size() - 1;
            TextMeasurer textMeasurer2 = sharedBoundsNode.textMeasurer;
            x.c(textMeasurer2);
            lookaheadAnimationVisualDebugHelper.m1788drawMultipleMatchesElementsW7UJKQ$animation(contentDrawScope, jM1779getMultipleMatchesColor0d7_KjU, zIsShowKeyLabelEnabled2, key2, size, textMeasurer2, f2 * 3.0f);
        }
    }

    private final void drawContentWithOptionalDebug(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, Rect rect) {
        if (graphicsLayer != null) {
            DrawScope.CC.m8839recordJVtK1S4$default(contentDrawScope, graphicsLayer, 0L, new C01971(contentDrawScope, rect, this), 1, null);
        } else {
            contentDrawScope.drawContent();
        }
    }

    private final LayoutCoordinates getApproachCoordinates() {
        return DelegatableNodeKt.requireLayoutCoordinates(this);
    }

    private final BoundsAnimation getBoundsAnimation() {
        return this.sharedElementEntry.getBoundsAnimation();
    }

    private final GraphicsLayer getLayer() {
        return this.sharedElementEntry.getLayer();
    }

    private final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement getSharedElement() {
        return this.sharedElementEntry.getSharedElement();
    }

    private final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        return this.sharedElementEntry.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    private final void setLayer(GraphicsLayer graphicsLayer) {
        GraphicsLayer layer = this.sharedElementEntry.getLayer();
        if (x.n(graphicsLayer, layer)) {
            return;
        }
        if (layer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(layer);
        }
        this.sharedElementEntry.setLayer(graphicsLayer);
    }

    private final void setup() {
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.sharedElementEntry);
        this.sharedElementEntry.setParentState((SharedElementEntry) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(null);
        this.isPlaced = false;
        this.sharedElementEntry.setBoundsProvider(this);
    }

    private final void updateTextMeasurer(FontFamily.Resolver resolver) {
        if (this.textMeasurer == null || !x.n(this.currentResolver, resolver)) {
            Density density = this.currentDensity;
            x.c(density);
            LayoutDirection layoutDirection = this.currentLayoutDirection;
            x.c(layoutDirection);
            this.textMeasurer = new TextMeasurer(resolver, density, layoutDirection, 0, 8, null);
            this.currentResolver = resolver;
        }
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo1737approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        int i2;
        Rect value = getBoundsAnimation().getValue();
        if (value == null) {
            value = getSharedElement().tryInitializingCurrentBounds();
        }
        if (value != null) {
            long jM11347roundToIntSizeuvyYCjk = IntSizeKt.m11347roundToIntSizeuvyYCjk(value.m8013getSizeNHjbRc());
            long j3 = jM11347roundToIntSizeuvyYCjk >> 32;
            long j4 = jM11347roundToIntSizeuvyYCjk & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            int i3 = (int) j3;
            if (i3 == Integer.MAX_VALUE || (i2 = (int) j4) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getState$animation().getCurrentBounds());
            }
            j2 = Constraints.Companion.m11117fixedJhjzzOo(n.h(i3, 0), n.h(i2, 0));
        }
        return approachPlace(approachMeasureScope, measurable.mo9741measureBRTryo0(j2));
    }

    public final void approachPlaceMatchInTransition$animation(Placeable.PlacementScope placementScope, Placeable placeable, TargetData targetData, Rect rect) {
        long jM7990unboximpl;
        long jM7990unboximpl2;
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates == null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        boolean activeMatchFound = getSharedElement().getState$animation().getActiveMatchFound();
        long jMo9744localPositionOfR5De75A = getRootCoords().mo9744localPositionOfR5De75A(coordinates, Offset.Companion.m7996getZeroF1C5BW0());
        SharedTransitionStateMachineKt.getTargetBounds(targetData);
        if (activeMatchFound) {
            BoundsAnimation.animate$default(getBoundsAnimation(), rect, SharedTransitionStateMachineKt.getTargetBounds(targetData), null, 4, null);
        } else {
            getBoundsAnimation().animate(rect, SharedTransitionStateMachineKt.getTargetBounds(targetData), new BoundsTransform() { // from class: androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda1
                @Override // androidx.compose.animation.BoundsTransform
                public final FiniteAnimationSpec createAnimationSpec(Rect rect2, Rect rect3) {
                    return AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
                }
            });
        }
        Rect value = getBoundsAnimation().getValue();
        Offset offset = null;
        Offset offsetM7969boximpl = value != null ? Offset.m7969boximpl(SharedTransitionStateMachineKt.calculateOffsetFromDirectManipulation(targetData, value)) : null;
        if (getBoundsAnimation().getTarget() || !activeMatchFound) {
            if (offsetM7969boximpl != null) {
                jM7990unboximpl = offsetM7969boximpl.m7990unboximpl();
                offset = offsetM7969boximpl;
            } else {
                jM7990unboximpl = jMo9744localPositionOfR5De75A;
            }
            getSharedElement().getState$animation().updateBounds(offset == null ? RectKt.m8020Recttz77jQw(jMo9744localPositionOfR5De75A, IntSizeKt.m11351toSizeozmzZPI(coordinates.mo9743getSizeYbymL2g())) : RectKt.m8020Recttz77jQw(offset.m7990unboximpl(), value.m8013getSizeNHjbRc()));
            jM7990unboximpl2 = jM7990unboximpl;
        } else {
            jM7990unboximpl2 = offsetM7969boximpl != null ? offsetM7969boximpl.m7990unboximpl() : rect.m8015getTopLeftF1C5BW0();
        }
        long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(jM7990unboximpl2, jMo9744localPositionOfR5De75A);
        Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (jM7984minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM7984minusMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE))), 0.0f, 4, null);
    }

    @Override // androidx.compose.animation.BoundsProvider
    public Rect calculateAlternativeTargetBounds(Rect rect) {
        return this.sharedElementEntry.calculateTargetBounds(rect);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Rect currentBounds = getSharedElement().getState$animation().getCurrentBounds();
        boolean shouldRenderInOverlay$animation = this.sharedElementEntry.getShouldRenderInOverlay$animation();
        SharedElementEntry sharedElementEntry = this.sharedElementEntry;
        if (!shouldRenderInOverlay$animation) {
            sharedElementEntry.setClipPathInOverlay$animation(null);
            setLayer(null);
            if (this.sharedElementEntry.getShouldRenderInPlace()) {
                drawContentWithOptionalDebug(contentDrawScope, null, currentBounds);
                return;
            }
            return;
        }
        sharedElementEntry.setClipPathInOverlay$animation(currentBounds != null ? sharedElementEntry.getOverlayClip().getClipPath(this.sharedElementEntry.getUserState(), currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)) : null);
        if (getLayer() == null) {
            setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        }
        GraphicsLayer layer = this.sharedElementEntry.getLayer();
        if (layer == null) {
            throw new IllegalStateException("Error: shared element does not have a layer for rendering in the overlay.");
        }
        drawContentWithOptionalDebug(contentDrawScope, layer, currentBounds);
        if (this.sharedElementEntry.getShouldRenderInPlace()) {
            GraphicsLayerKt.drawLayer(contentDrawScope, layer);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.animation.BoundsProvider
    public Rect getLastBoundsInSharedTransitionScope() {
        if (isAttached()) {
            return !this.isPlaced ? this.boundsBeforeDetached : RectKt.m8020Recttz77jQw(LayoutCoordinates.CC.m9763localPositionOfS_NoaFU$default(getRootCoords(), getApproachCoordinates(), 0L, false, 6, null), IntSizeKt.m11351toSizeozmzZPI(getApproachCoordinates().mo9743getSizeYbymL2g()));
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final SharedElementEntry getSharedElementEntry() {
        return this.sharedElementEntry;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo1738isMeasurementApproachInProgressozmzZPI(long j2) {
        return this.sharedElementEntry.isEnabled() && getSharedElement().getFoundMatch() && getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public /* synthetic */ boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public /* synthetic */ int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return ApproachLayoutModifierNode.CC.$default$maxApproachIntrinsicHeight(this, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public /* synthetic */ int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return ApproachLayoutModifierNode.CC.$default$maxApproachIntrinsicWidth(this, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new SharedBoundsNode$measure$1(placeableMo9741measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public /* synthetic */ int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return ApproachLayoutModifierNode.CC.$default$minApproachIntrinsicHeight(this, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public /* synthetic */ int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return ApproachLayoutModifierNode.CC.$default$minApproachIntrinsicWidth(this, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        ObserverModifierNodeKt.observeReads(this, getSharedElement().getObservingVisibilityChange$animation());
        setup();
        this.sharedElementEntry.setAttached(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        LayoutCoordinates nullableRoot$animation = getSharedElement().getScope().getNullableRoot$animation();
        if (nullableRoot$animation != null) {
            this.boundsBeforeDetached = (nullableRoot$animation.isAttached() && this.isPlaced) ? RectKt.m8020Recttz77jQw(Offset.m7984minusMKHz9U(LayoutCoordinatesKt.positionInRoot(getApproachCoordinates()), LayoutCoordinatesKt.positionInRoot(nullableRoot$animation)), IntSizeKt.m11351toSizeozmzZPI(getApproachCoordinates().mo9743getSizeYbymL2g())) : null;
        }
        setLayer(null);
        this.sharedElementEntry.setParentState(null);
        this.sharedElementEntry.setBoundsProvider(null);
        this.sharedElementEntry.setAttached(false);
        this.isPlaced = false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        getSharedElement().updateMatch$animation();
        ObserverModifierNodeKt.observeReads(this, getSharedElement().getObservingVisibilityChange$animation());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        this.boundsBeforeDetached = null;
        setLayer(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    public final void setSharedElementEntry$animation(SharedElementEntry sharedElementEntry) {
        if (x.n(sharedElementEntry, this.sharedElementEntry)) {
            return;
        }
        this.sharedElementEntry.setAttached(false);
        this.sharedElementEntry = sharedElementEntry;
        sharedElementEntry.setAttached(isAttached());
        if (isAttached()) {
            setup();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedBoundsNode$drawContentWithOptionalDebug$1, reason: invalid class name and case insensitive filesystem */
    final class C01971 extends y implements l<DrawScope, ab> {
        final /* synthetic */ Rect $bounds;
        final /* synthetic */ ContentDrawScope $this_drawContentWithOptionalDebug;
        final /* synthetic */ SharedBoundsNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01971(ContentDrawScope contentDrawScope, Rect rect, SharedBoundsNode sharedBoundsNode) {
            super(1);
            this.$this_drawContentWithOptionalDebug = contentDrawScope;
            this.$bounds = rect;
            this.this$0 = sharedBoundsNode;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            this.$this_drawContentWithOptionalDebug.drawContent();
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedBoundsNode$drawContentWithLookaheadAnimationDebug$1, reason: invalid class name and case insensitive filesystem */
    final class C01961 extends y implements l<DrawScope, ab> {
        final /* synthetic */ Rect $bounds;
        final /* synthetic */ long $lookaheadAnimationVisualDebugColor;
        final /* synthetic */ float $strokeWeight;
        final /* synthetic */ TargetData $targetData;
        final /* synthetic */ ContentDrawScope $this_drawContentWithLookaheadAnimationDebug;
        final /* synthetic */ LookaheadAnimationVisualDebugConfig $visualDebugConfig;
        final /* synthetic */ SharedBoundsNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01961(ContentDrawScope contentDrawScope, SharedBoundsNode sharedBoundsNode, LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig, float f2, TargetData targetData, Rect rect, long j2) {
            super(1);
            this.$this_drawContentWithLookaheadAnimationDebug = contentDrawScope;
            this.this$0 = sharedBoundsNode;
            this.$visualDebugConfig = lookaheadAnimationVisualDebugConfig;
            this.$strokeWeight = f2;
            this.$targetData = targetData;
            this.$bounds = rect;
            this.$lookaheadAnimationVisualDebugColor = j2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) throws Throwable {
            ContentDrawScope contentDrawScope = this.$this_drawContentWithLookaheadAnimationDebug;
            contentDrawScope.drawContent();
            SharedBoundsNode.drawContentWithLookaheadAnimationDebug$drawDebug(this.this$0, this.$visualDebugConfig, this.$strokeWeight, this.$targetData, this.$bounds, this.$lookaheadAnimationVisualDebugColor, contentDrawScope);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) throws Throwable {
            invoke2(drawScope);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedBoundsNode$approachPlace$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Placeable.PlacementScope, ab> {
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable) {
            super(1);
            this.$placeable = placeable;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
            SharedBoundsNode.this.isPlaced = true;
            SharedBoundsNode.this.boundsBeforeDetached = null;
            SharedTransitionStateMachine.State state$animation = SharedBoundsNode.this.getSharedElement().getState$animation();
            if (!SharedBoundsNode.this.getSharedElementEntry().isEnabled()) {
                Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
                return;
            }
            if (!state$animation.getMatchIsOrHasBeenConfigured()) {
                Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
                return;
            }
            TargetData targetData = state$animation.getTargetData();
            if (targetData == null) {
                Objects.toString(state$animation);
                throw new IllegalArgumentException("Match State is configured, but target data is null. State = ".concat(String.valueOf(state$animation)));
            }
            Rect currentBounds = state$animation.getCurrentBounds();
            if (currentBounds == null) {
                Objects.toString(state$animation);
                throw new IllegalArgumentException("Match State is configured, but current bounds is null. State = ".concat(String.valueOf(state$animation)));
            }
            boolean zIsTransitionActive = SharedBoundsNode.this.getSharedElement().getScope().isTransitionActive();
            SharedBoundsNode sharedBoundsNode = SharedBoundsNode.this;
            if (zIsTransitionActive) {
                sharedBoundsNode.approachPlaceMatchInTransition$animation(placementScope, this.$placeable, targetData, currentBounds);
            } else {
                sharedBoundsNode.approachPlaceMatchBeyondTransition(placementScope, this.$placeable, currentBounds);
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return ab.f48028a;
        }
    }
}
