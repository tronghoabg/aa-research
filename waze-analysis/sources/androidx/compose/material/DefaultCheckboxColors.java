package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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
final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: WazeSource */
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

    private DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
        this.disabledIndeterminateBorderColor = j12;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> borderColor(boolean z, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        Composer composer2;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i2, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:445)");
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
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                j2 = this.disabledBorderColor;
            } else {
                if (iOrdinal2 != 2) {
                    throw new i();
                }
                j2 = this.disabledIndeterminateBorderColor;
            }
        }
        long j3 = j2;
        if (z) {
            composer.startReplaceGroup(-1801897268);
            composer2 = composer;
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(j3, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-1801716724);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j3), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> boxColor(boolean z, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        Composer composer2;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i2, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:418)");
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
            composer.startReplaceGroup(-1260886423);
            composer2 = composer;
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(j3, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-1260705879);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j3), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> checkmarkColor(ToggleableState toggleableState, Composer composer, int i2) {
        composer.startReplaceGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i2, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:405)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(toggleableState == toggleableState2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, AnimationSpecKt.tween$default(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateM1834animateColorAsStateeuL9pac;
    }

    public /* synthetic */ DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }
}
