package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CarouselSwipeableKt {
    public static /* synthetic */ boolean $r8$lambda$Pbwk56DfgPLyY4hyOKXZbySZY3U(Object obj) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$yo6jFNE7zMbaouh55uauxCQDohM(Object obj) {
        return true;
    }

    /* renamed from: carouselSwipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m11640carouselSwipeablepPrIpRY(Modifier modifier, final CarouselSwipeableState<T> carouselSwipeableState, final Map<Float, ? extends T> map, final Orientation orientation, final boolean z, final boolean z2, final MutableInteractionSource mutableInteractionSource, final p<? super T, ? super T, ? extends ThresholdConfig> pVar, final ResistanceConfig resistanceConfig, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new CarouselSwipeableKt$carouselSwipeablepPrIpRY$$inlined$debugInspectorInfo$1(carouselSwipeableState, map, orientation, z, z2, mutableInteractionSource, pVar, resistanceConfig, f2) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$$ExternalSyntheticLambda3
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CarouselSwipeableKt.carouselSwipeable_pPrIpRY$lambda$2(map, carouselSwipeableState, resistanceConfig, pVar, f2, orientation, z, mutableInteractionSource, z2, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: carouselSwipeable-pPrIpRY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m11641carouselSwipeablepPrIpRY$default(Modifier modifier, CarouselSwipeableState carouselSwipeableState, Map map, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, p pVar, ResistanceConfig resistanceConfig, float f2, int i2, Object obj) {
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        return m11640carouselSwipeablepPrIpRY(modifier, carouselSwipeableState, map, orientation, (!((i2 & 8) == 0)) | z, (i4 == 0) & z2, i3 != 0 ? null : mutableInteractionSource, (i2 & 64) != 0 ? new p() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                return CarouselSwipeableKt.carouselSwipeable_pPrIpRY$lambda$0(obj2, obj3);
            }
        } : pVar, (i2 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, null) : resistanceConfig, (i2 & 256) != 0 ? SwipeableDefaults.INSTANCE.m11645getVelocityThresholdD9Ej5fM() : f2);
    }

    static final FixedThreshold carouselSwipeable_pPrIpRY$lambda$0(Object obj, Object obj2) {
        return new FixedThreshold(56.0f, null);
    }

    static final Modifier carouselSwipeable_pPrIpRY$lambda$2(Map map, CarouselSwipeableState carouselSwipeableState, ResistanceConfig resistanceConfig, p pVar, float f2, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(1858597191);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1858597191, i2, -1, "androidx.constraintlayout.compose.carousel.carouselSwipeable.<anonymous> (CarouselSwipeable.kt:567)");
        }
        if (map.isEmpty()) {
            throw new IllegalArgumentException("You must have at least one anchor.");
        }
        if (i.aa(map.values()).size() != map.size()) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        carouselSwipeableState.ensureInit$constraintlayout_compose(map);
        boolean zChanged = composer.changed(carouselSwipeableState) | composer.changedInstance(map) | composer.changed(resistanceConfig) | composer.changed(pVar) | composer.changed(density) | composer.changed(f2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (p) new CarouselSwipeableKt$carouselSwipeable$3$3$1(carouselSwipeableState, map, resistanceConfig, density, pVar, f2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.LaunchedEffect(map, carouselSwipeableState, (p) objRememberedValue, composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        boolean zIsAnimationRunning = carouselSwipeableState.isAnimationRunning();
        DraggableState draggableState$constraintlayout_compose = carouselSwipeableState.getDraggableState$constraintlayout_compose();
        Modifier.Companion companion2 = companion;
        boolean zChanged2 = composer.changed(carouselSwipeableState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (q) new CarouselSwipeableKt$carouselSwipeable$3$4$1(carouselSwipeableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Modifier modifierDraggable$default = DraggableKt.draggable$default(companion2, draggableState$constraintlayout_compose, orientation, z, mutableInteractionSource, zIsAnimationRunning, null, (q) objRememberedValue2, z2, 32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDraggable$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeTarget(float f2, float f3, Set<Float> set, p<? super Float, ? super Float, Float> pVar, float f4, float f5) {
        List<Float> listFindBounds = findBounds(f2, set);
        int size = listFindBounds.size();
        if (size == 0) {
            return f3;
        }
        if (size == 1) {
            return listFindBounds.get(0).floatValue();
        }
        float fFloatValue = listFindBounds.get(0).floatValue();
        float fFloatValue2 = listFindBounds.get(1).floatValue();
        return (f3 > f2 ? f4 > (-f5) && f2 > pVar.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue)).floatValue() : f4 >= f5 || f2 >= pVar.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> findBounds(float f2, Set<Float> set) {
        Object obj;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f2 + 0.001d) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        Object obj3 = null;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int iE = i.e(arrayList2);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i2);
                    float fFloatValue2 = ((Number) obj4).floatValue();
                    int iCompare = Float.compare(fFloatValue, fFloatValue2);
                    if (iCompare < 0) {
                        fFloatValue = fFloatValue2;
                    }
                    if (iCompare < 0) {
                        obj = obj4;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Float f3 = (Float) obj;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : set2) {
            if (((Number) obj5).floatValue() >= f2 - 0.001d) {
                arrayList3.add(obj5);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            obj3 = arrayList4.get(0);
            float fFloatValue3 = ((Number) obj3).floatValue();
            int iE2 = i.e(arrayList4);
            if (iE2 > 0) {
                int i3 = 1;
                while (true) {
                    Object obj6 = arrayList4.get(i3);
                    float fFloatValue4 = ((Number) obj6).floatValue();
                    int iCompare2 = Float.compare(fFloatValue3, fFloatValue4);
                    if (iCompare2 > 0) {
                        fFloatValue3 = fFloatValue4;
                    }
                    if (iCompare2 > 0) {
                        obj3 = obj6;
                    }
                    if (i3 == iE2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Float f4 = (Float) obj3;
        return f3 == null ? i.j(f4) : f4 == null ? i.d(f3) : x.m(f3, f4) ? i.d(f3) : i.i(f3, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((Map.Entry) next).getValue(), t)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(CarouselSwipeableState<T> carouselSwipeableState) {
        return new CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1(carouselSwipeableState);
    }

    public static final <T> CarouselSwipeableState<T> rememberCarouselSwipeableState(final T t, final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1633385233, i2, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableState (CarouselSwipeable.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselSwipeableState<T>, T> Saver = CarouselSwipeableState.Companion.Saver(animationSpec, lVar);
        boolean zChangedInstance = ((((i2 & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i2 & 6) == 4) | composer.changedInstance(animationSpec) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(lVar)) || (i2 & 384) == 256);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return CarouselSwipeableKt.rememberCarouselSwipeableState$lambda$1$0(t, animationSpec, lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        CarouselSwipeableState<T> carouselSwipeableState = (CarouselSwipeableState) RememberSaveableKt.m7616rememberSaveable(objArr, (Saver) Saver, (String) null, (a) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselSwipeableState;
    }

    private static final boolean rememberCarouselSwipeableState$lambda$0$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselSwipeableState rememberCarouselSwipeableState$lambda$1$0(Object obj, AnimationSpec animationSpec, l lVar) {
        return new CarouselSwipeableState(obj, animationSpec, lVar);
    }

    public static final <T> CarouselSwipeableState<T> rememberCarouselSwipeableStateFor(final T t, final l<? super T, ab> lVar, AnimationSpec<Float> animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074386230, i2, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableStateFor (CarouselSwipeable.kt:481)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CarouselSwipeableState(t, animationSpec, new l() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return true;
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final CarouselSwipeableState<T> carouselSwipeableState = (CarouselSwipeableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState = (MutableState) objRememberedValue2;
        Object value = mutableState.getValue();
        int i4 = (i2 & 14) ^ 6;
        boolean z = (i4 > 4 && composer.changedInstance(t)) || (i2 & 6) == 4;
        CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1 carouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1RememberedValue = composer.rememberedValue();
        if (z || carouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1RememberedValue == Composer.Companion.getEmpty()) {
            carouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1RememberedValue = new CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(t, carouselSwipeableState, null);
            composer.updateRememberedValue(carouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1RememberedValue);
        }
        int i5 = i2 & 8;
        EffectsKt.LaunchedEffect(t, value, (p) carouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1RememberedValue, composer, i2 & 14);
        T currentValue = carouselSwipeableState.getCurrentValue();
        boolean z2 = ((i4 > 4 && composer.changedInstance(t)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i2 & 48) == 32);
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new l() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CarouselSwipeableKt.rememberCarouselSwipeableStateFor$lambda$3$0(t, carouselSwipeableState, lVar, mutableState, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(currentValue, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselSwipeableState;
    }

    private static final boolean rememberCarouselSwipeableStateFor$lambda$0$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberCarouselSwipeableStateFor$lambda$3$0(Object obj, CarouselSwipeableState carouselSwipeableState, l lVar, MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        if (!x.n(obj, carouselSwipeableState.getCurrentValue())) {
            lVar.invoke(carouselSwipeableState.getCurrentValue());
            mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        }
        return new DisposableEffectResult() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
