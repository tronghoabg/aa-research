package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.RippleThemeConfiguration;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderRange;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.ab;
import h.c.b.a.f;
import h.c.b.a.g;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.am;
import h.g.b.an;
import h.g.b.x;
import h.k.e;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SliderKt {
    private static final VerticalAlignmentLine CornerSizeAlignmentLine;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight = SliderTokens.INSTANCE.m7074getInactiveTrackHeightD9Ej5fM();
    private static final float TrackInsideCornerSize;
    private static final long VerticalThumbSize;
    private static final float insetFocusRingPadding;

    static {
        float fM7072getHandleWidthD9Ej5fM = SliderTokens.INSTANCE.m7072getHandleWidthD9Ej5fM();
        ThumbWidth = fM7072getHandleWidthD9Ej5fM;
        float fM7071getHandleHeightD9Ej5fM = SliderTokens.INSTANCE.m7071getHandleHeightD9Ej5fM();
        ThumbHeight = fM7071getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m11186DpSizeYgX7TsA(fM7072getHandleWidthD9Ej5fM, fM7071getHandleHeightD9Ej5fM);
        VerticalThumbSize = DpKt.m11186DpSizeYgX7TsA(fM7071getHandleHeightD9Ej5fM, fM7072getHandleWidthD9Ej5fM);
        ThumbTrackGapSize = SliderTokens.INSTANCE.m7064getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = 2.0f;
        CornerSizeAlignmentLine = new VerticalAlignmentLine(SliderKt$CornerSizeAlignmentLine$1.INSTANCE);
        insetFocusRingPadding = 4.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final h.k.e<java.lang.Float> r30, final h.g.a.l<? super h.k.e<java.lang.Float>, h.ab> r31, androidx.compose.ui.Modifier r32, boolean r33, h.k.e<java.lang.Float> r34, h.g.a.a<h.ab> r35, androidx.compose.material3.SliderColors r36, androidx.compose.foundation.interaction.MutableInteractionSource r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, h.g.a.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, int r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(h.k.e, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.k.e, h.g.a.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, h.g.a.q, h.g.a.q, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab RangeSlider$lambda$10(boolean z, SliderColors sliderColors, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234185578, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:640)");
        }
        SliderDefaults.INSTANCE.m5582Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 100663296, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSlider$lambda$12$0(l lVar, SliderRange sliderRange) {
        lVar.invoke(n.b(SliderRange.m5615getStartimpl(sliderRange.m5618unboximpl()), SliderRange.m5614getEndInclusiveimpl(sliderRange.m5618unboximpl())));
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$13(e eVar, l lVar, Modifier modifier, boolean z, e eVar2, a aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, q qVar, q qVar2, q qVar3, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        RangeSlider(eVar, lVar, modifier, z, eVar2, aVar, sliderColors, mutableInteractionSource, mutableInteractionSource2, qVar, qVar2, qVar3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$16(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1597255314, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:728)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$17(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1348023737, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:735)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$18(boolean z, SliderColors sliderColors, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-453269015, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:742)");
        }
        SliderDefaults.INSTANCE.m5582Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 100663296, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$2(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-811582901, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:537)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196614, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$20(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, q qVar, q qVar2, q qVar3, int i2, int i3, Composer composer, int i4) {
        RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource2, qVar, qVar2, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$3(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832060001, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:544)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196614, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$4(boolean z, SliderColors sliderColors, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(377064480, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:551)");
        }
        SliderDefaults.INSTANCE.m5582Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 100663296, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$5(e eVar, l lVar, Modifier modifier, boolean z, e eVar2, int i2, a aVar, SliderColors sliderColors, int i3, int i4, Composer composer, int i5) {
        RangeSlider(eVar, lVar, modifier, z, eVar2, i2, aVar, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$8(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-743960051, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:626)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab RangeSlider$lambda$9(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306751174, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:633)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    private static final void RangeSliderImpl(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, final q<? super RangeSliderState, ? super Composer, ? super Integer, ab> qVar, q<? super RangeSliderState, ? super Composer, ? super Integer, ab> qVar2, q<? super RangeSliderState, ? super Composer, ? super Integer, ab> qVar3, Composer composer, final int i2) {
        int i3;
        final MutableInteractionSource mutableInteractionSource3;
        final q<? super RangeSliderState, ? super Composer, ? super Integer, ab> qVar4;
        Composer composer2;
        final q<? super RangeSliderState, ? super Composer, ? super Integer, ab> qVar5;
        int i4;
        Modifier.Companion companionM2755padding3ABfNKs;
        String str;
        Modifier.Companion companionM2755padding3ABfNKs2;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-287468326);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(rangeSliderState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableInteractionSource) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableInteractionSource2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar3) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287468326, i3, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:1231)");
            }
            rangeSliderState.setRtl$material3(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier modifierRangeSliderPressDragModifier = rangeSliderPressDragModifier(Modifier.Companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z);
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.range_start, composerStartRestartGroup, 0);
            String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.range_end, composerStartRestartGroup, 0);
            final boolean z2 = ((RippleThemeConfiguration) composerStartRestartGroup.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(196859559);
                i4 = i3;
                companionM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(IndicationKt.indication(Modifier.Companion, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6), false, true, false, false, 7, null)), insetFocusRingPadding);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i4 = i3;
                composerStartRestartGroup.startReplaceGroup(197421000);
                composerStartRestartGroup.endReplaceGroup();
                companionM2755padding3ABfNKs = Modifier.Companion;
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(197537033);
                str = strM6375getString2EP1pXo2;
                companionM2755padding3ABfNKs2 = PaddingKt.m2755padding3ABfNKs(IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6), false, true, false, false, 7, null)), insetFocusRingPadding);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                str = strM6375getString2EP1pXo2;
                composerStartRestartGroup.startReplaceGroup(198096552);
                composerStartRestartGroup.endReplaceGroup();
                companionM2755padding3ABfNKs2 = Modifier.Companion;
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierThen = SizeKt.m2818requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(modifierRangeSliderPressDragModifier);
            boolean zChanged = composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changedInstance(rangeSliderState);
            SliderKt$RangeSliderImpl$2$1 sliderKt$RangeSliderImpl$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || sliderKt$RangeSliderImpl$2$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$RangeSliderImpl$2$1RememberedValue = new SliderKt$RangeSliderImpl$2$1(z2, rangeSliderState);
                composerStartRestartGroup.updateRememberedValue(sliderKt$RangeSliderImpl$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) sliderKt$RangeSliderImpl$2$1RememberedValue;
            int iM = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            Modifier modifier2 = companionM2755padding3ABfNKs2;
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB).then(companionM2755padding3ABfNKs), null, false, 3, null);
            boolean zChanged2 = composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda28
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$0$0(z2, density, rangeSliderState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierRangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (l) objRememberedValue), rangeSliderState, z);
            boolean zChanged3 = composerStartRestartGroup.changed(strM6375getString2EP1pXo);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda29
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$1$0(strM6375getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierRangeSliderStartThumbSemantics, true, (l) objRememberedValue2);
            int steps = rangeSliderState.getSteps();
            e<Float> valueRange = rangeSliderState.getValueRange();
            float activeRangeStart = rangeSliderState.getActiveRangeStart();
            float activeRangeEnd = rangeSliderState.getActiveRangeEnd();
            boolean zIsRtl$material3 = rangeSliderState.isRtl$material3();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda30
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$2$0(rangeSliderState, (SliderRange) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            Modifier modifierFocusable = FocusableKt.focusable(rangeSliderOnKeyEvents(modifierSemantics, z, steps, valueRange, activeRangeStart, activeRangeEnd, true, zIsRtl$material3, (l) objRememberedValue3, rangeSliderState.getOnValueChangeFinished()), z, mutableInteractionSource);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFocusable);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = (i4 >> 3) & 14;
            qVar.invoke(rangeSliderState, composer2, Integer.valueOf(i6 | ((i4 >> 12) & 112)));
            composer2.endNode();
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB).then(modifier2), null, false, 3, null);
            boolean zChanged4 = composer2.changed(z2) | composer2.changed(density) | composer2.changedInstance(rangeSliderState);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda31
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$4$0(z2, density, rangeSliderState, (IntSize) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierRangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default2, (l) objRememberedValue4), rangeSliderState, z);
            final String str2 = str;
            boolean zChanged5 = composer2.changed(str2);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda32
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$5$0(str2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(modifierRangeSliderEndThumbSemantics, true, (l) objRememberedValue5);
            int steps2 = rangeSliderState.getSteps();
            e<Float> valueRange2 = rangeSliderState.getValueRange();
            float activeRangeStart2 = rangeSliderState.getActiveRangeStart();
            float activeRangeEnd2 = rangeSliderState.getActiveRangeEnd();
            boolean zIsRtl$material32 = rangeSliderState.isRtl$material3();
            boolean zChangedInstance2 = composer2.changedInstance(rangeSliderState);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda33
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$6$0(rangeSliderState, (SliderRange) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierRangeSliderOnKeyEvents = rangeSliderOnKeyEvents(modifierSemantics2, z, steps2, valueRange2, activeRangeStart2, activeRangeEnd2, false, zIsRtl$material32, (l) objRememberedValue6, rangeSliderState.getOnValueChangeFinished());
            mutableInteractionSource3 = mutableInteractionSource2;
            Modifier modifierFocusable2 = FocusableKt.focusable(modifierRangeSliderOnKeyEvents, z, mutableInteractionSource3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFocusable2);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            qVar5 = qVar2;
            qVar5.invoke(rangeSliderState, composer2, Integer.valueOf(i6 | ((i4 >> 15) & 112)));
            composer2.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM4 = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId);
            a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            qVar4 = qVar3;
            qVar4.invoke(rangeSliderState, composer2, Integer.valueOf(i6 | ((i4 >> 18) & 112)));
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            mutableInteractionSource3 = mutableInteractionSource2;
            qVar4 = qVar3;
            composer2 = composerStartRestartGroup;
            qVar5 = qVar2;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda27
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SliderKt.RangeSliderImpl$lambda$2(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource3, qVar, qVar5, qVar4, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$0$0(boolean z, Density density, RangeSliderState rangeSliderState, IntSize intSize) {
        int iMo2121roundToPx0680j_4;
        if (z) {
            float f2 = insetFocusRingPadding;
            iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(f2 + f2);
        } else {
            iMo2121roundToPx0680j_4 = 0;
        }
        rangeSliderState.setStartThumbWidth$material3(((int) (intSize.m11343unboximpl() >> 32)) - iMo2121roundToPx0680j_4);
        rangeSliderState.setStartThumbHeight$material3(((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - iMo2121roundToPx0680j_4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$2$0(RangeSliderState rangeSliderState, SliderRange sliderRange) {
        if (rangeSliderState.getOnValueChange$material3() != null) {
            l<SliderRange, ab> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
            x.c(onValueChange$material3);
            onValueChange$material3.invoke(sliderRange);
        } else {
            rangeSliderState.setActiveRangeStart(SliderRange.m5615getStartimpl(sliderRange.m5618unboximpl()));
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$4$0(boolean z, Density density, RangeSliderState rangeSliderState, IntSize intSize) {
        int iMo2121roundToPx0680j_4;
        if (z) {
            float f2 = insetFocusRingPadding;
            iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(f2 + f2);
        } else {
            iMo2121roundToPx0680j_4 = 0;
        }
        rangeSliderState.setEndThumbWidth$material3(((int) (intSize.m11343unboximpl() >> 32)) - iMo2121roundToPx0680j_4);
        rangeSliderState.setEndThumbHeight$material3(((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - iMo2121roundToPx0680j_4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$5$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$6$0(RangeSliderState rangeSliderState, SliderRange sliderRange) {
        if (rangeSliderState.getOnValueChange$material3() != null) {
            l<SliderRange, ab> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
            x.c(onValueChange$material3);
            onValueChange$material3.invoke(sliderRange);
        } else {
            rangeSliderState.setActiveRangeEnd(SliderRange.m5614getEndInclusiveimpl(sliderRange.m5618unboximpl()));
        }
        return ab.f48028a;
    }

    static final ab RangeSliderImpl$lambda$2(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, q qVar, q qVar2, q qVar3, int i2, Composer composer, int i3) {
        RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, qVar, qVar2, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r28, final h.g.a.l<? super java.lang.Float, h.ab> r29, androidx.compose.ui.Modifier r30, boolean r31, h.g.a.a<h.ab> r32, androidx.compose.material3.SliderColors r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, int r35, h.g.a.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, h.g.a.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, h.k.e<java.lang.Float> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.g.a.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, int, h.g.a.q, h.g.a.q, h.k.e, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab Slider$lambda$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308249025, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:206)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Slider$lambda$10(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2100927368, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:380)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Slider$lambda$11(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81224541, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:387)");
        }
        SliderDefaults.INSTANCE.m5583Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 100663296, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Slider$lambda$13(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, q qVar, q qVar2, int i2, int i3, Composer composer, int i4) {
        Slider(sliderState, modifier, z, sliderColors, mutableInteractionSource, qVar, qVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab Slider$lambda$2(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1843234110, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:213)");
        }
        SliderDefaults.INSTANCE.m5583Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 100663296, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Slider$lambda$3(float f2, l lVar, Modifier modifier, boolean z, e eVar, int i2, a aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i3, int i4, Composer composer, int i5) {
        Slider(f2, lVar, modifier, z, eVar, i2, aVar, sliderColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab Slider$lambda$5(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1689130945, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:293)");
        }
        SliderDefaults.INSTANCE.m5580Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Slider$lambda$6(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-294493388, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:300)");
        }
        SliderDefaults.INSTANCE.m5583Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 100663296, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Slider$lambda$8(float f2, l lVar, Modifier modifier, boolean z, a aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, q qVar, q qVar2, e eVar, int i3, int i4, int i5, Composer composer, int i6) {
        Slider(f2, lVar, modifier, z, aVar, sliderColors, mutableInteractionSource, i2, qVar, qVar2, eVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    private static final void SliderImpl(final Modifier modifier, final SliderState sliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, q<? super SliderState, ? super Composer, ? super Integer, ab> qVar, q<? super SliderState, ? super Composer, ? super Integer, ab> qVar2, Composer composer, final int i2) {
        int i3;
        final q<? super SliderState, ? super Composer, ? super Integer, ab> qVar3;
        Modifier.Companion companionM2755padding3ABfNKs;
        Density density;
        boolean z2;
        q<? super SliderState, ? super Composer, ? super Integer, ab> qVar4 = qVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(898172835);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(sliderState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableInteractionSource) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar4) ? 65536 : 131072;
        }
        boolean z3 = false;
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898172835, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:771)");
            }
            sliderState.setRtl$material3(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            if ((sliderState.getOrientation$material3() == Orientation.Horizontal && sliderState.isRtl$material3()) || (sliderState.getOrientation$material3() == Orientation.Vertical && sliderState.getReverseVerticalDirection$material3())) {
                z3 = true;
            }
            Modifier modifierSliderTapModifier = sliderTapModifier(Modifier.Companion, sliderState, mutableInteractionSource, z);
            Modifier.Companion companion = Modifier.Companion;
            Orientation orientation$material3 = sliderState.getOrientation$material3();
            int i5 = i3;
            boolean zIsDragging = sliderState.isDragging();
            Modifier.Companion companion2 = companion;
            SliderState sliderState2 = sliderState;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sliderState);
            SliderKt$SliderImpl$drag$1$1 sliderKt$SliderImpl$drag$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || sliderKt$SliderImpl$drag$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$SliderImpl$drag$1$1RememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                composerStartRestartGroup.updateRememberedValue(sliderKt$SliderImpl$drag$1$1RememberedValue);
            }
            Modifier modifierDraggable$default = DraggableKt.draggable$default(companion2, sliderState2, orientation$material3, z, mutableInteractionSource, zIsDragging, null, (q) sliderKt$SliderImpl$drag$1$1RememberedValue, z3, 32, null);
            boolean z4 = z3;
            Modifier modifierWrapContentHeight$default = sliderState.getOrientation$material3() == Orientation.Vertical ? SizeKt.wrapContentHeight$default(LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.THUMB), null, false, 3, null) : SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.THUMB), null, false, 3, null);
            final boolean z5 = ((RippleThemeConfiguration) composerStartRestartGroup.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing;
            if (z5) {
                composerStartRestartGroup.startReplaceGroup(-177982557);
                companionM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(IndicationKt.indication(Modifier.Companion, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6), false, true, false, false, 7, null)), insetFocusRingPadding);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-177425921);
                composerStartRestartGroup.endReplaceGroup();
                companionM2755padding3ABfNKs = Modifier.Companion;
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierFocusable = FocusableKt.focusable(sliderSemantics(SizeKt.m2818requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), sliderState.getOrientation$material3() == Orientation.Vertical ? TrackHeight : ThumbWidth, sliderState.getOrientation$material3() == Orientation.Vertical ? ThumbWidth : TrackHeight, 0.0f, 0.0f, 12, null), sliderState, z), z, mutableInteractionSource);
            int steps = sliderState.getSteps();
            Modifier modifier2 = companionM2755padding3ABfNKs;
            e<Float> valueRange = sliderState.getValueRange();
            float value = sliderState.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda43
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.SliderImpl$lambda$2$0(sliderState, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l lVar = (l) objRememberedValue;
            a<ab> onValueChangeFinished = sliderState.getOnValueChangeFinished();
            boolean zIsRtl$material3 = sliderState.isRtl$material3();
            if (sliderState.getOrientation$material3() == Orientation.Vertical) {
                density = density2;
                z2 = true;
            } else {
                density = density2;
                z2 = false;
            }
            Modifier modifierThen = slideOnKeyEvents(modifierFocusable, z, steps, valueRange, value, z4, lVar, onValueChangeFinished, zIsRtl$material3, z2).then(modifierSliderTapModifier).then(modifierDraggable$default);
            boolean zChanged = composerStartRestartGroup.changed(z5) | composerStartRestartGroup.changedInstance(sliderState);
            SliderKt$SliderImpl$3$1 sliderKt$SliderImpl$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || sliderKt$SliderImpl$3$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$SliderImpl$3$1RememberedValue = new SliderKt$SliderImpl$3$1(z5, sliderState);
                composerStartRestartGroup.updateRememberedValue(sliderKt$SliderImpl$3$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) sliderKt$SliderImpl$3$1RememberedValue;
            int iM = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Modifier modifierThen2 = modifierWrapContentHeight$default.then(modifier2);
            final Density density3 = density;
            boolean zChanged2 = composerStartRestartGroup.changed(z5) | composerStartRestartGroup.changed(density3) | composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda44
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.SliderImpl$lambda$1$0$0(z5, density3, sliderState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierThen2, (l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            int i6 = (i5 >> 3) & 14;
            qVar3 = qVar;
            qVar3.invoke(sliderState, composerStartRestartGroup, Integer.valueOf(((i5 >> 9) & 112) | i6));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.TRACK);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = SliderKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            qVar4 = qVar2;
            qVar4.invoke(sliderState, composerStartRestartGroup, Integer.valueOf(i6 | ((i5 >> 12) & 112)));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            qVar3 = qVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final q<? super SliderState, ? super Composer, ? super Integer, ab> qVar5 = qVar4;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda45
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SliderKt.SliderImpl$lambda$4(modifier, sliderState, z, mutableInteractionSource, qVar3, qVar5, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SliderImpl$lambda$1$0$0(boolean z, Density density, SliderState sliderState, IntSize intSize) {
        int iMo2121roundToPx0680j_4;
        if (z) {
            float f2 = insetFocusRingPadding;
            iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(f2 + f2);
        } else {
            iMo2121roundToPx0680j_4 = 0;
        }
        sliderState.setThumbWidth$material3(((int) (intSize.m11343unboximpl() >> 32)) - iMo2121roundToPx0680j_4);
        sliderState.setThumbHeight$material3(((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - iMo2121roundToPx0680j_4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SliderImpl$lambda$2$0(SliderState sliderState, float f2) {
        if (sliderState.getOnValueChange() != null) {
            l<Float, ab> onValueChange = sliderState.getOnValueChange();
            x.c(onValueChange);
            onValueChange.invoke(Float.valueOf(f2));
        } else {
            sliderState.setValue(f2);
        }
        return ab.f48028a;
    }

    static final ab SliderImpl$lambda$4(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, q qVar, q qVar2, int i2, Composer composer, int i3) {
        SliderImpl(modifier, sliderState, z, mutableInteractionSource, qVar, qVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final long SliderRange(e<Float> eVar) {
        float fFloatValue = eVar.getStart().floatValue();
        float fFloatValue2 = eVar.getEndInclusive().floatValue();
        if ((Float.isNaN(fFloatValue) && Float.isNaN(fFloatValue2)) || fFloatValue <= fFloatValue2) {
            long jFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue2);
            SliderRange.Companion companion = SliderRange.Companion;
            return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        throw new IllegalArgumentException("ClosedFloatingPointRange<Float>.start(" + fFloatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + fFloatValue2 + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public static final void m5599Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, final Modifier modifier, SliderColors sliderColors, boolean z, final long j2, final boolean z2, Composer composer, final int i2) {
        int i3;
        SliderColors sliderColors2;
        boolean z3;
        Object obj;
        long j3;
        long jM11255copyDwJknco$default;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2115331054);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(mutableInteractionSource) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            sliderColors2 = sliderColors;
            i3 |= true != composerStartRestartGroup.changed(sliderColors2) ? 128 : 256;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            z3 = z;
            i3 |= true != composerStartRestartGroup.changed(z3) ? 1024 : 2048;
        } else {
            z3 = z;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115331054, i3, -1, "androidx.compose.material3.Thumb (Slider.kt:2451)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = i3 & 14;
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            SliderKt$Thumb$1$1 sliderKt$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || sliderKt$Thumb$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$Thumb$1$1RememberedValue = new SliderKt$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderKt$Thumb$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(mutableInteractionSource, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) sliderKt$Thumb$1$1RememberedValue, composerStartRestartGroup, i5);
            if (snapshotStateList.isEmpty()) {
                obj = null;
                j3 = j2;
            } else {
                if (z2) {
                    obj = null;
                    jM11255copyDwJknco$default = DpSize.m11255copyDwJknco$default(j2, 0.0f, DpSize.m11260getHeightD9Ej5fM(j2) / 2.0f, 1, null);
                } else {
                    obj = null;
                    jM11255copyDwJknco$default = DpSize.m11255copyDwJknco$default(j2, DpSize.m11262getWidthD9Ej5fM(j2) / 2.0f, 0.0f, 2, null);
                }
                j3 = jM11255copyDwJknco$default;
            }
            SpacerKt.Spacer(BackgroundKt.m1971backgroundbw27NRU(PointerIconKt.pointerHoverIcon(HoverableKt.hoverable(SizeKt.m2823size6HolHcs(modifier, j3), mutableInteractionSource, false | (!((2 & 2) == 0))), PointerIcon.Companion.getHand(), false & ((2 & 2) == 0)), sliderColors.m5570thumbColorvNxB06k$material3(z), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final SliderColors sliderColors3 = sliderColors2;
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda37
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return SliderKt.Thumb_9LiSoMs$lambda$2(mutableInteractionSource, modifier, sliderColors3, z4, j2, z2, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final ab Thumb_9LiSoMs$lambda$2(MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j2, boolean z2, int i2, Composer composer, int i3) {
        m5599Thumb9LiSoMs(mutableInteractionSource, modifier, sliderColors, z, j2, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalSlider(final androidx.compose.material3.SliderState r20, androidx.compose.ui.Modifier r21, boolean r22, boolean r23, androidx.compose.material3.SliderColors r24, androidx.compose.foundation.interaction.MutableInteractionSource r25, h.g.a.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, h.g.a.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.VerticalSlider(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab VerticalSlider$lambda$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896624690, i2, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:447)");
        }
        SliderDefaults.INSTANCE.m5581ThumbHwbPF3A(mutableInteractionSource, sliderState, null, sliderColors, z, VerticalThumbSize, composer, ((i2 << 3) & 112) | 1769472, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab VerticalSlider$lambda$2(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1702448035, i2, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:456)");
        }
        SliderDefaults.INSTANCE.m5585TrackmnvyFg4(sliderState, Dp.Companion.m11184getUnspecifiedD9Ej5fM(), (Modifier) null, z, sliderColors, (p<? super DrawScope, ? super Offset, ab>) null, (q<? super DrawScope, ? super Offset, ? super Color, ab>) null, 0.0f, 0.0f, composer, (i2 & 14) | 805306416, DisplayStrings.DS_YOUSRE_A_BABY_WAZER_NOW_H_BUT_NOT_FOR_LONGE_DRIVE_PD_PS_TO_UPDATE_PRICE___);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab VerticalSlider$lambda$4(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, q qVar, q qVar2, int i2, int i3, Composer composer, int i4) {
        VerticalSlider(sliderState, modifier, z, z2, sliderColors, mutableInteractionSource, qVar, qVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5603awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, h.c.e<? super h.k<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.L$0
            h.g.b.an r8 = (h.g.b.an) r8
            e.b.c.b(r12)
            goto L51
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            e.b.c.b(r12)
            h.g.b.an r12 = new h.g.b.an
            r12.<init>()
            androidx.compose.material3.SliderKt$$ExternalSyntheticLambda26 r5 = new androidx.compose.material3.SliderKt$$ExternalSyntheticLambda26
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.internal.DragGestureDetectorCopyKt.m6254awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 == r0) goto L64
            r7 = r12
            r12 = r8
            r8 = r7
        L51:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L62
            float r8 = r8.f48102a
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            h.k r8 = new h.k
            r8.<init>(r12, r9)
            return r8
        L62:
            r8 = 0
            return r8
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m5603awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h.c.e):java.lang.Object");
    }

    static final ab awaitSlop_8vUncbI$lambda$0(an anVar, PointerInputChange pointerInputChange, float f2) {
        pointerInputChange.consume();
        anVar.f48102a = f2;
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        return n.g(f5 == 0.0f ? 0.0f : (f4 - f2) / f5, 0.0f, 1.0f);
    }

    private static final String formatForSemantics(float f2) {
        return String.valueOf(h.h.a.b(f2 * 100.0f) / 100.0f);
    }

    public static final VerticalAlignmentLine getCornerSizeAlignmentLine() {
        return CornerSizeAlignmentLine;
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m5604isSpecifiedIf1S1O4(long j2) {
        return j2 != SliderRange.Companion.m5620getUnspecifiedFYbKRX4();
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z) {
        final e eVarB = n.b(rangeSliderState.getActiveRangeStart(), rangeSliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda10
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SliderKt.rangeSliderEndThumbSemantics$lambda$0(z, rangeSliderState, eVarB, (SemanticsPropertyReceiver) obj);
            }
        }).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeEnd(), eVarB, rangeSliderState.getEndSteps$material3());
    }

    static final ab rangeSliderEndThumbSemantics$lambda$0(boolean z, final RangeSliderState rangeSliderState, final e eVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(rangeSliderState.getActiveRangeEnd()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda38
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SliderKt.rangeSliderEndThumbSemantics$lambda$0$0(eVar, rangeSliderState, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean rangeSliderEndThumbSemantics$lambda$0$0(e eVar, RangeSliderState rangeSliderState, float f2) {
        int endSteps$material3;
        float fG = n.g(f2, ((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue());
        if (rangeSliderState.getEndSteps$material3() > 0 && (endSteps$material3 = rangeSliderState.getEndSteps$material3() + 1) >= 0) {
            float fAbs = fG;
            float f3 = fAbs;
            int i2 = 0;
            while (true) {
                float fLerp = MathHelpersKt.lerp(((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue(), i2 / (rangeSliderState.getEndSteps$material3() + 1));
                float f4 = fLerp - fG;
                if (Math.abs(f4) <= fAbs) {
                    fAbs = Math.abs(f4);
                    f3 = fLerp;
                }
                if (i2 == endSteps$material3) {
                    break;
                }
                i2++;
            }
            fG = f3;
        }
        if (fG == rangeSliderState.getActiveRangeEnd()) {
            return false;
        }
        long jSliderRange = SliderRange(rangeSliderState.getActiveRangeStart(), fG);
        if (!SliderRange.m5613equalsimpl0(jSliderRange, SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
            if (rangeSliderState.getOnValueChange$material3() != null) {
                l<SliderRange, ab> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
                if (onValueChange$material3 != null) {
                    onValueChange$material3.invoke(SliderRange.m5610boximpl(jSliderRange));
                }
            } else {
                rangeSliderState.setActiveRangeStart(SliderRange.m5615getStartimpl(jSliderRange));
                rangeSliderState.setActiveRangeEnd(SliderRange.m5614getEndInclusiveimpl(jSliderRange));
            }
        }
        a<ab> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
        if (onValueChangeFinished == null) {
            return true;
        }
        onValueChangeFinished.invoke();
        return true;
    }

    private static final Modifier rangeSliderOnKeyEvents(Modifier modifier, final boolean z, final int i2, final e<Float> eVar, final float f2, final float f3, final boolean z2, final boolean z3, final l<? super SliderRange, ab> lVar, final a<ab> aVar) {
        if (i2 >= 0) {
            return KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderOnKeyEvents.2
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m5607invokeZmokQxo(keyEvent.m9424unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m5607invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (!z) {
                        return false;
                    }
                    int iM9436getTypeZmokQxo = KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent);
                    if (!KeyEventType.m9428equalsimpl0(iM9436getTypeZmokQxo, KeyEventType.Companion.m9432getKeyDownCS__XNY())) {
                        if (!KeyEventType.m9428equalsimpl0(iM9436getTypeZmokQxo, KeyEventType.Companion.m9433getKeyUpCS__XNY())) {
                            return false;
                        }
                        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                        if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9193getDirectionRightEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9192getDirectionLeftEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9268getMoveHomeEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9267getMoveEndEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9315getPageUpEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9314getPageDownEK5gGoQ())) {
                            return false;
                        }
                        a<ab> aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        return true;
                    }
                    float fFloatValue = eVar.getEndInclusive().floatValue() - eVar.getStart().floatValue();
                    int i3 = i2;
                    float fAbs = Math.abs(fFloatValue) / (i3 > 0 ? i2 + 1 : 100);
                    int i4 = true != z3 ? 1 : -1;
                    if (z2) {
                        e eVarB = n.b(eVar.getStart().floatValue(), f3);
                        long jM9435getKeyZmokQxo2 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                            lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(((Number) n.q(Float.valueOf(f2 + (i4 * fAbs)), eVarB)).floatValue(), f3)));
                            return true;
                        }
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                            lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(((Number) n.q(Float.valueOf(f2 - (i4 * fAbs)), eVarB)).floatValue(), f3)));
                            return true;
                        }
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9315getPageUpEK5gGoQ())) {
                            lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(((Number) n.q(Float.valueOf(f2 + (n.j(r2 / 10, 1, 10) * fAbs)), eVarB)).floatValue(), f3)));
                            return true;
                        }
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9314getPageDownEK5gGoQ())) {
                            lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(((Number) n.q(Float.valueOf(f2 - (n.j(r2 / 10, 1, 10) * fAbs)), eVarB)).floatValue(), f3)));
                            return true;
                        }
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9268getMoveHomeEK5gGoQ())) {
                            lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(eVar.getStart().floatValue(), f3)));
                            return true;
                        }
                        if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9267getMoveEndEK5gGoQ())) {
                            return false;
                        }
                        l<SliderRange, ab> lVar2 = lVar;
                        float f4 = f3;
                        lVar2.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f4, f4)));
                        return true;
                    }
                    e eVarB2 = n.b(f2, eVar.getEndInclusive().floatValue());
                    long jM9435getKeyZmokQxo3 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                        lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f2, ((Number) n.q(Float.valueOf(f3 + (i4 * fAbs)), eVarB2)).floatValue())));
                        return true;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                        lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f2, ((Number) n.q(Float.valueOf(f3 - (i4 * fAbs)), eVarB2)).floatValue())));
                        return true;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9315getPageUpEK5gGoQ())) {
                        lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f2, ((Number) n.q(Float.valueOf(f3 + (n.j(r2 / 10, 1, 10) * fAbs)), eVarB2)).floatValue())));
                        return true;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9314getPageDownEK5gGoQ())) {
                        lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f2, ((Number) n.q(Float.valueOf(f3 - (n.j(r2 / 10, 1, 10) * fAbs)), eVarB2)).floatValue())));
                        return true;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9268getMoveHomeEK5gGoQ())) {
                        l<SliderRange, ab> lVar3 = lVar;
                        float f5 = f2;
                        lVar3.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f5, f5)));
                        return true;
                    }
                    if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9267getMoveEndEK5gGoQ())) {
                        return false;
                    }
                    lVar.invoke(SliderRange.m5610boximpl(SliderKt.SliderRange(f2, eVar.getEndInclusive().floatValue())));
                    return true;
                }
            });
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, final RangeSliderState rangeSliderState, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, new PointerInputEventHandler() { // from class: androidx.compose.material3.SliderKt.rangeSliderPressDragModifier.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
            final class C00721 extends g implements p<af, h.c.e<? super ab>, Object> {
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00731 extends f implements p<AwaitPointerEventScope, h.c.e<? super ab>, Object> {
                    final /* synthetic */ af $$this$coroutineScope;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ RangeSliderState $state;
                    float F$0;
                    float F$1;
                    long J$0;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$3, reason: invalid class name */
                    final class AnonymousClass3 extends g implements p<af, h.c.e<? super ab>, Object> {
                        final /* synthetic */ DragInteraction.Start $interaction;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(MutableInteractionSource mutableInteractionSource, DragInteraction.Start start, h.c.e<? super AnonymousClass3> eVar) {
                            super(2, eVar);
                            this.$interactionSource = mutableInteractionSource;
                            this.$interaction = start;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                            return new AnonymousClass3(this.$interactionSource, this.$interaction, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
                            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$interactionSource.emit(this.$interaction, this) == aVar) {
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
                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$4, reason: invalid class name */
                    final class AnonymousClass4 extends g implements p<af, h.c.e<? super ab>, Object> {
                        final /* synthetic */ DragInteraction $finishInteraction;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass4(MutableInteractionSource mutableInteractionSource, DragInteraction dragInteraction, h.c.e<? super AnonymousClass4> eVar) {
                            super(2, eVar);
                            this.$interactionSource = mutableInteractionSource;
                            this.$finishInteraction = dragInteraction;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                            return new AnonymousClass4(this.$interactionSource, this.$finishInteraction, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
                            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$interactionSource.emit(this.$finishInteraction, this) == aVar) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00731(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, af afVar, h.c.e<? super C00731> eVar) {
                        super(2, eVar);
                        this.$state = rangeSliderState;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$$this$coroutineScope = afVar;
                    }

                    static final ab invokeSuspend$lambda$2(RangeSliderState rangeSliderState, am amVar, PointerInputChange pointerInputChange) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32));
                        boolean z = amVar.f48101a;
                        if (rangeSliderState.isRtl$material3()) {
                            fIntBitsToFloat = -fIntBitsToFloat;
                        }
                        rangeSliderState.onDrag$material3(z, fIntBitsToFloat);
                        pointerInputChange.consume();
                        return ab.f48028a;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                        C00731 c00731 = new C00731(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, eVar);
                        c00731.L$0 = obj;
                        return c00731;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, h.c.e<? super ab> eVar) {
                        return ((C00731) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
                    
                        if (r4 != r0) goto L27;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
                    /* JADX WARN: Removed duplicated region for block: B:111:0x02c9  */
                    /* JADX WARN: Removed duplicated region for block: B:115:0x02f7  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0145 A[Catch: all -> 0x02b4, TryCatch #2 {all -> 0x02b4, blocks: (B:45:0x0137, B:47:0x0145, B:50:0x0155, B:52:0x015b, B:42:0x0112, B:57:0x016e, B:60:0x018e, B:83:0x0244, B:86:0x024c, B:97:0x0287), top: B:120:0x0137 }] */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x020f A[Catch: all -> 0x002a, TryCatch #5 {all -> 0x002a, blocks: (B:8:0x0022, B:74:0x0201, B:76:0x020f, B:78:0x021e, B:77:0x0217), top: B:125:0x0022 }] */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x0217 A[Catch: all -> 0x002a, TryCatch #5 {all -> 0x002a, blocks: (B:8:0x0022, B:74:0x0201, B:76:0x020f, B:78:0x021e, B:77:0x0217), top: B:125:0x0022 }] */
                    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v1 */
                    /* JADX WARN: Type inference failed for: r2v13, types: [h.g.b.am] */
                    /* JADX WARN: Type inference failed for: r2v53 */
                    /* JADX WARN: Type inference failed for: r2v54 */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x012d -> B:120:0x0137). Please report as a decompilation issue!!! */
                    @Override // h.c.b.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 781
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.AnonymousClass1.C00721.C00731.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00721(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, h.c.e<? super C00721> eVar) {
                    super(2, eVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = rangeSliderState;
                    this.$rangeSliderLogic = rangeSliderLogic;
                }

                @Override // h.c.b.a.a
                public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                    C00721 c00721 = new C00721(this.$this_pointerInput, this.$state, this.$rangeSliderLogic, eVar);
                    c00721.L$0 = obj;
                    return c00721;
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
                    return ((C00721) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(this.$this_pointerInput, new C00731(this.$state, this.$rangeSliderLogic, afVar, null), this) == aVar) {
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

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, h.c.e<? super ab> eVar) {
                Object objD = aj.d(new C00721(pointerInputScope, rangeSliderState, new RangeSliderLogic(rangeSliderState, mutableInteractionSource, mutableInteractionSource2), null), eVar);
                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
            }
        }) : modifier;
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z) {
        final e eVarB = n.b(rangeSliderState.getValueRange().getStart().floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda12
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SliderKt.rangeSliderStartThumbSemantics$lambda$0(z, rangeSliderState, eVarB, (SemanticsPropertyReceiver) obj);
            }
        }).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeStart(), eVarB, rangeSliderState.getStartSteps$material3());
    }

    static final ab rangeSliderStartThumbSemantics$lambda$0(boolean z, final RangeSliderState rangeSliderState, final e eVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(rangeSliderState.getActiveRangeStart()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda11
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SliderKt.rangeSliderStartThumbSemantics$lambda$0$0(eVar, rangeSliderState, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean rangeSliderStartThumbSemantics$lambda$0$0(e eVar, RangeSliderState rangeSliderState, float f2) {
        int startSteps$material3;
        float fG = n.g(f2, ((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue());
        if (rangeSliderState.getStartSteps$material3() > 0 && (startSteps$material3 = rangeSliderState.getStartSteps$material3() + 1) >= 0) {
            float fAbs = fG;
            float f3 = fAbs;
            int i2 = 0;
            while (true) {
                float fLerp = MathHelpersKt.lerp(((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue(), i2 / (rangeSliderState.getStartSteps$material3() + 1));
                float f4 = fLerp - fG;
                if (Math.abs(f4) <= fAbs) {
                    fAbs = Math.abs(f4);
                    f3 = fLerp;
                }
                if (i2 == startSteps$material3) {
                    break;
                }
                i2++;
            }
            fG = f3;
        }
        if (fG == rangeSliderState.getActiveRangeStart()) {
            return false;
        }
        long jSliderRange = SliderRange(fG, rangeSliderState.getActiveRangeEnd());
        if (!SliderRange.m5613equalsimpl0(jSliderRange, SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
            if (rangeSliderState.getOnValueChange$material3() != null) {
                l<SliderRange, ab> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
                if (onValueChange$material3 != null) {
                    onValueChange$material3.invoke(SliderRange.m5610boximpl(jSliderRange));
                }
            } else {
                rangeSliderState.setActiveRangeStart(SliderRange.m5615getStartimpl(jSliderRange));
                rangeSliderState.setActiveRangeEnd(SliderRange.m5614getEndInclusiveimpl(jSliderRange));
            }
        }
        a<ab> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
        if (onValueChangeFinished == null) {
            return true;
        }
        onValueChangeFinished.invoke();
        return true;
    }

    public static final RangeSliderState rememberRangeSliderState(float f2, float f3, int i2, a<ab> aVar, e<Float> eVar, Composer composer, int i3, int i4) {
        final e<Float> eVarB = (i4 & 16) != 0 ? n.b(0.0f, 1.0f) : eVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(756708139, i3, -1, "androidx.compose.material3.rememberRangeSliderState (Slider.kt:3523)");
        }
        int i5 = i4 & 1;
        final a<ab> aVar2 = (i4 & 8) != 0 ? null : aVar;
        boolean z = true;
        final float f4 = 1 == i5 ? 0.0f : f2;
        Object[] objArr = new Object[0];
        Saver<RangeSliderState, ?> Saver = RangeSliderState.Companion.Saver(aVar2, eVarB);
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(f4)) || (i3 & 6) == 4;
        if ((i4 & 2) != 0) {
            f3 = 1.0f;
        }
        boolean z3 = (((i3 & 112) ^ 48) > 32 && composer.changed(f3)) || (i3 & 48) == 32;
        final int i6 = (i4 & 4) != 0 ? 0 : i2;
        boolean z4 = z3 | z2 | ((((i3 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(i6)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) > 2048 && composer.changed(aVar2)) || (i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 2048);
        if ((((57344 & i3) ^ 24576) <= 16384 || !composer.changed(eVarB)) && (i3 & 24576) != 16384) {
            z = false;
        }
        boolean z5 = z4 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
            final float f5 = f3;
            a aVar3 = new a() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda13
                @Override // h.g.a.a
                public final Object invoke() {
                    return SliderKt.rememberRangeSliderState$lambda$0$0(f4, f5, i6, aVar2, eVarB);
                }
            };
            composer.updateRememberedValue(aVar3);
            objRememberedValue = aVar3;
        }
        RangeSliderState rangeSliderState = (RangeSliderState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rangeSliderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RangeSliderState rememberRangeSliderState$lambda$0$0(float f2, float f3, int i2, a aVar, e eVar) {
        return new RangeSliderState(f2, f3, i2, aVar, eVar);
    }

    public static final SliderState rememberSliderState(final float f2, final int i2, final a<ab> aVar, final e<Float> eVar, Composer composer, int i3, int i4) {
        if ((i4 & 8) != 0) {
            eVar = n.b(0.0f, 1.0f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193499219, i3, -1, "androidx.compose.material3.rememberSliderState (Slider.kt:3309)");
        }
        int i5 = i4 & 1;
        if ((i4 & 4) != 0) {
            aVar = null;
        }
        boolean z = true;
        if (1 == i5) {
            f2 = 0.0f;
        }
        Object[] objArr = new Object[0];
        Saver<SliderState, ?> Saver = SliderState.Companion.Saver(aVar, eVar);
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(f2)) || (i3 & 6) == 4;
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        boolean z3 = ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32) | z2 | ((((i3 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(aVar)) || (i3 & 384) == 256);
        if ((((i3 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) <= 2048 || !composer.changed(eVar)) && (i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 2048) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda39
                @Override // h.g.a.a
                public final Object invoke() {
                    return SliderKt.rememberSliderState$lambda$0$0(f2, i2, aVar, eVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        SliderState sliderState = (SliderState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sliderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SliderState rememberSliderState$lambda$0$0(float f2, int i2, a aVar, e eVar) {
        return new SliderState(f2, i2, aVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.lerp(f5, f6, calcFraction(f2, f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-2geJ7wY, reason: not valid java name */
    public static final long m5606scale2geJ7wY(boolean z, float f2, float f3, long j2, float f4, float f5) {
        float fScale = scale(f2, f3, SliderRange.m5615getStartimpl(j2), f4, f5);
        float fScale2 = scale(f2, f3, SliderRange.m5614getEndInclusiveimpl(j2), f4, f5);
        return z ? SliderRange(n.f(fScale, fScale2), fScale2) : SliderRange(fScale, n.e(fScale2, fScale));
    }

    private static final Modifier slideOnKeyEvents(Modifier modifier, final boolean z, final int i2, final e<Float> eVar, final float f2, final boolean z2, final l<? super Float, ab> lVar, final a<ab> aVar, boolean z3, final boolean z4) {
        if (i2 >= 0) {
            return KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.SliderKt.slideOnKeyEvents.2
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m5608invokeZmokQxo(keyEvent.m9424unboximpl());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m5608invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (!z) {
                        return false;
                    }
                    int iM9436getTypeZmokQxo = KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent);
                    if (!KeyEventType.m9428equalsimpl0(iM9436getTypeZmokQxo, KeyEventType.Companion.m9432getKeyDownCS__XNY())) {
                        if (!KeyEventType.m9428equalsimpl0(iM9436getTypeZmokQxo, KeyEventType.Companion.m9433getKeyUpCS__XNY())) {
                            return false;
                        }
                        if (z4) {
                            long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                            if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9194getDirectionUpEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9189getDirectionDownEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9268getMoveHomeEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9267getMoveEndEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9315getPageUpEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9314getPageDownEK5gGoQ())) {
                                return false;
                            }
                            a<ab> aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.invoke();
                            }
                            return true;
                        }
                        long jM9435getKeyZmokQxo2 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                        if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9193getDirectionRightEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9192getDirectionLeftEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9268getMoveHomeEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9267getMoveEndEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9315getPageUpEK5gGoQ()) && !Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9314getPageDownEK5gGoQ())) {
                            return false;
                        }
                        a<ab> aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        return true;
                    }
                    float fFloatValue = eVar.getEndInclusive().floatValue() - eVar.getStart().floatValue();
                    int i3 = i2;
                    float fAbs = Math.abs(fFloatValue) / (i3 > 0 ? i2 + 1 : 100);
                    int i4 = true != z2 ? 1 : -1;
                    if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9268getMoveHomeEK5gGoQ())) {
                        lVar.invoke(eVar.getStart());
                        return true;
                    }
                    if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9267getMoveEndEK5gGoQ())) {
                        lVar.invoke(eVar.getEndInclusive());
                        return true;
                    }
                    if (z4) {
                        long jM9435getKeyZmokQxo3 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9194getDirectionUpEK5gGoQ())) {
                            lVar.invoke(n.q(Float.valueOf(f2 - (i4 * fAbs)), eVar));
                            return true;
                        }
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9189getDirectionDownEK5gGoQ())) {
                            lVar.invoke(n.q(Float.valueOf(f2 + (i4 * fAbs)), eVar));
                            return true;
                        }
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9315getPageUpEK5gGoQ())) {
                            lVar.invoke(n.q(Float.valueOf(f2 - ((n.j(r2 / 10, 1, 10) * i4) * fAbs)), eVar));
                            return true;
                        }
                        if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9314getPageDownEK5gGoQ())) {
                            return false;
                        }
                        lVar.invoke(n.q(Float.valueOf(f2 + (n.j(r2 / 10, 1, 10) * i4 * fAbs)), eVar));
                        return true;
                    }
                    long jM9435getKeyZmokQxo4 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo4, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                        lVar.invoke(n.q(Float.valueOf(f2 + (i4 * fAbs)), eVar));
                        return true;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo4, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                        lVar.invoke(n.q(Float.valueOf(f2 - (i4 * fAbs)), eVar));
                        return true;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo4, Key.Companion.m9315getPageUpEK5gGoQ())) {
                        lVar.invoke(n.q(Float.valueOf(f2 + (n.j(r2 / 10, 1, 10) * fAbs)), eVar));
                        return true;
                    }
                    if (!Key.m9115equalsimpl0(jM9435getKeyZmokQxo4, Key.Companion.m9314getPageDownEK5gGoQ())) {
                        return false;
                    }
                    lVar.invoke(n.q(Float.valueOf(f2 - (n.j(r2 / 10, 1, 10) * fAbs)), eVar));
                    return true;
                }
            });
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    private static final Modifier sliderSemantics(Modifier modifier, final SliderState sliderState, final boolean z) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SliderKt.sliderSemantics$lambda$0(z, sliderState, (SemanticsPropertyReceiver) obj);
            }
        }).then(sliderState.getOrientation$material3() == Orientation.Vertical ? AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds() : AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState.getValue(), n.b(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue()), sliderState.getSteps());
    }

    static final ab sliderSemantics$lambda$0(boolean z, final SliderState sliderState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(sliderState.getValue()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda14
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SliderKt.sliderSemantics$lambda$0$0(sliderState, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sliderSemantics$lambda$0$0(SliderState sliderState, float f2) {
        int steps;
        float fG = n.g(f2, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
        if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
            float fAbs = fG;
            float f3 = fAbs;
            int i2 = 0;
            while (true) {
                float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i2 / (sliderState.getSteps() + 1));
                float f4 = fLerp - fG;
                if (Math.abs(f4) <= fAbs) {
                    fAbs = Math.abs(f4);
                    f3 = fLerp;
                }
                if (i2 == steps) {
                    break;
                }
                i2++;
            }
            fG = f3;
        }
        if (fG == sliderState.getValue()) {
            return false;
        }
        if (fG != sliderState.getValue()) {
            if (sliderState.getOnValueChange() != null) {
                l<Float, ab> onValueChange = sliderState.getOnValueChange();
                if (onValueChange != null) {
                    onValueChange.invoke(Float.valueOf(fG));
                }
            } else {
                sliderState.setValue(fG);
            }
        }
        a<ab> onValueChangeFinished = sliderState.getOnValueChangeFinished();
        if (onValueChangeFinished == null) {
            return true;
        }
        onValueChangeFinished.invoke();
        return true;
    }

    private static final Modifier sliderTapModifier(Modifier modifier, final SliderState sliderState, final MutableInteractionSource mutableInteractionSource, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new PointerInputEventHandler() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name and collision with other inner class name */
            final class C00741 extends g implements p<af, h.c.e<? super ab>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ SliderState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                int label;

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00751 extends g implements q<PressGestureScope, Offset, h.c.e<? super ab>, Object> {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ SliderState $state;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00751(MutableInteractionSource mutableInteractionSource, SliderState sliderState, h.c.e<? super C00751> eVar) {
                        super(3, eVar);
                        this.$interactionSource = mutableInteractionSource;
                        this.$state = sliderState;
                    }

                    @Override // h.g.a.q
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, h.c.e<? super ab> eVar) {
                        return m5609invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
                    }

                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m5609invoked4ec7I(PressGestureScope pressGestureScope, long j2, h.c.e<? super ab> eVar) {
                        C00751 c00751 = new C00751(this.$interactionSource, this.$state, eVar);
                        c00751.L$0 = pressGestureScope;
                        c00751.J$0 = j2;
                        return c00751.invokeSuspend(ab.f48028a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
                    
                        if (r3.emit(r4, r8) == r0) goto L34;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.foundation.interaction.PressInteraction$Press] */
                    /* JADX WARN: Type inference failed for: r1v13 */
                    @Override // h.c.b.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                        /*
                            r8 = this;
                            h.c.a.a r0 = h.c.a.a.f48038a
                            int r1 = r8.label
                            r2 = 3
                            r3 = 1
                            if (r1 == 0) goto L2e
                            if (r1 == r3) goto L24
                            r0 = 2
                            if (r1 == r0) goto L20
                            if (r1 == r2) goto L17
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L17:
                            java.lang.Object r8 = r8.L$0
                            java.lang.Throwable r8 = (java.lang.Throwable) r8
                            e.b.c.b(r9)
                            goto L92
                        L20:
                            e.b.c.b(r9)
                            goto L76
                        L24:
                            java.lang.Object r1 = r8.L$0
                            androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L2c
                            goto L58
                        L2c:
                            r9 = move-exception
                            goto L7b
                        L2e:
                            e.b.c.b(r9)
                            java.lang.Object r9 = r8.L$0
                            androidx.compose.foundation.gestures.PressGestureScope r9 = (androidx.compose.foundation.gestures.PressGestureScope) r9
                            long r4 = r8.J$0
                            r1 = 0
                            androidx.compose.foundation.interaction.PressInteraction$Press r6 = new androidx.compose.foundation.interaction.PressInteraction$Press     // Catch: java.lang.Throwable -> L2c
                            r6.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2c
                            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r8.$interactionSource     // Catch: java.lang.Throwable -> L79
                            r7 = r6
                            androidx.compose.foundation.interaction.Interaction r7 = (androidx.compose.foundation.interaction.Interaction) r7     // Catch: java.lang.Throwable -> L79
                            r1.tryEmit(r7)     // Catch: java.lang.Throwable -> L79
                            androidx.compose.material3.SliderState r1 = r8.$state     // Catch: java.lang.Throwable -> L79
                            r1.m5621onPressk4lQ0M$material3(r4)     // Catch: java.lang.Throwable -> L79
                            r1 = r8
                            h.c.e r1 = (h.c.e) r1     // Catch: java.lang.Throwable -> L79
                            r8.L$0 = r6     // Catch: java.lang.Throwable -> L79
                            r8.label = r3     // Catch: java.lang.Throwable -> L79
                            java.lang.Object r9 = r9.tryAwaitRelease(r1)     // Catch: java.lang.Throwable -> L79
                            if (r9 == r0) goto L90
                            r1 = r6
                        L58:
                            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2c
                            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2c
                            if (r9 == 0) goto L68
                            androidx.compose.foundation.interaction.PressInteraction$Release r9 = new androidx.compose.foundation.interaction.PressInteraction$Release     // Catch: java.lang.Throwable -> L2c
                            r9.<init>(r1)     // Catch: java.lang.Throwable -> L2c
                            androidx.compose.foundation.interaction.PressInteraction r9 = (androidx.compose.foundation.interaction.PressInteraction) r9     // Catch: java.lang.Throwable -> L2c
                            goto L6f
                        L68:
                            androidx.compose.foundation.interaction.PressInteraction$Cancel r9 = new androidx.compose.foundation.interaction.PressInteraction$Cancel     // Catch: java.lang.Throwable -> L2c
                            r9.<init>(r1)     // Catch: java.lang.Throwable -> L2c
                            androidx.compose.foundation.interaction.PressInteraction r9 = (androidx.compose.foundation.interaction.PressInteraction) r9     // Catch: java.lang.Throwable -> L2c
                        L6f:
                            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r8.$interactionSource     // Catch: java.lang.Throwable -> L2c
                            androidx.compose.foundation.interaction.Interaction r9 = (androidx.compose.foundation.interaction.Interaction) r9     // Catch: java.lang.Throwable -> L2c
                            r3.tryEmit(r9)     // Catch: java.lang.Throwable -> L2c
                        L76:
                            h.ab r8 = h.ab.f48028a
                            return r8
                        L79:
                            r9 = move-exception
                            r1 = r6
                        L7b:
                            if (r1 == 0) goto L91
                            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r8.$interactionSource
                            androidx.compose.foundation.interaction.PressInteraction$Cancel r4 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                            r4.<init>(r1)
                            androidx.compose.foundation.interaction.Interaction r4 = (androidx.compose.foundation.interaction.Interaction) r4
                            r8.L$0 = r9
                            r8.label = r2
                            java.lang.Object r8 = r3.emit(r4, r8)
                            if (r8 != r0) goto L91
                        L90:
                            return r0
                        L91:
                            r8 = r9
                        L92:
                            throw r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.C03521.C00741.C00751.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00741(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, SliderState sliderState, h.c.e<? super C00741> eVar) {
                    super(2, eVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$interactionSource = mutableInteractionSource;
                    this.$state = sliderState;
                }

                static final ab invokeSuspend$lambda$0(SliderState sliderState, Offset offset) {
                    sliderState.dispatchRawDelta(0.0f);
                    sliderState.getGestureEndAction$material3().invoke();
                    return ab.f48028a;
                }

                @Override // h.c.b.a.a
                public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                    return new C00741(this.$this_pointerInput, this.$interactionSource, this.$state, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
                    return ((C00741) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00751 c00751 = new C00751(this.$interactionSource, this.$state, null);
                        final SliderState sliderState = this.$state;
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00751, new l() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$1$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj2) {
                                return SliderKt.C03521.C00741.invokeSuspend$lambda$0(sliderState, (Offset) obj2);
                            }
                        }, this, 3, null) == aVar) {
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

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, h.c.e<? super ab> eVar) {
                Object objD = aj.d(new C00741(pointerInputScope, mutableInteractionSource, sliderState, null), eVar);
                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
            }
        }) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int iX = h.a.c.x(fArr);
            if (iX == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(MathHelpersKt.lerp(f3, f4, f5) - f2);
                if (iX > 0) {
                    int i2 = 1;
                    while (true) {
                        float f6 = fArr[i2];
                        float fAbs2 = Math.abs(MathHelpersKt.lerp(f3, f4, f6) - f2);
                        int iCompare = Float.compare(fAbs, fAbs2);
                        if (iCompare > 0) {
                            fAbs = fAbs2;
                        }
                        if (iCompare > 0) {
                            f5 = f6;
                        }
                        if (i2 == iX) {
                            break;
                        }
                        i2++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f3, f4, fValueOf.floatValue()) : f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i2) {
        if (i2 == 0) {
            return new float[0];
        }
        int i3 = i2 + 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = i4 / (i2 + 1);
        }
        return fArr;
    }

    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5605isSpecifiedIf1S1O4$annotations(long j2) {
    }

    public static final long SliderRange(float f2, float f3) {
        if ((Float.isNaN(f2) && Float.isNaN(f3)) || f2 <= f3) {
            long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
            SliderRange.Companion companion = SliderRange.Companion;
            return (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        }
        throw new IllegalArgumentException("start(" + f2 + ") must be <= endInclusive(" + f3 + ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r27, final h.g.a.l<? super java.lang.Float, h.ab> r28, androidx.compose.ui.Modifier r29, boolean r30, h.k.e<java.lang.Float> r31, int r32, h.g.a.a<h.ab> r33, androidx.compose.material3.SliderColors r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.k.e, int, h.g.a.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final androidx.compose.material3.SliderState r18, androidx.compose.ui.Modifier r19, boolean r20, androidx.compose.material3.SliderColors r21, androidx.compose.foundation.interaction.MutableInteractionSource r22, h.g.a.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r23, h.g.a.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final h.k.e<java.lang.Float> r28, final h.g.a.l<? super h.k.e<java.lang.Float>, h.ab> r29, androidx.compose.ui.Modifier r30, boolean r31, h.k.e<java.lang.Float> r32, int r33, h.g.a.a<h.ab> r34, androidx.compose.material3.SliderColors r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(h.k.e, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.k.e, int, h.g.a.a, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final androidx.compose.material3.RangeSliderState r22, androidx.compose.ui.Modifier r23, boolean r24, androidx.compose.material3.SliderColors r25, androidx.compose.foundation.interaction.MutableInteractionSource r26, androidx.compose.foundation.interaction.MutableInteractionSource r27, h.g.a.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, h.g.a.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, h.g.a.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, h.g.a.q, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
