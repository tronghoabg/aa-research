package D6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public final class M0 extends zzbel implements N0 {
    public M0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // D6.N0
    public final void n(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(5, parcelZza);
    }

    @Override // D6.N0
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // D6.N0
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // D6.N0
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // D6.N0
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }
}
