package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;

/* renamed from: D6.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0375h0 extends zzbel implements InterfaceC0379j0 {
    @Override // D6.InterfaceC0379j0
    public final zzbvj getAdapterCreator() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbvj zzbvjVarZzf = zzbvi.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbvjVarZzf;
    }

    @Override // D6.InterfaceC0379j0
    public final d1 getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        d1 d1Var = (d1) zzben.zzb(parcelZzcZ, d1.CREATOR);
        parcelZzcZ.recycle();
        return d1Var;
    }
}
