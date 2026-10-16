package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private MultiParagraphLayoutCache _layoutCache;
    private TextAutoSize autoSize;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private l<? super List<Rect>, ab> onPlaceholderLayout;
    private l<? super TextSubstitutionValue, ab> onShowTranslation;
    private l<? super TextLayoutResult, ab> onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z, int i3, int i4, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, l lVar3, int i5, o oVar) {
        this(annotatedString, textStyle, resolver, (i5 & 8) != 0 ? null : lVar, (i5 & 16) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i5 & 32) == 0)) | z, (i5 & 64) != 0 ? Integer.MAX_VALUE : i3, (i5 & 128) != 0 ? 1 : i4, (i5 & 256) != 0 ? null : list, (i5 & 512) != 0 ? null : lVar2, (i5 & 1024) != 0 ? null : selectionController, (i5 & 2048) != 0 ? null : colorProducer, (i5 & 4096) != 0 ? null : textAutoSize, (i5 & 8192) != 0 ? null : lVar3, null);
    }

    static final boolean applySemantics$lambda$0(TextAnnotatedStringNode textAnnotatedStringNode, List list) {
        TextLayoutResult textLayoutResultM10514copyO0kMr_c$default;
        TextLayoutResult layoutOrNull = textAnnotatedStringNode.getLayoutCache().getLayoutOrNull();
        if (layoutOrNull != null) {
            AnnotatedString text = layoutOrNull.getLayoutInput().getText();
            TextStyle textStyle = textAnnotatedStringNode.style;
            ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
            textLayoutResultM10514copyO0kMr_c$default = TextLayoutResult.m10514copyO0kMr_c$default(layoutOrNull, new TextLayoutInput(text, TextStyle.m10566mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo4059invoke0d7_KjU() : Color.Companion.m8264getUnspecified0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777214, null), layoutOrNull.getLayoutInput().getPlaceholders(), layoutOrNull.getLayoutInput().getMaxLines(), layoutOrNull.getLayoutInput().getSoftWrap(), layoutOrNull.getLayoutInput().m10513getOverflowgIe3tQ8(), layoutOrNull.getLayoutInput().getDensity(), layoutOrNull.getLayoutInput().getLayoutDirection(), layoutOrNull.getLayoutInput().getFontFamilyResolver(), layoutOrNull.getLayoutInput().m10512getConstraintsmsEJaDk(), (o) null), 0L, 2, null);
            list.add(textLayoutResultM10514copyO0kMr_c$default);
        } else {
            textLayoutResultM10514copyO0kMr_c$default = null;
        }
        return textLayoutResultM10514copyO0kMr_c$default != null;
    }

    static final boolean applySemantics$lambda$1(TextAnnotatedStringNode textAnnotatedStringNode, AnnotatedString annotatedString) {
        textAnnotatedStringNode.setSubstitution(annotatedString);
        textAnnotatedStringNode.invalidateForTranslate();
        return true;
    }

    static final boolean applySemantics$lambda$2(TextAnnotatedStringNode textAnnotatedStringNode, boolean z) {
        TextSubstitutionValue textSubstitutionValue = textAnnotatedStringNode.textSubstitution;
        if (textSubstitutionValue == null) {
            return false;
        }
        l<? super TextSubstitutionValue, ab> lVar = textAnnotatedStringNode.onShowTranslation;
        if (lVar != null) {
            lVar.invoke(textSubstitutionValue);
        }
        TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.textSubstitution;
        if (textSubstitutionValue2 != null) {
            textSubstitutionValue2.setShowingSubstitution(z);
        }
        textAnnotatedStringNode.invalidateForTranslate();
        return true;
    }

    static final boolean applySemantics$lambda$3(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.clearSubstitution$foundation();
        textAnnotatedStringNode.invalidateForTranslate();
        return true;
    }

    private final MultiParagraphLayoutCache getLayoutCache() {
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        if (multiParagraphLayoutCache == null) {
            MultiParagraphLayoutCache multiParagraphLayoutCache2 = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
            this._layoutCache = multiParagraphLayoutCache2;
            multiParagraphLayoutCache = multiParagraphLayoutCache2;
        }
        if (multiParagraphLayoutCache == null) {
            x.g();
        }
        return multiParagraphLayoutCache;
    }

    private final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_3p2s80s$lambda$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    private final boolean setSubstitution(AnnotatedString annotatedString) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (x.n(annotatedString, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(annotatedString);
            MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.m3810updateJ2qo7bo(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, ac.f47967a, this.autoSize);
            return true;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, ac.f47967a, this.autoSize, null);
        multiParagraphLayoutCache.setDensity$foundation(getLayoutCache().getDensity$foundation());
        textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        l<? super List<TextLayoutResult>, Boolean> lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TextAnnotatedStringNode.applySemantics$lambda$0(this.f$0, (List) obj));
                }
            };
            this.semanticsTextLayoutResult = lVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                TextAnnotatedStringNode.applySemantics$lambda$1(this.f$0, (AnnotatedString) obj);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextAnnotatedStringNode.applySemantics$lambda$2(this.f$0, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                TextAnnotatedStringNode.applySemantics$lambda$3(this.f$0);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, lVar, 1, null);
    }

    public final void clearSubstitution$foundation() {
        this.textSubstitution = null;
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            getLayoutCache().m3810updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z2 || z3 || z4) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        List<AnnotatedString.Range<Placeholder>> list;
        if (isAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m11059equalsimpl0(this.overflow, TextOverflow.Companion.m11072getVisiblegIe3tQ8());
            if (z) {
                Rect rectM8020Recttz77jQw = RectKt.m8020Recttz77jQw(Offset.Companion.m7996getZeroF1C5BW0(), (Float.floatToRawIntBits((int) (textLayoutResult.m10517getSizeYbymL2g() >> 32)) << 32) | (Float.floatToRawIntBits((int) (textLayoutResult.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                canvas.save();
                Canvas.CC.m8202clipRectmtrdDE$default(canvas, rectM8020Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                Fill drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    MultiParagraph.m10405painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo4059invoke0d7_KjU = colorProducer != null ? colorProducer.mo4059invoke0d7_KjU() : Color.Companion.m8264getUnspecified0d7_KjU();
                    if (jMo4059invoke0d7_KjU == 16) {
                        jMo4059invoke0d7_KjU = this.style.m10576getColor0d7_KjU() != 16 ? this.style.m10576getColor0d7_KjU() : Color.Companion.m8254getBlack0d7_KjU();
                    }
                    multiParagraph.m10410paintLG529CI(canvas, (30 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : jMo4059invoke0d7_KjU, (30 & 4) != 0 ? null : shadow2, (30 & 8) != 0 ? null : textDecoration2, (30 & 16) == 0 ? drawStyle2 : null, (30 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z) {
                    canvas.restore();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) && TextAnnotatedStringNodeKt.hasLinks(this.text)) || !((list = this.placeholders) == null || list.isEmpty())) {
                    contentDrawScope.drawContent();
                }
            } catch (Throwable th) {
                if (z) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    public final TextSubstitutionValue getTextSubstitution$foundation() {
        return this.textSubstitution;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
            boolean zM3809layoutWithConstraintsK40F9xA = layoutCache.m3809layoutWithConstraintsK40F9xA(j2, measureScope.getLayoutDirection());
            TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
            textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
            if (zM3809layoutWithConstraintsK40F9xA) {
                LayoutModifierNodeKt.invalidateLayer(this);
                l<? super TextLayoutResult, ab> lVar = this.onTextLayout;
                if (lVar != null) {
                    lVar.invoke(textLayoutResult);
                }
                SelectionController selectionController = this.selectionController;
                if (selectionController != null) {
                    selectionController.updateTextLayout(textLayoutResult);
                }
                LinkedHashMap linkedHashMap = this.baselineCache;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
                linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
                this.baselineCache = linkedHashMap;
            }
            l<? super List<Rect>, ab> lVar2 = this.onPlaceholderLayout;
            if (lVar2 != null) {
                lVar2.invoke(textLayoutResult.getPlaceholderRects());
            }
            Constraints.Companion companion = Constraints.Companion;
            long jM10517getSizeYbymL2g = textLayoutResult.m10517getSizeYbymL2g() >> 32;
            long jM10517getSizeYbymL2g2 = textLayoutResult.m10517getSizeYbymL2g() >> 32;
            int i2 = (int) jM10517getSizeYbymL2g2;
            int i3 = (int) jM10517getSizeYbymL2g;
            final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(companion.m11116fitPrioritizingWidthZbe2FdA(i3, i2, (int) (textLayoutResult.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (int) (textLayoutResult.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            long jM10517getSizeYbymL2g3 = textLayoutResult.m10517getSizeYbymL2g() >> 32;
            long jM10517getSizeYbymL2g4 = textLayoutResult.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            Map<AlignmentLine, Integer> map = this.baselineCache;
            if (map == null) {
                x.g();
            }
            l<? super Placeable.PlacementScope, ab> lVar3 = new l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextAnnotatedStringNode.measure_3p2s80s$lambda$0$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
                }
            };
            return measureScope.layout((int) jM10517getSizeYbymL2g3, (int) jM10517getSizeYbymL2g4, map, lVar3);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m3834measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        return mo1732measure3p2s80s(measureScope, measurable, j2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final void setTextSubstitution$foundation(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    public final boolean updateCallbacks(l<? super TextLayoutResult, ab> lVar, l<? super List<Rect>, ab> lVar2, SelectionController selectionController, l<? super TextSubstitutionValue, ab> lVar3) {
        boolean z;
        if (this.onTextLayout != lVar) {
            this.onTextLayout = lVar;
            z = true;
        } else {
            z = false;
        }
        if (this.onPlaceholderLayout != lVar2) {
            this.onPlaceholderLayout = lVar2;
            z = true;
        }
        if (!x.n(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z = true;
        }
        if (this.onShowTranslation == lVar3) {
            return z;
        }
        this.onShowTranslation = lVar3;
        return true;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean zN = x.n(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (zN && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m3835updateLayoutRelatedArgsy0kMQk(TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, int i3, boolean z, FontFamily.Resolver resolver, int i4, TextAutoSize textAutoSize) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!x.n(this.placeholders, list)) {
            this.placeholders = list;
            z2 = true;
        }
        if (this.minLines != i2) {
            this.minLines = i2;
            z2 = true;
        }
        if (this.maxLines != i3) {
            this.maxLines = i3;
            z2 = true;
        }
        if (this.softWrap != z) {
            this.softWrap = z;
            z2 = true;
        }
        if (!x.n(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z2 = true;
        }
        if (!TextOverflow.m11059equalsimpl0(this.overflow, i4)) {
            this.overflow = i4;
            z2 = true;
        }
        if (x.n(this.autoSize, textAutoSize)) {
            return z2;
        }
        this.autoSize = textAutoSize;
        return true;
    }

    public final boolean updateText$foundation(AnnotatedString annotatedString) {
        boolean zN = x.n(this.text.getText(), annotatedString.getText());
        boolean zHasEqualAnnotations = this.text.hasEqualAnnotations(annotatedString);
        boolean z = true;
        if (zN && zHasEqualAnnotations) {
            z = false;
        }
        if (z) {
            this.text = annotatedString;
        }
        if (!zN) {
            clearSubstitution$foundation();
        }
        return z;
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    /* compiled from: WazeSource */
    public final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i2, o oVar) {
            this(annotatedString, annotatedString2, z & ((i2 & 4) == 0), (i2 & 8) != 0 ? null : multiParagraphLayoutCache);
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i2 & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i2 & 4) != 0) {
                z = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i2 & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z, multiParagraphLayoutCache);
        }

        public final AnnotatedString component1() {
            return this.original;
        }

        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            return new TextSubstitutionValue(annotatedString, annotatedString2, z, multiParagraphLayoutCache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return x.n(this.original, textSubstitutionValue.original) && x.n(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && x.n(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int iHashCode = (this.original.hashCode() * 31) + this.substitution.hashCode();
            int iM = TextAnnotatedStringNode$TextSubstitutionValue$$ExternalSyntheticBackport0.m(this.isShowingSubstitution);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return (((iHashCode * 31) + iM) * 31) + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z;
            this.layoutCache = multiParagraphLayoutCache;
        }
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation(density);
        return layoutCache2;
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l<? super TextLayoutResult, ab> lVar, int i2, boolean z, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, l<? super List<Rect>, ab> lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, l<? super TextSubstitutionValue, ab> lVar3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = lVar;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = lVar3;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z, int i3, int i4, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, l lVar3, o oVar) {
        this(annotatedString, textStyle, resolver, lVar, i2, z, i3, i4, list, lVar2, selectionController, colorProducer, textAutoSize, lVar3);
    }
}
