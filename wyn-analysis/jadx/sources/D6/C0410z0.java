package D6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0410z0 extends zzbel implements A0 {
    public C0410z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // D6.A0
    public final void t(y1 y1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, y1Var);
        zzda(1, parcelZza);
    }

    @Override // D6.A0
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
