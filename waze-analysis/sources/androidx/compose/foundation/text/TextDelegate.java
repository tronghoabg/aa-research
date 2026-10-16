package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.g.b.o;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z, int i4, Density density, FontFamily.Resolver resolver, List list, int i5, o oVar) {
        int iM11068getClipgIe3tQ8 = (i5 & 32) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i4;
        List list2 = (i5 & 256) != 0 ? ac.f47967a : list;
        int i6 = i5 & 4;
        this(annotatedString, textStyle, i6 != 0 ? Integer.MAX_VALUE : i2, (i5 & 8) != 0 ? 1 : i3, (!((i5 & 16) == 0)) | z, iM11068getClipgIe3tQ8, density, resolver, list2, null);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m3379layoutNN6EwU$default(TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m3382layoutNN6EwU(j2, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m3380layoutTextK40F9xA(long j2, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int iM11107getMaxWidthimpl = Integer.MAX_VALUE;
        if ((this.softWrap || TextOverflow.m11059equalsimpl0(this.overflow, TextOverflow.Companion.m11069getEllipsisgIe3tQ8())) && Constraints.m11103getHasBoundedWidthimpl(j2)) {
            iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        }
        int i2 = (this.softWrap || !TextOverflow.m11059equalsimpl0(this.overflow, TextOverflow.Companion.m11069getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        if (iM11109getMinWidthimpl != iM11107getMaxWidthimpl) {
            iM11107getMaxWidthimpl = n.j(getMaxIntrinsicWidth(), iM11109getMinWidthimpl, iM11107getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.Companion.m11116fitPrioritizingWidthZbe2FdA(0, iM11107getMaxWidthimpl, 0, Constraints.m11106getMaxHeightimpl(j2)), i2, this.overflow, (o) null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m3381getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation() {
        return this.paragraphIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m3382layoutNN6EwU(long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m3419canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j2)) {
            return textLayoutResult.m10515copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m10513getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j2, (o) null), ConstraintsKt.m11121constrain4WqzIAM(j2, (TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()) << 32)));
        }
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j2, (o) null), m3380layoutTextK40F9xA(j2, layoutDirection), ConstraintsKt.m11121constrain4WqzIAM(j2, (TextDelegateKt.ceilToIntPx(r13.getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (TextDelegateKt.ceilToIntPx(r13.getWidth()) << 32)), null);
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z, int i4, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i2;
        this.minLines = i3;
        this.softWrap = z;
        this.overflow = i4;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (i2 <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("no maxLines");
        }
        if (i3 <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("no minLines");
        }
        if (i3 <= i2) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines greater than maxLines");
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z, int i4, Density density, FontFamily.Resolver resolver, List list, o oVar) {
        this(annotatedString, textStyle, i2, i3, z, i4, density, resolver, list);
    }
}
