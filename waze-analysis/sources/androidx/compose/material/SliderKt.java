package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.am;
import h.g.b.an;
import h.g.b.x;
import h.k.n;
import h.l.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SliderKt {
    private static final float ThumbDefaultElevation = 1.0f;
    private static final float ThumbPressedElevation = 6.0f;
    private static final float ThumbRadius = 10.0f;
    private static final float ThumbRippleRadius = 24.0f;
    private static final float TrackHeight = 4.0f;
    private static final float SliderMinWidth = 144.0f;
    private static final float SliderHeight = 48.0f;
    private static final Modifier DefaultSliderConstraints = SizeKt.m2810heightInVpY3zN4$default(SizeKt.m2829widthInVpY3zN4$default(Modifier.Companion, SliderMinWidth, 0.0f, 2, null), 0.0f, SliderHeight, 1, null);
    private static final TweenSpec<Float> SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SliderKt$animateToTarget$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<DragScope, e<? super ab>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, float f3, float f4, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$current = f2;
            this.$target = f3;
            this.$velocity = f4;
        }

        static final ab invokeSuspend$lambda$0(DragScope dragScope, an anVar, Animatable animatable) {
            dragScope.dragBy(((Number) animatable.getValue()).floatValue() - anVar.f48102a);
            anVar.f48102a = ((Number) animatable.getValue()).floatValue();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$current, this.$target, this.$velocity, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(DragScope dragScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(dragScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final an anVar = new an();
                float f2 = this.$current;
                anVar.f48102a = f2;
                float f3 = this.$target;
                this.label = 1;
                if (AnimatableKt.Animatable$default(f2, 0.0f, 2, null).animateTo(new Float(f3), SliderKt.SliderToTickAnimation, new Float(this.$velocity), new l() { // from class: androidx.compose.material.SliderKt$animateToTarget$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return SliderKt.AnonymousClass2.invokeSuspend$lambda$0(dragScope, anVar, (Animatable) obj2);
                    }
                }, this) == aVar) {
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

    private static final void CorrectValueSideEffect(final l<? super Float, Float> lVar, final h.k.e<Float> eVar, final h.k.e<Float> eVar2, final MutableState<Float> mutableState, final float f2, Composer composer, final int i2) {
        final l<? super Float, Float> lVar2;
        int i3;
        MutableState<Float> mutableState2;
        float f3;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743965752);
        if (i5 == 0) {
            lVar2 = lVar;
            i3 = (true != composerStartRestartGroup.changedInstance(lVar2) ? 2 : 4) | i2;
        } else {
            lVar2 = lVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(eVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(eVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            mutableState2 = mutableState;
            i3 |= true != composerStartRestartGroup.changed(mutableState2) ? 1024 : 2048;
        } else {
            mutableState2 = mutableState;
        }
        if ((i2 & 24576) == 0) {
            f3 = f2;
            i3 |= true != composerStartRestartGroup.changed(f3) ? 8192 : 16384;
        } else {
            f3 = f2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i3, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:927)");
            }
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 14) == 4;
            boolean z3 = (57344 & i3) == 16384;
            boolean z4 = (i3 & 7168) == 2048;
            boolean z5 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z5 || (z | z2 | z3 | z4)) || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState<Float> mutableState3 = mutableState2;
                i4 = 0;
                final float f4 = f3;
                h.g.a.a aVar = new h.g.a.a() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda11
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SliderKt.CorrectValueSideEffect$lambda$0$0(eVar, lVar2, f4, mutableState3, eVar2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(aVar);
                objRememberedValue = aVar;
            } else {
                i4 = 0;
            }
            EffectsKt.SideEffect((h.g.a.a) objRememberedValue, composerStartRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda12
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SliderKt.CorrectValueSideEffect$lambda$1(lVar, eVar, eVar2, mutableState, f2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ab CorrectValueSideEffect$lambda$0$0(h.k.e eVar, l lVar, float f2, MutableState mutableState, h.k.e eVar2) {
        float fFloatValue = ((Number) eVar.getEndInclusive()).floatValue() - ((Number) eVar.getStart()).floatValue();
        float fFloatValue2 = ((Number) lVar.invoke(Float.valueOf(f2))).floatValue();
        if (Math.abs(fFloatValue2 - ((Number) mutableState.getValue()).floatValue()) > fFloatValue / 1000.0f && eVar2.a((Comparable) mutableState.getValue())) {
            mutableState.setValue(Float.valueOf(fFloatValue2));
        }
        return ab.f48028a;
    }

    static final ab CorrectValueSideEffect$lambda$1(l lVar, h.k.e eVar, h.k.e eVar2, MutableState mutableState, float f2, int i2, Composer composer, int i3) {
        CorrectValueSideEffect(lVar, eVar, eVar2, mutableState, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final h.k.e<java.lang.Float> r39, final h.g.a.l<? super h.k.e<java.lang.Float>, h.ab> r40, androidx.compose.ui.Modifier r41, boolean r42, h.k.e<java.lang.Float> r43, int r44, h.g.a.a<h.ab> r45, androidx.compose.material.SliderColors r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(h.k.e, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.k.e, int, h.g.a.a, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ab RangeSlider$lambda$4(h.k.e eVar, final h.k.e eVar2, final List list, final h.g.a.a aVar, final State state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, int i2, SliderColors sliderColors, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i3) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i4;
        final an anVar;
        Object obj;
        final an anVar2;
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        final MutableFloatState mutableFloatState3;
        final MutableFloatState mutableFloatState4;
        an anVar3;
        final State state2;
        final h.k.e eVar3 = eVar;
        if ((i3 & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i4 = i3 | (true != composer.changed(boxWithConstraintsScope2) ? 2 : 4);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i4 = i3;
        }
        if (composer.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652589923, i4, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:418)");
            }
            boolean z2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk());
            an anVar4 = new an();
            an anVar5 = new an();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            float f2 = ThumbRadius;
            float f3 = iM11107getMaxWidthimpl;
            anVar4.f48102a = f3 - density.mo2127toPx0680j_4(f2);
            anVar5.f48102a = density.mo2127toPx0680j_4(f2);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(RangeSlider$lambda$4$scaleToOffset(eVar3, anVar5, anVar4, ((Number) eVar2.getStart()).floatValue()));
                composer.updateRememberedValue(objRememberedValue);
            }
            final MutableFloatState mutableFloatState5 = (MutableFloatState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(RangeSlider$lambda$4$scaleToOffset(eVar3, anVar5, anVar4, ((Number) eVar2.getEndInclusive()).floatValue()));
                composer.updateRememberedValue(objRememberedValue2);
            }
            final MutableFloatState mutableFloatState6 = (MutableFloatState) objRememberedValue2;
            boolean zChanged = composer.changed(eVar3) | composer.changed(anVar5.f48102a) | composer.changed(anVar4.f48102a);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (f) new SliderKt$RangeSlider$2$2$1(eVar3, anVar5, anVar4);
                composer.updateRememberedValue(objRememberedValue3);
            }
            CorrectValueSideEffect((l) ((f) objRememberedValue3), eVar3, n.b(anVar5.f48102a, anVar4.f48102a), mutableFloatState5, ((Number) eVar2.getStart()).floatValue(), composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
            boolean zChanged2 = composer.changed(eVar3) | composer.changed(anVar5.f48102a) | composer.changed(anVar4.f48102a);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (f) new SliderKt$RangeSlider$2$3$1(eVar3, anVar5, anVar4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            CorrectValueSideEffect((l) ((f) objRememberedValue4), eVar3, n.b(anVar5.f48102a, anVar4.f48102a), mutableFloatState6, ((Number) eVar2.getEndInclusive()).floatValue(), composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
            boolean z3 = z2;
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue5);
            }
            final af afVar = (af) objRememberedValue5;
            boolean zChangedInstance = composer.changedInstance(list) | composer.changed(anVar5.f48102a) | composer.changed(anVar4.f48102a) | composer.changed(aVar) | composer.changedInstance(afVar) | composer.changed(state) | composer.changed(eVar3);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                anVar = anVar4;
                anVar2 = anVar5;
                obj = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda13
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return SliderKt.RangeSlider$lambda$4$5$0(mutableFloatState5, mutableFloatState6, list, anVar2, anVar, aVar, afVar, state, eVar3, ((Boolean) obj2).booleanValue());
                    }
                };
                mutableFloatState = mutableFloatState6;
                mutableFloatState2 = mutableFloatState5;
                eVar3 = eVar3;
                composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue6;
                anVar = anVar4;
                anVar2 = anVar5;
                mutableFloatState2 = mutableFloatState5;
                mutableFloatState = mutableFloatState6;
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState((l) obj, composer, 0);
            boolean zChanged3 = composer.changed(eVar3) | composer.changed(anVar2.f48102a) | composer.changed(anVar.f48102a) | composer.changed(eVar2) | composer.changed(state);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                final h.k.e eVar4 = eVar3;
                mutableFloatState3 = mutableFloatState2;
                mutableFloatState4 = mutableFloatState;
                Object obj2 = new p() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.p
                    public final Object invoke(Object obj3, Object obj4) {
                        return SliderKt.RangeSlider$lambda$4$6$0(mutableFloatState3, mutableFloatState4, eVar2, anVar2, anVar, state, eVar4, ((Boolean) obj3).booleanValue(), ((Float) obj4).floatValue());
                    }
                };
                anVar3 = anVar;
                state2 = state;
                composer.updateRememberedValue(obj2);
                objRememberedValue7 = obj2;
            } else {
                mutableFloatState3 = mutableFloatState2;
                mutableFloatState4 = mutableFloatState;
                anVar3 = anVar;
                state2 = state;
            }
            an anVar6 = anVar2;
            Modifier modifierRangeSliderPressDragModifier = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableFloatState3, mutableFloatState4, z, z3, f3, eVar, stateRememberUpdatedState, SnapshotStateKt.rememberUpdatedState((p) objRememberedValue7, composer, 0));
            final float fG = n.g(((Number) eVar2.getStart()).floatValue(), ((Number) eVar.getStart()).floatValue(), ((Number) eVar2.getEndInclusive()).floatValue());
            final float fG2 = n.g(((Number) eVar2.getEndInclusive()).floatValue(), ((Number) eVar2.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue());
            float fCalcFraction = calcFraction(((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue(), fG);
            float fCalcFraction2 = calcFraction(((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue(), fG2);
            float f4 = i2;
            float fFloor = (float) Math.floor(f4 * fCalcFraction2);
            float fFloor2 = (float) Math.floor(f4 * (1.0f - fCalcFraction));
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged4 = composer.changed(state2) | composer.changed(fG2);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda15
                    @Override // h.g.a.l
                    public final Object invoke(Object obj3) {
                        return SliderKt.RangeSlider$lambda$4$7$0(state2, fG2, ((Float) obj3).floatValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierSliderSemantics = sliderSemantics(companion, fG, z, (l) objRememberedValue8, aVar, n.b(((Number) eVar.getStart()).floatValue(), fG2), (int) fFloor);
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged5 = composer.changed(state2) | composer.changed(fG);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda16
                    @Override // h.g.a.l
                    public final Object invoke(Object obj3) {
                        return SliderKt.RangeSlider$lambda$4$8$0(state2, fG, ((Float) obj3).floatValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            RangeSliderImpl(z, fCalcFraction, fCalcFraction2, list, sliderColors, anVar3.f48102a - anVar6.f48102a, mutableInteractionSource, mutableInteractionSource2, modifierRangeSliderPressDragModifier, modifierSliderSemantics, sliderSemantics(companion2, fG2, z, (l) objRememberedValue9, aVar, n.b(fG, ((Number) eVar.getEndInclusive()).floatValue()), (int) fFloor2), composer, 14155776, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSlider$lambda$4$5$0(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List list, an anVar, an anVar2, h.g.a.a aVar, af afVar, State state, h.k.e eVar, boolean z) {
        float floatValue = (true != z ? mutableFloatState2 : mutableFloatState).getFloatValue();
        float fSnapValueToTick = snapValueToTick(floatValue, list, anVar.f48102a, anVar2.f48102a);
        if (floatValue != fSnapValueToTick) {
            aj.z(afVar, null, null, new SliderKt$RangeSlider$2$gestureEndAction$1$1$1(floatValue, fSnapValueToTick, aVar, z, mutableFloatState, mutableFloatState2, state, anVar, anVar2, eVar, null), 3);
            return ab.f48028a;
        }
        if (aVar != null) {
            aVar.invoke();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ab RangeSlider$lambda$4$6$0(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, h.k.e eVar, an anVar, an anVar2, State state, h.k.e eVar2, boolean z, float f2) {
        h.k.e eVarB;
        if (z) {
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f2);
            mutableFloatState2.setFloatValue(RangeSlider$lambda$4$scaleToOffset(eVar2, anVar, anVar2, ((Number) eVar.getEndInclusive()).floatValue()));
            float floatValue = mutableFloatState2.getFloatValue();
            eVarB = n.b(n.g(mutableFloatState.getFloatValue(), anVar.f48102a, floatValue), floatValue);
        } else {
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f2);
            mutableFloatState.setFloatValue(RangeSlider$lambda$4$scaleToOffset(eVar2, anVar, anVar2, ((Number) eVar.getStart()).floatValue()));
            float floatValue2 = mutableFloatState.getFloatValue();
            eVarB = n.b(floatValue2, n.g(mutableFloatState2.getFloatValue(), floatValue2, anVar2.f48102a));
        }
        ((l) state.getValue()).invoke(RangeSlider$lambda$4$scaleToUserValue(anVar, anVar2, eVar2, eVarB));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSlider$lambda$4$7$0(State state, float f2, float f3) {
        ((l) state.getValue()).invoke(n.b(f3, f2));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSlider$lambda$4$8$0(State state, float f2, float f3) {
        ((l) state.getValue()).invoke(n.b(f2, f3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSlider$lambda$4$scaleToOffset(h.k.e<Float> eVar, an anVar, an anVar2, float f2) {
        return scale(eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue(), f2, anVar.f48102a, anVar2.f48102a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.k.e<Float> RangeSlider$lambda$4$scaleToUserValue(an anVar, an anVar2, h.k.e<Float> eVar, h.k.e<Float> eVar2) {
        return scale(anVar.f48102a, anVar2.f48102a, eVar2, eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue());
    }

    static final ab RangeSlider$lambda$5(h.k.e eVar, l lVar, Modifier modifier, boolean z, h.k.e eVar2, int i2, h.g.a.a aVar, SliderColors sliderColors, int i3, int i4, Composer composer, int i5) {
        RangeSlider(eVar, lVar, modifier, z, eVar2, i2, aVar, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    private static final void RangeSliderImpl(final boolean z, final float f2, final float f3, final List<Float> list, final SliderColors sliderColors, final float f4, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, Modifier modifier3, Composer composer, final int i2, final int i3) {
        int i4;
        List<Float> list2;
        SliderColors sliderColors2;
        int i5;
        final Modifier modifier4;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-278895713);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            list2 = list;
            i4 |= true != composerStartRestartGroup.changedInstance(list2) ? 1024 : 2048;
        } else {
            list2 = list;
        }
        if ((i2 & 24576) == 0) {
            sliderColors2 = sliderColors;
            i4 |= true != composerStartRestartGroup.changed(sliderColors2) ? 8192 : 16384;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f4) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(mutableInteractionSource) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(mutableInteractionSource2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier2) ? 268435456 : 536870912;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != composerStartRestartGroup.changed(modifier3) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-278895713, i7, i5, "androidx.compose.material.RangeSliderImpl (Slider.kt:724)");
            }
            final String strM4215getString4foXLRw = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4213getSliderRangeStartUdPEhr4(), composerStartRestartGroup, 6);
            final String strM4215getString4foXLRw2 = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4212getSliderRangeEndUdPEhr4(), composerStartRestartGroup, 6);
            Modifier modifierThen = modifier.then(DefaultSliderConstraints);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(TrackHeight);
            float f5 = ThumbRadius;
            float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(f5);
            float fMo2123toDpu2uoSUM = density.mo2123toDpu2uoSUM(f4);
            float f6 = f5 + f5;
            float f7 = fMo2123toDpu2uoSUM * f2;
            float f8 = fMo2123toDpu2uoSUM * f3;
            int i8 = i7 >> 9;
            int i9 = i7 << 6;
            Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()), 0.0f, 1, null), sliderColors2, z, f2, f3, list2, fMo2127toPx0680j_42, fMo2127toPx0680j_4, composerStartRestartGroup, (i9 & 7168) | (i8 & 112) | (i9 & DisplayStrings.DS_TAP_TO_VERIFY) | (i9 & 57344) | (i9 & 458752));
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composerStartRestartGroup.changed(strM4215getString4foXLRw);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$1$0(strM4215getString4foXLRw, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i10 = i7 & 57344;
            int i11 = (i7 << 15) & 458752;
            m4189SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (l) objRememberedValue), true, mutableInteractionSource).then(modifier2), f7, mutableInteractionSource, sliderColors, z, f6, composerStartRestartGroup, (i8 & 7168) | 1572870 | i10 | i11);
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged2 = composerStartRestartGroup.changed(strM4215getString4foXLRw2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.RangeSliderImpl$lambda$0$2$0(strM4215getString4foXLRw2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            modifier4 = modifier3;
            m4189SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion2, true, (l) objRememberedValue2), true, mutableInteractionSource2).then(modifier4), f8, mutableInteractionSource2, sliderColors, z, f6, composerStartRestartGroup, ((i7 >> 12) & 7168) | 1572870 | i10 | i11);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier4 = modifier3;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SliderKt.RangeSliderImpl$lambda$1(z, f2, f3, list, sliderColors, f4, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RangeSliderImpl$lambda$0$2$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    static final ab RangeSliderImpl$lambda$1(boolean z, float f2, float f3, List list, SliderColors sliderColors, float f4, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, int i2, int i3, Composer composer, int i4) {
        RangeSliderImpl(z, f2, f3, list, sliderColors, f4, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r41, final h.g.a.l<? super java.lang.Float, h.ab> r42, androidx.compose.ui.Modifier r43, boolean r44, h.k.e<java.lang.Float> r45, int r46, h.g.a.a<h.ab> r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.material.SliderColors r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.k.e, int, h.g.a.a, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ab Slider$lambda$3(final h.k.e eVar, float f2, final List list, final h.g.a.a aVar, MutableInteractionSource mutableInteractionSource, boolean z, SliderColors sliderColors, final State state, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i3;
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        an anVar;
        an anVar2;
        final SliderDraggableState sliderDraggableState;
        final an anVar3;
        Composer composer2;
        an anVar4;
        if ((i2 & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope2) ? 2 : 4);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085116814, i3, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:195)");
            }
            boolean z2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk());
            final an anVar5 = new an();
            final an anVar6 = new an();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            float f3 = ThumbRadius;
            float f4 = iM11107getMaxWidthimpl;
            anVar5.f48102a = Math.max(f4 - density.mo2127toPx0680j_4(f3), 0.0f);
            anVar6.f48102a = Math.min(density.mo2127toPx0680j_4(f3), anVar5.f48102a);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            final af afVar = (af) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Slider$lambda$3$scaleToOffset(eVar, anVar6, anVar5, f2));
                composer.updateRememberedValue(objRememberedValue2);
            }
            final MutableFloatState mutableFloatState3 = (MutableFloatState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final MutableFloatState mutableFloatState4 = (MutableFloatState) objRememberedValue3;
            boolean zChanged = composer.changed(anVar6.f48102a) | composer.changed(anVar5.f48102a) | composer.changed(eVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                mutableFloatState = mutableFloatState3;
                mutableFloatState2 = mutableFloatState4;
                anVar = anVar6;
                anVar2 = anVar5;
                SliderDraggableState sliderDraggableState2 = new SliderDraggableState(new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda19
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.Slider$lambda$3$3$0(mutableFloatState3, mutableFloatState4, anVar6, anVar5, state, eVar, ((Float) obj).floatValue());
                    }
                });
                composer.updateRememberedValue(sliderDraggableState2);
                objRememberedValue4 = sliderDraggableState2;
            } else {
                mutableFloatState = mutableFloatState3;
                mutableFloatState2 = mutableFloatState4;
                anVar = anVar6;
                anVar2 = anVar5;
            }
            SliderDraggableState sliderDraggableState3 = (SliderDraggableState) objRememberedValue4;
            boolean zChanged2 = composer.changed(eVar) | composer.changed(anVar.f48102a) | composer.changed(anVar2.f48102a);
            SliderKt$Slider$2$2$1 sliderKt$Slider$2$2$1RememberedValue = composer.rememberedValue();
            if (zChanged2 || sliderKt$Slider$2$2$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$Slider$2$2$1RememberedValue = new SliderKt$Slider$2$2$1(eVar, anVar, anVar2);
                composer.updateRememberedValue(sliderKt$Slider$2$2$1RememberedValue);
            }
            CorrectValueSideEffect((l) ((f) sliderKt$Slider$2$2$1RememberedValue), eVar, n.b(anVar.f48102a, anVar2.f48102a), mutableFloatState, f2, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
            boolean zChangedInstance = composer.changedInstance(list) | composer.changed(anVar.f48102a) | composer.changed(anVar2.f48102a) | composer.changedInstance(afVar) | composer.changedInstance(sliderDraggableState3) | composer.changed(aVar);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                sliderDraggableState = sliderDraggableState3;
                anVar3 = anVar2;
                final an anVar7 = anVar;
                final MutableFloatState mutableFloatState5 = mutableFloatState;
                composer2 = composer;
                l lVar = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda20
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SliderKt.Slider$lambda$3$5$0(mutableFloatState5, list, anVar7, anVar3, afVar, sliderDraggableState, aVar, ((Float) obj).floatValue());
                    }
                };
                anVar4 = anVar7;
                composer2.updateRememberedValue(lVar);
                objRememberedValue5 = lVar;
            } else {
                composer2 = composer;
                sliderDraggableState = sliderDraggableState3;
                anVar3 = anVar2;
                anVar4 = anVar;
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState((l) objRememberedValue5, composer2, 0);
            SliderDraggableState sliderDraggableState4 = sliderDraggableState;
            Composer composer3 = composer2;
            Modifier modifierSliderTapModifier = sliderTapModifier(Modifier.Companion, sliderDraggableState4, mutableInteractionSource, f4, z2, mutableFloatState, stateRememberUpdatedState, mutableFloatState2, z);
            Modifier.Companion companion = Modifier.Companion;
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState.isDragging();
            Modifier.Companion companion2 = companion;
            boolean zChanged3 = composer3.changed(stateRememberUpdatedState);
            SliderKt$Slider$2$drag$1$1 sliderKt$Slider$2$drag$1$1RememberedValue = composer3.rememberedValue();
            if (zChanged3 || sliderKt$Slider$2$drag$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$Slider$2$drag$1$1RememberedValue = new SliderKt$Slider$2$drag$1$1(stateRememberUpdatedState, null);
                composer3.updateRememberedValue(sliderKt$Slider$2$drag$1$1RememberedValue);
            }
            SliderImpl(z, calcFraction(((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue(), n.g(f2, ((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue())), list, sliderColors, anVar3.f48102a - anVar4.f48102a, mutableInteractionSource, modifierSliderTapModifier.then(DraggableKt.draggable$default(companion2, sliderDraggableState4, orientation, z, mutableInteractionSource, zIsDragging, null, (q) sliderKt$Slider$2$drag$1$1RememberedValue, z2, 32, null)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Slider$lambda$3$3$0(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, an anVar, an anVar2, State state, h.k.e eVar, float f2) {
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f2 + mutableFloatState2.getFloatValue());
        mutableFloatState2.setFloatValue(0.0f);
        ((l) state.getValue()).invoke(Float.valueOf(Slider$lambda$3$scaleToUserValue(anVar, anVar2, eVar, n.g(mutableFloatState.getFloatValue(), anVar.f48102a, anVar2.f48102a))));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Slider$lambda$3$5$0(MutableFloatState mutableFloatState, List list, an anVar, an anVar2, af afVar, SliderDraggableState sliderDraggableState, h.g.a.a aVar, float f2) {
        float floatValue = mutableFloatState.getFloatValue();
        float fSnapValueToTick = snapValueToTick(floatValue, list, anVar.f48102a, anVar2.f48102a);
        if (floatValue != fSnapValueToTick) {
            aj.z(afVar, null, null, new SliderKt$Slider$2$gestureEndAction$1$1$1(sliderDraggableState, floatValue, fSnapValueToTick, f2, aVar, null), 3);
        } else if (!sliderDraggableState.isDragging() && aVar != null) {
            aVar.invoke();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Slider$lambda$3$scaleToOffset(h.k.e<Float> eVar, an anVar, an anVar2, float f2) {
        return scale(eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue(), f2, anVar.f48102a, anVar2.f48102a);
    }

    private static final float Slider$lambda$3$scaleToUserValue(an anVar, an anVar2, h.k.e<Float> eVar, float f2) {
        return scale(anVar.f48102a, anVar2.f48102a, f2, eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue());
    }

    static final ab Slider$lambda$4(float f2, l lVar, Modifier modifier, boolean z, h.k.e eVar, int i2, h.g.a.a aVar, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, int i3, int i4, Composer composer, int i5) {
        Slider(f2, lVar, modifier, z, eVar, i2, aVar, mutableInteractionSource, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    private static final void SliderImpl(final boolean z, final float f2, final List<Float> list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i2) {
        int i3;
        List<Float> list2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1679682785);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            list2 = list;
            i3 |= true != composerStartRestartGroup.changedInstance(list2) ? 128 : 256;
        } else {
            list2 = list;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(sliderColors) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableInteractionSource) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 524288 : 1048576;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1679682785, i5, -1, "androidx.compose.material.SliderImpl (Slider.kt:683)");
            }
            Modifier modifierThen = modifier.then(DefaultSliderConstraints);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(TrackHeight);
            float f4 = ThumbRadius;
            float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(f4);
            float f5 = f4 + f4;
            float fMo2123toDpu2uoSUM = density.mo2123toDpu2uoSUM(f3) * f2;
            int i6 = i5 >> 6;
            int i7 = i5 << 9;
            Track(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), sliderColors, z, 0.0f, f2, list2, fMo2127toPx0680j_42, fMo2127toPx0680j_4, composerStartRestartGroup, (i6 & 112) | DisplayStrings.DS_AAOS_SOUND_OFF | ((i5 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | (i7 & 57344) | (i7 & 458752));
            m4189SliderThumbPcYyNuk(boxScopeInstance, Modifier.Companion, fMo2123toDpu2uoSUM, mutableInteractionSource, sliderColors, z, f5, composerStartRestartGroup, ((i5 << 3) & 57344) | (i6 & 7168) | 1572918 | ((i5 << 15) & 458752));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda21
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SliderKt.SliderImpl$lambda$1(z, f2, list, sliderColors, f3, mutableInteractionSource, modifier, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab SliderImpl$lambda$1(boolean z, float f2, List list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, Modifier modifier, int i2, Composer composer, int i3) {
        SliderImpl(z, f2, list, sliderColors, f3, mutableInteractionSource, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    private static final void m4189SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f2, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f3, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableInteractionSource) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(sliderColors) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 524288 : 1048576;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i3, -1, "androidx.compose.material.SliderThumb (Slider.kt:787)");
            }
            Modifier modifierAlign = boxScope.align(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, f2, 0.0f, 0.0f, 0.0f, 14, null), Alignment.Companion.getCenterStart());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = i3 & 7168;
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            SliderKt$SliderThumb$1$1$1 sliderKt$SliderThumb$1$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 2048 || sliderKt$SliderThumb$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$SliderThumb$1$1$1RememberedValue = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderKt$SliderThumb$1$1$1RememberedValue);
            }
            int i6 = i3 >> 9;
            EffectsKt.LaunchedEffect(mutableInteractionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) sliderKt$SliderThumb$1$1$1RememberedValue, composerStartRestartGroup, i6 & 14);
            float f4 = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            Modifier modifierHoverable = HoverableKt.hoverable(IndicationKt.indication(SizeKt.m2824sizeVpY3zN4(modifier, f3, f3), mutableInteractionSource, RippleKt.m4169rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), mutableInteractionSource, false | (!((2 & 2) == 0)));
            if (!z) {
                f4 = 0.0f;
            }
            SpacerKt.Spacer(BackgroundKt.m1971backgroundbw27NRU(ShadowKt.m7823shadows4CzXII$default(modifierHoverable, f4, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, composerStartRestartGroup, ((i3 >> 15) & 14) | (i6 & 112)).getValue().m8238unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SliderKt.SliderThumb_PcYyNuk$lambda$1(boxScope, modifier, f2, mutableInteractionSource, sliderColors, z, f3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab SliderThumb_PcYyNuk$lambda$1(BoxScope boxScope, Modifier modifier, float f2, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, float f3, int i2, Composer composer, int i3) {
        m4189SliderThumbPcYyNuk(boxScope, modifier, f2, mutableInteractionSource, sliderColors, z, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f2, final float f3, final List<Float> list, final float f4, final float f5, Composer composer, final int i2) {
        int i3;
        float f6;
        float f7;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1833126050);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(sliderColors) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            f6 = f2;
            i3 |= true != composerStartRestartGroup.changed(f6) ? 1024 : 2048;
        } else {
            f6 = f2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f4) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            f7 = f5;
            i3 |= true != composerStartRestartGroup.changed(f7) ? 4194304 : 8388608;
        } else {
            f7 = f5;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1833126050, i3, -1, "androidx.compose.material.Track (Slider.kt:833)");
            }
            int i6 = ((i3 >> 6) & 14) | 48 | ((i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY);
            final State<Color> stateTrackColor = sliderColors.trackColor(z, false, composerStartRestartGroup, i6);
            final State<Color> stateTrackColor2 = sliderColors.trackColor(z, true, composerStartRestartGroup, i6);
            final State<Color> stateTickColor = sliderColors.tickColor(z, false, composerStartRestartGroup, i6);
            final State<Color> stateTickColor2 = sliderColors.tickColor(z, true, composerStartRestartGroup, i6);
            boolean zChanged = ((3670016 & i3) == 1048576) | composerStartRestartGroup.changed(stateTrackColor);
            boolean z2 = (29360128 & i3) == 8388608;
            boolean zChanged2 = composerStartRestartGroup.changed(stateTrackColor2) | zChanged | z2 | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(stateTickColor) | composerStartRestartGroup.changed(stateTickColor2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                i4 = i3;
                final float f8 = f7;
                final float f9 = f6;
                Object obj = new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return SliderKt.Track$lambda$0$0(f4, stateTrackColor, f8, f3, f9, stateTrackColor2, list, stateTickColor, stateTickColor2, (DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                i4 = i3;
            }
            CanvasKt.Canvas(modifier, (l) objRememberedValue, composerStartRestartGroup, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return SliderKt.Track$lambda$1(modifier, sliderColors, z, f2, f3, list, f4, f5, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Track$lambda$0$0(float f2, State state, float f3, float f4, float f5, State state2, List list, State state3, State state4, DrawScope drawScope) {
        LayoutDirection layoutDirection = drawScope.getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
        long jMo8750getCenterF1C5BW0 = drawScope.mo8750getCenterF1C5BW0();
        long j2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo8750getCenterF1C5BW0 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - f2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo8750getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat3);
        long jM8238unboximpl = ((Color) state.getValue()).m8238unboximpl();
        int iM8633getRoundKaPHkGw = StrokeCap.Companion.m8633getRoundKaPHkGw();
        long j3 = jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j4 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        long j5 = (jFloatToRawIntBits3 << 32) | j3;
        long j6 = layoutDirection == layoutDirection2 ? j5 : j4;
        long j7 = layoutDirection == layoutDirection2 ? j4 : j5;
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, jM8238unboximpl, j6, j7, f3, iM8633getRoundKaPHkGw, null, 0.0f, null, 0, 480, null);
        long j8 = j6;
        int i2 = (int) (j7 >> 32);
        int i3 = (int) (j8 >> 32);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i3) + ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i3)) * f4);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawScope.mo8750getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
        float fIntBitsToFloat6 = Float.intBitsToFloat(i3) + ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i3)) * f5);
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (drawScope.mo8750getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, ((Color) state2.getValue()).m8238unboximpl(), (Float.floatToRawIntBits(fIntBitsToFloat6) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat7) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f3, StrokeCap.Companion.m8633getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            float fFloatValue = ((Number) obj).floatValue();
            Boolean boolValueOf = Boolean.valueOf(fFloatValue > f4 || fFloatValue < f5);
            Object obj2 = linkedHashMap.get(boolValueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(boolValueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            int i4 = 0;
            while (i4 < size) {
                long j9 = j2;
                char c3 = c2;
                arrayList.add(Offset.m7969boximpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (OffsetKt.m8003lerpWko1d7g(j8, r2, ((Number) list2.get(i4)).floatValue()) >> c3))) << c3) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo8750getCenterF1C5BW0() & j9))) & j9)));
                i4++;
                c2 = c3;
                j2 = j9;
                j8 = j8;
            }
            long j10 = j2;
            long j11 = j8;
            char c4 = c2;
            DrawScope.CC.m8833drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m8578getPointsr_lszbg(), ((Color) (true != zBooleanValue ? state4 : state3).getValue()).m8238unboximpl(), f3, StrokeCap.Companion.m8633getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            c2 = c4;
            j2 = j10;
            j8 = j11;
        }
        return ab.f48028a;
    }

    static final ab Track$lambda$1(Modifier modifier, SliderColors sliderColors, boolean z, float f2, float f3, List list, float f4, float f5, int i2, Composer composer, int i3) {
        Track(modifier, sliderColors, z, f2, f3, list, f4, f5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f2, float f3, float f4, e<? super ab> eVar) {
        Object objDrag$default = DraggableState.CC.drag$default(draggableState, null, new AnonymousClass2(f2, f3, f4, null), eVar, 1, null);
        return objDrag$default == a.f48038a ? objDrag$default : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4191awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, h.c.e<? super h.k<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
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
            androidx.compose.material.SliderKt$$ExternalSyntheticLambda10 r5 = new androidx.compose.material.SliderKt$$ExternalSyntheticLambda10
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m4061awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m4191awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h.c.e):java.lang.Object");
    }

    static final ab awaitSlop_8vUncbI$lambda$0(an anVar, PointerInputChange pointerInputChange, float f2) {
        pointerInputChange.consume();
        anVar.f48102a = f2;
        return ab.f48028a;
    }

    private static final float calcFraction(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        float f6 = f5 == 0.0f ? 0.0f : (f4 - f2) / f5;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 > 1.0f) {
            return 1.0f;
        }
        return f7;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final State<Float> state, final State<Float> state2, boolean z, final boolean z2, final float f2, h.k.e<Float> eVar, final State<? extends l<? super Boolean, ab>> state3, final State<? extends p<? super Boolean, ? super Float, ab>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f2), Boolean.valueOf(z2), eVar}, new PointerInputEventHandler() { // from class: androidx.compose.material.SliderKt.rangeSliderPressDragModifier.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
            final class C00611 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ State<l<Boolean, ab>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<p<Boolean, Float, ab>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00621 extends h.c.b.a.f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                    final /* synthetic */ af $$this$coroutineScope;
                    final /* synthetic */ State<l<Boolean, ab>> $gestureEndAction;
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ State<p<Boolean, Float, ab>> $onDrag;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ State<Float> $rawOffsetEnd;
                    final /* synthetic */ State<Float> $rawOffsetStart;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ am $draggingStart;
                        final /* synthetic */ DragInteraction $finishInteraction;
                        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(RangeSliderLogic rangeSliderLogic, am amVar, DragInteraction dragInteraction, e<? super AnonymousClass2> eVar) {
                            super(2, eVar);
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$draggingStart = amVar;
                            this.$finishInteraction = dragInteraction;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            a aVar = a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.f48101a).emit(this.$finishInteraction, this) == aVar) {
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
                    /* JADX WARN: Multi-variable type inference failed */
                    C00621(boolean z, float f2, RangeSliderLogic rangeSliderLogic, State<Float> state, af afVar, State<? extends l<? super Boolean, ab>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, ab>> state4, e<? super C00621> eVar) {
                        super(2, eVar);
                        this.$isRtl = z;
                        this.$maxPx = f2;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$rawOffsetStart = state;
                        this.$$this$coroutineScope = afVar;
                        this.$gestureEndAction = state2;
                        this.$rawOffsetEnd = state3;
                        this.$onDrag = state4;
                    }

                    static final ab invokeSuspend$lambda$1(State state, am amVar, boolean z, PointerInputChange pointerInputChange) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32));
                        p pVar = (p) state.getValue();
                        Boolean boolValueOf = Boolean.valueOf(amVar.f48101a);
                        if (z) {
                            fIntBitsToFloat = -fIntBitsToFloat;
                        }
                        pVar.invoke(boolValueOf, Float.valueOf(fIntBitsToFloat));
                        return ab.f48028a;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        C00621 c00621 = new C00621(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, eVar);
                        c00621.L$0 = obj;
                        return c00621;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                        return ((C00621) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x018d A[Catch: CancellationException -> 0x019f, TryCatch #0 {CancellationException -> 0x019f, blocks: (B:8:0x001c, B:52:0x0185, B:54:0x018d, B:55:0x0195), top: B:63:0x001c }] */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0195 A[Catch: CancellationException -> 0x019f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x019f, blocks: (B:8:0x001c, B:52:0x0185, B:54:0x018d, B:55:0x0195), top: B:63:0x001c }] */
                    @Override // h.c.b.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                        /*
                            Method dump skipped, instructions count: 457
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.AnonymousClass1.C00611.C00621.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00611(PointerInputScope pointerInputScope, boolean z, float f2, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends l<? super Boolean, ab>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, ab>> state4, e<? super C00611> eVar) {
                    super(2, eVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$isRtl = z;
                    this.$maxPx = f2;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    C00611 c00611 = new C00611(this.$this_pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, eVar);
                    c00611.L$0 = obj;
                    return c00611;
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00611) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(this.$this_pointerInput, new C00621(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, afVar, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == aVar) {
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
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar2) {
                Object objD = aj.d(new C00611(pointerInputScope, z2, f2, new RangeSliderLogic(mutableInteractionSource, mutableInteractionSource2, state, state2, state4), state, state3, state2, state4, null), eVar2);
                return objD == a.f48038a ? objD : ab.f48028a;
            }
        }) : modifier;
    }

    private static final h.k.e<Float> scale(float f2, float f3, h.k.e<Float> eVar, float f4, float f5) {
        return n.b(scale(f2, f3, eVar.getStart().floatValue(), f4, f5), scale(f2, f3, eVar.getEndInclusive().floatValue(), f4, f5));
    }

    private static final Modifier slideOnKeyEvents(Modifier modifier, final boolean z, final int i2, final h.k.e<Float> eVar, final float f2, final boolean z2, final State<? extends l<? super Float, ab>> state, final State<? extends h.g.a.a<ab>> state2) {
        if (i2 >= 0) {
            return KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material.SliderKt.slideOnKeyEvents.2
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m4192invokeZmokQxo(keyEvent.m9424unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m4192invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    boolean z3 = false;
                    if (!z) {
                        return false;
                    }
                    int iM9436getTypeZmokQxo = KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent);
                    if (KeyEventType.m9428equalsimpl0(iM9436getTypeZmokQxo, KeyEventType.Companion.m9432getKeyDownCS__XNY())) {
                        float fFloatValue = eVar.getEndInclusive().floatValue() - eVar.getStart().floatValue();
                        int i3 = i2;
                        float fAbs = Math.abs(fFloatValue) / (i3 > 0 ? i2 + 1 : 100);
                        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9194getDirectionUpEK5gGoQ())) {
                            state.getValue().invoke(n.q(Float.valueOf(f2 + fAbs), eVar));
                        } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9189getDirectionDownEK5gGoQ())) {
                            state.getValue().invoke(n.q(Float.valueOf(f2 - fAbs), eVar));
                        } else {
                            if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                                state.getValue().invoke(n.q(Float.valueOf(f2 + ((true != z2 ? 1 : -1) * fAbs)), eVar));
                            } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                                state.getValue().invoke(n.q(Float.valueOf(f2 - ((true != z2 ? 1 : -1) * fAbs)), eVar));
                            } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9268getMoveHomeEK5gGoQ())) {
                                state.getValue().invoke(eVar.getStart());
                            } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9267getMoveEndEK5gGoQ())) {
                                state.getValue().invoke(eVar.getEndInclusive());
                            } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9315getPageUpEK5gGoQ())) {
                                state.getValue().invoke(n.q(Float.valueOf(f2 - (n.j(r2 / 10, 1, 10) * fAbs)), eVar));
                            } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9314getPageDownEK5gGoQ())) {
                                state.getValue().invoke(n.q(Float.valueOf(f2 + (n.j(r2 / 10, 1, 10) * fAbs)), eVar));
                            }
                        }
                        z3 = true;
                    } else if (KeyEventType.m9428equalsimpl0(iM9436getTypeZmokQxo, KeyEventType.Companion.m9433getKeyUpCS__XNY())) {
                        long jM9435getKeyZmokQxo2 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                        if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9194getDirectionUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9189getDirectionDownEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9193getDirectionRightEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9192getDirectionLeftEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9268getMoveHomeEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9267getMoveEndEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9315getPageUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9314getPageDownEK5gGoQ())) {
                            h.g.a.a<ab> value = state2.getValue();
                            if (value != null) {
                                value.invoke();
                            }
                            z3 = true;
                        }
                    }
                    return Boolean.valueOf(z3);
                }
            });
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    private static final Modifier sliderSemantics(Modifier modifier, float f2, final boolean z, final l<? super Float, ab> lVar, final h.g.a.a<ab> aVar, final h.k.e<Float> eVar, final int i2) {
        final float fG = n.g(f2, eVar.getStart().floatValue(), eVar.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda22
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SliderKt.sliderSemantics$lambda$0(z, eVar, i2, fG, lVar, aVar, (SemanticsPropertyReceiver) obj);
            }
        }), f2, eVar, i2);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f2, boolean z, l lVar, h.g.a.a aVar, h.k.e eVar, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            eVar = n.b(0.0f, 1.0f);
        }
        h.k.e eVar2 = eVar;
        if ((i3 & 8) != 0) {
            aVar = null;
        }
        h.g.a.a aVar2 = aVar;
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        return sliderSemantics(modifier, f2, z, lVar, aVar2, eVar2, i2);
    }

    static final ab sliderSemantics$lambda$0(boolean z, final h.k.e eVar, final int i2, final float f2, final l lVar, final h.g.a.a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda17
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SliderKt.sliderSemantics$lambda$0$0(eVar, i2, f2, lVar, aVar, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean sliderSemantics$lambda$0$0(h.k.e eVar, int i2, float f2, l lVar, h.g.a.a aVar, float f3) {
        int i3;
        float fG = n.g(f3, ((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue());
        if (i2 > 0 && (i3 = i2 + 1) >= 0) {
            float fAbs = fG;
            float f4 = fAbs;
            int i4 = 0;
            while (true) {
                float fLerp = MathHelpersKt.lerp(((Number) eVar.getStart()).floatValue(), ((Number) eVar.getEndInclusive()).floatValue(), i4 / i3);
                float f5 = fLerp - fG;
                if (Math.abs(f5) <= fAbs) {
                    fAbs = Math.abs(f5);
                    f4 = fLerp;
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
            fG = f4;
        }
        if (fG == f2) {
            return false;
        }
        lVar.invoke(Float.valueOf(fG));
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    private static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f2, final boolean z, final State<Float> state, final State<? extends l<? super Float, ab>> state2, final MutableState<Float> mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, f2, z, state, state2, mutableState, z2) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda18
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SliderKt.sliderTapModifier$lambda$1(z2, draggableState, mutableInteractionSource, f2, z, mutableState, state, state2, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    static final Modifier sliderTapModifier$lambda$1(boolean z, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f2, boolean z2, MutableState mutableState, State state, State state2, Modifier modifier, Composer composer, int i2) {
        Modifier modifierPointerInput;
        composer.startReplaceGroup(1945228890);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1945228890, i2, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1000)");
        }
        if (z) {
            composer.startReplaceGroup(-1679801122);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            af afVar = (af) objRememberedValue;
            Object[] objArr = {draggableState, mutableInteractionSource, Float.valueOf(f2), Boolean.valueOf(z2)};
            boolean zChanged = composer.changed(z2) | composer.changed(f2) | composer.changed(mutableState) | composer.changed(state) | composer.changedInstance(afVar) | composer.changedInstance(draggableState) | composer.changed(state2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (PointerInputEventHandler) new SliderKt$sliderTapModifier$2$1$1(z2, f2, mutableState, state, afVar, draggableState, state2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, objArr, (PointerInputEventHandler) objRememberedValue2);
            composer.endReplaceGroup();
        } else {
            modifierPointerInput = modifier;
            composer.startReplaceGroup(-1678708124);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierPointerInput;
    }

    private static final float snapValueToTick(float f2, List<Float> list, float f3, float f4) {
        Float f5;
        if (list.isEmpty()) {
            f5 = null;
        } else {
            Float f6 = list.get(0);
            float fAbs = Math.abs(MathHelpersKt.lerp(f3, f4, f6.floatValue()) - f2);
            int iE = i.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Float f7 = list.get(i2);
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f3, f4, f7.floatValue()) - f2);
                    int iCompare = Float.compare(fAbs, fAbs2);
                    if (iCompare > 0) {
                        fAbs = fAbs2;
                    }
                    if (iCompare > 0) {
                        f6 = f7;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
            f5 = f6;
        }
        Float f8 = f5;
        return f8 != null ? MathHelpersKt.lerp(f3, f4, f8.floatValue()) : f2;
    }

    private static final List<Float> stepsToTickFractions(int i2) {
        if (i2 == 0) {
            return i.h();
        }
        int i3 = i2 + 2;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Float.valueOf(i4 / (i2 + 1)));
        }
        return arrayList;
    }

    private static final float scale(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.lerp(f5, f6, calcFraction(f2, f3, f4));
    }
}
