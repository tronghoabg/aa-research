package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Modifier $default$animateEnterExit(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
            return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(enterTransition, exitTransition, str) : InspectableValueKt.getNoInspectorInfo(), animatedVisibilityScope.new AnonymousClass2(enterTransition, exitTransition, str));
        }

        public static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
            }
            if ((i2 & 1) != 0) {
                enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            }
            if ((i2 & 2) != 0) {
                exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            }
            if ((i2 & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Modifier animateEnterExit(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
            return CC.$default$animateEnterExit(animatedVisibilityScope, modifier, enterTransition, exitTransition, str);
        }
    }

    Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str);

    Transition<EnterExitState> getTransition();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(EnterTransition enterTransition, ExitTransition exitTransition, String str) {
            super(3);
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(1840112047);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1840112047, i2, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:734)");
            }
            AnimatedVisibilityScope animatedVisibilityScope = AnimatedVisibilityScope.this;
            Modifier modifierThen = modifier.then(EnterExitTransitionKt.createModifier(animatedVisibilityScope.getTransition(), this.$enter, this.$exit, false, null, null, this.$label, composer, 0, 28));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }
}
