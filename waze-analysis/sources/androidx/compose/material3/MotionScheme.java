package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ExpressiveMotionTokens;
import androidx.compose.material3.tokens.StandardMotionTokens;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface MotionScheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final MotionScheme expressive() {
            return ExpressiveMotionSchemeImpl.INSTANCE;
        }

        public final MotionScheme standard() {
            return StandardMotionSchemeImpl.INSTANCE;
        }
    }

    /* compiled from: WazeSource */
    final class ExpressiveMotionSchemeImpl implements MotionScheme {
        public static final ExpressiveMotionSchemeImpl INSTANCE = new ExpressiveMotionSchemeImpl();
        private static final SpringSpec<Object> defaultSpatialSpec = AnimationSpecKt.spring$default(ExpressiveMotionTokens.INSTANCE.getSpringDefaultSpatialDamping(), ExpressiveMotionTokens.INSTANCE.getSpringDefaultSpatialStiffness(), null, 4, null);
        private static final SpringSpec<Object> fastSpatialSpec = AnimationSpecKt.spring$default(ExpressiveMotionTokens.INSTANCE.getSpringFastSpatialDamping(), ExpressiveMotionTokens.INSTANCE.getSpringFastSpatialStiffness(), null, 4, null);
        private static final SpringSpec<Object> slowSpatialSpec = AnimationSpecKt.spring$default(ExpressiveMotionTokens.INSTANCE.getSpringSlowSpatialDamping(), ExpressiveMotionTokens.INSTANCE.getSpringSlowSpatialStiffness(), null, 4, null);
        private static final SpringSpec<Object> defaultEffectsSpec = AnimationSpecKt.spring$default(ExpressiveMotionTokens.INSTANCE.getSpringDefaultEffectsDamping(), ExpressiveMotionTokens.INSTANCE.getSpringDefaultEffectsStiffness(), null, 4, null);
        private static final SpringSpec<Object> fastEffectsSpec = AnimationSpecKt.spring$default(ExpressiveMotionTokens.INSTANCE.getSpringFastEffectsDamping(), ExpressiveMotionTokens.INSTANCE.getSpringFastEffectsStiffness(), null, 4, null);
        private static final SpringSpec<Object> slowEffectsSpec = AnimationSpecKt.spring$default(ExpressiveMotionTokens.INSTANCE.getSpringSlowEffectsDamping(), ExpressiveMotionTokens.INSTANCE.getSpringSlowEffectsStiffness(), null, 4, null);

        private ExpressiveMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultEffectsSpec() {
            SpringSpec<Object> springSpec = defaultEffectsSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.defaultEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultSpatialSpec() {
            SpringSpec<Object> springSpec = defaultSpatialSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.defaultSpatialSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastEffectsSpec() {
            SpringSpec<Object> springSpec = fastEffectsSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.fastEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastSpatialSpec() {
            SpringSpec<Object> springSpec = fastSpatialSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.fastSpatialSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowEffectsSpec() {
            SpringSpec<Object> springSpec = slowEffectsSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.slowEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowSpatialSpec() {
            SpringSpec<Object> springSpec = slowSpatialSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.slowSpatialSpec>");
            return springSpec;
        }
    }

    /* compiled from: WazeSource */
    final class StandardMotionSchemeImpl implements MotionScheme {
        public static final StandardMotionSchemeImpl INSTANCE = new StandardMotionSchemeImpl();
        private static final SpringSpec<Object> defaultSpatialSpec = AnimationSpecKt.spring$default(StandardMotionTokens.INSTANCE.getSpringDefaultSpatialDamping(), StandardMotionTokens.INSTANCE.getSpringDefaultSpatialStiffness(), null, 4, null);
        private static final SpringSpec<Object> fastSpatialSpec = AnimationSpecKt.spring$default(StandardMotionTokens.INSTANCE.getSpringFastSpatialDamping(), StandardMotionTokens.INSTANCE.getSpringFastSpatialStiffness(), null, 4, null);
        private static final SpringSpec<Object> slowSpatialSpec = AnimationSpecKt.spring$default(StandardMotionTokens.INSTANCE.getSpringSlowSpatialDamping(), StandardMotionTokens.INSTANCE.getSpringSlowSpatialStiffness(), null, 4, null);
        private static final SpringSpec<Object> defaultEffectsSpec = AnimationSpecKt.spring$default(StandardMotionTokens.INSTANCE.getSpringDefaultEffectsDamping(), StandardMotionTokens.INSTANCE.getSpringDefaultEffectsStiffness(), null, 4, null);
        private static final SpringSpec<Object> fastEffectsSpec = AnimationSpecKt.spring$default(StandardMotionTokens.INSTANCE.getSpringFastEffectsDamping(), StandardMotionTokens.INSTANCE.getSpringFastEffectsStiffness(), null, 4, null);
        private static final SpringSpec<Object> slowEffectsSpec = AnimationSpecKt.spring$default(StandardMotionTokens.INSTANCE.getSpringSlowEffectsDamping(), StandardMotionTokens.INSTANCE.getSpringSlowEffectsStiffness(), null, 4, null);

        private StandardMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultEffectsSpec() {
            SpringSpec<Object> springSpec = defaultEffectsSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultSpatialSpec() {
            SpringSpec<Object> springSpec = defaultSpatialSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastEffectsSpec() {
            SpringSpec<Object> springSpec = fastEffectsSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastSpatialSpec() {
            SpringSpec<Object> springSpec = fastSpatialSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowEffectsSpec() {
            SpringSpec<Object> springSpec = slowEffectsSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowSpatialSpec() {
            SpringSpec<Object> springSpec = slowSpatialSpec;
            x.d(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return springSpec;
        }
    }

    <T> FiniteAnimationSpec<T> defaultEffectsSpec();

    <T> FiniteAnimationSpec<T> defaultSpatialSpec();

    <T> FiniteAnimationSpec<T> fastEffectsSpec();

    <T> FiniteAnimationSpec<T> fastSpatialSpec();

    <T> FiniteAnimationSpec<T> slowEffectsSpec();

    <T> FiniteAnimationSpec<T> slowSpatialSpec();
}
