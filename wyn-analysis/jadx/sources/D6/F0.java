package D6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class F0 extends zzbel implements H0 {
    public F0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // D6.H0
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // D6.H0
    public final String zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // D6.H0
    public final List zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(z1.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // D6.H0
    public final z1 zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        z1 z1Var = (z1) zzben.zzb(parcelZzcZ, z1.CREATOR);
        parcelZzcZ.recycle();
        return z1Var;
    }

    @Override // D6.H0
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // D6.H0
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }
}
