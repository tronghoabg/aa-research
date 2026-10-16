package androidx.car.app.hardware.common;

import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
import androidx.car.app.HostDispatcher;
import androidx.car.app.ICarHost;
import androidx.car.app.hardware.ICarHardwareHost;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CarHardwareHostDispatcher {
    private final HostDispatcher mHostDispatcher;
    private ICarHardwareHost mICarHardwareHost;

    public CarHardwareHostDispatcher(HostDispatcher hostDispatcher) {
        this.mHostDispatcher = (HostDispatcher) Objects.requireNonNull(hostDispatcher);
    }

    private ICarHardwareHost getHost() {
        ICarHardwareHost iCarHardwareHost = this.mICarHardwareHost;
        if (iCarHardwareHost != null) {
            return iCarHardwareHost;
        }
        ICarHardwareHost iCarHardwareHost2 = (ICarHardwareHost) Objects.requireNonNull((ICarHardwareHost) this.mHostDispatcher.dispatchForResult(CarContext.CAR_SERVICE, "getHost(CarHardware)", new HostCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda1
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                return ICarHardwareHost.Stub.asInterface(((ICarHost) obj).getHost(CarContext.HARDWARE_SERVICE));
            }
        }));
        this.mICarHardwareHost = iCarHardwareHost2;
        return iCarHardwareHost2;
    }

    public void dispatchGetCarHardwareResult(final int i2, final Bundleable bundleable, final ICarHardwareResult iCarHardwareResult) {
        Objects.requireNonNull(iCarHardwareResult);
        RemoteUtils.dispatchCallToHost("getCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                return this.f$0.m1618xa6282b03(i2, bundleable, iCarHardwareResult);
            }
        });
    }

    public void dispatchSubscribeCarHardwareResult(final int i2, final Bundleable bundleable, final ICarHardwareResult iCarHardwareResult) {
        Objects.requireNonNull(iCarHardwareResult);
        RemoteUtils.dispatchCallToHost("subscribeCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                return this.f$0.m1619x3fa73e96(i2, bundleable, iCarHardwareResult);
            }
        });
    }

    public void dispatchUnsubscribeCarHardwareResult(final int i2, final Bundleable bundleable) {
        RemoteUtils.dispatchCallToHost("unsubscribeCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda3
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                return this.f$0.m1620x41bbb8fc(i2, bundleable);
            }
        });
    }

    /* renamed from: lambda$dispatchGetCarHardwareResult$0$androidx-car-app-hardware-common-CarHardwareHostDispatcher, reason: not valid java name */
    /* synthetic */ Object m1618xa6282b03(int i2, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        getHost().getCarHardwareResult(i2, bundleable, iCarHardwareResult);
        return null;
    }

    /* renamed from: lambda$dispatchSubscribeCarHardwareResult$1$androidx-car-app-hardware-common-CarHardwareHostDispatcher, reason: not valid java name */
    /* synthetic */ Object m1619x3fa73e96(int i2, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        getHost().subscribeCarHardwareResult(i2, bundleable, iCarHardwareResult);
        return null;
    }

    /* renamed from: lambda$dispatchUnsubscribeCarHardwareResult$2$androidx-car-app-hardware-common-CarHardwareHostDispatcher, reason: not valid java name */
    /* synthetic */ Object m1620x41bbb8fc(int i2, Bundleable bundleable) {
        getHost().unsubscribeCarHardwareResult(i2, bundleable);
        return null;
    }
}
