package androidx.window.area.adapter;

import androidx.window.area.WindowAreaCapability;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaAdapterApi3 {
    public static final WindowAreaAdapterApi3 INSTANCE = new WindowAreaAdapterApi3();

    private WindowAreaAdapterApi3() {
    }

    public final WindowAreaCapability.Status translate(int i2, boolean z) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED : WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE : z ? WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNAVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED;
    }
}
