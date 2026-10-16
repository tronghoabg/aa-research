package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.ab;
import h.g.a.q;
import h.g.a.t;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    static final FiniteAnimationSpec Transition_DTcfvLk$lambda$0(Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-883519390);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-883519390, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
        }
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween$default;
    }

    private static final long Transition_DTcfvLk$lambda$10(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final ab Transition_DTcfvLk$lambda$11(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j2, long j3, q qVar, boolean z, t tVar, int i2, Composer composer, int i3) {
        textFieldTransitionScope.m4272TransitionDTcfvLk(inputPhase, j2, j3, qVar, z, tVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final float Transition_DTcfvLk$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    static final FiniteAnimationSpec Transition_DTcfvLk$lambda$3(Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1849239065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849239065, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
        }
        TweenSpec tweenSpecTween$default = segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty) ? AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null) : (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) ? AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing()) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween$default;
    }

    private static final float Transition_DTcfvLk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    static final FiniteAnimationSpec Transition_DTcfvLk$lambda$6(Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-2017811095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2017811095, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
        }
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween$default;
    }

    private static final long Transition_DTcfvLk$lambda$8(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final FiniteAnimationSpec Transition_DTcfvLk$lambda$9(Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1176639650);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176639650, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
        }
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bb, code lost:
    
        if (r1 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c3, code lost:
    
        throw new h.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r4 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0117, code lost:
    
        if (r1 == 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011f, code lost:
    
        throw new h.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0182, code lost:
    
        if (r6 == 2) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4272TransitionDTcfvLk(final androidx.compose.material.InputPhase r25, final long r26, final long r28, final h.g.a.q<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r30, final boolean r31, final h.g.a.t<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.runtime.Composer r33, final int r34) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m4272TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, h.g.a.q, boolean, h.g.a.t, androidx.compose.runtime.Composer, int):void");
    }
}
