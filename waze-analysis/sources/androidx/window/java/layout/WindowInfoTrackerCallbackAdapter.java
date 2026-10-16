package androidx.window.java.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.java.core.CallbackToFlowAdapter;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowEngagementInfo;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final WindowInfoTracker tracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        this(windowInfoTracker, new CallbackToFlowAdapter());
        x.f(windowInfoTracker, "tracker");
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        x.f(context, "context");
        return this.tracker.getCurrentWindowLayoutInfo(context);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public List<SupportedPosture> getSupportedPostures() {
        return this.tracker.getSupportedPostures();
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void registerWindowEngagementInfoListener(Context context, Executor executor, Consumer<WindowEngagementInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.tracker.registerWindowEngagementInfoListener(context, executor, consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void registerWindowLayoutInfoListener(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.tracker.registerWindowLayoutInfoListener(context, executor, consumer);
    }

    public final void removeWindowLayoutInfoListener(Consumer<WindowLayoutInfo> consumer) {
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void unregisterWindowEngagementInfoListener(Consumer<WindowEngagementInfo> consumer) {
        x.f(consumer, "listener");
        this.tracker.unregisterWindowEngagementInfoListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void unregisterWindowLayoutInfoListener(Consumer<WindowLayoutInfo> consumer) {
        x.f(consumer, "listener");
        this.tracker.unregisterWindowLayoutInfoListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public k<WindowEngagementInfo> windowEngagementInfo(Context context) {
        x.f(context, "context");
        return this.tracker.windowEngagementInfo(context);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public k<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        x.f(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public k<WindowLayoutInfo> windowLayoutInfo(Context context) {
        x.f(context, "context");
        return this.tracker.windowLayoutInfo(context);
    }

    private WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.tracker = windowInfoTracker;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addWindowLayoutInfoListener(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.tracker.windowLayoutInfo(context));
    }
}
