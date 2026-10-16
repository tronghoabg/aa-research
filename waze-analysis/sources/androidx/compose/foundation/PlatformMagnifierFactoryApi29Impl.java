package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    /* compiled from: WazeSource */
    public final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 8;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo2070updateWko1d7g(long j2, long j3, float f2) {
            if (!Float.isNaN(f2)) {
                getMagnifier().setZoom(f2);
            }
            long j4 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            int i2 = (int) (j2 >> 32);
            int i3 = (int) j4;
            if ((9223372034707292159L & j3) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                getMagnifier().show(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                return;
            }
            getMagnifier().show(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo2071createnHHXs2Y(View view, boolean z, long j2, float f2, float f3, boolean z2, Density density, float f4) {
        if (z) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jMo2128toSizeXkaWNTQ = density.mo2128toSizeXkaWNTQ(j2);
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(f2);
        float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(f3);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo2128toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(a.b(Float.intBitsToFloat((int) (jMo2128toSizeXkaWNTQ >> 32))), a.b(Float.intBitsToFloat((int) (jMo2128toSizeXkaWNTQ & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
        }
        if (!Float.isNaN(fMo2127toPx0680j_4)) {
            builder.setCornerRadius(fMo2127toPx0680j_4);
        }
        if (!Float.isNaN(fMo2127toPx0680j_42)) {
            builder.setElevation(fMo2127toPx0680j_42);
        }
        if (!Float.isNaN(f4)) {
            builder.setInitialZoom(f4);
        }
        builder.setClippingEnabled(z2);
        return new PlatformMagnifierImpl(builder.build());
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }
}
