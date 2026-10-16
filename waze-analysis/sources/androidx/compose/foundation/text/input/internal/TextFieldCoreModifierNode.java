package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ao;
import h.g.b.x;
import h.k;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private br changeObserverJob;
    private CursorAnimationState cursorAnimation;
    private Brush cursorBrush;
    private boolean isDragHovered;
    private boolean isFocused;
    private Orientation orientation;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private int previousContainerSize;
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
    private TextRange previousSelection;
    private int previousTextLayoutSize;
    private ScrollState scrollState;
    private final TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode;
    private final TextFieldMagnifierNode textFieldMagnifierNode;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private ToolbarRequester toolbarRequester;
    private boolean writeable;

    public TextFieldCoreModifierNode(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequester;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z4 = true;
        if (!z && !z2) {
            z4 = false;
        }
        TextFieldMagnifierNode textFieldMagnifierNode = AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(transformedTextFieldState2, textFieldSelectionState2, textLayoutState2, z4);
        delegate(textFieldMagnifierNode);
        this.textFieldMagnifierNode = textFieldMagnifierNode;
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = new TextContextMenuToolbarHandlerNode(this.toolbarRequester, new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(this, null), new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(this, null), new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldCoreModifierNode.textContextMenuToolbarHandlerNode$lambda$0(this.f$0, (LayoutCoordinates) obj);
            }
        });
        delegate(textContextMenuToolbarHandlerNode);
        this.textContextMenuToolbarHandlerNode = textContextMenuToolbarHandlerNode;
    }

    /* renamed from: calculateOffsetToFollow-8ffj60Q, reason: not valid java name */
    private final int m3662calculateOffsetToFollow8ffj60Q(long j2, int i2, int i3) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m10541getEndimpl(j2) != TextRange.m10541getEndimpl(textRange.m10550unboximpl())) {
            return TextRange.m10541getEndimpl(j2);
        }
        if (TextRange.m10546getStartimpl(j2) != TextRange.m10546getStartimpl(textRange.m10550unboximpl())) {
            return TextRange.m10546getStartimpl(j2);
        }
        if (i3 == this.previousTextLayoutSize && i2 == this.previousContainerSize) {
            return -1;
        }
        return TextRange.m10546getStartimpl(j2);
    }

    private final void drawHighlight(DrawScope drawScope, k<TextHighlightType, TextRange> kVar, TextLayoutResult textLayoutResult) {
        int iM3496unboximpl = ((TextHighlightType) kVar.a()).m3496unboximpl();
        long jM10550unboximpl = ((TextRange) kVar.b()).m10550unboximpl();
        if (TextRange.m10540getCollapsedimpl(jM10550unboximpl)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m10544getMinimpl(jM10550unboximpl), TextRange.m10543getMaximpl(jM10550unboximpl));
        if (!TextHighlightType.m3493equalsimpl0(iM3496unboximpl, TextHighlightType.Companion.m3497getHandwritingDeletePreviewsxJuwY())) {
            DrawScope.CC.m8832drawPathLG529CI$default(drawScope, pathForRange, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m3938getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            return;
        }
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jM10576getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m10576getColor0d7_KjU();
        if (jM10576getColor0d7_KjU == 16) {
            jM10576getColor0d7_KjU = Color.Companion.m8254getBlack0d7_KjU();
        }
        long j2 = jM10576getColor0d7_KjU;
        DrawScope.CC.m8832drawPathLG529CI$default(drawScope, pathForRange, Color.m8227copywmQWz5c$default(j2, Color.m8230getAlphaimpl(j2) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    private final void drawText(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }

    private final boolean getShowCursor() {
        if (this.writeable) {
            return (this.isFocused || this.isDragHovered) && TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
        }
        return false;
    }

    /* renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m3663measureHorizontalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableMo9741measureBRTryo0.getWidth(), Constraints.m11107getMaxWidthimpl(j2));
        return MeasureScope.CC.layout$default(measureScope, iMin, placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldCoreModifierNode.measureHorizontalScroll_3p2s80s$lambda$0(this.f$0, iMin, placeableMo9741measureBRTryo0, measureScope, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final ab measureHorizontalScroll_3p2s80s$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, int i2, Placeable placeable, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        textFieldCoreModifierNode.m3665updateScrollStatetIlFzwE(placementScope, i2, placeable.getWidth(), textFieldCoreModifierNode.textFieldState.getVisualText().m3484getSelectiond9O1mEE(), measureScope.getLayoutDirection());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, -textFieldCoreModifierNode.scrollState.getValue(), 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m3664measureVerticalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableMo9741measureBRTryo0.getHeight(), Constraints.m11106getMaxHeightimpl(j2));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), iMin, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldCoreModifierNode.measureVerticalScroll_3p2s80s$lambda$0(this.f$0, iMin, placeableMo9741measureBRTryo0, measureScope, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final ab measureVerticalScroll_3p2s80s$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, int i2, Placeable placeable, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        textFieldCoreModifierNode.m3665updateScrollStatetIlFzwE(placementScope, i2, placeable.getHeight(), textFieldCoreModifierNode.textFieldState.getVisualText().m3484getSelectiond9O1mEE(), measureScope.getLayoutDirection());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, -textFieldCoreModifierNode.scrollState.getValue(), 0.0f, 4, null);
        return ab.f48028a;
    }

    private final void startCursorJob() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            DrawModifierNodeKt.invalidateDraw(this);
        }
        this.changeObserverJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
    }

    static final Rect textContextMenuToolbarHandlerNode$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, LayoutCoordinates layoutCoordinates) {
        Rect derivedVisibleContentBounds$foundation = textFieldCoreModifierNode.textFieldSelectionState.getDerivedVisibleContentBounds$foundation();
        if (derivedVisibleContentBounds$foundation == null) {
            derivedVisibleContentBounds$foundation = Rect.Companion.getZero();
        }
        LayoutCoordinates textLayoutNodeCoordinates = textFieldCoreModifierNode.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(derivedVisibleContentBounds$foundation, textLayoutNodeCoordinates, layoutCoordinates);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m3665updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density r17, int r18, int r19, long r20, androidx.compose.ui.unit.LayoutDirection r22) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.m3665updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density, int, int, long, androidx.compose.ui.unit.LayoutDirection):void");
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        TextFieldCoreModifierNode textFieldCoreModifierNode;
        contentDrawScope.drawContent();
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        k<TextHighlightType, TextRange> highlight = visualText.getHighlight();
        if (highlight != null) {
            drawHighlight(contentDrawScope, highlight, layoutResult);
        }
        if (TextRange.m10540getCollapsedimpl(visualText.m3484getSelectiond9O1mEE())) {
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            drawText(contentDrawScope2, layoutResult);
            if (visualText.shouldShowSelection()) {
                textFieldCoreModifierNode = this;
                TextFieldCoreModifier_androidKt.drawCursor(textFieldCoreModifierNode, contentDrawScope2, this.cursorBrush, getShowCursor(), this.cursorAnimation, this.textFieldSelectionState);
            } else {
                textFieldCoreModifierNode = this;
            }
        } else {
            textFieldCoreModifierNode = this;
            if (visualText.shouldShowSelection()) {
                TextFieldCoreModifier_androidKt.m3666drawSelectionHighlightYmzfRxQ(textFieldCoreModifierNode, contentDrawScope, visualText.m3484getSelectiond9O1mEE(), layoutResult);
            }
            textFieldCoreModifierNode.drawText(contentDrawScope, layoutResult);
        }
        textFieldCoreModifierNode.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
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
        return this.orientation == Orientation.Vertical ? m3664measureVerticalScroll3p2s80s(measureScope, measurable, j2) : m3663measureHorizontalScroll3p2s80s(measureScope, measurable, j2);
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
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setCoreNodeCoordinates(layoutCoordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    public final void updateNode(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        boolean showCursor = getShowCursor();
        boolean z4 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequester;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        boolean z5 = true;
        if (!z && !z2) {
            z5 = false;
        }
        this.textFieldMagnifierNode.update(transformedTextFieldState, textFieldSelectionState, textLayoutState, z5);
        this.textContextMenuToolbarHandlerNode.update(toolbarRequester);
        if (!getShowCursor()) {
            br brVar = this.changeObserverJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.cancelAndHide();
            }
        } else if (!z4 || !x.n(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            startCursorJob();
        }
        if (x.n(transformedTextFieldState2, transformedTextFieldState) && x.n(textLayoutState2, textLayoutState) && x.n(textFieldSelectionState2, textFieldSelectionState) && x.n(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, h.c.e<? super ab>, Object> {
        int label;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        static final int invokeSuspend$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, ao aoVar) {
            textFieldCoreModifierNode.textFieldState.getVisualText();
            int i2 = 2;
            if (textFieldCoreModifierNode.isAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) {
                i2 = 1;
            }
            int i3 = aoVar.f48103a;
            int i4 = i2 * i3;
            aoVar.f48103a = -i3;
            return i4;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return TextFieldCoreModifierNode.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ao aoVar = new ao();
                aoVar.f48103a = 1;
                final TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                this.label = 1;
                if (ai.e(SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Integer.valueOf(TextFieldCoreModifierNode.AnonymousClass1.invokeSuspend$lambda$0(textFieldCoreModifierNode, aoVar));
                    }
                }), new AnonymousClass2(TextFieldCoreModifierNode.this, null), this) == aVar) {
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

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<Integer, h.c.e<? super ab>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, h.c.e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // h.c.b.a.a
            public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, eVar);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i2, h.c.e<? super ab> eVar) {
                return ((AnonymousClass2) create(Integer.valueOf(i2), eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                CursorAnimationState cursorAnimationState;
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    if (Math.abs(this.I$0) == 1 && (cursorAnimationState = this.this$0.cursorAnimation) != null) {
                        this.label = 1;
                        if (cursorAnimationState.snapToVisibleAndAnimate(this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }

            @Override // h.g.a.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, h.c.e<? super ab> eVar) {
                return invoke(num.intValue(), eVar);
            }
        }
    }
}
