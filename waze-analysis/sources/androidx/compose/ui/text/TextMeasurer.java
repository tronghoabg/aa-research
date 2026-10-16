package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.g.b.o;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i2;
        this.textLayoutCache = i2 > 0 ? new TextLayoutCache(i2) : null;
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m10520measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z, int i3, List list, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i4, Object obj) {
        return textMeasurer.m10522measurexDpz5zY(annotatedString, (i4 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (i4 & 4) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i4 & 8) == 0)) | z, (i4 & 16) != 0 ? Integer.MAX_VALUE : i3, (i4 & 32) != 0 ? i.h() : list, (i4 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j2, (i4 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i4 & 256) != 0 ? textMeasurer.defaultDensity : density, (i4 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, ((i4 & 1024) == 0) & z2);
    }

    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m10521measurewNUYSr0(String str, TextStyle textStyle, int i2, boolean z, int i3, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        return m10520measurexDpz5zY$default(this, new AnnotatedString(str, null, 2, null), textStyle, i2, z, i3, null, j2, layoutDirection, density, resolver, z2, 32, null);
    }

    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m10522measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z, int i3, List<AnnotatedString.Range<Placeholder>> list, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i3, z, i2, density, layoutDirection, resolver, j2, (o) null);
        TextLayoutResult textLayoutResult = null;
        if (!z2 && (textLayoutCache = this.textLayoutCache) != null) {
            textLayoutResult = textLayoutCache.get(textLayoutInput);
        }
        if (textLayoutResult != null) {
            return textLayoutResult.m10515copyO0kMr_c(textLayoutInput, ConstraintsKt.m11121constrain4WqzIAM(j2, (ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()) << 32) | (ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        }
        TextLayoutResult textLayoutResultLayout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 == null) {
            return textLayoutResultLayout;
        }
        textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
        return textLayoutResultLayout;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(textLayoutInput.m10512getConstraintsmsEJaDk());
            int iM11107getMaxWidthimpl = Integer.MAX_VALUE;
            if ((textLayoutInput.getSoftWrap() || TextMeasurerKt.m10524isEllipsisMW5ApA(textLayoutInput.m10513getOverflowgIe3tQ8())) && Constraints.m11103getHasBoundedWidthimpl(textLayoutInput.m10512getConstraintsmsEJaDk())) {
                iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(textLayoutInput.m10512getConstraintsmsEJaDk());
            }
            int maxLines = (textLayoutInput.getSoftWrap() || !TextMeasurerKt.m10524isEllipsisMW5ApA(textLayoutInput.m10513getOverflowgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (iM11109getMinWidthimpl != iM11107getMaxWidthimpl) {
                iM11107getMaxWidthimpl = n.j(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM11109getMinWidthimpl, iM11107getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m11116fitPrioritizingWidthZbe2FdA(0, iM11107getMaxWidthimpl, 0, Constraints.m11106getMaxHeightimpl(textLayoutInput.m10512getConstraintsmsEJaDk())), maxLines, textLayoutInput.m10513getOverflowgIe3tQ8(), (o) null), ConstraintsKt.m11121constrain4WqzIAM(textLayoutInput.m10512getConstraintsmsEJaDk(), (((int) Math.ceil(r5.getWidth())) << 32) | (((int) Math.ceil(r5.getHeight())) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2, int i3, o oVar) {
        this(resolver, density, layoutDirection, (i3 & 8) != 0 ? 8 : i2);
    }
}
