package androidx.window.area.adapter;

import androidx.window.area.WindowAreaCapability;
import androidx.window.core.ExtensionsUtil;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaAdapter {
    public static final WindowAreaAdapter INSTANCE = new WindowAreaAdapter();

    private WindowAreaAdapter() {
    }

    public static /* synthetic */ WindowAreaCapability.Status translate$window$default(WindowAreaAdapter windowAreaAdapter, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
        }
        return windowAreaAdapter.translate$window(i2, z & ((i4 & 2) == 0), i3);
    }

    public final WindowAreaCapability.Status translate$window(int i2, boolean z, int i3) {
        return i3 <= 3 ? WindowAreaAdapterApi3.INSTANCE.translate(i2, z) : WindowAreaAdapterApi4.INSTANCE.translate(i2);
    }
}
