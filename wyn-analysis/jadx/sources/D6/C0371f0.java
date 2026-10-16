package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0371f0 extends zzbel implements InterfaceC0373g0 {
    @Override // D6.InterfaceC0373g0
    public final void B(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(1, parcelZza);
    }

    @Override // D6.InterfaceC0373g0
    public final void zzc() throws RemoteException {
        zzda(2, zza());
    }

    @Override // D6.InterfaceC0373g0
    public final void zzd() throws RemoteException {
        zzda(3, zza());
    }

    @Override // D6.InterfaceC0373g0
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // D6.InterfaceC0373g0
    public final void zzf() throws RemoteException {
        zzda(5, zza());
    }
}
