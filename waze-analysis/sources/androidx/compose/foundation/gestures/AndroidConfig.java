package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidConfig implements ScrollConfig {
    public static final int $stable = 8;
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo2148calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j2) {
        float f2 = -getVerticalScrollFactor$foundation(density);
        float f3 = -getHorizontalScrollFactor$foundation(density);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM7969boximpl = Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0());
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            offsetM7969boximpl = Offset.m7969boximpl(Offset.m7985plusMKHz9U(offsetM7969boximpl.m7990unboximpl(), changes.get(i2).m9610getScrollDeltaF1C5BW0()));
        }
        long jM7990unboximpl = offsetM7969boximpl.m7990unboximpl();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM7990unboximpl >> 32)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM7990unboximpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final float getHorizontalScrollFactor$foundation(Density density) {
        return ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration);
    }

    public final float getVerticalScrollFactor$foundation(Density density) {
        return ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration);
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public /* synthetic */ boolean isPreciseWheelScroll(PointerEvent pointerEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public /* synthetic */ boolean isSmoothScrollingEnabled() {
        return true;
    }
}
