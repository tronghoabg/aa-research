package androidx.car.app.hardware.common;

import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CarResultStubMap<T, U> {
    private final CarHardwareHostDispatcher mHostDispatcher;
    private final int mResultType;
    private final HashMap<U, CarResultStub<T>> mStubMap = new HashMap<>();
    private final T mUnsupportedValue;

    public CarResultStubMap(int i2, T t, CarHardwareHostDispatcher carHardwareHostDispatcher) {
        this.mResultType = i2;
        this.mUnsupportedValue = (T) Objects.requireNonNull(t);
        this.mHostDispatcher = (CarHardwareHostDispatcher) Objects.requireNonNull(carHardwareHostDispatcher);
    }

    public void addListener(U u, Executor executor, OnCarDataAvailableListener<T> onCarDataAvailableListener) {
        Bundleable bundleableCreate;
        Objects.requireNonNull(executor);
        Objects.requireNonNull(onCarDataAvailableListener);
        CarResultStub<T> carResultStub = this.mStubMap.get(u);
        if (carResultStub != null) {
            carResultStub.addListener(executor, onCarDataAvailableListener);
            return;
        }
        if (u == null) {
            bundleableCreate = null;
        } else {
            try {
                bundleableCreate = Bundleable.create(u);
            } catch (BundlerException unused) {
                throw new IllegalArgumentException("Invalid params");
            }
        }
        CarResultStub<T> carResultStub2 = new CarResultStub<>(this.mResultType, bundleableCreate, false, this.mUnsupportedValue, this.mHostDispatcher);
        carResultStub2.addListener(executor, onCarDataAvailableListener);
        this.mStubMap.put(u, carResultStub2);
    }

    public void removeListener(OnCarDataAvailableListener<T> onCarDataAvailableListener) {
        Objects.requireNonNull(onCarDataAvailableListener);
        Iterator<Map.Entry<U, CarResultStub<T>>> it = this.mStubMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().removeListener(onCarDataAvailableListener)) {
                it.remove();
            }
        }
    }
}
