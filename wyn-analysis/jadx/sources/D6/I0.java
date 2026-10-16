package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public final class I0 extends zzbel implements L0 {
    public I0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // D6.L0
    public final float zzj() {
        throw null;
    }

    @Override // D6.L0
    public final float zzk() {
        throw null;
    }

    @Override // D6.L0
    public final void zzl(N0 n02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, n02);
        zzda(8, parcelZza);
    }

    @Override // D6.L0
    public final float zzm() {
        throw null;
    }

    @Override // D6.L0
    public final N0 zzo() throws RemoteException {
        N0 m02;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            m02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            m02 = iInterfaceQueryLocalInterface instanceof N0 ? (N0) iInterfaceQueryLocalInterface : new M0(strongBinder);
        }
        parcelZzcZ.recycle();
        return m02;
    }
}
