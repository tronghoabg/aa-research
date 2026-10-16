package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public abstract class A extends zzbem implements B {
    public A() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            zzb();
        } else {
            if (i5 != 2) {
                return false;
            }
            K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
            zzben.zzh(parcel);
            zzc(k02);
        }
        parcel2.writeNoException();
        return true;
    }
}
