package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
public final class qxt extends ijn implements qxv {
    public qxt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjection");
    }

    @Override // defpackage.qxv
    public final void A() throws RemoteException {
        gk(14, gh());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qxv
    public final void B(qxy qxyVar, qup qupVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxyVar);
        parcelGh.writeStrongBinder(qupVar);
        gk(1, parcelGh);
    }

    @Override // defpackage.qxv
    public final void e() throws RemoteException {
        gk(25, gh());
    }

    @Override // defpackage.qxv
    public final void f() throws RemoteException {
        gk(11, gh());
    }

    @Override // defpackage.qxv
    public final void g(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(15, parcelGh);
    }

    @Override // defpackage.qxv
    public final void h(InputFocusChangedEvent inputFocusChangedEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, inputFocusChangedEvent);
        gk(20, parcelGh);
    }

    @Override // defpackage.qxv
    public final void i(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gk(10, parcelGh);
    }

    @Override // defpackage.qxv
    public final void j(boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(z2 ? 1 : 0);
        gk(18, parcelGh);
    }

    @Override // defpackage.qxv
    public final void k(int i, KeyEvent keyEvent) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ijp.g(parcelGh, keyEvent);
        gk(8, parcelGh);
    }

    @Override // defpackage.qxv
    public final void l(int i, MotionEvent motionEvent) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ijp.g(parcelGh, motionEvent);
        gk(7, parcelGh);
    }

    @Override // defpackage.qxv
    public final void m(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        gk(3, parcelGh);
    }

    @Override // defpackage.qxv
    public final void n(Rect rect) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, rect);
        gk(28, parcelGh);
    }

    @Override // defpackage.qxv
    public final void o(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(16, parcelGh);
    }

    @Override // defpackage.qxv
    public final void p(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(5, parcelGh);
    }

    @Override // defpackage.qxv
    public final void q(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(4, parcelGh);
    }

    @Override // defpackage.qxv
    public final void r(int i, int i2, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        ijp.g(parcelGh, drawingSpec);
        ijp.g(parcelGh, intent);
        ijp.g(parcelGh, configuration);
        ijp.g(parcelGh, bundle);
        gk(26, parcelGh);
    }

    @Override // defpackage.qxv
    public final void s(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ijp.g(parcelGh, drawingSpec);
        ijp.g(parcelGh, intent);
        ijp.g(parcelGh, bundle);
        gk(2, parcelGh);
    }

    @Override // defpackage.qxv
    public final void t(int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ijp.g(parcelGh, drawingSpec);
        ijp.g(parcelGh, intent);
        ijp.g(parcelGh, configuration);
        ijp.g(parcelGh, bundle);
        gk(23, parcelGh);
    }

    @Override // defpackage.qxv
    public final void u(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(9, parcelGh);
    }

    @Override // defpackage.qxv
    public final void v() throws RemoteException {
        gk(12, gh());
    }

    @Override // defpackage.qxv
    public final void w(Rect rect) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, rect);
        gk(22, parcelGh);
    }

    @Override // defpackage.qxv
    public final void x(int i, int i2, DrawingSpec drawingSpec, Configuration configuration) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        ijp.g(parcelGh, drawingSpec);
        ijp.g(parcelGh, configuration);
        gk(6, parcelGh);
    }

    @Override // defpackage.qxv
    public final void y(CarWindowManagerLayoutParams carWindowManagerLayoutParams) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carWindowManagerLayoutParams);
        gk(21, parcelGh);
    }

    @Override // defpackage.qxv
    public final void z(DrawingSpec drawingSpec) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, drawingSpec);
        gk(17, parcelGh);
    }
}
