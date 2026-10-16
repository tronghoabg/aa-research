package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qzz extends ijn implements rab {
    public qzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ISystemUiService");
    }

    @Override // defpackage.rab
    public final void e() throws RemoteException {
        gj(4, gh());
    }

    @Override // defpackage.rab
    public final void f(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(2, parcelGh);
    }

    @Override // defpackage.rab
    public final void g(CharSequence charSequence, int i, ComponentName componentName) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.e(parcelGh, charSequence);
        parcelGh.writeInt(i);
        ijp.g(parcelGh, componentName);
        gj(6, parcelGh);
    }

    @Override // defpackage.rab
    public final void h(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        gj(1, parcelGh);
    }

    @Override // defpackage.rab
    public final boolean i() throws RemoteException {
        Parcel parcelGi = gi(5, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
