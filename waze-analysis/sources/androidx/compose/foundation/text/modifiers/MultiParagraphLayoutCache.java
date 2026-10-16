package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;
    private TextAutoSize autoSize;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private long historyFlag;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, List list, TextAutoSize textAutoSize, int i5, o oVar) {
        this(annotatedString, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i5 & 16) == 0)) | z, (i5 & 32) != 0 ? Integer.MAX_VALUE : i3, (i5 & 64) != 0 ? 1 : i4, (i5 & 128) != 0 ? null : list, (i5 & 256) != 0 ? null : textAutoSize, null);
    }

    private final TextAutoSizeLayoutScopeImpl getFontSizeSearchScope() {
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this._textAutoSizeLayoutScope;
        if (textAutoSizeLayoutScopeImpl == null) {
            textAutoSizeLayoutScopeImpl = new TextAutoSizeLayoutScopeImpl();
            this._textAutoSizeLayoutScope = textAutoSizeLayoutScopeImpl;
        }
        if (textAutoSizeLayoutScopeImpl == null) {
            x.g();
        }
        return textAutoSizeLayoutScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    public final MultiParagraph m3804layoutTextK40F9xA(long j2, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m3795finalConstraintstfFHcEY(j2, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m3796finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow, (o) null);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void markStyleAffectedDirty() {
        m3806recordHistory4ETZmGE(LayoutCacheOperation.Companion.m3794getMarkDirtyStyleDEKiAbY());
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m3805newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j2, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m11100equalsimpl0(j2, textLayoutResult.getLayoutInput().m10512getConstraintsmsEJaDk())) {
            return false;
        }
        if (Constraints.m11107getMaxWidthimpl(j2) == Constraints.m11107getMaxWidthimpl(textLayoutResult.getLayoutInput().m10512getConstraintsmsEJaDk()) && Constraints.m11109getMinWidthimpl(j2) == Constraints.m11109getMinWidthimpl(textLayoutResult.getLayoutInput().m10512getConstraintsmsEJaDk())) {
            return ((float) Constraints.m11106getMaxHeightimpl(j2)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
        }
        return true;
    }

    /* renamed from: recordHistory-4ETZmGE, reason: not valid java name */
    private final void m3806recordHistory4ETZmGE(long j2) {
        this.historyFlag = j2 | (this.historyFlag << 2);
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            if (density == null) {
                x.g();
            }
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            ac acVar = this.placeholders;
            if (acVar == null) {
                acVar = ac.f47967a;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, acVar, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(TextStyle textStyle) {
        boolean zHasSameLayoutAffectingAttributes = textStyle.hasSameLayoutAffectingAttributes(this.style);
        this.style = textStyle;
        if (zHasSameLayoutAffectingAttributes) {
            return;
        }
        markStyleAffectedDirty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m3807textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j2, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        ac acVar = this.placeholders;
        if (acVar == null) {
            acVar = ac.f47967a;
        }
        int i2 = this.maxLines;
        boolean z = this.softWrap;
        int i3 = this.overflow;
        Density density = this.density;
        if (density == null) {
            x.g();
        }
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, acVar, i2, z, i3, density, layoutDirection, this.fontFamilyResolver, j2, (o) null), multiParagraph, ConstraintsKt.m11121constrain4WqzIAM(j2, (TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (TextDelegateKt.ceilToIntPx(fMin) << 32)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    public final long m3808useMinLinesConstrainerOh53vG4(long j2, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        Density density = this.density;
        if (density == null) {
            x.g();
        }
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m3799coerceMinLinesOh53vG4$foundation(j2, this.minLines);
    }

    public final Density getDensity$foundation() {
        return this.density;
    }

    public final long getHistoryFlag$foundation() {
        return this.historyFlag;
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        toString();
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final int intrinsicHeight(int i2, LayoutDirection layoutDirection) {
        int i3 = this.cachedIntrinsicHeightInputWidth;
        int i4 = this.cachedIntrinsicHeight;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        long jConstraints = ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            jConstraints = m3808useMinLinesConstrainerOh53vG4(jConstraints, layoutDirection);
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m3804layoutTextK40F9xA(jConstraints, layoutDirection).getHeight());
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(jConstraints);
        if (iCeilToIntPx < iM11108getMinHeightimpl) {
            iCeilToIntPx = iM11108getMinHeightimpl;
        }
        this.cachedIntrinsicHeightInputWidth = i2;
        this.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m3809layoutWithConstraintsK40F9xA(long j2, LayoutDirection layoutDirection) {
        m3806recordHistory4ETZmGE(LayoutCacheOperation.Companion.m3791getLayoutWithConstraintsDEKiAbY());
        long jM3808useMinLinesConstrainerOh53vG4 = this.minLines > 1 ? m3808useMinLinesConstrainerOh53vG4(j2, layoutDirection) : j2;
        if (!m3805newLayoutWillBeDifferentVKLhPVY(this.layoutCache, jM3808useMinLinesConstrainerOh53vG4, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            if (textLayoutResult == null) {
                x.g();
            }
            if (Constraints.m11100equalsimpl0(jM3808useMinLinesConstrainerOh53vG4, textLayoutResult.getLayoutInput().m10512getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            if (textLayoutResult2 == null) {
                x.g();
            }
            this.layoutCache = m3807textLayoutResultVKLhPVY(layoutDirection, jM3808useMinLinesConstrainerOh53vG4, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long jM10577getFontSizeXSAIIZE = this.style.m10577getFontSizeXSAIIZE();
            TextAutoSize textAutoSize = this.autoSize;
            if (textAutoSize == null) {
                x.g();
            }
            long jMo3204getFontSizeCi0_558 = textAutoSize.mo3204getFontSizeCi0_558(getFontSizeSearchScope(), j2, this.text);
            if (TextUnit.m11364isEmimpl(jMo3204getFontSizeCi0_558)) {
                jMo3204getFontSizeCi0_558 = MultiParagraphLayoutCacheKt.m3813timesNB67dxo(jM10577getFontSizeXSAIIZE, jMo3204getFontSizeCi0_558);
            }
            long j3 = jMo3204getFontSizeCi0_558;
            TextLayoutResult lastLayoutResult = getFontSizeSearchScope().getLastLayoutResult();
            if (lastLayoutResult != null && TextUnit.m11359equalsimpl0(j3, lastLayoutResult.getLayoutInput().getStyle().m10577getFontSizeXSAIIZE()) && TextOverflow.m11059equalsimpl0(lastLayoutResult.getLayoutInput().m10513getOverflowgIe3tQ8(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            setStyle(TextStyle.m10559copyp1EtxEg$default(this.style, 0L, j3, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = m3807textLayoutResultVKLhPVY(layoutDirection, jM3808useMinLinesConstrainerOh53vG4, m3804layoutTextK40F9xA(jM3808useMinLinesConstrainerOh53vG4, layoutDirection));
        return true;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation(Density density) {
        Density density2 = this.density;
        long jM3775constructorimpl = density != null ? InlineDensity.m3775constructorimpl(density) : InlineDensity.Companion.m3783getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM3775constructorimpl;
        } else if (density == null || !InlineDensity.m3777equalsimpl0(this.lastDensity, jM3775constructorimpl)) {
            this.density = density;
            this.lastDensity = jM3775constructorimpl;
            m3806recordHistory4ETZmGE(LayoutCacheOperation.Companion.m3792getMarkDirtyDensityDEKiAbY());
            markDirty();
        }
    }

    public final void setHistoryFlag$foundation(long j2) {
        this.historyFlag = j2;
    }

    public String toString() {
        TextLayoutInput layoutInput;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object objM11094boximpl = "null";
        sb.append(this.layoutCache != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m3781toStringimpl(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=");
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
            objM11094boximpl = Constraints.m11094boximpl(layoutInput.m10512getConstraintsmsEJaDk());
        }
        sb.append(objM11094boximpl);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m3810updateJ2qo7bo(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        setStyle(textStyle);
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        m3806recordHistory4ETZmGE(LayoutCacheOperation.Companion.m3793getMarkDirtyNodeDEKiAbY());
        markDirty();
    }

    /* compiled from: WazeSource */
    final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {
        private TextLayoutResult lastLayoutResult;

        public TextAutoSizeLayoutScopeImpl() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            Density density$foundation = MultiParagraphLayoutCache.this.getDensity$foundation();
            if (density$foundation == null) {
                x.g();
            }
            return density$foundation.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            Density density$foundation = MultiParagraphLayoutCache.this.getDensity$foundation();
            if (density$foundation == null) {
                x.g();
            }
            return density$foundation.getFontScale();
        }

        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        /* renamed from: performLayout-5ZSfY2I, reason: not valid java name */
        public TextLayoutResult mo3811performLayout5ZSfY2I(long j2, AnnotatedString annotatedString, long j3) {
            long jM3808useMinLinesConstrainerOh53vG4;
            TextStyle textStyle = MultiParagraphLayoutCache.this.style;
            long jM3813timesNB67dxo = TextUnit.m11364isEmimpl(j3) ? MultiParagraphLayoutCacheKt.m3813timesNB67dxo(MultiParagraphLayoutCache.this.style.m10577getFontSizeXSAIIZE(), j3) : j3;
            if (!TextUnit.m11359equalsimpl0(jM3813timesNB67dxo, MultiParagraphLayoutCache.this.style.m10577getFontSizeXSAIIZE())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.setStyle(TextStyle.m10559copyp1EtxEg$default(multiParagraphLayoutCache.style, 0L, jM3813timesNB67dxo, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (MultiParagraphLayoutCache.this.minLines > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection layoutDirection = multiParagraphLayoutCache2.intrinsicsLayoutDirection;
                if (layoutDirection == null) {
                    x.g();
                }
                jM3808useMinLinesConstrainerOh53vG4 = multiParagraphLayoutCache2.m3808useMinLinesConstrainerOh53vG4(j2, layoutDirection);
            } else {
                jM3808useMinLinesConstrainerOh53vG4 = j2;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection2 = multiParagraphLayoutCache3.intrinsicsLayoutDirection;
            if (layoutDirection2 == null) {
                x.g();
            }
            MultiParagraph multiParagraphM3804layoutTextK40F9xA = multiParagraphLayoutCache3.m3804layoutTextK40F9xA(jM3808useMinLinesConstrainerOh53vG4, layoutDirection2);
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection3 = multiParagraphLayoutCache4.intrinsicsLayoutDirection;
            if (layoutDirection3 == null) {
                x.g();
            }
            TextLayoutResult textLayoutResultM3807textLayoutResultVKLhPVY = multiParagraphLayoutCache4.m3807textLayoutResultVKLhPVY(layoutDirection3, jM3808useMinLinesConstrainerOh53vG4, multiParagraphM3804layoutTextK40F9xA);
            this.lastLayoutResult = textLayoutResultM3807textLayoutResultVKLhPVY;
            MultiParagraphLayoutCache.this.setStyle(textStyle);
            return textLayoutResultM3807textLayoutResultVKLhPVY;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo2126toPxR2X_6o(long j2) {
            if (!TextUnit.m11364isEmimpl(j2)) {
                return mo2127toPx0680j_4(mo2122toDpGaN1DYA(j2));
            }
            if (TextUnit.m11364isEmimpl(MultiParagraphLayoutCache.this.style.m10577getFontSizeXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            if (TextUnit.m11359equalsimpl0(MultiParagraphLayoutCache.this.style.m10577getFontSizeXSAIIZE(), TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            return mo2126toPxR2X_6o(MultiParagraphLayoutCache.this.style.m10577getFontSizeXSAIIZE()) * TextUnit.m11362getValueimpl(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo2127toPx0680j_4(float f2) {
            return Density.CC.m11134$default$toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
        }
    }

    public static /* synthetic */ void getHistoryFlag$foundation$annotations() {
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        this.lastDensity = InlineDensity.Companion.m3783getUnspecifiedL26CHvs();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, List list, TextAutoSize textAutoSize, o oVar) {
        this(annotatedString, textStyle, resolver, i2, z, i3, i4, list, textAutoSize);
    }
}
