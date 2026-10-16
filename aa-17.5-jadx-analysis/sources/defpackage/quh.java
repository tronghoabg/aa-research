package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.AudioFocusInfo;

/* loaded from: classes2.dex */
public final class quh extends ijn implements quj {
    public quh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAudioPolicyFocusListener");
    }

    @Override // defpackage.quj
    public final void e(AudioFocusInfo audioFocusInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, audioFocusInfo);
        gk(4, parcelGh);
    }

    @Override // defpackage.quj
    public final void f(AudioFocusInfo audioFocusInfo, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, audioFocusInfo);
        parcelGh.writeInt(i);
        gk(1, parcelGh);
    }

    @Override // defpackage.quj
    public final void g(AudioFocusInfo audioFocusInfo, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, audioFocusInfo);
        parcelGh.writeInt(z ? 1 : 0);
        gk(2, parcelGh);
    }

    @Override // defpackage.quj
    public final void h(AudioFocusInfo audioFocusInfo, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, audioFocusInfo);
        parcelGh.writeInt(i);
        gk(3, parcelGh);
    }
}
