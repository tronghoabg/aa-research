package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;

/* loaded from: classes.dex */
public interface qyz extends IInterface {
    void e(boolean z) throws RemoteException;

    void f(ProjectionWindowAnimationParams projectionWindowAnimationParams) throws RemoteException;

    void g(KeyEventCompleteData keyEventCompleteData) throws RemoteException;

    void h(TouchEventCompleteData touchEventCompleteData) throws RemoteException;

    void i() throws RemoteException;

    void j() throws RemoteException;

    void k() throws RemoteException;

    void l(int i, boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) throws RemoteException;

    void m() throws RemoteException;

    void n(boolean z) throws RemoteException;

    void o(Bundle bundle) throws RemoteException;

    void p() throws RemoteException;

    void q(boolean z) throws RemoteException;

    void r(ProjectionWindowAnimationParams projectionWindowAnimationParams) throws RemoteException;

    void s(boolean z) throws RemoteException;

    void t(Rect rect) throws RemoteException;
}
