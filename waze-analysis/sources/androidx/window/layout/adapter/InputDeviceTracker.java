package androidx.window.layout.adapter;

import android.hardware.input.InputManager;
import androidx.core.util.Consumer;
import androidx.window.layout.adapter.InputDeviceTracker;
import androidx.window.layout.util.InputDeviceInfo;
import androidx.window.layout.util.InputHelper;
import androidx.window.layout.util.SerialExecutor;
import h.a.r;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InputDeviceTracker implements AutoCloseable {
    private SerialExecutor activeSerialExecutor;
    private final InputHelper inputHelper;
    private final InputDeviceListenerImpl inputListener;
    private boolean isMouseAndKeyboardConnected;
    private final Map<Consumer<Boolean>, Executor> listeners;
    private final ReentrantLock lock;
    private final Set<Integer> qualifiedKeyboards;
    private final Set<Integer> qualifiedPointers;

    /* compiled from: WazeSource */
    final class InputDeviceListenerImpl implements InputManager.InputDeviceListener {
        public InputDeviceListenerImpl() {
        }

        static final void onInputDeviceAdded$lambda$1(InputDeviceTracker inputDeviceTracker, int i2) {
            if (inputDeviceTracker.refreshInput(i2)) {
                inputDeviceTracker.notifyListeners();
            }
        }

        static final void onInputDeviceChanged$lambda$1(InputDeviceTracker inputDeviceTracker, int i2) {
            if (inputDeviceTracker.refreshInput(i2)) {
                inputDeviceTracker.notifyListeners();
            }
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(final int i2) {
            ReentrantLock reentrantLock = InputDeviceTracker.this.lock;
            reentrantLock.lock();
            try {
                SerialExecutor serialExecutor = InputDeviceTracker.this.activeSerialExecutor;
                if (serialExecutor == null) {
                    return;
                }
                final InputDeviceTracker inputDeviceTracker = InputDeviceTracker.this;
                serialExecutor.execute(new Runnable() { // from class: androidx.window.layout.adapter.InputDeviceTracker$InputDeviceListenerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputDeviceTracker.InputDeviceListenerImpl.onInputDeviceAdded$lambda$1(inputDeviceTracker, i2);
                    }
                });
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(final int i2) {
            ReentrantLock reentrantLock = InputDeviceTracker.this.lock;
            reentrantLock.lock();
            try {
                SerialExecutor serialExecutor = InputDeviceTracker.this.activeSerialExecutor;
                if (serialExecutor == null) {
                    return;
                }
                final InputDeviceTracker inputDeviceTracker = InputDeviceTracker.this;
                serialExecutor.execute(new Runnable() { // from class: androidx.window.layout.adapter.InputDeviceTracker$InputDeviceListenerImpl$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputDeviceTracker.InputDeviceListenerImpl.onInputDeviceChanged$lambda$1(inputDeviceTracker, i2);
                    }
                });
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i2) {
            ReentrantLock reentrantLock = InputDeviceTracker.this.lock;
            reentrantLock.lock();
            InputDeviceTracker inputDeviceTracker = InputDeviceTracker.this;
            try {
                Set set = inputDeviceTracker.qualifiedKeyboards;
                Integer numValueOf = Integer.valueOf(i2);
                set.remove(numValueOf);
                inputDeviceTracker.qualifiedPointers.remove(numValueOf);
                boolean z = true;
                boolean z2 = (inputDeviceTracker.qualifiedKeyboards.isEmpty() || inputDeviceTracker.qualifiedPointers.isEmpty()) ? false : true;
                if (inputDeviceTracker.isMouseAndKeyboardConnected != z2) {
                    inputDeviceTracker.isMouseAndKeyboardConnected = z2;
                } else {
                    z = false;
                }
                if (z) {
                    InputDeviceTracker.this.notifyListeners();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public InputDeviceTracker(InputHelper inputHelper) {
        x.f(inputHelper, "inputHelper");
        this.inputHelper = inputHelper;
        this.lock = new ReentrantLock();
        this.listeners = new LinkedHashMap();
        this.qualifiedKeyboards = new LinkedHashSet();
        this.qualifiedPointers = new LinkedHashSet();
        this.inputListener = new InputDeviceListenerImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListeners() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Map mapR = r.r(this.listeners);
            reentrantLock.unlock();
            final boolean zIsMouseAndKeyboardConnected = isMouseAndKeyboardConnected();
            for (Map.Entry entry : mapR.entrySet()) {
                final Consumer consumer = (Consumer) entry.getKey();
                ((Executor) entry.getValue()).execute(new Runnable() { // from class: androidx.window.layout.adapter.InputDeviceTracker$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputDeviceTracker.notifyListeners$lambda$1$0(consumer, zIsMouseAndKeyboardConnected);
                    }
                });
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyListeners$lambda$1$0(Consumer consumer, boolean z) {
        consumer.accept(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean refreshInput(int i2) {
        ReentrantLock reentrantLock = this.lock;
        InputDeviceInfo inputDevice = this.inputHelper.getInputDevice(i2);
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            Set<Integer> set = this.qualifiedKeyboards;
            Integer numValueOf = Integer.valueOf(i2);
            set.remove(numValueOf);
            this.qualifiedPointers.remove(numValueOf);
            if (inputDevice != null) {
                if (this.inputHelper.isPhysicalKeyboardDevice(inputDevice)) {
                    this.qualifiedKeyboards.add(numValueOf);
                }
                if (this.inputHelper.isMouseDeviceEnabled(inputDevice)) {
                    this.qualifiedPointers.add(numValueOf);
                }
            }
            boolean z = true;
            boolean z2 = (this.qualifiedKeyboards.isEmpty() || this.qualifiedPointers.isEmpty()) ? false : true;
            if (this.isMouseAndKeyboardConnected != z2) {
                this.isMouseAndKeyboardConnected = z2;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock2.unlock();
        }
    }

    private final void updateTracking(boolean z) {
        InputHelper inputHelper = this.inputHelper;
        if (!z) {
            inputHelper.unregisterInputDeviceListener(this.inputListener);
            return;
        }
        InputHelper.CC.registerInputDeviceListener$default(inputHelper, this.inputListener, null, 2, null);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            SerialExecutor serialExecutor = this.activeSerialExecutor;
            if (serialExecutor == null) {
                return;
            }
            serialExecutor.execute(new Runnable() { // from class: androidx.window.layout.adapter.InputDeviceTracker$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    InputDeviceTracker.updateTracking$lambda$1(this.f$0);
                }
            });
        } finally {
            reentrantLock.unlock();
        }
    }

    static final void updateTracking$lambda$1(InputDeviceTracker inputDeviceTracker) {
        boolean zRefreshInput = false;
        for (int i2 : inputDeviceTracker.inputHelper.getInputDeviceIds()) {
            zRefreshInput |= inputDeviceTracker.refreshInput(i2);
        }
        if (zRefreshInput) {
            inputDeviceTracker.notifyListeners();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        updateTracking(false);
    }

    public final boolean isMouseAndKeyboardConnected() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.isMouseAndKeyboardConnected;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void registerListener(Executor executor, final Consumer<Boolean> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsEmpty = this.listeners.isEmpty();
            this.listeners.put(consumer, executor);
            if (zIsEmpty) {
                this.activeSerialExecutor = new SerialExecutor(executor);
                updateTracking(true);
            }
            reentrantLock.unlock();
            executor.execute(new Runnable() { // from class: androidx.window.layout.adapter.InputDeviceTracker$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(Boolean.valueOf(this.isMouseAndKeyboardConnected()));
                }
            });
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void unregisterListener(Consumer<Boolean> consumer) {
        x.f(consumer, "listener");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.listeners.remove(consumer);
            if (this.listeners.isEmpty()) {
                updateTracking(false);
                this.activeSerialExecutor = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
