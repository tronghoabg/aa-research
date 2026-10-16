package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSizeNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    private State<? extends Object> fontResolutionState;
    private TextFieldSize minSizeState;
    private final boolean shouldAutoInvalidate;
    private final TextStyle style;

    public TextFieldSizeNode(TextStyle textStyle) {
        this.style = textStyle;
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    private final State<Object> requireFontResolutionState() {
        State<? extends Object> state = this.fontResolutionState;
        if (state != null) {
            return state;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Font resolution state is not set.");
        throw new e();
    }

    private final TextFieldSize requireMinSizeState() {
        TextFieldSize textFieldSize = this.minSizeState;
        if (textFieldSize != null) {
            return textFieldSize;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Min size state is not set.");
        throw new e();
    }

    private final void updateFontResolutionState(TextStyle textStyle, FontFamily.Resolver resolver) {
        FontFamily fontFamily = textStyle.getFontFamily();
        FontWeight fontWeight = textStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM10578getFontStyle4Lr2A7w = textStyle.m10578getFontStyle4Lr2A7w();
        int iM10664unboximpl = fontStyleM10578getFontStyle4Lr2A7w != null ? fontStyleM10578getFontStyle4Lr2A7w.m10664unboximpl() : FontStyle.Companion.m10668getNormal_LCdwA();
        FontSynthesis fontSynthesisM10579getFontSynthesisZQGJjVo = textStyle.m10579getFontSynthesisZQGJjVo();
        this.fontResolutionState = resolver.mo10633resolveDPcqOEQ(fontFamily, fontWeight, iM10664unboximpl, fontSynthesisM10579getFontSynthesisZQGJjVo != null ? fontSynthesisM10579getFontSynthesisZQGJjVo.m10677unboximpl() : FontSynthesis.Companion.m10678getAllGVVA2EU());
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long jM3416cachedMinSizeOrComputeMinSizeYEO4UFw = requireMinSizeState().m3416cachedMinSizeOrComputeMinSizeYEO4UFw(requireFontResolutionState().getValue());
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(j2, ConstraintsKt.Constraints$default((int) (jM3416cachedMinSizeOrComputeMinSizeYEO4UFw >> 32), 0, (int) (jM3416cachedMinSizeOrComputeMinSizeYEO4UFw & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0, 10, null)));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.text.TextFieldSizeNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSizeNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
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
        TextFieldSizeNode textFieldSizeNode = this;
        TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, DelegatableNodeKt.requireLayoutDirection(textFieldSizeNode));
        FontFamily.Resolver resolver = (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver());
        updateFontResolutionState(textStyleResolveDefaults, resolver);
        this.minSizeState = new TextFieldSize(DelegatableNodeKt.requireLayoutDirection(textFieldSizeNode), DelegatableNodeKt.requireDensity(textFieldSizeNode), resolver, textStyleResolveDefaults, requireFontResolutionState().getValue());
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        TextFieldSize textFieldSize = this.minSizeState;
        if (textFieldSize != null) {
            TextFieldSize.update$default(textFieldSize, null, DelegatableNodeKt.requireDensity(this), null, null, null, 29, null);
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.fontResolutionState = null;
        this.minSizeState = null;
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        TextFieldSize textFieldSize = this.minSizeState;
        if (textFieldSize != null) {
            TextFieldSize.update$default(textFieldSize, DelegatableNodeKt.requireLayoutDirection(this), null, null, null, null, 30, null);
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public final void update(TextStyle textStyle) {
        TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(textStyle, DelegatableNodeKt.requireLayoutDirection(this));
        updateFontResolutionState(textStyleResolveDefaults, (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()));
        TextFieldSize.update$default(requireMinSizeState(), null, null, null, textStyleResolveDefaults, null, 23, null);
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
