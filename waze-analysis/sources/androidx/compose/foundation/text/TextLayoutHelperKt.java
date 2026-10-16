package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m3419canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !x.n(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !x.n(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i2 || layoutInput.getSoftWrap() != z || !TextOverflow.m11059equalsimpl0(layoutInput.m10513getOverflowgIe3tQ8(), i3) || !x.n(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !x.n(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m11109getMinWidthimpl(j2) != Constraints.m11109getMinWidthimpl(layoutInput.m10512getConstraintsmsEJaDk())) {
            return false;
        }
        if (z || TextOverflow.m11059equalsimpl0(i3, TextOverflow.Companion.m11069getEllipsisgIe3tQ8())) {
            return Constraints.m11107getMaxWidthimpl(j2) == Constraints.m11107getMaxWidthimpl(layoutInput.m10512getConstraintsmsEJaDk()) && Constraints.m11106getMaxHeightimpl(j2) == Constraints.m11106getMaxHeightimpl(layoutInput.m10512getConstraintsmsEJaDk());
        }
        return true;
    }

    public static final float getLineHeight(TextLayoutResult textLayoutResult, int i2) {
        if (i2 < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(i2), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i2 <= textLayoutResult.getMultiParagraph().getLineEnd(iMin, false & ((2 & 2) == 0))) {
            return textLayoutResult.getMultiParagraph().getLineHeight(iMin);
        }
        return 0.0f;
    }

    /* renamed from: isPositionInsideSelection-uaM50fQ, reason: not valid java name */
    public static final boolean m3420isPositionInsideSelectionuaM50fQ(TextLayoutResult textLayoutResult, long j2, TextRange textRange) {
        if (textRange == null || TextRange.m10540getCollapsedimpl(textRange.m10550unboximpl())) {
            return false;
        }
        int iM10516getOffsetForPositionk4lQ0M = textLayoutResult.m10516getOffsetForPositionk4lQ0M(j2);
        return isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(textRange, textLayoutResult, j2, iM10516getOffsetForPositionk4lQ0M) || isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(textRange, textLayoutResult, j2, iM10516getOffsetForPositionk4lQ0M + (-1));
    }

    private static final boolean isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(TextRange textRange, TextLayoutResult textLayoutResult, long j2, int i2) {
        return TextRange.m10537containsimpl(textRange.m10550unboximpl(), i2) && textLayoutResult.getBoundingBox(i2).m8006containsk4lQ0M(j2);
    }
}
