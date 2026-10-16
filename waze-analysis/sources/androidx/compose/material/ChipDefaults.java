package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = 32.0f;
    private static final float OutlinedBorderSize = 1.0f;
    private static final float LeadingIconSize = 20.0f;
    private static final float SelectedIconSize = 18.0f;

    private ChipDefaults() {
    }

    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m4006chipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8227copywmQWz5c$default;
        long jM8273compositeOverOWjLjI = (i3 & 1) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU()) : j2;
        long jM8227copywmQWz5c$default2 = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8227copywmQWz5c$default3 = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM8273compositeOverOWjLjI2 = (i3 & 8) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU()) : j5;
        if ((i3 & 16) != 0) {
            long j9 = jM8227copywmQWz5c$default2;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j9;
        } else {
            j8 = jM8227copywmQWz5c$default2;
            jM8227copywmQWz5c$default = j6;
        }
        long jM8227copywmQWz5c$default4 = (i3 & 32) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i2, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:389)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(jM8273compositeOverOWjLjI, j8, jM8227copywmQWz5c$default3, jM8273compositeOverOWjLjI2, jM8227copywmQWz5c$default, jM8227copywmQWz5c$default4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultChipColors;
    }

    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m4007filterChipColorsJ08w3E(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i2, int i3) {
        long j11;
        long jM8227copywmQWz5c$default;
        long j12;
        long jM8227copywmQWz5c$default2;
        long j13;
        long jM8273compositeOverOWjLjI;
        long j14;
        long jM8273compositeOverOWjLjI2;
        long j15;
        long jM8273compositeOverOWjLjI3 = (i3 & 1) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU()) : j2;
        long jM8227copywmQWz5c$default3 = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8227copywmQWz5c$default4 = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM8273compositeOverOWjLjI4 = (i3 & 8) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU()) : j5;
        if ((i3 & 16) != 0) {
            long j16 = jM8227copywmQWz5c$default3;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j11 = j16;
        } else {
            j11 = jM8227copywmQWz5c$default3;
            jM8227copywmQWz5c$default = j6;
        }
        if ((i3 & 32) != 0) {
            long j17 = jM8227copywmQWz5c$default4;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j17, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j12 = j17;
        } else {
            j12 = jM8227copywmQWz5c$default4;
            jM8227copywmQWz5c$default2 = j7;
        }
        if ((i3 & 64) != 0) {
            j13 = jM8227copywmQWz5c$default2;
            jM8273compositeOverOWjLjI = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM8273compositeOverOWjLjI3);
        } else {
            j13 = jM8227copywmQWz5c$default2;
            jM8273compositeOverOWjLjI = j8;
        }
        if ((i3 & 128) != 0) {
            j14 = jM8273compositeOverOWjLjI3;
            jM8273compositeOverOWjLjI2 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j11);
        } else {
            j14 = jM8273compositeOverOWjLjI3;
            jM8273compositeOverOWjLjI2 = j9;
        }
        long jM8273compositeOverOWjLjI5 = (i3 & 256) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j12) : j10;
        if (ComposerKt.isTraceInProgress()) {
            j15 = jM8273compositeOverOWjLjI5;
            ComposerKt.traceEventStart(830140629, i2, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:474)");
        } else {
            j15 = jM8273compositeOverOWjLjI5;
        }
        long j18 = jM8273compositeOverOWjLjI4;
        long j19 = j11;
        long j20 = j12;
        long j21 = j14;
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j21, j19, j20, j18, jM8227copywmQWz5c$default, j13, jM8273compositeOverOWjLjI, jM8273compositeOverOWjLjI2, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSelectableChipColors;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4008getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m4009getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i2, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:539)");
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(OutlinedBorderSize, Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m4010getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4011getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m4012outlinedChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM4031getSurface0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j2;
        long jM8227copywmQWz5c$default = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8227copywmQWz5c$default2 = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long j8 = (i3 & 8) != 0 ? jM4031getSurface0d7_KjU : j5;
        long jM8227copywmQWz5c$default3 = (i3 & 16) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM8227copywmQWz5c$default4 = (i3 & 32) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i2, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:422)");
        }
        ChipColors chipColorsM4006chipColors5tl4gsc = m4006chipColors5tl4gsc(jM4031getSurface0d7_KjU, jM8227copywmQWz5c$default, jM8227copywmQWz5c$default2, j8, jM8227copywmQWz5c$default3, jM8227copywmQWz5c$default4, composer, i2 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM4006chipColors5tl4gsc;
    }

    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m4013outlinedFilterChipColorsJ08w3E(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i2, int i3) {
        long j11;
        long jM8227copywmQWz5c$default;
        long j12;
        long jM8227copywmQWz5c$default2;
        long j13;
        long jM8273compositeOverOWjLjI;
        long j14;
        long jM8273compositeOverOWjLjI2;
        long j15;
        long jM4031getSurface0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j2;
        long jM8227copywmQWz5c$default3 = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8227copywmQWz5c$default4 = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long j16 = (i3 & 8) != 0 ? jM4031getSurface0d7_KjU : j5;
        if ((i3 & 16) != 0) {
            long j17 = jM8227copywmQWz5c$default3;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j17, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j11 = j17;
        } else {
            j11 = jM8227copywmQWz5c$default3;
            jM8227copywmQWz5c$default = j6;
        }
        if ((i3 & 32) != 0) {
            long j18 = jM8227copywmQWz5c$default4;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j18, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j12 = j18;
        } else {
            j12 = jM8227copywmQWz5c$default4;
            jM8227copywmQWz5c$default2 = j7;
        }
        if ((i3 & 64) != 0) {
            j13 = jM8227copywmQWz5c$default2;
            jM8273compositeOverOWjLjI = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM4031getSurface0d7_KjU);
        } else {
            j13 = jM8227copywmQWz5c$default2;
            jM8273compositeOverOWjLjI = j8;
        }
        if ((i3 & 128) != 0) {
            j14 = jM4031getSurface0d7_KjU;
            jM8273compositeOverOWjLjI2 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j11);
        } else {
            j14 = jM4031getSurface0d7_KjU;
            jM8273compositeOverOWjLjI2 = j9;
        }
        long jM8273compositeOverOWjLjI3 = (i3 & 256) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j12) : j10;
        if (ComposerKt.isTraceInProgress()) {
            j15 = jM8273compositeOverOWjLjI3;
            ComposerKt.traceEventStart(346878099, i2, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:523)");
        } else {
            j15 = jM8273compositeOverOWjLjI3;
        }
        long j19 = j16;
        long j20 = j11;
        long j21 = j12;
        long j22 = j14;
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j22, j20, j21, j19, jM8227copywmQWz5c$default, j13, jM8273compositeOverOWjLjI, jM8273compositeOverOWjLjI2, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSelectableChipColors;
    }
}
