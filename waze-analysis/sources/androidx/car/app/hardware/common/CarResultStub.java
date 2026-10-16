package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final Bundleable mBundle;
    private final CarHardwareHostDispatcher mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<OnCarDataAvailableListener<T>, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i2, Bundleable bundleable, boolean z, T t, CarHardwareHostDispatcher carHardwareHostDispatcher) {
        this.mHostDispatcher = (CarHardwareHostDispatcher) Objects.requireNonNull(carHardwareHostDispatcher);
        this.mResultType = i2;
        this.mBundle = bundleable;
        this.mIsSingleShot = z;
        this.mUnsupportedValue = (T) Objects.requireNonNull(t);
    }

    private T convertAndRecast(Bundleable bundleable) {
        return (T) bundleable.get();
    }

    private void notifyResults(boolean z, Bundleable bundleable) {
        final T tConvertAndRecast = z ? convertAndRecast(bundleable) : this.mUnsupportedValue;
        for (final Map.Entry<OnCarDataAvailableListener<T>, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new Runnable() { // from class: androidx.car.app.hardware.common.CarResultStub$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ((OnCarDataAvailableListener) entry.getKey()).onCarDataAvailable(tConvertAndRecast);
                }
            });
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, OnCarDataAvailableListener<T> onCarDataAvailableListener) {
        boolean zIsEmpty = this.mListeners.isEmpty();
        this.mListeners.put((OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener), executor);
        if (zIsEmpty) {
            boolean z = this.mIsSingleShot;
            CarHardwareHostDispatcher carHardwareHostDispatcher = this.mHostDispatcher;
            if (z) {
                carHardwareHostDispatcher.dispatchGetCarHardwareResult(this.mResultType, this.mBundle, this);
            } else {
                carHardwareHostDispatcher.dispatchSubscribeCarHardwareResult(this.mResultType, this.mBundle, this);
            }
        }
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public int getInterfaceVersion() {
        return 1;
    }

    /* renamed from: lambda$onCarHardwareResult$0$androidx-car-app-hardware-common-CarResultStub, reason: not valid java name */
    /* synthetic */ Object m1621x728c9e74(boolean z, Bundleable bundleable) {
        notifyResults(z, bundleable);
        return null;
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i2, final boolean z, final Bundleable bundleable, IBinder iBinder) {
        RemoteUtils.dispatchCallFromHost(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new RemoteUtils.HostCall() { // from class: androidx.car.app.hardware.common.CarResultStub$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return this.f$0.m1621x728c9e74(z, bundleable);
            }
        });
    }

    public boolean removeListener(OnCarDataAvailableListener<T> onCarDataAvailableListener) {
        this.mListeners.remove(Objects.requireNonNull(onCarDataAvailableListener));
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        this.mHostDispatcher.dispatchUnsubscribeCarHardwareResult(this.mResultType, this.mBundle);
        return true;
    }
}
