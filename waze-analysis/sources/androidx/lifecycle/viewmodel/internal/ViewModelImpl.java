package androidx.lifecycle.viewmodel.internal;

import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelImpl {
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;
    private final Map<String, AutoCloseable> keyToCloseables;
    private final SynchronizedObject lock;

    public ViewModelImpl(af afVar, AutoCloseable... autoCloseableArr) {
        x.f(afVar, "viewModelScope");
        x.f(autoCloseableArr, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(afVar));
        i.aF(linkedHashSet, autoCloseableArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(autoCloseable);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        x.f(str, "key");
        x.f(autoCloseable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(autoCloseable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable2 = (AutoCloseable) this.keyToCloseables.put(str, autoCloseable);
        }
        closeWithRuntimeException(autoCloseable2);
    }

    public final void clear() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            Iterator it = this.keyToCloseables.values().iterator();
            while (it.hasNext()) {
                closeWithRuntimeException((AutoCloseable) it.next());
            }
            Iterator it2 = this.closeables.iterator();
            while (it2.hasNext()) {
                closeWithRuntimeException((AutoCloseable) it2.next());
            }
            this.closeables.clear();
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        x.f(str, "key");
        synchronized (this.lock) {
            t = (T) this.keyToCloseables.get(str);
        }
        return t;
    }

    public final void addCloseable(AutoCloseable autoCloseable) {
        x.f(autoCloseable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(autoCloseable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(autoCloseable);
        }
    }

    public ViewModelImpl(af afVar) {
        x.f(afVar, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(afVar));
    }

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    public ViewModelImpl(AutoCloseable... autoCloseableArr) {
        x.f(autoCloseableArr, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        i.aF(linkedHashSet, autoCloseableArr);
    }
}
