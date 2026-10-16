package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TimePickerKt {
    private static final float ClockDialMidContainerSize;
    private static final float ClockDialMinContainerSize;
    private static final IntList ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final IntList Hours;
    private static final int MaxHourValue = 23;
    private static final int MaxMinuteValue = 59;
    private static final int MaxValueForTextField = 99;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimePickerMaxHeight;
    private static final float TimePickerMidHeight;
    private static final float OuterCircleToSizeRatio = 101.0f / TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM();
    private static final float InnerCircleToSizeRatio = 69.0f / TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM();
    private static final float ClockDisplayBottomMargin = 36.0f;
    private static final float ClockFaceBottomMargin = 24.0f;
    private static final float DisplaySeparatorWidth = 24.0f;
    private static final float SupportLabelTop = 7.0f;
    private static final float MaxDistance = 74.0f;
    private static final float MinimumInteractiveSize = 48.0f;
    private static final IntList Minutes = IntListKt.intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    public static /* synthetic */ boolean $r8$lambda$myqK2TJN6k2MqNBftFDJZ0YMLUQ(a aVar) {
        ClockText$lambda$16$0$0(aVar);
        return true;
    }

    static {
        IntList intListIntListOf = IntListKt.intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = intListIntListOf;
        MutableIntList mutableIntList = new MutableIntList(intListIntListOf._size);
        int[] iArr = intListIntListOf.content;
        int i2 = intListIntListOf._size;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableIntList.add((iArr[i3] % 12) + 12);
        }
        ExtraHours = mutableIntList;
        PeriodToggleMargin = 12.0f;
        TimePickerMaxHeight = 384.0f;
        TimePickerMidHeight = 330.0f;
        ClockDialMidContainerSize = 238.0f;
        ClockDialMinContainerSize = 200.0f;
    }

    private static final void CircularLayout(Modifier modifier, final float f2, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041042571);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041042571, i4, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:2188)");
            }
            int i6 = i4 & 112;
            TimePickerKt$CircularLayout$1$1 timePickerKt$CircularLayout$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || timePickerKt$CircularLayout$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$CircularLayout$1$1RememberedValue = new TimePickerKt$CircularLayout$1$1(f2);
                composerStartRestartGroup.updateRememberedValue(timePickerKt$CircularLayout$1$1RememberedValue);
            }
            int i7 = (i4 >> 6) & 14;
            int i8 = (i4 << 3) & 112;
            MeasurePolicy measurePolicy = (MeasurePolicy) timePickerKt$CircularLayout$1$1RememberedValue;
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i9 = (((i7 | i8) << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i9 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda52
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.CircularLayout$lambda$1(modifier2, f2, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab CircularLayout$lambda$1(Modifier modifier, float f2, p pVar, int i2, int i3, Composer composer, int i4) {
        CircularLayout(modifier, f2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1280)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), composerStartRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda13
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.ClockDisplayNumbers$lambda$0(timePickerState, timePickerColors, (Composer) obj, ((Integer) obj2).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda14
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.ClockDisplayNumbers$lambda$1(timePickerState, timePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ClockDisplayNumbers$lambda$0(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477913269, i2, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1286)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            m5876TimeSelectoru8A1Dfs(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m7170getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m7169getTimeSelectorContainerHeightD9Ej5fM()), getHourForDisplay(timePickerState), timePickerState, TimePickerSelectionMode.Companion.m5905getHouryecRtBI(), timePickerColors, true, composer, 199686);
            DisplaySeparator(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, DisplaySeparatorWidth, TimePickerTokens.INSTANCE.m7166getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer, 6);
            m5876TimeSelectoru8A1Dfs(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m7170getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m7169getTimeSelectorContainerHeightD9Ej5fM()), timePickerState.getMinute(), timePickerState, TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI(), timePickerColors, true, composer, 199686);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ClockDisplayNumbers$lambda$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2, Composer composer, int i3) {
        ClockDisplayNumbers(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void ClockFace(final Modifier modifier, AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i2) {
        int i3;
        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-478841003);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(analogTimePickerState2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478841003, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1710)");
            }
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            analogTimePickerState2 = analogTimePickerState;
            CrossfadeKt.Crossfade(analogTimePickerState2.getClockFaceValues(), drawSelector(BackgroundKt.m1971backgroundbw27NRU(modifier, timePickerColors.m5824getClockDialColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z, analogTimePickerState.mo4331getSelectionyecRtBI(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composerStartRestartGroup, 6), null)), analogTimePickerState2, timePickerColors), (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composerStartRestartGroup, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(747010833, true, new q() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda5
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TimePickerKt.ClockFace$lambda$0(timePickerColors, analogTimePickerState2, z, focusManager, (IntList) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.ClockFace$lambda$1(modifier, analogTimePickerState2, timePickerColors, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ClockFace$lambda$0(final TimePickerColors timePickerColors, final AnalogTimePickerState analogTimePickerState, final boolean z, final FocusManager focusManager, final IntList intList, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(747010833, i2, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1729)");
        }
        Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(Modifier.Companion, TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM());
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda11
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TimePickerKt.ClockFace$lambda$0$0$0((SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        CircularLayout(SemanticsModifierKt.semantics(modifierM2822size3ABfNKs, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), OuterCircleToSizeRatio, ComposableLambdaKt.rememberComposableLambda(-99063847, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda12
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return TimePickerKt.ClockFace$lambda$0$1(timePickerColors, intList, analogTimePickerState, z, focusManager, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, DisplayStrings.DS_DIRT_ROADS, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockFace$lambda$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockFace$lambda$0$1(TimePickerColors timePickerColors, final IntList intList, final AnalogTimePickerState analogTimePickerState, final boolean z, final FocusManager focusManager, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-99063847, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1733)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(timePickerColors.m5822clockDialContentColorvNxB06k$material3(false))), ComposableLambdaKt.rememberComposableLambda(-596940007, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda39
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.ClockFace$lambda$0$1$0(intList, analogTimePickerState, z, focusManager, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockFace$lambda$0$1$0(IntList intList, final AnalogTimePickerState analogTimePickerState, final boolean z, final FocusManager focusManager, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596940007, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1736)");
            }
            composer.startReplaceGroup(1866272197);
            int i3 = intList._size;
            for (final int i4 = 0; i4 < i3; i4++) {
                int i5 = (!analogTimePickerState.is24hour() || TimePickerSelectionMode.m5901equalsimpl0(analogTimePickerState.mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI())) ? intList.get(i4) : intList.get(i4) % 12;
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composer.changed(i4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda25
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return TimePickerKt.ClockFace$lambda$0$1$0$0$0$0(i4, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ClockText(SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), analogTimePickerState, i5, z, focusManager, composer, 0);
            }
            composer.endReplaceGroup();
            if (TimePickerSelectionMode.m5901equalsimpl0(analogTimePickerState.mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                composer.startReplaceGroup(2020640431);
                CircularLayout(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM()), Color.Companion.m8263getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), InnerCircleToSizeRatio, ComposableLambdaKt.rememberComposableLambda(-1385767514, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda26
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TimePickerKt.ClockFace$lambda$0$1$0$1(analogTimePickerState, z, focusManager, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, DisplayStrings.DS_DIRT_ROADS, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2021618729);
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
    public static final ab ClockFace$lambda$0$1$0$0$0$0(int i2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i2 + 1.0f);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockFace$lambda$0$1$0$1(AnalogTimePickerState analogTimePickerState, boolean z, FocusManager focusManager, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385767514, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1760)");
            }
            int i3 = ExtraHours._size;
            for (final int i4 = 0; i4 < i3; i4++) {
                int i5 = ExtraHours.get(i4);
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composer.changed(i4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda34
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return TimePickerKt.ClockFace$lambda$0$1$0$1$0$0$0(i4, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ClockText(SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), analogTimePickerState, i5, z, focusManager, composer, 0);
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
    public static final ab ClockFace$lambda$0$1$0$1$0$0$0(int i2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i2 + 12.0f);
        return ab.f48028a;
    }

    static final ab ClockFace$lambda$1(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z, int i2, Composer composer, int i3) {
        ClockFace(modifier, analogTimePickerState, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void ClockText(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i2, final boolean z, final FocusManager focusManager, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        final af afVar;
        final MutableState mutableState;
        final MutableState mutableState2;
        final MutableInteractionSource mutableInteractionSource;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-228814986);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(analogTimePickerState) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(focusManager) ? 8192 : 16384;
        }
        int i6 = i4;
        if (composerStartRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-228814986, i6, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1850)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), composerStartRestartGroup, 6);
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(MaxDistance);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m11287boximpl(IntOffset.Companion.m11307getZeronOccac()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            af afVar2 = (af) objRememberedValue5;
            final String strM5884numberContentDescriptiondSwYdS4 = m5884numberContentDescriptiondSwYdS4(analogTimePickerState.mo4331getSelectionyecRtBI(), analogTimePickerState.is24hour(), i2, composerStartRestartGroup, i6 & DisplayStrings.DS_TAP_TO_VERIFY);
            String localString$default = CalendarLocale_jvmAndAndroidKt.toLocalString$default(i2, 0, 0, false, null, 15, null);
            boolean zChanged = composerStartRestartGroup.changed(analogTimePickerState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda15
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(TimePickerKt.ClockText$lambda$11$0(analogTimePickerState, density, mutableState5));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final State state = (State) objRememberedValue6;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar2) | composerStartRestartGroup.changedInstance(analogTimePickerState) | composerStartRestartGroup.changed(fMo2127toPx0680j_4);
            boolean z2 = (i6 & 7168) == 2048;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance || z2) || objRememberedValue7 == Composer.Companion.getEmpty()) {
                afVar = afVar2;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                Object obj = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda16
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TimePickerKt.ClockText$lambda$13$0(afVar, analogTimePickerState, fMo2127toPx0680j_4, z, mutableState, mutableState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
                objRememberedValue7 = obj;
            } else {
                afVar = afVar2;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
            }
            final a aVar = (a) objRememberedValue7;
            boolean z3 = !InputMode.m9071equalsimpl0(((InputModeManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalInputModeManager())).mo9078getInputModeaOaMEAU(), InputMode.Companion.m9076getTouchaOaMEAU());
            Alignment center = Alignment.Companion.getCenter();
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return TimePickerKt.ClockText$lambda$14$0(mutableState2, mutableState5, mutableState, (LayoutCoordinates) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (l) objRememberedValue8));
            float f2 = MinimumInteractiveSize;
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(modifierMinimumInteractiveComponentSize, f2);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(aVar) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                mutableInteractionSource = mutableInteractionSource2;
                objRememberedValue9 = (l) new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ MutableState<Offset> $center$delegate;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MutableInteractionSource mutableInteractionSource, MutableState<Offset> mutableState, e<? super AnonymousClass1> eVar) {
                            super(2, eVar);
                            this.$interactionSource = mutableInteractionSource;
                            this.$center$delegate = mutableState;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass1(this.$interactionSource, this.$center$delegate, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$interactionSource.emit(new PressInteraction.Press(TimePickerKt.ClockText$lambda$2(this.$center$delegate), null), this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c.b(obj);
                            }
                            return ab.f48028a;
                        }
                    }

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$2, reason: invalid class name */
                    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ MutableState<Offset> $center$delegate;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(MutableInteractionSource mutableInteractionSource, MutableState<Offset> mutableState, e<? super AnonymousClass2> eVar) {
                            super(2, eVar);
                            this.$interactionSource = mutableInteractionSource;
                            this.$center$delegate = mutableState;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass2(this.$interactionSource, this.$center$delegate, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$interactionSource.emit(new PressInteraction.Release(new PressInteraction.Press(TimePickerKt.ClockText$lambda$2(this.$center$delegate), null)), this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c.b(obj);
                            }
                            return ab.f48028a;
                        }
                    }

                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m5887invokeZmokQxo(keyEvent.m9424unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m5887invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        if (KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && TimePickerKt.m5882isEnterZmokQxo(keyEvent)) {
                            aj.z(afVar, null, null, new AnonymousClass1(mutableInteractionSource, mutableState, null), 3);
                        }
                        if (TimePickerKt.m5881isClickZmokQxo(keyEvent)) {
                            aVar.invoke();
                            aj.z(afVar, null, null, new AnonymousClass2(mutableInteractionSource, mutableState, null), 3);
                            return true;
                        }
                        if (KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY())) {
                            if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9189getDirectionDownEK5gGoQ()) || Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                                focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
                                return true;
                            }
                            if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9194getDirectionUpEK5gGoQ()) || Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                                focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
                                return true;
                            }
                        }
                        return false;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                mutableInteractionSource = mutableInteractionSource2;
            }
            Modifier modifierFocusable = FocusableKt.focusable(IndicationKt.indication(KeyInputModifierKt.onKeyEvent(modifierM2822size3ABfNKs, (l) objRememberedValue9), mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, f2 / 2.0f, 0L, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_1, null)), z3, mutableInteractionSource);
            boolean zChanged2 = composerStartRestartGroup.changed(aVar) | composerStartRestartGroup.changed(state);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                objRememberedValue10 = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda18
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return TimePickerKt.ClockText$lambda$16$0(aVar, state, (SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierFocusable, true, (l) objRememberedValue10);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged3 = composerStartRestartGroup.changed(strM5884numberContentDescriptiondSwYdS4);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda19
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return TimePickerKt.ClockText$lambda$17$0$0(strM5884numberContentDescriptiondSwYdS4, (SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m5817TextNvy7gAk(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue11), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 0, 0, 131068);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda20
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return TimePickerKt.ClockText$lambda$18(modifier, analogTimePickerState, i2, z, focusManager, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ClockText$lambda$11$0(AnalogTimePickerState analogTimePickerState, Density density, MutableState mutableState) {
        long selectorPos = getSelectorPos(analogTimePickerState);
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(DpOffset.m11225getXD9Ej5fM(selectorPos));
        float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(DpOffset.m11227getYD9Ej5fM(selectorPos));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMo2127toPx0680j_4);
        return ClockText$lambda$8(mutableState).m8006containsk4lQ0M((Float.floatToRawIntBits(fMo2127toPx0680j_42) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32));
    }

    private static final boolean ClockText$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockText$lambda$13$0(af afVar, AnalogTimePickerState analogTimePickerState, float f2, boolean z, MutableState mutableState, MutableState mutableState2) {
        aj.z(afVar, null, null, new TimePickerKt$ClockText$onClockTextClick$1$1$1(analogTimePickerState, f2, z, mutableState, mutableState2, null), 3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockText$lambda$14$0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
        ClockText$lambda$6(mutableState, parentCoordinates != null ? IntSizeKt.m11345getCenterozmzZPI(parentCoordinates.mo9743getSizeYbymL2g()) : IntOffset.Companion.m11307getZeronOccac());
        mutableState2.setValue(LayoutCoordinatesKt.boundsInParent(layoutCoordinates));
        ClockText$lambda$3(mutableState3, ClockText$lambda$8(mutableState2).m8010getCenterF1C5BW0());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockText$lambda$16$0(final a aVar, State state, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda60
            @Override // h.g.a.a
            public final Object invoke() {
                TimePickerKt.$r8$lambda$myqK2TJN6k2MqNBftFDJZ0YMLUQ(aVar);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, ClockText$lambda$12(state));
        return ab.f48028a;
    }

    private static final boolean ClockText$lambda$16$0$0(a aVar) {
        aVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ClockText$lambda$17$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    static final ab ClockText$lambda$18(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i2, boolean z, FocusManager focusManager, int i3, Composer composer, int i4) {
        ClockText(modifier, analogTimePickerState, i2, z, focusManager, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$2(MutableState<Offset> mutableState) {
        return mutableState.getValue().m7990unboximpl();
    }

    private static final void ClockText$lambda$3(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(Offset.m7969boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$5(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m11305unboximpl();
    }

    private static final void ClockText$lambda$6(MutableState<IntOffset> mutableState, long j2) {
        mutableState.setValue(IntOffset.m11287boximpl(j2));
    }

    private static final Rect ClockText$lambda$8(MutableState<Rect> mutableState) {
        return mutableState.getValue();
    }

    private static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1488)");
            }
            TextStyle textStyleM10559copyp1EtxEg$default = TextStyle.m10559copyp1EtxEg$default((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11011getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.Companion.m10978getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m11000getBothEVpEnUU(), (o) null), 0, 0, null, 15695871, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda31
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.DisplaySeparator$lambda$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m5817TextNvy7gAk(":", null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM10559copyp1EtxEg$default, composer2, 6, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda32
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.DisplaySeparator$lambda$2(modifier, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DisplaySeparator$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab DisplaySeparator$lambda$2(Modifier modifier, int i2, Composer composer, int i3) {
        DisplaySeparator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i3, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1240)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i3 & 126);
            if (timePickerState.is24hour()) {
                composerStartRestartGroup.startReplaceGroup(999020143);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(998576161);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
                int i5 = i3 << 3;
                HorizontalPeriodToggle(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m7164getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m7163getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | (i5 & 112) | 6);
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda43
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.HorizontalClockDisplay$lambda$1(timePickerState, timePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab HorizontalClockDisplay$lambda$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2, Composer composer, int i3) {
        HorizontalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1315)");
            }
            TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            x.d(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.start$default(cornerBasedShape, null, 1, null), ShapesKt.end$default(cornerBasedShape, null, 1, null), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS | (i3 & 112) | (i3 & DisplayStrings.DS_TAP_TO_VERIFY));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda27
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.HorizontalPeriodToggle$lambda$1(modifier2, timePickerState2, timePickerColors2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab HorizontalPeriodToggle$lambda$1(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i2, Composer composer, int i3) {
        HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HorizontalTimePicker(final androidx.compose.material3.AnalogTimePickerState r12, androidx.compose.ui.Modifier r13, androidx.compose.material3.TimePickerColors r14, final boolean r15, androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalTimePicker$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    static final ab HorizontalTimePicker$lambda$2(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i2, int i3, Composer composer, int i4) {
        HorizontalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(measurePolicy) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape2) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i3, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1410)");
            }
            BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m7165getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m5828getPeriodSelectorBorderColor0d7_KjU());
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            x.d(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            final TextStyle value2 = TypographyKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorLabelTextFont(), composerStartRestartGroup, 6);
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_time_picker_period_toggle_description, composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(strM6375getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda44
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.PeriodToggleImpl$lambda$0$0(strM6375getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue)), borderStrokeM1998BorderStrokecXLIe8U, cornerBasedShape);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            boolean z = !isPm(timePickerState);
            int i5 = i3 & 112;
            boolean z2 = i5 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda45
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TimePickerKt.PeriodToggleImpl$lambda$1$0$0(timePickerState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i6 = (i3 << 3) & 7168;
            ToggleItem(z, shape, (a) objRememberedValue2, timePickerColors, ComposableLambdaKt.rememberComposableLambda(1425358052, true, new q() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda46
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TimePickerKt.PeriodToggleImpl$lambda$1$1(value2, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 112) | 24576 | i6);
            SpacerKt.Spacer(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), 2.0f), 0.0f, 1, null), timePickerColors.m5828getPeriodSelectorBorderColor0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            boolean zIsPm = isPm(timePickerState);
            boolean z3 = i5 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda47
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TimePickerKt.PeriodToggleImpl$lambda$1$2$0(timePickerState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ToggleItem(zIsPm, shape2, (a) objRememberedValue3, timePickerColors, ComposableLambdaKt.rememberComposableLambda(-1179219109, true, new q() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda48
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TimePickerKt.PeriodToggleImpl$lambda$1$3(value2, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 112) | 24576 | i6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda49
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.PeriodToggleImpl$lambda$2(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PeriodToggleImpl$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PeriodToggleImpl$lambda$1$0$0(TimePickerState timePickerState) {
        if (isPm(timePickerState) && isHourInputValid(timePickerState)) {
            timePickerState.setHour(timePickerState.getHour() - 12);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PeriodToggleImpl$lambda$1$1(TextStyle textStyle, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1425358052, i2, -1, "androidx.compose.material3.PeriodToggleImpl.<anonymous>.<anonymous> (TimePicker.kt:1437)");
            }
            TextKt.m5817TextNvy7gAk(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_time_picker_am, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PeriodToggleImpl$lambda$1$2$0(TimePickerState timePickerState) {
        if (!isPm(timePickerState) && isHourInputValid(timePickerState)) {
            timePickerState.setHour(timePickerState.getHour() + 12);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PeriodToggleImpl$lambda$1$3(TextStyle textStyle, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179219109, i2, -1, "androidx.compose.material3.PeriodToggleImpl.<anonymous>.<anonymous> (TimePicker.kt:1455)");
            }
            TextKt.m5817TextNvy7gAk(Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_time_picker_pm, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab PeriodToggleImpl$lambda$2(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i2, Composer composer, int i3) {
        PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: SupportingText-73flGVI, reason: not valid java name */
    private static final void m5873SupportingText73flGVI(final Modifier modifier, final int i2, final TimePickerState timePickerState, final boolean z, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        long value;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(474051149);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != ((i3 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(474051149, i4, -1, "androidx.compose.material3.SupportingText (TimePicker.kt:2023)");
            }
            String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo((z && TimePickerSelectionMode.m5901equalsimpl0(i2, TimePickerSelectionMode.Companion.m5905getHouryecRtBI())) ? com.waze.R.string.m3c_time_picker_hour : z ? com.waze.R.string.m3c_time_picker_minute : (TimePickerSelectionMode.m5901equalsimpl0(i2, TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) && timePickerState.is24hour()) ? com.waze.R.string.m3c_time_picker_hour_error_24h : TimePickerSelectionMode.m5901equalsimpl0(i2, TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) ? com.waze.R.string.m3c_time_picker_hour_error : com.waze.R.string.m3c_time_picker_minute_error, composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(296644402);
                value = ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(296642354);
                value = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m4544getError0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j2 = value;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifier, 0.0f, SupportLabelTop, 0.0f, 0.0f, 13, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda28
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.SupportingText_73flGVI$lambda$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m5817TextNvy7gAk(strM6375getString2EP1pXo, SemanticsModifierKt.clearAndSetSemantics(modifierM2759paddingqDBjuR0$default, (l) objRememberedValue), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 2, null, TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont(), composerStartRestartGroup, 6), composer2, 0, 196608, 98296);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda29
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.SupportingText_73flGVI$lambda$1(modifier, i2, timePickerState, z, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SupportingText_73flGVI$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab SupportingText_73flGVI$lambda$1(Modifier modifier, int i2, TimePickerState timePickerState, boolean z, int i3, Composer composer, int i4) {
        m5873SupportingText73flGVI(modifier, i2, timePickerState, z, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    public static final void TimeInput(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-760850373);
        if (i5 == 0) {
            i4 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0 && composerStartRestartGroup.changed(timePickerColors)) {
                i7 = 256;
            }
            i4 |= i7;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            int i8 = i3 & 4;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    modifier = Modifier.Companion;
                }
                if (i8 != 0) {
                    i4 &= -897;
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i8 != 0) {
                    i4 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760850373, i4, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:291)");
            }
            TimeInputImpl(modifier, timePickerColors, timePickerState, composerStartRestartGroup, ((i4 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 3) & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda42
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.TimeInput$lambda$0(timePickerState, modifier2, timePickerColors2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab TimeInput$lambda$0(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i2, int i3, Composer composer, int i4) {
        TimeInput(timePickerState, modifier, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i2) {
        int i3;
        boolean z;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:1096)");
            }
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            int i5 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
            boolean z2 = i5 == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TimePickerKt.TimeInputImpl$lambda$0$0(timePickerState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composerStartRestartGroup, 0);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = TextFieldValue.Companion.getSaver();
            if (i5 != 256) {
                z = (i3 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState);
            } else {
                z = true;
                i5 = 256;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TimePickerKt.TimeInputImpl$lambda$3$0(timePickerState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (a) objRememberedValue2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final Ref ref = (Ref) objRememberedValue3;
            Integer numValueOf = Integer.valueOf(timePickerState.getHour());
            boolean zChangedInstance = (i5 == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) | composerStartRestartGroup.changedInstance(ref) | composerStartRestartGroup.changed(mutableStateRememberSaveable);
            TimePickerKt$TimeInputImpl$1$1 timePickerKt$TimeInputImpl$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || timePickerKt$TimeInputImpl$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$TimeInputImpl$1$1RememberedValue = new TimePickerKt$TimeInputImpl$1$1(ref, timePickerState, mutableStateRememberSaveable, null);
                composerStartRestartGroup.updateRememberedValue(timePickerKt$TimeInputImpl$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(numValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) timePickerKt$TimeInputImpl$1$1RememberedValue, composerStartRestartGroup, 0);
            Integer numValueOf2 = Integer.valueOf(timePickerState.getMinute());
            boolean zChangedInstance2 = (i5 == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) | composerStartRestartGroup.changedInstance(ref) | composerStartRestartGroup.changed(mutableStateRememberSaveable2);
            TimePickerKt$TimeInputImpl$2$1 timePickerKt$TimeInputImpl$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || timePickerKt$TimeInputImpl$2$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$TimeInputImpl$2$1RememberedValue = new TimePickerKt$TimeInputImpl$2$1(ref, timePickerState, mutableStateRememberSaveable2, null);
                composerStartRestartGroup.updateRememberedValue(timePickerKt$TimeInputImpl$2$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(numValueOf2, (p<? super af, ? super e<? super ab>, ? extends Object>) timePickerKt$TimeInputImpl$2$1RememberedValue, composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 48);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            TextStyle textStyleM10559copyp1EtxEg$default = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont(), composerStartRestartGroup, 6), timePickerColors.m5841timeSelectorContentColorvNxB06k$material3(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11011getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            final State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, composerStartRestartGroup, 0, 7);
            final TimeInputErrorHandler timeInputErrorHandlerRememberTimeInputErrorHandler = TimePicker_androidKt.rememberTimeInputErrorHandler(TimeInputImpl$lambda$9$0(stateRememberAccessibilityServiceState), composerStartRestartGroup, 0);
            ProvidedValue[] providedValueArr = {TextKt.getLocalTextStyle().provides(textStyleM10559copyp1EtxEg$default), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)};
            int i6 = i3;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.TimeInputImpl$lambda$9$1(mutableStateRememberSaveable, timePickerState, stateRememberAccessibilityServiceState, ref, timeInputErrorHandlerRememberTimeInputErrorHandler, timePickerColors, mutableStateRememberSaveable2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (timePickerState.is24hour()) {
                composerStartRestartGroup.startReplaceGroup(-1381792405);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1382126833);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
                VerticalPeriodToggle(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m7153getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m7152getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, ((i6 >> 3) & 112) | 6 | ((i6 << 3) & DisplayStrings.DS_TAP_TO_VERIFY));
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda10
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.TimeInputImpl$lambda$10(modifier, timePickerColors, timePickerState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$hourTextValue(TimePickerState timePickerState) {
        return isHourInputValid(timePickerState) ? new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(getHourForDisplay(timePickerState), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (o) null) : new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(timePickerState.getHourInput(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (o) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TimeInputImpl$lambda$0$0(TimePickerState timePickerState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimeInputImpl$hourTextValue(timePickerState), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$1(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    static final ab TimeInputImpl$lambda$10(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, int i2, Composer composer, int i3) {
        TimeInputImpl(modifier, timePickerColors, timePickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TimeInputImpl$lambda$3$0(TimePickerState timePickerState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimeInputImpl$minuteTextValue(timePickerState), null, 2, null);
    }

    private static final TextFieldValue TimeInputImpl$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean TimeInputImpl$lambda$9$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeInputImpl$lambda$9$1(final MutableState mutableState, final TimePickerState timePickerState, final State state, final Ref ref, final TimeInputErrorHandler timeInputErrorHandler, TimePickerColors timePickerColors, final MutableState mutableState2, Composer composer, int i2) {
        Ref ref2;
        TimeInputErrorHandler timeInputErrorHandler2;
        State state2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306700887, i2, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1149)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged = composer.changed(mutableState) | composer.changedInstance(timePickerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (l) new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$3$1$1$1$1
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m5888invokeZmokQxo(keyEvent.m9424unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m5888invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        int iM9437getUtf16CodePointZmokQxo = KeyEvent_androidKt.m9437getUtf16CodePointZmokQxo(keyEvent);
                        if (iM9437getUtf16CodePointZmokQxo >= 48 && iM9437getUtf16CodePointZmokQxo < 58 && TextRange.m10546getStartimpl(TimePickerKt.TimeInputImpl$lambda$1(mutableState).m10831getSelectiond9O1mEE()) == 2 && TimePickerKt.TimeInputImpl$lambda$1(mutableState).getText().length() == 2) {
                            timePickerState.mo4333setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI());
                        }
                        return false;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (l) objRememberedValue);
            TextFieldValue textFieldValueTimeInputImpl$lambda$1 = TimeInputImpl$lambda$1(mutableState);
            boolean zChanged2 = composer.changed(mutableState) | composer.changed(state) | composer.changedInstance(timePickerState) | composer.changedInstance(ref) | composer.changedInstance(timeInputErrorHandler);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                l lVar = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.TimeInputImpl$lambda$9$1$0$1$0(timePickerState, ref, timeInputErrorHandler, mutableState, state, (TextFieldValue) obj);
                    }
                };
                ref2 = ref;
                timeInputErrorHandler2 = timeInputErrorHandler;
                state2 = state;
                composer.updateRememberedValue(lVar);
                objRememberedValue2 = lVar;
            } else {
                ref2 = ref;
                timeInputErrorHandler2 = timeInputErrorHandler;
                state2 = state;
            }
            l lVar2 = (l) objRememberedValue2;
            int iM5905getHouryecRtBI = TimePickerSelectionMode.Companion.m5905getHouryecRtBI();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m10811getNumberPjHm6EE(), ImeAction.Companion.m10733getNexteUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (o) null);
            boolean zChangedInstance = composer.changedInstance(timePickerState);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.TimeInputImpl$lambda$9$1$0$2$0(timePickerState, (KeyboardActionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            m5875TimePickerTextField1vLObsk(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$1, lVar2, timePickerState, iM5905getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (l) objRememberedValue3, null, null, null, 59, null), timePickerColors, composer, 24576, 0);
            DisplaySeparator(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m7152getPeriodSelectorContainerHeightD9Ej5fM()), composer, 6);
            Modifier.Companion companion3 = Modifier.Companion;
            TextFieldValue textFieldValueTimeInputImpl$lambda$4 = TimeInputImpl$lambda$4(mutableState2);
            boolean zChangedInstance2 = composer.changedInstance(timePickerState) | composer.changed(mutableState2) | composer.changedInstance(ref2) | composer.changed(state2) | composer.changedInstance(timeInputErrorHandler2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                final State state3 = state2;
                final Ref ref3 = ref2;
                final TimeInputErrorHandler timeInputErrorHandler3 = timeInputErrorHandler2;
                l lVar3 = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.TimeInputImpl$lambda$9$1$0$3$0(timePickerState, ref3, timeInputErrorHandler3, mutableState2, state3, (TextFieldValue) obj);
                    }
                };
                composer.updateRememberedValue(lVar3);
                objRememberedValue4 = lVar3;
            }
            l lVar4 = (l) objRememberedValue4;
            int iM5906getMinuteyecRtBI = TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI();
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m10811getNumberPjHm6EE(), ImeAction.Companion.m10731getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (o) null);
            boolean zChangedInstance3 = composer.changedInstance(timePickerState);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.TimeInputImpl$lambda$9$1$0$4$0(timePickerState, (KeyboardActionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            m5875TimePickerTextField1vLObsk(companion3, textFieldValueTimeInputImpl$lambda$4, lVar4, timePickerState, iM5906getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (l) objRememberedValue5, null, null, null, 59, null), timePickerColors, composer, 24582, 0);
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
    public static final ab TimeInputImpl$lambda$9$1$0$1$0(TimePickerState timePickerState, Ref ref, TimeInputErrorHandler timeInputErrorHandler, final MutableState mutableState, State state, TextFieldValue textFieldValue) throws NumberFormatException {
        m5886timeInputOnChangeEb28HvY(TimePickerSelectionMode.Companion.m5905getHouryecRtBI(), timePickerState, textFieldValue, TimeInputImpl$lambda$1(mutableState), ref, TimeInputImpl$lambda$9$0(state), timeInputErrorHandler, new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda55
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TimePickerKt.TimeInputImpl$lambda$9$1$0$1$0$0(mutableState, (TextFieldValue) obj);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeInputImpl$lambda$9$1$0$1$0$0(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeInputImpl$lambda$9$1$0$2$0(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.mo4333setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeInputImpl$lambda$9$1$0$3$0(TimePickerState timePickerState, Ref ref, TimeInputErrorHandler timeInputErrorHandler, final MutableState mutableState, State state, TextFieldValue textFieldValue) throws NumberFormatException {
        m5886timeInputOnChangeEb28HvY(TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI(), timePickerState, textFieldValue, TimeInputImpl$lambda$4(mutableState), ref, TimeInputImpl$lambda$9$0(state), timeInputErrorHandler, new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda54
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TimePickerKt.TimeInputImpl$lambda$9$1$0$3$0$0(mutableState, (TextFieldValue) obj);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeInputImpl$lambda$9$1$0$3$0$0(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeInputImpl$lambda$9$1$0$4$0(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.mo4333setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$minuteTextValue(TimePickerState timePickerState) {
        return isMinuteInputValid(timePickerState) ? new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (o) null) : new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(timePickerState.getMinuteInput(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (o) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0154  */
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5874TimePickermT9BvqQ(final androidx.compose.material3.TimePickerState r18, androidx.compose.ui.Modifier r19, androidx.compose.material3.TimePickerColors r20, int r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m5874TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TimePickerState TimePickerState(int i2, int i3, boolean z) {
        return new TimePickerStateImpl(i2, i3, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m5875TimePickerTextField1vLObsk(final androidx.compose.ui.Modifier r114, final androidx.compose.ui.text.input.TextFieldValue r115, final h.g.a.l<? super androidx.compose.ui.text.input.TextFieldValue, h.ab> r116, androidx.compose.material3.TimePickerState r117, int r118, androidx.compose.foundation.text.KeyboardOptions r119, androidx.compose.foundation.text.KeyboardActions r120, final androidx.compose.material3.TimePickerColors r121, androidx.compose.runtime.Composer r122, final int r123, final int r124) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m5875TimePickerTextField1vLObsk(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimePickerTextField_1vLObsk$lambda$1$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, 2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimePickerTextField_1vLObsk$lambda$1$1$1(TextFieldValue textFieldValue, final boolean z, final MutableInteractionSource mutableInteractionSource, final TextFieldColors textFieldColors, p pVar, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changedInstance(pVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1007938103, i3, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:2141)");
            }
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), pVar, true, true, VisualTransformation.Companion.getNone(), mutableInteractionSource, !z, null, null, null, null, null, null, null, textFieldColors, PaddingKt.m2748PaddingValues0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(769667466, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda33
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.TimePickerTextField_1vLObsk$lambda$1$1$1$0(z, mutableInteractionSource, textFieldColors, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ((i3 << 3) & 112) | 224640, 14352384, 16256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimePickerTextField_1vLObsk$lambda$1$1$1$0(boolean z, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(769667466, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:2152)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m5346Container4EFweAY(true, !z, mutableInteractionSource, null, textFieldColors, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer, 6), 0.0f, 0.0f, composer, 100663686, 200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimePickerTextField_1vLObsk$lambda$1$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10334setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m10308getPolite0phEisY());
        return ab.f48028a;
    }

    static final ab TimePickerTextField_1vLObsk$lambda$3(Modifier modifier, TextFieldValue textFieldValue, l lVar, TimePickerState timePickerState, int i2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i3, int i4, Composer composer, int i5) {
        m5875TimePickerTextField1vLObsk(modifier, textFieldValue, lVar, timePickerState, i2, keyboardOptions, keyboardActions, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static final ab TimePicker_mT9BvqQ$lambda$4(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i2, int i3, int i4, Composer composer, int i5) {
        m5874TimePickermT9BvqQ(timePickerState, modifier, timePickerColors, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* renamed from: TimeSelector-u8A1Dfs, reason: not valid java name */
    private static final void m5876TimeSelectoru8A1Dfs(final Modifier modifier, final int i2, final TimePickerState timePickerState, final int i3, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i4) {
        int i5;
        int i6;
        Composer composer2;
        long jM4545getErrorContainer0d7_KjU;
        long jM4551getOnErrorContainer0d7_KjU;
        int i7 = i4 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-883324461);
        if (i7 == 0) {
            i5 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 = i2;
            i5 |= true != composerStartRestartGroup.changed(i6) ? 16 : 32;
        } else {
            i6 = i2;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != ((i4 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 128 : 256;
        }
        if ((i4 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(i3) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changed(timePickerColors) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-883324461, i5, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1513)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            int i8 = 458752 & i5;
            TimePickerKt$TimeSelector$1$1 timePickerKt$TimeSelector$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 == 131072 || timePickerKt$TimeSelector$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$TimeSelector$1$1RememberedValue = new TimePickerKt$TimeSelector$1$1(z, null);
                composerStartRestartGroup.updateRememberedValue(timePickerKt$TimeSelector$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) timePickerKt$TimeSelector$1$1RememberedValue, composerStartRestartGroup, (i5 >> 15) & 14);
            boolean zM5901equalsimpl0 = TimePickerSelectionMode.m5901equalsimpl0(timePickerState.mo4331getSelectionyecRtBI(), i3);
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(true != TimePickerSelectionMode.m5901equalsimpl0(i3, TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) ? com.waze.R.string.m3c_time_picker_minute_selection : com.waze.R.string.m3c_time_picker_hour_selection, composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1528736631);
                composerStartRestartGroup.endReplaceGroup();
                jM4545getErrorContainer0d7_KjU = timePickerColors.m5840timeSelectorContainerColorvNxB06k$material3(zM5901equalsimpl0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1528739041);
                jM4545getErrorContainer0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m4545getErrorContainer0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1528741173);
                composerStartRestartGroup.endReplaceGroup();
                jM4551getOnErrorContainer0d7_KjU = timePickerColors.m5841timeSelectorContentColorvNxB06k$material3(zM5901equalsimpl0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1528743523);
                jM4551getOnErrorContainer0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m4551getOnErrorContainer0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zChanged = composerStartRestartGroup.changed(strM6375getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda56
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.TimeSelector_u8A1Dfs$lambda$1$0(strM6375getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (l) objRememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6);
            boolean z2 = ((i5 & 7168) == 2048) | ((i5 & DisplayStrings.DS_TAP_TO_VERIFY) == 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda57
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TimePickerKt.TimeSelector_u8A1Dfs$lambda$2$0(i3, timePickerState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            a aVar = (a) objRememberedValue2;
            final int i9 = i6;
            final long j2 = jM4551getOnErrorContainer0d7_KjU;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5670Surfaced85dljk(zM5901equalsimpl0, (a<ab>) aVar, modifierSemantics, false, value, jM4545getErrorContainer0d7_KjU, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (p<? super Composer, ? super Integer, ab>) ComposableLambdaKt.rememberComposableLambda(291874429, true, new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda58
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.TimeSelector_u8A1Dfs$lambda$3(i3, timePickerState, i9, j2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 0, 48, DisplayStrings.DS_AUDIO_SDK_DATA_SHARING_IOS_LEARN_MORE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda59
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.TimeSelector_u8A1Dfs$lambda$4(modifier, i2, timePickerState, i3, timePickerColors, z, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeSelector_u8A1Dfs$lambda$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10321getRadioButtono7Vup1c());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TimeSelector_u8A1Dfs$lambda$2$0(int i2, TimePickerState timePickerState) {
        if (!TimePickerSelectionMode.m5901equalsimpl0(i2, timePickerState.mo4331getSelectionyecRtBI())) {
            timePickerState.mo4333setSelection6_8s6DQ(i2);
        }
        return ab.f48028a;
    }

    static final ab TimeSelector_u8A1Dfs$lambda$3(int i2, TimePickerState timePickerState, int i3, long j2, Composer composer, int i4) {
        if (composer.shouldExecute((i4 & 3) != 2, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(291874429, i4, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1548)");
            }
            final String strM5884numberContentDescriptiondSwYdS4 = m5884numberContentDescriptiondSwYdS4(i2, timePickerState.is24hour(), i3, composer, 0);
            Alignment center = Alignment.Companion.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged = composer.changed(strM5884numberContentDescriptiondSwYdS4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda50
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.TimeSelector_u8A1Dfs$lambda$3$0$0$0(strM5884numberContentDescriptiondSwYdS4, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m5817TextNvy7gAk(CalendarLocale_jvmAndAndroidKt.toLocalString$default(i3, 2, 0, false, null, 14, null), SemanticsModifierKt.semantics(companion2, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
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
    public static final ab TimeSelector_u8A1Dfs$lambda$3$0$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    static final ab TimeSelector_u8A1Dfs$lambda$4(Modifier modifier, int i2, TimePickerState timePickerState, int i3, TimePickerColors timePickerColors, boolean z, int i4, Composer composer, int i5) {
        m5876TimeSelectoru8A1Dfs(modifier, i2, timePickerState, i3, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
        return ab.f48028a;
    }

    private static final void ToggleItem(final boolean z, final Shape shape, final a<ab> aVar, final TimePickerColors timePickerColors, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1523811083);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1523811083, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1468)");
            }
            long jM5839periodSelectorContentColorvNxB06k$material3 = timePickerColors.m5839periodSelectorContentColorvNxB06k$material3(z);
            long jM5838periodSelectorContainerColorvNxB06k$material3 = timePickerColors.m5838periodSelectorContainerColorvNxB06k$material3(z);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, true != z ? 1.0f : 0.0f), 0.0f, 1, null);
            int i5 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda40
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TimePickerKt.ToggleItem$lambda$0$0(z, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton(aVar, SemanticsModifierKt.semantics(modifierFillMaxSize$default, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), false, shape, ButtonDefaults.INSTANCE.m4452textButtonColorsro_MJ88(jM5838periodSelectorContainerColorvNxB06k$material3, jM5839periodSelectorContentColorvNxB06k$material3, 0L, 0L, composerStartRestartGroup, 24576, 12), (ButtonElevation) null, (BorderStroke) null, PaddingKt.m2748PaddingValues0680j_4(0.0f), (MutableInteractionSource) null, qVar, composerStartRestartGroup, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & C.ENCODING_PCM_DOUBLE), DisplayStrings.DS_PD_MINUTES_AGO);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda41
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.ToggleItem$lambda$1(z, shape, aVar, timePickerColors, qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ToggleItem$lambda$0$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        return ab.f48028a;
    }

    static final ab ToggleItem$lambda$1(boolean z, Shape shape, a aVar, TimePickerColors timePickerColors, q qVar, int i2, Composer composer, int i3) {
        ToggleItem(z, shape, aVar, timePickerColors, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i3, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1260)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            int iM = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i3 & 126);
            if (timePickerState.is24hour()) {
                composerStartRestartGroup.startReplaceGroup(1364727499);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1364287361);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = TimePickerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
                int i5 = i3 << 3;
                VerticalPeriodToggle(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m7167getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m7166getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | (i5 & 112) | 6);
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda35
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.VerticalClockDisplay$lambda$1(timePickerState, timePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab VerticalClockDisplay$lambda$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2, Composer composer, int i3) {
        VerticalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(timePickerColors) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1361)");
            }
            TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            x.d(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.top$default(cornerBasedShape, null, 1, null), ShapesKt.bottom$default(cornerBasedShape, null, 1, null), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS | (i3 & 112) | (i3 & DisplayStrings.DS_TAP_TO_VERIFY));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda53
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.VerticalPeriodToggle$lambda$1(modifier2, timePickerState2, timePickerColors2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab VerticalPeriodToggle$lambda$1(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i2, Composer composer, int i3) {
        VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalTimePicker(final androidx.compose.material3.AnalogTimePickerState r13, androidx.compose.ui.Modifier r14, androidx.compose.material3.TimePickerColors r15, final boolean r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalTimePicker$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    static final ab VerticalTimePicker$lambda$2(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i2, int i3, Composer composer, int i4) {
        VerticalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f2, float f3) {
        float fAtan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    private static final float dist(float f2, float f3, int i2, int i3) {
        return (float) Math.hypot(i2 - f2, i3 - f3);
    }

    private static final Modifier drawSelector(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new l() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda38
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TimePickerKt.drawSelector$lambda$0(analogTimePickerState, timePickerColors, (ContentDrawScope) obj);
            }
        });
    }

    static final ab drawSelector$lambda$0(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, ContentDrawScope contentDrawScope) {
        float f2 = contentDrawScope.mo2127toPx0680j_4(DpOffset.m11225getXD9Ej5fM(getSelectorPos(analogTimePickerState)));
        float f3 = contentDrawScope.mo2127toPx0680j_4(DpOffset.m11227getYD9Ej5fM(getSelectorPos(analogTimePickerState)));
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        float f4 = contentDrawScope.mo2127toPx0680j_4(TimePickerTokens.INSTANCE.m7160getClockDialSelectorHandleContainerSizeD9Ej5fM()) / 2.0f;
        float f5 = contentDrawScope.mo2121roundToPx0680j_4(analogTimePickerState.m4330getCurrentDiameterD9Ej5fM());
        float f6 = contentDrawScope.mo2121roundToPx0680j_4(TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM());
        long jM5833getSelectorColor0d7_KjU = timePickerColors.m5833getSelectorColor0d7_KjU();
        long jM8254getBlack0d7_KjU = Color.Companion.m8254getBlack0d7_KjU();
        int iM8141getClear0nO6VwU = BlendMode.Companion.m8141getClear0nO6VwU();
        float f7 = (f4 * f5) / f6;
        long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.CC.m8823drawCircleVaOC9Bg$default(contentDrawScope2, jM8254getBlack0d7_KjU, f7, j2, 0.0f, null, null, iM8141getClear0nO6VwU, 56, null);
        contentDrawScope.drawContent();
        DrawScope.CC.m8823drawCircleVaOC9Bg$default(contentDrawScope2, jM5833getSelectorColor0d7_KjU, f7, j2, 0.0f, null, null, BlendMode.Companion.m8169getXor0nO6VwU(), 56, null);
        float f8 = contentDrawScope.mo2127toPx0680j_4(TimePickerTokens.INSTANCE.m7161getClockDialSelectorTrackContainerWidthD9Ej5fM());
        float fCos = (float) Math.cos(analogTimePickerState.getCurrentAngle());
        float fSin = (float) Math.sin(analogTimePickerState.getCurrentAngle());
        DrawScope.CC.m8828drawLineNGM6Ib0$default(contentDrawScope2, jM5833getSelectorColor0d7_KjU, androidx.compose.ui.geometry.SizeKt.m8059getCenteruvyYCjk(contentDrawScope.mo8751getSizeNHjbRc()), Offset.m7984minusMKHz9U(j2, (Float.floatToRawIntBits(f7 * fSin) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f7 * fCos) << 32)), f8, 0, null, 0.0f, null, BlendMode.Companion.m8168getSrcOver0nO6VwU(), 240, null);
        DrawScope.CC.m8823drawCircleVaOC9Bg$default(contentDrawScope2, jM5833getSelectorColor0d7_KjU, contentDrawScope.mo2127toPx0680j_4(TimePickerTokens.INSTANCE.m7159getClockDialSelectorCenterContainerSizeD9Ej5fM()) / 2.0f, androidx.compose.ui.geometry.SizeKt.m8059getCenteruvyYCjk(contentDrawScope.mo8751getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        DrawScope.CC.m8823drawCircleVaOC9Bg$default(contentDrawScope2, timePickerColors.m5822clockDialContentColorvNxB06k$material3(true), f7, j2, 0.0f, null, null, BlendMode.Companion.m8151getDstOver0nO6VwU(), 56, null);
        return ab.f48028a;
    }

    public static final float getClockDialMinContainerSize() {
        return ClockDialMinContainerSize;
    }

    public static final int getDefaultTimePickerLayoutType(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435687004, i2, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.kt:2273)");
        }
        int iDefaultTimePickerLayoutType = TimePicker_androidKt.defaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iDefaultTimePickerLayoutType;
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.is24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return isPm(timePickerState) ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        float fM4330getCurrentDiameterD9Ej5fM;
        float f2;
        float fM4330getCurrentDiameterD9Ej5fM2 = analogTimePickerState.m4330getCurrentDiameterD9Ej5fM() / TimePickerTokens.INSTANCE.m7158getClockDialContainerSizeD9Ej5fM();
        float fM7160getClockDialSelectorHandleContainerSizeD9Ej5fM = TimePickerTokens.INSTANCE.m7160getClockDialSelectorHandleContainerSizeD9Ej5fM() / 2.0f;
        if (analogTimePickerState.is24hour() && isPm(analogTimePickerState) && TimePickerSelectionMode.m5901equalsimpl0(analogTimePickerState.mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI())) {
            fM4330getCurrentDiameterD9Ej5fM = analogTimePickerState.m4330getCurrentDiameterD9Ej5fM();
            f2 = InnerCircleToSizeRatio;
        } else {
            fM4330getCurrentDiameterD9Ej5fM = analogTimePickerState.m4330getCurrentDiameterD9Ej5fM();
            f2 = OuterCircleToSizeRatio;
        }
        float f3 = fM7160getClockDialSelectorHandleContainerSizeD9Ej5fM * fM4330getCurrentDiameterD9Ej5fM2;
        float fM11178unboximpl = ((Dp) n.o(Dp.m11162boximpl((fM4330getCurrentDiameterD9Ej5fM * f2) - f3), Dp.m11162boximpl(0.0f))).m11178unboximpl() + f3;
        float fCos = (float) Math.cos(analogTimePickerState.getCurrentAngle());
        float fM4330getCurrentDiameterD9Ej5fM3 = analogTimePickerState.m4330getCurrentDiameterD9Ej5fM() / 2.0f;
        float fSin = (float) Math.sin(analogTimePickerState.getCurrentAngle());
        float fM4330getCurrentDiameterD9Ej5fM4 = analogTimePickerState.m4330getCurrentDiameterD9Ej5fM() / 2.0f;
        return (Float.floatToRawIntBits((fCos * fM11178unboximpl) + fM4330getCurrentDiameterD9Ej5fM3) << 32) | (Float.floatToRawIntBits((fM11178unboximpl * fSin) + fM4330getCurrentDiameterD9Ej5fM4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m5881isClickZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9433getKeyUpCS__XNY()) && m5882isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    public static final boolean m5882isEnterZmokQxo(android.view.KeyEvent keyEvent) {
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        return Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9188getDirectionCenterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9202getEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9299getNumPadEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9350getSpacebarEK5gGoQ());
    }

    public static final boolean isHourInputValid(TimePickerState timePickerState) {
        int hourInput = timePickerState.getHourInput();
        return hourInput >= 0 && hourInput < 24;
    }

    public static final boolean isInputValid(TimePickerState timePickerState) {
        return isMinuteInputValid(timePickerState) && isHourInputValid(timePickerState);
    }

    public static final boolean isMinuteInputValid(TimePickerState timePickerState) {
        int minuteInput = timePickerState.getMinuteInput();
        return minuteInput >= 0 && minuteInput < 60;
    }

    public static final boolean isPm(TimePickerState timePickerState) {
        return timePickerState.getHour() >= 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m5883moveSelectord3b8Pxo(TimePickerState timePickerState, float f2, float f3, float f4, long j2) {
        if (TimePickerSelectionMode.m5901equalsimpl0(timePickerState.mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) && timePickerState.is24hour()) {
            float fDist = dist(f2, f3, IntOffset.m11296getXimpl(j2), IntOffset.m11297getYimpl(j2));
            if (isPm(timePickerState)) {
                timePickerState.setHour(timePickerState.getHour() - (fDist < f4 ? 0 : 12));
            } else {
                timePickerState.setHour(timePickerState.getHour() + (fDist >= f4 ? 0 : 12));
            }
        }
    }

    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m5884numberContentDescriptiondSwYdS4(int i2, boolean z, int i3, Composer composer, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i4, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2229)");
        }
        String strM6376getStringqBjtwXw = Strings_androidKt.m6376getStringqBjtwXw(TimePickerSelectionMode.m5901equalsimpl0(i2, TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI()) ? com.waze.R.string.m3c_time_picker_minute_suffix : z ? com.waze.R.string.m3c_time_picker_hour_24h_suffix : com.waze.R.string.m3c_time_picker_hour_suffix, new Object[]{Integer.valueOf(i3)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM6376getStringqBjtwXw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (kotlinx.coroutines.aj.q(100, r1) != r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: onTap-uYHVD98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5885onTapuYHVD98(androidx.compose.material3.AnalogTimePickerState r13, float r14, float r15, float r16, boolean r17, long r18, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r20, h.c.e<? super h.ab> r21) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m5885onTapuYHVD98(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, androidx.compose.animation.core.AnimationSpec, h.c.e):java.lang.Object");
    }

    public static final TimePickerState rememberTimePickerState(final int i2, final int i3, final boolean z, Composer composer, int i4, int i5) {
        if ((i5 & 4) != 0) {
            z = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i4, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:601)");
        }
        boolean z2 = true;
        if (1 == (i5 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.Companion.Saver();
        boolean z3 = (((i4 & 14) ^ 6) > 4 && composer.changed(i2)) || (i4 & 6) == 4;
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        boolean z4 = ((((i4 & 112) ^ 48) > 32 && composer.changed(i3)) || (i4 & 48) == 32) | z3;
        if ((((i4 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(z)) && (i4 & 384) != 256) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        Object objRememberedValue = composer.rememberedValue();
        if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda51
                @Override // h.g.a.a
                public final Object invoke() {
                    return TimePickerKt.rememberTimePickerState$lambda$0$0(i2, i3, z);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimePickerStateImpl rememberTimePickerState$lambda$0$0(int i2, int i3, boolean z) {
        return new TimePickerStateImpl(i2, i3, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: IllegalArgumentException -> 0x0123, NumberFormatException -> 0x0126, TryCatch #2 {NumberFormatException -> 0x0126, IllegalArgumentException -> 0x0123, blocks: (B:20:0x005d, B:22:0x0069, B:24:0x0073, B:32:0x00a7, B:35:0x00b5, B:53:0x00de, B:55:0x00e3, B:58:0x00eb, B:60:0x00f8, B:62:0x0103, B:64:0x011b, B:40:0x00c0, B:42:0x00c6, B:46:0x00cf, B:48:0x00d5, B:52:0x00dd, B:59:0x00f5, B:66:0x011f, B:27:0x0084, B:28:0x009a, B:29:0x009b), top: B:71:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf A[Catch: IllegalArgumentException -> 0x0123, NumberFormatException -> 0x0126, PHI: r2
  0x00cf: PHI (r2v6 int) = (r2v5 int), (r2v7 int) binds: [B:39:0x00be, B:45:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {NumberFormatException -> 0x0126, IllegalArgumentException -> 0x0123, blocks: (B:20:0x005d, B:22:0x0069, B:24:0x0073, B:32:0x00a7, B:35:0x00b5, B:53:0x00de, B:55:0x00e3, B:58:0x00eb, B:60:0x00f8, B:62:0x0103, B:64:0x011b, B:40:0x00c0, B:42:0x00c6, B:46:0x00cf, B:48:0x00d5, B:52:0x00dd, B:59:0x00f5, B:66:0x011f, B:27:0x0084, B:28:0x009a, B:29:0x009b), top: B:71:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3 A[Catch: IllegalArgumentException -> 0x0123, NumberFormatException -> 0x0126, TryCatch #2 {NumberFormatException -> 0x0126, IllegalArgumentException -> 0x0123, blocks: (B:20:0x005d, B:22:0x0069, B:24:0x0073, B:32:0x00a7, B:35:0x00b5, B:53:0x00de, B:55:0x00e3, B:58:0x00eb, B:60:0x00f8, B:62:0x0103, B:64:0x011b, B:40:0x00c0, B:42:0x00c6, B:46:0x00cf, B:48:0x00d5, B:52:0x00dd, B:59:0x00f5, B:66:0x011f, B:27:0x0084, B:28:0x009a, B:29:0x009b), top: B:71:0x005d }] */
    /* renamed from: timeInputOnChange-Eb28HvY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m5886timeInputOnChangeEb28HvY(int r8, androidx.compose.material3.TimePickerState r9, androidx.compose.ui.text.input.TextFieldValue r10, androidx.compose.ui.text.input.TextFieldValue r11, androidx.compose.ui.node.Ref<java.lang.Boolean> r12, boolean r13, androidx.compose.material3.TimeInputErrorHandler r14, h.g.a.l<? super androidx.compose.ui.text.input.TextFieldValue, h.ab> r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m5886timeInputOnChangeEb28HvY(int, androidx.compose.material3.TimePickerState, androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.node.Ref, boolean, androidx.compose.material3.TimeInputErrorHandler, h.g.a.l):void");
    }

    private static final Modifier visible(Modifier modifier, boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z) : InspectableValueKt.getNoInspectorInfo()));
    }
}
