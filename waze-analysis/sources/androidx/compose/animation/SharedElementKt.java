package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedElementKt {
    private static final SpringSpec<Offset> DefaultMomentumSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, Offset.m7969boximpl((Float.floatToRawIntBits(3.0f) << 32) | (Float.floatToRawIntBits(3.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasVisibleContent(List<SharedElementEntry> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toOffset-TH1AsA0, reason: not valid java name */
    public static final long m1809toOffsetTH1AsA0(long j2) {
        float fM11406getXimpl = Velocity.m11406getXimpl(j2);
        float fM11407getYimpl = Velocity.m11407getYimpl(j2);
        return (Float.floatToRawIntBits(fM11407getYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fM11406getXimpl) << 32);
    }
}
