package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TooltipDefaults {
    public static final int $stable = 0;
    private static final DefaultTooltipCaretShape DefaultCaretShape;
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();
    private static final long caretSize;
    private static final float plainTooltipMaxWidth;
    private static final float richTooltipMaxWidth;

    static {
        long jM11186DpSizeYgX7TsA = DpKt.m11186DpSizeYgX7TsA(16.0f, 8.0f);
        caretSize = jM11186DpSizeYgX7TsA;
        plainTooltipMaxWidth = 200.0f;
        richTooltipMaxWidth = 320.0f;
        DefaultCaretShape = new DefaultTooltipCaretShape(jM11186DpSizeYgX7TsA, null);
    }

    private TooltipDefaults() {
    }

    /* renamed from: caretShape-EaSLcWc$default, reason: not valid java name */
    public static /* synthetic */ Shape m6039caretShapeEaSLcWc$default(TooltipDefaults tooltipDefaults, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = caretSize;
        }
        return tooltipDefaults.m6040caretShapeEaSLcWc(j2);
    }

    public final DefaultTooltipCaretShape caretShape() {
        return DefaultCaretShape;
    }

    /* renamed from: caretShape-EaSLcWc, reason: not valid java name */
    public final Shape m6040caretShapeEaSLcWc(long j2) {
        return new DefaultTooltipCaretShape(j2, null);
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m6041getCaretSizeMYxV2XQ() {
        return caretSize;
    }

    public final DefaultTooltipCaretShape getDefaultCaretShape$material3() {
        return DefaultCaretShape;
    }

    public final RichTooltipColors getDefaultRichTooltipColors$material3(ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached$material3 = colorScheme.getDefaultRichTooltipColorsCached$material3();
        if (defaultRichTooltipColorsCached$material3 != null) {
            return defaultRichTooltipColorsCached$material3;
        }
        RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getActionLabelTextColor()), null);
        colorScheme.setDefaultRichTooltipColorsCached$material3(richTooltipColors);
        return richTooltipColors;
    }

    public final long getPlainTooltipContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:495)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getPlainTooltipContainerShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:491)");
        }
        Shape value = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getPlainTooltipContentColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:499)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getPlainTooltipMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m6042getPlainTooltipMaxWidthD9Ej5fM() {
        return plainTooltipMaxWidth;
    }

    public final Shape getRichTooltipContainerShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:503)");
        }
        Shape value = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getRichTooltipMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m6043getRichTooltipMaxWidthD9Ej5fM() {
        return richTooltipMaxWidth;
    }

    /* renamed from: rememberPlainTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m6044rememberPlainTooltipPositionProviderkHDZbjc(float f2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:576)");
        }
        final int iMo2121roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(f2);
        boolean zChanged = composer.changed(iMo2121roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
                    int left = intRect.getLeft() + ((intRect.getWidth() - ((int) (j3 >> 32))) / 2);
                    int top = (intRect.getTop() - ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - iMo2121roundToPx0680j_4;
                    if (top < 0) {
                        top = intRect.getBottom() + iMo2121roundToPx0680j_4;
                    }
                    return (left << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & top);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$1;
    }

    /* renamed from: rememberRichTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m6045rememberRichTooltipPositionProviderkHDZbjc(float f2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538806795, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:615)");
        }
        final int iMo2121roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(f2);
        boolean zChanged = composer.changed(iMo2121roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberRichTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
                    int left = intRect.getLeft();
                    int i4 = (int) (j3 >> 32);
                    if (left + i4 > ((int) (j2 >> 32)) && (left = intRect.getRight() - i4) < 0) {
                        left = intRect.getLeft() + ((intRect.getWidth() - i4) / 2);
                    }
                    int top = (intRect.getTop() - ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - iMo2121roundToPx0680j_4;
                    if (top < 0) {
                        top = intRect.getBottom() + iMo2121roundToPx0680j_4;
                    }
                    return (left << 32) | (top & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberRichTooltipPositionProvider$1$1 tooltipDefaults$rememberRichTooltipPositionProvider$1$1 = (TooltipDefaults$rememberRichTooltipPositionProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberRichTooltipPositionProvider$1$1;
    }

    /* renamed from: rememberTooltipPositionProvider-Hu5FAss, reason: not valid java name */
    public final PopupPositionProvider m6046rememberTooltipPositionProviderHu5FAss(int i2, float f2, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            f2 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-573803578, i3, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:718)");
        }
        int iMo2121roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(f2);
        long jMo10259getContainerSizeYbymL2g = ((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo10259getContainerSizeYbymL2g();
        boolean zChanged = composer.changed(iMo2121roundToPx0680j_4);
        boolean z = true;
        if ((((i3 & 14) ^ 6) <= 4 || !composer.changed(i2)) && (i3 & 6) != 4) {
            z = false;
        }
        boolean zChanged2 = zChanged | z | composer.changed(jMo10259getContainerSizeYbymL2g);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
            TooltipPositionProviderImpl tooltipPositionProviderImpl = new TooltipPositionProviderImpl(i2, iMo2121roundToPx0680j_4, jMo10259getContainerSizeYbymL2g, null);
            composer.updateRememberedValue(tooltipPositionProviderImpl);
            objRememberedValue = tooltipPositionProviderImpl;
        }
        TooltipPositionProviderImpl tooltipPositionProviderImpl2 = (TooltipPositionProviderImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipPositionProviderImpl2;
    }

    /* renamed from: rememberTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m6047rememberTooltipPositionProviderkHDZbjc(float f2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1613894159, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:668)");
        }
        final int iMo2121roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(f2);
        boolean zChanged = composer.changed(iMo2121roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
                    int i4 = (int) (j3 >> 32);
                    int left = intRect.getLeft() + ((intRect.getWidth() - i4) / 2);
                    if (left < 0) {
                        left = intRect.getLeft();
                    } else if (left + i4 > ((int) (j2 >> 32))) {
                        left = intRect.getRight() - i4;
                    }
                    int top = (intRect.getTop() - ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - iMo2121roundToPx0680j_4;
                    if (top < 0) {
                        top = intRect.getBottom() + iMo2121roundToPx0680j_4;
                    }
                    return (left << 32) | (top & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberTooltipPositionProvider$1$1 tooltipDefaults$rememberTooltipPositionProvider$1$1 = (TooltipDefaults$rememberTooltipPositionProvider$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberTooltipPositionProvider$1$1;
    }

    public final RichTooltipColors richTooltipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1622312141, i2, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:529)");
        }
        RichTooltipColors defaultRichTooltipColors$material3 = getDefaultRichTooltipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRichTooltipColors$material3;
    }

    /* renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m6048richTooltipColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i2, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:542)");
        }
        long j6 = j3;
        long j7 = j2;
        RichTooltipColors richTooltipColorsM5403copyjRlVdoo = getDefaultRichTooltipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5403copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return richTooltipColorsM5403copyjRlVdoo;
    }
}
