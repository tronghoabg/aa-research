package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import h.a.i;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ExtensionWindowBackendApi0 implements WindowBackend {
    @Override // androidx.window.layout.adapter.WindowBackend
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        x.f(context, "context");
        throw new UnsupportedOperationException("Extensions version must be at least 9");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public List<SupportedPosture> getSupportedPostures() {
        throw new UnsupportedOperationException("Extensions version must be at least 6");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public /* synthetic */ boolean hasRegisteredListeners() {
        return false;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, final Consumer<WindowLayoutInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "callback");
        executor.execute(new Runnable() { // from class: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                consumer.accept(new WindowLayoutInfo(i.h(), null, 2, null));
            }
        });
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        x.f(consumer, "callback");
    }
}
