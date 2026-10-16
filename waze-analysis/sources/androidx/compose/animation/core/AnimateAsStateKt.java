package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.q;
import h.g.b.v;
import h.g.b.w;
import h.g.b.x;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final float DefaultFloatVisibilityThreshold = 0.01f;
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring;
    private static final SpringSpec<Integer> intDefaultSpring;
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring;
    private static final SpringSpec<IntSize> intSizeDefaultSpring;
    private static final SpringSpec<Offset> offsetDefaultSpring;
    private static final SpringSpec<Rect> rectDefaultSpring;
    private static final SpringSpec<Size> sizeDefaultSpring;

    static {
        int i2 = VisibilityThresholdsKt.f1650a;
        dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m11162boximpl(0.4f), 3, null);
        sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m8037boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
        offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m7969boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
        rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
        intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
        intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 3, null);
        intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 3, null);
    }

    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m1867animateDpAsStateAjpBEmI(float f2, AnimationSpec<Dp> animationSpec, String str, l<? super Dp, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super Dp, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:123)");
        }
        int i4 = i2 << 6;
        State<Dp> stateAnimateValueAsState = animateValueAsState(Dp.m11162boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m1868animateDpAsStateKz89ssw(float f2, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:474)");
        }
        State stateAnimateValueAsState = animateValueAsState(Dp.m11162boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i2 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final State<Float> animateFloatAsState(float f2, AnimationSpec<Float> animationSpec, float f3, String str, l<? super Float, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.01f;
        }
        if ((i3 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        l<? super Float, ab> lVar2 = (i3 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:74)");
        }
        if (animationSpec == defaultAnimation) {
            composer.startReplaceGroup(1144115775);
            boolean z = true;
            if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(f3)) && (i2 & 384) != 256) {
                z = false;
            }
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            animationSpec = (SpringSpec) objRememberedValue;
        } else {
            composer.startReplaceGroup(1144225701);
            composer.endReplaceGroup();
        }
        int i4 = i2 << 3;
        State<Float> stateAnimateValueAsState = animateValueAsState(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(q.f48127a), animationSpec, f3 != 0.01f ? Float.valueOf(f3) : null, str2, lVar2, composer, (i2 & 14) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final State<Integer> animateIntAsState(int i2, AnimationSpec<Integer> animationSpec, String str, l<? super Integer, ab> lVar, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i4 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            lVar = null;
        }
        l<? super Integer, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:282)");
        }
        int i5 = i3 << 6;
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(v.f48128a), animationSpec2, null, str2, lVar2, composer, (i3 & 14) | ((i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i5) | (458752 & i5), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m1869animateIntOffsetAsState8f6pmRE(long j2, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:564)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntOffset.m11287boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i2 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m1870animateIntOffsetAsStateHyPO7BM(long j2, AnimationSpec<IntOffset> animationSpec, String str, l<? super IntOffset, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super IntOffset, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:321)");
        }
        int i4 = i2 << 6;
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m11287boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m1871animateIntSizeAsState4goxYXU(long j2, AnimationSpec<IntSize> animationSpec, String str, l<? super IntSize, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super IntSize, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:359)");
        }
        int i4 = i2 << 6;
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m11331boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m1872animateIntSizeAsStatezTRF_AQ(long j2, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:582)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntSize.m11331boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i2 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m1873animateOffsetAsState7362WCg(long j2, AnimationSpec<Offset> animationSpec, String str, l<? super Offset, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super Offset, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:203)");
        }
        int i4 = i2 << 6;
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m7969boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m1874animateOffsetAsStateN6fFfp4(long j2, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:510)");
        }
        State stateAnimateValueAsState = animateValueAsState(Offset.m7969boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i2 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, String str, l<? super Rect, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super Rect, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:244)");
        }
        int i4 = i2 << 6;
        State<Rect> stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m1875animateSizeAsStateLjSzlW0(long j2, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:492)");
        }
        State stateAnimateValueAsState = animateValueAsState(Size.m8037boximpl(j2), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i2 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m1876animateSizeAsStateYLp_XPw(long j2, AnimationSpec<Size> animationSpec, String str, l<? super Size, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super Size, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:164)");
        }
        int i4 = i2 << 6;
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m8037boximpl(j2), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t2, String str, l<? super T, ab> lVar, Composer composer, int i2, int i3) {
        SpringSpec springSpecSpring;
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            springSpecSpring = (SpringSpec) objRememberedValue;
        } else {
            springSpecSpring = animationSpec;
        }
        T t3 = (i3 & 8) != 0 ? null : t2;
        String str2 = (i3 & 16) != 0 ? "ValueAnimation" : str;
        l<? super T, ab> lVar2 = (i3 & 32) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:407)");
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Animatable animatable = (Animatable) objRememberedValue3;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar2, composer, (i2 >> 15) & 14);
        if (t3 != null && (springSpecSpring instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) springSpecSpring;
            if (!x.n(springSpec.getVisibilityThreshold(), t3)) {
                springSpecSpring = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t3);
            }
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(springSpecSpring, composer, 0);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = w.c(-1, null, null, 6);
            composer.updateRememberedValue(objRememberedValue4);
        }
        final o oVar = (o) objRememberedValue4;
        boolean zChangedInstance = composer.changedInstance(oVar);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changedInstance(t)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChangedInstance | z;
        Object objRememberedValue5 = composer.rememberedValue();
        if (z2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = new a() { // from class: androidx.compose.animation.core.AnimateAsStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return AnimateAsStateKt.animateValueAsState$lambda$7$0(oVar, t);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((a) objRememberedValue5, composer, 0);
        boolean zChangedInstance2 = composer.changedInstance(oVar) | composer.changedInstance(animatable) | composer.changed(stateRememberUpdatedState2) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            objRememberedValue6 = (p) new AnimateAsStateKt$animateValueAsState$3$1(oVar, animatable, stateRememberUpdatedState2, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue6);
        }
        EffectsKt.LaunchedEffect(oVar, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue6, composer, 0);
        State<T> stateAsState = (State) mutableState.getValue();
        if (stateAsState == null) {
            stateAsState = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> l<T, ab> animateValueAsState$lambda$3(State<? extends l<? super T, ab>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$5(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab animateValueAsState$lambda$7$0(o oVar, Object obj) {
        oVar.i(obj);
        return ab.f48028a;
    }

    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:528)");
        }
        State stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, null, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i2 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final /* synthetic */ State animateIntAsState(int i2, AnimationSpec animationSpec, l lVar, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:546)");
        }
        State stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(v.f48128a), animationSpec2, null, null, lVar2, composer, (i3 & 14) | ((i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (458752 & (i3 << 9)), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final /* synthetic */ State animateFloatAsState(float f2, AnimationSpec animationSpec, float f3, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            f3 = 0.01f;
        }
        float f4 = f3;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:458)");
        }
        State<Float> stateAnimateFloatAsState = animateFloatAsState(f2, animationSpec2, f4, null, lVar2, composer, (i2 & 1022) | ((i2 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateFloatAsState;
    }

    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, l lVar, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer2 = composer;
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                composer2 = composer;
            }
            animationSpec = (SpringSpec) objRememberedValue;
        } else {
            composer2 = composer;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object obj3 = (i3 & 8) != 0 ? null : obj2;
        l lVar2 = (i3 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:603)");
        }
        int i4 = i2 & 8;
        State stateAnimateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", lVar2, composer2, (i4 << 9) | i4 | 24576 | (i2 & 14) | (i2 & 112) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | (i2 & 7168) | (458752 & (i2 << 3)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }
}
