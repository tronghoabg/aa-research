package androidx.compose.foundation.style;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.border.BorderLogic;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.modifiers.TextStyleProviderNode;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ao;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleOuterNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, TraversableNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, CompositionLocalAccessorScope, TextStyleProviderNode {
    public static final int $stable = 8;
    private StyleProperties _bufferOrNull;
    private StyleProperties _resolved;
    private StyleState _state;
    private MutableObjectList<StyleOuterNode> ancestorNodes;
    private GraphicsLayer borderLayer;
    private a<GraphicsLayer> borderLayerProvider;
    private final BorderLogic borderLogic;
    private final ResolvedStyle builder;
    private DropShadowPainter[] cachedDropShadowPainters;
    private StyleProperties cachedInheritedStyle;
    private InnerShadowPainter[] cachedInnerShadowPainters;
    private InteractionSource currentInteractionSource;
    private boolean inheritedStyleDirty;
    private StyleInnerNode innerNodeField;
    private Shadow[] lastDropShadow;
    private Shadow[] lastInnerShadow;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private long lastSize;
    private l<? super GraphicsLayerScope, ab> layerBlock;
    private final af overrideScope;
    private br sourceJob;
    private Style style;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.style.StyleOuterNode$updateInteractionSources$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ InteractionSource $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InteractionSource interactionSource, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$source = interactionSource;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return StyleOuterNode.this.new AnonymousClass1(this.$source, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                StyleOuterNode styleOuterNode = StyleOuterNode.this;
                InteractionSource interactionSource = this.$source;
                this.label = 1;
                if (styleOuterNode._state.processInteractions$foundation(interactionSource, this) == aVar) {
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

    public StyleOuterNode(MutableStyleState mutableStyleState, Style style, af afVar) {
        this.overrideScope = afVar;
        this.style = style;
        this.builder = new ResolvedStyle();
        this._resolved = new StyleProperties();
        this.borderLogic = new BorderLogic();
        this._state = mutableStyleState == null ? new MutableStyleState(null) : mutableStyleState;
        this.lastSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab _get_layerBlockNonNull_$lambda$0$0(StyleOuterNode styleOuterNode, GraphicsLayerScope graphicsLayerScope) {
        styleOuterNode.updateLayer(graphicsLayerScope);
        return ab.f48028a;
    }

    private final StyleProperties currentLayerStyle() {
        return resolveAnimatedStyleFor$foundation$default(this, 4, null, 2, null);
    }

    private final StyleProperties currentLayoutStyle() {
        return resolveAnimatedStyleFor$foundation$default(this, 8, null, 2, null);
    }

    private final void drawDropShadow(ContentDrawScope contentDrawScope, int i2, Shape shape, Shadow shadow) {
        Shadow[] shadowArr = this.lastDropShadow;
        Shadow shadow2 = shadowArr != null ? (Shadow) h.a.c.O(shadowArr, i2) : null;
        DropShadowPainter[] dropShadowPainterArr = this.cachedDropShadowPainters;
        DropShadowPainter dropShadowPainterCreateDropShadowPainter = dropShadowPainterArr != null ? (DropShadowPainter) h.a.c.O(dropShadowPainterArr, i2) : null;
        if (!x.n(shadow2, shadow) || dropShadowPainterCreateDropShadowPainter == null) {
            dropShadowPainterCreateDropShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createDropShadowPainter(shape, shadow);
        }
        Shadow[] shadowArr2 = this.lastDropShadow;
        if (shadowArr2 != null) {
            shadowArr2[i2] = shadow;
        }
        DropShadowPainter[] dropShadowPainterArr2 = this.cachedDropShadowPainters;
        if (dropShadowPainterArr2 != null) {
            dropShadowPainterArr2[i2] = dropShadowPainterCreateDropShadowPainter;
        }
        Painter.m8964drawx_KDEd0$default(dropShadowPainterCreateDropShadowPainter, contentDrawScope, contentDrawScope.mo8751getSizeNHjbRc(), 0.0f, null, 6, null);
    }

    static final GraphicsLayer drawForShape_9zt3ed4$lambda$1(StyleOuterNode styleOuterNode) {
        GraphicsLayer graphicsLayer = styleOuterNode.borderLayer;
        if (graphicsLayer != null) {
            return graphicsLayer;
        }
        GraphicsLayer graphicsLayerCreateGraphicsLayer = DelegatableNodeKt.requireGraphicsContext(styleOuterNode).createGraphicsLayer();
        styleOuterNode.borderLayer = graphicsLayerCreateGraphicsLayer;
        return graphicsLayerCreateGraphicsLayer;
    }

    private final void drawInnerShadow(ContentDrawScope contentDrawScope, int i2, Shape shape, Shadow shadow) {
        Shadow[] shadowArr = this.lastInnerShadow;
        Shadow shadow2 = shadowArr != null ? (Shadow) h.a.c.O(shadowArr, i2) : null;
        InnerShadowPainter[] innerShadowPainterArr = this.cachedInnerShadowPainters;
        InnerShadowPainter innerShadowPainterCreateInnerShadowPainter = innerShadowPainterArr != null ? (InnerShadowPainter) h.a.c.O(innerShadowPainterArr, i2) : null;
        if (!x.n(shadow2, shadow) || innerShadowPainterCreateInnerShadowPainter == null) {
            innerShadowPainterCreateInnerShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(shape, shadow);
        }
        Shadow[] shadowArr2 = this.lastInnerShadow;
        if (shadowArr2 != null) {
            shadowArr2[i2] = shadow;
        }
        InnerShadowPainter[] innerShadowPainterArr2 = this.cachedInnerShadowPainters;
        if (innerShadowPainterArr2 != null) {
            innerShadowPainterArr2[i2] = innerShadowPainterCreateInnerShadowPainter;
        }
        Painter.m8964drawx_KDEd0$default(innerShadowPainterCreateInnerShadowPainter, contentDrawScope, contentDrawScope.mo8751getSizeNHjbRc(), 0.0f, null, 6, null);
    }

    private final StyleProperties getBufferNonNull() {
        StyleProperties styleProperties = this._bufferOrNull;
        if (styleProperties == null) {
            styleProperties = new StyleProperties();
            this._bufferOrNull = styleProperties;
        }
        x.c(styleProperties);
        return styleProperties;
    }

    /* renamed from: getOutline-12SF9DM, reason: not valid java name */
    private final Outline m3151getOutline12SF9DM(ContentDrawScope contentDrawScope, long j2, Shape shape) {
        Outline outlineMo2037createOutlinePq9zytI;
        if (Size.m8045equalsimpl0(this.lastSize, j2) && this.lastLayoutDirection == contentDrawScope.getLayoutDirection() && x.n(this.lastShape, shape)) {
            outlineMo2037createOutlinePq9zytI = this.lastOutline;
            x.c(outlineMo2037createOutlinePq9zytI);
        } else {
            outlineMo2037createOutlinePq9zytI = shape.mo2037createOutlinePq9zytI(j2, contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        this.lastOutline = outlineMo2037createOutlinePq9zytI;
        this.lastSize = j2;
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        return outlineMo2037createOutlinePq9zytI;
    }

    private final void invalidateTextDraw() {
        this.inheritedStyleDirty = true;
        DelegatableNodeKt.invalidateDrawForSubtree(this);
    }

    private final void invalidateTextLayout() {
        this.inheritedStyleDirty = true;
        DelegatableNodeKt.invalidateMeasurementForSubtree(this);
    }

    static final ab measure_3p2s80s$lambda$12(StyleOuterNode styleOuterNode, long j2, Placeable placeable, float f2, float f3, float f4, float f5, Placeable.PlacementScope placementScope) {
        StyleProperties stylePropertiesCurrentLayoutStyle = styleOuterNode.currentLayoutStyle();
        int iM11107getMaxWidthimpl = StyleModifierKt.shouldPlaceRelativeToRight(stylePropertiesCurrentLayoutStyle) ? (Constraints.m11107getMaxWidthimpl(j2) - placeable.getWidth()) - Math.round(f2) : Math.round(f3);
        int iM11106getMaxHeightimpl = StyleModifierKt.shouldPlaceRelativeToBottom(stylePropertiesCurrentLayoutStyle) ? (Constraints.m11106getMaxHeightimpl(j2) - placeable.getHeight()) - Math.round(f4) : Math.round(f5);
        if ((stylePropertiesCurrentLayoutStyle.getPhaseFlags$foundation() & 4) != 0) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, 0.0f, styleOuterNode.getLayerBlockNonNull$foundation(), 4, (Object) null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    public static /* synthetic */ StyleProperties resolveAnimatedStyleFor$foundation$default(StyleOuterNode styleOuterNode, int i2, StyleProperties styleProperties, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            styleProperties = styleOuterNode._resolved;
        }
        return styleOuterNode.resolveAnimatedStyleFor$foundation(i2, styleProperties);
    }

    static final boolean resolveInheritedStyle$lambda$1(aq aqVar, StyleOuterNode styleOuterNode, TraversableNode traversableNode) {
        if (traversableNode instanceof StyleOuterNode) {
            StyleOuterNode styleOuterNode2 = (StyleOuterNode) traversableNode;
            if ((styleOuterNode2._resolved.getPhaseFlags$foundation() & 48) != 0 || (styleOuterNode2.builder.getAnimatingFlags() & 48) != 0) {
                MutableObjectList<StyleOuterNode> mutableObjectList = (MutableObjectList) aqVar.f48105a;
                if (mutableObjectList == null) {
                    mutableObjectList = new MutableObjectList<>(0, 1, null);
                    aqVar.f48105a = mutableObjectList;
                    styleOuterNode.ancestorNodes = mutableObjectList;
                }
                mutableObjectList.add(traversableNode);
            }
        }
        return true;
    }

    public static /* synthetic */ void resolveStyleAndInvalidate$default(StyleOuterNode styleOuterNode, boolean z, int i2, Object obj) {
        styleOuterNode.resolveStyleAndInvalidate(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
    }

    static final ab resolveStyleAndInvalidate$lambda$0(StyleOuterNode styleOuterNode, Density density, StyleProperties styleProperties, StyleProperties styleProperties2, ao aoVar) {
        styleOuterNode.builder.build$foundation(styleOuterNode.style, styleOuterNode, density);
        styleOuterNode.builder.resolveInto(0, styleProperties);
        styleOuterNode._resolved = styleProperties;
        styleOuterNode._bufferOrNull = styleProperties2;
        aoVar.f48103a = styleOuterNode.builder.getAnimatingFlags();
        return ab.f48028a;
    }

    private final void updateLayer(GraphicsLayerScope graphicsLayerScope) {
        ColorFilter colorFilter;
        StyleProperties stylePropertiesCurrentLayerStyle = currentLayerStyle();
        graphicsLayerScope.setAlpha(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.AlphaId) ? stylePropertiesCurrentLayerStyle.alpha : 1.0f);
        graphicsLayerScope.setScaleX(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.ScaleXId) ? stylePropertiesCurrentLayerStyle.scaleX : 1.0f);
        graphicsLayerScope.setScaleY(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.ScaleYId) ? stylePropertiesCurrentLayerStyle.scaleY : 1.0f);
        graphicsLayerScope.setTranslationX(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.TranslationXId) ? stylePropertiesCurrentLayerStyle.translationX : 0.0f);
        graphicsLayerScope.setTranslationY(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.TranslationYId) ? stylePropertiesCurrentLayerStyle.translationY : 0.0f);
        graphicsLayerScope.setRotationX(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.RotationXId) ? stylePropertiesCurrentLayerStyle.rotationX : 0.0f);
        graphicsLayerScope.setRotationY(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.RotationYId) ? stylePropertiesCurrentLayerStyle.rotationY : 0.0f);
        graphicsLayerScope.setRotationZ(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.RotationZId) ? stylePropertiesCurrentLayerStyle.rotationZ : 0.0f);
        if (stylePropertiesCurrentLayerStyle.hasId(54)) {
            colorFilter = stylePropertiesCurrentLayerStyle.colorFilter;
            x.c(colorFilter);
        } else {
            colorFilter = null;
        }
        graphicsLayerScope.setColorFilter(colorFilter);
        long jM8671getCenterSzJe1aQ = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
        if (stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.TransformOriginXId) || stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.TransformOriginYId)) {
            float fM8666getPivotFractionXimpl = TransformOrigin.m8666getPivotFractionXimpl(jM8671getCenterSzJe1aQ);
            if (stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.TransformOriginXId)) {
                fM8666getPivotFractionXimpl = stylePropertiesCurrentLayerStyle.transformOriginX;
            }
            float fM8667getPivotFractionYimpl = TransformOrigin.m8667getPivotFractionYimpl(jM8671getCenterSzJe1aQ);
            if (stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.TransformOriginYId)) {
                fM8667getPivotFractionYimpl = stylePropertiesCurrentLayerStyle.transformOriginY;
            }
            jM8671getCenterSzJe1aQ = TransformOriginKt.TransformOrigin(fM8666getPivotFractionXimpl, fM8667getPivotFractionYimpl);
        }
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(jM8671getCenterSzJe1aQ);
        graphicsLayerScope.setClip(stylePropertiesCurrentLayerStyle.hasId(StylePropertiesKt.ClipId) ? stylePropertiesCurrentLayerStyle.clip : false);
        Shape rectangleShape = RectangleShapeKt.getRectangleShape();
        if (stylePropertiesCurrentLayerStyle.hasId(53)) {
            rectangleShape = stylePropertiesCurrentLayerStyle.shape;
        }
        graphicsLayerScope.setShape(rectangleShape);
    }

    @Override // androidx.compose.foundation.text.modifiers.TextStyleProviderNode
    /* renamed from: computeInheritedTextStyle-B-LjeIk, reason: not valid java name */
    public TextStyle mo3152computeInheritedTextStyleBLjeIk(int i2, TextStyle textStyle) {
        StyleProperties stylePropertiesResolveInheritedStyle$foundation = resolveInheritedStyle$foundation(StyleModifierKt.m3150toFlagsuwmK9pY(i2));
        return stylePropertiesResolveInheritedStyle$foundation != null ? StyleModifierKt.toTextStyle(stylePropertiesResolveInheritedStyle$foundation, textStyle) : textStyle;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Brush brush;
        Brush brush2;
        long j2;
        boolean z;
        Shape shape;
        long j3;
        boolean z2;
        long j4;
        Shape shape2;
        boolean z3;
        long j5;
        Brush brush3 = null;
        StyleProperties stylePropertiesResolveAnimatedStyleFor$foundation$default = resolveAnimatedStyleFor$foundation$default(this, 2, null, 2, null);
        long jM8264getUnspecified0d7_KjU = Color.Companion.m8264getUnspecified0d7_KjU();
        if (stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId(StylePropertiesKt.BackgroundColorId)) {
            jM8264getUnspecified0d7_KjU = stylePropertiesResolveAnimatedStyleFor$foundation$default.m3162getBackgroundColor0d7_KjU$foundation();
        }
        if (stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId(51)) {
            Brush brush4 = stylePropertiesResolveAnimatedStyleFor$foundation$default.backgroundBrush;
            x.c(brush4);
            brush = brush4;
        } else {
            brush = null;
        }
        long jM8264getUnspecified0d7_KjU2 = Color.Companion.m8264getUnspecified0d7_KjU();
        if (stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId(StylePropertiesKt.ForegroundColorId)) {
            jM8264getUnspecified0d7_KjU2 = stylePropertiesResolveAnimatedStyleFor$foundation$default.m3169getForegroundColor0d7_KjU$foundation();
        }
        if (stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId(52)) {
            Brush brush5 = stylePropertiesResolveAnimatedStyleFor$foundation$default.foregroundBrush;
            x.c(brush5);
            brush2 = brush5;
        } else {
            brush2 = null;
        }
        long jM8254getBlack0d7_KjU = Color.Companion.m8254getBlack0d7_KjU();
        if (stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId(StylePropertiesKt.BorderColorId)) {
            jM8254getBlack0d7_KjU = stylePropertiesResolveAnimatedStyleFor$foundation$default.m3164getBorderColor0d7_KjU$foundation();
        }
        if (stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId(50)) {
            brush3 = stylePropertiesResolveAnimatedStyleFor$foundation$default.borderBrush;
            x.c(brush3);
        }
        Brush brush6 = brush3;
        float f2 = stylePropertiesResolveAnimatedStyleFor$foundation$default.hasId((byte) 8) ? stylePropertiesResolveAnimatedStyleFor$foundation$default.borderWidth : 0.0f;
        Shape shape3 = stylePropertiesResolveAnimatedStyleFor$foundation$default.shape;
        if (f2 / 2.0f > 0.0f) {
            j2 = jM8264getUnspecified0d7_KjU;
            z = true;
        } else {
            j2 = jM8264getUnspecified0d7_KjU;
            z = false;
        }
        if (j2 != 16) {
            long j6 = j2;
            j3 = jM8264getUnspecified0d7_KjU2;
            j4 = j6;
            shape = shape3;
            z2 = true;
        } else {
            shape = shape3;
            j3 = jM8264getUnspecified0d7_KjU2;
            z2 = brush != null;
            j4 = 16;
        }
        if (j3 != 16) {
            shape2 = shape;
            z3 = true;
            j5 = j3;
        } else {
            if (brush2 != null) {
                shape2 = shape;
                z3 = true;
            } else {
                shape2 = shape;
                z3 = false;
            }
            j5 = 16;
        }
        drawDropShadow(contentDrawScope, stylePropertiesResolveAnimatedStyleFor$foundation$default);
        Shape shape4 = shape2;
        m3153drawForShape9zt3ed4(contentDrawScope, shape4, z2, z, z3, j4, brush, jM8254getBlack0d7_KjU, brush6, j5, brush2, f2);
        drawInnerShadow(contentDrawScope, stylePropertiesResolveAnimatedStyleFor$foundation$default);
        this.lastShape = shape4;
    }

    /* renamed from: drawForShape-9zt3ed4, reason: not valid java name */
    public final void m3153drawForShape9zt3ed4(ContentDrawScope contentDrawScope, Shape shape, boolean z, boolean z2, boolean z3, long j2, Brush brush, long j3, Brush brush2, long j4, Brush brush3, final float f2) {
        Outline outlineM3151getOutline12SF9DM = m3151getOutline12SF9DM(contentDrawScope, contentDrawScope.mo8751getSizeNHjbRc(), shape);
        if (z) {
            if (brush != null) {
                OutlineKt.m8528drawOutlinehn5TExg$default(contentDrawScope, outlineM3151getOutline12SF9DM, brush, 0.0f, null, null, 0, 60, null);
            } else {
                OutlineKt.m8530drawOutlinewDX37Ww$default(contentDrawScope, outlineM3151getOutline12SF9DM, j2, 0.0f, null, null, 0, 60, null);
            }
        }
        contentDrawScope.drawContent();
        if (z3) {
            if (brush3 != null) {
                OutlineKt.m8528drawOutlinehn5TExg$default(contentDrawScope, outlineM3151getOutline12SF9DM, brush3, 0.0f, null, null, 0, 60, null);
            } else {
                OutlineKt.m8530drawOutlinewDX37Ww$default(contentDrawScope, outlineM3151getOutline12SF9DM, j4, 0.0f, null, null, 0, 60, null);
            }
        }
        if (z2) {
            SolidColor solidColor = brush2 == null ? new SolidColor(j3, null) : brush2;
            BorderLogic borderLogic = this.borderLogic;
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            a aVar = new a() { // from class: androidx.compose.foundation.style.StyleOuterNode$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Float.valueOf(f2);
                }
            };
            a<GraphicsLayer> aVar2 = this.borderLayerProvider;
            if (aVar2 == null) {
                aVar2 = new a() { // from class: androidx.compose.foundation.style.StyleOuterNode$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return StyleOuterNode.drawForShape_9zt3ed4$lambda$1(this.f$0);
                    }
                };
                this.borderLayerProvider = aVar2;
            }
            borderLogic.m2073drawBorder2gY9BTk$foundation(contentDrawScope2, aVar, solidColor, aVar2, outlineM3151getOutline12SF9DM, (32 & 32) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : 0L);
        }
    }

    public final MutableObjectList<StyleOuterNode> getAncestorNodes$foundation() {
        return this.ancestorNodes;
    }

    public final af getAnimationScope$foundation() {
        af afVar = this.overrideScope;
        return afVar == null ? getCoroutineScope() : afVar;
    }

    public final StyleProperties getCachedInheritedStyle$foundation() {
        if (this.inheritedStyleDirty) {
            return null;
        }
        return this.cachedInheritedStyle;
    }

    @Override // androidx.compose.runtime.CompositionLocalAccessorScope
    public <T> T getCurrentValue(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, compositionLocal);
    }

    public final StyleInnerNode getInnerNode$foundation() {
        StyleInnerNode styleInnerNode = this.innerNodeField;
        if (styleInnerNode != null) {
            return styleInnerNode;
        }
        throw new IllegalStateException("StyleOuterNode with no corresponding StyleInnerNode");
    }

    public final StyleInnerNode getInnerNodeField$foundation() {
        return this.innerNodeField;
    }

    public final l<GraphicsLayerScope, ab> getLayerBlock$foundation() {
        return this.layerBlock;
    }

    public final l<GraphicsLayerScope, ab> getLayerBlockNonNull$foundation() {
        l lVar = this.layerBlock;
        if (lVar != null) {
            return lVar;
        }
        l<GraphicsLayerScope, ab> lVar2 = new l() { // from class: androidx.compose.foundation.style.StyleOuterNode$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StyleOuterNode._get_layerBlockNonNull_$lambda$0$0(this.f$0, (GraphicsLayerScope) obj);
            }
        };
        this.layerBlock = lVar2;
        return lVar2;
    }

    public final af getOverrideScope() {
        return this.overrideScope;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final br getSourceJob() {
        return this.sourceJob;
    }

    public final StyleState getState$foundation() {
        return this._state;
    }

    public final Style getStyle$foundation() {
        return this.style;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return StyleModifierKt.OuterNodeKey;
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

    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.MeasureResult mo1732measure3p2s80s(androidx.compose.ui.layout.MeasureScope r21, androidx.compose.ui.layout.Measurable r22, final long r23) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleOuterNode.mo1732measure3p2s80s(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
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
    public void onDetach() {
        GraphicsLayer graphicsLayer = this.borderLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.borderLayer = null;
        }
        this.borderLayerProvider = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        resolveStyleAndInvalidate$default(this, false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reconcileDropShadowCache(java.lang.Object r6, androidx.compose.ui.graphics.Shape r7) {
        /*
            r5 = this;
            androidx.compose.ui.graphics.shadow.Shadow[] r0 = r5.lastDropShadow
            androidx.compose.ui.graphics.shadow.DropShadowPainter[] r1 = r5.cachedDropShadowPainters
            boolean r2 = r6 instanceof java.lang.Object[]
            if (r2 == 0) goto Lc
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            goto Ld
        Lc:
            r6 = 1
        Ld:
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L43
            androidx.compose.ui.graphics.Shape r4 = r5.lastShape
            boolean r7 = h.g.b.x.n(r4, r7)
            if (r7 != 0) goto L1a
            goto L43
        L1a:
            int r7 = r0.length
            if (r7 == r6) goto L42
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = "copyOf(...)"
            h.g.b.x.e(r7, r0)
            androidx.compose.ui.graphics.shadow.Shadow[] r7 = (androidx.compose.ui.graphics.shadow.Shadow[]) r7
            r5.lastDropShadow = r7
            if (r1 == 0) goto L37
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r6)
            h.g.b.x.e(r7, r0)
            androidx.compose.ui.graphics.shadow.DropShadowPainter[] r7 = (androidx.compose.ui.graphics.shadow.DropShadowPainter[]) r7
            if (r7 != 0) goto L40
        L37:
            androidx.compose.ui.graphics.shadow.DropShadowPainter[] r7 = new androidx.compose.ui.graphics.shadow.DropShadowPainter[r6]
        L39:
            if (r3 >= r6) goto L40
            r7[r3] = r2
            int r3 = r3 + 1
            goto L39
        L40:
            r5.cachedDropShadowPainters = r7
        L42:
            return
        L43:
            androidx.compose.ui.graphics.shadow.Shadow[] r7 = new androidx.compose.ui.graphics.shadow.Shadow[r6]
            r0 = r3
        L46:
            if (r0 >= r6) goto L4d
            r7[r0] = r2
            int r0 = r0 + 1
            goto L46
        L4d:
            r5.lastDropShadow = r7
            androidx.compose.ui.graphics.shadow.DropShadowPainter[] r7 = new androidx.compose.ui.graphics.shadow.DropShadowPainter[r6]
        L51:
            if (r3 >= r6) goto L58
            r7[r3] = r2
            int r3 = r3 + 1
            goto L51
        L58:
            r5.cachedDropShadowPainters = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleOuterNode.reconcileDropShadowCache(java.lang.Object, androidx.compose.ui.graphics.Shape):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reconcileInnerShadowCache(java.lang.Object r6, androidx.compose.ui.graphics.Shape r7) {
        /*
            r5 = this;
            androidx.compose.ui.graphics.shadow.Shadow[] r0 = r5.lastInnerShadow
            androidx.compose.ui.graphics.shadow.InnerShadowPainter[] r1 = r5.cachedInnerShadowPainters
            boolean r2 = r6 instanceof java.lang.Object[]
            if (r2 == 0) goto Lc
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            goto Ld
        Lc:
            r6 = 1
        Ld:
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L43
            androidx.compose.ui.graphics.Shape r4 = r5.lastShape
            boolean r7 = h.g.b.x.n(r4, r7)
            if (r7 != 0) goto L1a
            goto L43
        L1a:
            int r7 = r0.length
            if (r7 == r6) goto L42
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = "copyOf(...)"
            h.g.b.x.e(r7, r0)
            androidx.compose.ui.graphics.shadow.Shadow[] r7 = (androidx.compose.ui.graphics.shadow.Shadow[]) r7
            r5.lastInnerShadow = r7
            if (r1 == 0) goto L37
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r6)
            h.g.b.x.e(r7, r0)
            androidx.compose.ui.graphics.shadow.InnerShadowPainter[] r7 = (androidx.compose.ui.graphics.shadow.InnerShadowPainter[]) r7
            if (r7 != 0) goto L40
        L37:
            androidx.compose.ui.graphics.shadow.InnerShadowPainter[] r7 = new androidx.compose.ui.graphics.shadow.InnerShadowPainter[r6]
        L39:
            if (r3 >= r6) goto L40
            r7[r3] = r2
            int r3 = r3 + 1
            goto L39
        L40:
            r5.cachedInnerShadowPainters = r7
        L42:
            return
        L43:
            androidx.compose.ui.graphics.shadow.Shadow[] r7 = new androidx.compose.ui.graphics.shadow.Shadow[r6]
            r0 = r3
        L46:
            if (r0 >= r6) goto L4d
            r7[r0] = r2
            int r0 = r0 + 1
            goto L46
        L4d:
            r5.lastInnerShadow = r7
            androidx.compose.ui.graphics.shadow.InnerShadowPainter[] r7 = new androidx.compose.ui.graphics.shadow.InnerShadowPainter[r6]
        L51:
            if (r3 >= r6) goto L58
            r7[r3] = r2
            int r3 = r3 + 1
            goto L51
        L58:
            r5.cachedInnerShadowPainters = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleOuterNode.reconcileInnerShadowCache(java.lang.Object, androidx.compose.ui.graphics.Shape):void");
    }

    public final StyleProperties resolveAnimatedStyleFor$foundation(int i2, StyleProperties styleProperties) {
        if ((this.builder.getAnimatingFlags() & i2) == 0) {
            return styleProperties;
        }
        StyleProperties styleProperties2 = new StyleProperties();
        this.builder.resolveInto(i2, styleProperties2);
        return styleProperties2;
    }

    public final void resolveAnimatedStyleForInto$foundation(int i2, StyleProperties styleProperties) {
        if ((this.builder.getAnimatingFlags() & i2) != 0) {
            this.builder.resolveInto(i2, styleProperties);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StyleProperties resolveInheritedStyle$foundation(int i2) {
        StyleOuterNode styleOuterNode;
        boolean z;
        StyleOuterNode styleOuterNode2;
        final aq aqVar = new aq();
        aqVar.f48105a = this.ancestorNodes;
        if ((this._resolved.getPhaseFlags$foundation() & 48) != 0 || (this.builder.getAnimatingFlags() & 48) != 0) {
            MutableObjectList<StyleOuterNode> mutableObjectList = (MutableObjectList) aqVar.f48105a;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(0, 1, null);
                aqVar.f48105a = mutableObjectList;
                this.ancestorNodes = mutableObjectList;
            }
            mutableObjectList.add(this);
        }
        TraversableNodeKt.traverseAncestors(this, StyleModifierKt.OuterNodeKey, new l() { // from class: androidx.compose.foundation.style.StyleOuterNode$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                StyleOuterNode.resolveInheritedStyle$lambda$1(aqVar, this, (TraversableNode) obj);
                return true;
            }
        });
        StyleProperties cachedInheritedStyle$foundation = getCachedInheritedStyle$foundation();
        int size = cachedInheritedStyle$foundation != null ? -1 : -2;
        boolean z2 = (this.builder.getAnimatingFlags() & 48) != 0;
        int phaseFlags$foundation = this._resolved.getPhaseFlags$foundation() & 48;
        MutableObjectList mutableObjectList2 = (MutableObjectList) aqVar.f48105a;
        if (mutableObjectList2 != null) {
            MutableObjectList mutableObjectList3 = mutableObjectList2;
            Object[] objArr = mutableObjectList3.content;
            int i3 = mutableObjectList3._size;
            for (int i4 = 0; i4 < i3; i4++) {
                StyleOuterNode styleOuterNode3 = (StyleOuterNode) objArr[i4];
                StyleProperties cachedInheritedStyle$foundation2 = styleOuterNode3.getCachedInheritedStyle$foundation();
                z2 = z2 || (styleOuterNode3.builder.getAnimatingFlags() & 48) != 0;
                phaseFlags$foundation |= styleOuterNode3._resolved.getPhaseFlags$foundation() & 48;
                if (cachedInheritedStyle$foundation2 == null) {
                    cachedInheritedStyle$foundation = null;
                    size = -2;
                } else if (cachedInheritedStyle$foundation == null) {
                    size = i4;
                    cachedInheritedStyle$foundation = cachedInheritedStyle$foundation2;
                }
            }
        }
        if (phaseFlags$foundation == 0) {
            return null;
        }
        if (cachedInheritedStyle$foundation != null && size < 0 && !z2) {
            return cachedInheritedStyle$foundation;
        }
        Object obj = aqVar.f48105a;
        if (obj != null && size < -1) {
            size = ((MutableObjectList) obj).getSize() - 1;
        }
        while (size > -2) {
            if (size < 0) {
                z = cachedInheritedStyle$foundation == null;
                styleOuterNode2 = this;
            } else {
                MutableObjectList mutableObjectList4 = (MutableObjectList) aqVar.f48105a;
                if (mutableObjectList4 == null) {
                    size--;
                } else {
                    z = cachedInheritedStyle$foundation == null;
                    styleOuterNode2 = (StyleOuterNode) mutableObjectList4.get(size);
                }
            }
            StyleProperties styleProperties = styleOuterNode2.cachedInheritedStyle;
            if (styleProperties == null) {
                styleProperties = new StyleProperties();
            }
            if (true != z) {
                cachedInheritedStyle$foundation.copyInto$foundation(styleProperties, 48);
            }
            styleOuterNode2._resolved.copyInto$foundation(styleProperties, 48);
            styleOuterNode2.saveInheritedStyles$foundation(styleProperties);
            cachedInheritedStyle$foundation = styleProperties;
            size--;
        }
        if (!z2) {
            return cachedInheritedStyle$foundation;
        }
        StyleProperties styleProperties2 = new StyleProperties();
        if (cachedInheritedStyle$foundation != null) {
            cachedInheritedStyle$foundation.copyInto$foundation(styleProperties2, 48);
        }
        MutableObjectList mutableObjectList5 = (MutableObjectList) aqVar.f48105a;
        for (int size2 = (mutableObjectList5 != null ? mutableObjectList5.getSize() : 0) - 1; size2 > -2; size2--) {
            if (size2 < 0) {
                styleOuterNode = this;
            } else {
                MutableObjectList mutableObjectList6 = (MutableObjectList) aqVar.f48105a;
                if (mutableObjectList6 != null) {
                    styleOuterNode = (StyleOuterNode) mutableObjectList6.get(size2);
                }
            }
            styleOuterNode.resolveAnimatedStyleForInto$foundation(i2, styleProperties2);
        }
        return styleProperties2;
    }

    public final void resolveStyleAndInvalidate(boolean z) {
        if (isAttached()) {
            final StyleProperties styleProperties = z ? null : this._resolved;
            final StyleProperties bufferNonNull = z ? this._resolved : getBufferNonNull();
            final Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            final ao aoVar = new ao();
            ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.style.StyleOuterNode$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return StyleOuterNode.resolveStyleAndInvalidate$lambda$0(this.f$0, densityRequireDensity, bufferNonNull, styleProperties, aoVar);
                }
            });
            int iDiff$foundation$default = aoVar.f48103a | (styleProperties != null ? StyleProperties.diff$foundation$default(styleProperties, bufferNonNull, 0, 2, null) : bufferNonNull.getPhaseFlags$foundation());
            if (!x.n(this._state.getInteractionSource$foundation(), this.currentInteractionSource)) {
                updateInteractionSources();
            }
            if (z) {
                return;
            }
            if ((iDiff$foundation$default & 1) != 0) {
                LayoutModifierNodeKt.invalidateMeasurement(getInnerNode$foundation());
            }
            if ((iDiff$foundation$default & 8) != 0) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
            }
            if ((iDiff$foundation$default & 2) != 0) {
                LayoutModifierNodeKt.invalidateLayer(getInnerNode$foundation());
            }
            if ((iDiff$foundation$default & 4) != 0) {
                LayoutModifierNodeKt.updateLayerBlock(this, getLayerBlockNonNull$foundation());
            }
            if ((iDiff$foundation$default & 16) != 0) {
                invalidateTextLayout();
            }
            if ((iDiff$foundation$default & 32) != 0) {
                invalidateTextDraw();
            }
        }
    }

    public final void saveInheritedStyles$foundation(StyleProperties styleProperties) {
        this.inheritedStyleDirty = false;
        this.cachedInheritedStyle = styleProperties;
    }

    public final void setAncestorNodes$foundation(MutableObjectList<StyleOuterNode> mutableObjectList) {
        this.ancestorNodes = mutableObjectList;
    }

    public final void setInnerNode$foundation(StyleInnerNode styleInnerNode) {
        this.innerNodeField = styleInnerNode;
    }

    public final void setInnerNodeField$foundation(StyleInnerNode styleInnerNode) {
        this.innerNodeField = styleInnerNode;
    }

    public final void setLayerBlock$foundation(l<? super GraphicsLayerScope, ab> lVar) {
        this.layerBlock = lVar;
    }

    public final void setSourceJob(br brVar) {
        this.sourceJob = brVar;
    }

    public final void setState$foundation(StyleState styleState) {
        if (x.n(this._state, styleState)) {
            return;
        }
        this._state = styleState;
        resolveStyleAndInvalidate$default(this, false, 1, null);
        LayoutModifierNodeKt.invalidateLayer(getInnerNode$foundation());
    }

    public final void setStyle$foundation(Style style) {
        this.style = style;
        resolveStyleAndInvalidate$default(this, false, 1, null);
    }

    public final void updateInteractionSources() {
        br brVar = this.sourceJob;
        if (brVar != null) {
            brVar.s(null);
        }
        InteractionSource interactionSource$foundation = this._state.getInteractionSource$foundation();
        this.currentInteractionSource = interactionSource$foundation;
        if (interactionSource$foundation != null) {
            this.sourceJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(interactionSource$foundation, null), 3);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    static final float drawForShape_9zt3ed4$lambda$0(float f2) {
        return f2;
    }

    public /* synthetic */ StyleOuterNode(StyleState styleState, Style style, af afVar, int i2, o oVar) {
        this(styleState, style, (i2 & 4) != 0 ? null : afVar);
    }

    public final void drawDropShadow(ContentDrawScope contentDrawScope, StyleProperties styleProperties) {
        Object obj;
        if (styleProperties.hasId(55) && (obj = styleProperties.dropShadow) != null) {
            Shape rectangleShape = RectangleShapeKt.getRectangleShape();
            if (styleProperties.hasId(53)) {
                rectangleShape = styleProperties.shape;
            }
            reconcileDropShadowCache(obj, rectangleShape);
            if (!(obj instanceof Object[])) {
                if (obj instanceof Shadow) {
                    drawDropShadow(contentDrawScope, 0, rectangleShape, (Shadow) obj);
                    return;
                }
                return;
            }
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 instanceof Shadow) {
                    drawDropShadow(contentDrawScope, i2, rectangleShape, (Shadow) obj2);
                }
            }
        }
    }

    public final void drawInnerShadow(ContentDrawScope contentDrawScope, StyleProperties styleProperties) {
        Object obj;
        if (styleProperties.hasId(56) && (obj = styleProperties.innerShadow) != null) {
            Shape rectangleShape = RectangleShapeKt.getRectangleShape();
            if (styleProperties.hasId(53)) {
                rectangleShape = styleProperties.shape;
            }
            reconcileInnerShadowCache(obj, rectangleShape);
            if (!(obj instanceof Object[])) {
                if (obj instanceof Shadow) {
                    drawInnerShadow(contentDrawScope, 0, rectangleShape, (Shadow) obj);
                    return;
                }
                return;
            }
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 instanceof Shadow) {
                    drawInnerShadow(contentDrawScope, i2, rectangleShape, (Shadow) obj2);
                }
            }
        }
    }
}
