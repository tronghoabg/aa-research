package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
public final class qza extends ijn implements qzc {
    public qza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarWindowCallback");
    }

    @Override // defpackage.qzc
    public final void e() throws RemoteException {
        gk(7, gh());
    }

    @Override // defpackage.qzc
    public final void f(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(6, parcelGh);
    }

    @Override // defpackage.qzc
    public final void g(InputFocusChangedEvent inputFocusChangedEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, inputFocusChangedEvent);
        gk(8, parcelGh);
    }

    @Override // defpackage.qzc
    public final void h(boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(z2 ? 1 : 0);
        gk(3, parcelGh);
    }

    @Override // defpackage.qzc
    public final void i(Rect rect) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, rect);
        gk(12, parcelGh);
    }

    @Override // defpackage.qzc
    public final void j(KeyEvent keyEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, keyEvent);
        gk(5, parcelGh);
    }

    @Override // defpackage.qzc
    public final void k(MotionEvent motionEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, motionEvent);
        gk(4, parcelGh);
    }

    @Override // defpackage.qzc
    public final void l(Configuration configuration, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, configuration);
        parcelGh.writeInt(i);
        gk(11, parcelGh);
    }

    @Override // defpackage.qzc
    public final void m(DrawingSpec drawingSpec, Configuration configuration) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, drawingSpec);
        ijp.g(parcelGh, configuration);
        gk(10, parcelGh);
    }

    @Override // defpackage.qzc
    public final void n(DrawingSpec drawingSpec) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, drawingSpec);
        gk(1, parcelGh);
    }

    @Override // defpackage.qzc
    public final void o(CarWindowManagerLayoutParams carWindowManagerLayoutParams) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carWindowManagerLayoutParams);
        gk(9, parcelGh);
    }

    @Override // defpackage.qzc
    public final void p() throws RemoteException {
        gk(2, gh());
    }
}
