package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class C0 extends zzbem implements D0 {
    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        String string = parcel.readString();
        InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
        InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
        zzben.zzh(parcel);
        zze(string, interfaceC3876aR, interfaceC3876aR2);
        parcel2.writeNoException();
        return true;
    }
}
