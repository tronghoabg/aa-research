package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import h.g.a.l;
import h.g.b.y;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VeilModifierNode$draw$veilColor$2 extends y implements l<EnterExitState, Color> {
    final /* synthetic */ VeilModifierNode this$0;

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
    VeilModifierNode$draw$veilColor$2(VeilModifierNode veilModifierNode) {
        super(1);
        this.this$0 = veilModifierNode;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Color invoke(EnterExitState enterExitState) {
        return Color.m8218boximpl(m1866invokevNxB06k(enterExitState));
    }

    /* renamed from: invoke-vNxB06k, reason: not valid java name */
    public final long m1866invokevNxB06k(EnterExitState enterExitState) {
        EnterExitState enterExitState2 = EnterExitState.PreEnter;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0) {
            Veil veil = this.this$0.getEnter().getData$animation().getVeil();
            return veil != null ? veil.m1864getInitialColor0d7_KjU() : Color.Companion.m8263getTransparent0d7_KjU();
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new i();
            }
            Veil veil2 = this.this$0.getExit().getData$animation().getVeil();
            return veil2 != null ? veil2.m1865getTargetColor0d7_KjU() : this.this$0.getMutableTransformState().m1816getLastVeil0d7_KjU();
        }
        Veil veil3 = this.this$0.getEnter().getData$animation().getVeil();
        if (veil3 != null) {
            return veil3.m1865getTargetColor0d7_KjU();
        }
        Veil veil4 = this.this$0.getExit().getData$animation().getVeil();
        return veil4 != null ? veil4.m1864getInitialColor0d7_KjU() : Color.Companion.m8263getTransparent0d7_KjU();
    }
}
