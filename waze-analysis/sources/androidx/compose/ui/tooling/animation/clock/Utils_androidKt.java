package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Utils_androidKt {
    private static final List<String> IGNORE_TRANSITIONS = i.d("TransformOriginInterruptionHandling");

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1680a = 0;

    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(Transition<?> transition) {
        List<Transition<?>> transitions = transition.getTransitions();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = transitions.iterator();
        while (it.hasNext()) {
            i.aD(arrayList, allAnimations((Transition) it.next()));
        }
        return i.af(transition.getAnimations(), arrayList);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final Animation<T, V> animation, String str, final AnimationSpec<T> animationSpec, final long j2) {
        final long jNanosToMillis = nanosToMillis(animation.getDurationNanos());
        final f fVarA = g.a(new a() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Long.valueOf(Utils_androidKt.createTransitionInfo$lambda$0(animationSpec));
            }
        });
        return new TransitionInfo(str, animationSpec.getClass().getName(), createTransitionInfo$lambda$1(fVarA), jNanosToMillis, createTransitionInfo$lambda$3(g.a(new a() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Utils_androidKt.createTransitionInfo$lambda$2(animation, jNanosToMillis, j2, fVarA);
            }
        })));
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState transitionAnimationState, long j2, long j3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            j2 = 1;
        }
        return createTransitionInfo(transitionAnimationState, j2, j3);
    }

    static final long createTransitionInfo$lambda$0(AnimationSpec animationSpec) {
        Number numberValueOf;
        if (animationSpec instanceof TweenSpec) {
            numberValueOf = Integer.valueOf(((TweenSpec) animationSpec).getDelay());
        } else if (animationSpec instanceof SnapSpec) {
            numberValueOf = Integer.valueOf(((SnapSpec) animationSpec).getDelay());
        } else if (animationSpec instanceof KeyframesSpec) {
            numberValueOf = Integer.valueOf(((KeyframesSpec) animationSpec).getConfig().getDelayMillis());
        } else if (animationSpec instanceof RepeatableSpec) {
            RepeatableSpec repeatableSpec = (RepeatableSpec) animationSpec;
            numberValueOf = StartOffsetType.m1922equalsimpl0(StartOffset.m1915getOffsetTypeEo1U57Q(repeatableSpec.m1906getInitialStartOffsetRmkjzm4()), StartOffsetType.Companion.m1926getDelayEo1U57Q()) ? Integer.valueOf(StartOffset.m1914getOffsetMillisimpl(repeatableSpec.m1906getInitialStartOffsetRmkjzm4())) : 0L;
        } else if (animationSpec instanceof InfiniteRepeatableSpec) {
            InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) animationSpec;
            numberValueOf = StartOffsetType.m1922equalsimpl0(StartOffset.m1915getOffsetTypeEo1U57Q(infiniteRepeatableSpec.m1893getInitialStartOffsetRmkjzm4()), StartOffsetType.Companion.m1926getDelayEo1U57Q()) ? Integer.valueOf(StartOffset.m1914getOffsetMillisimpl(infiniteRepeatableSpec.m1893getInitialStartOffsetRmkjzm4())) : 0L;
        } else {
            numberValueOf = animationSpec instanceof VectorizedDurationBasedAnimationSpec ? Integer.valueOf(((VectorizedDurationBasedAnimationSpec) animationSpec).getDelayMillis()) : 0L;
        }
        return numberValueOf.longValue();
    }

    private static final long createTransitionInfo$lambda$1(f<Long> fVar) {
        return fVar.getValue().longValue();
    }

    static final Map createTransitionInfo$lambda$2(Animation animation, long j2, long j3, f fVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(createTransitionInfo$lambda$1(fVar)), animation.getValueFromNanos(millisToNanos(createTransitionInfo$lambda$1(fVar))));
        linkedHashMap.put(Long.valueOf(j2), animation.getValueFromNanos(millisToNanos(j2)));
        long jCreateTransitionInfo$lambda$1 = createTransitionInfo$lambda$1(fVar);
        while (jCreateTransitionInfo$lambda$1 <= j2) {
            linkedHashMap.put(Long.valueOf(jCreateTransitionInfo$lambda$1), animation.getValueFromNanos(millisToNanos(jCreateTransitionInfo$lambda$1)));
            jCreateTransitionInfo$lambda$1 += j3;
        }
        return linkedHashMap;
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(f<? extends Map<Long, T>> fVar) {
        return fVar.getValue();
    }

    static final Map createTransitionInfo$lambda$4(long j2, InfiniteTransition.TransitionAnimationState transitionAnimationState, long j3, long j4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(j2), transitionAnimationState.getAnimation().getValueFromNanos(millisToNanos(j2)));
        linkedHashMap.put(Long.valueOf(j3), transitionAnimationState.getAnimation().getValueFromNanos(millisToNanos(j3)));
        while (j2 <= j3) {
            linkedHashMap.put(Long.valueOf(j2), transitionAnimationState.getAnimation().getValueFromNanos(millisToNanos(j2)));
            j2 += j4;
        }
        return linkedHashMap;
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$5(f<? extends Map<Long, T>> fVar) {
        return fVar.getValue();
    }

    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long millisToNanos(long j2) {
        return j2 * 1000000;
    }

    public static final long nanosToMillis(long j2) {
        return (j2 + 999999) / 1000000;
    }

    public static final <T> TargetState<T> parseParametersToValue(T t, Object obj, Object obj2) {
        TargetState<T> targetState;
        if (t == null) {
            return null;
        }
        TargetState<T> targetState2 = (TargetState<T>) parseParametersToValue$parseDp(t, obj, obj2);
        if (targetState2 != null) {
            return targetState2;
        }
        if (!parseParametersToValue$parametersAreValid(obj, obj2)) {
            return null;
        }
        x.c(obj2);
        if (parseParametersToValue$parametersHasTheSameType(t, obj, obj2)) {
            return new TargetState<>(obj, obj2);
        }
        if (!(obj instanceof List) || !(obj2 instanceof List)) {
            return null;
        }
        try {
            if (t instanceof IntSize) {
                List list = (List) obj;
                Object obj3 = list.get(0);
                x.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj3).intValue();
                x.d(list.get(1), "null cannot be cast to non-null type kotlin.Int");
                IntSize intSizeM11331boximpl = IntSize.m11331boximpl((iIntValue << 32) | (((Integer) r1).intValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                List list2 = (List) obj2;
                Object obj4 = list2.get(0);
                x.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj4).intValue();
                x.d(list2.get(1), "null cannot be cast to non-null type kotlin.Int");
                targetState = new TargetState<>(intSizeM11331boximpl, IntSize.m11331boximpl((((Integer) r2).intValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iIntValue2 << 32)));
            } else if (t instanceof IntOffset) {
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                x.d(obj5, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) obj5).intValue();
                x.d(list3.get(1), "null cannot be cast to non-null type kotlin.Int");
                IntOffset intOffsetM11287boximpl = IntOffset.m11287boximpl((iIntValue3 << 32) | (((Integer) r1).intValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                List list4 = (List) obj2;
                Object obj6 = list4.get(0);
                x.d(obj6, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue4 = ((Integer) obj6).intValue();
                x.d(list4.get(1), "null cannot be cast to non-null type kotlin.Int");
                targetState = new TargetState<>(intOffsetM11287boximpl, IntOffset.m11287boximpl((((Integer) r2).intValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iIntValue4 << 32)));
            } else if (t instanceof Size) {
                List list5 = (List) obj;
                Object obj7 = list5.get(0);
                x.d(obj7, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) obj7).floatValue();
                Object obj8 = list5.get(1);
                x.d(obj8, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = ((Float) obj8).floatValue();
                Size sizeM8037boximpl = Size.m8037boximpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fFloatValue2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                List list6 = (List) obj2;
                Object obj9 = list6.get(0);
                x.d(obj9, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) obj9).floatValue();
                Object obj10 = list6.get(1);
                x.d(obj10, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue4 = ((Float) obj10).floatValue();
                targetState = new TargetState<>(sizeM8037boximpl, Size.m8037boximpl((Float.floatToRawIntBits(fFloatValue4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fFloatValue3) << 32)));
            } else if (t instanceof Offset) {
                List list7 = (List) obj;
                Object obj11 = list7.get(0);
                x.d(obj11, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue5 = ((Float) obj11).floatValue();
                Object obj12 = list7.get(1);
                x.d(obj12, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue6 = ((Float) obj12).floatValue();
                Offset offsetM7969boximpl = Offset.m7969boximpl((Float.floatToRawIntBits(fFloatValue5) << 32) | (Float.floatToRawIntBits(fFloatValue6) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                List list8 = (List) obj2;
                Object obj13 = list8.get(0);
                x.d(obj13, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue7 = ((Float) obj13).floatValue();
                Object obj14 = list8.get(1);
                x.d(obj14, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue8 = ((Float) obj14).floatValue();
                targetState = new TargetState<>(offsetM7969boximpl, Offset.m7969boximpl((Float.floatToRawIntBits(fFloatValue8) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fFloatValue7) << 32)));
            } else if (t instanceof Rect) {
                List list9 = (List) obj;
                Object obj15 = list9.get(0);
                x.d(obj15, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue9 = ((Float) obj15).floatValue();
                Object obj16 = list9.get(1);
                x.d(obj16, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue10 = ((Float) obj16).floatValue();
                Object obj17 = list9.get(2);
                x.d(obj17, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue11 = ((Float) obj17).floatValue();
                Object obj18 = list9.get(3);
                x.d(obj18, "null cannot be cast to non-null type kotlin.Float");
                Rect rect = new Rect(fFloatValue9, fFloatValue10, fFloatValue11, ((Float) obj18).floatValue());
                List list10 = (List) obj2;
                Object obj19 = list10.get(0);
                x.d(obj19, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue12 = ((Float) obj19).floatValue();
                Object obj20 = list10.get(1);
                x.d(obj20, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue13 = ((Float) obj20).floatValue();
                Object obj21 = list10.get(2);
                x.d(obj21, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue14 = ((Float) obj21).floatValue();
                Object obj22 = list10.get(3);
                x.d(obj22, "null cannot be cast to non-null type kotlin.Float");
                targetState = new TargetState<>(rect, new Rect(fFloatValue12, fFloatValue13, fFloatValue14, ((Float) obj22).floatValue()));
            } else if (t instanceof Color) {
                List list11 = (List) obj;
                Object obj23 = list11.get(0);
                x.d(obj23, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue15 = ((Float) obj23).floatValue();
                Object obj24 = list11.get(1);
                x.d(obj24, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue16 = ((Float) obj24).floatValue();
                Object obj25 = list11.get(2);
                x.d(obj25, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue17 = ((Float) obj25).floatValue();
                Object obj26 = list11.get(3);
                x.d(obj26, "null cannot be cast to non-null type kotlin.Float");
                Color colorM8218boximpl = Color.m8218boximpl(ColorKt.Color$default(fFloatValue15, fFloatValue16, fFloatValue17, ((Float) obj26).floatValue(), null, 16, null));
                List list12 = (List) obj2;
                Object obj27 = list12.get(0);
                x.d(obj27, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue18 = ((Float) obj27).floatValue();
                Object obj28 = list12.get(1);
                x.d(obj28, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue19 = ((Float) obj28).floatValue();
                Object obj29 = list12.get(2);
                x.d(obj29, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue20 = ((Float) obj29).floatValue();
                Object obj30 = list12.get(3);
                x.d(obj30, "null cannot be cast to non-null type kotlin.Float");
                targetState = new TargetState<>(colorM8218boximpl, Color.m8218boximpl(ColorKt.Color$default(fFloatValue18, fFloatValue19, fFloatValue20, ((Float) obj30).floatValue(), null, 16, null)));
            } else if (t instanceof Dp) {
                Object obj31 = ((List) obj).get(0);
                x.c(obj31);
                Object obj32 = ((List) obj2).get(0);
                x.c(obj32);
                targetState = (TargetState<T>) parseParametersToValue$parseDp(t, obj31, obj32);
            } else {
                List list13 = (List) obj;
                List list14 = (List) obj2;
                if (!parseParametersToValue$parametersAreValid(list13.get(0), list14.get(0))) {
                    return null;
                }
                Object obj33 = list13.get(0);
                x.c(obj33);
                Object obj34 = list14.get(0);
                x.c(obj34);
                if (!parseParametersToValue$parametersHasTheSameType(t, obj33, obj34)) {
                    return null;
                }
                targetState = new TargetState<>(list13.get(0), list14.get(0));
            }
            x.d(targetState, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
            return targetState;
        } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            return null;
        }
    }

    private static final Dp parseParametersToValue$getDp(Object obj) {
        Dp dpM11162boximpl = obj instanceof Dp ? (Dp) obj : null;
        if (dpM11162boximpl == null) {
            Float f2 = obj instanceof Float ? (Float) obj : null;
            dpM11162boximpl = f2 != null ? Dp.m11162boximpl(f2.floatValue()) : null;
            if (dpM11162boximpl == null) {
                Double d2 = obj instanceof Double ? (Double) obj : null;
                dpM11162boximpl = d2 != null ? Dp.m11162boximpl((float) d2.doubleValue()) : null;
                if (dpM11162boximpl == null) {
                    if ((obj instanceof Integer ? (Integer) obj : null) == null) {
                        return null;
                    }
                    return Dp.m11162boximpl(r4.intValue());
                }
            }
        }
        return dpM11162boximpl;
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.getClass() == obj2.getClass();
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object obj, Object obj2, Object obj3) {
        return obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass();
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T t, Object obj, Object obj2) {
        if ((t instanceof Dp) && obj2 != null) {
            if ((obj instanceof Dp) && (obj2 instanceof Dp)) {
                return new TargetState<>(obj, obj2);
            }
            Dp parametersToValue$getDp = parseParametersToValue$getDp(obj);
            Dp parametersToValue$getDp2 = parseParametersToValue$getDp(obj2);
            if (parametersToValue$getDp == null || parametersToValue$getDp2 == null) {
                return null;
            }
            return new TargetState<>(parametersToValue$getDp, parametersToValue$getDp2);
        }
        return null;
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation animation, String str, AnimationSpec animationSpec, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = 1;
        }
        return createTransitionInfo(animation, str, animationSpec, j2);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState transitionAnimationState, long j2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            j2 = 1;
        }
        return createTransitionInfo(transitionAnimationState, j2);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, final long j2, final long j3) {
        final long j4 = 0;
        return new TransitionInfo(transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec().getClass().getName(), 0L, j3, createTransitionInfo$lambda$5(g.a(new a() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Utils_androidKt.createTransitionInfo$lambda$4(j4, transitionAnimationState, j3, j2);
            }
        })));
    }

    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, long j2) {
        return createTransitionInfo(transitionAnimationState.getAnimation(), transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec(), j2);
    }
}
