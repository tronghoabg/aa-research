package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public final class P extends zzbel implements S {
    @Override // D6.S
    public final void x(o1 o1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, o1Var);
        zzda(2, parcelZza);
    }

    @Override // D6.S
    public final void z(o1 o1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, o1Var);
        zzda(1, parcelZza);
    }
}
