package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;

/* renamed from: D6.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0394r0 extends zzbel implements InterfaceC0396s0 {
    @Override // D6.InterfaceC0396s0
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // D6.InterfaceC0396s0
    public final String zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }
}
