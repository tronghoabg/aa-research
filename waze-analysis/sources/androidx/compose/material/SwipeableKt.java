package androidx.compose.material;

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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SwipeableKt {
    private static final String SwipeableDeprecation = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.";

    /* renamed from: $r8$lambda$MMCWGhOeF99qUVN8c6nIz-BNfSo, reason: not valid java name */
    public static /* synthetic */ boolean m4223$r8$lambda$MMCWGhOeF99qUVN8c6nIzBNfSo(Object obj) {
        return true;
    }

    /* renamed from: $r8$lambda$zBWckJwvJEdBJi3N-WyA_nsxKhQ, reason: not valid java name */
    public static /* synthetic */ boolean m4225$r8$lambda$zBWckJwvJEdBJi3NWyA_nsxKhQ(Object obj) {
        return true;
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
            x.f(arrayList2, "<this>");
            int size = arrayList2.size() - 1;
            if (size > 0) {
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
                    if (i2 == size) {
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
            x.f(arrayList4, "<this>");
            int size2 = arrayList4.size() - 1;
            if (size2 > 0) {
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
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Float f4 = (Float) obj3;
        if (f3 == null) {
            return i.j(f4);
        }
        if (f4 == null) {
            List<Float> listSingletonList = Collections.singletonList(f3);
            x.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        if (!x.m(f3, f4)) {
            return i.i(f3, f4);
        }
        List<Float> listSingletonList2 = Collections.singletonList(f3);
        x.e(listSingletonList2, "singletonList(...)");
        return listSingletonList2;
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

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(SwipeableState<T> swipeableState) {
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    public static final <T> SwipeableState<T> rememberSwipeableState(final T t, final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda0
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
            ComposerKt.traceEventStart(-1237755169, i2, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:466)");
        }
        Object[] objArr = new Object[0];
        Saver<SwipeableState<T>, T> Saver = SwipeableState.Companion.Saver(animationSpec, lVar);
        boolean z = true;
        boolean zChangedInstance = ((((i2 & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i2 & 6) == 4) | composer.changedInstance(animationSpec);
        if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(lVar)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z2 = zChangedInstance | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return SwipeableKt.rememberSwipeableState$lambda$1$0(t, animationSpec, lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeableState;
    }

    private static final boolean rememberSwipeableState$lambda$0$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeableState rememberSwipeableState$lambda$1$0(Object obj, AnimationSpec animationSpec, l lVar) {
        return new SwipeableState(obj, animationSpec, lVar);
    }

    public static final <T> SwipeableState<T> rememberSwipeableStateFor(final T t, final l<? super T, ab> lVar, AnimationSpec<Float> animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156387078, i2, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:497)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SwipeableState(t, animationSpec, new l() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return true;
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final SwipeableState<T> swipeableState = (SwipeableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState = (MutableState) objRememberedValue2;
        Object value = mutableState.getValue();
        int i4 = (i2 & 14) ^ 6;
        boolean z = (i4 > 4 && composer.changedInstance(t)) || (i2 & 6) == 4;
        SwipeableKt$rememberSwipeableStateFor$1$1 swipeableKt$rememberSwipeableStateFor$1$1RememberedValue = composer.rememberedValue();
        if (z || swipeableKt$rememberSwipeableStateFor$1$1RememberedValue == Composer.Companion.getEmpty()) {
            swipeableKt$rememberSwipeableStateFor$1$1RememberedValue = new SwipeableKt$rememberSwipeableStateFor$1$1(t, swipeableState, null);
            composer.updateRememberedValue(swipeableKt$rememberSwipeableStateFor$1$1RememberedValue);
        }
        int i5 = i2 & 8;
        EffectsKt.LaunchedEffect(t, value, (p) swipeableKt$rememberSwipeableStateFor$1$1RememberedValue, composer, i2 & 14);
        T currentValue = swipeableState.getCurrentValue();
        boolean z2 = ((i4 > 4 && composer.changedInstance(t)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i2 & 48) == 32);
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new l() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SwipeableKt.rememberSwipeableStateFor$lambda$3$0(t, swipeableState, lVar, mutableState, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(currentValue, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeableState;
    }

    private static final boolean rememberSwipeableStateFor$lambda$0$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberSwipeableStateFor$lambda$3$0(Object obj, SwipeableState swipeableState, l lVar, MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        if (!x.n(obj, swipeableState.getCurrentValue())) {
            lVar.invoke(swipeableState.getCurrentValue());
            mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m4226swipeablepPrIpRY(Modifier modifier, final SwipeableState<T> swipeableState, final Map<Float, ? extends T> map, final Orientation orientation, final boolean z, final boolean z2, final MutableInteractionSource mutableInteractionSource, final p<? super T, ? super T, ? extends ThresholdConfig> pVar, final ResistanceConfig resistanceConfig, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(swipeableState, map, orientation, z, z2, mutableInteractionSource, pVar, resistanceConfig, f2) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SwipeableKt.swipeable_pPrIpRY$lambda$2(map, swipeableState, resistanceConfig, pVar, f2, orientation, z, mutableInteractionSource, z2, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: swipeable-pPrIpRY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4227swipeablepPrIpRY$default(Modifier modifier, SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, p pVar, ResistanceConfig resistanceConfig, float f2, int i2, Object obj) {
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        return m4226swipeablepPrIpRY(modifier, swipeableState, map, orientation, (!((i2 & 8) == 0)) | z, (i4 == 0) & z2, i3 != 0 ? null : mutableInteractionSource, (i2 & 64) != 0 ? new p() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda5
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                return SwipeableKt.swipeable_pPrIpRY$lambda$0(obj2, obj3);
            }
        } : pVar, (i2 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, null) : resistanceConfig, (i2 & 256) != 0 ? SwipeableDefaults.INSTANCE.m4222getVelocityThresholdD9Ej5fM() : f2);
    }

    static final FixedThreshold swipeable_pPrIpRY$lambda$0(Object obj, Object obj2) {
        return new FixedThreshold(56.0f, null);
    }

    static final Modifier swipeable_pPrIpRY$lambda$2(Map map, SwipeableState swipeableState, ResistanceConfig resistanceConfig, p pVar, float f2, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(43594985);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(43594985, i2, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
        }
        if (map.isEmpty()) {
            throw new IllegalArgumentException("You must have at least one anchor.");
        }
        Collection collectionValues = map.values();
        x.f(collectionValues, "<this>");
        if (i.ao(i.at(collectionValues)).size() != map.size()) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        swipeableState.ensureInit$material(map);
        boolean zChanged = composer.changed(swipeableState) | composer.changedInstance(map) | composer.changed(resistanceConfig) | composer.changed(pVar) | composer.changed(density) | composer.changed(f2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (p) new SwipeableKt$swipeable$3$3$1(swipeableState, map, resistanceConfig, density, pVar, f2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.LaunchedEffect(map, swipeableState, (p) objRememberedValue, composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        boolean zIsAnimationRunning = swipeableState.isAnimationRunning();
        DraggableState draggableState$material = swipeableState.getDraggableState$material();
        Modifier.Companion companion2 = companion;
        boolean zChanged2 = composer.changed(swipeableState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (q) new SwipeableKt$swipeable$3$4$1(swipeableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Modifier modifierDraggable$default = DraggableKt.draggable$default(companion2, draggableState$material, orientation, z, mutableInteractionSource, zIsAnimationRunning, null, (q) objRememberedValue2, z2, 32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDraggable$default;
    }

    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }
}
