package androidx.window.area.adapter;

import androidx.window.area.WindowAreaCapability;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaAdapterApi4 {
    public static final WindowAreaAdapterApi4 INSTANCE = new WindowAreaAdapterApi4();

    private WindowAreaAdapterApi4() {
    }

    public final WindowAreaCapability.Status translate(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED : WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNAVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED;
    }
}
