package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
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
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class HeightInLinesNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode, ObserverModifierNode {
    private boolean dirty;
    private State<? extends Object> fontResolutionState;
    private int maxLines;
    private int minLines;
    private TextStyle resolvedStyle;
    private final boolean shouldAutoInvalidate;
    private TextStyle textStyle;
    private int precomputedMinLinesHeight = -1;
    private int precomputedMaxLinesHeight = -1;

    public HeightInLinesNode(TextStyle textStyle, int i2, int i3) {
        this.textStyle = textStyle;
        this.minLines = i2;
        this.maxLines = i3;
    }

    private final void computeHeights(Density density, TextStyle textStyle, FontFamily.Resolver resolver) {
        if (ComposeFoundationFlags.isBasicTextFieldHeightInLinesOptimizationEnabled) {
            Paragraph paragraphParagraphForDefaultText = TextFieldDelegateKt.paragraphForDefaultText(textStyle, density, resolver, 3);
            float lineHeight = paragraphParagraphForDefaultText.getLineHeight(0);
            float lineHeight2 = paragraphParagraphForDefaultText.getLineHeight(1);
            float lineHeight3 = paragraphParagraphForDefaultText.getLineHeight(2);
            this.precomputedMinLinesHeight = HeightInLinesModifierKt.computeHeightFromThreeLines(lineHeight, lineHeight2, lineHeight3, this.minLines, 1);
            this.precomputedMaxLinesHeight = HeightInLinesModifierKt.computeHeightFromThreeLines(lineHeight, lineHeight2, lineHeight3, this.maxLines, Integer.MAX_VALUE);
            return;
        }
        long jComputeSizeForDefaultText = TextFieldDelegateKt.computeSizeForDefaultText(textStyle, density, resolver, 1) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long jComputeSizeForDefaultText2 = TextFieldDelegateKt.computeSizeForDefaultText(textStyle, density, resolver, 2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i2 = this.minLines;
        int i3 = (int) jComputeSizeForDefaultText;
        int i4 = ((int) jComputeSizeForDefaultText2) - i3;
        this.precomputedMinLinesHeight = i2 == 1 ? -1 : ((i2 - 1) * i4) + i3;
        int i5 = this.maxLines;
        this.precomputedMaxLinesHeight = i5 != Integer.MAX_VALUE ? i3 + (i4 * (i5 - 1)) : -1;
    }

    private final void getOrPrecomputeMinMaxHeight(Density density) {
        if (this.dirty) {
            computeHeights(density, requireResolvedStyle(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()));
            this.dirty = false;
        }
        int i2 = this.precomputedMinLinesHeight;
        this.precomputedMinLinesHeight = i2 >= 0 ? i2 : 0;
        int i3 = this.precomputedMaxLinesHeight;
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        this.precomputedMaxLinesHeight = i3;
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab onAttach$lambda$0(HeightInLinesNode heightInLinesNode) {
        heightInLinesNode.requireFontResolutionState().getValue();
        return ab.f48028a;
    }

    private final void onFontResolutionStateChanged() {
        if (this.fontResolutionState != null) {
            ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.text.HeightInLinesNode$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return HeightInLinesNode.onFontResolutionStateChanged$lambda$0(this.f$0);
                }
            });
        }
        this.dirty = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    static final ab onFontResolutionStateChanged$lambda$0(HeightInLinesNode heightInLinesNode) {
        heightInLinesNode.requireFontResolutionState().getValue();
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

    private final TextStyle requireResolvedStyle() {
        TextStyle textStyle = this.resolvedStyle;
        if (textStyle != null) {
            return textStyle;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Resolved style is not set.");
        throw new e();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        getOrPrecomputeMinMaxHeight(intrinsicMeasureScope);
        int i3 = this.precomputedMinLinesHeight;
        int i4 = this.precomputedMaxLinesHeight;
        if (i3 == i4) {
            return i4;
        }
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
        int i5 = this.precomputedMinLinesHeight;
        int i6 = this.precomputedMaxLinesHeight;
        if (iMaxIntrinsicHeight < i5) {
            iMaxIntrinsicHeight = i5;
        }
        return iMaxIntrinsicHeight > i6 ? i6 : iMaxIntrinsicHeight;
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
        if (this.dirty) {
            computeHeights(measureScope, requireResolvedStyle(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()));
            this.dirty = false;
        }
        int i2 = this.precomputedMinLinesHeight;
        int iJ = i2 != -1 ? n.j(i2, Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2)) : Constraints.m11108getMinHeightimpl(j2);
        int i3 = this.precomputedMaxLinesHeight;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, iJ, i3 != -1 ? n.j(i3, Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2)) : Constraints.m11106getMaxHeightimpl(j2), 3, null));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.text.HeightInLinesNode$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return HeightInLinesNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        getOrPrecomputeMinMaxHeight(intrinsicMeasureScope);
        int i3 = this.precomputedMinLinesHeight;
        if (i3 == this.precomputedMaxLinesHeight) {
            return i3;
        }
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i2);
        int i4 = this.precomputedMinLinesHeight;
        int i5 = this.precomputedMaxLinesHeight;
        if (iMinIntrinsicHeight < i4) {
            iMinIntrinsicHeight = i4;
        }
        return iMinIntrinsicHeight > i5 ? i5 : iMinIntrinsicHeight;
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
        FontFamily.Resolver resolver = (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver());
        this.resolvedStyle = TextStyleKt.resolveDefaults(this.textStyle, DelegatableNodeKt.requireLayoutDirection(this));
        FontFamily fontFamily = requireResolvedStyle().getFontFamily();
        FontWeight fontWeight = requireResolvedStyle().getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM10578getFontStyle4Lr2A7w = requireResolvedStyle().m10578getFontStyle4Lr2A7w();
        int iM10664unboximpl = fontStyleM10578getFontStyle4Lr2A7w != null ? fontStyleM10578getFontStyle4Lr2A7w.m10664unboximpl() : FontStyle.Companion.m10668getNormal_LCdwA();
        FontSynthesis fontSynthesisM10579getFontSynthesisZQGJjVo = requireResolvedStyle().m10579getFontSynthesisZQGJjVo();
        this.fontResolutionState = resolver.mo10633resolveDPcqOEQ(fontFamily, fontWeight, iM10664unboximpl, fontSynthesisM10579getFontSynthesisZQGJjVo != null ? fontSynthesisM10579getFontSynthesisZQGJjVo.m10677unboximpl() : FontSynthesis.Companion.m10678getAllGVVA2EU());
        ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.text.HeightInLinesNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return HeightInLinesNode.onAttach$lambda$0(this.f$0);
            }
        });
        this.dirty = true;
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        this.dirty = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.resolvedStyle = null;
        this.fontResolutionState = null;
        this.dirty = false;
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        this.resolvedStyle = TextStyleKt.resolveDefaults(this.textStyle, DelegatableNodeKt.requireLayoutDirection(this));
        this.dirty = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        onFontResolutionStateChanged();
    }

    public final void update(TextStyle textStyle, int i2, int i3) {
        if (x.n(this.textStyle, textStyle) && this.minLines == i2 && this.maxLines == i3) {
            return;
        }
        this.textStyle = textStyle;
        this.minLines = i2;
        this.maxLines = i3;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, DelegatableNodeKt.requireLayoutDirection(this));
        this.dirty = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
