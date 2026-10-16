package androidx.window.java.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.embedding.ActivityEmbeddingController;
import androidx.window.embedding.EmbeddedActivityWindowInfo;
import androidx.window.java.core.CallbackToFlowAdapter;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityEmbeddingControllerCallbackAdapter {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final ActivityEmbeddingController controller;

    public ActivityEmbeddingControllerCallbackAdapter(ActivityEmbeddingController activityEmbeddingController) {
        x.f(activityEmbeddingController, "controller");
        this.controller = activityEmbeddingController;
        this.callbackToFlowAdapter = new CallbackToFlowAdapter();
    }

    public final void addEmbeddedActivityWindowInfoListener(Activity activity, Executor executor, Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.callbackToFlowAdapter.connect(executor, consumer, this.controller.embeddedActivityWindowInfo(activity));
    }

    public final void removeEmbeddedActivityWindowInfoListener(Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(consumer, "listener");
        this.callbackToFlowAdapter.disconnect(consumer);
    }
}
