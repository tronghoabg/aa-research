package androidx.compose.animation;

import h.g.a.l;
import h.g.b.y;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 extends y implements l<EnterExitState, Float> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ SharedMutableTransformState $mutableTransformState;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2(EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState) {
        super(1);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$mutableTransformState = sharedMutableTransformState;
    }

    @Override // h.g.a.l
    public final Float invoke(EnterExitState enterExitState) {
        EnterExitState enterExitState2 = EnterExitState.PreEnter;
        int iOrdinal = enterExitState.ordinal();
        float scale = 1.0f;
        if (iOrdinal == 0) {
            Scale scale2 = this.$enter.getData$animation().getScale();
            if (scale2 != null) {
                scale = scale2.getScale();
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new i();
            }
            Scale scale3 = this.$exit.getData$animation().getScale();
            scale = scale3 != null ? scale3.getScale() : this.$mutableTransformState.getLastScale();
        }
        return Float.valueOf(scale);
    }
}
