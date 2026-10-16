package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
public interface qzc extends IInterface {
    void e() throws RemoteException;

    void f(int i) throws RemoteException;

    void g(InputFocusChangedEvent inputFocusChangedEvent) throws RemoteException;

    void h(boolean z, boolean z2) throws RemoteException;

    void i(Rect rect) throws RemoteException;

    void j(KeyEvent keyEvent) throws RemoteException;

    void k(MotionEvent motionEvent) throws RemoteException;

    void l(Configuration configuration, int i) throws RemoteException;

    void m(DrawingSpec drawingSpec, Configuration configuration) throws RemoteException;

    void n(DrawingSpec drawingSpec) throws RemoteException;

    void o(CarWindowManagerLayoutParams carWindowManagerLayoutParams) throws RemoteException;

    void p() throws RemoteException;
}
