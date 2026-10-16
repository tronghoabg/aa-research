package G6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import q7.InterfaceC3876a;

/* renamed from: G6.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0561z extends zzbel implements A {
    @Override // G6.A
    public final boolean zze(InterfaceC3876a interfaceC3876a, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // G6.A
    public final void zzf(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(2, parcelZza);
    }

    @Override // G6.A
    public final boolean zzg(InterfaceC3876a interfaceC3876a, E6.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
