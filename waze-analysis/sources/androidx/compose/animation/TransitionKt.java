package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final <S> State<Color> animateColor(final Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Color> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        AnonymousClass1 anonymousClass1 = (i3 & 1) != 0 ? AnonymousClass1.INSTANCE : qVar;
        String str2 = (i3 & 2) != 0 ? "ColorAnimation" : str;
        ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf((i2 >> 6) & 112)).m8238unboximpl());
        boolean zChanged = composer.changed(colorSpaceM8232getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i4 = i2 << 3;
        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Color colorInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.animation.TransitionKt$animateColor$$inlined$animateValue$1
                @Override // h.g.a.a
                public final Object invoke() {
                    return transition.getTargetState();
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        Color colorInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue2).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue3 = composer.rememberedValue();
        if (z || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment>() { // from class: androidx.compose.animation.TransitionKt$animateColor$$inlined$animateValue$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.a
                public final Transition.Segment invoke() {
                    return transition.getSegment();
                }
            });
            composer.updateRememberedValue(objRememberedValue3);
        }
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, colorInvoke, colorInvoke2, anonymousClass1.invoke((Object) ((State) objRememberedValue3).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), twoWayConverter, str2, composer, ((i5 << 6) & 458752) | i6);
    }

    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m1858animateColorDTcfvLk(InfiniteTransition infiniteTransition, long j2, long j3, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        Composer composer2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m8232getColorSpaceimpl(j3));
            composer2 = composer;
            composer2.updateRememberedValue(objRememberedValue);
        } else {
            composer2 = composer;
        }
        int i4 = i2 << 3;
        State<Color> stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m8218boximpl(j2), Color.m8218boximpl(j3), (TwoWayConverter) objRememberedValue, infiniteRepeatableSpec, (i3 & 8) != 0 ? "ColorAnimation" : str, composer2, (i2 & 14) | InfiniteTransition.$stable | (i2 & 112) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i4) | (458752 & i4), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }

    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m1859animateColorRIQooxk(InfiniteTransition infiniteTransition, long j2, long j3, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
        }
        State<Color> stateM1858animateColorDTcfvLk = m1858animateColorDTcfvLk(infiniteTransition, j2, j3, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i2 & 14) | (i2 & 112) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | (InfiniteRepeatableSpec.$stable << 9) | (i2 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM1858animateColorDTcfvLk;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.TransitionKt$animateColor$1, reason: invalid class name */
    public final class AnonymousClass1 extends y implements q<Transition.Segment, Composer, Integer, SpringSpec<Color>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        public final SpringSpec<Color> invoke(Transition.Segment segment, Composer composer, int i2) {
            composer.startReplaceGroup(-781456724);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-781456724, i2, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
            }
            SpringSpec<Color> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return springSpecSpring$default;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ SpringSpec<Color> invoke(Transition.Segment segment, Composer composer, Integer num) {
            return invoke(segment, composer, num.intValue());
        }
    }
}
