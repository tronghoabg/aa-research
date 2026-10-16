package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.KeyboardUtilKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DatePickerKt {
    private static final float DatePickerHorizontalPadding = 12.0f;
    private static final int MaxCalendarRows = 6;
    private static final float MonthYearHeight = 56.0f;
    private static final float RecommendedSizeForAccessibility = 48.0f;
    private static final int YearsInRow = 3;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1661a = 0;
    private static final PaddingValues DatePickerModeTogglePadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 12.0f, 12.0f, 3, null);
    private static final PaddingValues DatePickerTitlePadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(24.0f, 16.0f, 12.0f, 0.0f, 8, null);
    private static final PaddingValues DatePickerHeadlinePadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(24.0f, 0.0f, 12.0f, 12.0f, 2, null);
    private static final float YearsVerticalPadding = 16.0f;

    public static /* synthetic */ float $r8$lambda$8cHAoqFuYaIF4ZM5UYeMXKtehnM() {
        return 0.0f;
    }

    public static /* synthetic */ float $r8$lambda$cRzJV9zxzfk35peR6mxuRJI8Qwo() {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* renamed from: DateEntryContainer-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4689DateEntryContainercJHQLPU(final androidx.compose.ui.Modifier r25, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, final androidx.compose.material3.DatePickerColors r29, final androidx.compose.ui.text.TextStyle r30, final float r31, androidx.compose.ui.focus.FocusRequester r32, androidx.compose.ui.focus.FocusRequester r33, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m4689DateEntryContainercJHQLPU(androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material3.DatePickerColors, androidx.compose.ui.text.TextStyle, float, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateEntryContainer_cJHQLPU$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateEntryContainer_cJHQLPU$lambda$1$0(final p pVar, p pVar2, p pVar3, DatePickerColors datePickerColors, TextStyle textStyle, Composer composer, int i2) {
        Composer composer2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(500940066, i2, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1394)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical start = (pVar == null || pVar2 == null) ? pVar != null ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getSpaceBetween();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, Alignment.Companion.getCenterVertically(), composer, 48);
            int iM2 = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar != null) {
                composer.startReplaceGroup(1552443252);
                TextKt.ProvideTextStyle(textStyle, ComposableLambdaKt.rememberComposableLambda(-818278020, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda45
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.DateEntryContainer_cJHQLPU$lambda$1$0$0$0$0(rowScopeInstance, pVar, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1552633530);
                composer.endReplaceGroup();
            }
            if (pVar2 == null) {
                composer.startReplaceGroup(1552672465);
            } else {
                composer.startReplaceGroup(-504103120);
                pVar2.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (pVar3 == null && pVar == null && pVar2 == null) {
                composer.startReplaceGroup(555234774);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer.startReplaceGroup(555152128);
                composer2 = composer;
                DividerKt.m4778HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors.m4657getDividerColor0d7_KjU(), composer2, 0, 3);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DateEntryContainer_cJHQLPU$lambda$1$0$0$0$0(RowScope rowScope, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818278020, i2, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1408)");
            }
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DateEntryContainer_cJHQLPU$lambda$2(Modifier modifier, p pVar, p pVar2, p pVar3, DatePickerColors datePickerColors, TextStyle textStyle, float f2, FocusRequester focusRequester, FocusRequester focusRequester2, p pVar4, int i2, int i3, Composer composer, int i4) {
        m4689DateEntryContainercJHQLPU(modifier, pVar, pVar2, pVar3, datePickerColors, textStyle, f2, focusRequester, focusRequester2, pVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DatePicker(final androidx.compose.material3.DatePickerState r27, androidx.compose.ui.Modifier r28, androidx.compose.material3.DatePickerFormatter r29, androidx.compose.material3.DatePickerColors r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, boolean r33, androidx.compose.ui.focus.FocusRequester r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.DatePickerColors, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab DatePicker$lambda$1(DatePickerState datePickerState, DatePickerColors datePickerColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1655706771, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:190)");
            }
            DatePickerDefaults.INSTANCE.m4671DatePickerTitleFNtVw6o(datePickerState.mo4711getDisplayModejFl4v0(), PaddingKt.padding(Modifier.Companion, DatePickerTitlePadding), datePickerColors.m4665getTitleContentColor0d7_KjU(), composer, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DatePicker$lambda$2(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439279037, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:197)");
            }
            DatePickerDefaults.INSTANCE.m4670DatePickerHeadlineISIPfiY(datePickerState.getSelectedDateMillis(), datePickerState.mo4711getDisplayModejFl4v0(), datePickerFormatter, PaddingKt.padding(Modifier.Companion, DatePickerHeadlinePadding), datePickerColors.m4658getHeadlineContentColor0d7_KjU(), composer, 199680, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DatePicker$lambda$5(final DatePickerState datePickerState, DatePickerColors datePickerColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483431603, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:223)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, DatePickerModeTogglePadding);
            int iMo4711getDisplayModejFl4v0 = datePickerState.mo4711getDisplayModejFl4v0();
            boolean zChanged = composer.changed(datePickerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda34
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.DatePicker$lambda$5$0$0(datePickerState, (DisplayMode) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m4693DisplayModeToggleButtoniUJLfQg(modifierPadding, iMo4711getDisplayModejFl4v0, (l) objRememberedValue, datePickerColors, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePicker$lambda$5$0$0(DatePickerState datePickerState, DisplayMode displayMode) {
        datePickerState.mo4712setDisplayModevCnGnXg(displayMode.m4771unboximpl());
        return ab.f48028a;
    }

    static final ab DatePicker$lambda$6(final DatePickerState datePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1171988524, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:237)");
            }
            Long selectedDateMillis = datePickerState.getSelectedDateMillis();
            long displayedMonthMillis = datePickerState.getDisplayedMonthMillis();
            int iMo4711getDisplayModejFl4v0 = datePickerState.mo4711getDisplayModejFl4v0();
            boolean zChanged = composer.changed(datePickerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda48
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.DatePicker$lambda$6$0$0(datePickerState, (Long) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            l lVar = (l) objRememberedValue;
            boolean zChanged2 = composer.changed(datePickerState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda49
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.DatePicker$lambda$6$1$0(datePickerState, ((Long) obj).longValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            m4694SwitchableDateEntryContentKaiTk9E(selectedDateMillis, displayedMonthMillis, iMo4711getDisplayModejFl4v0, lVar, (l) objRememberedValue2, calendarModel, datePickerState.getYearRange(), datePickerFormatter, datePickerState.getSelectableDates(), datePickerColors, focusRequester, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePicker$lambda$6$0$0(DatePickerState datePickerState, Long l2) {
        datePickerState.setSelectedDateMillis(l2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePicker$lambda$6$1$0(DatePickerState datePickerState, long j2) {
        datePickerState.setDisplayedMonthMillis(j2);
        return ab.f48028a;
    }

    static final ab DatePicker$lambda$7(DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, p pVar, p pVar2, boolean z, FocusRequester focusRequester, int i2, int i3, Composer composer, int i4) {
        DatePicker(datePickerState, modifier, datePickerFormatter, datePickerColors, pVar, pVar2, z, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void DatePickerContent(final Long l2, final long j2, final l<? super Long, ab> lVar, final l<? super Long, ab> lVar2, final CalendarModel calendarModel, final j jVar, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-434467002);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(l2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(calendarModel) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(jVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != ((2097152 & i2) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter)) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(selectableDates) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, i5, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1571)");
            }
            final CalendarMonth month = calendarModel.getMonth(j2);
            int iH = n.h(month.indexIn(jVar), 0);
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iH, 0, composerStartRestartGroup, 0, 2);
            Integer numValueOf = Integer.valueOf(iH);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(iH);
            DatePickerKt$DatePickerContent$1$1 datePickerKt$DatePickerContent$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || datePickerKt$DatePickerContent$1$1RememberedValue == Composer.Companion.getEmpty()) {
                datePickerKt$DatePickerContent$1$1RememberedValue = new DatePickerKt$DatePickerContent$1$1(lazyListStateRememberLazyListState, iH, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$DatePickerContent$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(numValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) datePickerKt$DatePickerContent$1$1RememberedValue, composerStartRestartGroup, 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final af afVar = (af) objRememberedValue;
            Object[] objArr = new Object[0];
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda66
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.DatePickerContent$lambda$1$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (a) objRememberedValue2, composerStartRestartGroup, 48);
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = FocusRequester.Companion.createRefs();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            FocusRequester.Companion.FocusRequesterFactory focusRequesterFactory = (FocusRequester.Companion.FocusRequesterFactory) objRememberedValue3;
            final FocusRequester focusRequesterComponent1 = focusRequesterFactory.component1();
            final FocusRequester focusRequesterComponent2 = focusRequesterFactory.component2();
            final FocusRequester focusRequesterComponent3 = focusRequesterFactory.component3();
            final FocusRequester focusRequesterComponent4 = focusRequesterFactory.component4();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            float f2 = DatePickerHorizontalPadding;
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(companion2, f2, 0.0f, 2, null);
            boolean canScrollForward = lazyListStateRememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = lazyListStateRememberLazyListState.getCanScrollBackward();
            boolean zDatePickerContent$lambda$2 = DatePickerContent$lambda$2(mutableState);
            String monthYear = datePickerFormatter.formatMonthYear(Long.valueOf(j2), calendarModel.getLocale());
            if (monthYear == null) {
                monthYear = "-";
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequesterComponent1);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            String str = monthYear;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda68
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.DatePickerContent$lambda$5$0$0(afVar, lazyListStateRememberLazyListState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            a aVar = (a) objRememberedValue4;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda69
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.DatePickerContent$lambda$5$1$0(afVar, lazyListStateRememberLazyListState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            a aVar2 = (a) objRememberedValue5;
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda70
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.DatePickerContent$lambda$5$2$0(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            a aVar3 = (a) objRememberedValue6;
            boolean zChanged3 = composerStartRestartGroup.changed(focusRequesterComponent3) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda71
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.DatePickerContent$lambda$5$3$0(focusRequesterComponent3, focusManager);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MonthsNavigation(modifierM2757paddingVpY3zN4$default, canScrollForward, canScrollBackward, zDatePickerContent$lambda$2, str, modifierFocusRequester, aVar, aVar2, aVar3, (a) objRememberedValue7, focusRequesterComponent2, datePickerColors, composerStartRestartGroup, 6, (i5 >> 21) & 112);
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM2757paddingVpY3zN4$default2 = PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, f2, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iM3 = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default2);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            WeekDays(datePickerColors, calendarModel, composerStartRestartGroup, ((i5 >> 24) & 14) | ((i5 >> 9) & 112));
            boolean zChanged4 = composerStartRestartGroup.changed(focusRequesterComponent1);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda72
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.DatePickerContent$lambda$5$4$0$0$0(focusRequesterComponent1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            int i6 = 57344 & i5;
            int i7 = 458752 & i5;
            int i8 = 3670016 & i5;
            int i9 = i5 & 29360128;
            HorizontalMonthsList(lazyListStateRememberLazyListState, l2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, (a) objRememberedValue8, focusManager, composerStartRestartGroup, ((i5 << 3) & 112) | (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | (i5 & 7168) | i6 | i7 | i8 | i9 | (i5 & 234881024), 0);
            composerStartRestartGroup.endNode();
            FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composerStartRestartGroup, 6);
            FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composerStartRestartGroup, 6);
            FiniteAnimationSpec finiteAnimationSpecValue3 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composerStartRestartGroup, 6);
            boolean zDatePickerContent$lambda$22 = DatePickerContent$lambda$2(mutableState);
            Modifier modifierClipToBounds = ClipKt.clipToBounds(Modifier.Companion);
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(finiteAnimationSpecValue3, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn(finiteAnimationSpecValue, 0.6f));
            ExitTransition exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(finiteAnimationSpecValue3, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpecValue2, 0.0f, 2, null));
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1193716082, true, new q() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda73
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DatePickerKt.DatePickerContent$lambda$5$4$1(j2, mutableState, afVar, lazyListStateRememberLazyListState, jVar, month, selectableDates, calendarModel, datePickerColors, focusRequesterComponent3, focusRequesterComponent2, focusRequesterComponent4, focusManager, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(zDatePickerContent$lambda$22, modifierClipToBounds, enterTransitionPlus, exitTransitionPlus, (String) null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 196656, 16);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda67
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.DatePickerContent$lambda$6(l2, j2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DatePickerContent$lambda$1$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean DatePickerContent$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DatePickerContent$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$0$0(af afVar, LazyListState lazyListState) {
        aj.z(afVar, null, null, new DatePickerKt$DatePickerContent$3$1$1$1(lazyListState, null), 3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$1$0(af afVar, LazyListState lazyListState) {
        aj.z(afVar, null, null, new DatePickerKt$DatePickerContent$3$2$1$1(lazyListState, null), 3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$2$0(MutableState mutableState) {
        DatePickerContent$lambda$3(mutableState, !DatePickerContent$lambda$2(mutableState));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$3$0(FocusRequester focusRequester, FocusManager focusManager) {
        if (!FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null)) {
            focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7859getDowndhqQ8s());
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$4$0$0$0(FocusRequester focusRequester) {
        FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$4$1(long j2, final MutableState mutableState, final af afVar, final LazyListState lazyListState, final j jVar, final CalendarMonth calendarMonth, SelectableDates selectableDates, CalendarModel calendarModel, DatePickerColors datePickerColors, final FocusRequester focusRequester, final FocusRequester focusRequester2, final FocusRequester focusRequester3, final FocusManager focusManager, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193716082, i2, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1686)");
        }
        final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_year_picker_pane_title, composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        boolean zChanged = composer.changed(strM6375getString2EP1pXo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda62
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return DatePickerKt.DatePickerContent$lambda$5$4$1$0$0(strM6375getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierSemantics);
        a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(SizeKt.m2811requiredHeight3ABfNKs(Modifier.Companion, (RecommendedSizeForAccessibility * 7.0f) - DividerDefaults.INSTANCE.m4774getThicknessD9Ej5fM()), DatePickerHorizontalPadding, 0.0f, 2, null);
        boolean zChanged2 = composer.changed(mutableState) | composer.changedInstance(afVar) | composer.changed(lazyListState) | composer.changedInstance(jVar) | composer.changed(calendarMonth);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            Object obj = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda63
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return DatePickerKt.DatePickerContent$lambda$5$4$1$1$0$0(afVar, mutableState, lazyListState, jVar, calendarMonth, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        }
        l lVar = (l) objRememberedValue2;
        boolean zChanged3 = composer.changed(focusRequester2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda64
                @Override // h.g.a.a
                public final Object invoke() {
                    return DatePickerKt.DatePickerContent$lambda$5$4$1$1$1$0(focusRequester2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        a aVar = (a) objRememberedValue3;
        boolean zChanged4 = composer.changed(focusRequester3) | composer.changedInstance(focusManager);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda65
                @Override // h.g.a.a
                public final Object invoke() {
                    return DatePickerKt.DatePickerContent$lambda$5$4$1$1$2$0(focusRequester3, focusManager);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        YearPicker(modifierM2757paddingVpY3zN4$default, j2, lVar, selectableDates, calendarModel, jVar, datePickerColors, focusRequester, aVar, (a) objRememberedValue4, composer, 6);
        long jM4657getDividerColor0d7_KjU = datePickerColors.m4657getDividerColor0d7_KjU();
        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester3);
        boolean zChangedInstance = composer.changedInstance(focusManager) | composer.changed(focusRequester);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (l) new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$3$5$2$2$4$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m4704invokeZmokQxo(keyEvent.m9424unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m4704invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9194getDirectionUpEK5gGoQ())) {
                        focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
                        return true;
                    }
                    if (KeyEvent_androidKt.m9441isShiftPressedZmokQxo(keyEvent) && Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ())) {
                        FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                        return true;
                    }
                    if (!Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9189getDirectionDownEK5gGoQ()) && !Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ())) {
                        return false;
                    }
                    focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
                    return true;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        DividerKt.m4778HorizontalDivider9IZ8Weo(FocusModifierKt.focusTarget(KeyInputModifierKt.onKeyEvent(modifierFocusRequester, (l) objRememberedValue5)), 0.0f, jM4657getDividerColor0d7_KjU, composer, 0, 2);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$4$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$4$1$1$0$0(af afVar, MutableState mutableState, LazyListState lazyListState, j jVar, CalendarMonth calendarMonth, int i2) {
        DatePickerContent$lambda$3(mutableState, !DatePickerContent$lambda$2(mutableState));
        aj.z(afVar, null, null, new DatePickerKt$DatePickerContent$3$5$2$2$1$1$1(lazyListState, i2, jVar, calendarMonth, null), 3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$4$1$1$1$0(FocusRequester focusRequester) {
        FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerContent$lambda$5$4$1$1$2$0(FocusRequester focusRequester, FocusManager focusManager) {
        FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
        return ab.f48028a;
    }

    static final ab DatePickerContent$lambda$6(Long l2, long j2, l lVar, l lVar2, CalendarModel calendarModel, j jVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        DatePickerContent(l2, j2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m4690DatePickerHeaderpc5RIQQ(final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final long j2, long j3, final float f2, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        final long j4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2020490761);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            j4 = j3;
            i3 |= true != composerStartRestartGroup.changed(j4) ? 1024 : 2048;
        } else {
            j4 = j3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020490761, i3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1767)");
            }
            Modifier modifierThen = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(pVar != null ? SizeKt.m2807defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f2, 1, null) : Modifier.Companion);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i5 = i3;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(396894187);
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1344395458, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda35
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.DatePickerHeader_pc5RIQQ$lambda$0$0(pVar, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 6) & 14) | 384);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(397163267);
                composerStartRestartGroup.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j4)), pVar2, composerStartRestartGroup, ((i5 >> 12) & 112) | ProvidedValue.$stable);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda36
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.DatePickerHeader_pc5RIQQ$lambda$1(modifier, pVar, j2, j4, f2, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DatePickerHeader_pc5RIQQ$lambda$0$0(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1344395458, i2, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1782)");
            }
            Alignment bottomStart = Alignment.Companion.getBottomStart();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DatePickerHeader_pc5RIQQ$lambda$1(Modifier modifier, p pVar, long j2, long j3, float f2, p pVar2, int i2, Composer composer, int i3) {
        m4690DatePickerHeaderpc5RIQQ(modifier, pVar, j2, j3, f2, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m4691DatePickerStatesHin3Bw(Locale locale, Long l2, Long l3, j jVar, int i2, SelectableDates selectableDates) {
        return new DatePickerStateImpl(l2, l3, jVar, i2, selectableDates, locale, null);
    }

    /* renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m4692DatePickerStatesHin3Bw$default(Locale locale, Long l2, Long l3, j jVar, int i2, SelectableDates selectableDates, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            jVar = DatePickerDefaults.INSTANCE.getYearRange();
        }
        j jVar2 = jVar;
        if ((i3 & 16) != 0) {
            i2 = DisplayMode.Companion.m4773getPickerjFl4v0();
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        SelectableDates selectableDates2 = selectableDates;
        int i5 = i3 & 4;
        if ((i3 & 2) != 0) {
            l2 = null;
        }
        Long l4 = l2;
        return m4691DatePickerStatesHin3Bw(locale, l4, i5 != 0 ? l4 : l3, jVar2, i4, selectableDates2);
    }

    private static final void Day(final String str, final Modifier modifier, final boolean z, final a<ab> aVar, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        String str3;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        DatePickerColors datePickerColors2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-945355136);
        if (i4 == 0) {
            str3 = str;
            i3 = (true != composerStartRestartGroup.changed(str3) ? 2 : 4) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            z6 = z2;
            i3 |= true != composerStartRestartGroup.changed(z6) ? 8192 : 16384;
        } else {
            z6 = z2;
        }
        if ((196608 & i2) == 0) {
            z7 = z3;
            i3 |= true != composerStartRestartGroup.changed(z7) ? 65536 : 131072;
        } else {
            z7 = z3;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z4) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            z8 = z5;
            i3 |= true != composerStartRestartGroup.changed(z8) ? 4194304 : 8388608;
        } else {
            z8 = z5;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= true != composerStartRestartGroup.changed(datePickerColors2) ? 268435456 : 536870912;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-945355136, i3, -1, "androidx.compose.material3.Day (DatePicker.kt:2238)");
            }
            int i5 = 234881024 & i3;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 67108864 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda37
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.Day$lambda$0$0(str2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (l) objRememberedValue);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getDateContainerShape(), composerStartRestartGroup, 6);
            int i6 = i3 >> 6;
            long jM8238unboximpl = datePickerColors2.dayContainerColor$material3(z, z7, z6, composerStartRestartGroup, (i6 & 14) | ((i3 >> 12) & 112) | (i6 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i3 >> 18) & 7168)).getValue().m8238unboximpl();
            BorderStroke borderStrokeM1998BorderStrokecXLIe8U = null;
            if (z4 && !z) {
                borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m6630getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m4667getTodayDateBorderColor0d7_KjU());
            }
            final String str4 = str3;
            final boolean z9 = z8;
            SurfaceKt.m5670Surfaced85dljk(z, aVar, modifierSemantics, z3, value, jM8238unboximpl, 0L, 0.0f, 0.0f, borderStrokeM1998BorderStrokecXLIe8U, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1126347158, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda38
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.Day$lambda$1(str4, datePickerColors, z4, z, z9, z3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i6 & 7294, 48, DisplayStrings.DS_IN_ONE_MONTH);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda39
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.Day$lambda$2(str, modifier, z, aVar, z2, z3, z4, z5, str2, datePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Day$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, 2, null));
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10316getButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab Day$lambda$1(String str, DatePickerColors datePickerColors, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1126347158, i2, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2267)");
            }
            Modifier modifierM2816requiredSizeVpY3zN4 = SizeKt.m2816requiredSizeVpY3zN4(Modifier.Companion, DatePickerModalTokens.INSTANCE.m6627getDateContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m6626getDateContainerHeightD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2816requiredSizeVpY3zN4);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda20
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.Day$lambda$1$0$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m5817TextNvy7gAk(str, SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue), datePickerColors.dayContentColor$material3(z, z2, z3, z4, composer, 0).getValue().m8238unboximpl(), null, 0L, null, null, null, 0L, null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 261112);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Day$lambda$1$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab Day$lambda$2(String str, Modifier modifier, boolean z, a aVar, boolean z2, boolean z3, boolean z4, boolean z5, String str2, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        Day(str, modifier, z, aVar, z2, z3, z4, z5, str2, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: DisplayModeToggleButton-iUJLfQg, reason: not valid java name */
    public static final void m4693DisplayModeToggleButtoniUJLfQg(final Modifier modifier, final int i2, final l<? super DisplayMode, ab> lVar, final DatePickerColors datePickerColors, Composer composer, final int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1461252485);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(datePickerColors) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461252485, i4, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1440)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(datePickerColors.m4658getHeadlineContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-1734512197, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda60
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$0(i2, lVar, modifier, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda61
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$1(modifier, i2, lVar, datePickerColors, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DisplayModeToggleButton_iUJLfQg$lambda$0(int i2, final l lVar, Modifier modifier, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1734512197, i3, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1442)");
            }
            if (DisplayMode.m4768equalsimpl0(i2, DisplayMode.Companion.m4773getPickerjFl4v0())) {
                composer.startReplaceGroup(-101251783);
                ImageVector edit$material3 = Icons.Filled.INSTANCE.getEdit$material3();
                String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_switch_to_input_mode, composer, 0);
                boolean zChanged = composer.changed(lVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda21
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$0$0$0(lVar);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                IconButtonWithTooltip((a) objRememberedValue, edit$material3, strM6375getString2EP1pXo, modifier, false, composer, 0, 16);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-100953904);
                ImageVector dateRange$material3 = Icons.Filled.INSTANCE.getDateRange$material3();
                String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_switch_to_calendar_mode, composer, 0);
                boolean zChanged2 = composer.changed(lVar);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda22
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$0$1$0(lVar);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                IconButtonWithTooltip((a) objRememberedValue2, dateRange$material3, strM6375getString2EP1pXo2, modifier, false, composer, 0, 16);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DisplayModeToggleButton_iUJLfQg$lambda$0$0$0(l lVar) {
        lVar.invoke(DisplayMode.m4765boximpl(DisplayMode.Companion.m4772getInputjFl4v0()));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DisplayModeToggleButton_iUJLfQg$lambda$0$1$0(l lVar) {
        lVar.invoke(DisplayMode.m4765boximpl(DisplayMode.Companion.m4773getPickerjFl4v0()));
        return ab.f48028a;
    }

    static final ab DisplayModeToggleButton_iUJLfQg$lambda$1(Modifier modifier, int i2, l lVar, DatePickerColors datePickerColors, int i3, Composer composer, int i4) {
        m4693DisplayModeToggleButtoniUJLfQg(modifier, i2, lVar, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    private static final void HorizontalMonthsList(final LazyListState lazyListState, final Long l2, final l<? super Long, ab> lVar, final l<? super Long, ab> lVar2, final CalendarModel calendarModel, final j jVar, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final a<ab> aVar, final FocusManager focusManager, Composer composer, final int i2, final int i3) {
        int i4;
        Long l3;
        l<? super Long, ab> lVar3;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        a<ab> aVar2;
        FocusManager focusManager2;
        int i5;
        final LazyListState lazyListState2;
        Object month;
        DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1038629066);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(lazyListState) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            l3 = l2;
            i4 |= true != composerStartRestartGroup.changed(l3) ? 16 : 32;
        } else {
            l3 = l2;
        }
        if ((i2 & 384) == 0) {
            lVar3 = lVar;
            i4 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 128 : 256;
        } else {
            lVar3 = lVar;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(calendarModel) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(jVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != ((2097152 & i2) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter)) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            selectableDates2 = selectableDates;
            i4 |= true != composerStartRestartGroup.changed(selectableDates2) ? 4194304 : 8388608;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((100663296 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i4 |= true != composerStartRestartGroup.changed(datePickerColors2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((805306368 & i2) == 0) {
            aVar2 = aVar;
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 268435456 : 536870912;
        } else {
            aVar2 = aVar;
        }
        if ((i3 & 6) == 0) {
            focusManager2 = focusManager;
            i5 = i3 | (true != composerStartRestartGroup.changedInstance(focusManager2) ? 2 : 4);
        } else {
            focusManager2 = focusManager;
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038629066, i4, i5, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1803)");
            }
            final CalendarDate today = calendarModel.getToday();
            boolean zChanged = composerStartRestartGroup.changed(jVar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                month = calendarModel.getMonth(jVar.a(), 1);
                composerStartRestartGroup.updateRememberedValue(month);
            } else {
                month = objRememberedValue;
            }
            final CalendarMonth calendarMonth = (CalendarMonth) month;
            int i7 = i4;
            final Long l4 = l3;
            final l<? super Long, ab> lVar4 = lVar3;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final SelectableDates selectableDates3 = selectableDates2;
            final a<ab> aVar3 = aVar2;
            final FocusManager focusManager3 = focusManager2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(-1911156825, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda46
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.HorizontalMonthsList$lambda$1(lazyListState, jVar, calendarModel, calendarMonth, lVar4, today, l4, datePickerFormatter, selectableDates3, datePickerColors3, focusManager3, aVar3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i8 = i7 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(calendarModel) | (i8 == 4) | ((i7 & 7168) == 2048) | composerStartRestartGroup.changedInstance(jVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, lVar2, calendarModel, jVar, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = objRememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (p<? super af, ? super e<? super ab>, ? extends Object>) datePickerKt$HorizontalMonthsList$2$1, composerStartRestartGroup, i8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            lazyListState2 = lazyListState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda47
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.HorizontalMonthsList$lambda$3(lazyListState2, l2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, aVar, focusManager, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab HorizontalMonthsList$lambda$1(final LazyListState lazyListState, final j jVar, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final l lVar, final CalendarDate calendarDate, final Long l2, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusManager focusManager, final a aVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911156825, i2, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1813)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda27
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.HorizontalMonthsList$lambda$1$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue);
            FlingBehavior flingBehaviorRememberSnapFlingBehavior$material3 = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3(lazyListState, null, composer, 384, 2);
            boolean zChangedInstance = composer.changedInstance(jVar) | composer.changedInstance(calendarModel) | composer.changed(calendarMonth) | composer.changed(lVar) | composer.changed(calendarDate) | composer.changed(l2) | composer.changedInstance(datePickerFormatter) | composer.changed(selectableDates) | composer.changed(datePickerColors) | composer.changed(lazyListState) | composer.changedInstance(focusManager) | composer.changed(aVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                l lVar2 = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda28
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.HorizontalMonthsList$lambda$1$1$0(jVar, calendarModel, calendarMonth, lVar, calendarDate, l2, datePickerFormatter, selectableDates, datePickerColors, lazyListState, focusManager, aVar, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(lVar2);
                objRememberedValue2 = lVar2;
            }
            LazyDslKt.LazyRow(modifierSemantics, lazyListState, null, false, null, null, flingBehaviorRememberSnapFlingBehavior$material3, false, null, (l) objRememberedValue2, composer, 0, DisplayStrings.DS_STANDSTILL);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalMonthsList$lambda$1$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda23
            @Override // h.g.a.a
            public final Object invoke() {
                int i2 = DatePickerKt.f1661a;
                return Float.valueOf(0.0f);
            }
        }, new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24
            @Override // h.g.a.a
            public final Object invoke() {
                int i2 = DatePickerKt.f1661a;
                return Float.valueOf(0.0f);
            }
        }, false, 4, null));
        return ab.f48028a;
    }

    private static final float HorizontalMonthsList$lambda$1$0$0$0() {
        return 0.0f;
    }

    private static final float HorizontalMonthsList$lambda$1$0$0$1() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalMonthsList$lambda$1$1$0(j jVar, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final l lVar, final CalendarDate calendarDate, final Long l2, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final LazyListState lazyListState, final FocusManager focusManager, final a aVar, LazyListScope lazyListScope) {
        LazyListScope.CC.items$default(lazyListScope, numberOfMonthsInRange(jVar), null, null, ComposableLambdaKt.composableLambdaInstance(-600599685, true, new r() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DatePickerKt.HorizontalMonthsList$lambda$1$1$0$0(calendarModel, calendarMonth, lVar, calendarDate, l2, datePickerFormatter, selectableDates, datePickerColors, lazyListState, focusManager, aVar, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalMonthsList$lambda$1$1$0$0(CalendarModel calendarModel, CalendarMonth calendarMonth, l lVar, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyListState lazyListState, FocusManager focusManager, a aVar, LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = i3 | (true != composer.changed(lazyItemScope) ? 2 : 4);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composer.changed(i2) ? 16 : 32;
        }
        if (composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-600599685, i4, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1825)");
            }
            CalendarMonth calendarMonthPlusMonths = calendarModel.plusMonths(calendarMonth, i2);
            Modifier modifierFillParentMaxWidth$default = LazyItemScope.CC.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillParentMaxWidth$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Month(calendarMonthPlusMonths, lVar, calendarDate.getUtcTimeMillis(), l2, null, null, datePickerFormatter, selectableDates, datePickerColors, calendarModel.getLocale(), lazyListState, focusManager, aVar, composer, 221184, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab HorizontalMonthsList$lambda$3(LazyListState lazyListState, Long l2, l lVar, l lVar2, CalendarModel calendarModel, j jVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, a aVar, FocusManager focusManager, int i2, int i3, Composer composer, int i4) {
        HorizontalMonthsList(lazyListState, l2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, aVar, focusManager, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IconButtonWithTooltip(final h.g.a.a<h.ab> r19, final androidx.compose.ui.graphics.vector.ImageVector r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, boolean r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.IconButtonWithTooltip(h.g.a.a, androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab IconButtonWithTooltip$lambda$0(final String str, TooltipScope tooltipScope, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != ((i2 & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope)) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-456272562, i3, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2556)");
            }
            TooltipKt.m6053PlainTooltipInternalkw8QeXY(tooltipScope, str, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1330618970, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.IconButtonWithTooltip$lambda$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, i3 & 14, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab IconButtonWithTooltip$lambda$0$0(String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1330618970, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2556)");
            }
            TextKt.m5817TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab IconButtonWithTooltip$lambda$1(a aVar, Modifier modifier, boolean z, final ImageVector imageVector, final String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124908186, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2559)");
            }
            IconButtonKt.IconButton((a<ab>) aVar, modifier, z, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableLambdaKt.rememberComposableLambda(-1301085432, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.IconButtonWithTooltip$lambda$1$0(imageVector, str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab IconButtonWithTooltip$lambda$1$0(ImageVector imageVector, String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1301085432, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2560)");
            }
            IconKt.m5039Iconww6aTOc(imageVector, str, (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab IconButtonWithTooltip$lambda$2(a aVar, ImageVector imageVector, String str, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        IconButtonWithTooltip(aVar, imageVector, str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void InvisibleDivider(final FocusRequester focusRequester, final FocusManager focusManager, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1276532388);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(focusRequester) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(focusManager) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1276532388, i3, -1, "androidx.compose.material3.InvisibleDivider (DatePicker.kt:2566)");
            }
            long jM8263getTransparent0d7_KjU = Color.Companion.m8263getTransparent0d7_KjU();
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m2822size3ABfNKs(Modifier.Companion, 0.0f), focusRequester);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (l) new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$InvisibleDivider$1$1
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m4705invokeZmokQxo(keyEvent.m9424unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m4705invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9194getDirectionUpEK5gGoQ()) || Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9296getNumPadDirectionUpEK5gGoQ()) || (KeyEvent_androidKt.m9441isShiftPressedZmokQxo(keyEvent) && Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ()))) {
                            focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
                            return true;
                        }
                        if (!Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9189getDirectionDownEK5gGoQ()) && !Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9293getNumPadDirectionDownEK5gGoQ()) && !Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ())) {
                            return false;
                        }
                        focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DividerKt.m4778HorizontalDivider9IZ8Weo(FocusModifierKt.focusTarget(KeyInputModifierKt.onKeyEvent(modifierFocusRequester, (l) objRememberedValue)), 0.0f, jM8263getTransparent0d7_KjU, composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda13
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.InvisibleDivider$lambda$1(focusRequester, focusManager, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab InvisibleDivider$lambda$1(FocusRequester focusRequester, FocusManager focusManager, int i2, Composer composer, int i3) {
        InvisibleDivider(focusRequester, focusManager, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Month(final androidx.compose.material3.internal.CalendarMonth r41, final h.g.a.l<? super java.lang.Long, h.ab> r42, final long r43, final java.lang.Long r45, final java.lang.Long r46, final androidx.compose.material3.SelectedRangeInfo r47, final androidx.compose.material3.DatePickerFormatter r48, final androidx.compose.material3.SelectableDates r49, final androidx.compose.material3.DatePickerColors r50, final java.util.Locale r51, final androidx.compose.foundation.lazy.LazyListState r52, final androidx.compose.ui.focus.FocusManager r53, final h.g.a.a<h.ab> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.Month(androidx.compose.material3.internal.CalendarMonth, h.g.a.l, long, java.lang.Long, java.lang.Long, androidx.compose.material3.SelectedRangeInfo, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, java.util.Locale, androidx.compose.foundation.lazy.LazyListState, androidx.compose.ui.focus.FocusManager, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Month$lambda$0$0(SelectedRangeInfo selectedRangeInfo, DatePickerColors datePickerColors, ContentDrawScope contentDrawScope) {
        DateRangePickerKt.m4733drawRangeBackgroundmxwnekA(contentDrawScope, selectedRangeInfo, datePickerColors.m4649getDayInSelectionRangeContainerColor0d7_KjU());
        contentDrawScope.drawContent();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Month$lambda$1$0$2$0(l lVar, long j2) {
        lVar.invoke(Long.valueOf(j2));
        return ab.f48028a;
    }

    static final ab Month$lambda$2(CalendarMonth calendarMonth, l lVar, long j2, Long l2, Long l3, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, LazyListState lazyListState, FocusManager focusManager, a aVar, int i2, int i3, Composer composer, int i4) {
        Month(calendarMonth, lVar, j2, l2, l3, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, lazyListState, focusManager, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    private static final void MonthsNavigation(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final String str, final Modifier modifier2, final a<ab> aVar, final a<ab> aVar2, final a<ab> aVar3, final a<ab> aVar4, final FocusRequester focusRequester, final DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        a<ab> aVar5;
        a<ab> aVar6;
        boolean z4;
        int i5;
        int i6;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(942117263);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(str) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            aVar5 = aVar;
            i4 |= true != composerStartRestartGroup.changedInstance(aVar5) ? 524288 : 1048576;
        } else {
            aVar5 = aVar;
        }
        if ((12582912 & i2) == 0) {
            aVar6 = aVar2;
            i4 |= true != composerStartRestartGroup.changedInstance(aVar6) ? 4194304 : 8388608;
        } else {
            aVar6 = aVar2;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            int i8 = i4;
            z4 = true;
            i5 = i8 | (true != composerStartRestartGroup.changedInstance(aVar4) ? 268435456 : 536870912);
        } else {
            int i9 = i4;
            z4 = true;
            i5 = i9;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (z4 != composerStartRestartGroup.changed(focusRequester) ? 2 : 4);
        } else {
            i6 = i3;
        }
        int i10 = i6;
        if ((i3 & 48) == 0) {
            i6 = i10 | (z4 != composerStartRestartGroup.changed(datePickerColors) ? 16 : 32);
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i6 & 19) == 18) ? false : true, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(942117263, i5, i6, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2452)");
            }
            Modifier modifierM2811requiredHeight3ABfNKs = SizeKt.m2811requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(z3 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2811requiredHeight3ABfNKs);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester);
            boolean z5 = (i5 & 7168) == 2048;
            boolean z6 = (1879048192 & i5) == 536870912;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z5 | z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (l) new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m4706invokeZmokQxo(keyEvent.m9424unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m4706invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        if (!z3 || !KeyboardUtilKt.m6278isTabZmokQxo(keyEvent)) {
                            return false;
                        }
                        aVar4.invoke();
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            YearPickerMenuButton(aVar3, z3, KeyInputModifierKt.onKeyEvent(modifierFocusRequester, (l) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(921071711, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda14
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.MonthsNavigation$lambda$0$1(str, datePickerColors, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 6) & 112) | ((i5 >> 24) & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 0);
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1240891753);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1241751848);
                final a<ab> aVar7 = aVar6;
                final a<ab> aVar8 = aVar5;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(datePickerColors.m4659getNavigationContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(591596400, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda15
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.MonthsNavigation$lambda$0$2(aVar7, z2, aVar8, modifier2, z, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda16
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.MonthsNavigation$lambda$1(modifier, z, z2, z3, str, modifier2, aVar, aVar2, aVar3, aVar4, focusRequester, datePickerColors, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MonthsNavigation$lambda$0$1(final String str, DatePickerColors datePickerColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(921071711, i2, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2476)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda75
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.MonthsNavigation$lambda$0$1$0$0(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m5817TextNvy7gAk(str, SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), datePickerColors.m4659getNavigationContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MonthsNavigation$lambda$0$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10334setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m10308getPolite0phEisY());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MonthsNavigation$lambda$0$2(a aVar, boolean z, a aVar2, Modifier modifier, boolean z2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591596400, i2, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2492)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconButtonWithTooltip(aVar, Icons.AutoMirrored.Filled.INSTANCE.getKeyboardArrowLeft$material3(), Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_switch_to_previous_month, composer, 0), null, z, composer, 0, 8);
            IconButtonWithTooltip(aVar2, Icons.AutoMirrored.Filled.INSTANCE.getKeyboardArrowRight$material3(), Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_switch_to_next_month, composer, 0), modifier, z2, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab MonthsNavigation$lambda$1(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Modifier modifier2, a aVar, a aVar2, a aVar3, a aVar4, FocusRequester focusRequester, DatePickerColors datePickerColors, int i2, int i3, Composer composer, int i4) {
        MonthsNavigation(modifier, z, z2, z3, str, modifier2, aVar, aVar2, aVar3, aVar4, focusRequester, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* renamed from: SwitchableDateEntryContent-KaiTk9E, reason: not valid java name */
    private static final void m4694SwitchableDateEntryContentKaiTk9E(final Long l2, final long j2, final int i2, final l<? super Long, ab> lVar, final l<? super Long, ab> lVar2, final CalendarModel calendarModel, final j jVar, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i3, final int i4) {
        int i5;
        l<? super Long, ab> lVar3;
        CalendarModel calendarModel2;
        j jVar2;
        int i6;
        Composer composer2;
        int i7 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2053685029);
        if (i7 == 0) {
            i5 = (true != composerStartRestartGroup.changed(l2) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(j2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            lVar3 = lVar2;
            i5 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 8192 : 16384;
        } else {
            lVar3 = lVar2;
        }
        if ((196608 & i3) == 0) {
            calendarModel2 = calendarModel;
            i5 |= true != composerStartRestartGroup.changedInstance(calendarModel2) ? 65536 : 131072;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((1572864 & i3) == 0) {
            jVar2 = jVar;
            i5 |= true != composerStartRestartGroup.changedInstance(jVar2) ? 524288 : 1048576;
        } else {
            jVar2 = jVar;
        }
        if ((12582912 & i3) == 0) {
            i5 |= true != ((16777216 & i3) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter)) ? 4194304 : 8388608;
        }
        if ((100663296 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(selectableDates) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(datePickerColors) ? 268435456 : 536870912;
        }
        int i8 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (true != composerStartRestartGroup.changed(focusRequester) ? 2 : 4);
        } else {
            i6 = i4;
        }
        if (composerStartRestartGroup.shouldExecute(((i8 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053685029, i8, i6, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1477)");
            }
            final int i9 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(48.0f);
            final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composerStartRestartGroup, 6);
            final FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composerStartRestartGroup, 6);
            final FiniteAnimationSpec finiteAnimationSpecValue3 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composerStartRestartGroup, 6);
            final FiniteAnimationSpec finiteAnimationSpecValue4 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composerStartRestartGroup, 6);
            DisplayMode displayModeM4765boximpl = DisplayMode.m4765boximpl(i2);
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda51
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$1$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(finiteAnimationSpecValue3) | composerStartRestartGroup.changedInstance(finiteAnimationSpecValue) | composerStartRestartGroup.changedInstance(finiteAnimationSpecValue2) | composerStartRestartGroup.changed(i9) | composerStartRestartGroup.changedInstance(finiteAnimationSpecValue4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda52
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0(finiteAnimationSpecValue3, finiteAnimationSpecValue, finiteAnimationSpecValue2, i9, finiteAnimationSpecValue4, (AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            l lVar4 = (l) objRememberedValue2;
            final l<? super Long, ab> lVar5 = lVar3;
            final CalendarModel calendarModel3 = calendarModel2;
            final j jVar3 = jVar2;
            composer2 = composerStartRestartGroup;
            AnimatedContentKt.AnimatedContent(displayModeM4765boximpl, modifierSemantics, lVar4, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(1838500091, true, new r() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda53
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$3(l2, j2, lVar, lVar5, calendarModel3, jVar3, datePickerFormatter, selectableDates, datePickerColors, focusRequester, (AnimatedContentScope) obj, (DisplayMode) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i8 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda54
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$4(l2, j2, i2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SwitchableDateEntryContent_KaiTk9E$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform SwitchableDateEntryContent_KaiTk9E$lambda$2$0(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, final int i2, final FiniteAnimationSpec finiteAnimationSpec4, AnimatedContentTransitionScope animatedContentTransitionScope) {
        return animatedContentTransitionScope.using(DisplayMode.m4768equalsimpl0(((DisplayMode) animatedContentTransitionScope.getTargetState()).m4771unboximpl(), DisplayMode.Companion.m4772getInputjFl4v0()) ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda29
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.intValue();
                int i3 = DatePickerKt.f1661a;
                return num;
            }
        }).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec3, 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda30
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                int i3 = i2;
                ((Integer) obj).intValue();
                int i4 = DatePickerKt.f1661a;
                return Integer.valueOf(i3);
            }
        }))) : AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda31
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                int i3 = i2;
                ((Integer) obj).intValue();
                int i4 = DatePickerKt.f1661a;
                return Integer.valueOf(i3);
            }
        }).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda32
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.intValue();
                int i3 = DatePickerKt.f1661a;
                return num;
            }
        }).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec3, 0.0f, 2, null))), AnimatedContentKt.SizeTransform(true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda33
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                FiniteAnimationSpec finiteAnimationSpec5 = finiteAnimationSpec4;
                int i3 = DatePickerKt.f1661a;
                return finiteAnimationSpec5;
            }
        }));
    }

    static final ab SwitchableDateEntryContent_KaiTk9E$lambda$3(Long l2, long j2, l lVar, l lVar2, CalendarModel calendarModel, j jVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, AnimatedContentScope animatedContentScope, DisplayMode displayMode, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838500091, i2, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1532)");
        }
        int iM4771unboximpl = displayMode.m4771unboximpl();
        if (DisplayMode.m4768equalsimpl0(iM4771unboximpl, DisplayMode.Companion.m4773getPickerjFl4v0())) {
            composer.startReplaceGroup(1567031954);
            DatePickerContent(l2, j2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
            composer.endReplaceGroup();
        } else if (DisplayMode.m4768equalsimpl0(iM4771unboximpl, DisplayMode.Companion.m4772getInputjFl4v0())) {
            composer.startReplaceGroup(1567050592);
            DateInputKt.DateInputContent(l2, lVar, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1334373351);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab SwitchableDateEntryContent_KaiTk9E$lambda$4(Long l2, long j2, int i2, l lVar, l lVar2, CalendarModel calendarModel, j jVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4, Composer composer, int i5) {
        m4694SwitchableDateEntryContentKaiTk9E(l2, j2, i2, lVar, lVar2, calendarModel, jVar, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
        return ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void WeekDays(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i2) {
        Composer composer2;
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849465391);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(datePickerColors) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(calendarModel) ? 16 : 32;
        }
        boolean z = 0;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i4, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1877)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<h.k<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i5 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i6 = i5; i6 < size; i6++) {
                arrayList.add(weekdayNames.get(i6));
            }
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(weekdayNames.get(i7));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), composerStartRestartGroup, 6);
            Alignment alignment = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m2807defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(24563235);
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            int i8 = 0;
            while (i8 < size2) {
                final h.k kVar = (h.k) arrayList2.get(i8);
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composerStartRestartGroup.changed(kVar);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda11
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return DatePickerKt.WeekDays$lambda$0$0$0$0(kVar, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM2824sizeVpY3zN4 = SizeKt.m2824sizeVpY3zN4(SizeKt.m2826sizeInqDBjuR0$default(SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue), DatePickerModalTokens.INSTANCE.m6627getDateContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m6626getDateContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), ((Dp) composerStartRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl(), ((Dp) composerStartRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), z);
                int iM2 = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, z));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2824sizeVpY3zN4);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Composer composer3 = composerStartRestartGroup;
                TextKt.m5817TextNvy7gAk((String) kVar.d(), SizeKt.wrapContentSize$default(Modifier.Companion, alignment, z, 3, alignment), datePickerColors.m4668getWeekdayContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, null, value, composer3, 48, 0, 130040);
                composer3.endNode();
                i8++;
                composerStartRestartGroup = composer3;
                alignment = alignment;
                z = z;
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda12
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.WeekDays$lambda$1(datePickerColors, calendarModel, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab WeekDays$lambda$0$0$0$0(h.k kVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) kVar.c());
        return ab.f48028a;
    }

    static final ab WeekDays$lambda$1(DatePickerColors datePickerColors, CalendarModel calendarModel, int i2, Composer composer, int i3) {
        WeekDays(datePickerColors, calendarModel, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void Year(final String str, final Modifier modifier, final boolean z, final boolean z2, final a<ab> aVar, final boolean z3, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        final String str3;
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1153850597);
        if (i4 == 0) {
            str3 = str;
            i3 = (true != composerStartRestartGroup.changed(str3) ? 2 : 4) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(datePickerColors) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153850597, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:2386)");
            }
            boolean z4 = (i3 & 7168) == 2048;
            boolean z5 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z4 | z5) || objRememberedValue == Composer.Companion.getEmpty()) {
                BorderStroke borderStrokeM1998BorderStrokecXLIe8U = null;
                if (z2 && !z) {
                    borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m6630getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m4667getTodayDateBorderColor0d7_KjU());
                }
                objRememberedValue = borderStrokeM1998BorderStrokecXLIe8U;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = 3670016 & i3;
            BorderStroke borderStroke = (BorderStroke) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i5 == 1048576 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda55
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.Year$lambda$1$0(str2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i6 = i3 >> 6;
            int i7 = i6 & 14;
            int i8 = i7 | ((i3 >> 9) & 112);
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5670Surfaced85dljk(z, aVar, SemanticsModifierKt.semantics(modifier, true, (l) objRememberedValue2), z3, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composerStartRestartGroup, 6), datePickerColors.yearContainerColor$material3(z, z3, composerStartRestartGroup, ((i3 >> 15) & DisplayStrings.DS_TAP_TO_VERIFY) | i7 | ((i3 >> 12) & 112)).getValue().m8238unboximpl(), 0L, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-564400443, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda56
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.Year$lambda$2(str3, datePickerColors, z2, z, z3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, i8 | (i6 & 7168), 48, DisplayStrings.DS_IN_ONE_MONTH);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda57
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.Year$lambda$3(str, modifier, z, z2, aVar, z3, str2, datePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Year$lambda$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, 2, null));
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10316getButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab Year$lambda$2(String str, DatePickerColors datePickerColors, boolean z, boolean z2, boolean z3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-564400443, i2, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2415)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = DatePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda41
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.Year$lambda$2$0$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m5817TextNvy7gAk(str, SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue), datePickerColors.yearContentColor$material3(z, z2, z3, composer, 0).getValue().m8238unboximpl(), null, 0L, null, null, null, 0L, null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 261112);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Year$lambda$2$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab Year$lambda$3(String str, Modifier modifier, boolean z, boolean z2, a aVar, boolean z3, String str2, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        Year(str, modifier, z, z2, aVar, z3, str2, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void YearPicker(final Modifier modifier, final long j2, final l<? super Integer, ab> lVar, final SelectableDates selectableDates, final CalendarModel calendarModel, final j jVar, final DatePickerColors datePickerColors, final FocusRequester focusRequester, final a<ab> aVar, final a<ab> aVar2, Composer composer, final int i2) {
        final Modifier modifier2;
        int i3;
        l<? super Integer, ab> lVar2;
        CalendarModel calendarModel2;
        j jVar2;
        DatePickerColors datePickerColors2;
        a<ab> aVar3;
        a<ab> aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-724154510);
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            lVar2 = lVar;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 128 : 256;
        } else {
            lVar2 = lVar;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(selectableDates) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            calendarModel2 = calendarModel;
            i3 |= true != composerStartRestartGroup.changedInstance(calendarModel2) ? 8192 : 16384;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((196608 & i2) == 0) {
            jVar2 = jVar;
            i3 |= true != composerStartRestartGroup.changedInstance(jVar2) ? 65536 : 131072;
        } else {
            jVar2 = jVar;
        }
        if ((1572864 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= true != composerStartRestartGroup.changed(datePickerColors2) ? 524288 : 1048576;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(focusRequester) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            aVar3 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            aVar3 = aVar;
        }
        if ((805306368 & i2) == 0) {
            aVar4 = aVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 268435456 : 536870912;
        } else {
            aVar4 = aVar2;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-724154510, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2306)");
            }
            int i5 = i3;
            final a<ab> aVar5 = aVar4;
            final CalendarModel calendarModel3 = calendarModel2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final a<ab> aVar6 = aVar3;
            final l<? super Integer, ab> lVar3 = lVar2;
            final j jVar3 = jVar2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1910384865, true, new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda58
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.YearPicker$lambda$0(calendarModel3, j2, jVar3, modifier2, datePickerColors3, aVar6, aVar5, focusRequester, lVar3, selectableDates, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i6 = 29360128 & i5;
            DatePickerKt$YearPicker$2$1 datePickerKt$YearPicker$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 8388608 || datePickerKt$YearPicker$2$1RememberedValue == Composer.Companion.getEmpty()) {
                datePickerKt$YearPicker$2$1RememberedValue = new DatePickerKt$YearPicker$2$1(focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$YearPicker$2$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(focusRequester, (p<? super af, ? super e<? super ab>, ? extends Object>) datePickerKt$YearPicker$2$1RememberedValue, composerStartRestartGroup, (i5 >> 21) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda59
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.YearPicker$lambda$2(modifier, j2, lVar, selectableDates, calendarModel, jVar, datePickerColors, focusRequester, aVar, aVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab YearPicker$lambda$0(final CalendarModel calendarModel, long j2, final j jVar, Modifier modifier, final DatePickerColors datePickerColors, final a aVar, final a aVar2, final FocusRequester focusRequester, final l lVar, final SelectableDates selectableDates, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1910384865, i2, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2308)");
            }
            final int year = calendarModel.getMonth(calendarModel.getToday()).getYear();
            final int year2 = calendarModel.getMonth(j2).getYear();
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - jVar.a()) - 3), 0, composer, 0, 2);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(modifier, datePickerColors.m4646getContainerColor0d7_KjU(), null, 2, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            GridCells.Fixed fixed2 = fixed;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM2440spacedBy0680j_4 = Arrangement.INSTANCE.m2440spacedBy0680j_4(YearsVerticalPadding);
            Arrangement.HorizontalOrVertical horizontalOrVertical = spaceEvenly;
            boolean zChangedInstance = composer.changedInstance(jVar) | composer.changedInstance(calendarModel) | composer.changed(aVar) | composer.changed(aVar2) | composer.changed(year2) | composer.changed(focusRequester) | composer.changed(year) | composer.changed(lVar) | composer.changed(selectableDates) | composer.changed(datePickerColors);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda25
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.YearPicker$lambda$0$0$0(jVar, calendarModel, aVar, aVar2, year2, focusRequester, year, lVar, selectableDates, datePickerColors, (LazyGridScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            LazyGridDslKt.LazyVerticalGrid(fixed2, modifierM1972backgroundbw27NRU$default, lazyGridStateRememberLazyGridState, null, false, horizontalOrVerticalM2440spacedBy0680j_4, horizontalOrVertical, null, false, null, (l) objRememberedValue, composer, 1769472, 0, DisplayStrings.DS_MESSAGES_ARE_PRIVATE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab YearPicker$lambda$0$0$0(final j jVar, final CalendarModel calendarModel, final a aVar, final a aVar2, final int i2, final FocusRequester focusRequester, final int i3, final l lVar, final SelectableDates selectableDates, final DatePickerColors datePickerColors, LazyGridScope lazyGridScope) {
        int size;
        j jVar2 = jVar;
        x.f(jVar2, "<this>");
        if (jVar2 instanceof Collection) {
            size = ((Collection) jVar2).size();
        } else {
            Iterator it = jVar2.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                it.next();
                i4++;
                if (i4 < 0) {
                    i.o();
                }
            }
            size = i4;
        }
        LazyGridScope.CC.items$default(lazyGridScope, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1895584772, true, new r() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda50
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DatePickerKt.YearPicker$lambda$0$0$0$0(jVar, calendarModel, aVar, aVar2, i2, focusRequester, i3, lVar, selectableDates, datePickerColors, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 14, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab YearPicker$lambda$0$0$0$0(j jVar, CalendarModel calendarModel, final a aVar, final a aVar2, int i2, FocusRequester focusRequester, int i3, final l lVar, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyGridItemScope lazyGridItemScope, int i4, Composer composer, int i5) {
        int i6;
        if ((i5 & 48) == 0) {
            i6 = i5 | (true != composer.changed(i4) ? 16 : 32);
        } else {
            i6 = i5;
        }
        if (composer.shouldExecute((i6 & 145) != 144, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895584772, i6, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2326)");
            }
            final int iA = i4 + jVar.a();
            String localString$default = CalendarLocale_jvmAndAndroidKt.toLocalString$default(iA, 0, 0, false, calendarModel.getLocale(), 7, null);
            Modifier modifierM2816requiredSizeVpY3zN4 = SizeKt.m2816requiredSizeVpY3zN4(Modifier.Companion, DatePickerModalTokens.INSTANCE.m6637getSelectionYearContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m6636getSelectionYearContainerHeightD9Ej5fM());
            boolean zChanged = composer.changed(aVar) | composer.changed(aVar2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (l) new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1$1$1
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m4707invokeZmokQxo(keyEvent.m9424unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m4707invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        if (KeyboardUtilKt.m6277isShiftTabZmokQxo(keyEvent)) {
                            aVar.invoke();
                            return true;
                        }
                        if (!KeyboardUtilKt.m6278isTabZmokQxo(keyEvent)) {
                            return false;
                        }
                        aVar2.invoke();
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(modifierM2816requiredSizeVpY3zN4, (l) objRememberedValue);
            boolean z = iA != i2;
            Modifier modifierThen = modifierOnKeyEvent.then(iA == i2 ? FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester) : Modifier.Companion);
            boolean z2 = !z;
            boolean z3 = iA == i3;
            boolean zChanged2 = composer.changed(lVar) | composer.changed(iA);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda40
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DatePickerKt.YearPicker$lambda$0$0$0$0$1$0(lVar, iA);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            boolean zIsSelectableYear = selectableDates.isSelectableYear(iA);
            String str = String.format(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_navigate_to_year_description, composer, 0), Arrays.copyOf(new Object[]{localString$default}, 1));
            x.e(str, "format(...)");
            Year(localString$default, modifierThen, z2, z3, (a) objRememberedValue2, zIsSelectableYear, str, datePickerColors, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab YearPicker$lambda$0$0$0$0$1$0(l lVar, int i2) {
        lVar.invoke(Integer.valueOf(i2));
        return ab.f48028a;
    }

    static final ab YearPicker$lambda$2(Modifier modifier, long j2, l lVar, SelectableDates selectableDates, CalendarModel calendarModel, j jVar, DatePickerColors datePickerColors, FocusRequester focusRequester, a aVar, a aVar2, int i2, Composer composer, int i3) {
        YearPicker(modifier, j2, lVar, selectableDates, calendarModel, jVar, datePickerColors, focusRequester, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void YearPickerMenuButton(final h.g.a.a<h.ab> r20, final boolean r21, androidx.compose.ui.Modifier r22, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.YearPickerMenuButton(h.g.a.a, boolean, androidx.compose.ui.Modifier, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab YearPickerMenuButton$lambda$0(p pVar, boolean z, RowScope rowScope, Composer composer, int i2) {
        String strM6375getString2EP1pXo;
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1899489890, i2, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2529)");
            }
            pVar.invoke(composer, 0);
            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, ButtonDefaults.INSTANCE.m4438getIconSpacingD9Ej5fM()), composer, 6);
            ImageVector arrowDropDown$material3 = Icons.Filled.INSTANCE.getArrowDropDown$material3();
            if (z) {
                composer.startReplaceGroup(1509384391);
                strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_switch_to_day_selection, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1509478662);
                strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_switch_to_year_selection, composer, 0);
                composer.endReplaceGroup();
            }
            IconKt.m5039Iconww6aTOc(arrowDropDown$material3, strM6375getString2EP1pXo, RotateKt.rotate(Modifier.Companion, true != z ? 0.0f : 180.0f), 0L, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab YearPickerMenuButton$lambda$1(a aVar, boolean z, Modifier modifier, p pVar, int i2, int i3, Composer composer, int i4) {
        YearPickerMenuButton(aVar, z, modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final String dayContentDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i2, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:2207)");
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            composer.startReplaceGroup(974430743);
            if (z3) {
                composer.startReplaceGroup(1416908759);
                sb.append(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_range_picker_start_headline, composer, 0));
                composer.endReplaceGroup();
            } else if (z4) {
                composer.startReplaceGroup(1416912757);
                sb.append(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_range_picker_end_headline, composer, 0));
                composer.endReplaceGroup();
            } else if (z5) {
                composer.startReplaceGroup(1416916692);
                sb.append(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_range_picker_day_in_range, composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(974813035);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(974818987);
            composer.endReplaceGroup();
        }
        if (z2) {
            composer.startReplaceGroup(974842237);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_date_picker_today_description, composer, 0));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(975009451);
            composer.endReplaceGroup();
        }
        String string = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    private static final Modifier dayOnKeyEvent(Modifier modifier, final boolean z, boolean z2, boolean z3, final LazyListState lazyListState, final af afVar, final FocusManager focusManager, final a<ab> aVar) {
        return focusManager == null ? modifier : z2 ? KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt.dayOnKeyEvent.1
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4708invokeZmokQxo(keyEvent.m9424unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4708invokeZmokQxo(android.view.KeyEvent keyEvent) {
                if (KeyboardUtilKt.m6277isShiftTabZmokQxo(keyEvent)) {
                    aVar.invoke();
                    return true;
                }
                if (lazyListState.isScrollInProgress()) {
                    return true;
                }
                if (DatePickerKt.m4699isDirectionBackwardsYhN2O0w(keyEvent, z)) {
                    DatePickerKt.m4698goToMonthBhxgA10(-1, lazyListState, focusManager, FocusDirection.Companion.m7864getPreviousdhqQ8s(), afVar);
                    return true;
                }
                if (!DatePickerKt.m4700isDirectionForwardYhN2O0w(keyEvent, z)) {
                    return false;
                }
                focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
                return true;
            }
        }) : z3 ? KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt.dayOnKeyEvent.2
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4709invokeZmokQxo(keyEvent.m9424unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4709invokeZmokQxo(android.view.KeyEvent keyEvent) {
                if (KeyboardUtilKt.m6278isTabZmokQxo(keyEvent)) {
                    focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7859getDowndhqQ8s());
                    return true;
                }
                if (lazyListState.isScrollInProgress()) {
                    return true;
                }
                if (DatePickerKt.m4700isDirectionForwardYhN2O0w(keyEvent, z)) {
                    DatePickerKt.m4698goToMonthBhxgA10(1, lazyListState, focusManager, FocusDirection.Companion.m7863getNextdhqQ8s(), afVar);
                    return true;
                }
                if (!DatePickerKt.m4699isDirectionBackwardsYhN2O0w(keyEvent, z)) {
                    return false;
                }
                focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
                return true;
            }
        }) : KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt.dayOnKeyEvent.3
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4710invokeZmokQxo(keyEvent.m9424unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4710invokeZmokQxo(android.view.KeyEvent keyEvent) {
                if (DatePickerKt.m4700isDirectionForwardYhN2O0w(keyEvent, z)) {
                    focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
                    return true;
                }
                if (!DatePickerKt.m4699isDirectionBackwardsYhN2O0w(keyEvent, z)) {
                    return false;
                }
                focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
                return true;
            }
        });
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    private static final int getFirstEnabledDay(CalendarMonth calendarMonth, SelectableDates selectableDates) {
        int daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
        int daysFromStartOfWeekToFirstOfMonth2 = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays();
        if (selectableDates.isSelectableYear(calendarMonth.getYear())) {
            for (int i2 = 0; !selectableDates.isSelectableDate(calendarMonth.getStartUtcTimeMillis() + (i2 * CalendarModelKt.MillisecondsIn24Hours)) && daysFromStartOfWeekToFirstOfMonth <= daysFromStartOfWeekToFirstOfMonth2 - 1; i2++) {
                daysFromStartOfWeekToFirstOfMonth++;
            }
        }
        return daysFromStartOfWeekToFirstOfMonth;
    }

    private static final int getLastEnabledDay(CalendarMonth calendarMonth, SelectableDates selectableDates) {
        int daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
        int daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
        if (selectableDates.isSelectableYear(calendarMonth.getYear())) {
            for (int i2 = 0; !selectableDates.isSelectableDate(calendarMonth.getEndUtcTimeMillis() - (i2 * CalendarModelKt.MillisecondsIn24Hours)) && daysFromStartOfWeekToFirstOfMonth2 >= daysFromStartOfWeekToFirstOfMonth; i2++) {
                daysFromStartOfWeekToFirstOfMonth2--;
            }
        }
        return daysFromStartOfWeekToFirstOfMonth2;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: goToMonth-BhxgA10, reason: not valid java name */
    public static final void m4698goToMonthBhxgA10(int i2, LazyListState lazyListState, FocusManager focusManager, int i3, af afVar) {
        aj.z(afVar, null, null, new DatePickerKt$goToMonth$1(lazyListState, i2, focusManager, i3, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDirectionBackwards-YhN2O0w, reason: not valid java name */
    public static final boolean m4699isDirectionBackwardsYhN2O0w(android.view.KeyEvent keyEvent, boolean z) {
        return z ? m4702isDirectionRightZmokQxo(keyEvent) : m4701isDirectionLeftZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDirectionForward-YhN2O0w, reason: not valid java name */
    public static final boolean m4700isDirectionForwardYhN2O0w(android.view.KeyEvent keyEvent, boolean z) {
        return z ? m4701isDirectionLeftZmokQxo(keyEvent) : m4702isDirectionRightZmokQxo(keyEvent);
    }

    /* renamed from: isDirectionLeft-ZmokQxo, reason: not valid java name */
    private static final boolean m4701isDirectionLeftZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9192getDirectionLeftEK5gGoQ());
    }

    /* renamed from: isDirectionRight-ZmokQxo, reason: not valid java name */
    private static final boolean m4702isDirectionRightZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9193getDirectionRightEK5gGoQ());
    }

    public static final int numberOfMonthsInRange(j jVar) {
        return ((jVar.b() - jVar.a()) + 1) * 12;
    }

    /* renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m4703rememberDatePickerStateEU0dCGE(Long l2, Long l3, j jVar, int i2, SelectableDates selectableDates, Composer composer, int i3, int i4) {
        if ((i4 & 4) != 0) {
            jVar = DatePickerDefaults.INSTANCE.getYearRange();
        }
        final j jVar2 = jVar;
        if ((i4 & 8) != 0) {
            i2 = DisplayMode.Companion.m4773getPickerjFl4v0();
        }
        final int i5 = i2;
        if ((i4 & 16) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        final SelectableDates selectableDates2 = selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i3, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:390)");
        }
        boolean z = true;
        if (1 == (i4 & 1)) {
            l2 = null;
        }
        final Long l4 = l2;
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.Companion.Saver(selectableDates2, localeDefaultLocale);
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(l4)) || (i3 & 6) == 4;
        final Long l5 = (i4 & 2) != 0 ? l4 : l3;
        boolean zChangedInstance = ((((i3 & 112) ^ 48) > 32 && composer.changed(l5)) || (i3 & 48) == 32) | z2 | composer.changedInstance(jVar2) | ((((i3 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) > 2048 && composer.changed(i5)) || (i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 2048);
        if ((((57344 & i3) ^ 24576) <= 16384 || !composer.changed(selectableDates2)) && (i3 & 24576) != 16384) {
            z = false;
        }
        boolean zChanged = zChangedInstance | z | composer.changed(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda26
                @Override // h.g.a.a
                public final Object invoke() {
                    return DatePickerKt.rememberDatePickerState_EU0dCGE$lambda$0$0(l4, l5, jVar2, i5, selectableDates2, localeDefaultLocale);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        datePickerStateImpl.setSelectableDates(selectableDates2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DatePickerStateImpl rememberDatePickerState_EU0dCGE$lambda$0$0(Long l2, Long l3, j jVar, int i2, SelectableDates selectableDates, Locale locale) {
        return new DatePickerStateImpl(l2, l3, jVar, i2, selectableDates, locale, null);
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final l<? super Long, ab> lVar, final CalendarModel calendarModel, final j jVar, e<? super ab> eVar) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new a() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda74
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
            }
        }).collect(new kotlinx.coroutines.b.l() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.3
            public final Object emit(int i2, e<? super ab> eVar2) {
                int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() / 12;
                int firstVisibleItemIndex2 = lazyListState.getFirstVisibleItemIndex() % 12;
                lVar.invoke(new Long(calendarModel.getMonth(jVar.a() + firstVisibleItemIndex, firstVisibleItemIndex2 + 1).getStartUtcTimeMillis()));
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit(((Number) obj).intValue(), (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    public static /* synthetic */ int $r8$lambda$2S3e8m4Z96XUt_UGZsW_T1S1x78(int i2) {
        return i2;
    }

    /* renamed from: $r8$lambda$8eL3Y7OMrQ1-KH_8W4bZ2aFHaw8, reason: not valid java name */
    public static /* synthetic */ int m4680$r8$lambda$8eL3Y7OMrQ1KH_8W4bZ2aFHaw8(int i2) {
        return i2;
    }

    private static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$0(int i2) {
        return i2;
    }

    private static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$3(int i2) {
        return i2;
    }

    public static /* synthetic */ int $r8$lambda$15wHnJQkOUCI4jJFCFm0kpTVtBw(int i2, int i3) {
        return i2;
    }

    public static /* synthetic */ int $r8$lambda$xS2wxEQsrFC5hnXhfMJL64nqGfQ(int i2, int i3) {
        return i2;
    }

    private static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$1(int i2, int i3) {
        return i2;
    }

    private static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$2(int i2, int i3) {
        return i2;
    }

    /* renamed from: $r8$lambda$rGjQPXhGLaJX-SLZR46YH1iCFzc, reason: not valid java name */
    public static /* synthetic */ FiniteAnimationSpec m4687$r8$lambda$rGjQPXhGLaJXSLZR46YH1iCFzc(FiniteAnimationSpec finiteAnimationSpec, IntSize intSize, IntSize intSize2) {
        return finiteAnimationSpec;
    }

    private static final FiniteAnimationSpec SwitchableDateEntryContent_KaiTk9E$lambda$2$0$4(FiniteAnimationSpec finiteAnimationSpec, IntSize intSize, IntSize intSize2) {
        return finiteAnimationSpec;
    }
}
