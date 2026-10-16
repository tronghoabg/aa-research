package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import h.g.b.o;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CheckboxColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledCheckmarkColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.checkedCheckmarkColor = j2;
        this.uncheckedCheckmarkColor = j3;
        this.checkedBoxColor = j4;
        this.uncheckedBoxColor = j5;
        this.disabledCheckedBoxColor = j6;
        this.disabledUncheckedBoxColor = j7;
        this.disabledIndeterminateBoxColor = j8;
        this.checkedBorderColor = j9;
        this.uncheckedBorderColor = j10;
        this.disabledBorderColor = j11;
        this.disabledUncheckedBorderColor = j12;
        this.disabledIndeterminateBorderColor = j13;
        this.disabledCheckmarkColor = j14;
    }

    private final AnimationSpec<Color> colorAnimationSpecForState(ToggleableState toggleableState, Composer composer, int i2) {
        FiniteAnimationSpec finiteAnimationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1075456245, i2, -1, "androidx.compose.material3.CheckboxColors.colorAnimationSpecForState (Checkbox.kt:905)");
        }
        if (toggleableState == ToggleableState.Off) {
            composer.startReplaceGroup(1539238463);
            FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
            composer.endReplaceGroup();
            finiteAnimationSpec = finiteAnimationSpecValue;
        } else {
            composer.startReplaceGroup(1539331773);
            FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
            composer.endReplaceGroup();
            finiteAnimationSpec = finiteAnimationSpecValue2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return finiteAnimationSpec;
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m4471copy2qZNXz8$default(CheckboxColors checkboxColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long j14;
        long j15;
        long j16 = (i2 & 1) != 0 ? checkboxColors.checkedCheckmarkColor : j2;
        long j17 = (i2 & 2) != 0 ? checkboxColors.uncheckedCheckmarkColor : j3;
        long j18 = (i2 & 4) != 0 ? checkboxColors.checkedBoxColor : j4;
        long j19 = (i2 & 8) != 0 ? checkboxColors.uncheckedBoxColor : j5;
        long j20 = (i2 & 16) != 0 ? checkboxColors.disabledCheckedBoxColor : j6;
        long j21 = (i2 & 32) != 0 ? checkboxColors.disabledUncheckedBoxColor : j7;
        long j22 = (i2 & 64) != 0 ? checkboxColors.disabledIndeterminateBoxColor : j8;
        long j23 = j16;
        long j24 = (i2 & 128) != 0 ? checkboxColors.checkedBorderColor : j9;
        long j25 = (i2 & 256) != 0 ? checkboxColors.uncheckedBorderColor : j10;
        long j26 = (i2 & 512) != 0 ? checkboxColors.disabledBorderColor : j11;
        long j27 = (i2 & 1024) != 0 ? checkboxColors.disabledUncheckedBorderColor : j12;
        if ((i2 & 2048) != 0) {
            j15 = j27;
            j14 = checkboxColors.disabledIndeterminateBorderColor;
        } else {
            j14 = j13;
            j15 = j27;
        }
        return checkboxColors.m4473copy2qZNXz8(j23, j17, j18, j19, j20, j21, j22, j24, j25, j26, j15, j14);
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m4472copydaRQuJA$default(CheckboxColors checkboxColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i2, Object obj) {
        long j15;
        long j16;
        long j17 = (i2 & 1) != 0 ? checkboxColors.checkedCheckmarkColor : j2;
        long j18 = (i2 & 2) != 0 ? checkboxColors.uncheckedCheckmarkColor : j3;
        long j19 = (i2 & 4) != 0 ? checkboxColors.checkedBoxColor : j4;
        long j20 = (i2 & 8) != 0 ? checkboxColors.uncheckedBoxColor : j5;
        long j21 = (i2 & 16) != 0 ? checkboxColors.disabledCheckedBoxColor : j6;
        long j22 = (i2 & 32) != 0 ? checkboxColors.disabledUncheckedBoxColor : j7;
        long j23 = (i2 & 64) != 0 ? checkboxColors.disabledIndeterminateBoxColor : j8;
        long j24 = j17;
        long j25 = (i2 & 128) != 0 ? checkboxColors.checkedBorderColor : j9;
        long j26 = (i2 & 256) != 0 ? checkboxColors.uncheckedBorderColor : j10;
        long j27 = (i2 & 512) != 0 ? checkboxColors.disabledBorderColor : j11;
        long j28 = (i2 & 1024) != 0 ? checkboxColors.disabledUncheckedBorderColor : j12;
        long j29 = (i2 & 2048) != 0 ? checkboxColors.disabledIndeterminateBorderColor : j13;
        if ((i2 & 4096) != 0) {
            j16 = j29;
            j15 = checkboxColors.disabledCheckmarkColor;
        } else {
            j15 = j14;
            j16 = j29;
        }
        return checkboxColors.m4474copydaRQuJA(j24, j18, j19, j20, j21, j22, j23, j25, j26, j27, j28, j16, j15);
    }

    public final State<Color> borderColor$material3(boolean z, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i2, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:878)");
        }
        if (z) {
            ToggleableState toggleableState2 = ToggleableState.On;
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j2 = this.checkedBorderColor;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new i();
                }
                j2 = this.checkedBorderColor;
            } else {
                j2 = this.uncheckedBorderColor;
            }
        } else {
            ToggleableState toggleableState3 = ToggleableState.On;
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0) {
                j2 = this.disabledBorderColor;
            } else if (iOrdinal2 == 1) {
                j2 = this.disabledUncheckedBorderColor;
            } else {
                if (iOrdinal2 != 2) {
                    throw new i();
                }
                j2 = this.disabledIndeterminateBorderColor;
            }
        }
        long j3 = j2;
        if (z) {
            composer.startReplaceGroup(633206758);
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(j3, colorAnimationSpecForState(toggleableState, composer, (i2 >> 3) & 126), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(633296968);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j3), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    public final State<Color> boxColor$material3(boolean z, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i2, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:846)");
        }
        if (z) {
            ToggleableState toggleableState2 = ToggleableState.On;
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j2 = this.checkedBoxColor;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new i();
                }
                j2 = this.checkedBoxColor;
            } else {
                j2 = this.uncheckedBoxColor;
            }
        } else {
            ToggleableState toggleableState3 = ToggleableState.On;
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0) {
                j2 = this.disabledCheckedBoxColor;
            } else if (iOrdinal2 == 1) {
                j2 = this.disabledUncheckedBoxColor;
            } else {
                if (iOrdinal2 != 2) {
                    throw new i();
                }
                j2 = this.disabledIndeterminateBoxColor;
            }
        }
        long j3 = j2;
        if (z) {
            composer.startReplaceGroup(496026915);
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(j3, colorAnimationSpecForState(toggleableState, composer, (i2 >> 3) & 126), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(496117125);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j3), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    public final State<Color> checkmarkColor$material3(boolean z, ToggleableState toggleableState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1811183725, i2, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:807)");
        }
        State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(z ? toggleableState == ToggleableState.Off ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor : this.disabledCheckmarkColor, colorAnimationSpecForState(toggleableState, composer, (i2 >> 3) & 126), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM1834animateColorAsStateeuL9pac;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final /* synthetic */ CheckboxColors m4473copy2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        if (j2 != 16) {
            j15 = j2;
            j14 = j15;
        } else {
            j14 = this.checkedCheckmarkColor;
            j15 = 16;
        }
        long j18 = j3 != 16 ? j3 : this.uncheckedCheckmarkColor;
        long j19 = j4 != 16 ? j4 : this.checkedBoxColor;
        long j20 = j5 != 16 ? j5 : this.uncheckedBoxColor;
        long j21 = j6 != 16 ? j6 : this.disabledCheckedBoxColor;
        long j22 = j7 != 16 ? j7 : this.disabledUncheckedBoxColor;
        if (j8 != 16) {
            j17 = j8;
            j16 = j22;
        } else {
            j16 = j22;
            j17 = this.disabledIndeterminateBoxColor;
        }
        long j23 = j9 != 16 ? j9 : this.checkedBorderColor;
        long j24 = j10 != 16 ? j10 : this.uncheckedBorderColor;
        long j25 = j11 != 16 ? j11 : this.disabledBorderColor;
        long j26 = j12 != 16 ? j12 : this.disabledUncheckedBorderColor;
        long j27 = j13 != 16 ? j13 : this.disabledIndeterminateBorderColor;
        if (j15 == 16) {
            j15 = this.checkedCheckmarkColor;
        }
        return new CheckboxColors(j14, j18, j19, j20, j21, j16, j17, j23, j24, j25, j26, j27, j15, null);
    }

    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final CheckboxColors m4474copydaRQuJA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        return new CheckboxColors(j2 != 16 ? j2 : this.checkedCheckmarkColor, j3 != 16 ? j3 : this.uncheckedCheckmarkColor, j4 != 16 ? j4 : this.checkedBoxColor, j5 != 16 ? j5 : this.uncheckedBoxColor, j6 != 16 ? j6 : this.disabledCheckedBoxColor, j7 != 16 ? j7 : this.disabledUncheckedBoxColor, j8 != 16 ? j8 : this.disabledIndeterminateBoxColor, j9 != 16 ? j9 : this.checkedBorderColor, j10 != 16 ? j10 : this.uncheckedBorderColor, j11 != 16 ? j11 : this.disabledBorderColor, j12 != 16 ? j12 : this.disabledUncheckedBorderColor, j13 != 16 ? j13 : this.disabledIndeterminateBorderColor, j14 != 16 ? j14 : this.disabledCheckmarkColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.m8229equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m8229equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m8229equalsimpl0(this.disabledCheckmarkColor, checkboxColors.disabledCheckmarkColor) && Color.m8229equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m8229equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m8229equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m8229equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m8229equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m8229equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m8229equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m8229equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m8229equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m8229equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m4475getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m4476getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* renamed from: getCheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m4477getCheckedCheckmarkColor0d7_KjU() {
        return this.checkedCheckmarkColor;
    }

    /* renamed from: getDisabledBorderColor-0d7_KjU, reason: not valid java name */
    public final long m4478getDisabledBorderColor0d7_KjU() {
        return this.disabledBorderColor;
    }

    /* renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m4479getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* renamed from: getDisabledCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m4480getDisabledCheckmarkColor0d7_KjU() {
        return this.disabledCheckmarkColor;
    }

    /* renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m4481getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m4482getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m4483getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m4484getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m4485getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m4486getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    /* renamed from: getUncheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m4487getUncheckedCheckmarkColor0d7_KjU() {
        return this.uncheckedCheckmarkColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.checkedCheckmarkColor);
        long j2 = this.disabledIndeterminateBorderColor;
        long j3 = this.disabledUncheckedBorderColor;
        long j4 = this.disabledBorderColor;
        long j5 = this.uncheckedBorderColor;
        long j6 = this.checkedBorderColor;
        long j7 = this.disabledIndeterminateBoxColor;
        long j8 = this.disabledUncheckedBoxColor;
        long j9 = this.disabledCheckedBoxColor;
        long j10 = this.uncheckedBoxColor;
        long j11 = this.checkedBoxColor;
        return (((((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m8235hashCodeimpl(this.disabledCheckmarkColor)) * 31) + Color.m8235hashCodeimpl(j11)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: indicatorColor-vNxB06k$material3, reason: not valid java name */
    public final long m4488indicatorColorvNxB06k$material3(ToggleableState toggleableState) {
        return toggleableState == ToggleableState.Off ? this.uncheckedBoxColor : this.checkedBoxColor;
    }

    public /* synthetic */ CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    public /* synthetic */ CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    private CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j2, null);
    }

    public final State<Color> checkmarkColor$material3(ToggleableState toggleableState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i2, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:827)");
        }
        State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(toggleableState == ToggleableState.Off ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, colorAnimationSpecForState(toggleableState, composer, i2 & 126), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM1834animateColorAsStateeuL9pac;
    }
}
