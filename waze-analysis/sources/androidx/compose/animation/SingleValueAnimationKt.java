package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m1832Animatable8_81llA(long j2) {
        return new Animatable<>(Color.m8218boximpl(j2), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m8232getColorSpaceimpl(j2)), null, null, 12, null);
    }

    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m1833animateColorAsStateKTwxG1Y(long j2, AnimationSpec animationSpec, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i2, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:82)");
        }
        State<Color> stateM1834animateColorAsStateeuL9pac = m1834animateColorAsStateeuL9pac(j2, animationSpec2, null, lVar2, composer, (i2 & 126) | ((i2 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM1834animateColorAsStateeuL9pac;
    }

    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m1834animateColorAsStateeuL9pac(long j2, AnimationSpec<Color> animationSpec, String str, l<? super Color, ab> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec<Color> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        l<? super Color, ab> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i2, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zChanged = composer.changed(Color.m8232getColorSpaceimpl(j2));
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m8232getColorSpaceimpl(j2));
            composer.updateRememberedValue(objRememberedValue);
        }
        int i4 = i2 << 6;
        State<Color> stateAnimateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m8218boximpl(j2), (TwoWayConverter) objRememberedValue, animationSpec2, null, str2, lVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & i4) | (458752 & i4), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }
}
