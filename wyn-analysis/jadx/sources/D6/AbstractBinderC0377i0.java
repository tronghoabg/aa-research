package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvj;

/* renamed from: D6.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC0377i0 extends zzbem implements InterfaceC0379j0 {
    public static InterfaceC0379j0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0379j0 ? (InterfaceC0379j0) iInterfaceQueryLocalInterface : new C0375h0(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            d1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzben.zzd(parcel2, liteSdkVersion);
        } else {
            if (i5 != 2) {
                return false;
            }
            zzbvj adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzben.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
