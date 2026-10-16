package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
public interface qxv extends IInterface {
    void A() throws RemoteException;

    void B(qxy qxyVar, qup qupVar) throws RemoteException;

    void e() throws RemoteException;

    void f() throws RemoteException;

    void g(int i) throws RemoteException;

    void h(InputFocusChangedEvent inputFocusChangedEvent) throws RemoteException;

    void i(boolean z) throws RemoteException;

    void j(boolean z, boolean z2) throws RemoteException;

    void k(int i, KeyEvent keyEvent) throws RemoteException;

    void l(int i, MotionEvent motionEvent) throws RemoteException;

    void m(Intent intent) throws RemoteException;

    void n(Rect rect) throws RemoteException;

    void o(int i) throws RemoteException;

    void p(int i) throws RemoteException;

    void q(int i) throws RemoteException;

    void r(int i, int i2, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) throws RemoteException;

    void s(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle) throws RemoteException;

    void t(int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) throws RemoteException;

    void u(int i) throws RemoteException;

    void v() throws RemoteException;

    void w(Rect rect) throws RemoteException;

    void x(int i, int i2, DrawingSpec drawingSpec, Configuration configuration) throws RemoteException;

    void y(CarWindowManagerLayoutParams carWindowManagerLayoutParams) throws RemoteException;

    void z(DrawingSpec drawingSpec) throws RemoteException;
}
