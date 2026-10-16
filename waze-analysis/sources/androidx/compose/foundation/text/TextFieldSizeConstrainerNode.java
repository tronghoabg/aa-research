package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider;
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
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSizeConstrainerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    private boolean dirty;
    private State<? extends Object> fontResolutionState;
    private int maxLines;
    private int minLines;
    private TextStyle resolvedStyle;
    private final boolean shouldAutoInvalidate;
    private HeightForSingleLineFieldProvider singleLineHeightProvider;
    private boolean softWrap;
    private TextStyle textStyle;
    private Object typeface;
    private int precomputedMinWidth = -1;
    private int precomputedMinLinesHeight = -1;
    private int precomputedMaxLinesHeight = -1;

    public TextFieldSizeConstrainerNode(TextStyle textStyle, int i2, int i3, boolean z, HeightForSingleLineFieldProvider heightForSingleLineFieldProvider) {
        this.textStyle = textStyle;
        this.minLines = i2;
        this.maxLines = i3;
        this.softWrap = z;
        this.singleLineHeightProvider = heightForSingleLineFieldProvider;
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

    private final TextStyle requireResolvedStyle() {
        TextStyle textStyle = this.resolvedStyle;
        if (textStyle != null) {
            return textStyle;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Resolved style is not set.");
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
    }

    public final void computeDefaultSizeIfNeeded(Object obj) {
        int i2;
        if (!x.n(obj, this.typeface)) {
            this.typeface = obj;
            this.dirty = true;
        }
        if (this.dirty) {
            int i3 = 3;
            if (this.minLines == 1 && ((i2 = this.maxLines) == 1 || i2 == Integer.MAX_VALUE)) {
                i3 = 1;
            }
            Paragraph paragraphParagraphForDefaultText = TextFieldDelegateKt.paragraphForDefaultText(requireResolvedStyle(), DelegatableNodeKt.requireDensity(this), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), i3);
            if (i3 == 1) {
                int iB = a.b(paragraphParagraphForDefaultText.getHeight());
                this.precomputedMinLinesHeight = iB;
                this.precomputedMaxLinesHeight = this.maxLines == 1 ? iB : Integer.MAX_VALUE;
            } else {
                float lineHeight = paragraphParagraphForDefaultText.getLineHeight(0);
                float lineHeight2 = paragraphParagraphForDefaultText.getLineHeight(1);
                float lineHeight3 = paragraphParagraphForDefaultText.getLineHeight(2);
                this.precomputedMinLinesHeight = TextFieldDefaultSizeModifierKt.computeHeightFromThreeLines(lineHeight, lineHeight2, lineHeight3, this.minLines);
                this.precomputedMaxLinesHeight = TextFieldDefaultSizeModifierKt.computeHeightFromThreeLines(lineHeight, lineHeight2, lineHeight3, this.maxLines);
            }
            this.precomputedMinWidth = a.b(paragraphParagraphForDefaultText.getMaxIntrinsicWidth());
            this.dirty = false;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        computeDefaultSizeIfNeeded(requireFontResolutionState().getValue());
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
        long jConstraints$default;
        computeDefaultSizeIfNeeded(requireFontResolutionState().getValue());
        if (this.softWrap) {
            jConstraints$default = ConstraintsKt.Constraints$default(this.precomputedMinWidth, 0, n.j(this.precomputedMinLinesHeight, Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2)), n.j(this.precomputedMaxLinesHeight, Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2)), 2, null);
        } else {
            float fMo3341getHeightForSingleLineFieldD9Ej5fM = this.singleLineHeightProvider.mo3341getHeightForSingleLineFieldD9Ej5fM();
            int i2 = measureScope.mo2121roundToPx0680j_4(fMo3341getHeightForSingleLineFieldD9Ej5fM);
            int i3 = this.precomputedMinWidth;
            int i4 = Dp.m11169equalsimpl0(fMo3341getHeightForSingleLineFieldD9Ej5fM, 0.0f) ? this.precomputedMinLinesHeight : i2;
            if (true == Dp.m11169equalsimpl0(fMo3341getHeightForSingleLineFieldD9Ej5fM, 0.0f)) {
                i2 = Integer.MAX_VALUE;
            }
            jConstraints$default = ConstraintsKt.Constraints(i3, Integer.MAX_VALUE, i4, i2);
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(j2, jConstraints$default));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.text.TextFieldSizeConstrainerNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSizeConstrainerNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        computeDefaultSizeIfNeeded(requireFontResolutionState().getValue());
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
        TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.textStyle, DelegatableNodeKt.requireLayoutDirection(this));
        this.resolvedStyle = textStyleResolveDefaults;
        if (textStyleResolveDefaults == null) {
            x.g();
        }
        updateFontResolutionState(textStyleResolveDefaults, resolver);
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
        this.typeface = null;
        this.dirty = false;
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        this.resolvedStyle = TextStyleKt.resolveDefaults(this.textStyle, DelegatableNodeKt.requireLayoutDirection(this));
        this.dirty = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public final void update(TextStyle textStyle, int i2, int i3, boolean z, HeightForSingleLineFieldProvider heightForSingleLineFieldProvider) {
        if (!x.n(this.textStyle, textStyle)) {
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(textStyle, DelegatableNodeKt.requireLayoutDirection(this));
            updateFontResolutionState(textStyleResolveDefaults, (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()));
            this.resolvedStyle = textStyleResolveDefaults;
            this.textStyle = textStyle;
            this.dirty = true;
        }
        if (this.minLines != i2 || this.maxLines != i3 || this.softWrap != z || !Dp.m11169equalsimpl0(this.singleLineHeightProvider.mo3341getHeightForSingleLineFieldD9Ej5fM(), heightForSingleLineFieldProvider.mo3341getHeightForSingleLineFieldD9Ej5fM())) {
            this.minLines = i2;
            this.maxLines = i3;
            this.softWrap = z;
            this.singleLineHeightProvider = heightForSingleLineFieldProvider;
            this.dirty = true;
        }
        if (this.dirty) {
            LayoutModifierNodeKt.invalidateMeasurement(this);
        }
    }
}
