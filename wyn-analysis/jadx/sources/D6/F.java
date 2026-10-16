package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnw;

/* loaded from: classes3.dex */
public final class F extends zzbel implements H {
    public F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // D6.H
    public final E zze() throws RemoteException {
        E c10;
        Parcel parcelZzcZ = zzcZ(1, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c10 = iInterfaceQueryLocalInterface instanceof E ? (E) iInterfaceQueryLocalInterface : new C(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelZzcZ.recycle();
        return c10;
    }

    @Override // D6.H
    public final void zzf(InterfaceC0407y interfaceC0407y) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0407y);
        zzda(2, parcelZza);
    }

    @Override // D6.H
    public final void zzi(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbnpVar);
        zzben.zze(parcelZza, zzbnmVar);
        zzda(5, parcelZza);
    }

    @Override // D6.H
    public final void zzj(zzbma zzbmaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbmaVar);
        zzda(6, parcelZza);
    }

    @Override // D6.H
    public final void zzm(zzbnw zzbnwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbnwVar);
        zzda(10, parcelZza);
    }
}
