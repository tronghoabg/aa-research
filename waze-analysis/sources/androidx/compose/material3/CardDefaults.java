package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    public final CardColors cardColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        CardColors defaultCardColors$material3 = getDefaultCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCardColors$material3;
    }

    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m4465cardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        long jM8227copywmQWz5c$default;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j7 = jM4593contentColorForek8zF_U;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j6 = j7;
        } else {
            j6 = jM4593contentColorForek8zF_U;
            jM8227copywmQWz5c$default = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        CardColors cardColorsM4460copyjRlVdoo = getDefaultCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4460copyjRlVdoo(jM8264getUnspecified0d7_KjU, j6, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM4460copyjRlVdoo;
    }

    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m4466cardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledCardTokens.INSTANCE.m6745getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledCardTokens.INSTANCE.m6751getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilledCardTokens.INSTANCE.m6748getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilledCardTokens.INSTANCE.m6749getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = FilledCardTokens.INSTANCE.m6747getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = FilledCardTokens.INSTANCE.m6746getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i2, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        CardElevation cardElevation = new CardElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors elevatedCardColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:518)");
        }
        CardColors defaultElevatedCardColors$material3 = getDefaultElevatedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedCardColors$material3;
    }

    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m4467elevatedCardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        long jM8227copywmQWz5c$default;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j7 = jM4593contentColorForek8zF_U;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j6 = j7;
        } else {
            j6 = jM4593contentColorForek8zF_U;
            jM8227copywmQWz5c$default = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:536)");
        }
        CardColors cardColorsM4460copyjRlVdoo = getDefaultElevatedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4460copyjRlVdoo(jM8264getUnspecified0d7_KjU, j6, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM4460copyjRlVdoo;
    }

    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m4468elevatedCardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = ElevatedCardTokens.INSTANCE.m6663getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = ElevatedCardTokens.INSTANCE.m6669getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = ElevatedCardTokens.INSTANCE.m6666getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = ElevatedCardTokens.INSTANCE.m6667getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = ElevatedCardTokens.INSTANCE.m6665getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = ElevatedCardTokens.INSTANCE.m6664getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:430)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        CardElevation cardElevation = new CardElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors getDefaultCardColors$material3(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached$material3 = colorScheme.getDefaultCardColorsCached$material3();
        if (defaultCardColorsCached$material3 != null) {
            return defaultCardColorsCached$material3;
        }
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor())), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getDisabledContainerColor()), FilledCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor())), Color.m8227copywmQWz5c$default(ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultElevatedCardColors$material3(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached$material3 = colorScheme.getDefaultElevatedCardColorsCached$material3();
        if (defaultElevatedCardColorsCached$material3 != null) {
            return defaultElevatedCardColorsCached$material3;
        }
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getContainerColor())), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getDisabledContainerColor()), ElevatedCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getDisabledContainerColor())), Color.m8227copywmQWz5c$default(ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3(cardColors);
        return cardColors;
    }

    public final CardColors getDefaultOutlinedCardColors$material3(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached$material3 = colorScheme.getDefaultOutlinedCardColorsCached$material3();
        if (defaultOutlinedCardColorsCached$material3 != null) {
            return defaultOutlinedCardColorsCached$material3;
        }
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3(cardColors);
        return cardColors;
    }

    public final Shape getElevatedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i2, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:374)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i2, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:378)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i2, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final BorderStroke outlinedCardBorder(boolean z, Composer composer, int i2, int i3) {
        long jM8273compositeOverOWjLjI;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:613)");
        }
        if (((i3 & 1) | (z ? 1 : 0)) != 0) {
            composer.startReplaceGroup(2106917102);
            jM8273compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2106996493);
            jM8273compositeOverOWjLjI = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM8273compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m1998BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m6913getOutlineWidthD9Ej5fM(), jM8273compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final CardColors outlinedCardColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:567)");
        }
        CardColors defaultOutlinedCardColors$material3 = getDefaultOutlinedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedCardColors$material3;
    }

    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m4469outlinedCardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU, composer, i2 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:585)");
        }
        CardColors cardColorsM4460copyjRlVdoo = getDefaultOutlinedCardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4460copyjRlVdoo(jM8264getUnspecified0d7_KjU, jM4593contentColorForek8zF_U, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM4460copyjRlVdoo;
    }

    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m4470outlinedCardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = OutlinedCardTokens.INSTANCE.m6907getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = f2;
        }
        if ((i3 & 4) != 0) {
            f4 = f2;
        }
        if ((i3 & 8) != 0) {
            f5 = f2;
        }
        if ((i3 & 16) != 0) {
            f6 = OutlinedCardTokens.INSTANCE.m6909getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = OutlinedCardTokens.INSTANCE.m6908getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:459)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        CardElevation cardElevation = new CardElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }
}
