package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC0402v0 extends zzbem implements InterfaceC0404w0 {
    public AbstractBinderC0402v0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
        zzben.zzh(parcel);
        zze(k02);
        parcel2.writeNoException();
        return true;
    }
}
