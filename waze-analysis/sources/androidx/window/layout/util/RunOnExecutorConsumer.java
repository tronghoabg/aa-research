package androidx.window.layout.util;

import androidx.core.util.Consumer;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RunOnExecutorConsumer<T> implements Consumer<T> {
    private final Consumer<T> callback;
    private final Executor executor;

    public RunOnExecutorConsumer(Executor executor, Consumer<T> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "callback");
        this.executor = executor;
        this.callback = consumer;
    }

    @Override // androidx.core.util.Consumer
    public void accept(final T t) {
        this.executor.execute(new Runnable() { // from class: androidx.window.layout.util.RunOnExecutorConsumer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.callback.accept(t);
            }
        });
    }
}
