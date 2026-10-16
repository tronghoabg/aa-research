package androidx.window.java.embedding;

import androidx.core.util.Consumer;
import androidx.window.embedding.OverlayController;
import androidx.window.embedding.OverlayInfo;
import androidx.window.java.core.CallbackToFlowAdapter;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayControllerCallbackAdapter {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final OverlayController controller;

    public OverlayControllerCallbackAdapter(OverlayController overlayController) {
        x.f(overlayController, "controller");
        this.controller = overlayController;
        this.callbackToFlowAdapter = new CallbackToFlowAdapter();
    }

    public final void addOverlayInfoListener(String str, Executor executor, Consumer<OverlayInfo> consumer) {
        x.f(str, "overlayTag");
        x.f(executor, "executor");
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.controller.overlayInfo(str));
    }

    public final void removeOverlayInfoListener(Consumer<OverlayInfo> consumer) {
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }
}
