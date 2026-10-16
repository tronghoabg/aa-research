package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final float DefaultSwitchPadding = 2.0f;
    private static final float SwitchHeight = 20.0f;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchWidth = 34.0f;
    private static final float ThumbDiameter = 20.0f;
    private static final float ThumbPathLength = 14.0f;
    private static final float ThumbRippleRadius = 24.0f;
    private static final float TrackStrokeWidth = 14.0f;
    private static final float TrackWidth = 34.0f;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1660a = 0;
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    private static final float ThumbDefaultElevation = 1.0f;
    private static final float ThumbPressedElevation = 6.0f;
    private static final float SwitchVelocityThreshold = 125.0f;

    /* JADX WARN: Removed duplicated region for block: B:115:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(final boolean r34, h.g.a.l<? super java.lang.Boolean, h.ab> r35, androidx.compose.ui.Modifier r36, boolean r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, androidx.compose.material.SwitchColors r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, h.g.a.l, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab Switch$lambda$12(boolean z, l lVar, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, int i2, int i3, Composer composer, int i4) {
        Switch(z, lVar, modifier, z2, mutableInteractionSource, switchColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Switch$lambda$6$0(float f2, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(false, f2);
        draggableAnchorsConfig.at(true, f3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Switch$lambda$6$1(float f2) {
        return f2 * 0.7f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Boolean, ab> Switch$lambda$7(State<? extends l<? super Boolean, ab>> state) {
        return (l) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final a<Float> aVar, final InteractionSource interactionSource, Composer composer, final int i2) {
        int i3;
        boolean z3;
        long jSwitchImpl$lambda$4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(70908914);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(switchColors) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(interactionSource) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i3, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = 458752 & i3;
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            SwitchKt$SwitchImpl$1$1 switchKt$SwitchImpl$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 131072 || switchKt$SwitchImpl$1$1RememberedValue == Composer.Companion.getEmpty()) {
                switchKt$SwitchImpl$1$1RememberedValue = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(switchKt$SwitchImpl$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(interactionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) switchKt$SwitchImpl$1$1RememberedValue, composerStartRestartGroup, (i3 >> 15) & 14);
            float f2 = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            int i6 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY);
            final State<Color> stateTrackColor = switchColors.trackColor(z2, z, composerStartRestartGroup, i6);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), 0.0f, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SwitchKt.SwitchImpl$lambda$3$0(stateTrackColor, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CanvasKt.Canvas(modifierFillMaxSize$default, (l) objRememberedValue2, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z2, z, composerStartRestartGroup, i6);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM11178unboximpl = ((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m11178unboximpl() + f2;
            if (!Color.m8229equalsimpl0(SwitchImpl$lambda$4(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m4031getSurface0d7_KjU()) || elevationOverlay == null) {
                z3 = false;
                composerStartRestartGroup.startReplaceGroup(-674751066);
                composerStartRestartGroup.endReplaceGroup();
                jSwitchImpl$lambda$4 = SwitchImpl$lambda$4(stateThumbColor);
            } else {
                composerStartRestartGroup.startReplaceGroup(-674840005);
                z3 = false;
                jSwitchImpl$lambda$4 = elevationOverlay.mo4058apply7g2Lkgo(SwitchImpl$lambda$4(stateThumbColor), fM11178unboximpl, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(jSwitchImpl$lambda$4, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierAlign = boxScope.align(Modifier.Companion, Alignment.Companion.getCenterStart());
            int i7 = i3 & 57344;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i7 == 16384 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SwitchKt.SwitchImpl$lambda$6$0(aVar, (Density) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SpacerKt.Spacer(BackgroundKt.m1971backgroundbw27NRU(ShadowKt.m7823shadows4CzXII$default(SizeKt.m2814requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (l) objRememberedValue3), interactionSource, RippleKt.m4169rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), ThumbDiameter), f2, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$5(stateM1834animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SwitchKt.SwitchImpl$lambda$7(boxScope, z, z2, switchColors, aVar, interactionSource, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long SwitchImpl$lambda$2(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SwitchImpl$lambda$3$0(State state, DrawScope drawScope) {
        m4230drawTrackRPmYEkk(drawScope, SwitchImpl$lambda$2(state), drawScope.mo2127toPx0680j_4(TrackWidth), drawScope.mo2127toPx0680j_4(TrackStrokeWidth));
        return ab.f48028a;
    }

    private static final long SwitchImpl$lambda$4(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    private static final long SwitchImpl$lambda$5(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset SwitchImpl$lambda$6$0(a aVar, Density density) {
        return IntOffset.m11287boximpl(h.h.a.b(((Number) aVar.invoke()).floatValue()) << 32);
    }

    static final ab SwitchImpl$lambda$7(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, a aVar, InteractionSource interactionSource, int i2, Composer composer, int i3) {
        SwitchImpl(boxScope, z, z2, switchColors, aVar, interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    private static final void m4230drawTrackRPmYEkk(DrawScope drawScope, long j2, float f2, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8750getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float f4 = f3 / 2.0f;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f4);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8750getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, (jFloatToRawIntBits << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits2), (Float.floatToRawIntBits(f2 - f4) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f3, StrokeCap.Companion.m8633getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static /* synthetic */ float $r8$lambda$H6UDYW4gCUo2MS1a6S76DHc_kIg(float f2) {
        return f2;
    }

    private static final float Switch$lambda$6$2(float f2) {
        return f2;
    }
}
