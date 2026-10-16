package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowLayoutInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ExtensionWindowBackendApi9 extends ExtensionWindowBackendApi6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionWindowBackendApi9(WindowLayoutComponent windowLayoutComponent, ConsumerAdapter consumerAdapter) {
        super(windowLayoutComponent, consumerAdapter);
        x.f(windowLayoutComponent, "component");
        x.f(consumerAdapter, "adapter");
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        x.f(context, "context");
        ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = ExtensionsWindowLayoutInfoAdapter.INSTANCE;
        androidx.window.extensions.layout.WindowLayoutInfo currentWindowLayoutInfo = getComponent().getCurrentWindowLayoutInfo(context);
        x.e(currentWindowLayoutInfo, "getCurrentWindowLayoutInfo(...)");
        return extensionsWindowLayoutInfoAdapter.translate$window(context, currentWindowLayoutInfo);
    }
}
