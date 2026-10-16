package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BringIntoViewSpec {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public /* synthetic */ float calculateScrollDistance(float f2, float f3, float f4) {
                return BringIntoViewSpec.Companion.defaultCalculateScrollDistance$foundation(f2, f3, f4);
            }

            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public /* synthetic */ AnimationSpec getScrollAnimationSpec() {
                return BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation();
            }
        };

        private Companion() {
        }

        public final float defaultCalculateScrollDistance$foundation(float f2, float f3, float f4) {
            float f5 = f3 + f2;
            if (f2 >= 0.0f && f5 <= f4) {
                return 0.0f;
            }
            if (f2 < 0.0f && f5 > f4) {
                return 0.0f;
            }
            float f6 = f5 - f4;
            return Math.abs(f2) >= Math.abs(f6) ? f6 : f2;
        }

        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation() {
            return DefaultBringIntoViewSpec;
        }

        public final AnimationSpec<Float> getDefaultScrollAnimationSpec$foundation() {
            return DefaultScrollAnimationSpec;
        }
    }

    float calculateScrollDistance(float f2, float f3, float f4);

    AnimationSpec<Float> getScrollAnimationSpec();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.BringIntoViewSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = BringIntoViewSpec.Companion;
        }

        public static /* synthetic */ void getScrollAnimationSpec$annotations() {
        }
    }
}
