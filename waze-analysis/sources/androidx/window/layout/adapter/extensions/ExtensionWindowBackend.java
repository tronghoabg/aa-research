package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ExtensionWindowBackend implements WindowBackend {
    public static final Companion Companion = new Companion(null);
    private final WindowBackend backend;

    public ExtensionWindowBackend(WindowBackend windowBackend) {
        x.f(windowBackend, "backend");
        this.backend = windowBackend;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        x.f(context, "context");
        return this.backend.getCurrentWindowLayoutInfo(context);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public List<SupportedPosture> getSupportedPostures() {
        return this.backend.getSupportedPostures();
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public boolean hasRegisteredListeners() {
        return this.backend.hasRegisteredListeners();
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "callback");
        this.backend.registerLayoutChangeCallback(context, executor, consumer);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        x.f(consumer, "callback");
        this.backend.unregisterLayoutChangeCallback(consumer);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WindowBackend newInstance(WindowLayoutComponent windowLayoutComponent, ConsumerAdapter consumerAdapter) {
            x.f(windowLayoutComponent, "component");
            x.f(consumerAdapter, "adapter");
            int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
            return safeVendorApiLevel >= 9 ? new ExtensionWindowBackendApi9(windowLayoutComponent, consumerAdapter) : safeVendorApiLevel >= 6 ? new ExtensionWindowBackendApi6(windowLayoutComponent, consumerAdapter) : safeVendorApiLevel >= 2 ? new ExtensionWindowBackendApi2(windowLayoutComponent, consumerAdapter) : safeVendorApiLevel == 1 ? new ExtensionWindowBackendApi1(windowLayoutComponent, consumerAdapter) : new ExtensionWindowBackendApi0();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
