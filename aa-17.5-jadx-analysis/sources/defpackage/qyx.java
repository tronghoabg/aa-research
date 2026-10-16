package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;

/* loaded from: classes.dex */
public final class qyx extends ijn implements qyz {
    public qyx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarWindow");
    }

    @Override // defpackage.qyz
    public final void e(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(10, parcelGh);
    }

    @Override // defpackage.qyz
    public final void f(ProjectionWindowAnimationParams projectionWindowAnimationParams) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, projectionWindowAnimationParams);
        gj(12, parcelGh);
    }

    @Override // defpackage.qyz
    public final void g(KeyEventCompleteData keyEventCompleteData) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, keyEventCompleteData);
        gj(13, parcelGh);
    }

    @Override // defpackage.qyz
    public final void h(TouchEventCompleteData touchEventCompleteData) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, touchEventCompleteData);
        gj(6, parcelGh);
    }

    @Override // defpackage.qyz
    public final void i() throws RemoteException {
        gj(5, gh());
    }

    @Override // defpackage.qyz
    public final void j() throws RemoteException {
        gj(1, gh());
    }

    @Override // defpackage.qyz
    public final void k() throws RemoteException {
        gj(4, gh());
    }

    @Override // defpackage.qyz
    public final void l(int i, boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(1);
        ijp.g(parcelGh, projectionWindowAnimationParams);
        gj(16, parcelGh);
    }

    @Override // defpackage.qyz
    public final void m() throws RemoteException {
        gj(8, gh());
    }

    @Override // defpackage.qyz
    public final void n(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(19, parcelGh);
    }

    @Override // defpackage.qyz
    public final void o(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(17, parcelGh);
    }

    @Override // defpackage.qyz
    public final void p() throws RemoteException {
        gj(18, gh());
    }

    @Override // defpackage.qyz
    public final void q(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(11, parcelGh);
    }

    @Override // defpackage.qyz
    public final void r(ProjectionWindowAnimationParams projectionWindowAnimationParams) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, projectionWindowAnimationParams);
        gj(14, parcelGh);
    }

    @Override // defpackage.qyz
    public final void s(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(15, parcelGh);
    }

    @Override // defpackage.qyz
    public final void t(Rect rect) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, rect);
        gj(9, parcelGh);
    }
}
