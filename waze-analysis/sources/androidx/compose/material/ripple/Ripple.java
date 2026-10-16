package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    private Ripple(boolean z, float f2, State<Color> state) {
        this.bounded = z;
        this.radius = f2;
        this.color = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.bounded == ripple.bounded && Dp.m11169equalsimpl0(this.radius, ripple.radius) && x.n(this.color, ripple.color);
    }

    public int hashCode() {
        return (((Ripple$$ExternalSyntheticBackport0.m(this.bounded) * 31) + Dp.m11170hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i2) {
        long jMo4303defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i2, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        if (this.color.getValue().m8238unboximpl() != 16) {
            composer.startReplaceGroup(762841340);
            composer.endReplaceGroup();
            jMo4303defaultColorWaAFU9c = this.color.getValue().m8238unboximpl();
        } else {
            composer.startReplaceGroup(762899124);
            jMo4303defaultColorWaAFU9c = rippleTheme.mo4303defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(jMo4303defaultColorWaAFU9c), composer, 0);
        State<RippleAlpha> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i3 = i2 & 14;
        RippleIndicationInstance rippleIndicationInstanceMo4301rememberUpdatedRippleInstance942rkJo = mo4301rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, stateRememberUpdatedState, stateRememberUpdatedState2, composer, i3 | ((i2 << 12) & 458752));
        boolean zChangedInstance = composer.changedInstance(rippleIndicationInstanceMo4301rememberUpdatedRippleInstance942rkJo) | (((i3 ^ 6) > 4 && composer.changed(interactionSource)) || (i2 & 6) == 4);
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || ripple$rememberUpdatedInstance$1$1RememberedValue == Composer.Companion.getEmpty()) {
            ripple$rememberUpdatedInstance$1$1RememberedValue = new Ripple$rememberUpdatedInstance$1$1(interactionSource, rippleIndicationInstanceMo4301rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(ripple$rememberUpdatedInstance$1$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo4301rememberUpdatedRippleInstance942rkJo, interactionSource, (p) ripple$rememberUpdatedInstance$1$1RememberedValue, composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleIndicationInstanceMo4301rememberUpdatedRippleInstance942rkJo;
    }

    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo4301rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f2, State<Color> state, State<RippleAlpha> state2, Composer composer, int i2);

    public /* synthetic */ Ripple(boolean z, float f2, State state, o oVar) {
        this(z, f2, state);
    }
}
