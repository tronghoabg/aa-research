package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    private DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors) {
        this.containerColor = j2;
        this.titleContentColor = j3;
        this.headlineContentColor = j4;
        this.weekdayContentColor = j5;
        this.subheadContentColor = j6;
        this.navigationContentColor = j7;
        this.yearContentColor = j8;
        this.disabledYearContentColor = j9;
        this.currentYearContentColor = j10;
        this.selectedYearContentColor = j11;
        this.disabledSelectedYearContentColor = j12;
        this.selectedYearContainerColor = j13;
        this.disabledSelectedYearContainerColor = j14;
        this.dayContentColor = j15;
        this.disabledDayContentColor = j16;
        this.selectedDayContentColor = j17;
        this.disabledSelectedDayContentColor = j18;
        this.selectedDayContainerColor = j19;
        this.disabledSelectedDayContainerColor = j20;
        this.todayContentColor = j21;
        this.todayDateBorderColor = j22;
        this.dayInSelectionRangeContainerColor = j23;
        this.dayInSelectionRangeContentColor = j24;
        this.dividerColor = j25;
        this.dateTextFieldColors = textFieldColors;
    }

    /* renamed from: copy-tNwlRmA$default, reason: not valid java name */
    public static /* synthetic */ DatePickerColors m4644copytNwlRmA$default(DatePickerColors datePickerColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors, int i2, Object obj) {
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44 = (i2 & 1) != 0 ? datePickerColors.containerColor : j2;
        long j45 = (i2 & 2) != 0 ? datePickerColors.titleContentColor : j3;
        long j46 = (i2 & 4) != 0 ? datePickerColors.headlineContentColor : j4;
        long j47 = (i2 & 8) != 0 ? datePickerColors.weekdayContentColor : j5;
        long j48 = (i2 & 16) != 0 ? datePickerColors.subheadContentColor : j6;
        long j49 = (i2 & 32) != 0 ? datePickerColors.navigationContentColor : j7;
        long j50 = (i2 & 64) != 0 ? datePickerColors.yearContentColor : j8;
        long j51 = j44;
        long j52 = (i2 & 128) != 0 ? datePickerColors.disabledYearContentColor : j9;
        long j53 = (i2 & 256) != 0 ? datePickerColors.currentYearContentColor : j10;
        long j54 = (i2 & 512) != 0 ? datePickerColors.selectedYearContentColor : j11;
        long j55 = (i2 & 1024) != 0 ? datePickerColors.disabledSelectedYearContentColor : j12;
        long j56 = (i2 & 2048) != 0 ? datePickerColors.selectedYearContainerColor : j13;
        long j57 = (i2 & 4096) != 0 ? datePickerColors.disabledSelectedYearContainerColor : j14;
        long j58 = (i2 & 8192) != 0 ? datePickerColors.dayContentColor : j15;
        long j59 = (i2 & 16384) != 0 ? datePickerColors.disabledDayContentColor : j16;
        if ((i2 & 32768) != 0) {
            j26 = j59;
            j27 = datePickerColors.selectedDayContentColor;
        } else {
            j26 = j59;
            j27 = j17;
        }
        if ((i2 & 65536) != 0) {
            j28 = j27;
            j29 = datePickerColors.disabledSelectedDayContentColor;
        } else {
            j28 = j27;
            j29 = j18;
        }
        if ((i2 & 131072) != 0) {
            j30 = j29;
            j31 = datePickerColors.selectedDayContainerColor;
        } else {
            j30 = j29;
            j31 = j19;
        }
        if ((i2 & 262144) != 0) {
            j32 = j31;
            j33 = datePickerColors.disabledSelectedDayContainerColor;
        } else {
            j32 = j31;
            j33 = j20;
        }
        if ((i2 & 524288) != 0) {
            j34 = j33;
            j35 = datePickerColors.todayContentColor;
        } else {
            j34 = j33;
            j35 = j21;
        }
        if ((i2 & 1048576) != 0) {
            j36 = j35;
            j37 = datePickerColors.todayDateBorderColor;
        } else {
            j36 = j35;
            j37 = j22;
        }
        if ((i2 & 2097152) != 0) {
            j38 = j37;
            j39 = datePickerColors.dayInSelectionRangeContainerColor;
        } else {
            j38 = j37;
            j39 = j23;
        }
        if ((i2 & 4194304) != 0) {
            j40 = j39;
            j41 = datePickerColors.dayInSelectionRangeContentColor;
        } else {
            j40 = j39;
            j41 = j24;
        }
        if ((i2 & 8388608) != 0) {
            j42 = j41;
            j43 = datePickerColors.dividerColor;
        } else {
            j42 = j41;
            j43 = j25;
        }
        return datePickerColors.m4645copytNwlRmA(j51, j45, j46, j47, j48, j49, j50, j52, j53, j54, j55, j56, j57, j58, j26, j28, j30, j32, j34, j36, j38, j40, j42, j43, (i2 & 16777216) != 0 ? datePickerColors.dateTextFieldColors : textFieldColors);
    }

    /* renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m4645copytNwlRmA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors) {
        return new DatePickerColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.titleContentColor, j4 != 16 ? j4 : this.headlineContentColor, j5 != 16 ? j5 : this.weekdayContentColor, j6 != 16 ? j6 : this.subheadContentColor, j7 != 16 ? j7 : this.navigationContentColor, j8 != 16 ? j8 : this.yearContentColor, j9 != 16 ? j9 : this.disabledYearContentColor, j10 != 16 ? j10 : this.currentYearContentColor, j11 != 16 ? j11 : this.selectedYearContentColor, j12 != 16 ? j12 : this.disabledSelectedYearContentColor, j13 != 16 ? j13 : this.selectedYearContainerColor, j14 != 16 ? j14 : this.disabledSelectedYearContainerColor, j15 != 16 ? j15 : this.dayContentColor, j16 != 16 ? j16 : this.disabledDayContentColor, j17 != 16 ? j17 : this.selectedDayContentColor, j18 != 16 ? j18 : this.disabledSelectedDayContentColor, j19 != 16 ? j19 : this.selectedDayContainerColor, j20 != 16 ? j20 : this.disabledSelectedDayContainerColor, j21 != 16 ? j21 : this.todayContentColor, j22 != 16 ? j22 : this.todayDateBorderColor, j23 != 16 ? j23 : this.dayInSelectionRangeContainerColor, j24 != 16 ? j24 : this.dayInSelectionRangeContentColor, j25 != 16 ? j25 : this.dividerColor, takeOrElse$material3(textFieldColors, new a() { // from class: androidx.compose.material3.DatePickerColors$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.dateTextFieldColors;
            }
        }), null);
    }

    public final State<Color> dayContainerColor$material3(boolean z, boolean z2, boolean z3, Composer composer, int i2) {
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i2, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:993)");
        }
        long jM8263getTransparent0d7_KjU = z ? z2 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor : Color.Companion.m8263getTransparent0d7_KjU();
        if (z3) {
            composer.startReplaceGroup(-1319881536);
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(jM8263getTransparent0d7_KjU, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1319654864);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(jM8263getTransparent0d7_KjU), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> dayContentColor$material3(boolean r9, boolean r10, boolean r11, boolean r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r8 = this;
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:957)"
            r2 = -1233694918(0xffffffffb6774f3a, float:-3.6851984E-6)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r14, r0, r1)
        Lf:
            if (r10 == 0) goto L16
            if (r12 == 0) goto L16
            long r8 = r8.selectedDayContentColor
            goto L1a
        L16:
            if (r10 == 0) goto L1c
            long r8 = r8.disabledSelectedDayContentColor
        L1a:
            r0 = r8
            goto L36
        L1c:
            if (r11 == 0) goto L23
            if (r12 == 0) goto L23
            long r8 = r8.dayInSelectionRangeContentColor
            goto L1a
        L23:
            if (r11 == 0) goto L2a
            if (r12 != 0) goto L2a
        L27:
            long r8 = r8.disabledDayContentColor
            goto L1a
        L2a:
            if (r9 == 0) goto L31
            if (r12 == 0) goto L31
            long r8 = r8.todayContentColor
            goto L1a
        L31:
            if (r12 == 0) goto L27
            long r8 = r8.dayContentColor
            goto L1a
        L36:
            if (r11 == 0) goto L4b
            r8 = -969507820(0xffffffffc6367c14, float:-11679.02)
            r13.startReplaceGroup(r8)
            androidx.compose.ui.graphics.Color r8 = androidx.compose.ui.graphics.Color.m8218boximpl(r0)
            r9 = 0
            androidx.compose.runtime.State r8 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r8, r13, r9)
            r13.endReplaceGroup()
            goto L68
        L4b:
            r8 = -969442410(0xffffffffc6377b96, float:-11742.896)
            r13.startReplaceGroup(r8)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r8 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects
            r9 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r8 = androidx.compose.material3.MotionSchemeKt.value(r8, r13, r9)
            r2 = r8
            androidx.compose.animation.core.AnimationSpec r2 = (androidx.compose.animation.core.AnimationSpec) r2
            r6 = 0
            r7 = 12
            r3 = 0
            r4 = 0
            r5 = r13
            androidx.compose.runtime.State r8 = androidx.compose.animation.SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(r0, r2, r3, r4, r5, r6, r7)
            r5.endReplaceGroup()
        L68:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L71
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L71:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerColors.dayContentColor$material3(boolean, boolean, boolean, boolean, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m8229equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m8229equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m8229equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m8229equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m8229equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m8229equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m8229equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m8229equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m8229equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m8229equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m8229equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m8229equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m8229equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m8229equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m8229equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m8229equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m8229equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m8229equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m8229equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m8229equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m8229equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4646getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m4647getCurrentYearContentColor0d7_KjU() {
        return this.currentYearContentColor;
    }

    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* renamed from: getDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m4648getDayContentColor0d7_KjU() {
        return this.dayContentColor;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4649getDayInSelectionRangeContainerColor0d7_KjU() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name */
    public final long m4650getDayInSelectionRangeContentColor0d7_KjU() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m4651getDisabledDayContentColor0d7_KjU() {
        return this.disabledDayContentColor;
    }

    /* renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4652getDisabledSelectedDayContainerColor0d7_KjU() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m4653getDisabledSelectedDayContentColor0d7_KjU() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4654getDisabledSelectedYearContainerColor0d7_KjU() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m4655getDisabledSelectedYearContentColor0d7_KjU() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m4656getDisabledYearContentColor0d7_KjU() {
        return this.disabledYearContentColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m4657getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m4658getHeadlineContentColor0d7_KjU() {
        return this.headlineContentColor;
    }

    /* renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name */
    public final long m4659getNavigationContentColor0d7_KjU() {
        return this.navigationContentColor;
    }

    /* renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4660getSelectedDayContainerColor0d7_KjU() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m4661getSelectedDayContentColor0d7_KjU() {
        return this.selectedDayContentColor;
    }

    /* renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4662getSelectedYearContainerColor0d7_KjU() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m4663getSelectedYearContentColor0d7_KjU() {
        return this.selectedYearContentColor;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name */
    public final long m4664getSubheadContentColor0d7_KjU() {
        return this.subheadContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m4665getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name */
    public final long m4666getTodayContentColor0d7_KjU() {
        return this.todayContentColor;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m4667getTodayDateBorderColor0d7_KjU() {
        return this.todayDateBorderColor;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name */
    public final long m4668getWeekdayContentColor0d7_KjU() {
        return this.weekdayContentColor;
    }

    /* renamed from: getYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m4669getYearContentColor0d7_KjU() {
        return this.yearContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.dayInSelectionRangeContentColor;
        long j3 = this.dayInSelectionRangeContainerColor;
        long j4 = this.todayDateBorderColor;
        long j5 = this.todayContentColor;
        long j6 = this.disabledSelectedDayContainerColor;
        long j7 = this.selectedDayContainerColor;
        long j8 = this.disabledSelectedDayContentColor;
        long j9 = this.selectedDayContentColor;
        long j10 = this.disabledDayContentColor;
        long j11 = this.dayContentColor;
        long j12 = this.disabledSelectedYearContainerColor;
        long j13 = this.selectedYearContainerColor;
        long j14 = this.disabledSelectedYearContentColor;
        long j15 = this.selectedYearContentColor;
        long j16 = this.currentYearContentColor;
        long j17 = this.disabledYearContentColor;
        long j18 = this.yearContentColor;
        long j19 = this.subheadContentColor;
        long j20 = this.weekdayContentColor;
        return (((((((((((((((((((((((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.titleContentColor)) * 31) + Color.m8235hashCodeimpl(this.headlineContentColor)) * 31) + Color.m8235hashCodeimpl(j20)) * 31) + Color.m8235hashCodeimpl(j19)) * 31) + Color.m8235hashCodeimpl(j18)) * 31) + Color.m8235hashCodeimpl(j17)) * 31) + Color.m8235hashCodeimpl(j16)) * 31) + Color.m8235hashCodeimpl(j15)) * 31) + Color.m8235hashCodeimpl(j14)) * 31) + Color.m8235hashCodeimpl(j13)) * 31) + Color.m8235hashCodeimpl(j12)) * 31) + Color.m8235hashCodeimpl(j11)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public final TextFieldColors takeOrElse$material3(TextFieldColors textFieldColors, a<TextFieldColors> aVar) {
        return textFieldColors == null ? aVar.invoke() : textFieldColors;
    }

    public final State<Color> yearContainerColor$material3(boolean z, boolean z2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i2, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1047)");
        }
        State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(z ? z2 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor : Color.Companion.m8263getTransparent0d7_KjU(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM1834animateColorAsStateeuL9pac;
    }

    public final State<Color> yearContentColor$material3(boolean z, boolean z2, boolean z3, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i2, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1023)");
        }
        State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac((z2 && z3) ? this.selectedYearContentColor : z2 ? this.disabledSelectedYearContentColor : (z && z3) ? this.currentYearContentColor : z3 ? this.yearContentColor : this.disabledYearContentColor, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM1834animateColorAsStateeuL9pac;
    }

    public /* synthetic */ DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, textFieldColors);
    }
}
