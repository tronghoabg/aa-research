package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.waze.strings.DisplayStrings;
import h.a.ac;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    private static MinLinesConstrainer last;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final TextStyle inputTextStyle;
    private final LayoutDirection layoutDirection;
    private float lineHeightCache = Float.NaN;
    private float oneLineHeightCache = Float.NaN;
    private final TextStyle resolvedStyle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation, reason: not valid java name */
    public final long m3799coerceMinLinesOh53vG4$foundation(long j2, int i2) {
        int iM11108getMinHeightimpl;
        float height = this.oneLineHeightCache;
        float height2 = this.lineHeightCache;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = ParagraphKt.m10425ParagraphUl8oQg4(MinLinesConstrainerKt.EmptyTextReplacement, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 32) != 0 ? ac.f47967a : null, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 64) != 0 ? ac.f47967a : null, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 128) != 0 ? Integer.MAX_VALUE : 1, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 256) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : TextOverflow.Companion.m11068getClipgIe3tQ8()).getHeight();
            height2 = ParagraphKt.m10425ParagraphUl8oQg4(MinLinesConstrainerKt.TwoLineTextReplacement, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 32) != 0 ? ac.f47967a : null, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 64) != 0 ? ac.f47967a : null, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 128) != 0 ? Integer.MAX_VALUE : 2, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 256) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : TextOverflow.Companion.m11068getClipgIe3tQ8()).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
        }
        if (i2 != 1) {
            iM11108getMinHeightimpl = Math.round(height + (height2 * (i2 - 1)));
            if (iM11108getMinHeightimpl < 0) {
                iM11108getMinHeightimpl = 0;
            }
            int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
            if (iM11108getMinHeightimpl > iM11106getMaxHeightimpl) {
                iM11108getMinHeightimpl = iM11106getMaxHeightimpl;
            }
        } else {
            iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        }
        return ConstraintsKt.Constraints(Constraints.m11109getMinWidthimpl(j2), Constraints.m11107getMaxWidthimpl(j2), iM11108getMinHeightimpl, Constraints.m11106getMaxHeightimpl(j2));
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && x.n(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && x.n(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(textStyle, layoutDirection), DensityKt.Density(density.getDensity(), density.getFontScale()), resolver);
            MinLinesConstrainer.last = minLinesConstrainer3;
            return minLinesConstrainer3;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
