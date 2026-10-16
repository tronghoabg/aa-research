package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;

/* loaded from: classes.dex */
public final class qxw extends ijn implements qxy {
    public qxw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjectionCallback");
    }

    @Override // defpackage.qxy
    public final void A() throws RemoteException {
        gj(17, gh());
    }

    @Override // defpackage.qxy
    public final void e(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(12, parcelGh);
    }

    @Override // defpackage.qxy
    public final void f() throws RemoteException {
        gj(31, gh());
    }

    @Override // defpackage.qxy
    public final void g() throws RemoteException {
        gj(10, gh());
    }

    @Override // defpackage.qxy
    public final void h(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(33, parcelGh);
    }

    @Override // defpackage.qxy
    public final void i() throws RemoteException {
        gj(15, gh());
    }

    @Override // defpackage.qxy
    public final void j(KeyEventCompleteData keyEventCompleteData) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, keyEventCompleteData);
        gj(34, parcelGh);
    }

    @Override // defpackage.qxy
    public final void k(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(9, parcelGh);
    }

    @Override // defpackage.qxy
    public final void l(TouchEventCompleteData touchEventCompleteData) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, touchEventCompleteData);
        gj(32, parcelGh);
    }

    @Override // defpackage.qxy
    public final void m() throws RemoteException {
        gj(2, gh());
    }

    @Override // defpackage.qxy
    public final void n() throws RemoteException {
        gj(7, gh());
    }

    @Override // defpackage.qxy
    public final void o() throws RemoteException {
        gj(5, gh());
    }

    @Override // defpackage.qxy
    public final void p(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(11);
        gj(23, parcelGh);
    }

    @Override // defpackage.qxy
    public final void q() throws RemoteException {
        gj(1, gh());
    }

    @Override // defpackage.qxy
    public final void r() throws RemoteException {
        gj(3, gh());
    }

    @Override // defpackage.qxy
    public final void s(Surface surface) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, surface);
        gj(30, parcelGh);
    }

    @Override // defpackage.qxy
    public final void t() throws RemoteException {
        gj(6, gh());
    }

    @Override // defpackage.qxy
    public final void u() throws RemoteException {
        gj(27, gh());
    }

    @Override // defpackage.qxy
    public final void v() throws RemoteException {
        gj(20, gh());
    }

    @Override // defpackage.qxy
    public final void w() throws RemoteException {
        gj(13, gh());
    }

    @Override // defpackage.qxy
    public final void x(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        gj(21, parcelGh);
    }

    @Override // defpackage.qxy
    public final void y(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(35, parcelGh);
    }

    @Override // defpackage.qxy
    public final void z(rml rmlVar, EditorInfo editorInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rmlVar);
        ijp.g(parcelGh, editorInfo);
        gj(16, parcelGh);
    }
}
