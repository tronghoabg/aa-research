package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowLayoutInfo;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ExtensionWindowBackendApi2 extends ExtensionWindowBackendApi1 {
    private final Map<Context, MulticastConsumerApi2> contextToListeners;
    private final ReentrantLock globalLock;
    private final Map<Consumer<WindowLayoutInfo>, Context> listenerToContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionWindowBackendApi2(WindowLayoutComponent windowLayoutComponent, ConsumerAdapter consumerAdapter) {
        super(windowLayoutComponent, consumerAdapter);
        x.f(windowLayoutComponent, "component");
        x.f(consumerAdapter, "adapter");
        this.globalLock = new ReentrantLock();
        this.contextToListeners = new LinkedHashMap();
        this.listenerToContext = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public boolean hasRegisteredListeners() {
        return (this.contextToListeners.isEmpty() && this.listenerToContext.isEmpty()) ? false : true;
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "callback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            MulticastConsumerApi2 multicastConsumerApi2 = this.contextToListeners.get(context);
            if (multicastConsumerApi2 != null) {
                multicastConsumerApi2.addListener(consumer);
                this.listenerToContext.put(consumer, context);
            } else {
                ExtensionWindowBackendApi2 extensionWindowBackendApi2 = this;
                MulticastConsumerApi2 multicastConsumerApi22 = new MulticastConsumerApi2(context);
                this.contextToListeners.put(context, multicastConsumerApi22);
                this.listenerToContext.put(consumer, context);
                multicastConsumerApi22.addListener(consumer);
                getComponent().addWindowLayoutInfoListener(context, multicastConsumerApi22);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        MulticastConsumerApi2 multicastConsumerApi2;
        x.f(consumer, "callback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            Context context = this.listenerToContext.get(consumer);
            if (context != null && (multicastConsumerApi2 = this.contextToListeners.get(context)) != null) {
                multicastConsumerApi2.removeListener(consumer);
                this.listenerToContext.remove(consumer);
                if (multicastConsumerApi2.isEmpty()) {
                    this.contextToListeners.remove(context);
                    getComponent().removeWindowLayoutInfoListener(multicastConsumerApi2);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
