package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import h.g.a.l;
import h.g.b.y;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 extends y implements l<EnterExitState, TransformOrigin> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ SharedMutableTransformState $mutableTransformState;
    final /* synthetic */ TransformOrigin $transformOriginWhenVisible;

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
    EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(TransformOrigin transformOrigin, EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState) {
        super(1);
        this.$transformOriginWhenVisible = transformOrigin;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$mutableTransformState = sharedMutableTransformState;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ TransformOrigin invoke(EnterExitState enterExitState) {
        return TransformOrigin.m8658boximpl(m1761invokeLIALnN8(enterExitState));
    }

    /* renamed from: invoke-LIALnN8, reason: not valid java name */
    public final long m1761invokeLIALnN8(EnterExitState enterExitState) {
        TransformOrigin transformOriginM8658boximpl;
        long jM1806getTransformOriginSzJe1aQ;
        EnterExitState enterExitState2 = EnterExitState.PreEnter;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0) {
            Scale scale = this.$enter.getData$animation().getScale();
            if (scale != null) {
                jM1806getTransformOriginSzJe1aQ = scale.m1806getTransformOriginSzJe1aQ();
            } else {
                Scale scale2 = this.$exit.getData$animation().getScale();
                if (scale2 != null) {
                    jM1806getTransformOriginSzJe1aQ = scale2.m1806getTransformOriginSzJe1aQ();
                } else {
                    transformOriginM8658boximpl = null;
                }
            }
            transformOriginM8658boximpl = TransformOrigin.m8658boximpl(jM1806getTransformOriginSzJe1aQ);
        } else if (iOrdinal == 1) {
            transformOriginM8658boximpl = this.$transformOriginWhenVisible;
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            Scale scale3 = this.$exit.getData$animation().getScale();
            transformOriginM8658boximpl = TransformOrigin.m8658boximpl(scale3 != null ? scale3.m1806getTransformOriginSzJe1aQ() : this.$mutableTransformState.m1815getLastTransformOriginSzJe1aQ());
        }
        return transformOriginM8658boximpl != null ? transformOriginM8658boximpl.m8670unboximpl() : TransformOrigin.Companion.m8671getCenterSzJe1aQ();
    }
}
