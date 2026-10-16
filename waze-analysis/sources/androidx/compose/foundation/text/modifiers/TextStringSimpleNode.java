package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
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
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private TextStyle resolvedInheritedStyle;
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, ColorProducer colorProducer, int i5, o oVar) {
        this(str, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i5 & 16) == 0)) | z, (i5 & 32) != 0 ? Integer.MAX_VALUE : i3, (i5 & 64) != 0 ? 1 : i4, (i5 & 128) != 0 ? null : colorProducer, null);
    }

    static final boolean applySemantics$lambda$0(TextStringSimpleNode textStringSimpleNode, List list) {
        ParagraphLayoutCache layoutCache = textStringSimpleNode.getLayoutCache();
        TextStyle textStyle = textStringSimpleNode.style;
        ColorProducer colorProducer = textStringSimpleNode.overrideColor;
        TextLayoutResult textLayoutResultSlowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(TextStyle.m10566mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo4059invoke0d7_KjU() : Color.Companion.m8264getUnspecified0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777214, null));
        if (textLayoutResultSlowCreateTextLayoutResultOrNull != null) {
            list.add(textLayoutResultSlowCreateTextLayoutResultOrNull);
        } else {
            textLayoutResultSlowCreateTextLayoutResultOrNull = null;
        }
        return textLayoutResultSlowCreateTextLayoutResultOrNull != null;
    }

    static final boolean applySemantics$lambda$1(TextStringSimpleNode textStringSimpleNode, AnnotatedString annotatedString) {
        textStringSimpleNode.setSubstitution(annotatedString.getText());
        textStringSimpleNode.invalidateForTranslate();
        return true;
    }

    static final boolean applySemantics$lambda$2(TextStringSimpleNode textStringSimpleNode, boolean z) {
        TextSubstitutionValue textSubstitutionValue = textStringSimpleNode.textSubstitution;
        if (textSubstitutionValue == null) {
            return false;
        }
        textSubstitutionValue.setShowingSubstitution(z);
        textStringSimpleNode.invalidateForTranslate();
        return true;
    }

    static final boolean applySemantics$lambda$3(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.clearSubstitution();
        textStringSimpleNode.invalidateForTranslate();
        return true;
    }

    private final void clearSubstitution() {
        this.textSubstitution = null;
    }

    private final ParagraphLayoutCache getLayoutCache() {
        TextStyle textStyle;
        if (!ComposeFoundationFlags.isInheritedTextStyleEnabled || (textStyle = this.resolvedInheritedStyle) == null) {
            textStyle = this.style;
        }
        TextStyle textStyle2 = textStyle;
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        if (paragraphLayoutCache == null) {
            ParagraphLayoutCache paragraphLayoutCache2 = new ParagraphLayoutCache(this.text, textStyle2, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            this._layoutCache = paragraphLayoutCache2;
            paragraphLayoutCache = paragraphLayoutCache2;
        }
        if (paragraphLayoutCache == null) {
            x.g();
        }
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCacheForMeasure(IntrinsicMeasureScope intrinsicMeasureScope) {
        if (ComposeFoundationFlags.isInheritedTextStyleEnabled && m3836resolveInheritedStyleuwmK9pY(StylePhase.Companion.m3833getLayoutoWBPZag())) {
            TextStyle textStyle = this.resolvedInheritedStyle;
            if (textStyle == null) {
                textStyle = this.style;
            }
            getLayoutCache().m3822updateL6sJoHM(this.text, textStyle, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        layoutCacheOrSubstitute.setDensity$foundation(intrinsicMeasureScope);
        return layoutCacheOrSubstitute;
    }

    private final ParagraphLayoutCache getLayoutCacheOrSubstitute() {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (true != textSubstitutionValue.isShowingSubstitution()) {
                textSubstitutionValue = null;
            }
            if (textSubstitutionValue != null && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return getLayoutCache();
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

    /* renamed from: resolveInheritedStyle-uwmK9pY, reason: not valid java name */
    private final boolean m3836resolveInheritedStyleuwmK9pY(int i2) {
        TextStyle textStyle = this.resolvedInheritedStyle;
        TextStyle textStyleM3838inheritedTextStyleBh5OqGs = TextStyleProviderNodeKt.m3838inheritedTextStyleBh5OqGs(this, i2, this.style);
        this.resolvedInheritedStyle = textStyleM3838inheritedTextStyleBh5OqGs;
        return (textStyle == null || x.n(textStyle, textStyleM3838inheritedTextStyleBh5OqGs)) ? false : true;
    }

    private final boolean setSubstitution(String str) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (x.n(str, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(str);
            ParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.m3822updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            return true;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, str, false, null, 12, null);
        ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        paragraphLayoutCache.setDensity$foundation(getLayoutCache().getDensity$foundation());
        textSubstitutionValue2.setLayoutCache(paragraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        l<? super List<TextLayoutResult>, Boolean> lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TextStringSimpleNode.applySemantics$lambda$0(this.f$0, (List) obj));
                }
            };
            this.semanticsTextLayoutResult = lVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, 2, null));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.getSubstitution(), null, 2, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                TextStringSimpleNode.applySemantics$lambda$1(this.f$0, (AnnotatedString) obj);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextStringSimpleNode.applySemantics$lambda$2(this.f$0, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                TextStringSimpleNode.applySemantics$lambda$3(this.f$0);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, lVar, 1, null);
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            this.resolvedInheritedStyle = null;
        }
        if (z2 || z3) {
            getLayoutCache().m3822updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z2 || z3) {
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
        TextStyle textStyle;
        if (!isAttached()) {
            return;
        }
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        Paragraph paragraph$foundation = layoutCacheOrSubstitute.getParagraph$foundation();
        if (paragraph$foundation == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
            throw new e();
        }
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        boolean didOverflow$foundation = layoutCacheOrSubstitute.getDidOverflow$foundation();
        if (didOverflow$foundation) {
            long jM3818getLayoutSizeYbymL2g$foundation = layoutCacheOrSubstitute.m3818getLayoutSizeYbymL2g$foundation() >> 32;
            long jM3818getLayoutSizeYbymL2g$foundation2 = layoutCacheOrSubstitute.m3818getLayoutSizeYbymL2g$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            canvas.save();
            Canvas.CC.m8201clipRectN_I0leg$default(canvas, 0.0f, 0.0f, (int) jM3818getLayoutSizeYbymL2g$foundation, (int) jM3818getLayoutSizeYbymL2g$foundation2, 0, 16, null);
        }
        try {
            if (ComposeFoundationFlags.isInheritedTextStyleEnabled) {
                m3836resolveInheritedStyleuwmK9pY(StylePhase.Companion.m3832getDrawoWBPZag());
                textStyle = this.resolvedInheritedStyle;
                if (textStyle == null) {
                    textStyle = this.style;
                }
            } else {
                textStyle = this.style;
            }
            TextDecoration textDecoration = textStyle.getTextDecoration();
            if (textDecoration == null) {
                textDecoration = TextDecoration.Companion.getNone();
            }
            TextDecoration textDecoration2 = textDecoration;
            Shadow shadow = textStyle.getShadow();
            if (shadow == null) {
                shadow = Shadow.Companion.getNone();
            }
            Shadow shadow2 = shadow;
            Fill drawStyle = textStyle.getDrawStyle();
            if (drawStyle == null) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            Brush brush = textStyle.getBrush();
            if (brush != null) {
                Paragraph.CC.m10416painthn5TExg$default(paragraph$foundation, canvas, brush, textStyle.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                ColorProducer colorProducer = this.overrideColor;
                long jMo4059invoke0d7_KjU = colorProducer != null ? colorProducer.mo4059invoke0d7_KjU() : Color.Companion.m8264getUnspecified0d7_KjU();
                if (jMo4059invoke0d7_KjU == 16) {
                    jMo4059invoke0d7_KjU = textStyle.m10576getColor0d7_KjU() != 16 ? textStyle.m10576getColor0d7_KjU() : Color.Companion.m8254getBlack0d7_KjU();
                }
                Paragraph.CC.m10414paintLG529CI$default(paragraph$foundation, canvas, jMo4059invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            if (didOverflow$foundation) {
                canvas.restore();
            }
        } finally {
        }
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

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            ParagraphLayoutCache layoutCacheForMeasure = getLayoutCacheForMeasure(measureScope);
            boolean zM3820layoutWithConstraintsK40F9xA = layoutCacheForMeasure.m3820layoutWithConstraintsK40F9xA(j2, measureScope.getLayoutDirection());
            layoutCacheForMeasure.getObserveFontChanges$foundation();
            Paragraph paragraph$foundation = layoutCacheForMeasure.getParagraph$foundation();
            if (paragraph$foundation == null) {
                x.g();
            }
            long jM3818getLayoutSizeYbymL2g$foundation = layoutCacheForMeasure.m3818getLayoutSizeYbymL2g$foundation();
            if (zM3820layoutWithConstraintsK40F9xA) {
                LayoutModifierNodeKt.invalidateLayer(this);
                HashMap map = this.baselineCache;
                if (map == null) {
                    map = new HashMap(2);
                    this.baselineCache = map;
                }
                map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph$foundation.getFirstBaseline())));
                map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph$foundation.getLastBaseline())));
            }
            Constraints.Companion companion = Constraints.Companion;
            int i2 = (int) (jM3818getLayoutSizeYbymL2g$foundation >> 32);
            int i3 = (int) (jM3818getLayoutSizeYbymL2g$foundation & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(companion.m11116fitPrioritizingWidthZbe2FdA(i2, i2, i3, i3));
            Map<AlignmentLine, Integer> map2 = this.baselineCache;
            if (map2 == null) {
                x.g();
            }
            return measureScope.layout(i2, i3, map2, new l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextStringSimpleNode.measure_3p2s80s$lambda$0$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean zN = x.n(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (zN && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m3837updateLayoutRelatedArgsHuAbxIM(TextStyle textStyle, int i2, int i3, boolean z, FontFamily.Resolver resolver, int i4) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
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
        if (TextOverflow.m11059equalsimpl0(this.overflow, i4)) {
            return z2;
        }
        this.overflow = i4;
        return true;
    }

    public final boolean updateText(String str) {
        if (x.n(this.text, str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
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
        private ParagraphLayoutCache layoutCache;
        private final String original;
        private String substitution;

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache, int i2, o oVar) {
            this(str, str2, z & ((i2 & 4) == 0), (i2 & 8) != 0 ? null : paragraphLayoutCache);
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((i2 & 2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((i2 & 4) != 0) {
                z = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i2 & 8) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z, paragraphLayoutCache);
        }

        public final String component1() {
            return this.original;
        }

        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache) {
            return new TextSubstitutionValue(str, str2, z, paragraphLayoutCache);
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

        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final String getOriginal() {
            return this.original;
        }

        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int iHashCode = (this.original.hashCode() * 31) + this.substitution.hashCode();
            int iM = TextStringSimpleNode$TextSubstitutionValue$$ExternalSyntheticBackport0.m(this.isShowingSubstitution);
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return (((iHashCode * 31) + iM) * 31) + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(String str) {
            this.substitution = str;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public TextSubstitutionValue(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z;
            this.layoutCache = paragraphLayoutCache;
        }
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.overrideColor = colorProducer;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, ColorProducer colorProducer, o oVar) {
        this(str, textStyle, resolver, i2, z, i3, i4, colorProducer);
    }
}
