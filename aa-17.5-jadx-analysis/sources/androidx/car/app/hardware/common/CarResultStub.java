package androidx.car.app.hardware.common;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.serialization.Bundleable;
import defpackage.af;
import defpackage.rr;
import defpackage.ru;
import defpackage.tr;
import defpackage.xr;
import defpackage.xy;
import defpackage.xz;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final Bundleable mBundle;
    private final rr mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<ru<T>, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, Bundleable bundleable, boolean z, T t, rr rrVar) {
        rrVar.getClass();
        this.mHostDispatcher = rrVar;
        this.mResultType = i;
        this.mBundle = bundleable;
        this.mIsSingleShot = z;
        t.getClass();
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(Bundleable bundleable) throws xr {
        return (T) bundleable.a();
    }

    private void notifyResults(boolean z, Bundleable bundleable) throws xr {
        T tConvertAndRecast = z ? convertAndRecast(bundleable) : this.mUnsupportedValue;
        for (Map.Entry<ru<T>, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new af(entry, tConvertAndRecast, 15));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, ru<T> ruVar) {
        boolean zIsEmpty = this.mListeners.isEmpty();
        ruVar.getClass();
        this.mListeners.put(ruVar, executor);
        if (zIsEmpty) {
            boolean z = this.mIsSingleShot;
            final rr rrVar = this.mHostDispatcher;
            if (z) {
                final int i = this.mResultType;
                final Bundleable bundleable = this.mBundle;
                final int i2 = 1;
                tr.e("getCarHardwareResult", new xz() { // from class: rp
                    @Override // defpackage.xz
                    public final Object a() throws RemoteException {
                        int i3 = i2;
                        rr rrVar2 = rrVar;
                        if (i3 != 0) {
                            ICarHardwareResult iCarHardwareResult = this;
                            rrVar2.a().getCarHardwareResult(i, bundleable, iCarHardwareResult);
                            return null;
                        }
                        ICarHardwareResult iCarHardwareResult2 = this;
                        rrVar2.a().subscribeCarHardwareResult(i, bundleable, iCarHardwareResult2);
                        return null;
                    }
                });
                return;
            }
            final int i3 = this.mResultType;
            final Bundleable bundleable2 = this.mBundle;
            final int i4 = 0;
            tr.e("subscribeCarHardwareResult", new xz() { // from class: rp
                @Override // defpackage.xz
                public final Object a() throws RemoteException {
                    int i32 = i4;
                    rr rrVar2 = rrVar;
                    if (i32 != 0) {
                        ICarHardwareResult iCarHardwareResult = this;
                        rrVar2.a().getCarHardwareResult(i3, bundleable2, iCarHardwareResult);
                        return null;
                    }
                    ICarHardwareResult iCarHardwareResult2 = this;
                    rrVar2.a().subscribeCarHardwareResult(i3, bundleable2, iCarHardwareResult2);
                    return null;
                }
            });
        }
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public int getInterfaceVersion() {
        return 1;
    }

    /* renamed from: lambda$onCarHardwareResult$0$androidx-car-app-hardware-common-CarResultStub, reason: not valid java name */
    public /* synthetic */ Object m141x728c9e74(boolean z, Bundleable bundleable) throws xr {
        notifyResults(z, bundleable);
        return null;
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, final boolean z, final Bundleable bundleable, IBinder iBinder) throws RemoteException {
        tr.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new xy() { // from class: rs
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m141x728c9e74(z, bundleable);
            }
        });
    }

    public boolean removeListener(ru<T> ruVar) {
        ruVar.getClass();
        this.mListeners.remove(ruVar);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        final rr rrVar = this.mHostDispatcher;
        final int i = this.mResultType;
        final Bundleable bundleable = this.mBundle;
        tr.e("unsubscribeCarHardwareResult", new xz() { // from class: rq
            @Override // defpackage.xz
            public final Object a() throws RemoteException {
                rrVar.a().unsubscribeCarHardwareResult(i, bundleable);
                return null;
            }
        });
        return true;
    }
}
