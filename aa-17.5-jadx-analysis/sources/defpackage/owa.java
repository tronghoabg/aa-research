package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class owa extends ijn implements owc {
    public owa(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IToastController");
    }

    @Override // defpackage.owc
    public final void e(CharSequence charSequence, int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.owc
    public final void f(CharSequence charSequence, int i, ComponentName componentName) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.e(parcelGh, charSequence);
        parcelGh.writeInt(i);
        ijp.g(parcelGh, componentName);
        gj(2, parcelGh);
    }
}
