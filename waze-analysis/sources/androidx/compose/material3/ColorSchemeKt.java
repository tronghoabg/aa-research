package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import h.g.a.a;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.material3.ColorSchemeKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            float f2 = ColorSchemeKt.DisabledAlpha;
            return true;
        }
    });

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final boolean LocalTonalElevationEnabled$lambda$0() {
        return true;
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m4591applyTonalElevationRFCenO8(ColorScheme colorScheme, long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i2, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1553)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m8229equalsimpl0(j2, colorScheme.m4577getSurface0d7_KjU()) && zBooleanValue) {
            j2 = m4606surfaceColorAtElevation3ABfNKs(colorScheme, f2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j2;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m4592contentColorFor4WTKRHQ(ColorScheme colorScheme, long j2) {
        return Color.m8229equalsimpl0(j2, colorScheme.m4568getPrimary0d7_KjU()) ? colorScheme.m4552getOnPrimary0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4573getSecondary0d7_KjU()) ? colorScheme.m4556getOnSecondary0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4587getTertiary0d7_KjU()) ? colorScheme.m4562getOnTertiary0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4543getBackground0d7_KjU()) ? colorScheme.m4549getOnBackground0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4544getError0d7_KjU()) ? colorScheme.m4550getOnError0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4569getPrimaryContainer0d7_KjU()) ? colorScheme.m4553getOnPrimaryContainer0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4574getSecondaryContainer0d7_KjU()) ? colorScheme.m4557getOnSecondaryContainer0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4588getTertiaryContainer0d7_KjU()) ? colorScheme.m4563getOnTertiaryContainer0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4545getErrorContainer0d7_KjU()) ? colorScheme.m4551getOnErrorContainer0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4548getInverseSurface0d7_KjU()) ? colorScheme.m4546getInverseOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4577getSurface0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4586getSurfaceVariant0d7_KjU()) ? colorScheme.m4561getOnSurfaceVariant0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4578getSurfaceBright0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4579getSurfaceContainer0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4580getSurfaceContainerHigh0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4581getSurfaceContainerHighest0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4582getSurfaceContainerLow0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4583getSurfaceContainerLowest0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4584getSurfaceDim0d7_KjU()) ? colorScheme.m4560getOnSurface0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4570getPrimaryFixed0d7_KjU()) ? colorScheme.m4554getOnPrimaryFixed0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4571getPrimaryFixedDim0d7_KjU()) ? colorScheme.m4554getOnPrimaryFixed0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4575getSecondaryFixed0d7_KjU()) ? colorScheme.m4558getOnSecondaryFixed0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4576getSecondaryFixedDim0d7_KjU()) ? colorScheme.m4558getOnSecondaryFixed0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4589getTertiaryFixed0d7_KjU()) ? colorScheme.m4564getOnTertiaryFixed0d7_KjU() : Color.m8229equalsimpl0(j2, colorScheme.m4590getTertiaryFixedDim0d7_KjU()) ? colorScheme.m4564getOnTertiaryFixed0d7_KjU() : Color.Companion.m8264getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m4593contentColorForek8zF_U(long j2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i2, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1131)");
        }
        composer.startReplaceGroup(89373914);
        long jM4592contentColorFor4WTKRHQ = m4592contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2);
        if (jM4592contentColorFor4WTKRHQ == 16) {
            jM4592contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM4592contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m4594darkColorSchemeCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return m4599darkColorScheme_VG5OTI$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4595darkColorSchemeCXl9yA$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        long jM6545getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m6545getPrimary0d7_KjU() : j2;
        long jM6529getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m6529getOnPrimary0d7_KjU() : j3;
        long jM6546getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m6546getPrimaryContainer0d7_KjU() : j4;
        long jM6530getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m6530getOnPrimaryContainer0d7_KjU() : j5;
        long jM6524getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m6524getInversePrimary0d7_KjU() : j6;
        long jM6550getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m6550getSecondary0d7_KjU() : j7;
        long jM6533getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m6533getOnSecondary0d7_KjU() : j8;
        long jM6551getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m6551getSecondaryContainer0d7_KjU() : j9;
        long j38 = jM6545getPrimary0d7_KjU;
        long jM6534getOnSecondaryContainer0d7_KjU = (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m6534getOnSecondaryContainer0d7_KjU() : j10;
        long jM6564getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m6564getTertiary0d7_KjU() : j11;
        long jM6539getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m6539getOnTertiary0d7_KjU() : j12;
        long jM6565getTertiaryContainer0d7_KjU = (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m6565getTertiaryContainer0d7_KjU() : j13;
        long jM6540getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m6540getOnTertiaryContainer0d7_KjU() : j14;
        long jM6520getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m6520getBackground0d7_KjU() : j15;
        long jM6526getOnBackground0d7_KjU = (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m6526getOnBackground0d7_KjU() : j16;
        long jM6554getSurface0d7_KjU = (i2 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m6554getSurface0d7_KjU() : j17;
        long jM6537getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m6537getOnSurface0d7_KjU() : j18;
        long jM6563getSurfaceVariant0d7_KjU = (i2 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m6563getSurfaceVariant0d7_KjU() : j19;
        long jM6538getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m6538getOnSurfaceVariant0d7_KjU() : j20;
        long j39 = (i2 & 524288) != 0 ? j38 : j21;
        long jM6525getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m6525getInverseSurface0d7_KjU() : j22;
        long jM6523getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m6523getInverseOnSurface0d7_KjU() : j23;
        long jM6521getError0d7_KjU = (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m6521getError0d7_KjU() : j24;
        long jM6527getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m6527getOnError0d7_KjU() : j25;
        long jM6522getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m6522getErrorContainer0d7_KjU() : j26;
        long jM6528getOnErrorContainer0d7_KjU = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m6528getOnErrorContainer0d7_KjU() : j27;
        long jM6543getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m6543getOutline0d7_KjU() : j28;
        long jM6544getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m6544getOutlineVariant0d7_KjU() : j29;
        long jM6549getScrim0d7_KjU = (i2 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m6549getScrim0d7_KjU() : j30;
        long jM6555getSurfaceBright0d7_KjU = (i2 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m6555getSurfaceBright0d7_KjU() : j31;
        long jM6556getSurfaceContainer0d7_KjU = (i2 & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m6556getSurfaceContainer0d7_KjU() : j32;
        long jM6557getSurfaceContainerHigh0d7_KjU = (i2 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m6557getSurfaceContainerHigh0d7_KjU() : j33;
        long jM6558getSurfaceContainerHighest0d7_KjU = (i3 & 1) != 0 ? ColorDarkTokens.INSTANCE.m6558getSurfaceContainerHighest0d7_KjU() : j34;
        long jM6559getSurfaceContainerLow0d7_KjU = (i3 & 2) != 0 ? ColorDarkTokens.INSTANCE.m6559getSurfaceContainerLow0d7_KjU() : j35;
        long jM6560getSurfaceContainerLowest0d7_KjU = (i3 & 4) != 0 ? ColorDarkTokens.INSTANCE.m6560getSurfaceContainerLowest0d7_KjU() : j36;
        if ((i3 & 8) != 0) {
            j37 = ColorDarkTokens.INSTANCE.m6561getSurfaceDim0d7_KjU();
        }
        return m4594darkColorSchemeCXl9yA(j38, jM6529getOnPrimary0d7_KjU, jM6546getPrimaryContainer0d7_KjU, jM6530getOnPrimaryContainer0d7_KjU, jM6524getInversePrimary0d7_KjU, jM6550getSecondary0d7_KjU, jM6533getOnSecondary0d7_KjU, jM6551getSecondaryContainer0d7_KjU, jM6534getOnSecondaryContainer0d7_KjU, jM6564getTertiary0d7_KjU, jM6539getOnTertiary0d7_KjU, jM6565getTertiaryContainer0d7_KjU, jM6540getOnTertiaryContainer0d7_KjU, jM6520getBackground0d7_KjU, jM6526getOnBackground0d7_KjU, jM6554getSurface0d7_KjU, jM6537getOnSurface0d7_KjU, jM6563getSurfaceVariant0d7_KjU, jM6538getOnSurfaceVariant0d7_KjU, j39, jM6525getInverseSurface0d7_KjU, jM6523getInverseOnSurface0d7_KjU, jM6521getError0d7_KjU, jM6527getOnError0d7_KjU, jM6522getErrorContainer0d7_KjU, jM6528getOnErrorContainer0d7_KjU, jM6543getOutline0d7_KjU, jM6544getOutlineVariant0d7_KjU, jM6549getScrim0d7_KjU, jM6555getSurfaceBright0d7_KjU, jM6556getSurfaceContainer0d7_KjU, jM6557getSurfaceContainerHigh0d7_KjU, jM6558getSurfaceContainerHighest0d7_KjU, jM6559getSurfaceContainerLow0d7_KjU, jM6560getSurfaceContainerLowest0d7_KjU, j37);
    }

    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m4596darkColorSchemeG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m4599darkColorScheme_VG5OTI$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4597darkColorSchemeG1PFcw$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        long jM6545getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m6545getPrimary0d7_KjU() : j2;
        long jM6529getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m6529getOnPrimary0d7_KjU() : j3;
        long jM6546getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m6546getPrimaryContainer0d7_KjU() : j4;
        long jM6530getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m6530getOnPrimaryContainer0d7_KjU() : j5;
        long jM6524getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m6524getInversePrimary0d7_KjU() : j6;
        long jM6550getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m6550getSecondary0d7_KjU() : j7;
        long jM6533getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m6533getOnSecondary0d7_KjU() : j8;
        long jM6551getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m6551getSecondaryContainer0d7_KjU() : j9;
        long j31 = jM6545getPrimary0d7_KjU;
        long jM6534getOnSecondaryContainer0d7_KjU = (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m6534getOnSecondaryContainer0d7_KjU() : j10;
        long jM6564getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m6564getTertiary0d7_KjU() : j11;
        long jM6539getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m6539getOnTertiary0d7_KjU() : j12;
        long jM6565getTertiaryContainer0d7_KjU = (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m6565getTertiaryContainer0d7_KjU() : j13;
        long jM6540getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m6540getOnTertiaryContainer0d7_KjU() : j14;
        long jM6520getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m6520getBackground0d7_KjU() : j15;
        long jM6526getOnBackground0d7_KjU = (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m6526getOnBackground0d7_KjU() : j16;
        long jM6554getSurface0d7_KjU = (i2 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m6554getSurface0d7_KjU() : j17;
        long jM6537getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m6537getOnSurface0d7_KjU() : j18;
        long jM6563getSurfaceVariant0d7_KjU = (i2 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m6563getSurfaceVariant0d7_KjU() : j19;
        long jM6538getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m6538getOnSurfaceVariant0d7_KjU() : j20;
        long j32 = (i2 & 524288) != 0 ? j31 : j21;
        long jM6525getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m6525getInverseSurface0d7_KjU() : j22;
        long jM6523getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m6523getInverseOnSurface0d7_KjU() : j23;
        long jM6521getError0d7_KjU = (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m6521getError0d7_KjU() : j24;
        long jM6527getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m6527getOnError0d7_KjU() : j25;
        long jM6522getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m6522getErrorContainer0d7_KjU() : j26;
        long jM6528getOnErrorContainer0d7_KjU = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m6528getOnErrorContainer0d7_KjU() : j27;
        long jM6543getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m6543getOutline0d7_KjU() : j28;
        long jM6544getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m6544getOutlineVariant0d7_KjU() : j29;
        if ((i2 & 268435456) != 0) {
            j30 = ColorDarkTokens.INSTANCE.m6549getScrim0d7_KjU();
        }
        return m4596darkColorSchemeG1PFcw(j31, jM6529getOnPrimary0d7_KjU, jM6546getPrimaryContainer0d7_KjU, jM6530getOnPrimaryContainer0d7_KjU, jM6524getInversePrimary0d7_KjU, jM6550getSecondary0d7_KjU, jM6533getOnSecondary0d7_KjU, jM6551getSecondaryContainer0d7_KjU, jM6534getOnSecondaryContainer0d7_KjU, jM6564getTertiary0d7_KjU, jM6539getOnTertiary0d7_KjU, jM6565getTertiaryContainer0d7_KjU, jM6540getOnTertiaryContainer0d7_KjU, jM6520getBackground0d7_KjU, jM6526getOnBackground0d7_KjU, jM6554getSurface0d7_KjU, jM6537getOnSurface0d7_KjU, jM6563getSurfaceVariant0d7_KjU, jM6538getOnSurfaceVariant0d7_KjU, j32, jM6525getInverseSurface0d7_KjU, jM6523getInverseOnSurface0d7_KjU, jM6521getError0d7_KjU, jM6527getOnError0d7_KjU, jM6522getErrorContainer0d7_KjU, jM6528getOnErrorContainer0d7_KjU, jM6543getOutline0d7_KjU, jM6544getOutlineVariant0d7_KjU, j30);
    }

    /* renamed from: darkColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m4598darkColorScheme_VG5OTI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, null);
    }

    /* renamed from: darkColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4599darkColorScheme_VG5OTI$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, int i2, int i3, Object obj) {
        long jM6545getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m6545getPrimary0d7_KjU() : j2;
        long jM6529getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m6529getOnPrimary0d7_KjU() : j3;
        long jM6546getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m6546getPrimaryContainer0d7_KjU() : j4;
        long jM6530getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m6530getOnPrimaryContainer0d7_KjU() : j5;
        long jM6524getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m6524getInversePrimary0d7_KjU() : j6;
        long jM6550getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m6550getSecondary0d7_KjU() : j7;
        long jM6533getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m6533getOnSecondary0d7_KjU() : j8;
        long j50 = jM6545getPrimary0d7_KjU;
        long jM6551getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m6551getSecondaryContainer0d7_KjU() : j9;
        long jM6534getOnSecondaryContainer0d7_KjU = (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m6534getOnSecondaryContainer0d7_KjU() : j10;
        long jM6564getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m6564getTertiary0d7_KjU() : j11;
        long jM6539getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m6539getOnTertiary0d7_KjU() : j12;
        long jM6565getTertiaryContainer0d7_KjU = (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m6565getTertiaryContainer0d7_KjU() : j13;
        long jM6540getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m6540getOnTertiaryContainer0d7_KjU() : j14;
        long jM6520getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m6520getBackground0d7_KjU() : j15;
        long jM6526getOnBackground0d7_KjU = (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m6526getOnBackground0d7_KjU() : j16;
        long jM6554getSurface0d7_KjU = (i2 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m6554getSurface0d7_KjU() : j17;
        long jM6537getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m6537getOnSurface0d7_KjU() : j18;
        long jM6563getSurfaceVariant0d7_KjU = (i2 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m6563getSurfaceVariant0d7_KjU() : j19;
        long jM6538getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m6538getOnSurfaceVariant0d7_KjU() : j20;
        long j51 = (i2 & 524288) != 0 ? j50 : j21;
        long jM6525getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m6525getInverseSurface0d7_KjU() : j22;
        long jM6523getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m6523getInverseOnSurface0d7_KjU() : j23;
        long jM6521getError0d7_KjU = (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m6521getError0d7_KjU() : j24;
        long jM6527getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m6527getOnError0d7_KjU() : j25;
        long jM6522getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m6522getErrorContainer0d7_KjU() : j26;
        long jM6528getOnErrorContainer0d7_KjU = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m6528getOnErrorContainer0d7_KjU() : j27;
        long jM6543getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m6543getOutline0d7_KjU() : j28;
        long jM6544getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m6544getOutlineVariant0d7_KjU() : j29;
        long jM6549getScrim0d7_KjU = (i2 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m6549getScrim0d7_KjU() : j30;
        long jM6555getSurfaceBright0d7_KjU = (i2 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m6555getSurfaceBright0d7_KjU() : j31;
        long jM6556getSurfaceContainer0d7_KjU = (i2 & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m6556getSurfaceContainer0d7_KjU() : j32;
        long jM6557getSurfaceContainerHigh0d7_KjU = (i2 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m6557getSurfaceContainerHigh0d7_KjU() : j33;
        long jM6558getSurfaceContainerHighest0d7_KjU = (i3 & 1) != 0 ? ColorDarkTokens.INSTANCE.m6558getSurfaceContainerHighest0d7_KjU() : j34;
        long jM6559getSurfaceContainerLow0d7_KjU = (i3 & 2) != 0 ? ColorDarkTokens.INSTANCE.m6559getSurfaceContainerLow0d7_KjU() : j35;
        long jM6560getSurfaceContainerLowest0d7_KjU = (i3 & 4) != 0 ? ColorDarkTokens.INSTANCE.m6560getSurfaceContainerLowest0d7_KjU() : j36;
        long jM6561getSurfaceDim0d7_KjU = (i3 & 8) != 0 ? ColorDarkTokens.INSTANCE.m6561getSurfaceDim0d7_KjU() : j37;
        long jM6547getPrimaryFixed0d7_KjU = (i3 & 16) != 0 ? ColorDarkTokens.INSTANCE.m6547getPrimaryFixed0d7_KjU() : j38;
        long jM6548getPrimaryFixedDim0d7_KjU = (i3 & 32) != 0 ? ColorDarkTokens.INSTANCE.m6548getPrimaryFixedDim0d7_KjU() : j39;
        long jM6531getOnPrimaryFixed0d7_KjU = (i3 & 64) != 0 ? ColorDarkTokens.INSTANCE.m6531getOnPrimaryFixed0d7_KjU() : j40;
        long jM6532getOnPrimaryFixedVariant0d7_KjU = (i3 & 128) != 0 ? ColorDarkTokens.INSTANCE.m6532getOnPrimaryFixedVariant0d7_KjU() : j41;
        long jM6552getSecondaryFixed0d7_KjU = (i3 & 256) != 0 ? ColorDarkTokens.INSTANCE.m6552getSecondaryFixed0d7_KjU() : j42;
        long jM6553getSecondaryFixedDim0d7_KjU = (i3 & 512) != 0 ? ColorDarkTokens.INSTANCE.m6553getSecondaryFixedDim0d7_KjU() : j43;
        long jM6535getOnSecondaryFixed0d7_KjU = (i3 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m6535getOnSecondaryFixed0d7_KjU() : j44;
        long jM6536getOnSecondaryFixedVariant0d7_KjU = (i3 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m6536getOnSecondaryFixedVariant0d7_KjU() : j45;
        long jM6566getTertiaryFixed0d7_KjU = (i3 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m6566getTertiaryFixed0d7_KjU() : j46;
        long jM6567getTertiaryFixedDim0d7_KjU = (i3 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m6567getTertiaryFixedDim0d7_KjU() : j47;
        long jM6541getOnTertiaryFixed0d7_KjU = (i3 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m6541getOnTertiaryFixed0d7_KjU() : j48;
        if ((i3 & 32768) != 0) {
            j49 = ColorDarkTokens.INSTANCE.m6542getOnTertiaryFixedVariant0d7_KjU();
        }
        return m4598darkColorScheme_VG5OTI(j50, jM6529getOnPrimary0d7_KjU, jM6546getPrimaryContainer0d7_KjU, jM6530getOnPrimaryContainer0d7_KjU, jM6524getInversePrimary0d7_KjU, jM6550getSecondary0d7_KjU, jM6533getOnSecondary0d7_KjU, jM6551getSecondaryContainer0d7_KjU, jM6534getOnSecondaryContainer0d7_KjU, jM6564getTertiary0d7_KjU, jM6539getOnTertiary0d7_KjU, jM6565getTertiaryContainer0d7_KjU, jM6540getOnTertiaryContainer0d7_KjU, jM6520getBackground0d7_KjU, jM6526getOnBackground0d7_KjU, jM6554getSurface0d7_KjU, jM6537getOnSurface0d7_KjU, jM6563getSurfaceVariant0d7_KjU, jM6538getOnSurfaceVariant0d7_KjU, j51, jM6525getInverseSurface0d7_KjU, jM6523getInverseOnSurface0d7_KjU, jM6521getError0d7_KjU, jM6527getOnError0d7_KjU, jM6522getErrorContainer0d7_KjU, jM6528getOnErrorContainer0d7_KjU, jM6543getOutline0d7_KjU, jM6544getOutlineVariant0d7_KjU, jM6549getScrim0d7_KjU, jM6555getSurfaceBright0d7_KjU, jM6556getSurfaceContainer0d7_KjU, jM6557getSurfaceContainerHigh0d7_KjU, jM6558getSurfaceContainerHighest0d7_KjU, jM6559getSurfaceContainerLow0d7_KjU, jM6560getSurfaceContainerLowest0d7_KjU, jM6561getSurfaceDim0d7_KjU, jM6547getPrimaryFixed0d7_KjU, jM6548getPrimaryFixedDim0d7_KjU, jM6531getOnPrimaryFixed0d7_KjU, jM6532getOnPrimaryFixedVariant0d7_KjU, jM6552getSecondaryFixed0d7_KjU, jM6553getSecondaryFixedDim0d7_KjU, jM6535getOnSecondaryFixed0d7_KjU, jM6536getOnSecondaryFixedVariant0d7_KjU, jM6566getTertiaryFixed0d7_KjU, jM6567getTertiaryFixedDim0d7_KjU, jM6541getOnTertiaryFixed0d7_KjU, j49);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        return m4605lightColorScheme_VG5OTI$default(0L, 0L, 0L, PaletteTokens.INSTANCE.m6980getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m6993getSecondary300d7_KjU(), 0L, 0L, 0L, PaletteTokens.INSTANCE.m7006getTertiary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m6930getError300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535, null);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Background;
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return colorScheme.m4543getBackground0d7_KjU();
            case 1:
                return colorScheme.m4544getError0d7_KjU();
            case 2:
                return colorScheme.m4545getErrorContainer0d7_KjU();
            case 3:
                return colorScheme.m4546getInverseOnSurface0d7_KjU();
            case 4:
                return colorScheme.m4547getInversePrimary0d7_KjU();
            case 5:
                return colorScheme.m4548getInverseSurface0d7_KjU();
            case 6:
                return colorScheme.m4549getOnBackground0d7_KjU();
            case 7:
                return colorScheme.m4550getOnError0d7_KjU();
            case 8:
                return colorScheme.m4551getOnErrorContainer0d7_KjU();
            case 9:
                return colorScheme.m4552getOnPrimary0d7_KjU();
            case 10:
                return colorScheme.m4553getOnPrimaryContainer0d7_KjU();
            case 11:
                return colorScheme.m4554getOnPrimaryFixed0d7_KjU();
            case 12:
                return colorScheme.m4555getOnPrimaryFixedVariant0d7_KjU();
            case 13:
                return colorScheme.m4556getOnSecondary0d7_KjU();
            case 14:
                return colorScheme.m4557getOnSecondaryContainer0d7_KjU();
            case 15:
                return colorScheme.m4558getOnSecondaryFixed0d7_KjU();
            case 16:
                return colorScheme.m4559getOnSecondaryFixedVariant0d7_KjU();
            case 17:
                return colorScheme.m4560getOnSurface0d7_KjU();
            case 18:
                return colorScheme.m4561getOnSurfaceVariant0d7_KjU();
            case 19:
                return colorScheme.m4562getOnTertiary0d7_KjU();
            case 20:
                return colorScheme.m4563getOnTertiaryContainer0d7_KjU();
            case 21:
                return colorScheme.m4564getOnTertiaryFixed0d7_KjU();
            case 22:
                return colorScheme.m4565getOnTertiaryFixedVariant0d7_KjU();
            case 23:
                return colorScheme.m4566getOutline0d7_KjU();
            case 24:
                return colorScheme.m4567getOutlineVariant0d7_KjU();
            case 25:
                return colorScheme.m4568getPrimary0d7_KjU();
            case 26:
                return colorScheme.m4569getPrimaryContainer0d7_KjU();
            case 27:
                return colorScheme.m4570getPrimaryFixed0d7_KjU();
            case 28:
                return colorScheme.m4571getPrimaryFixedDim0d7_KjU();
            case 29:
                return colorScheme.m4572getScrim0d7_KjU();
            case 30:
                return colorScheme.m4573getSecondary0d7_KjU();
            case 31:
                return colorScheme.m4574getSecondaryContainer0d7_KjU();
            case 32:
                return colorScheme.m4575getSecondaryFixed0d7_KjU();
            case 33:
                return colorScheme.m4576getSecondaryFixedDim0d7_KjU();
            case 34:
                return colorScheme.m4577getSurface0d7_KjU();
            case 35:
                return colorScheme.m4578getSurfaceBright0d7_KjU();
            case 36:
                return colorScheme.m4579getSurfaceContainer0d7_KjU();
            case 37:
                return colorScheme.m4580getSurfaceContainerHigh0d7_KjU();
            case 38:
                return colorScheme.m4581getSurfaceContainerHighest0d7_KjU();
            case 39:
                return colorScheme.m4582getSurfaceContainerLow0d7_KjU();
            case 40:
                return colorScheme.m4583getSurfaceContainerLowest0d7_KjU();
            case 41:
                return colorScheme.m4584getSurfaceDim0d7_KjU();
            case 42:
                return colorScheme.m4585getSurfaceTint0d7_KjU();
            case 43:
                return colorScheme.m4586getSurfaceVariant0d7_KjU();
            case 44:
                return colorScheme.m4587getTertiary0d7_KjU();
            case 45:
                return colorScheme.m4588getTertiaryContainer0d7_KjU();
            case 46:
                return colorScheme.m4589getTertiaryFixed0d7_KjU();
            case 47:
                return colorScheme.m4590getTertiaryFixedDim0d7_KjU();
            default:
                throw new i();
        }
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i2, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1538)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m4600lightColorSchemeCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return m4605lightColorScheme_VG5OTI$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4601lightColorSchemeCXl9yA$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
        long jM6593getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m6593getPrimary0d7_KjU() : j2;
        long jM6577getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m6577getOnPrimary0d7_KjU() : j3;
        long jM6594getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m6594getPrimaryContainer0d7_KjU() : j4;
        long jM6578getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m6578getOnPrimaryContainer0d7_KjU() : j5;
        long jM6572getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m6572getInversePrimary0d7_KjU() : j6;
        long jM6598getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m6598getSecondary0d7_KjU() : j7;
        long jM6581getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m6581getOnSecondary0d7_KjU() : j8;
        long jM6599getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m6599getSecondaryContainer0d7_KjU() : j9;
        long j38 = jM6593getPrimary0d7_KjU;
        long jM6582getOnSecondaryContainer0d7_KjU = (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m6582getOnSecondaryContainer0d7_KjU() : j10;
        long jM6612getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m6612getTertiary0d7_KjU() : j11;
        long jM6587getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m6587getOnTertiary0d7_KjU() : j12;
        long jM6613getTertiaryContainer0d7_KjU = (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m6613getTertiaryContainer0d7_KjU() : j13;
        long jM6588getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m6588getOnTertiaryContainer0d7_KjU() : j14;
        long jM6568getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m6568getBackground0d7_KjU() : j15;
        long jM6574getOnBackground0d7_KjU = (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m6574getOnBackground0d7_KjU() : j16;
        long jM6602getSurface0d7_KjU = (i2 & 32768) != 0 ? ColorLightTokens.INSTANCE.m6602getSurface0d7_KjU() : j17;
        long jM6585getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m6585getOnSurface0d7_KjU() : j18;
        long jM6611getSurfaceVariant0d7_KjU = (i2 & 131072) != 0 ? ColorLightTokens.INSTANCE.m6611getSurfaceVariant0d7_KjU() : j19;
        long jM6586getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m6586getOnSurfaceVariant0d7_KjU() : j20;
        long j39 = (i2 & 524288) != 0 ? j38 : j21;
        long jM6573getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m6573getInverseSurface0d7_KjU() : j22;
        long jM6571getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m6571getInverseOnSurface0d7_KjU() : j23;
        long jM6569getError0d7_KjU = (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m6569getError0d7_KjU() : j24;
        long jM6575getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m6575getOnError0d7_KjU() : j25;
        long jM6570getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m6570getErrorContainer0d7_KjU() : j26;
        long jM6576getOnErrorContainer0d7_KjU = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m6576getOnErrorContainer0d7_KjU() : j27;
        long jM6591getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m6591getOutline0d7_KjU() : j28;
        long jM6592getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m6592getOutlineVariant0d7_KjU() : j29;
        long jM6597getScrim0d7_KjU = (i2 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m6597getScrim0d7_KjU() : j30;
        long jM6603getSurfaceBright0d7_KjU = (i2 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m6603getSurfaceBright0d7_KjU() : j31;
        long jM6604getSurfaceContainer0d7_KjU = (i2 & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m6604getSurfaceContainer0d7_KjU() : j32;
        long jM6605getSurfaceContainerHigh0d7_KjU = (i2 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m6605getSurfaceContainerHigh0d7_KjU() : j33;
        long jM6606getSurfaceContainerHighest0d7_KjU = (i3 & 1) != 0 ? ColorLightTokens.INSTANCE.m6606getSurfaceContainerHighest0d7_KjU() : j34;
        long jM6607getSurfaceContainerLow0d7_KjU = (i3 & 2) != 0 ? ColorLightTokens.INSTANCE.m6607getSurfaceContainerLow0d7_KjU() : j35;
        long jM6608getSurfaceContainerLowest0d7_KjU = (i3 & 4) != 0 ? ColorLightTokens.INSTANCE.m6608getSurfaceContainerLowest0d7_KjU() : j36;
        if ((i3 & 8) != 0) {
            j37 = ColorLightTokens.INSTANCE.m6609getSurfaceDim0d7_KjU();
        }
        return m4600lightColorSchemeCXl9yA(j38, jM6577getOnPrimary0d7_KjU, jM6594getPrimaryContainer0d7_KjU, jM6578getOnPrimaryContainer0d7_KjU, jM6572getInversePrimary0d7_KjU, jM6598getSecondary0d7_KjU, jM6581getOnSecondary0d7_KjU, jM6599getSecondaryContainer0d7_KjU, jM6582getOnSecondaryContainer0d7_KjU, jM6612getTertiary0d7_KjU, jM6587getOnTertiary0d7_KjU, jM6613getTertiaryContainer0d7_KjU, jM6588getOnTertiaryContainer0d7_KjU, jM6568getBackground0d7_KjU, jM6574getOnBackground0d7_KjU, jM6602getSurface0d7_KjU, jM6585getOnSurface0d7_KjU, jM6611getSurfaceVariant0d7_KjU, jM6586getOnSurfaceVariant0d7_KjU, j39, jM6573getInverseSurface0d7_KjU, jM6571getInverseOnSurface0d7_KjU, jM6569getError0d7_KjU, jM6575getOnError0d7_KjU, jM6570getErrorContainer0d7_KjU, jM6576getOnErrorContainer0d7_KjU, jM6591getOutline0d7_KjU, jM6592getOutlineVariant0d7_KjU, jM6597getScrim0d7_KjU, jM6603getSurfaceBright0d7_KjU, jM6604getSurfaceContainer0d7_KjU, jM6605getSurfaceContainerHigh0d7_KjU, jM6606getSurfaceContainerHighest0d7_KjU, jM6607getSurfaceContainerLow0d7_KjU, jM6608getSurfaceContainerLowest0d7_KjU, j37);
    }

    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m4602lightColorSchemeG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m4605lightColorScheme_VG5OTI$default(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4603lightColorSchemeG1PFcw$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
        long jM6593getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m6593getPrimary0d7_KjU() : j2;
        long jM6577getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m6577getOnPrimary0d7_KjU() : j3;
        long jM6594getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m6594getPrimaryContainer0d7_KjU() : j4;
        long jM6578getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m6578getOnPrimaryContainer0d7_KjU() : j5;
        long jM6572getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m6572getInversePrimary0d7_KjU() : j6;
        long jM6598getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m6598getSecondary0d7_KjU() : j7;
        long jM6581getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m6581getOnSecondary0d7_KjU() : j8;
        long jM6599getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m6599getSecondaryContainer0d7_KjU() : j9;
        long j31 = jM6593getPrimary0d7_KjU;
        long jM6582getOnSecondaryContainer0d7_KjU = (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m6582getOnSecondaryContainer0d7_KjU() : j10;
        long jM6612getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m6612getTertiary0d7_KjU() : j11;
        long jM6587getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m6587getOnTertiary0d7_KjU() : j12;
        long jM6613getTertiaryContainer0d7_KjU = (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m6613getTertiaryContainer0d7_KjU() : j13;
        long jM6588getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m6588getOnTertiaryContainer0d7_KjU() : j14;
        long jM6568getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m6568getBackground0d7_KjU() : j15;
        long jM6574getOnBackground0d7_KjU = (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m6574getOnBackground0d7_KjU() : j16;
        long jM6602getSurface0d7_KjU = (i2 & 32768) != 0 ? ColorLightTokens.INSTANCE.m6602getSurface0d7_KjU() : j17;
        long jM6585getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m6585getOnSurface0d7_KjU() : j18;
        long jM6611getSurfaceVariant0d7_KjU = (i2 & 131072) != 0 ? ColorLightTokens.INSTANCE.m6611getSurfaceVariant0d7_KjU() : j19;
        long jM6586getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m6586getOnSurfaceVariant0d7_KjU() : j20;
        long j32 = (i2 & 524288) != 0 ? j31 : j21;
        long jM6573getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m6573getInverseSurface0d7_KjU() : j22;
        long jM6571getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m6571getInverseOnSurface0d7_KjU() : j23;
        long jM6569getError0d7_KjU = (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m6569getError0d7_KjU() : j24;
        long jM6575getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m6575getOnError0d7_KjU() : j25;
        long jM6570getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m6570getErrorContainer0d7_KjU() : j26;
        long jM6576getOnErrorContainer0d7_KjU = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m6576getOnErrorContainer0d7_KjU() : j27;
        long jM6591getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m6591getOutline0d7_KjU() : j28;
        long jM6592getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m6592getOutlineVariant0d7_KjU() : j29;
        if ((i2 & 268435456) != 0) {
            j30 = ColorLightTokens.INSTANCE.m6597getScrim0d7_KjU();
        }
        return m4602lightColorSchemeG1PFcw(j31, jM6577getOnPrimary0d7_KjU, jM6594getPrimaryContainer0d7_KjU, jM6578getOnPrimaryContainer0d7_KjU, jM6572getInversePrimary0d7_KjU, jM6598getSecondary0d7_KjU, jM6581getOnSecondary0d7_KjU, jM6599getSecondaryContainer0d7_KjU, jM6582getOnSecondaryContainer0d7_KjU, jM6612getTertiary0d7_KjU, jM6587getOnTertiary0d7_KjU, jM6613getTertiaryContainer0d7_KjU, jM6588getOnTertiaryContainer0d7_KjU, jM6568getBackground0d7_KjU, jM6574getOnBackground0d7_KjU, jM6602getSurface0d7_KjU, jM6585getOnSurface0d7_KjU, jM6611getSurfaceVariant0d7_KjU, jM6586getOnSurfaceVariant0d7_KjU, j32, jM6573getInverseSurface0d7_KjU, jM6571getInverseOnSurface0d7_KjU, jM6569getError0d7_KjU, jM6575getOnError0d7_KjU, jM6570getErrorContainer0d7_KjU, jM6576getOnErrorContainer0d7_KjU, jM6591getOutline0d7_KjU, jM6592getOutlineVariant0d7_KjU, j30);
    }

    /* renamed from: lightColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m4604lightColorScheme_VG5OTI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j37, j32, j33, j34, j35, j36, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, null);
    }

    /* renamed from: lightColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4605lightColorScheme_VG5OTI$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, int i2, int i3, Object obj) {
        long jM6593getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m6593getPrimary0d7_KjU() : j2;
        long jM6577getOnPrimary0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m6577getOnPrimary0d7_KjU() : j3;
        long jM6594getPrimaryContainer0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m6594getPrimaryContainer0d7_KjU() : j4;
        long jM6578getOnPrimaryContainer0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m6578getOnPrimaryContainer0d7_KjU() : j5;
        long jM6572getInversePrimary0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m6572getInversePrimary0d7_KjU() : j6;
        long jM6598getSecondary0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m6598getSecondary0d7_KjU() : j7;
        long jM6581getOnSecondary0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m6581getOnSecondary0d7_KjU() : j8;
        long j50 = jM6593getPrimary0d7_KjU;
        long jM6599getSecondaryContainer0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m6599getSecondaryContainer0d7_KjU() : j9;
        long jM6582getOnSecondaryContainer0d7_KjU = (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m6582getOnSecondaryContainer0d7_KjU() : j10;
        long jM6612getTertiary0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m6612getTertiary0d7_KjU() : j11;
        long jM6587getOnTertiary0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m6587getOnTertiary0d7_KjU() : j12;
        long jM6613getTertiaryContainer0d7_KjU = (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m6613getTertiaryContainer0d7_KjU() : j13;
        long jM6588getOnTertiaryContainer0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m6588getOnTertiaryContainer0d7_KjU() : j14;
        long jM6568getBackground0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m6568getBackground0d7_KjU() : j15;
        long jM6574getOnBackground0d7_KjU = (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m6574getOnBackground0d7_KjU() : j16;
        long jM6602getSurface0d7_KjU = (i2 & 32768) != 0 ? ColorLightTokens.INSTANCE.m6602getSurface0d7_KjU() : j17;
        long jM6585getOnSurface0d7_KjU = (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m6585getOnSurface0d7_KjU() : j18;
        long jM6611getSurfaceVariant0d7_KjU = (i2 & 131072) != 0 ? ColorLightTokens.INSTANCE.m6611getSurfaceVariant0d7_KjU() : j19;
        long jM6586getOnSurfaceVariant0d7_KjU = (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m6586getOnSurfaceVariant0d7_KjU() : j20;
        long j51 = (i2 & 524288) != 0 ? j50 : j21;
        long jM6573getInverseSurface0d7_KjU = (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m6573getInverseSurface0d7_KjU() : j22;
        long jM6571getInverseOnSurface0d7_KjU = (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m6571getInverseOnSurface0d7_KjU() : j23;
        long jM6569getError0d7_KjU = (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m6569getError0d7_KjU() : j24;
        long jM6575getOnError0d7_KjU = (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m6575getOnError0d7_KjU() : j25;
        long jM6570getErrorContainer0d7_KjU = (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m6570getErrorContainer0d7_KjU() : j26;
        long jM6576getOnErrorContainer0d7_KjU = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m6576getOnErrorContainer0d7_KjU() : j27;
        long jM6591getOutline0d7_KjU = (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m6591getOutline0d7_KjU() : j28;
        long jM6592getOutlineVariant0d7_KjU = (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m6592getOutlineVariant0d7_KjU() : j29;
        long jM6597getScrim0d7_KjU = (i2 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m6597getScrim0d7_KjU() : j30;
        long jM6603getSurfaceBright0d7_KjU = (i2 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m6603getSurfaceBright0d7_KjU() : j31;
        long jM6604getSurfaceContainer0d7_KjU = (i2 & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m6604getSurfaceContainer0d7_KjU() : j32;
        long jM6605getSurfaceContainerHigh0d7_KjU = (i2 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m6605getSurfaceContainerHigh0d7_KjU() : j33;
        long jM6606getSurfaceContainerHighest0d7_KjU = (i3 & 1) != 0 ? ColorLightTokens.INSTANCE.m6606getSurfaceContainerHighest0d7_KjU() : j34;
        long jM6607getSurfaceContainerLow0d7_KjU = (i3 & 2) != 0 ? ColorLightTokens.INSTANCE.m6607getSurfaceContainerLow0d7_KjU() : j35;
        long jM6608getSurfaceContainerLowest0d7_KjU = (i3 & 4) != 0 ? ColorLightTokens.INSTANCE.m6608getSurfaceContainerLowest0d7_KjU() : j36;
        long jM6609getSurfaceDim0d7_KjU = (i3 & 8) != 0 ? ColorLightTokens.INSTANCE.m6609getSurfaceDim0d7_KjU() : j37;
        long jM6595getPrimaryFixed0d7_KjU = (i3 & 16) != 0 ? ColorLightTokens.INSTANCE.m6595getPrimaryFixed0d7_KjU() : j38;
        long jM6596getPrimaryFixedDim0d7_KjU = (i3 & 32) != 0 ? ColorLightTokens.INSTANCE.m6596getPrimaryFixedDim0d7_KjU() : j39;
        long jM6579getOnPrimaryFixed0d7_KjU = (i3 & 64) != 0 ? ColorLightTokens.INSTANCE.m6579getOnPrimaryFixed0d7_KjU() : j40;
        long jM6580getOnPrimaryFixedVariant0d7_KjU = (i3 & 128) != 0 ? ColorLightTokens.INSTANCE.m6580getOnPrimaryFixedVariant0d7_KjU() : j41;
        long jM6600getSecondaryFixed0d7_KjU = (i3 & 256) != 0 ? ColorLightTokens.INSTANCE.m6600getSecondaryFixed0d7_KjU() : j42;
        long jM6601getSecondaryFixedDim0d7_KjU = (i3 & 512) != 0 ? ColorLightTokens.INSTANCE.m6601getSecondaryFixedDim0d7_KjU() : j43;
        long jM6583getOnSecondaryFixed0d7_KjU = (i3 & 1024) != 0 ? ColorLightTokens.INSTANCE.m6583getOnSecondaryFixed0d7_KjU() : j44;
        long jM6584getOnSecondaryFixedVariant0d7_KjU = (i3 & 2048) != 0 ? ColorLightTokens.INSTANCE.m6584getOnSecondaryFixedVariant0d7_KjU() : j45;
        long jM6614getTertiaryFixed0d7_KjU = (i3 & 4096) != 0 ? ColorLightTokens.INSTANCE.m6614getTertiaryFixed0d7_KjU() : j46;
        long jM6615getTertiaryFixedDim0d7_KjU = (i3 & 8192) != 0 ? ColorLightTokens.INSTANCE.m6615getTertiaryFixedDim0d7_KjU() : j47;
        long jM6589getOnTertiaryFixed0d7_KjU = (i3 & 16384) != 0 ? ColorLightTokens.INSTANCE.m6589getOnTertiaryFixed0d7_KjU() : j48;
        if ((i3 & 32768) != 0) {
            j49 = ColorLightTokens.INSTANCE.m6590getOnTertiaryFixedVariant0d7_KjU();
        }
        return m4604lightColorScheme_VG5OTI(j50, jM6577getOnPrimary0d7_KjU, jM6594getPrimaryContainer0d7_KjU, jM6578getOnPrimaryContainer0d7_KjU, jM6572getInversePrimary0d7_KjU, jM6598getSecondary0d7_KjU, jM6581getOnSecondary0d7_KjU, jM6599getSecondaryContainer0d7_KjU, jM6582getOnSecondaryContainer0d7_KjU, jM6612getTertiary0d7_KjU, jM6587getOnTertiary0d7_KjU, jM6613getTertiaryContainer0d7_KjU, jM6588getOnTertiaryContainer0d7_KjU, jM6568getBackground0d7_KjU, jM6574getOnBackground0d7_KjU, jM6602getSurface0d7_KjU, jM6585getOnSurface0d7_KjU, jM6611getSurfaceVariant0d7_KjU, jM6586getOnSurfaceVariant0d7_KjU, j51, jM6573getInverseSurface0d7_KjU, jM6571getInverseOnSurface0d7_KjU, jM6569getError0d7_KjU, jM6575getOnError0d7_KjU, jM6570getErrorContainer0d7_KjU, jM6576getOnErrorContainer0d7_KjU, jM6591getOutline0d7_KjU, jM6592getOutlineVariant0d7_KjU, jM6597getScrim0d7_KjU, jM6603getSurfaceBright0d7_KjU, jM6604getSurfaceContainer0d7_KjU, jM6605getSurfaceContainerHigh0d7_KjU, jM6606getSurfaceContainerHighest0d7_KjU, jM6607getSurfaceContainerLow0d7_KjU, jM6608getSurfaceContainerLowest0d7_KjU, jM6609getSurfaceDim0d7_KjU, jM6595getPrimaryFixed0d7_KjU, jM6596getPrimaryFixedDim0d7_KjU, jM6579getOnPrimaryFixed0d7_KjU, jM6580getOnPrimaryFixedVariant0d7_KjU, jM6600getSecondaryFixed0d7_KjU, jM6601getSecondaryFixedDim0d7_KjU, jM6583getOnSecondaryFixed0d7_KjU, jM6584getOnSecondaryFixedVariant0d7_KjU, jM6614getTertiaryFixed0d7_KjU, jM6615getTertiaryFixedDim0d7_KjU, jM6589getOnTertiaryFixed0d7_KjU, j49);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m4606surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f2) {
        if (Dp.m11169equalsimpl0(f2, 0.0f)) {
            return colorScheme.m4577getSurface0d7_KjU();
        }
        return ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(colorScheme.m4585getSurfaceTint0d7_KjU(), ((((float) Math.log(f2 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU());
    }
}
