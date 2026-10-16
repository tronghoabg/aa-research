package D6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class B0 extends zzbel implements D0 {
    public B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // D6.D0
    public final void zze(String str, InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        zzda(1, parcelZza);
    }
}
