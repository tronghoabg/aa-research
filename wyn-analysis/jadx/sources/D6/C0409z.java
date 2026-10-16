package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0409z extends zzbel implements B {
    @Override // D6.B
    public final void zzb() throws RemoteException {
        zzda(1, zza());
    }

    @Override // D6.B
    public final void zzc(K0 k02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, k02);
        zzda(2, parcelZza);
    }
}
