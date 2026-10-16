package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import j$.util.Optional;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qzu extends ijo implements qzv {
    private final WeakReference a;

    public qzu(imj imjVar) {
        super("com.google.android.gms.car.IProjectionLifecycleCallback");
        this.a = new WeakReference(imjVar);
    }

    @Override // defpackage.qzv
    public final void e(int i, Bundle bundle) {
        ((ype) imj.a.l().ai(418)).D("onAuthorizationComplete(version:%d, bundle:%s)", i, bundle);
        imj imjVar = (imj) this.a.get();
        if (imjVar == null) {
            return;
        }
        new sss(Looper.getMainLooper()).post(new aq(imjVar, bundle, 11));
    }

    @Override // defpackage.qzv
    public final void f(int i, Bundle bundle) {
        ((ype) imj.a.l().ai(419)).D("onProjectionStartComplete(version:%d, bundle:%s)", i, bundle);
        imj imjVar = (imj) this.a.get();
        if (imjVar == null) {
            return;
        }
        imn imnVar = new imn(bundle, 1);
        Optional optional = imjVar.i;
        if (true == optional.isPresent()) {
            optional.get();
            byte[] byteArray = ((Bundle) imnVar.a).getByteArray("activity_layout_config");
            if (byteArray == null) {
                throw new IllegalStateException("ProjectionLifecycleService must pass a CarActivityLayoutConfig");
            }
            CarActivityLayoutConfig carActivityLayoutConfig = (CarActivityLayoutConfig) spu.h(byteArray, CarActivityLayoutConfig.CREATOR);
            eqy.e(carActivityLayoutConfig);
            eqy.f(carActivityLayoutConfig);
        }
        new sss(Looper.getMainLooper()).post(new aq(imjVar, bundle, 12));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            ijp.d(parcel);
            f(i2, bundle);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            ijp.d(parcel);
            e(i3, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
