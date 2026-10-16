package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(24.0f, 10.0f, 24.0f, 0.0f, 8, null);
    private static final float InputTextNonErroneousBottomPadding = 16.0f;

    public static final void DateInputContent(final Long l2, final l<? super Long, ab> lVar, final CalendarModel calendarModel, final j jVar, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2) {
        int i3;
        j jVar2;
        SelectableDates selectableDates2;
        Composer composer2;
        DateInputFormat dateInputFormat;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-432341251);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(l2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(calendarModel) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            jVar2 = jVar;
            i3 |= true != composerStartRestartGroup.changedInstance(jVar2) ? 1024 : 2048;
        } else {
            jVar2 = jVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != ((i2 & 32768) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            selectableDates2 = selectableDates;
            i3 |= true != composerStartRestartGroup.changed(selectableDates2) ? 65536 : 131072;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(datePickerColors) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(focusRequester) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432341251, i3, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:67)");
            }
            boolean zChanged = composerStartRestartGroup.changed(calendarModel.getLocale());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getDateInputFormat(calendarModel.getLocale());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objRememberedValue;
            String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_input_invalid_for_pattern, composerStartRestartGroup, 0);
            String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_input_invalid_year_range, composerStartRestartGroup, 0);
            String strM6375getString2EP1pXo3 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_input_invalid_not_allowed, composerStartRestartGroup, 0);
            int i5 = i3;
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2) | ((i3 & 57344) == 16384 || ((i5 & 32768) != 0 && composerStartRestartGroup.changed(datePickerFormatter)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(jVar2, selectableDates2, dateInputFormat, datePickerFormatter, strM6375getString2EP1pXo, strM6375getString2EP1pXo2, strM6375getString2EP1pXo3, "");
                composerStartRestartGroup.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            } else {
                dateInputFormat = dateInputFormat2;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            final String strM6375getString2EP1pXo4 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_input_label, composerStartRestartGroup, 0);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), InputTextFieldPadding);
            int iM5074getSingleDateInputJ2x2o4M = InputIdentifier.Companion.m5074getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis(l2);
            Locale locale = calendarModel.getLocale();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-752164549, true, new p() { // from class: androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DateInputKt.DateInputContent$lambda$3(strM6375getString2EP1pXo4, upperCase, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1179434278, true, new p() { // from class: androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DateInputKt.DateInputContent$lambda$4(upperCase, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            int i6 = i5 << 3;
            DateInputFormat dateInputFormat3 = dateInputFormat;
            composer2 = composerStartRestartGroup;
            m4642DateInputTextFieldxJ3Ic0Y(modifierPadding, l2, lVar, calendarModel, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, iM5074getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat3, locale, datePickerColors, focusRequester, composer2, (i6 & 7168) | (i6 & 112) | 1794054 | (i6 & DisplayStrings.DS_TAP_TO_VERIFY), (i5 >> 18) & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DateInputKt.DateInputContent$lambda$5(l2, lVar, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DateInputContent$lambda$3(final String str, final String str2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752164549, i2, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(str) | composer.changed(str2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DateInputKt.DateInputContent$lambda$3$0$0(str, str2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m5817TextNvy7gAk(str, SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262140);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateInputContent$lambda$3$0$0(String str, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str + ", " + str2);
        return ab.f48028a;
    }

    static final ab DateInputContent$lambda$4(String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179434278, i2, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:98)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda10
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DateInputKt.DateInputContent$lambda$4$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m5817TextNvy7gAk(str, SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262140);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateInputContent$lambda$4$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab DateInputContent$lambda$5(Long l2, l lVar, CalendarModel calendarModel, j jVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, Composer composer, int i3) {
        DateInputContent(l2, lVar, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038e  */
    /* renamed from: DateInputTextField-xJ3Ic0Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4642DateInputTextFieldxJ3Ic0Y(final androidx.compose.ui.Modifier r46, java.lang.Long r47, final h.g.a.l<? super java.lang.Long, h.ab> r48, final androidx.compose.material3.internal.CalendarModel r49, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r50, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r51, final int r52, final androidx.compose.material3.DateInputValidator r53, final androidx.compose.material3.internal.DateInputFormat r54, final java.util.Locale r55, final androidx.compose.material3.DatePickerColors r56, final androidx.compose.ui.focus.FocusRequester r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt.m4642DateInputTextFieldxJ3Ic0Y(androidx.compose.ui.Modifier, java.lang.Long, h.g.a.l, androidx.compose.material3.internal.CalendarModel, h.g.a.p, h.g.a.p, int, androidx.compose.material3.DateInputValidator, androidx.compose.material3.internal.DateInputFormat, java.util.Locale, androidx.compose.material3.DatePickerColors, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DateInputTextField_xJ3Ic0Y$lambda$0$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (o) null), null, 2, null);
    }

    private static final TextFieldValue DateInputTextField_xJ3Ic0Y$lambda$1(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DateInputTextField_xJ3Ic0Y$lambda$3$0(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i2, MutableState mutableState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DateInputTextField_xJ3Ic0Y$lambda$1(mutableState).getText().length() > 0 ? dateInputValidator.m4643validateXivgLIo(calendarModel.parse(DateInputTextField_xJ3Ic0Y$lambda$1(mutableState).getText(), dateInputFormat.getPatternWithoutDelimiters(), locale), i2, locale) : "", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateInputTextField_xJ3Ic0Y$lambda$4$0(DateInputFormat dateInputFormat, MutableState mutableState, l lVar, CalendarModel calendarModel, Locale locale, DateInputValidator dateInputValidator, int i2, MutableState mutableState2, TextFieldValue textFieldValue) {
        if (textFieldValue.getText().length() <= dateInputFormat.getPatternWithoutDelimiters().length()) {
            String text = textFieldValue.getText();
            int i3 = 0;
            while (true) {
                if (i3 >= text.length()) {
                    mutableState2.setValue(textFieldValue);
                    String string = h.n.o.v(textFieldValue.getText()).toString();
                    Long lValueOf = null;
                    if (string.length() != 0 && string.length() >= dateInputFormat.getPatternWithoutDelimiters().length()) {
                        CalendarDate calendarDate = calendarModel.parse(string, dateInputFormat.getPatternWithoutDelimiters(), locale);
                        mutableState.setValue(dateInputValidator.m4643validateXivgLIo(calendarDate, i2, locale));
                        if (((CharSequence) mutableState.getValue()).length() == 0 && calendarDate != null) {
                            lValueOf = Long.valueOf(calendarDate.getUtcTimeMillis());
                        }
                        lVar.invoke(lValueOf);
                    } else {
                        mutableState.setValue("");
                        lVar.invoke(null);
                    }
                } else {
                    if (!Character.isDigit(text.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateInputTextField_xJ3Ic0Y$lambda$5$0(MutableState mutableState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!h.n.o.G((CharSequence) mutableState.getValue())) {
            SemanticsPropertiesKt.error(semanticsPropertyReceiver, (String) mutableState.getValue());
        }
        return ab.f48028a;
    }

    static final ab DateInputTextField_xJ3Ic0Y$lambda$6(MutableState mutableState, Composer composer, int i2) {
        Composer composer2 = composer;
        if (composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-357881838, i2, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:215)");
            }
            if (h.n.o.G((CharSequence) mutableState.getValue())) {
                composer2.startReplaceGroup(-1548950640);
            } else {
                composer2.startReplaceGroup(-327061465);
                TextKt.m5817TextNvy7gAk((String) mutableState.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DateInputTextField_xJ3Ic0Y$lambda$9(Modifier modifier, Long l2, l lVar, CalendarModel calendarModel, p pVar, p pVar2, int i2, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4, Composer composer, int i5) {
        m4642DateInputTextFieldxJ3Ic0Y(modifier, l2, lVar, calendarModel, pVar, pVar2, i2, dateInputValidator, dateInputFormat, locale, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
        return ab.f48028a;
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}
