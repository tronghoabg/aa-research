package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    private AutoSizeStepBased(long j2, long j3, long j4) {
        this.minFontSize = j2;
        this.maxFontSize = j3;
        this.stepSize = j4;
        if (TextUnit.m11359equalsimpl0(j2, TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m11359equalsimpl0(j3, TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m11359equalsimpl0(j4, TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(this.minFontSize), TextUnit.m11361getTypeUIouoOA(j3))) {
            long j5 = this.minFontSize;
            TextUnitKt.m11376checkArithmeticNB67dxo(j5, j3);
            if (Float.compare(TextUnit.m11362getValueimpl(j5), TextUnit.m11362getValueimpl(j3)) > 0) {
                this.minFontSize = j3;
            }
        }
        if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j4), TextUnitType.Companion.m11395getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m11376checkArithmeticNB67dxo(j4, sp);
            if (Float.compare(TextUnit.m11362getValueimpl(j4), TextUnit.m11362getValueimpl(sp)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m11362getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m11362getValueimpl(j3) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int iM10513getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m10513getOverflowgIe3tQ8();
        if (TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11068getClipgIe3tQ8()) || TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11072getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11071getStartEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11070getMiddleEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11069getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m11061toStringimpl(textLayoutResult.getLayoutInput().m10513getOverflowgIe3tQ8())) + " is not supported.");
    }

    private final boolean didOverflowBounds(TextLayoutResult textLayoutResult) {
        return textLayoutResult.getDidOverflowWidth() || textLayoutResult.getDidOverflowHeight();
    }

    private final boolean didOverflowByEllipsize(TextLayoutResult textLayoutResult) {
        int lineCount = textLayoutResult.getLineCount();
        if (lineCount == 0) {
            return false;
        }
        if (lineCount == 1) {
            return textLayoutResult.isLineEllipsized(0);
        }
        int iM10513getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m10513getOverflowgIe3tQ8();
        if (TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11071getStartEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11070getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m11059equalsimpl0(iM10513getOverflowgIe3tQ8, TextOverflow.Companion.m11069getEllipsisgIe3tQ8())) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) obj;
        return TextUnit.m11359equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m11359equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m11359equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo3204getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j2, AnnotatedString annotatedString) {
        float f2 = textAutoSizeLayoutScope.mo2126toPxR2X_6o(this.stepSize);
        float f3 = textAutoSizeLayoutScope.mo2126toPxR2X_6o(this.minFontSize);
        float f4 = textAutoSizeLayoutScope.mo2126toPxR2X_6o(this.maxFontSize);
        float f5 = (f3 + f4) / 2.0f;
        float f6 = f3;
        float f7 = f4;
        while (f7 - f6 >= f2) {
            boolean zDidOverflow = didOverflow(textAutoSizeLayoutScope.mo3811performLayout5ZSfY2I(j2, annotatedString, textAutoSizeLayoutScope.mo2130toSpkPz2Gy4(f5)));
            if (true == zDidOverflow) {
                f7 = f5;
            }
            if (true != zDidOverflow) {
                f6 = f5;
            }
            f5 = (f6 + f7) / 2.0f;
        }
        float fFloor = (((float) Math.floor((f6 - f3) / f2)) * f2) + f3;
        float f8 = f2 + fFloor;
        if (f8 <= f4 && !didOverflow(textAutoSizeLayoutScope.mo3811performLayout5ZSfY2I(j2, annotatedString, textAutoSizeLayoutScope.mo2130toSpkPz2Gy4(f8)))) {
            fFloor = f8;
        }
        return textAutoSizeLayoutScope.mo2130toSpkPz2Gy4(fFloor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.m11363hashCodeimpl(this.minFontSize) * 31) + TextUnit.m11363hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m11363hashCodeimpl(this.stepSize);
    }

    public /* synthetic */ AutoSizeStepBased(long j2, long j3, long j4, o oVar) {
        this(j2, j3, j4);
    }
}
