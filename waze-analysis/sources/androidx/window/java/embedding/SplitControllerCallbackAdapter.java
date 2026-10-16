package androidx.window.java.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.embedding.SplitController;
import androidx.window.embedding.SplitInfo;
import androidx.window.java.core.CallbackToFlowAdapter;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitControllerCallbackAdapter {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final SplitController controller;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitControllerCallbackAdapter(SplitController splitController) {
        this(splitController, new CallbackToFlowAdapter());
        x.f(splitController, "controller");
    }

    public final void addSplitListener(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.controller.splitInfoList(activity));
    }

    public final void removeSplitListener(Consumer<List<SplitInfo>> consumer) {
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }

    private SplitControllerCallbackAdapter(SplitController splitController, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.controller = splitController;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }
}
