package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.material.ColorsKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return ColorsKt.m4049lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    });

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m4044contentColorFor4WTKRHQ(Colors colors, long j2) {
        return Color.m8229equalsimpl0(j2, colors.m4027getPrimary0d7_KjU()) ? colors.m4024getOnPrimary0d7_KjU() : Color.m8229equalsimpl0(j2, colors.m4028getPrimaryVariant0d7_KjU()) ? colors.m4024getOnPrimary0d7_KjU() : Color.m8229equalsimpl0(j2, colors.m4029getSecondary0d7_KjU()) ? colors.m4025getOnSecondary0d7_KjU() : Color.m8229equalsimpl0(j2, colors.m4030getSecondaryVariant0d7_KjU()) ? colors.m4025getOnSecondary0d7_KjU() : Color.m8229equalsimpl0(j2, colors.m4020getBackground0d7_KjU()) ? colors.m4022getOnBackground0d7_KjU() : Color.m8229equalsimpl0(j2, colors.m4031getSurface0d7_KjU()) ? colors.m4026getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colors.m4021getError0d7_KjU()) ? colors.m4023getOnError0d7_KjU() : Color.Companion.m8264getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m4045contentColorForek8zF_U(long j2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i2, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        composer.startReplaceGroup(-583917585);
        long jM4044contentColorFor4WTKRHQ = m4044contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j2);
        if (jM4044contentColorFor4WTKRHQ == 16) {
            jM4044contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM4044contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m4046darkColors2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m4047darkColors2qZNXz8$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long jColor = (i2 & 1) != 0 ? ColorKt.Color(4290479868L) : j2;
        long jColor2 = (i2 & 2) != 0 ? ColorKt.Color(4281794739L) : j3;
        long jColor3 = (i2 & 4) != 0 ? ColorKt.Color(4278442694L) : j4;
        long j14 = (i2 & 8) != 0 ? jColor3 : j5;
        long jColor4 = (i2 & 16) != 0 ? ColorKt.Color(4279374354L) : j6;
        long jColor5 = (i2 & 32) != 0 ? ColorKt.Color(4279374354L) : j7;
        long jColor6 = (i2 & 64) != 0 ? ColorKt.Color(4291782265L) : j8;
        long jM8254getBlack0d7_KjU = (i2 & 128) != 0 ? Color.Companion.m8254getBlack0d7_KjU() : j9;
        long jM8254getBlack0d7_KjU2 = (i2 & 256) != 0 ? Color.Companion.m8254getBlack0d7_KjU() : j10;
        long jM8265getWhite0d7_KjU = (i2 & 512) != 0 ? Color.Companion.m8265getWhite0d7_KjU() : j11;
        long jM8265getWhite0d7_KjU2 = (i2 & 1024) != 0 ? Color.Companion.m8265getWhite0d7_KjU() : j12;
        if ((i2 & 2048) != 0) {
            j13 = Color.Companion.m8254getBlack0d7_KjU();
        }
        return m4046darkColors2qZNXz8(jColor, jColor2, jColor3, j14, jColor4, jColor5, jColor6, jM8254getBlack0d7_KjU, jM8254getBlack0d7_KjU2, jM8265getWhite0d7_KjU, jM8265getWhite0d7_KjU2, j13);
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(Colors colors) {
        return colors.isLight() ? colors.m4027getPrimary0d7_KjU() : colors.m4031getSurface0d7_KjU();
    }

    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m4048lightColors2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m4049lightColors2qZNXz8$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long jColor = (i2 & 1) != 0 ? ColorKt.Color(4284612846L) : j2;
        long jColor2 = (i2 & 2) != 0 ? ColorKt.Color(4281794739L) : j3;
        long jColor3 = (i2 & 4) != 0 ? ColorKt.Color(4278442694L) : j4;
        long jColor4 = (i2 & 8) != 0 ? ColorKt.Color(4278290310L) : j5;
        long jM8265getWhite0d7_KjU = (i2 & 16) != 0 ? Color.Companion.m8265getWhite0d7_KjU() : j6;
        long jM8265getWhite0d7_KjU2 = (i2 & 32) != 0 ? Color.Companion.m8265getWhite0d7_KjU() : j7;
        long jColor5 = (i2 & 64) != 0 ? ColorKt.Color(4289724448L) : j8;
        long jM8265getWhite0d7_KjU3 = (i2 & 128) != 0 ? Color.Companion.m8265getWhite0d7_KjU() : j9;
        long j14 = jColor;
        long jM8254getBlack0d7_KjU = (i2 & 256) != 0 ? Color.Companion.m8254getBlack0d7_KjU() : j10;
        long jM8254getBlack0d7_KjU2 = (i2 & 512) != 0 ? Color.Companion.m8254getBlack0d7_KjU() : j11;
        long jM8254getBlack0d7_KjU3 = (i2 & 1024) != 0 ? Color.Companion.m8254getBlack0d7_KjU() : j12;
        if ((i2 & 2048) != 0) {
            j13 = Color.Companion.m8265getWhite0d7_KjU();
        }
        return m4048lightColors2qZNXz8(j14, jColor2, jColor3, jColor4, jM8265getWhite0d7_KjU, jM8265getWhite0d7_KjU2, jColor5, jM8265getWhite0d7_KjU3, jM8254getBlack0d7_KjU, jM8254getBlack0d7_KjU2, jM8254getBlack0d7_KjU3, j13);
    }

    public static final void updateColorsFrom(Colors colors, Colors colors2) {
        colors.m4039setPrimary8_81llA$material(colors2.m4027getPrimary0d7_KjU());
        colors.m4040setPrimaryVariant8_81llA$material(colors2.m4028getPrimaryVariant0d7_KjU());
        colors.m4041setSecondary8_81llA$material(colors2.m4029getSecondary0d7_KjU());
        colors.m4042setSecondaryVariant8_81llA$material(colors2.m4030getSecondaryVariant0d7_KjU());
        colors.m4032setBackground8_81llA$material(colors2.m4020getBackground0d7_KjU());
        colors.m4043setSurface8_81llA$material(colors2.m4031getSurface0d7_KjU());
        colors.m4033setError8_81llA$material(colors2.m4021getError0d7_KjU());
        colors.m4036setOnPrimary8_81llA$material(colors2.m4024getOnPrimary0d7_KjU());
        colors.m4037setOnSecondary8_81llA$material(colors2.m4025getOnSecondary0d7_KjU());
        colors.m4034setOnBackground8_81llA$material(colors2.m4022getOnBackground0d7_KjU());
        colors.m4038setOnSurface8_81llA$material(colors2.m4026getOnSurface0d7_KjU());
        colors.m4035setOnError8_81llA$material(colors2.m4023getOnError0d7_KjU());
        colors.setLight$material(colors2.isLight());
    }
}
