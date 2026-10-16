package D6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0403w extends zzbel implements InterfaceC0407y {
    public C0403w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // D6.InterfaceC0407y
    public final void zzb() throws RemoteException {
        zzda(1, zza());
    }

    @Override // D6.InterfaceC0407y
    public final void zzc(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(2, parcelZza);
    }

    @Override // D6.InterfaceC0407y
    public final void zzd(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(8, parcelZza);
    }

    @Override // D6.InterfaceC0407y
    public final void zze() throws RemoteException {
        zzda(3, zza());
    }

    @Override // D6.InterfaceC0407y
    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    @Override // D6.InterfaceC0407y
    public final void zzg() throws RemoteException {
        zzda(5, zza());
    }

    @Override // D6.InterfaceC0407y
    public final void zzh() throws RemoteException {
        zzda(6, zza());
    }

    @Override // D6.InterfaceC0407y
    public final void zzi() throws RemoteException {
        zzda(9, zza());
    }

    @Override // D6.InterfaceC0407y
    public final void zzj() throws RemoteException {
        zzda(7, zza());
    }
}
