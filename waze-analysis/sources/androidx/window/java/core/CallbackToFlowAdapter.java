package androidx.window.java.core;

import androidx.core.util.Consumer;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CallbackToFlowAdapter {
    private final ReentrantLock globalLock = new ReentrantLock();
    private final Map<Consumer<?>, br> consumerToJobMap = new LinkedHashMap();

    public final <T> void connect(Executor executor, Consumer<T> consumer, k<? extends T> kVar) {
        x.f(executor, "executor");
        x.f(consumer, "consumer");
        x.f(kVar, "flow");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(consumer) == null) {
                this.consumerToJobMap.put(consumer, aj.z(aj.e(bo.f(executor)), null, null, new CallbackToFlowAdapter$connect$1$1(kVar, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void disconnect(Consumer<?> consumer) {
        x.f(consumer, "consumer");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            br brVar = this.consumerToJobMap.get(consumer);
            if (brVar != null) {
                brVar.s(null);
            }
            this.consumerToJobMap.remove(consumer);
        } finally {
            reentrantLock.unlock();
        }
    }
}
